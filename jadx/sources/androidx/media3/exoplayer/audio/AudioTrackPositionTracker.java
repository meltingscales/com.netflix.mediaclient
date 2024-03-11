package androidx.media3.exoplayer.audio;

import android.media.AudioTrack;
import android.os.Build;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.Util;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public final class AudioTrackPositionTracker {
    private AudioTimestampPoller audioTimestampPoller;
    private AudioTrack audioTrack;
    private float audioTrackPlaybackSpeed;
    private int bufferSize;
    private long bufferSizeUs;
    private Clock clock;
    private long endPlaybackHeadPosition;
    private boolean expectRawPlaybackHeadReset;
    private long forceResetWorkaroundTimeMs;
    private long frameCountBeforeWrapAround;
    private Method getLatencyMethod;
    private boolean hasData;
    private boolean isOutputPcm;
    private long lastLatencySampleTimeUs;
    private long lastPlayheadSampleTimeUs;
    private long lastPositionUs;
    private long lastRawPlaybackHeadPositionSampleTimeMs;
    private boolean lastSampleUsedGetTimestampMode;
    private long lastSystemTimeUs;
    private long latencyUs;
    private final Listener listener;
    private boolean needPlaybackHeadPositionWorkaround;
    private boolean needsPassthroughWorkarounds;
    private int nextPlayheadOffsetIndex;
    private boolean notifiedPositionIncreasing;
    private int outputPcmFrameSize;
    private int outputSampleRate;
    private long passthroughWorkaroundPauseOffset;
    private int playheadOffsetCount;
    private final long[] playheadOffsets;
    private long previousModePositionUs;
    private long previousModeSystemTimeUs;
    private long rawPlaybackHeadPosition;
    private long rawPlaybackHeadWrapCount;
    private long smoothedPlayheadOffsetUs;
    private long stopPlaybackHeadPosition;
    private long stopTimestampUs;
    private long sumRawPlaybackHeadPosition;

    /* loaded from: classes2.dex */
    public interface Listener {
        void onInvalidLatency(long j);

        void onPositionAdvancing(long j);

        void onPositionFramesMismatch(long j, long j2, long j3, long j4);

        void onSystemTimeUsMismatch(long j, long j2, long j3, long j4);

        void onUnderrun(int i, long j);
    }

    private void resetSyncParams() {
        this.smoothedPlayheadOffsetUs = 0L;
        this.playheadOffsetCount = 0;
        this.nextPlayheadOffsetIndex = 0;
        this.lastPlayheadSampleTimeUs = 0L;
        this.lastSystemTimeUs = 0L;
        this.previousModeSystemTimeUs = 0L;
        this.notifiedPositionIncreasing = false;
    }

    public void expectRawPlaybackHeadReset() {
        this.expectRawPlaybackHeadReset = true;
    }

    public void setClock(Clock clock) {
        this.clock = clock;
    }

    public AudioTrackPositionTracker(Listener listener) {
        this.listener = (Listener) Assertions.checkNotNull(listener);
        if (Util.SDK_INT >= 18) {
            try {
                this.getLatencyMethod = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.playheadOffsets = new long[10];
        this.clock = Clock.DEFAULT;
    }

    public void setAudioTrack(AudioTrack audioTrack, boolean z, int i, int i2, int i3) {
        this.audioTrack = audioTrack;
        this.outputPcmFrameSize = i2;
        this.bufferSize = i3;
        this.audioTimestampPoller = new AudioTimestampPoller(audioTrack);
        this.outputSampleRate = audioTrack.getSampleRate();
        this.needsPassthroughWorkarounds = z && needsPassthroughWorkarounds(i);
        boolean isEncodingLinearPcm = Util.isEncodingLinearPcm(i);
        this.isOutputPcm = isEncodingLinearPcm;
        this.bufferSizeUs = isEncodingLinearPcm ? Util.sampleCountToDurationUs(i3 / i2, this.outputSampleRate) : -9223372036854775807L;
        this.rawPlaybackHeadPosition = 0L;
        this.rawPlaybackHeadWrapCount = 0L;
        this.expectRawPlaybackHeadReset = false;
        this.sumRawPlaybackHeadPosition = 0L;
        this.passthroughWorkaroundPauseOffset = 0L;
        this.hasData = false;
        this.stopTimestampUs = -9223372036854775807L;
        this.forceResetWorkaroundTimeMs = -9223372036854775807L;
        this.lastLatencySampleTimeUs = 0L;
        this.latencyUs = 0L;
        this.audioTrackPlaybackSpeed = 1.0f;
        this.needPlaybackHeadPositionWorkaround = needPlaybackHeadPositionWorkaround();
        this.frameCountBeforeWrapAround = 0L;
    }

    public void setAudioTrackPlaybackSpeed(float f) {
        this.audioTrackPlaybackSpeed = f;
        AudioTimestampPoller audioTimestampPoller = this.audioTimestampPoller;
        if (audioTimestampPoller != null) {
            audioTimestampPoller.reset();
        }
        resetSyncParams();
    }

    public long getCurrentPositionUs(boolean z) {
        long mediaDurationForPlayoutDuration;
        if (((AudioTrack) Assertions.checkNotNull(this.audioTrack)).getPlayState() == 3) {
            maybeSampleSyncParams();
        }
        long nanoTime = this.clock.nanoTime() / 1000;
        AudioTimestampPoller audioTimestampPoller = (AudioTimestampPoller) Assertions.checkNotNull(this.audioTimestampPoller);
        boolean hasAdvancingTimestamp = audioTimestampPoller.hasAdvancingTimestamp();
        if (hasAdvancingTimestamp) {
            mediaDurationForPlayoutDuration = Util.sampleCountToDurationUs(audioTimestampPoller.getTimestampPositionFrames(), this.outputSampleRate) + Util.getMediaDurationForPlayoutDuration(nanoTime - audioTimestampPoller.getTimestampSystemTimeUs(), this.audioTrackPlaybackSpeed);
        } else {
            if (this.playheadOffsetCount == 0) {
                mediaDurationForPlayoutDuration = getPlaybackHeadPositionUs();
            } else {
                mediaDurationForPlayoutDuration = Util.getMediaDurationForPlayoutDuration(this.smoothedPlayheadOffsetUs + nanoTime, this.audioTrackPlaybackSpeed);
            }
            if (!z) {
                mediaDurationForPlayoutDuration = Math.max(0L, mediaDurationForPlayoutDuration - this.latencyUs);
            }
        }
        if (this.lastSampleUsedGetTimestampMode != hasAdvancingTimestamp) {
            this.previousModeSystemTimeUs = this.lastSystemTimeUs;
            this.previousModePositionUs = this.lastPositionUs;
        }
        long j = nanoTime - this.previousModeSystemTimeUs;
        if (j < 1000000) {
            long j2 = this.previousModePositionUs;
            long mediaDurationForPlayoutDuration2 = Util.getMediaDurationForPlayoutDuration(j, this.audioTrackPlaybackSpeed);
            long j3 = (j * 1000) / 1000000;
            mediaDurationForPlayoutDuration = ((mediaDurationForPlayoutDuration * j3) + ((1000 - j3) * (j2 + mediaDurationForPlayoutDuration2))) / 1000;
        }
        if (!this.notifiedPositionIncreasing) {
            long j4 = this.lastPositionUs;
            if (mediaDurationForPlayoutDuration > j4) {
                this.notifiedPositionIncreasing = true;
                long playoutDurationForMediaDuration = Util.getPlayoutDurationForMediaDuration(Util.usToMs(mediaDurationForPlayoutDuration - j4), this.audioTrackPlaybackSpeed);
                this.listener.onPositionAdvancing(this.clock.currentTimeMillis() - Util.usToMs(playoutDurationForMediaDuration));
            }
        }
        this.lastSystemTimeUs = nanoTime;
        this.lastPositionUs = mediaDurationForPlayoutDuration;
        this.lastSampleUsedGetTimestampMode = hasAdvancingTimestamp;
        return mediaDurationForPlayoutDuration;
    }

    public void start() {
        if (this.stopTimestampUs != -9223372036854775807L) {
            this.stopTimestampUs = Util.msToUs(this.clock.elapsedRealtime());
        }
        ((AudioTimestampPoller) Assertions.checkNotNull(this.audioTimestampPoller)).reset();
    }

    public boolean isPlaying() {
        return ((AudioTrack) Assertions.checkNotNull(this.audioTrack)).getPlayState() == 3;
    }

    public boolean mayHandleBuffer(long j) {
        int playState = ((AudioTrack) Assertions.checkNotNull(this.audioTrack)).getPlayState();
        if (this.needsPassthroughWorkarounds) {
            if (playState == 2) {
                this.hasData = false;
                return false;
            } else if (playState == 1 && getPlaybackHeadPosition() == 0) {
                return false;
            }
        }
        boolean z = this.hasData;
        boolean hasPendingData = hasPendingData(j);
        this.hasData = hasPendingData;
        if (z && !hasPendingData && playState != 1) {
            this.listener.onUnderrun(this.bufferSize, Util.usToMs(this.bufferSizeUs));
        }
        return true;
    }

    public int getAvailableBufferSize(long j) {
        return this.bufferSize - ((int) (j - (getPlaybackHeadPosition() * this.outputPcmFrameSize)));
    }

    public boolean isStalled(long j) {
        return this.forceResetWorkaroundTimeMs != -9223372036854775807L && j > 0 && this.clock.elapsedRealtime() - this.forceResetWorkaroundTimeMs >= 200;
    }

    public void handleEndOfStream(long j) {
        this.stopPlaybackHeadPosition = getPlaybackHeadPosition();
        this.stopTimestampUs = Util.msToUs(this.clock.elapsedRealtime());
        this.endPlaybackHeadPosition = j;
    }

    public boolean hasPendingData(long j) {
        return j > Util.durationUsToSampleCount(getCurrentPositionUs(false), this.outputSampleRate) || forceHasPendingData();
    }

    public boolean pause() {
        resetSyncParams();
        if (this.stopTimestampUs == -9223372036854775807L) {
            ((AudioTimestampPoller) Assertions.checkNotNull(this.audioTimestampPoller)).reset();
            return true;
        }
        this.stopPlaybackHeadPosition = getPlaybackHeadPosition();
        return false;
    }

    public void reset() {
        resetSyncParams();
        this.audioTrack = null;
        this.audioTimestampPoller = null;
    }

    private void maybeSampleSyncParams() {
        long nanoTime = this.clock.nanoTime() / 1000;
        if (nanoTime - this.lastPlayheadSampleTimeUs >= 30000) {
            long playbackHeadPositionUs = getPlaybackHeadPositionUs();
            if (playbackHeadPositionUs != 0) {
                this.playheadOffsets[this.nextPlayheadOffsetIndex] = Util.getPlayoutDurationForMediaDuration(playbackHeadPositionUs, this.audioTrackPlaybackSpeed) - nanoTime;
                this.nextPlayheadOffsetIndex = (this.nextPlayheadOffsetIndex + 1) % 10;
                int i = this.playheadOffsetCount;
                if (i < 10) {
                    this.playheadOffsetCount = i + 1;
                }
                this.lastPlayheadSampleTimeUs = nanoTime;
                this.smoothedPlayheadOffsetUs = 0L;
                int i2 = 0;
                while (true) {
                    int i3 = this.playheadOffsetCount;
                    if (i2 >= i3) {
                        break;
                    }
                    this.smoothedPlayheadOffsetUs += this.playheadOffsets[i2] / i3;
                    i2++;
                }
            } else {
                return;
            }
        }
        if (this.needsPassthroughWorkarounds) {
            return;
        }
        maybePollAndCheckTimestamp(nanoTime);
        maybeUpdateLatency(nanoTime);
    }

    private void maybePollAndCheckTimestamp(long j) {
        AudioTimestampPoller audioTimestampPoller = (AudioTimestampPoller) Assertions.checkNotNull(this.audioTimestampPoller);
        if (audioTimestampPoller.maybePollTimestamp(j)) {
            long timestampSystemTimeUs = audioTimestampPoller.getTimestampSystemTimeUs();
            long timestampPositionFrames = audioTimestampPoller.getTimestampPositionFrames();
            long playbackHeadPositionUs = getPlaybackHeadPositionUs();
            if (Math.abs(timestampSystemTimeUs - j) > 5000000) {
                this.listener.onSystemTimeUsMismatch(timestampPositionFrames, timestampSystemTimeUs, j, playbackHeadPositionUs);
                audioTimestampPoller.rejectTimestamp();
            } else if (Math.abs(Util.sampleCountToDurationUs(timestampPositionFrames, this.outputSampleRate) - playbackHeadPositionUs) > 5000000) {
                this.listener.onPositionFramesMismatch(timestampPositionFrames, timestampSystemTimeUs, j, playbackHeadPositionUs);
                audioTimestampPoller.rejectTimestamp();
            } else {
                audioTimestampPoller.acceptTimestamp();
            }
        }
    }

    private void maybeUpdateLatency(long j) {
        Method method;
        if (!this.isOutputPcm || (method = this.getLatencyMethod) == null || j - this.lastLatencySampleTimeUs < 500000) {
            return;
        }
        try {
            long intValue = (((Integer) Util.castNonNull((Integer) method.invoke(Assertions.checkNotNull(this.audioTrack), new Object[0]))).intValue() * 1000) - this.bufferSizeUs;
            this.latencyUs = intValue;
            long max = Math.max(intValue, 0L);
            this.latencyUs = max;
            if (max > 5000000) {
                this.listener.onInvalidLatency(max);
                this.latencyUs = 0L;
            }
        } catch (Exception unused) {
            this.getLatencyMethod = null;
        }
        this.lastLatencySampleTimeUs = j;
    }

    private boolean forceHasPendingData() {
        return this.needsPassthroughWorkarounds && ((AudioTrack) Assertions.checkNotNull(this.audioTrack)).getPlayState() == 2 && getPlaybackHeadPosition() == 0;
    }

    private static boolean needsPassthroughWorkarounds(int i) {
        return Util.SDK_INT < 23 && (i == 5 || i == 6);
    }

    private long getPlaybackHeadPositionUs() {
        return Util.sampleCountToDurationUs(getPlaybackHeadPosition(), this.outputSampleRate);
    }

    public long getPlaybackHeadPosition() {
        long elapsedRealtime = this.clock.elapsedRealtime();
        if (this.stopTimestampUs == -9223372036854775807L) {
            if (elapsedRealtime - this.lastRawPlaybackHeadPositionSampleTimeMs >= 5) {
                updateRawPlaybackHeadPosition(elapsedRealtime);
                this.lastRawPlaybackHeadPositionSampleTimeMs = elapsedRealtime;
            }
            return this.rawPlaybackHeadPosition + this.sumRawPlaybackHeadPosition + (this.rawPlaybackHeadWrapCount << 32);
        } else if (((AudioTrack) Assertions.checkNotNull(this.audioTrack)).getPlayState() == 2) {
            return this.stopPlaybackHeadPosition;
        } else {
            return Math.min(this.endPlaybackHeadPosition, this.stopPlaybackHeadPosition + Util.durationUsToSampleCount(Util.getMediaDurationForPlayoutDuration(Util.msToUs(elapsedRealtime) - this.stopTimestampUs, this.audioTrackPlaybackSpeed), this.outputSampleRate));
        }
    }

    private void updateRawPlaybackHeadPosition(long j) {
        AudioTrack audioTrack = (AudioTrack) Assertions.checkNotNull(this.audioTrack);
        int playState = audioTrack.getPlayState();
        if (playState == 1) {
            return;
        }
        long playbackHeadPosition = audioTrack.getPlaybackHeadPosition();
        long j2 = playbackHeadPosition < 0 ? 0L : playbackHeadPosition & 4294967295L;
        if (this.needsPassthroughWorkarounds) {
            if (playState == 2 && j2 == 0) {
                this.passthroughWorkaroundPauseOffset = this.rawPlaybackHeadPosition;
            }
            j2 += this.passthroughWorkaroundPauseOffset;
        }
        if (Util.SDK_INT <= 29) {
            if (j2 == 0 && this.rawPlaybackHeadPosition > 0 && playState == 3) {
                if (this.forceResetWorkaroundTimeMs == -9223372036854775807L) {
                    this.forceResetWorkaroundTimeMs = j;
                    return;
                }
                return;
            }
            this.forceResetWorkaroundTimeMs = -9223372036854775807L;
        }
        long j3 = this.rawPlaybackHeadPosition;
        if (j3 > j2) {
            if (this.expectRawPlaybackHeadReset) {
                this.sumRawPlaybackHeadPosition += j3;
                this.expectRawPlaybackHeadReset = false;
            } else {
                this.rawPlaybackHeadWrapCount++;
            }
        }
        this.rawPlaybackHeadPosition = j2;
    }

    static boolean needPlaybackHeadPositionWorkaround() {
        return Build.MODEL.equalsIgnoreCase("SM-J320M");
    }
}
