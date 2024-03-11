package androidx.media3.exoplayer.source;

import android.net.Uri;
import android.os.Handler;
import androidx.media3.common.DataReader;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.ConditionVariable;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.DataSourceUtil;
import androidx.media3.datasource.DataSpec;
import androidx.media3.datasource.StatsDataSource;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.FormatHolder;
import androidx.media3.exoplayer.LoadingInfo;
import androidx.media3.exoplayer.SeekParameters;
import androidx.media3.exoplayer.drm.DrmSessionEventListener;
import androidx.media3.exoplayer.drm.DrmSessionManager;
import androidx.media3.exoplayer.source.IcyDataSource;
import androidx.media3.exoplayer.source.MediaPeriod;
import androidx.media3.exoplayer.source.MediaSourceEventListener;
import androidx.media3.exoplayer.source.SampleQueue;
import androidx.media3.exoplayer.upstream.Allocator;
import androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy;
import androidx.media3.exoplayer.upstream.Loader;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.ForwardingSeekMap;
import androidx.media3.extractor.PositionHolder;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.metadata.icy.IcyHeaders;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import o.C9585sR;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class ProgressiveMediaPeriod implements MediaPeriod, ExtractorOutput, Loader.Callback<ExtractingLoadable>, Loader.ReleaseCallback, SampleQueue.UpstreamFormatChangedListener {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final Format ICY_FORMAT;
    private static final Map<String, String> ICY_METADATA_HEADERS;
    private static int a$s75$6744 = 0;
    private static int b = 1;
    private static char b$s76$6744;
    private static int d;
    private static long d$s74$6744;
    private final Allocator allocator;
    private MediaPeriod.Callback callback;
    private final long continueLoadingCheckIntervalBytes;
    private final String customCacheKey;
    private final DataSource dataSource;
    private int dataType;
    private final DrmSessionEventListener.EventDispatcher drmEventDispatcher;
    private final DrmSessionManager drmSessionManager;
    private long durationUs;
    private int enabledTrackCount;
    private int extractedSamplesCountAtStartOfLoad;
    private final Handler handler;
    private boolean haveAudioVideoTracks;
    private IcyHeaders icyHeaders;
    private boolean isLengthKnown;
    private boolean isLive;
    private final boolean isSingleSample;
    private long lastSeekPositionUs;
    private final Listener listener;
    private final ConditionVariable loadCondition;
    private final LoadErrorHandlingPolicy loadErrorHandlingPolicy;
    private final Loader loader = new Loader("ProgressiveMediaPeriod");
    private boolean loadingFinished;
    private final Runnable maybeFinishPrepareRunnable;
    private final MediaSourceEventListener.EventDispatcher mediaSourceEventDispatcher;
    private boolean notifyDiscontinuity;
    private final Runnable onContinueLoadingRequestedRunnable;
    private boolean pendingDeferredRetry;
    private long pendingResetPositionUs;
    private boolean prepared;
    private final ProgressiveMediaExtractor progressiveMediaExtractor;
    private boolean released;
    private TrackId[] sampleQueueTrackIds;
    private SampleQueue[] sampleQueues;
    private boolean sampleQueuesBuilt;
    private SeekMap seekMap;
    private boolean seenFirstTrackSelection;
    private TrackState trackState;
    private final Uri uri;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public interface Listener {
        void onSourceInfoRefreshed(long j, boolean z, boolean z2);
    }

    public static /* synthetic */ void $r8$lambda$UME9wo0vnnZOdagWwSK8ILcEMgY(ProgressiveMediaPeriod progressiveMediaPeriod, SeekMap seekMap) {
        int i = 2 % 2;
        int i2 = b + 47;
        d = i2 % 128;
        if (i2 % 2 != 0) {
            progressiveMediaPeriod.lambda$seekMap$1(seekMap);
            int i3 = 50 / 0;
        } else {
            progressiveMediaPeriod.lambda$seekMap$1(seekMap);
        }
        int i4 = d + 19;
        b = i4 % 128;
        int i5 = i4 % 2;
    }

    /* renamed from: $r8$lambda$YLOJRxyfXfojUItl-qJNlGyZVaA  reason: not valid java name */
    public static /* synthetic */ void m2704$r8$lambda$YLOJRxyfXfojUItlqJNlGyZVaA(ProgressiveMediaPeriod progressiveMediaPeriod) {
        int i = 2 % 2;
        int i2 = b + 71;
        d = i2 % 128;
        if (i2 % 2 == 0) {
            progressiveMediaPeriod.lambda$onLengthKnown$2();
            return;
        }
        progressiveMediaPeriod.lambda$onLengthKnown$2();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void $r8$lambda$f6avGSTSR4EHkiT5C2BLoacEBBo(ProgressiveMediaPeriod progressiveMediaPeriod) {
        int i = 2 % 2;
        int i2 = b + 103;
        d = i2 % 128;
        int i3 = i2 % 2;
        progressiveMediaPeriod.lambda$new$0();
        if (i3 != 0) {
            int i4 = 15 / 0;
        }
    }

    public static /* synthetic */ void $r8$lambda$fRLJj_pvmhUWdElszeJahaiDmb0(ProgressiveMediaPeriod progressiveMediaPeriod) {
        int i = 2 % 2;
        int i2 = b + 61;
        d = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        progressiveMediaPeriod.maybeFinishPrepare();
        if (i3 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = b + 17;
        d = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ Map access$1400() {
        int i = 2 % 2;
        int i2 = d + 53;
        b = i2 % 128;
        if (i2 % 2 != 0) {
            return ICY_METADATA_HEADERS;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ Format access$900() {
        int i = 2 % 2;
        int i2 = b + 67;
        int i3 = i2 % 128;
        d = i3;
        int i4 = i2 % 2;
        Format format = ICY_FORMAT;
        int i5 = i3 + 79;
        b = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 28 / 0;
        }
        return format;
    }

    static void b() {
        d$s74$6744 = -8365212660549097629L;
        a$s75$6744 = 1998870156;
        b$s76$6744 = (char) 22156;
    }

    private boolean isPendingReset() {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 + 9;
        b = i3 % 128;
        int i4 = i3 % 2;
        if (this.pendingResetPositionUs != -9223372036854775807L) {
            int i5 = i2 + 53;
            b = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        return false;
    }

    private /* synthetic */ void lambda$onLengthKnown$2() {
        int i = 2 % 2;
        int i2 = d + 109;
        int i3 = i2 % 128;
        b = i3;
        int i4 = i2 % 2;
        this.isLengthKnown = true;
        int i5 = i3 + 81;
        d = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
    public void reevaluateBuffer(long j) {
        int i = 2 % 2;
        int i2 = d + 57;
        b = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 11 / 0;
        }
    }

    static /* synthetic */ long access$1000(ProgressiveMediaPeriod progressiveMediaPeriod) {
        int i = 2 % 2;
        int i2 = d + 19;
        b = i2 % 128;
        if (i2 % 2 == 0) {
            long j = progressiveMediaPeriod.continueLoadingCheckIntervalBytes;
            int i3 = 14 / 0;
            return j;
        }
        return progressiveMediaPeriod.continueLoadingCheckIntervalBytes;
    }

    static /* synthetic */ Runnable access$1100(ProgressiveMediaPeriod progressiveMediaPeriod) {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 + 61;
        b = i3 % 128;
        int i4 = i3 % 2;
        Runnable runnable = progressiveMediaPeriod.onContinueLoadingRequestedRunnable;
        int i5 = i2 + 121;
        b = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 45 / 0;
        }
        return runnable;
    }

    static /* synthetic */ Handler access$1200(ProgressiveMediaPeriod progressiveMediaPeriod) {
        int i = 2 % 2;
        int i2 = d + 9;
        b = i2 % 128;
        int i3 = i2 % 2;
        Handler handler = progressiveMediaPeriod.handler;
        if (i3 != 0) {
            return handler;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ long access$1300(ProgressiveMediaPeriod progressiveMediaPeriod, boolean z) {
        int i = 2 % 2;
        int i2 = b + 5;
        d = i2 % 128;
        if (i2 % 2 == 0) {
            return progressiveMediaPeriod.getLargestQueuedTimestampUs(z);
        }
        progressiveMediaPeriod.getLargestQueuedTimestampUs(z);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ String access$1500(ProgressiveMediaPeriod progressiveMediaPeriod) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 59;
        d = i3 % 128;
        int i4 = i3 % 2;
        String str = progressiveMediaPeriod.customCacheKey;
        int i5 = i2 + 117;
        d = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    static /* synthetic */ long access$500(ProgressiveMediaPeriod progressiveMediaPeriod) {
        int i = 2 % 2;
        int i2 = d + 85;
        int i3 = i2 % 128;
        b = i3;
        if (i2 % 2 == 0) {
            long j = progressiveMediaPeriod.durationUs;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        long j2 = progressiveMediaPeriod.durationUs;
        int i4 = i3 + 57;
        d = i4 % 128;
        int i5 = i4 % 2;
        return j2;
    }

    static /* synthetic */ void access$700(ProgressiveMediaPeriod progressiveMediaPeriod) {
        int i = 2 % 2;
        int i2 = d + 81;
        b = i2 % 128;
        int i3 = i2 % 2;
        progressiveMediaPeriod.onLengthKnown();
        if (i3 == 0) {
            throw null;
        }
    }

    static /* synthetic */ IcyHeaders access$800(ProgressiveMediaPeriod progressiveMediaPeriod) {
        int i = 2 % 2;
        int i2 = d + 51;
        int i3 = i2 % 128;
        b = i3;
        int i4 = i2 % 2;
        IcyHeaders icyHeaders = progressiveMediaPeriod.icyHeaders;
        int i5 = i3 + 1;
        d = i5 % 128;
        int i6 = i5 % 2;
        return icyHeaders;
    }

    static /* synthetic */ IcyHeaders access$802(ProgressiveMediaPeriod progressiveMediaPeriod, IcyHeaders icyHeaders) {
        int i = 2 % 2;
        int i2 = b + 91;
        int i3 = i2 % 128;
        d = i3;
        int i4 = i2 % 2;
        progressiveMediaPeriod.icyHeaders = icyHeaders;
        int i5 = i3 + 61;
        b = i5 % 128;
        int i6 = i5 % 2;
        return icyHeaders;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.Callback
    public /* bridge */ /* synthetic */ void onLoadCanceled(ExtractingLoadable extractingLoadable, long j, long j2, boolean z) {
        int i = 2 % 2;
        int i2 = b + 17;
        d = i2 % 128;
        int i3 = i2 % 2;
        onLoadCanceled2(extractingLoadable, j, j2, z);
        int i4 = b + 121;
        d = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.Callback
    public /* synthetic */ void onLoadCompleted(ExtractingLoadable extractingLoadable, long j, long j2) {
        int i = 2 % 2;
        int i2 = d + 121;
        b = i2 % 128;
        if (i2 % 2 != 0) {
            onLoadCompleted2(extractingLoadable, j, j2);
            return;
        }
        onLoadCompleted2(extractingLoadable, j, j2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.Callback
    public /* bridge */ /* synthetic */ Loader.LoadErrorAction onLoadError(ExtractingLoadable extractingLoadable, long j, long j2, IOException iOException, int i) {
        int i2 = 2 % 2;
        int i3 = b + 11;
        d = i3 % 128;
        if (i3 % 2 == 0) {
            return onLoadError2(extractingLoadable, j, j2, iOException, i);
        }
        onLoadError2(extractingLoadable, j, j2, iOException, i);
        throw null;
    }

    static {
        b();
        ICY_METADATA_HEADERS = createIcyMetadataHeaders();
        ICY_FORMAT = new Format.Builder().setId("icy").setSampleMimeType("application/x-icy").build();
        int i = d + 31;
        b = i % 128;
        int i2 = i % 2;
    }

    public ProgressiveMediaPeriod(Uri uri, DataSource dataSource, ProgressiveMediaExtractor progressiveMediaExtractor, DrmSessionManager drmSessionManager, DrmSessionEventListener.EventDispatcher eventDispatcher, LoadErrorHandlingPolicy loadErrorHandlingPolicy, MediaSourceEventListener.EventDispatcher eventDispatcher2, Listener listener, Allocator allocator, String str, int i, long j) {
        boolean z;
        this.uri = uri;
        this.dataSource = dataSource;
        this.drmSessionManager = drmSessionManager;
        this.drmEventDispatcher = eventDispatcher;
        this.loadErrorHandlingPolicy = loadErrorHandlingPolicy;
        this.mediaSourceEventDispatcher = eventDispatcher2;
        this.listener = listener;
        this.allocator = allocator;
        this.customCacheKey = str;
        this.continueLoadingCheckIntervalBytes = i;
        this.progressiveMediaExtractor = progressiveMediaExtractor;
        this.durationUs = j;
        if (j != -9223372036854775807L) {
            z = true;
        } else {
            int i2 = d + 5;
            b = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
            z = false;
        }
        this.isSingleSample = z;
        this.loadCondition = new ConditionVariable();
        this.maybeFinishPrepareRunnable = new Runnable() { // from class: androidx.media3.exoplayer.source.ProgressiveMediaPeriod$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                ProgressiveMediaPeriod.$r8$lambda$fRLJj_pvmhUWdElszeJahaiDmb0(ProgressiveMediaPeriod.this);
            }
        };
        this.onContinueLoadingRequestedRunnable = new Runnable() { // from class: androidx.media3.exoplayer.source.ProgressiveMediaPeriod$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                ProgressiveMediaPeriod.$r8$lambda$f6avGSTSR4EHkiT5C2BLoacEBBo(ProgressiveMediaPeriod.this);
            }
        };
        this.handler = Util.createHandlerForCurrentLooper();
        this.sampleQueueTrackIds = new TrackId[0];
        this.sampleQueues = new SampleQueue[0];
        this.pendingResetPositionUs = -9223372036854775807L;
        this.dataType = 1;
        int i5 = d + 109;
        b = i5 % 128;
        int i6 = i5 % 2;
    }

    private /* synthetic */ void lambda$new$0() {
        int i = 2 % 2;
        int i2 = d + 13;
        b = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 88 / 0;
            if (this.released) {
                return;
            }
        } else if (this.released) {
            return;
        }
        ((MediaPeriod.Callback) Assertions.checkNotNull(this.callback)).onContinueLoadingRequested(this);
        int i4 = d + 107;
        b = i4 % 128;
        int i5 = i4 % 2;
    }

    public void release() {
        int i = 2 % 2;
        int i2 = b + 43;
        int i3 = i2 % 128;
        d = i3;
        int i4 = i2 % 2;
        if (this.prepared) {
            SampleQueue[] sampleQueueArr = this.sampleQueues;
            int i5 = i3 + 53;
            b = i5 % 128;
            int i6 = i5 % 2;
            for (SampleQueue sampleQueue : sampleQueueArr) {
                int i7 = b + 65;
                d = i7 % 128;
                int i8 = i7 % 2;
                sampleQueue.preRelease();
            }
        }
        this.loader.release(this);
        this.handler.removeCallbacksAndMessages(null);
        this.callback = null;
        this.released = true;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.ReleaseCallback
    public void onLoaderReleased() {
        SampleQueue[] sampleQueueArr;
        int length;
        int i;
        int i2 = 2 % 2;
        int i3 = d + 93;
        b = i3 % 128;
        if (i3 % 2 == 0) {
            sampleQueueArr = this.sampleQueues;
            length = sampleQueueArr.length;
            i = 1;
        } else {
            sampleQueueArr = this.sampleQueues;
            length = sampleQueueArr.length;
            i = 0;
        }
        while (i < length) {
            int i4 = d + 55;
            b = i4 % 128;
            int i5 = i4 % 2;
            sampleQueueArr[i].release();
            i++;
        }
        this.progressiveMediaExtractor.release();
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public void prepare(MediaPeriod.Callback callback, long j) {
        int i = 2 % 2;
        int i2 = d + 73;
        b = i2 % 128;
        int i3 = i2 % 2;
        this.callback = callback;
        this.loadCondition.open();
        startLoading();
        int i4 = b + 101;
        d = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public void maybeThrowPrepareError() {
        int i = 2 % 2;
        int i2 = b + 63;
        d = i2 % 128;
        int i3 = i2 % 2;
        maybeThrowError();
        if (this.loadingFinished) {
            if (!this.prepared) {
                throw ParserException.createForMalformedContainer("Loading finished before preparation is complete.", null);
            }
            int i4 = b + 101;
            d = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public TrackGroupArray getTrackGroups() {
        int i = 2 % 2;
        int i2 = d + 53;
        b = i2 % 128;
        if (i2 % 2 != 0) {
            assertPrepared();
            return this.trackState.tracks;
        }
        assertPrepared();
        TrackGroupArray trackGroupArray = this.trackState.tracks;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x00ed, code lost:
        if (r15.loader.isLoading() != false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00fa, code lost:
        if (r15.loader.isLoading() != false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00fc, code lost:
        r1 = r15.sampleQueues;
        r2 = r1.length;
        r6 = androidx.media3.exoplayer.source.ProgressiveMediaPeriod.b + 99;
        androidx.media3.exoplayer.source.ProgressiveMediaPeriod.d = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0108, code lost:
        if (r9 >= r2) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x010a, code lost:
        r1[r9].discardToEnd();
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0112, code lost:
        r15.loader.cancelLoading();
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0118, code lost:
        r1 = r15.sampleQueues;
        r2 = r1.length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x011b, code lost:
        if (r9 >= r2) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x011d, code lost:
        r6 = androidx.media3.exoplayer.source.ProgressiveMediaPeriod.d + 69;
        androidx.media3.exoplayer.source.ProgressiveMediaPeriod.b = r6 % 128;
        r6 = r6 % 2;
        r1[r9].reset();
        r9 = r9 + 1;
     */
    @Override // androidx.media3.exoplayer.source.MediaPeriod
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long selectTracks(androidx.media3.exoplayer.trackselection.ExoTrackSelection[] r16, boolean[] r17, androidx.media3.exoplayer.source.SampleStream[] r18, boolean[] r19, long r20) {
        /*
            Method dump skipped, instructions count: 339
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.source.ProgressiveMediaPeriod.selectTracks(androidx.media3.exoplayer.trackselection.ExoTrackSelection[], boolean[], androidx.media3.exoplayer.source.SampleStream[], boolean[], long):long");
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public void discardBuffer(long j, boolean z) {
        int i = 2 % 2;
        int i2 = d + 59;
        b = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 85 / 0;
            if (this.isSingleSample) {
                return;
            }
        } else if (this.isSingleSample) {
            return;
        }
        assertPrepared();
        if (isPendingReset()) {
            int i4 = b + 39;
            d = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
            return;
        }
        boolean[] zArr = this.trackState.trackEnabledStates;
        int length = this.sampleQueues.length;
        int i5 = d + 51;
        b = i5 % 128;
        int i6 = i5 % 2;
        for (int i7 = 0; i7 < length; i7++) {
            this.sampleQueues[i7].discardTo(j, z, zArr[i7]);
        }
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
    public boolean continueLoading(LoadingInfo loadingInfo) {
        int i = 2 % 2;
        int i2 = b + 55;
        d = i2 % 128;
        int i3 = i2 % 2;
        if (!this.loadingFinished && !this.loader.hasFatalError() && !this.pendingDeferredRetry) {
            if (!this.prepared || this.enabledTrackCount != 0) {
                boolean open = this.loadCondition.open();
                if (this.loader.isLoading()) {
                    return open;
                }
                startLoading();
                return true;
            }
            int i4 = b + 31;
            d = i4 % 128;
            int i5 = i4 % 2;
        }
        int i6 = b + 41;
        d = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 28 / 0;
        }
        return false;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
    public boolean isLoading() {
        int i = 2 % 2;
        int i2 = b + NetflixImageView.DEFAULT_LAYER_GRAVITY;
        d = i2 % 128;
        if (i2 % 2 != 0) {
            this.loader.isLoading();
            Object obj = null;
            obj.hashCode();
            throw null;
        } else if (this.loader.isLoading() && this.loadCondition.isOpen()) {
            int i3 = b + 45;
            d = i3 % 128;
            int i4 = i3 % 2;
            return true;
        } else {
            return false;
        }
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
    public long getNextLoadPositionUs() {
        int i = 2 % 2;
        int i2 = d + 43;
        b = i2 % 128;
        if (i2 % 2 == 0) {
            getBufferedPositionUs();
            throw null;
        }
        long bufferedPositionUs = getBufferedPositionUs();
        int i3 = d + 29;
        b = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 67 / 0;
        }
        return bufferedPositionUs;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0021, code lost:
        if (getExtractedSamplesCount() > r4.extractedSamplesCountAtStartOfLoad) goto L7;
     */
    @Override // androidx.media3.exoplayer.source.MediaPeriod
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long readDiscontinuity() {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            boolean r1 = r4.notifyDiscontinuity
            if (r1 == 0) goto L29
            int r1 = androidx.media3.exoplayer.source.ProgressiveMediaPeriod.b
            int r2 = r1 + 119
            int r3 = r2 % 128
            androidx.media3.exoplayer.source.ProgressiveMediaPeriod.d = r3
            int r2 = r2 % r0
            boolean r2 = r4.loadingFinished
            if (r2 != 0) goto L23
            int r1 = r1 + 123
            int r2 = r1 % 128
            androidx.media3.exoplayer.source.ProgressiveMediaPeriod.d = r2
            int r1 = r1 % r0
            int r1 = r4.getExtractedSamplesCount()
            int r2 = r4.extractedSamplesCountAtStartOfLoad
            if (r1 <= r2) goto L29
        L23:
            r0 = 0
            r4.notifyDiscontinuity = r0
            long r0 = r4.lastSeekPositionUs
            return r0
        L29:
            int r1 = androidx.media3.exoplayer.source.ProgressiveMediaPeriod.b
            int r1 = r1 + 19
            int r2 = r1 % 128
            androidx.media3.exoplayer.source.ProgressiveMediaPeriod.d = r2
            int r1 = r1 % r0
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.source.ProgressiveMediaPeriod.readDiscontinuity():long");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0083 A[SYNTHETIC] */
    @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long getBufferedPositionUs() {
        /*
            r13 = this;
            r0 = 2
            int r1 = r0 % r0
            r13.assertPrepared()
            boolean r1 = r13.loadingFinished
            r2 = 1
            r1 = r1 ^ r2
            r3 = -9223372036854775808
            if (r1 == r2) goto Lf
            goto L13
        Lf:
            int r1 = r13.enabledTrackCount
            if (r1 != 0) goto L14
        L13:
            return r3
        L14:
            boolean r1 = r13.isPendingReset()
            if (r1 == 0) goto L2d
            long r1 = r13.pendingResetPositionUs
            int r3 = androidx.media3.exoplayer.source.ProgressiveMediaPeriod.b
            int r3 = r3 + 49
            int r4 = r3 % 128
            androidx.media3.exoplayer.source.ProgressiveMediaPeriod.d = r4
            int r3 = r3 % r0
            if (r3 != 0) goto L28
            return r1
        L28:
            r0 = 0
            r0.hashCode()
            throw r0
        L2d:
            boolean r1 = r13.haveAudioVideoTracks
            r1 = r1 ^ r2
            r5 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r2 = 0
            if (r1 == 0) goto L43
            int r1 = androidx.media3.exoplayer.source.ProgressiveMediaPeriod.b
            int r1 = r1 + 61
            int r7 = r1 % 128
            androidx.media3.exoplayer.source.ProgressiveMediaPeriod.d = r7
            int r1 = r1 % r0
            r7 = r5
            goto L86
        L43:
            androidx.media3.exoplayer.source.SampleQueue[] r1 = r13.sampleQueues
            int r1 = r1.length
            r9 = r2
            r7 = r5
        L48:
            if (r9 >= r1) goto L86
            androidx.media3.exoplayer.source.ProgressiveMediaPeriod$TrackState r10 = r13.trackState
            boolean[] r11 = r10.trackIsAudioVideoFlags
            boolean r11 = r11[r9]
            if (r11 == 0) goto L83
            int r11 = androidx.media3.exoplayer.source.ProgressiveMediaPeriod.d
            int r11 = r11 + 75
            int r12 = r11 % 128
            androidx.media3.exoplayer.source.ProgressiveMediaPeriod.b = r12
            int r11 = r11 % r0
            if (r11 != 0) goto L67
            boolean[] r10 = r10.trackEnabledStates
            boolean r10 = r10[r9]
            r11 = 17
            int r11 = r11 / r2
            if (r10 == 0) goto L83
            goto L6d
        L67:
            boolean[] r10 = r10.trackEnabledStates
            boolean r10 = r10[r9]
            if (r10 == 0) goto L83
        L6d:
            androidx.media3.exoplayer.source.SampleQueue[] r10 = r13.sampleQueues
            r10 = r10[r9]
            boolean r10 = r10.isLastSampleQueued()
            if (r10 != 0) goto L83
            androidx.media3.exoplayer.source.SampleQueue[] r10 = r13.sampleQueues
            r10 = r10[r9]
            long r10 = r10.getLargestQueuedTimestampUs()
            long r7 = java.lang.Math.min(r7, r10)
        L83:
            int r9 = r9 + 1
            goto L48
        L86:
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 != 0) goto L8e
            long r7 = r13.getLargestQueuedTimestampUs(r2)
        L8e:
            int r0 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r0 != 0) goto L94
            long r7 = r13.lastSeekPositionUs
        L94:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.source.ProgressiveMediaPeriod.getBufferedPositionUs():long");
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public long seekToUs(long j) {
        int i = 2 % 2;
        assertPrepared();
        boolean[] zArr = this.trackState.trackIsAudioVideoFlags;
        if (!this.seekMap.isSeekable()) {
            j = 0;
        }
        int i2 = 0;
        this.notifyDiscontinuity = false;
        this.lastSeekPositionUs = j;
        if (isPendingReset()) {
            this.pendingResetPositionUs = j;
            return j;
        }
        Object obj = null;
        if (this.dataType != 7 && seekInsideBufferUs(zArr, j)) {
            int i3 = d + 89;
            b = i3 % 128;
            if (i3 % 2 != 0) {
                return j;
            }
            obj.hashCode();
            throw null;
        }
        this.pendingDeferredRetry = false;
        this.pendingResetPositionUs = j;
        this.loadingFinished = false;
        if (!(!this.loader.isLoading())) {
            int i4 = b + 103;
            d = i4 % 128;
            if (i4 % 2 != 0) {
                int length = this.sampleQueues.length;
                throw null;
            }
            SampleQueue[] sampleQueueArr = this.sampleQueues;
            int length2 = sampleQueueArr.length;
            while (i2 < length2) {
                sampleQueueArr[i2].discardToEnd();
                i2++;
            }
            this.loader.cancelLoading();
        } else {
            this.loader.clearFatalError();
            SampleQueue[] sampleQueueArr2 = this.sampleQueues;
            int length3 = sampleQueueArr2.length;
            while (i2 < length3) {
                sampleQueueArr2[i2].reset();
                i2++;
            }
        }
        return j;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public long getAdjustedSeekPositionUs(long j, SeekParameters seekParameters) {
        int i = 2 % 2;
        assertPrepared();
        if (this.seekMap.isSeekable()) {
            SeekMap.SeekPoints seekPoints = this.seekMap.getSeekPoints(j);
            return seekParameters.resolveSeekPositionUs(j, seekPoints.first.timeUs, seekPoints.second.timeUs);
        }
        int i2 = b;
        int i3 = i2 + 83;
        d = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 11;
        d = i5 % 128;
        int i6 = i5 % 2;
        return 0L;
    }

    boolean isReady(int i) {
        int i2 = 2 % 2;
        int i3 = b + 73;
        d = i3 % 128;
        if (i3 % 2 != 0) {
            suppressRead();
            throw null;
        } else if (suppressRead() || !this.sampleQueues[i].isReady(this.loadingFinished)) {
            int i4 = b + 109;
            d = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 5 / 5;
            }
            return false;
        } else {
            return true;
        }
    }

    void maybeThrowError(int i) {
        int i2 = 2 % 2;
        int i3 = d + 89;
        b = i3 % 128;
        int i4 = i3 % 2;
        this.sampleQueues[i].maybeThrowError();
        maybeThrowError();
        int i5 = b + NetflixImageView.DEFAULT_LAYER_GRAVITY;
        d = i5 % 128;
        int i6 = i5 % 2;
    }

    void maybeThrowError() {
        int i = 2 % 2;
        int i2 = d + 69;
        b = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            this.loader.maybeThrowError(this.loadErrorHandlingPolicy.getMinimumLoadableRetryCount(this.dataType));
            throw null;
        }
        this.loader.maybeThrowError(this.loadErrorHandlingPolicy.getMinimumLoadableRetryCount(this.dataType));
        int i3 = d + 103;
        b = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    int readData(int i, FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, int i2) {
        int i3 = 2 % 2;
        int i4 = b + 121;
        d = i4 % 128;
        int i5 = i4 % 2;
        if (!suppressRead()) {
            maybeNotifyDownstreamFormat(i);
            int read = this.sampleQueues[i].read(formatHolder, decoderInputBuffer, i2, this.loadingFinished);
            if (read == -3) {
                int i6 = d + 97;
                b = i6 % 128;
                int i7 = i6 % 2;
                maybeStartDeferredRetry(i);
            }
            return read;
        }
        int i8 = d + 107;
        b = i8 % 128;
        return i8 % 2 == 0 ? 38 : -3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0028, code lost:
        if ((r5 % 2) == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002a, code lost:
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
        maybeNotifyDownstreamFormat(r5);
        r1 = r4.sampleQueues[r5];
        r6 = r1.getSkipCount(r6, r4.loadingFinished);
        r1.skip(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003d, code lost:
        if (r6 != 0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003f, code lost:
        maybeStartDeferredRetry(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0042, code lost:
        r5 = androidx.media3.exoplayer.source.ProgressiveMediaPeriod.b + 35;
        androidx.media3.exoplayer.source.ProgressiveMediaPeriod.d = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004b, code lost:
        if ((r5 % 2) == 0) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004d, code lost:
        r5 = 54 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0050, code lost:
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0016, code lost:
        if (suppressRead() != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
        if (suppressRead() != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
        r5 = androidx.media3.exoplayer.source.ProgressiveMediaPeriod.d + 101;
        androidx.media3.exoplayer.source.ProgressiveMediaPeriod.b = r5 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    int skipData(int r5, long r6) {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = androidx.media3.exoplayer.source.ProgressiveMediaPeriod.d
            int r1 = r1 + 45
            int r2 = r1 % 128
            androidx.media3.exoplayer.source.ProgressiveMediaPeriod.b = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 != 0) goto L19
            boolean r1 = r4.suppressRead()
            r3 = 43
            int r3 = r3 / r2
            if (r1 == 0) goto L2d
            goto L1f
        L19:
            boolean r1 = r4.suppressRead()
            if (r1 == 0) goto L2d
        L1f:
            int r5 = androidx.media3.exoplayer.source.ProgressiveMediaPeriod.d
            int r5 = r5 + 101
            int r6 = r5 % 128
            androidx.media3.exoplayer.source.ProgressiveMediaPeriod.b = r6
            int r5 = r5 % r0
            if (r5 == 0) goto L2b
            return r2
        L2b:
            r5 = 0
            throw r5
        L2d:
            r4.maybeNotifyDownstreamFormat(r5)
            androidx.media3.exoplayer.source.SampleQueue[] r1 = r4.sampleQueues
            r1 = r1[r5]
            boolean r3 = r4.loadingFinished
            int r6 = r1.getSkipCount(r6, r3)
            r1.skip(r6)
            if (r6 != 0) goto L42
            r4.maybeStartDeferredRetry(r5)
        L42:
            int r5 = androidx.media3.exoplayer.source.ProgressiveMediaPeriod.b
            int r5 = r5 + 35
            int r7 = r5 % 128
            androidx.media3.exoplayer.source.ProgressiveMediaPeriod.d = r7
            int r5 = r5 % r0
            if (r5 == 0) goto L50
            r5 = 54
            int r5 = r5 / r2
        L50:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.source.ProgressiveMediaPeriod.skipData(int, long):int");
    }

    private void maybeNotifyDownstreamFormat(int i) {
        int i2 = 2 % 2;
        int i3 = d + 35;
        b = i3 % 128;
        int i4 = i3 % 2;
        assertPrepared();
        TrackState trackState = this.trackState;
        boolean[] zArr = trackState.trackNotifiedDownstreamFormats;
        if (!zArr[i]) {
            int i5 = b + 71;
            d = i5 % 128;
            int i6 = i5 % 2;
            Format format = trackState.tracks.get(i).getFormat(0);
            this.mediaSourceEventDispatcher.downstreamFormatChanged(MimeTypes.getTrackType(format.sampleMimeType), format, 0, null, this.lastSeekPositionUs);
            zArr[i] = true;
        }
        int i7 = d + 87;
        b = i7 % 128;
        int i8 = i7 % 2;
    }

    private void maybeStartDeferredRetry(int i) {
        boolean[] zArr;
        int i2;
        int i3 = 2 % 2;
        int i4 = b + 87;
        d = i4 % 128;
        if (i4 % 2 != 0) {
            assertPrepared();
            zArr = this.trackState.trackIsAudioVideoFlags;
            int i5 = 59 / 0;
            if (!this.pendingDeferredRetry) {
                return;
            }
        } else {
            assertPrepared();
            zArr = this.trackState.trackIsAudioVideoFlags;
            if (!this.pendingDeferredRetry) {
                return;
            }
        }
        if (zArr[i]) {
            int i6 = d + 27;
            b = i6 % 128;
            if (i6 % 2 == 0) {
                if (this.sampleQueues[i].isReady(false)) {
                    return;
                }
                i2 = 1;
            } else if (this.sampleQueues[i].isReady(false)) {
                return;
            } else {
                i2 = 0;
            }
            this.pendingResetPositionUs = 0L;
            this.pendingDeferredRetry = false;
            this.notifyDiscontinuity = true;
            this.lastSeekPositionUs = 0L;
            this.extractedSamplesCountAtStartOfLoad = 0;
            SampleQueue[] sampleQueueArr = this.sampleQueues;
            int length = sampleQueueArr.length;
            while (i2 < length) {
                int i7 = d + 65;
                b = i7 % 128;
                if (i7 % 2 == 0) {
                    sampleQueueArr[i2].reset();
                    i2 += 87;
                } else {
                    sampleQueueArr[i2].reset();
                    i2++;
                }
            }
            ((MediaPeriod.Callback) Assertions.checkNotNull(this.callback)).onContinueLoadingRequested(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0031 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean suppressRead() {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = androidx.media3.exoplayer.source.ProgressiveMediaPeriod.d
            int r1 = r1 + 89
            int r2 = r1 % 128
            androidx.media3.exoplayer.source.ProgressiveMediaPeriod.b = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 == 0) goto L33
            boolean r1 = r5.notifyDiscontinuity
            if (r1 != 0) goto L25
            boolean r1 = r5.isPendingReset()
            if (r1 == 0) goto L23
            int r1 = androidx.media3.exoplayer.source.ProgressiveMediaPeriod.b
            int r1 = r1 + 23
            int r3 = r1 % 128
            androidx.media3.exoplayer.source.ProgressiveMediaPeriod.d = r3
            int r1 = r1 % r0
            goto L25
        L23:
            r1 = 0
            goto L26
        L25:
            r1 = 1
        L26:
            int r3 = androidx.media3.exoplayer.source.ProgressiveMediaPeriod.d
            int r3 = r3 + 107
            int r4 = r3 % 128
            androidx.media3.exoplayer.source.ProgressiveMediaPeriod.b = r4
            int r3 = r3 % r0
            if (r3 == 0) goto L32
            return r1
        L32:
            throw r2
        L33:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.source.ProgressiveMediaPeriod.suppressRead():boolean");
    }

    /* renamed from: onLoadCompleted  reason: avoid collision after fix types in other method */
    public void onLoadCompleted2(ExtractingLoadable extractingLoadable, long j, long j2) {
        SeekMap seekMap;
        long j3;
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 + 79;
        b = i3 % 128;
        int i4 = i3 % 2;
        if (this.durationUs == -9223372036854775807L && (seekMap = this.seekMap) != null) {
            int i5 = i2 + 111;
            b = i5 % 128;
            int i6 = i5 % 2;
            boolean isSeekable = seekMap.isSeekable();
            long largestQueuedTimestampUs = getLargestQueuedTimestampUs(true);
            if (largestQueuedTimestampUs == Long.MIN_VALUE) {
                int i7 = d + 61;
                b = i7 % 128;
                int i8 = i7 % 2;
                j3 = 0;
            } else {
                j3 = largestQueuedTimestampUs + 10000;
            }
            this.durationUs = j3;
            this.listener.onSourceInfoRefreshed(j3, isSeekable, this.isLive);
        }
        StatsDataSource statsDataSource = extractingLoadable.dataSource;
        LoadEventInfo loadEventInfo = new LoadEventInfo(extractingLoadable.loadTaskId, extractingLoadable.dataSpec, statsDataSource.getLastOpenedUri(), statsDataSource.getLastResponseHeaders(), j, j2, statsDataSource.getBytesRead());
        this.loadErrorHandlingPolicy.onLoadTaskConcluded(extractingLoadable.loadTaskId);
        this.mediaSourceEventDispatcher.loadCompleted(loadEventInfo, 1, -1, null, 0, null, extractingLoadable.seekTimeUs, this.durationUs);
        this.loadingFinished = true;
        ((MediaPeriod.Callback) Assertions.checkNotNull(this.callback)).onContinueLoadingRequested(this);
    }

    /* renamed from: onLoadCanceled  reason: avoid collision after fix types in other method */
    public void onLoadCanceled2(ExtractingLoadable extractingLoadable, long j, long j2, boolean z) {
        int i = 2 % 2;
        StatsDataSource statsDataSource = extractingLoadable.dataSource;
        LoadEventInfo loadEventInfo = new LoadEventInfo(extractingLoadable.loadTaskId, extractingLoadable.dataSpec, statsDataSource.getLastOpenedUri(), statsDataSource.getLastResponseHeaders(), j, j2, statsDataSource.getBytesRead());
        this.loadErrorHandlingPolicy.onLoadTaskConcluded(extractingLoadable.loadTaskId);
        this.mediaSourceEventDispatcher.loadCanceled(loadEventInfo, 1, -1, null, 0, null, extractingLoadable.seekTimeUs, this.durationUs);
        if (!z) {
            for (SampleQueue sampleQueue : this.sampleQueues) {
                sampleQueue.reset();
            }
            if (this.enabledTrackCount > 0) {
                ((MediaPeriod.Callback) Assertions.checkNotNull(this.callback)).onContinueLoadingRequested(this);
                int i2 = b + 117;
                d = i2 % 128;
                int i3 = i2 % 2;
            }
        }
        int i4 = d + 27;
        b = i4 % 128;
        int i5 = i4 % 2;
    }

    /* renamed from: onLoadError  reason: avoid collision after fix types in other method */
    public Loader.LoadErrorAction onLoadError2(ExtractingLoadable extractingLoadable, long j, long j2, IOException iOException, int i) {
        boolean z;
        ExtractingLoadable extractingLoadable2;
        Loader.LoadErrorAction createRetryAction;
        int i2 = 2 % 2;
        StatsDataSource statsDataSource = extractingLoadable.dataSource;
        LoadEventInfo loadEventInfo = new LoadEventInfo(extractingLoadable.loadTaskId, extractingLoadable.dataSpec, statsDataSource.getLastOpenedUri(), statsDataSource.getLastResponseHeaders(), j, j2, statsDataSource.getBytesRead());
        long retryDelayMsFor = this.loadErrorHandlingPolicy.getRetryDelayMsFor(new LoadErrorHandlingPolicy.LoadErrorInfo(loadEventInfo, new MediaLoadData(1, -1, null, 0, null, Util.usToMs(extractingLoadable.seekTimeUs), Util.usToMs(this.durationUs)), iOException, i));
        if (retryDelayMsFor == -9223372036854775807L) {
            createRetryAction = Loader.DONT_RETRY_FATAL;
            int i3 = d + 63;
            b = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 5 % 2;
            }
        } else {
            int extractedSamplesCount = getExtractedSamplesCount();
            if (extractedSamplesCount > this.extractedSamplesCountAtStartOfLoad) {
                int i5 = b;
                int i6 = i5 + 97;
                d = i6 % 128;
                int i7 = i6 % 2;
                int i8 = i5 + 63;
                d = i8 % 128;
                int i9 = i8 % 2;
                extractingLoadable2 = extractingLoadable;
                z = true;
            } else {
                z = false;
                extractingLoadable2 = extractingLoadable;
            }
            if (configureRetry(extractingLoadable2, extractedSamplesCount)) {
                createRetryAction = Loader.createRetryAction(z, retryDelayMsFor);
            } else {
                createRetryAction = Loader.DONT_RETRY;
            }
        }
        boolean z2 = !createRetryAction.isRetry();
        this.mediaSourceEventDispatcher.loadError(loadEventInfo, 1, -1, null, 0, null, extractingLoadable.seekTimeUs, this.durationUs, iOException, z2);
        if (z2) {
            this.loadErrorHandlingPolicy.onLoadTaskConcluded(extractingLoadable.loadTaskId);
        }
        return createRetryAction;
    }

    @Override // androidx.media3.extractor.ExtractorOutput
    public TrackOutput track(int i, int i2) {
        int i3 = 2 % 2;
        TrackOutput prepareTrackOutput = prepareTrackOutput(new TrackId(i, false));
        int i4 = d + 3;
        b = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 26 / 0;
        }
        return prepareTrackOutput;
    }

    @Override // androidx.media3.extractor.ExtractorOutput
    public void endTracks() {
        int i = 2 % 2;
        int i2 = b + 87;
        d = i2 % 128;
        int i3 = i2 % 2;
        this.sampleQueuesBuilt = true;
        this.handler.post(this.maybeFinishPrepareRunnable);
        int i4 = d + 99;
        b = i4 % 128;
        int i5 = i4 % 2;
    }

    private /* synthetic */ void lambda$seekMap$1(SeekMap seekMap) {
        int i = 2 % 2;
        int i2 = b + 9;
        d = i2 % 128;
        int i3 = i2 % 2;
        setSeekMap(seekMap);
        int i4 = b + 25;
        d = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 9 / 0;
        }
    }

    @Override // androidx.media3.extractor.ExtractorOutput
    public void seekMap(final SeekMap seekMap) {
        int i = 2 % 2;
        this.handler.post(new Runnable() { // from class: androidx.media3.exoplayer.source.ProgressiveMediaPeriod$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                ProgressiveMediaPeriod.$r8$lambda$UME9wo0vnnZOdagWwSK8ILcEMgY(ProgressiveMediaPeriod.this, seekMap);
            }
        });
        int i2 = b + 29;
        d = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    TrackOutput icyTrack() {
        int i = 2 % 2;
        TrackOutput prepareTrackOutput = prepareTrackOutput(new TrackId(0, true));
        int i2 = d + 27;
        b = i2 % 128;
        int i3 = i2 % 2;
        return prepareTrackOutput;
    }

    @Override // androidx.media3.exoplayer.source.SampleQueue.UpstreamFormatChangedListener
    public void onUpstreamFormatChanged(Format format) {
        int i = 2 % 2;
        int i2 = b + 115;
        d = i2 % 128;
        if (i2 % 2 == 0) {
            this.handler.post(this.maybeFinishPrepareRunnable);
            return;
        }
        this.handler.post(this.maybeFinishPrepareRunnable);
        int i3 = 37 / 0;
    }

    private void onLengthKnown() {
        int i = 2 % 2;
        this.handler.post(new Runnable() { // from class: androidx.media3.exoplayer.source.ProgressiveMediaPeriod$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                ProgressiveMediaPeriod.m2704$r8$lambda$YLOJRxyfXfojUItlqJNlGyZVaA(ProgressiveMediaPeriod.this);
            }
        });
        int i2 = d + 17;
        b = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private TrackOutput prepareTrackOutput(TrackId trackId) {
        int i = 2 % 2;
        int length = this.sampleQueues.length;
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = d + 35;
            b = i3 % 128;
            if (i3 % 2 != 0) {
                if (trackId.equals(this.sampleQueueTrackIds[i2])) {
                    int i4 = d + 23;
                    b = i4 % 128;
                    int i5 = i4 % 2;
                    return this.sampleQueues[i2];
                }
            } else {
                trackId.equals(this.sampleQueueTrackIds[i2]);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        SampleQueue createWithDrm = SampleQueue.createWithDrm(this.allocator, this.drmSessionManager, this.drmEventDispatcher);
        createWithDrm.setUpstreamFormatChangeListener(this);
        int i6 = length + 1;
        TrackId[] trackIdArr = (TrackId[]) Arrays.copyOf(this.sampleQueueTrackIds, i6);
        trackIdArr[length] = trackId;
        this.sampleQueueTrackIds = (TrackId[]) Util.castNonNullTypeArray(trackIdArr);
        SampleQueue[] sampleQueueArr = (SampleQueue[]) Arrays.copyOf(this.sampleQueues, i6);
        sampleQueueArr[length] = createWithDrm;
        this.sampleQueues = (SampleQueue[]) Util.castNonNullTypeArray(sampleQueueArr);
        int i7 = b + 11;
        d = i7 % 128;
        int i8 = i7 % 2;
        return createWithDrm;
    }

    private void setSeekMap(SeekMap seekMap) {
        SeekMap unseekable;
        int i = 2 % 2;
        if (this.icyHeaders == null) {
            unseekable = seekMap;
        } else {
            unseekable = new SeekMap.Unseekable(-9223372036854775807L);
            int i2 = b + 17;
            d = i2 % 128;
            int i3 = i2 % 2;
        }
        this.seekMap = unseekable;
        if (seekMap.getDurationUs() == -9223372036854775807L && this.durationUs != -9223372036854775807L) {
            this.seekMap = new ForwardingSeekMap(this.seekMap) { // from class: androidx.media3.exoplayer.source.ProgressiveMediaPeriod.1
                @Override // androidx.media3.extractor.ForwardingSeekMap, androidx.media3.extractor.SeekMap
                public long getDurationUs() {
                    return ProgressiveMediaPeriod.access$500(ProgressiveMediaPeriod.this);
                }
            };
        }
        this.durationUs = this.seekMap.getDurationUs();
        boolean z = false;
        int i4 = 1;
        if (!this.isLengthKnown && seekMap.getDurationUs() == -9223372036854775807L) {
            int i5 = b + 85;
            d = i5 % 128;
            if (i5 % 2 == 0) {
                z = true;
            }
        }
        this.isLive = z;
        if (z) {
            int i6 = d + 51;
            b = i6 % 128;
            int i7 = i6 % 2;
            i4 = 7;
        }
        this.dataType = i4;
        this.listener.onSourceInfoRefreshed(this.durationUs, seekMap.isSeekable(), this.isLive);
        if (this.prepared) {
            return;
        }
        maybeFinishPrepare();
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0091, code lost:
        if (r12.sampleQueueTrackIds[r5].isIcyTrack != false) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void maybeFinishPrepare() {
        /*
            Method dump skipped, instructions count: 283
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.source.ProgressiveMediaPeriod.maybeFinishPrepare():void");
    }

    private void startLoading() {
        int i = 2 % 2;
        ExtractingLoadable extractingLoadable = new ExtractingLoadable(this.uri, this.dataSource, this.progressiveMediaExtractor, this, this.loadCondition);
        if (this.prepared) {
            int i2 = d + 1;
            b = i2 % 128;
            if (i2 % 2 == 0) {
                Assertions.checkState(isPendingReset());
                throw null;
            }
            Assertions.checkState(isPendingReset());
            long j = this.durationUs;
            int i3 = 0;
            if (j != -9223372036854775807L && this.pendingResetPositionUs > j) {
                int i4 = b + 35;
                d = i4 % 128;
                if (i4 % 2 != 0) {
                    this.loadingFinished = false;
                    this.pendingResetPositionUs = -9223372036854775807L;
                    return;
                }
                this.loadingFinished = true;
                this.pendingResetPositionUs = -9223372036854775807L;
                return;
            }
            extractingLoadable.setLoadPosition(((SeekMap) Assertions.checkNotNull(this.seekMap)).getSeekPoints(this.pendingResetPositionUs).first.position, this.pendingResetPositionUs);
            SampleQueue[] sampleQueueArr = this.sampleQueues;
            int length = sampleQueueArr.length;
            while (i3 < length) {
                int i5 = b + NetflixImageView.DEFAULT_LAYER_GRAVITY;
                d = i5 % 128;
                if (i5 % 2 != 0) {
                    sampleQueueArr[i3].setStartTimeUs(this.pendingResetPositionUs);
                    i3 += 64;
                } else {
                    sampleQueueArr[i3].setStartTimeUs(this.pendingResetPositionUs);
                    i3++;
                }
            }
            this.pendingResetPositionUs = -9223372036854775807L;
        }
        this.extractedSamplesCountAtStartOfLoad = getExtractedSamplesCount();
        long startLoading = this.loader.startLoading(extractingLoadable, this, this.loadErrorHandlingPolicy.getMinimumLoadableRetryCount(this.dataType));
        this.mediaSourceEventDispatcher.loadStarted(new LoadEventInfo(extractingLoadable.loadTaskId, extractingLoadable.dataSpec, startLoading), 1, -1, null, 0, null, extractingLoadable.seekTimeUs, this.durationUs);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0041, code lost:
        if (suppressRead() == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0048, code lost:
        if (suppressRead() == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004a, code lost:
        r7.pendingDeferredRetry = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004c, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0022, code lost:
        if (r1.getDurationUs() != (-9223372036854775807L)) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean configureRetry(androidx.media3.exoplayer.source.ProgressiveMediaPeriod.ExtractingLoadable r8, int r9) {
        /*
            r7 = this;
            r0 = 2
            int r1 = r0 % r0
            boolean r1 = r7.isLengthKnown
            r2 = 1
            if (r1 != 0) goto L68
            androidx.media3.extractor.SeekMap r1 = r7.seekMap
            if (r1 == 0) goto L2a
            int r3 = androidx.media3.exoplayer.source.ProgressiveMediaPeriod.b
            int r3 = r3 + 41
            int r4 = r3 % 128
            androidx.media3.exoplayer.source.ProgressiveMediaPeriod.d = r4
            int r3 = r3 % r0
            if (r3 != 0) goto L25
            long r3 = r1.getDurationUs()
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L2a
            goto L68
        L25:
            r1.getDurationUs()
            r8 = 0
            throw r8
        L2a:
            boolean r9 = r7.prepared
            r1 = 0
            if (r9 == 0) goto L4d
            int r9 = androidx.media3.exoplayer.source.ProgressiveMediaPeriod.d
            int r9 = r9 + 115
            int r3 = r9 % 128
            androidx.media3.exoplayer.source.ProgressiveMediaPeriod.b = r3
            int r9 = r9 % r0
            if (r9 != 0) goto L44
            boolean r9 = r7.suppressRead()
            r0 = 46
            int r0 = r0 / r1
            if (r9 != 0) goto L4d
            goto L4a
        L44:
            boolean r9 = r7.suppressRead()
            if (r9 != 0) goto L4d
        L4a:
            r7.pendingDeferredRetry = r2
            return r1
        L4d:
            boolean r9 = r7.prepared
            r7.notifyDiscontinuity = r9
            r3 = 0
            r7.lastSeekPositionUs = r3
            r7.extractedSamplesCountAtStartOfLoad = r1
            androidx.media3.exoplayer.source.SampleQueue[] r9 = r7.sampleQueues
            int r0 = r9.length
        L5a:
            if (r1 >= r0) goto L64
            r5 = r9[r1]
            r5.reset()
            int r1 = r1 + 1
            goto L5a
        L64:
            androidx.media3.exoplayer.source.ProgressiveMediaPeriod.ExtractingLoadable.access$600(r8, r3, r3)
            return r2
        L68:
            r7.extractedSamplesCountAtStartOfLoad = r9
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.source.ProgressiveMediaPeriod.configureRetry(androidx.media3.exoplayer.source.ProgressiveMediaPeriod$ExtractingLoadable, int):boolean");
    }

    private boolean seekInsideBufferUs(boolean[] zArr, long j) {
        boolean seekTo;
        int i = 2 % 2;
        int length = this.sampleQueues.length;
        for (int i2 = 0; i2 < length; i2++) {
            SampleQueue sampleQueue = this.sampleQueues[i2];
            if (this.isSingleSample) {
                seekTo = sampleQueue.seekTo(sampleQueue.getFirstIndex());
                int i3 = d + 77;
                b = i3 % 128;
                int i4 = i3 % 2;
            } else {
                seekTo = sampleQueue.seekTo(j, false);
            }
            if (!seekTo) {
                int i5 = d + 87;
                b = i5 % 128;
                int i6 = i5 % 2;
                if (zArr[i2] || !this.haveAudioVideoTracks) {
                    return false;
                }
            }
        }
        return true;
    }

    private int getExtractedSamplesCount() {
        SampleQueue[] sampleQueueArr;
        int length;
        int i = 2 % 2;
        int i2 = d + 5;
        b = i2 % 128;
        if (i2 % 2 == 0) {
            sampleQueueArr = this.sampleQueues;
            length = sampleQueueArr.length;
        } else {
            sampleQueueArr = this.sampleQueues;
            length = sampleQueueArr.length;
        }
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            int i5 = d + 5;
            b = i5 % 128;
            if (i5 % 2 == 0) {
                i4 += sampleQueueArr[i3].getWriteIndex();
                i3 += 24;
            } else {
                i4 += sampleQueueArr[i3].getWriteIndex();
                i3++;
            }
        }
        return i4;
    }

    private long getLargestQueuedTimestampUs(boolean z) {
        int i;
        int i2 = 2 % 2;
        long j = Long.MIN_VALUE;
        while (i < this.sampleQueues.length) {
            if (!z) {
                int i3 = d + 103;
                b = i3 % 128;
                int i4 = i3 % 2;
                i = ((TrackState) Assertions.checkNotNull(this.trackState)).trackEnabledStates[i] ? 0 : i + 1;
            }
            j = Math.max(j, this.sampleQueues[i].getLargestQueuedTimestampUs());
            int i5 = d + 3;
            b = i5 % 128;
            int i6 = i5 % 2;
        }
        return j;
    }

    @EnsuresNonNull({"trackState", "seekMap"})
    private void assertPrepared() {
        int i = 2 % 2;
        int i2 = b + 75;
        d = i2 % 128;
        int i3 = i2 % 2;
        Assertions.checkState(this.prepared);
        Assertions.checkNotNull(this.trackState);
        Assertions.checkNotNull(this.seekMap);
        int i4 = d + 99;
        b = i4 % 128;
        int i5 = i4 % 2;
    }

    /* loaded from: classes5.dex */
    final class SampleStreamImpl implements SampleStream {
        private final int track;

        public SampleStreamImpl(int i) {
            this.track = i;
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public boolean isReady() {
            return ProgressiveMediaPeriod.this.isReady(this.track);
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public void maybeThrowError() {
            ProgressiveMediaPeriod.this.maybeThrowError(this.track);
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public int readData(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, int i) {
            return ProgressiveMediaPeriod.this.readData(this.track, formatHolder, decoderInputBuffer, i);
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public int skipData(long j) {
            return ProgressiveMediaPeriod.this.skipData(this.track, j);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public final class ExtractingLoadable implements Loader.Loadable, IcyDataSource.Listener {
        private final StatsDataSource dataSource;
        private final ExtractorOutput extractorOutput;
        private TrackOutput icyTrackOutput;
        private volatile boolean loadCanceled;
        private final ConditionVariable loadCondition;
        private final ProgressiveMediaExtractor progressiveMediaExtractor;
        private long seekTimeUs;
        private boolean seenIcyMetadata;
        private final Uri uri;
        private final PositionHolder positionHolder = new PositionHolder();
        private boolean pendingExtractorSeek = true;
        private final long loadTaskId = LoadEventInfo.getNewId();
        private DataSpec dataSpec = buildDataSpec(0);

        @Override // androidx.media3.exoplayer.upstream.Loader.Loadable
        public void cancelLoad() {
            this.loadCanceled = true;
        }

        public ExtractingLoadable(Uri uri, DataSource dataSource, ProgressiveMediaExtractor progressiveMediaExtractor, ExtractorOutput extractorOutput, ConditionVariable conditionVariable) {
            this.uri = uri;
            this.dataSource = new StatsDataSource(dataSource);
            this.progressiveMediaExtractor = progressiveMediaExtractor;
            this.extractorOutput = extractorOutput;
            this.loadCondition = conditionVariable;
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.Loadable
        public void load() {
            int i = 0;
            while (i == 0 && !this.loadCanceled) {
                try {
                    long j = this.positionHolder.position;
                    DataSpec buildDataSpec = buildDataSpec(j);
                    this.dataSpec = buildDataSpec;
                    long open = this.dataSource.open(buildDataSpec);
                    if (open != -1) {
                        open += j;
                        ProgressiveMediaPeriod.access$700(ProgressiveMediaPeriod.this);
                    }
                    long j2 = open;
                    ProgressiveMediaPeriod.access$802(ProgressiveMediaPeriod.this, IcyHeaders.parse(this.dataSource.getResponseHeaders()));
                    DataReader dataReader = this.dataSource;
                    if (ProgressiveMediaPeriod.access$800(ProgressiveMediaPeriod.this) != null && ProgressiveMediaPeriod.access$800(ProgressiveMediaPeriod.this).metadataInterval != -1) {
                        dataReader = new IcyDataSource(this.dataSource, ProgressiveMediaPeriod.access$800(ProgressiveMediaPeriod.this).metadataInterval, this);
                        TrackOutput icyTrack = ProgressiveMediaPeriod.this.icyTrack();
                        this.icyTrackOutput = icyTrack;
                        icyTrack.format(ProgressiveMediaPeriod.access$900());
                    }
                    long j3 = j;
                    this.progressiveMediaExtractor.init(dataReader, this.uri, this.dataSource.getResponseHeaders(), j, j2, this.extractorOutput);
                    if (ProgressiveMediaPeriod.access$800(ProgressiveMediaPeriod.this) != null) {
                        this.progressiveMediaExtractor.disableSeekingOnMp3Streams();
                    }
                    if (this.pendingExtractorSeek) {
                        this.progressiveMediaExtractor.seek(j3, this.seekTimeUs);
                        this.pendingExtractorSeek = false;
                    }
                    while (true) {
                        long j4 = j3;
                        while (i == 0 && !this.loadCanceled) {
                            try {
                                this.loadCondition.block();
                                i = this.progressiveMediaExtractor.read(this.positionHolder);
                                j3 = this.progressiveMediaExtractor.getCurrentInputPosition();
                                if (j3 > ProgressiveMediaPeriod.access$1000(ProgressiveMediaPeriod.this) + j4) {
                                    break;
                                }
                            } catch (InterruptedException unused) {
                                throw new InterruptedIOException();
                            }
                        }
                        this.loadCondition.close();
                        ProgressiveMediaPeriod.access$1200(ProgressiveMediaPeriod.this).post(ProgressiveMediaPeriod.access$1100(ProgressiveMediaPeriod.this));
                    }
                    if (i == 1) {
                        i = 0;
                    } else if (this.progressiveMediaExtractor.getCurrentInputPosition() != -1) {
                        this.positionHolder.position = this.progressiveMediaExtractor.getCurrentInputPosition();
                    }
                    DataSourceUtil.closeQuietly(this.dataSource);
                } catch (Throwable th) {
                    if (i != 1 && this.progressiveMediaExtractor.getCurrentInputPosition() != -1) {
                        this.positionHolder.position = this.progressiveMediaExtractor.getCurrentInputPosition();
                    }
                    DataSourceUtil.closeQuietly(this.dataSource);
                    throw th;
                }
            }
        }

        @Override // androidx.media3.exoplayer.source.IcyDataSource.Listener
        public void onIcyMetadata(ParsableByteArray parsableByteArray) {
            long max = !this.seenIcyMetadata ? this.seekTimeUs : Math.max(ProgressiveMediaPeriod.access$1300(ProgressiveMediaPeriod.this, true), this.seekTimeUs);
            int bytesLeft = parsableByteArray.bytesLeft();
            TrackOutput trackOutput = (TrackOutput) Assertions.checkNotNull(this.icyTrackOutput);
            trackOutput.sampleData(parsableByteArray, bytesLeft);
            trackOutput.sampleMetadata(max, 1, bytesLeft, 0, null);
            this.seenIcyMetadata = true;
        }

        private DataSpec buildDataSpec(long j) {
            return new DataSpec.Builder().setUri(this.uri).setPosition(j).setKey(ProgressiveMediaPeriod.access$1500(ProgressiveMediaPeriod.this)).setFlags(6).setHttpRequestHeaders(ProgressiveMediaPeriod.access$1400()).build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLoadPosition(long j, long j2) {
            this.positionHolder.position = j;
            this.seekTimeUs = j2;
            this.pendingExtractorSeek = true;
            this.seenIcyMetadata = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class TrackState {
        public final boolean[] trackEnabledStates;
        public final boolean[] trackIsAudioVideoFlags;
        public final boolean[] trackNotifiedDownstreamFormats;
        public final TrackGroupArray tracks;

        public TrackState(TrackGroupArray trackGroupArray, boolean[] zArr) {
            this.tracks = trackGroupArray;
            this.trackIsAudioVideoFlags = zArr;
            int i = trackGroupArray.length;
            this.trackEnabledStates = new boolean[i];
            this.trackNotifiedDownstreamFormats = new boolean[i];
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class TrackId {
        public final int id;
        public final boolean isIcyTrack;

        public int hashCode() {
            return (this.id * 31) + (this.isIcyTrack ? 1 : 0);
        }

        public TrackId(int i, boolean z) {
            this.id = i;
            this.isIcyTrack = z;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || TrackId.class != obj.getClass()) {
                return false;
            }
            TrackId trackId = (TrackId) obj;
            return this.id == trackId.id && this.isIcyTrack == trackId.isIcyTrack;
        }
    }

    private static Map<String, String> createIcyMetadataHeaders() {
        int i = 2 % 2;
        HashMap hashMap = new HashMap();
        Object[] objArr = new Object[1];
        c(new char[]{1338, 22202, 13110, 11050}, new char[]{45551, 34426, 49267, 11573}, 911653381, (char) 10803, new char[]{21487}, objArr);
        hashMap.put("Icy-MetaData", ((String) objArr[0]).intern());
        Map<String, String> unmodifiableMap = Collections.unmodifiableMap(hashMap);
        int i2 = b + 87;
        d = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 52 / 0;
        }
        return unmodifiableMap;
    }

    private static void c(char[] cArr, char[] cArr2, int i, char c, char[] cArr3, Object[] objArr) {
        int i2 = 2 % 2;
        C9585sR c9585sR = new C9585sR();
        int length = cArr.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr3.length;
        char[] cArr6 = new char[length3];
        c9585sR.d = 0;
        while (c9585sR.d < length3) {
            int i3 = $10 + 115;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = (c9585sR.d + 2) % 4;
            int i6 = (c9585sR.d + 3) % 4;
            c9585sR.a = (char) (((cArr4[c9585sR.d % 4] * 32718) + cArr5[i5]) % 65535);
            cArr5[i6] = (char) (((cArr4[i6] * 32718) + cArr5[i5]) / 65535);
            cArr4[i6] = c9585sR.a;
            cArr6[c9585sR.d] = (char) ((((cArr4[i6] ^ cArr3[c9585sR.d]) ^ (d$s74$6744 ^ (-6422965311034337652L))) ^ ((int) (a$s75$6744 ^ (-6422965311034337652L)))) ^ ((char) (b$s76$6744 ^ (-6422965311034337652L))));
            c9585sR.d++;
            int i7 = $11 + 29;
            $10 = i7 % 128;
            int i8 = i7 % 2;
        }
        objArr[0] = new String(cArr6);
    }
}
