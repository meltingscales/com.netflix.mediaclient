package androidx.media3.exoplayer.source;

import android.os.Handler;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.upstream.Allocator;
import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class ClippingMediaSource extends WrappingMediaSource {
    private final boolean allowDynamicClippingUpdates;
    private IllegalClippingException clippingError;
    private ClippingTimeline clippingTimeline;
    private long dynamicEndUs;
    private long dynamicStartUs;
    private final boolean enableInitialDiscontinuity;
    private final long endUs;
    private final ArrayList<ClippingMediaPeriod> mediaPeriods;
    private long periodEndUs;
    private long periodStartUs;
    private Handler playbackThreadHandler;
    private final boolean relativeToDefaultPosition;
    private final long startUs;
    private int transitionType;
    private final Timeline.Window window;

    public void setTransitionType(int i) {
        this.transitionType = i;
    }

    /* loaded from: classes2.dex */
    public static final class IllegalClippingException extends IOException {
        public final int reason;

        private static String getReasonDescription(int i) {
            return i != 0 ? i != 1 ? i != 2 ? "unknown" : "start exceeds end" : "not seekable to start" : "invalid period count";
        }

        public IllegalClippingException(int i) {
            super("Illegal clipping: " + getReasonDescription(i));
            this.reason = i;
        }
    }

    public ClippingMediaSource(MediaSource mediaSource, long j) {
        this(mediaSource, 0L, j, true, false, true);
    }

    public ClippingMediaSource(MediaSource mediaSource, long j, long j2, boolean z, boolean z2, boolean z3) {
        super((MediaSource) Assertions.checkNotNull(mediaSource));
        this.dynamicEndUs = -9223372036854775807L;
        this.dynamicStartUs = -9223372036854775807L;
        this.transitionType = 1;
        Assertions.checkArgument(j >= 0);
        this.startUs = j;
        this.endUs = j2;
        this.enableInitialDiscontinuity = z;
        this.allowDynamicClippingUpdates = z2;
        this.relativeToDefaultPosition = z3;
        this.mediaPeriods = new ArrayList<>();
        this.window = new Timeline.Window();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.media3.exoplayer.source.WrappingMediaSource
    public void prepareSourceInternal() {
        super.prepareSourceInternal();
        this.playbackThreadHandler = new Handler();
    }

    public void updateEndPositionUs(long j) {
        Assertions.checkArgument(j != -9223372036854775807L);
        updateClipping(-9223372036854775807L, j);
    }

    public void updateStartPositionUs(long j) {
        Assertions.checkArgument(j != -9223372036854775807L);
        updateClipping(j, -9223372036854775807L);
    }

    private void updateClipping(final long j, final long j2) {
        Assertions.checkState(this.allowDynamicClippingUpdates);
        Handler handler = this.playbackThreadHandler;
        if (handler != null) {
            handler.post(new Runnable() { // from class: androidx.media3.exoplayer.source.ClippingMediaSource$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    ClippingMediaSource.this.lambda$updateClipping$0(j2, j);
                }
            });
            return;
        }
        this.dynamicEndUs = j2;
        this.dynamicStartUs = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updateClipping$0(long j, long j2) {
        if (this.dynamicEndUs == j && this.dynamicStartUs == j2) {
            return;
        }
        this.dynamicEndUs = j;
        this.dynamicStartUs = j2;
        ClippingTimeline clippingTimeline = this.clippingTimeline;
        if (clippingTimeline == null || this.clippingError != null) {
            return;
        }
        refreshClippedTimeline(clippingTimeline.timeline);
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource, androidx.media3.exoplayer.source.MediaSource
    public void maybeThrowSourceInfoRefreshError() {
        IllegalClippingException illegalClippingException = this.clippingError;
        if (illegalClippingException != null) {
            throw illegalClippingException;
        }
        super.maybeThrowSourceInfoRefreshError();
    }

    @Override // androidx.media3.exoplayer.source.WrappingMediaSource, androidx.media3.exoplayer.source.MediaSource
    public MediaPeriod createPeriod(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j) {
        ClippingMediaPeriod clippingMediaPeriod = new ClippingMediaPeriod(this.mediaSource.createPeriod(mediaPeriodId, allocator, j), this.enableInitialDiscontinuity, this.periodStartUs, this.periodEndUs);
        this.mediaPeriods.add(clippingMediaPeriod);
        clippingMediaPeriod.setTransitionType(this.transitionType);
        return clippingMediaPeriod;
    }

    @Override // androidx.media3.exoplayer.source.WrappingMediaSource, androidx.media3.exoplayer.source.MediaSource
    public void releasePeriod(MediaPeriod mediaPeriod) {
        Assertions.checkState(this.mediaPeriods.remove(mediaPeriod));
        this.mediaSource.releasePeriod(((ClippingMediaPeriod) mediaPeriod).mediaPeriod);
        if (!this.mediaPeriods.isEmpty() || this.allowDynamicClippingUpdates) {
            return;
        }
        refreshClippedTimeline(((ClippingTimeline) Assertions.checkNotNull(this.clippingTimeline)).timeline);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.media3.exoplayer.source.CompositeMediaSource, androidx.media3.exoplayer.source.BaseMediaSource
    public void releaseSourceInternal() {
        super.releaseSourceInternal();
        this.clippingError = null;
        this.clippingTimeline = null;
    }

    @Override // androidx.media3.exoplayer.source.WrappingMediaSource
    protected void onChildSourceInfoRefreshed(Timeline timeline) {
        if (this.clippingError != null) {
            return;
        }
        refreshClippedTimeline(timeline);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0075, code lost:
        if (r7 < r13) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void refreshClippedTimeline(androidx.media3.common.Timeline r17) {
        /*
            Method dump skipped, instructions count: 209
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.source.ClippingMediaSource.refreshClippedTimeline(androidx.media3.common.Timeline):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class ClippingTimeline extends ForwardingTimeline {
        private final long durationUs;
        private final long endUs;
        private final boolean isDynamic;
        private final long startUs;

        public ClippingTimeline(Timeline timeline, long j, long j2) {
            super(timeline);
            boolean z = false;
            if (timeline.getPeriodCount() != 1) {
                throw new IllegalClippingException(0);
            }
            Timeline.Window window = timeline.getWindow(0, new Timeline.Window());
            long max = Math.max(0L, j);
            if (!window.isPlaceholder && max != 0 && !window.isSeekable) {
                throw new IllegalClippingException(1);
            }
            long max2 = j2 == Long.MIN_VALUE ? window.durationUs : Math.max(0L, j2);
            long j3 = window.durationUs;
            int i = (j3 > (-9223372036854775807L) ? 1 : (j3 == (-9223372036854775807L) ? 0 : -1));
            if (i != 0) {
                max2 = max2 > j3 ? j3 : max2;
                if (max > max2) {
                    throw new IllegalClippingException(2);
                }
            }
            this.startUs = max;
            this.endUs = max2;
            int i2 = (max2 > (-9223372036854775807L) ? 1 : (max2 == (-9223372036854775807L) ? 0 : -1));
            this.durationUs = i2 != 0 ? max2 - max : -9223372036854775807L;
            if (window.isDynamic && (i2 == 0 || (i != 0 && max2 == j3))) {
                z = true;
            }
            this.isDynamic = z;
        }

        @Override // androidx.media3.exoplayer.source.ForwardingTimeline, androidx.media3.common.Timeline
        public Timeline.Window getWindow(int i, Timeline.Window window, long j) {
            this.timeline.getWindow(0, window, 0L);
            long j2 = window.positionInFirstPeriodUs;
            long j3 = this.startUs;
            window.positionInFirstPeriodUs = j2 + j3;
            window.durationUs = this.durationUs;
            window.isDynamic = this.isDynamic;
            long j4 = window.defaultPositionUs;
            if (j4 != -9223372036854775807L) {
                long max = Math.max(j4, j3);
                window.defaultPositionUs = max;
                long j5 = this.endUs;
                if (j5 != -9223372036854775807L) {
                    max = Math.min(max, j5);
                }
                window.defaultPositionUs = max - this.startUs;
            }
            long usToMs = Util.usToMs(this.startUs);
            long j6 = window.presentationStartTimeMs;
            if (j6 != -9223372036854775807L) {
                window.presentationStartTimeMs = j6 + usToMs;
            }
            long j7 = window.windowStartTimeMs;
            if (j7 != -9223372036854775807L) {
                window.windowStartTimeMs = j7 + usToMs;
            }
            return window;
        }

        @Override // androidx.media3.exoplayer.source.ForwardingTimeline, androidx.media3.common.Timeline
        public Timeline.Period getPeriod(int i, Timeline.Period period, boolean z) {
            this.timeline.getPeriod(0, period, z);
            long positionInWindowUs = period.getPositionInWindowUs() - this.startUs;
            long j = this.durationUs;
            return period.set(period.id, period.uid, 0, j == -9223372036854775807L ? -9223372036854775807L : j - positionInWindowUs, positionInWindowUs);
        }
    }
}
