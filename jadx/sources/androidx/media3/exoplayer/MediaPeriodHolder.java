package androidx.media3.exoplayer;

import androidx.media3.common.Timeline;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.exoplayer.LoadingInfo;
import androidx.media3.exoplayer.source.ClippingMediaPeriod;
import androidx.media3.exoplayer.source.EmptySampleStream;
import androidx.media3.exoplayer.source.MediaPeriod;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.SampleStream;
import androidx.media3.exoplayer.source.TrackGroupArray;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import androidx.media3.exoplayer.trackselection.TrackSelector;
import androidx.media3.exoplayer.trackselection.TrackSelectorResult;
import androidx.media3.exoplayer.upstream.Allocator;

/* loaded from: classes2.dex */
final class MediaPeriodHolder {
    public boolean allRenderersInCorrectState;
    public boolean hasEnabledTracks;
    public MediaPeriodInfo info;
    private final boolean[] mayRetainStreamFlags;
    public final MediaPeriod mediaPeriod;
    private final MediaSourceList mediaSourceList;
    private MediaPeriodHolder next;
    public boolean prepared;
    private final RendererCapabilities[] rendererCapabilities;
    private long rendererPositionOffsetUs;
    public final SampleStream[] sampleStreams;
    private TrackGroupArray trackGroups;
    private final TrackSelector trackSelector;
    private TrackSelectorResult trackSelectorResult;
    public final Object uid;

    private boolean isLoadingMediaPeriod() {
        return this.next == null;
    }

    public MediaPeriodHolder getNext() {
        return this.next;
    }

    public long getRendererOffset() {
        return this.rendererPositionOffsetUs;
    }

    public TrackGroupArray getTrackGroups() {
        return this.trackGroups;
    }

    public TrackSelectorResult getTrackSelectorResult() {
        return this.trackSelectorResult;
    }

    public void setRendererOffset(long j) {
        this.rendererPositionOffsetUs = j;
    }

    public MediaPeriodHolder(RendererCapabilities[] rendererCapabilitiesArr, long j, TrackSelector trackSelector, Allocator allocator, MediaSourceList mediaSourceList, MediaPeriodInfo mediaPeriodInfo, TrackSelectorResult trackSelectorResult) {
        this.rendererCapabilities = rendererCapabilitiesArr;
        this.rendererPositionOffsetUs = j;
        this.trackSelector = trackSelector;
        this.mediaSourceList = mediaSourceList;
        MediaSource.MediaPeriodId mediaPeriodId = mediaPeriodInfo.id;
        this.uid = mediaPeriodId.periodUid;
        this.info = mediaPeriodInfo;
        this.trackGroups = TrackGroupArray.EMPTY;
        this.trackSelectorResult = trackSelectorResult;
        this.sampleStreams = new SampleStream[rendererCapabilitiesArr.length];
        this.mayRetainStreamFlags = new boolean[rendererCapabilitiesArr.length];
        this.mediaPeriod = createMediaPeriod(mediaPeriodId, mediaSourceList, allocator, mediaPeriodInfo.startPositionUs, mediaPeriodInfo.endPositionUs);
    }

    public long toRendererTime(long j) {
        return j + getRendererOffset();
    }

    public long toPeriodTime(long j) {
        return j - getRendererOffset();
    }

    public long getStartPositionRendererTime() {
        return this.info.startPositionUs + this.rendererPositionOffsetUs;
    }

    public boolean isFullyBuffered() {
        return this.prepared && (!this.hasEnabledTracks || this.mediaPeriod.getBufferedPositionUs() == Long.MIN_VALUE);
    }

    public long getBufferedPositionUs() {
        if (!this.prepared) {
            return this.info.startPositionUs;
        }
        long bufferedPositionUs = this.hasEnabledTracks ? this.mediaPeriod.getBufferedPositionUs() : Long.MIN_VALUE;
        return bufferedPositionUs == Long.MIN_VALUE ? this.info.durationUs : bufferedPositionUs;
    }

