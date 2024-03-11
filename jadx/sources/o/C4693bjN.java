package o;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.media3.common.MediaItem;
import androidx.media3.common.ParserException;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.TransferListener;
import androidx.media3.exoplayer.dash.BaseUrlExclusionList;
import androidx.media3.exoplayer.dash.DashChunkSource;
import androidx.media3.exoplayer.dash.DashManifestStaleException;
import androidx.media3.exoplayer.dash.DashMediaPeriod;
import androidx.media3.exoplayer.dash.DashSegmentIndex;
import androidx.media3.exoplayer.dash.PlayerEmsgHandler;
import androidx.media3.exoplayer.dash.manifest.AdaptationSet;
import androidx.media3.exoplayer.dash.manifest.DashManifest;
import androidx.media3.exoplayer.dash.manifest.Period;
import androidx.media3.exoplayer.dash.manifest.Representation;
import androidx.media3.exoplayer.dash.manifest.UtcTimingElement;
import androidx.media3.exoplayer.drm.DrmSessionEventListener;
import androidx.media3.exoplayer.drm.DrmSessionManager;
import androidx.media3.exoplayer.source.BaseMediaSource;
import androidx.media3.exoplayer.source.CompositeSequenceableLoaderFactory;
import androidx.media3.exoplayer.source.LoadEventInfo;
import androidx.media3.exoplayer.source.MediaPeriod;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.MediaSourceEventListener;
import androidx.media3.exoplayer.source.chunk.ChunkSampleStreamFactory;
import androidx.media3.exoplayer.upstream.Allocator;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy;
import androidx.media3.exoplayer.upstream.Loader;
import androidx.media3.exoplayer.upstream.LoaderErrorThrower;
import androidx.media3.exoplayer.upstream.ParsingLoadable;
import androidx.media3.exoplayer.util.SntpClient;
import com.google.common.base.Charsets;
import com.google.common.math.LongMath;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.RoundingMode;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o.C4693bjN;
import o.InterfaceC4682bjC;

