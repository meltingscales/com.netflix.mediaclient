package androidx.media3.exoplayer.audio;

import android.annotation.TargetApi;
import android.media.AudioTimestamp;
import android.media.AudioTrack;
import androidx.media3.common.util.Util;

/* loaded from: classes2.dex */
final class AudioTimestampPoller {
    private final AudioTimestampV19 audioTimestamp;
    private long initialTimestampPositionFrames;
    private long initializeSystemTimeUs;
    private long lastTimestampSampleTimeUs;
    private long sampleIntervalUs;
    private int state;

    public boolean hasAdvancingTimestamp() {
        return this.state == 2;
    }

    public AudioTimestampPoller(AudioTrack audioTrack) {
        if (Util.SDK_INT >= 19) {
            this.audioTimestamp = new AudioTimestampV19(audioTrack);
            reset();
            return;
        }
        this.audioTimestamp = null;
        updateState(3);
    }

    @TargetApi(19)
    public boolean maybePollTimestamp(long j) {
        AudioTimestampV19 audioTimestampV19 = this.audioTimestamp;
        if (audioTimestampV19 != null && j - this.lastTimestampSampleTimeUs >= this.sampleIntervalUs) {
            this.lastTimestampSampleTimeUs = j;
            boolean maybeUpdateTimestamp = audioTimestampV19.maybeUpdateTimestamp();
            int i = this.state;
            if (i != 0) {
                if (i == 1) {
                    if (maybeUpdateTimestamp) {
                        if (this.audioTimestamp.getTimestampPositionFrames() > this.initialTimestampPositionFrames) {
                            updateState(2);
                            return maybeUpdateTimestamp;
                        }
                        return maybeUpdateTimestamp;
                    }
                    reset();
                    return maybeUpdateTimestamp;
                } else if (i == 2) {
                    if (maybeUpdateTimestamp) {
                        return maybeUpdateTimestamp;
                    }
                    reset();
                    return maybeUpdateTimestamp;
                } else if (i != 3) {
                    if (i == 4) {
                        return maybeUpdateTimestamp;
                    }
                    throw new IllegalStateException();
                } else if (maybeUpdateTimestamp) {
                    reset();
                    return maybeUpdateTimestamp;
                } else {
                    return maybeUpdateTimestamp;
                }
            } else if (!maybeUpdateTimestamp) {
                if (j - this.initializeSystemTimeUs > 500000) {
                    updateState(3);
                    return maybeUpdateTimestamp;
                }
                return maybeUpdateTimestamp;
            } else if (this.audioTimestamp.getTimestampSystemTimeUs() >= this.initializeSystemTimeUs) {
                this.initialTimestampPositionFrames = this.audioTimestamp.getTimestampPositionFrames();
                updateState(1);
                return maybeUpdateTimestamp;
            }
        }
        return false;
    }

    public void rejectTimestamp() {
        updateState(4);
    }

    public void acceptTimestamp() {
        if (this.state == 4) {
            reset();
        }
    }

    public void reset() {
        if (this.audioTimestamp != null) {
            updateState(0);
        }
    }

    @TargetApi(19)
    public long getTimestampSystemTimeUs() {
        AudioTimestampV19 audioTimestampV19 = this.audioTimestamp;
        if (audioTimestampV19 != null) {
            return audioTimestampV19.getTimestampSystemTimeUs();
        }
        return -9223372036854775807L;
    }

    @TargetApi(19)
    public long getTimestampPositionFrames() {
        AudioTimestampV19 audioTimestampV19 = this.audioTimestamp;
        if (audioTimestampV19 != null) {
            return audioTimestampV19.getTimestampPositionFrames();
        }
        return -1L;
    }

    private void updateState(int i) {
        this.state = i;
        long j = 10000;
        if (i == 0) {
            this.lastTimestampSampleTimeUs = 0L;
            this.initialTimestampPositionFrames = -1L;
            this.initializeSystemTimeUs = System.nanoTime() / 1000;
            this.sampleIntervalUs = 10000L;
            return;
        }
        if (i != 1) {
            if (i != 2 && i != 3) {
                if (i != 4) {
                    throw new IllegalStateException();
                }
                this.sampleIntervalUs = 500000L;
                return;
            }
            j = 10000000;
        }
        this.sampleIntervalUs = j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class AudioTimestampV19 {
        private final AudioTimestamp audioTimestamp = new AudioTimestamp();
        private final AudioTrack audioTrack;
        private long lastTimestampPositionFrames;
        private long lastTimestampRawPositionFrames;
        private long rawTimestampFramePositionWrapCount;

        public long getTimestampPositionFrames() {
            return this.lastTimestampPositionFrames;
        }

        public AudioTimestampV19(AudioTrack audioTrack) {
            this.audioTrack = audioTrack;
        }

        public boolean maybeUpdateTimestamp() {
            boolean timestamp = this.audioTrack.getTimestamp(this.audioTimestamp);
            if (timestamp) {
                long j = this.audioTimestamp.framePosition;
                if (this.lastTimestampRawPositionFrames > j) {
                    this.rawTimestampFramePositionWrapCount++;
                }
                this.lastTimestampRawPositionFrames = j;
                this.lastTimestampPositionFrames = j + (this.rawTimestampFramePositionWrapCount << 32);
            }
            return timestamp;
        }

        public long getTimestampSystemTimeUs() {
            return this.audioTimestamp.nanoTime / 1000;
        }
    }
}