    public long getNextLoadPositionUs() {
        if (this.prepared) {
            return this.mediaPeriod.getNextLoadPositionUs();
        }
        return 0L;
    }

    public void handlePrepared(float f, Timeline timeline) {
        this.prepared = true;
        this.trackGroups = this.mediaPeriod.getTrackGroups();
        TrackSelectorResult selectTracks = selectTracks(f, timeline);
        MediaPeriodInfo mediaPeriodInfo = this.info;
        long j = mediaPeriodInfo.startPositionUs;
        long j2 = mediaPeriodInfo.durationUs;
        if (j2 != -9223372036854775807L && j >= j2) {
            j = Math.max(0L, j2 - 1);
        }
        long applyTrackSelection = applyTrackSelection(selectTracks, j, false);
        long j3 = this.rendererPositionOffsetUs;
        MediaPeriodInfo mediaPeriodInfo2 = this.info;
        this.rendererPositionOffsetUs = j3 + (mediaPeriodInfo2.startPositionUs - applyTrackSelection);
        this.info = mediaPeriodInfo2.copyWithStartPositionUs(applyTrackSelection);
    }

    public void reevaluateBuffer(long j) {
        Assertions.checkState(isLoadingMediaPeriod());
        if (this.prepared) {
            this.mediaPeriod.reevaluateBuffer(toPeriodTime(j));
        }
    }

    public void continueLoading(long j, float f, long j2) {
        Assertions.checkState(isLoadingMediaPeriod());
        this.mediaPeriod.continueLoading(new LoadingInfo.Builder().setPlaybackPositionUs(toPeriodTime(j)).setPlaybackSpeed(f).setLastRebufferRealtimeMs(j2).build());
    }

    public TrackSelectorResult selectTracks(float f, Timeline timeline) {
        ExoTrackSelection[] exoTrackSelectionArr;
        TrackSelectorResult selectTracks = this.trackSelector.selectTracks(this.rendererCapabilities, getTrackGroups(), this.info.id, timeline);
        for (ExoTrackSelection exoTrackSelection : selectTracks.selections) {
            if (exoTrackSelection != null) {
                exoTrackSelection.onPlaybackSpeed(f);
            }
        }
        return selectTracks;
    }

    public long applyTrackSelection(TrackSelectorResult trackSelectorResult, long j, boolean z) {
        return applyTrackSelection(trackSelectorResult, j, z, new boolean[this.rendererCapabilities.length]);
    }

    public long applyTrackSelection(TrackSelectorResult trackSelectorResult, long j, boolean z, boolean[] zArr) {
        int i = 0;
        while (true) {
            boolean z2 = true;
            if (i >= trackSelectorResult.length) {
                break;
            }
            boolean[] zArr2 = this.mayRetainStreamFlags;
            if (z || !trackSelectorResult.isEquivalent(this.trackSelectorResult, i)) {
                z2 = false;
            }
            zArr2[i] = z2;
            i++;
        }
        disassociateNoSampleRenderersWithEmptySampleStream(this.sampleStreams);
        disableTrackSelectionsInResult();
        this.trackSelectorResult = trackSelectorResult;
        enableTrackSelectionsInResult();
        long selectTracks = this.mediaPeriod.selectTracks(trackSelectorResult.selections, this.mayRetainStreamFlags, this.sampleStreams, zArr, j);
        associateNoSampleRenderersWithEmptySampleStream(this.sampleStreams);
        this.hasEnabledTracks = false;
        int i2 = 0;
        while (true) {
            SampleStream[] sampleStreamArr = this.sampleStreams;
            if (i2 >= sampleStreamArr.length) {
                return selectTracks;
            }
            if (sampleStreamArr[i2] != null) {
                Assertions.checkState(trackSelectorResult.isRendererEnabled(i2));
                if (this.rendererCapabilities[i2].getTrackType() != -2) {
                    this.hasEnabledTracks = true;
                }
            } else {
                Assertions.checkState(trackSelectorResult.selections[i2] == null);
            }
            i2++;
        }
    }