/* renamed from: o.bjN  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4693bjN extends BaseMediaSource {
    private final MediaItem A;
    private final C4691bjL B;
    private final SparseArray<DashMediaPeriod> C;
    private TransferListener D;
    private final Runnable E;
    private final boolean F;
    private int G;
    private final PlayerEmsgHandler.PlayerEmsgCallback H;
    private final Runnable I;
    private final ChunkSampleStreamFactory b;
    private final C4753bkr c;
    private final DashChunkSource.Factory d;
    private final CmcdConfiguration e;
    private DataSource f;
    private final CompositeSequenceableLoaderFactory g;
    private long h;
    private final DrmSessionManager i;
    private long j;
    private MediaItem.LiveConfiguration k;
    private final LoadErrorHandlingPolicy l;
    private Handler m;

    /* renamed from: o  reason: collision with root package name */
    private int f13609o;
    private C4726bju p;
    private final MediaSourceEventListener.EventDispatcher q;
    private final DataSource.Factory r;
    private Loader s;
    private final d t;
    private IOException u;
    private boolean v;
    private final LoaderErrorThrower w;
    private long x;
    private long y;
    private final InterfaceC4682bjC z;
    private final long n = 30000;
    private final BaseUrlExclusionList a = new BaseUrlExclusionList();

    void d(long j2) {
        long j3 = this.h;
        if (j3 == -9223372036854775807L || j3 < j2) {
            this.h = j2;
        }
    }

    void e(IOException iOException) {
        this.u = iOException;
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public MediaItem getMediaItem() {
        return this.A;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4693bjN(MediaItem mediaItem, C4726bju c4726bju, DataSource.Factory factory, DashChunkSource.Factory factory2, CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory, DrmSessionManager drmSessionManager, LoadErrorHandlingPolicy loadErrorHandlingPolicy, InterfaceC4682bjC interfaceC4682bjC, ChunkSampleStreamFactory chunkSampleStreamFactory, C4753bkr c4753bkr, C4691bjL c4691bjL) {
        this.z = interfaceC4682bjC;
        this.b = chunkSampleStreamFactory;
        this.c = c4753bkr;
        this.B = c4691bjL;
        this.A = mediaItem;
        this.k = mediaItem.liveConfiguration;
        this.p = c4726bju;
        this.r = factory;
        this.d = factory2;
        this.i = drmSessionManager;
        this.l = loadErrorHandlingPolicy;
        this.g = compositeSequenceableLoaderFactory;
        boolean z = c4726bju != null;
        this.F = z;
        this.q = createEventDispatcher(null);
        this.C = new SparseArray<>();
        this.H = new e();
        this.h = -9223372036854775807L;
        this.j = -9223372036854775807L;
        this.e = null;
        if (z) {
            Assertions.checkState(true ^ c4726bju.dynamic);
            this.t = null;
            this.E = null;
            this.I = null;
            this.w = new LoaderErrorThrower.Placeholder();
            return;
        }
        this.t = new d();
        this.w = new c();
        this.E = new Runnable() { // from class: o.bjK
            @Override // java.lang.Runnable
            public final void run() {
                C4693bjN.this.b();
            }
        };
        this.I = new Runnable() { // from class: o.bjP
            @Override // java.lang.Runnable
            public final void run() {
                C4693bjN.this.c();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        a(false);
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource
    public void prepareSourceInternal(TransferListener transferListener) {
        this.D = transferListener;
        this.i.prepare();
        this.i.setPlayer(Looper.myLooper(), getPlayerId());
        if (this.F) {
            a(false);
            return;
        }
        this.f = this.r.createDataSource();
        this.m = Util.createHandlerForCurrentLooper();
        b();
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public void maybeThrowSourceInfoRefreshError() {
        this.w.maybeThrowError();
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public MediaPeriod createPeriod(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j2) {
        int intValue = ((Integer) mediaPeriodId.periodUid).intValue() - this.f13609o;
        MediaSourceEventListener.EventDispatcher createEventDispatcher = createEventDispatcher(mediaPeriodId, this.p.getPeriod(intValue).startMs);
        DrmSessionEventListener.EventDispatcher createDrmEventDispatcher = createDrmEventDispatcher(mediaPeriodId);
        DashMediaPeriod dashMediaPeriod = new DashMediaPeriod(intValue + this.f13609o, this.p, this.a, intValue, this.d, this.D, this.e, this.i, createDrmEventDispatcher, this.l, createEventDispatcher, this.j, this.w, allocator, this.g, this.H, getPlayerId(), null);
        dashMediaPeriod.setSampleStreamFactory(this.b);
        this.C.put(dashMediaPeriod.id, dashMediaPeriod);
        return dashMediaPeriod;
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public void releasePeriod(MediaPeriod mediaPeriod) {
        DashMediaPeriod dashMediaPeriod = (DashMediaPeriod) mediaPeriod;
        dashMediaPeriod.release();
        this.C.remove(dashMediaPeriod.id);
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource
    public void releaseSourceInternal() {
        this.v = false;
        this.f = null;
        Loader loader = this.s;
        if (loader != null) {
            loader.release();
            this.s = null;
        }
        this.y = 0L;
        this.x = 0L;
        this.p = this.F ? this.p : null;
        this.u = null;
        Handler handler = this.m;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.m = null;
        }
        this.j = -9223372036854775807L;
        this.G = 0;
        this.h = -9223372036854775807L;
        this.f13609o = 0;
        this.C.clear();
        this.a.reset();
        this.i.release();
    }

    void d() {
        this.m.removeCallbacks(this.I);
        b();
    }

    void b(C4726bju c4726bju) {
        C4726bju c4726bju2 = this.p;
        int periodCount = c4726bju2 == null ? 0 : c4726bju2.getPeriodCount();
        long j2 = c4726bju.getPeriod(0).startMs;
        int i = 0;
        while (i < periodCount && this.p.getPeriod(i).startMs < j2) {
            i++;
        }
        if (c4726bju.dynamic) {
            if (periodCount - i > c4726bju.getPeriodCount()) {
                C1044Mm.j("NetflixMediaSource", "Loaded out of sync manifest");
            } else {
                long j3 = this.h;
                if (j3 == -9223372036854775807L || c4726bju.publishTimeMs * 1000 > j3) {
                    this.G = 0;
                } else {
                    C1044Mm.j("NetflixMediaSource", "Loaded stale dynamic manifest: " + c4726bju.publishTimeMs + ", " + this.h);
                }
            }
            int i2 = this.G;
            this.G = i2 + 1;
            if (i2 < this.l.getMinimumLoadableRetryCount(4)) {
                b(e());
                return;
            } else {
                this.u = new DashManifestStaleException();
                return;
            }
        }
        this.p = c4726bju;
        this.v = c4726bju.dynamic & this.v;
        this.x = SystemClock.elapsedRealtime();
        if (periodCount == 0) {
            C4726bju c4726bju3 = this.p;
            if (c4726bju3.dynamic || c4726bju3.a(this.c.d())) {
                UtcTimingElement utcTimingElement = this.p.utcTiming;
                if (utcTimingElement != null) {
                    b(utcTimingElement);
                    return;
                } else {
                    a();
                    return;
                }
            }
            a(true);
            return;
        }
        this.f13609o += i;
        a(true);
    }

    void e(ParsingLoadable<Long> parsingLoadable, long j2, long j3) {
        LoadEventInfo loadEventInfo = new LoadEventInfo(parsingLoadable.loadTaskId, parsingLoadable.dataSpec, parsingLoadable.getUri(), parsingLoadable.getResponseHeaders(), j2, j3, parsingLoadable.bytesLoaded());
        this.l.onLoadTaskConcluded(parsingLoadable.loadTaskId);
        this.q.loadCompleted(loadEventInfo, parsingLoadable.type);
        a(parsingLoadable.getResult().longValue() - j2);
    }

    Loader.LoadErrorAction a(ParsingLoadable<Long> parsingLoadable, long j2, long j3, IOException iOException) {
        this.q.loadError(new LoadEventInfo(parsingLoadable.loadTaskId, parsingLoadable.dataSpec, parsingLoadable.getUri(), parsingLoadable.getResponseHeaders(), j2, j3, parsingLoadable.bytesLoaded()), parsingLoadable.type, iOException, true);
        this.l.onLoadTaskConcluded(parsingLoadable.loadTaskId);
        c(iOException);
        return Loader.DONT_RETRY;
    }

    void a(ParsingLoadable<?> parsingLoadable, long j2, long j3) {
        LoadEventInfo loadEventInfo = new LoadEventInfo(parsingLoadable.loadTaskId, parsingLoadable.dataSpec, parsingLoadable.getUri(), parsingLoadable.getResponseHeaders(), j2, j3, parsingLoadable.bytesLoaded());
        this.l.onLoadTaskConcluded(parsingLoadable.loadTaskId);
        this.q.loadCanceled(loadEventInfo, parsingLoadable.type);
    }

    private void b(UtcTimingElement utcTimingElement) {
        String str = utcTimingElement.schemeIdUri;
        if (Util.areEqual(str, "urn:mpeg:dash:utc:direct:2014") || Util.areEqual(str, "urn:mpeg:dash:utc:direct:2012")) {
            a(utcTimingElement);
        } else if (Util.areEqual(str, "urn:mpeg:dash:utc:http-iso:2014") || Util.areEqual(str, "urn:mpeg:dash:utc:http-iso:2012")) {
            a(utcTimingElement, new a());
        } else if (Util.areEqual(str, "urn:mpeg:dash:utc:http-xsdate:2014") || Util.areEqual(str, "urn:mpeg:dash:utc:http-xsdate:2012")) {
            a(utcTimingElement, new g());
        } else if (Util.areEqual(str, "urn:mpeg:dash:utc:ntp:2014") || Util.areEqual(str, "urn:mpeg:dash:utc:ntp:2012")) {
            a();
        } else {
            c(new IOException("Unsupported UTC timing scheme"));
        }
    }

    private void a(UtcTimingElement utcTimingElement) {
        try {
            a(Util.parseXsDateTime(utcTimingElement.value) - this.x);
        } catch (ParserException e2) {
            c(e2);
        }
    }

    private void a(UtcTimingElement utcTimingElement, ParsingLoadable.Parser<Long> parser) {
        a(new ParsingLoadable(this.f, Uri.parse(utcTimingElement.value), 5, parser), new j(), 1);
    }

    private void a() {
        if (this.s == null) {
            this.s = new Loader("DashMediaSource");
        }
        SntpClient.initialize(this.s, new SntpClient.InitializationCallback() { // from class: o.bjN.3
            @Override // androidx.media3.exoplayer.util.SntpClient.InitializationCallback
            public void onInitialized() {
                C4693bjN.this.a(SntpClient.getElapsedRealtimeOffsetMs());
            }

            @Override // androidx.media3.exoplayer.util.SntpClient.InitializationCallback
            public void onInitializationFailed(IOException iOException) {
                C4693bjN.this.c(iOException);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(long j2) {
        this.j = j2;
        a(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(IOException iOException) {
        C1044Mm.e("NetflixMediaSource", "Failed to resolve time offset.", iOException);
        if (this.c.d().ar().c()) {
            new C4702bjW(this.p, this.f, this.s).c(new InterfaceC4747bki() { // from class: o.bjN.1
                @Override // o.InterfaceC4747bki
                public void d(long j2) {
                    long elapsedRealtime = j2 - SystemClock.elapsedRealtime();
                    C1044Mm.e("NetflixMediaSource", "Synced server time " + elapsedRealtime);
                    C4693bjN.this.a(elapsedRealtime);
                }

                @Override // o.InterfaceC4747bki
                public void c(IOException iOException2) {
                    C1044Mm.e("NetflixMediaSource", "Failed to resolve OC time offset.", iOException2);
                    C4693bjN.this.e(iOException2);
                }
            });
        } else {
            a(true);
        }
    }

    private void a(boolean z) {
        boolean z2;
        long j2;
        long j3;
        Period period;
        for (int i = 0; i < this.C.size(); i++) {
            int keyAt = this.C.keyAt(i);
            if (keyAt >= this.f13609o) {
                this.C.valueAt(i).updateManifest(this.p, keyAt - this.f13609o);
            }
        }
        Period period2 = this.p.getPeriod(0);
        int periodCount = this.p.getPeriodCount() - 1;
        Period period3 = this.p.getPeriod(periodCount);
        long periodDurationUs = this.p.getPeriodDurationUs(periodCount);
        long msToUs = Util.msToUs(Util.getNowUnixTimeMs(this.j));
        long c2 = c(period2, this.p.getPeriodDurationUs(0), msToUs);
        long b2 = b(period3, periodDurationUs, msToUs);
        boolean z3 = this.p.dynamic && !c(period3);
        if (z3) {
            long j4 = this.p.timeShiftBufferDepthMs;
            if (j4 != -9223372036854775807L) {
                c2 = Math.max(c2, b2 - Util.msToUs(j4));
            }
        }
        long j5 = b2 - c2;
        C4726bju c4726bju = this.p;
        if (c4726bju.dynamic || c4726bju.d != -9223372036854775807L) {
            Assertions.checkState(c4726bju.availabilityStartTimeMs != -9223372036854775807L);
            long msToUs2 = (msToUs - Util.msToUs(this.p.availabilityStartTimeMs)) - c2;
            d(msToUs2, j5);
            long j6 = this.p.availabilityStartTimeMs;
            long usToMs = Util.usToMs(c2);
            long msToUs3 = msToUs2 - Util.msToUs(this.k.targetOffsetMs);
            z2 = z3;
            long min = Math.min(5000000L, j5 / 2);
            if (msToUs3 < min) {
                msToUs3 = min;
            }
            C4726bju c4726bju2 = this.p;
            if (c4726bju2.d != -9223372036854775807L) {
                msToUs3 = 0;
            }
            if (c4726bju2.a(this.c.d())) {
                this.B.b(this.k);
            }
            j2 = j6 + usToMs;
            j3 = msToUs3;
            period = period2;
        } else {
            z2 = z3;
            j2 = -9223372036854775807L;
            period = period2;
            j3 = 0;
        }
        long msToUs4 = Util.msToUs(period.startMs);
        C4726bju c4726bju3 = this.p;
        refreshSourceInfo(new b(c4726bju3.availabilityStartTimeMs, j2, this.j, this.f13609o, c2 - msToUs4, j5, j3, c4726bju3, this.A, c4726bju3.dynamic ? this.k : null));
        if (this.F) {
            return;
        }
        this.m.removeCallbacks(this.I);
        if (z2 || this.p.a(this.c.d())) {
            this.m.postDelayed(this.I, c(this.p, Util.getNowUnixTimeMs(this.j)));
        }
        if (this.v) {
            b();
        } else if (z) {
            C4726bju c4726bju4 = this.p;
            if (c4726bju4.dynamic) {
                long j7 = c4726bju4.minUpdatePeriodMs;
                if (j7 != -9223372036854775807L) {
                    if (j7 == 0) {
                        j7 = 5000;
                    }
                    b(Math.max(0L, (this.y + j7) - SystemClock.elapsedRealtime()));
                }
            }
        }
    }

    private void d(long j2, long j3) {
        MediaItem.LiveConfiguration I = this.c.d().ar().I();
        long j4 = I.maxOffsetMs;
        long j5 = I.minOffsetMs;
        long j6 = I.targetOffsetMs;
        if (j6 < j5) {
            j6 = j5;
        }
        if (j6 > j4) {
            j6 = Util.constrainValue(Util.usToMs(j2 - Math.min(5000000L, j3 / 2)), j5, j4);
        }
        float f = I.minPlaybackSpeed;
        if (f == -3.4028235E38f) {
            f = -3.4028235E38f;
        }
        float f2 = I.maxPlaybackSpeed;
        if (f2 == -3.4028235E38f) {
            f2 = -3.4028235E38f;
        }
        if (f == -3.4028235E38f && f2 == -3.4028235E38f) {
            f = 1.0f;
            f2 = 1.0f;
        }
        this.k = new MediaItem.LiveConfiguration.Builder().setTargetOffsetMs(j6).setMinOffsetMs(j5).setMaxOffsetMs(j4).setMinPlaybackSpeed(f).setMaxPlaybackSpeed(f2).build();
    }

    private void b(long j2) {
        this.m.postDelayed(this.E, j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        this.m.removeCallbacks(this.E);
        this.v = false;
        c(this.t);
    }

    private long e() {
        return Math.min((this.G - 1) * 1000, 5000);
    }

    private void c(InterfaceC4682bjC.e eVar) {
        this.y = SystemClock.elapsedRealtime();
        this.z.e(((C4680bjA) this.A.localConfiguration.tag).b(), eVar);
    }

    private <T> void a(ParsingLoadable<T> parsingLoadable, Loader.Callback<ParsingLoadable<T>> callback, int i) {
        if (this.s == null) {
            this.s = new Loader("DashMediaSource");
        }
        this.q.loadStarted(new LoadEventInfo(parsingLoadable.loadTaskId, parsingLoadable.dataSpec, this.s.startLoading(parsingLoadable, callback, i)), parsingLoadable.type);
    }

    private static long c(DashManifest dashManifest, long j2) {
        DashSegmentIndex index;
        int periodCount = dashManifest.getPeriodCount() - 1;
        Period period = dashManifest.getPeriod(periodCount);
        long msToUs = Util.msToUs(period.startMs);
        long periodDurationUs = dashManifest.getPeriodDurationUs(periodCount);
        long msToUs2 = Util.msToUs(j2);
        long msToUs3 = Util.msToUs(dashManifest.availabilityStartTimeMs);
        long msToUs4 = Util.msToUs(5000L);
        for (int i = 0; i < period.adaptationSets.size(); i++) {
            List<Representation> list = period.adaptationSets.get(i).representations;
            if (!list.isEmpty() && (index = list.get(0).getIndex()) != null) {
                long nextSegmentAvailableTimeUs = ((msToUs3 + msToUs) + index.getNextSegmentAvailableTimeUs(periodDurationUs, msToUs2)) - msToUs2;
                if (nextSegmentAvailableTimeUs < msToUs4 - 100000 || (nextSegmentAvailableTimeUs > msToUs4 && nextSegmentAvailableTimeUs < msToUs4 + 100000)) {
                    msToUs4 = nextSegmentAvailableTimeUs;
                }
            }
        }
        return LongMath.divide(msToUs4, 1000L, RoundingMode.CEILING);
    }

    private static long c(Period period, long j2, long j3) {
        long msToUs = Util.msToUs(period.startMs);
        boolean e2 = e(period);
        long j4 = msToUs;
        for (int i = 0; i < period.adaptationSets.size(); i++) {
            AdaptationSet adaptationSet = period.adaptationSets.get(i);
            List<Representation> list = adaptationSet.representations;
            if ((!e2 || adaptationSet.type != 3) && !list.isEmpty()) {
                DashSegmentIndex index = list.get(0).getIndex();
                if (index == null || index.getAvailableSegmentCount(j2, j3) == 0) {
                    return msToUs;
                }
                j4 = Math.max(j4, index.getTimeUs(index.getFirstAvailableSegmentNum(j2, j3)) + msToUs);
            }
        }
        return j4;
    }

    private static long b(Period period, long j2, long j3) {
        long msToUs = Util.msToUs(period.startMs);
        boolean e2 = e(period);
        long j4 = Long.MAX_VALUE;
        for (int i = 0; i < period.adaptationSets.size(); i++) {
            AdaptationSet adaptationSet = period.adaptationSets.get(i);
            List<Representation> list = adaptationSet.representations;
            if ((!e2 || adaptationSet.type != 3) && !list.isEmpty()) {
                DashSegmentIndex index = list.get(0).getIndex();
                if (index == null) {
                    return msToUs + j2;
                }
                long availableSegmentCount = index.getAvailableSegmentCount(j2, j3);
                if (availableSegmentCount == 0) {
                    return msToUs;
                }
                long firstAvailableSegmentNum = (index.getFirstAvailableSegmentNum(j2, j3) + availableSegmentCount) - 1;
                j4 = Math.min(j4, index.getDurationUs(firstAvailableSegmentNum, j2) + index.getTimeUs(firstAvailableSegmentNum) + msToUs);
            }
        }
        return j4;
    }

    private static boolean c(Period period) {
        for (int i = 0; i < period.adaptationSets.size(); i++) {
            DashSegmentIndex index = period.adaptationSets.get(i).representations.get(0).getIndex();
            if (index == null || index.isExplicit()) {
                return true;
            }
        }
        return false;
    }

    private static boolean e(Period period) {
        for (int i = 0; i < period.adaptationSets.size(); i++) {
            int i2 = period.adaptationSets.get(i).type;
            if (i2 == 1 || i2 == 2) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.bjN$b */
    /* loaded from: classes3.dex */
    public static final class b extends Timeline {
        private final C4726bju a;
        private final int b;
        private final MediaItem c;
        private final long d;
        private final MediaItem.LiveConfiguration e;
        private final long f;
        private final long g;
        private final long h;
        private final long i;
        private final long j;

        @Override // androidx.media3.common.Timeline
        public int getWindowCount() {
            return 1;
        }

        public b(long j, long j2, long j3, int i, long j4, long j5, long j6, C4726bju c4726bju, MediaItem mediaItem, MediaItem.LiveConfiguration liveConfiguration) {
            Assertions.checkState(c4726bju.dynamic == (liveConfiguration != null));
            this.h = j;
            this.i = j2;
            this.d = j3;
            this.b = i;
            this.g = j4;
            this.f = j5;
            this.j = j6;
            this.a = c4726bju;
            this.c = mediaItem;
            this.e = liveConfiguration;
        }

        @Override // androidx.media3.common.Timeline
        public int getPeriodCount() {
            return this.a.getPeriodCount();
        }

        @Override // androidx.media3.common.Timeline
        public Timeline.Period getPeriod(int i, Timeline.Period period, boolean z) {
            Assertions.checkIndex(i, 0, getPeriodCount());
            return period.set(z ? this.a.getPeriod(i).id : null, z ? Integer.valueOf(this.b + i) : null, 0, this.a.getPeriodDurationUs(i), Util.msToUs(this.a.getPeriod(i).startMs - this.a.getPeriod(0).startMs) - this.g);
        }

        @Override // androidx.media3.common.Timeline
        public Timeline.Window getWindow(int i, Timeline.Window window, long j) {
            Assertions.checkIndex(i, 0, 1);
            long e = e(j);
            Object obj = Timeline.Window.SINGLE_WINDOW_UID;
            MediaItem mediaItem = this.c;
            C4726bju c4726bju = this.a;
            return window.set(obj, mediaItem, c4726bju, this.h, this.i, this.d, true, a(c4726bju), this.e, e, this.f, 0, getPeriodCount() - 1, this.g);
        }

        @Override // androidx.media3.common.Timeline
        public int getIndexOfPeriod(Object obj) {
            int intValue;
            if ((obj instanceof Integer) && (intValue = ((Integer) obj).intValue() - this.b) >= 0 && intValue < getPeriodCount()) {
                return intValue;
            }
            return -1;
        }

        private long e(long j) {
            DashSegmentIndex index;
            long j2 = this.j;
            if (a(this.a)) {
                if (j > 0) {
                    j2 += j;
                    if (j2 > this.f) {
                        return -9223372036854775807L;
                    }
                }
                long j3 = this.g + j2;
                long periodDurationUs = this.a.getPeriodDurationUs(0);
                int i = 0;
                while (i < this.a.getPeriodCount() - 1 && j3 >= periodDurationUs) {
                    j3 -= periodDurationUs;
                    i++;
                    periodDurationUs = this.a.getPeriodDurationUs(i);
                }
                Period period = this.a.getPeriod(i);
                int adaptationSetIndex = period.getAdaptationSetIndex(2);
                return (adaptationSetIndex == -1 || (index = period.adaptationSets.get(adaptationSetIndex).representations.get(0).getIndex()) == null || index.getSegmentCount(periodDurationUs) == 0) ? j2 : (j2 + index.getTimeUs(index.getSegmentNum(j3, periodDurationUs))) - j3;
            }
            return j2;
        }

        @Override // androidx.media3.common.Timeline
        public Object getUidOfPeriod(int i) {
            Assertions.checkIndex(i, 0, getPeriodCount());
            return Integer.valueOf(this.b + i);
        }

        private static boolean a(DashManifest dashManifest) {
            return dashManifest.dynamic && dashManifest.minUpdatePeriodMs != -9223372036854775807L && dashManifest.durationMs == -9223372036854775807L;
        }
    }

    /* renamed from: o.bjN$e */
    /* loaded from: classes3.dex */
    final class e implements PlayerEmsgHandler.PlayerEmsgCallback {
        private e() {
        }

        @Override // androidx.media3.exoplayer.dash.PlayerEmsgHandler.PlayerEmsgCallback
        public void onDashManifestRefreshRequested() {
            C4693bjN.this.d();
        }

        @Override // androidx.media3.exoplayer.dash.PlayerEmsgHandler.PlayerEmsgCallback
        public void onDashManifestPublishTimeExpired(long j) {
            C4693bjN.this.d(j);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.bjN$d */
    /* loaded from: classes3.dex */
    public final class d implements InterfaceC4682bjC.e {
        private d() {
        }

        @Override // o.InterfaceC4682bjC.e
        public void b(long j, final C4726bju c4726bju) {
            Handler handler = C4693bjN.this.m;
            if (handler != null) {
                handler.post(new Runnable() { // from class: o.bjT
                    @Override // java.lang.Runnable
                    public final void run() {
                        C4693bjN.d.this.a(c4726bju);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(C4726bju c4726bju) {
            C4693bjN.this.b(c4726bju);
        }

        @Override // o.InterfaceC4682bjC.e
        public void a(final long j, final IOException iOException) {
            Handler handler = C4693bjN.this.m;
            if (handler != null) {
                handler.post(new Runnable() { // from class: o.bjS
                    @Override // java.lang.Runnable
                    public final void run() {
                        C4693bjN.d.this.c(iOException, j);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c(IOException iOException, long j) {
            C4693bjN.this.e(iOException);
            C4693bjN.this.z.d(j, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.bjN$j */
    /* loaded from: classes3.dex */
    public final class j implements Loader.Callback<ParsingLoadable<Long>> {
        private j() {
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.Callback
        /* renamed from: e */
        public void onLoadCompleted(ParsingLoadable<Long> parsingLoadable, long j, long j2) {
            C4693bjN.this.e(parsingLoadable, j, j2);
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.Callback
        /* renamed from: b */
        public void onLoadCanceled(ParsingLoadable<Long> parsingLoadable, long j, long j2, boolean z) {
            C4693bjN.this.a(parsingLoadable, j, j2);
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.Callback
        /* renamed from: c */
        public Loader.LoadErrorAction onLoadError(ParsingLoadable<Long> parsingLoadable, long j, long j2, IOException iOException, int i) {
            return C4693bjN.this.a(parsingLoadable, j, j2, iOException);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.bjN$g */
    /* loaded from: classes3.dex */
    public static final class g implements ParsingLoadable.Parser<Long> {
        private g() {
        }

        @Override // androidx.media3.exoplayer.upstream.ParsingLoadable.Parser
        /* renamed from: e */
        public Long parse(Uri uri, InputStream inputStream) {
            return Long.valueOf(Util.parseXsDateTime(new BufferedReader(new InputStreamReader(inputStream)).readLine()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.bjN$a */
    /* loaded from: classes3.dex */
    public static final class a implements ParsingLoadable.Parser<Long> {
        private static final Pattern e = Pattern.compile("(.+?)(Z|((\\+|-|−)(\\d\\d)(:?(\\d\\d))?))");

        a() {
        }

        @Override // androidx.media3.exoplayer.upstream.ParsingLoadable.Parser
        /* renamed from: e */
        public Long parse(Uri uri, InputStream inputStream) {
            String readLine = new BufferedReader(new InputStreamReader(inputStream, Charsets.UTF_8)).readLine();
            try {
                Matcher matcher = e.matcher(readLine);
                if (!matcher.matches()) {
                    throw ParserException.createForMalformedManifest("Couldn't parse timestamp: " + readLine, null);
                }
                String group = matcher.group(1);
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
                simpleDateFormat.setTimeZone(C8543dpm.c("UTC"));
                long time = simpleDateFormat.parse(group).getTime();
                if (!"Z".equals(matcher.group(2))) {
                    long j = "+".equals(matcher.group(4)) ? 1L : -1L;
                    long parseLong = Long.parseLong(matcher.group(5));
                    String group2 = matcher.group(7);
                    time -= j * (((parseLong * 60) + (TextUtils.isEmpty(group2) ? 0L : Long.parseLong(group2))) * 60000);
                }
                return Long.valueOf(time);
            } catch (ParseException e2) {
                throw ParserException.createForMalformedManifest(null, e2);
            }
        }
    }

    /* renamed from: o.bjN$c */
    /* loaded from: classes3.dex */
    final class c implements LoaderErrorThrower {
        c() {
        }

        @Override // androidx.media3.exoplayer.upstream.LoaderErrorThrower
        public void maybeThrowError() {
            b();
        }

        private void b() {
            if (C4693bjN.this.u != null) {
                throw C4693bjN.this.u;
            }
        }
    }
}