    public void release() {
        disableTrackSelectionsInResult();
        releaseMediaPeriod(this.mediaSourceList, this.mediaPeriod);
    }

    public void setNext(MediaPeriodHolder mediaPeriodHolder) {
        if (mediaPeriodHolder == this.next) {
            return;
        }
        disableTrackSelectionsInResult();
        this.next = mediaPeriodHolder;
        enableTrackSelectionsInResult();
    }

    public void updateClipping() {
        MediaPeriod mediaPeriod = this.mediaPeriod;
        if (mediaPeriod instanceof ClippingMediaPeriod) {
            long j = this.info.endPositionUs;
            if (j == -9223372036854775807L) {
                j = Long.MIN_VALUE;
            }
            ((ClippingMediaPeriod) mediaPeriod).updateClipping(0L, j);
        }
    }

    private void enableTrackSelectionsInResult() {
        if (!isLoadingMediaPeriod()) {
            return;
        }
        int i = 0;
        while (true) {
            TrackSelectorResult trackSelectorResult = this.trackSelectorResult;
            if (i >= trackSelectorResult.length) {
                return;
            }
            boolean isRendererEnabled = trackSelectorResult.isRendererEnabled(i);
            ExoTrackSelection exoTrackSelection = this.trackSelectorResult.selections[i];
            if (isRendererEnabled && exoTrackSelection != null) {
                exoTrackSelection.enable();
            }
            i++;
        }
    }

    private void disableTrackSelectionsInResult() {
        if (!isLoadingMediaPeriod()) {
            return;
        }
        int i = 0;
        while (true) {
            TrackSelectorResult trackSelectorResult = this.trackSelectorResult;
            if (i >= trackSelectorResult.length) {
                return;
            }
            boolean isRendererEnabled = trackSelectorResult.isRendererEnabled(i);
            ExoTrackSelection exoTrackSelection = this.trackSelectorResult.selections[i];
            if (isRendererEnabled && exoTrackSelection != null) {
                exoTrackSelection.disable();
            }
            i++;
        }
    }

    private void disassociateNoSampleRenderersWithEmptySampleStream(SampleStream[] sampleStreamArr) {
        int i = 0;
        while (true) {
            RendererCapabilities[] rendererCapabilitiesArr = this.rendererCapabilities;
            if (i >= rendererCapabilitiesArr.length) {
                return;
            }
            if (rendererCapabilitiesArr[i].getTrackType() == -2) {
                sampleStreamArr[i] = null;
            }
            i++;
        }
    }

    private void associateNoSampleRenderersWithEmptySampleStream(SampleStream[] sampleStreamArr) {
        int i = 0;
        while (true) {
            RendererCapabilities[] rendererCapabilitiesArr = this.rendererCapabilities;
            if (i >= rendererCapabilitiesArr.length) {
                return;
            }
            if (rendererCapabilitiesArr[i].getTrackType() == -2 && this.trackSelectorResult.isRendererEnabled(i)) {
                sampleStreamArr[i] = new EmptySampleStream();
            }
            i++;
        }
    }

    private static MediaPeriod createMediaPeriod(MediaSource.MediaPeriodId mediaPeriodId, MediaSourceList mediaSourceList, Allocator allocator, long j, long j2) {
        MediaPeriod createPeriod = mediaSourceList.createPeriod(mediaPeriodId, allocator, j);
        return j2 != -9223372036854775807L ? new ClippingMediaPeriod(createPeriod, true, 0L, j2) : createPeriod;
    }

    private static void releaseMediaPeriod(MediaSourceList mediaSourceList, MediaPeriod mediaPeriod) {
        try {
            if (mediaPeriod instanceof ClippingMediaPeriod) {
                mediaSourceList.releasePeriod(((ClippingMediaPeriod) mediaPeriod).mediaPeriod);
            } else {
                mediaSourceList.releasePeriod(mediaPeriod);
            }
        } catch (RuntimeException e) {
            Log.e("MediaPeriodHolder", "Period release failed.", e);
        }
    }
}