package o;

import android.os.SystemClock;
import androidx.media3.common.Player;
import androidx.media3.datasource.HttpDataSource;
import androidx.media3.exoplayer.source.MediaLoadData;
import androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy;
import com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.mediasource.LiveStreamMissingSegmentProbe;
import com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.netflixase.AseConfig;
import com.netflix.mediaclient.service.player.streamingplayback.playbackreporter.StopReason;
import com.netflix.model.leafs.originals.interactive.Prefetch;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: o.bjM  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4692bjM implements LoadErrorHandlingPolicy, Player.Listener {
    private static final LoadErrorHandlingPolicy.FallbackSelection a = null;
    public static final a b = new a(null);
    private static final LoadErrorHandlingPolicy.FallbackSelection c = new LoadErrorHandlingPolicy.FallbackSelection(2, 0);
    private final C4753bkr d;
    private final b e;
    private long f;
    private Player g;
    private long h;
    private final C4886boO i;

    private final boolean e(int i) {
        return i == 4;
    }

    @Override // androidx.media3.common.Player.Listener
    public void onEvents(Player player, Player.Events events) {
        C8632dsu.c((Object) player, "");
        C8632dsu.c((Object) events, "");
        this.g = player;
    }

    public C4692bjM(C4753bkr c4753bkr, InterfaceC4793bmb interfaceC4793bmb, C4886boO c4886boO) {
        C8632dsu.c((Object) c4753bkr, "");
        C8632dsu.c((Object) interfaceC4793bmb, "");
        C8632dsu.c((Object) c4886boO, "");
        this.d = c4753bkr;
        this.i = c4886boO;
        this.e = new b(interfaceC4793bmb);
        this.f = -9223372036854775807L;
    }

    @Override // androidx.media3.common.Player.Listener
    public void onPlaybackStateChanged(int i) {
        if (i != 2) {
            this.f = -9223372036854775807L;
        } else if (this.f == -9223372036854775807L) {
            this.f = SystemClock.elapsedRealtime();
        }
    }

    @Override // androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy
    public LoadErrorHandlingPolicy.FallbackSelection getFallbackSelectionFor(LoadErrorHandlingPolicy.FallbackOptions fallbackOptions, LoadErrorHandlingPolicy.LoadErrorInfo loadErrorInfo) {
        LoadErrorHandlingPolicy.FallbackSelection fallbackSelection;
        C8632dsu.c((Object) fallbackOptions, "");
        C8632dsu.c((Object) loadErrorInfo, "");
        AseConfig d = this.d.d();
        this.e.b(loadErrorInfo);
        int i = d.d().i();
        if (c(d, fallbackOptions, loadErrorInfo)) {
            fallbackSelection = new LoadErrorHandlingPolicy.FallbackSelection(2, d.ar().x());
        } else {
            fallbackSelection = loadErrorInfo.errorCount > i ? c : a;
        }
        int i2 = loadErrorInfo.mediaLoadData.trackType;
        b.getLogTag();
        return fallbackSelection;
    }

    private final boolean c(AseConfig aseConfig, LoadErrorHandlingPolicy.FallbackOptions fallbackOptions, LoadErrorHandlingPolicy.LoadErrorInfo loadErrorInfo) {
        HttpDataSource.InvalidResponseCodeException invalidResponseCodeException = (HttpDataSource.InvalidResponseCodeException) C9726vo.c(loadErrorInfo.exception, HttpDataSource.InvalidResponseCodeException.class);
        Integer valueOf = invalidResponseCodeException != null ? Integer.valueOf(invalidResponseCodeException.responseCode) : null;
        return fallbackOptions.isFallbackAvailable(2) && ((valueOf != null && valueOf.intValue() == 410) || (valueOf != null && valueOf.intValue() == 404 && aseConfig.ar().i() > 0 && loadErrorInfo.errorCount >= aseConfig.ar().i()));
    }

    @Override // androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy
    public long getRetryDelayMsFor(LoadErrorHandlingPolicy.LoadErrorInfo loadErrorInfo) {
        long d;
        C8632dsu.c((Object) loadErrorInfo, "");
        AseConfig d2 = this.d.d();
        AbstractC4756bkx d3 = d2.d();
        long j = -9223372036854775807L;
        if (e(loadErrorInfo.mediaLoadData.dataType)) {
            return -9223372036854775807L;
        }
        HttpDataSource.InvalidResponseCodeException invalidResponseCodeException = (HttpDataSource.InvalidResponseCodeException) C9726vo.c(loadErrorInfo.exception, HttpDataSource.InvalidResponseCodeException.class);
        if (invalidResponseCodeException == null || invalidResponseCodeException.responseCode != 420) {
            HttpDataSource.InvalidResponseCodeException invalidResponseCodeException2 = (HttpDataSource.InvalidResponseCodeException) C9726vo.c(loadErrorInfo.exception, HttpDataSource.InvalidResponseCodeException.class);
            if (invalidResponseCodeException2 == null || invalidResponseCodeException2.responseCode != 452) {
                int min = Math.min(d3.h(), d3.i());
                int e = this.e.e(loadErrorInfo);
                d = C8657dts.d(e * d2.d().b(), d3.d());
                HttpDataSource.InvalidResponseCodeException invalidResponseCodeException3 = (HttpDataSource.InvalidResponseCodeException) C9726vo.c(loadErrorInfo.exception, HttpDataSource.InvalidResponseCodeException.class);
                Integer valueOf = invalidResponseCodeException3 != null ? Integer.valueOf(invalidResponseCodeException3.responseCode) : null;
                if ((valueOf != null && valueOf.intValue() == 404) || (valueOf != null && valueOf.intValue() == 410)) {
                    b(d2, loadErrorInfo, e);
                }
                int j2 = d3.j();
                boolean z = true;
                boolean z2 = e >= j2 && e() && this.h == 0;
                if (e < min || !e(d2)) {
                    z = false;
                }
                if (!z2 && !z) {
                    j = d;
                }
                b.getLogTag();
                return j;
            }
            return -9223372036854775807L;
        }
        return -9223372036854775807L;
    }

    private final void b(AseConfig aseConfig, LoadErrorHandlingPolicy.LoadErrorInfo loadErrorInfo, int i) {
        int a2;
        Player player;
        AbstractC4735bkK ar = aseConfig.ar();
        long v = ar.v();
        if (i <= ar.w() || this.h >= SystemClock.elapsedRealtime() - v) {
            return;
        }
        C1045Mp c1045Mp = C4761blb.b$729240f0;
        try {
            Object[] objArr = {loadErrorInfo.loadEventInfo.responseHeaders};
            Object obj = C4755bkv.q.get(-93767631);
            if (obj == null) {
                obj = ((Class) C4755bkv.b((char) 0, 7, 1130)).getMethod("b", Map.class);
                C4755bkv.q.put(-93767631, obj);
            }
            if (((Long) ((Method) obj).invoke(c1045Mp, objArr)).longValue() <= 0 || (a2 = this.e.a(loadErrorInfo, v)) <= 0 || (player = this.g) == null || player.getPlaybackState() != 2) {
                return;
            }
            MediaLoadData mediaLoadData = loadErrorInfo.mediaLoadData;
            long j = mediaLoadData.mediaEndTimeMs - mediaLoadData.mediaStartTimeMs;
            final long j2 = (a2 * j) + (j / 2);
            C8187dfe.c(new Runnable() { // from class: o.bjO
                @Override // java.lang.Runnable
                public final void run() {
                    C4692bjM.e(C4692bjM.this, j2);
                }
            });
            this.h = SystemClock.elapsedRealtime();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(C4692bjM c4692bjM, long j) {
        long longValue;
        C4726bju c4726bju;
        C8632dsu.c((Object) c4692bjM, "");
        Player player = c4692bjM.g;
        if (player != null) {
            Object currentManifest = player.getCurrentManifest();
            Long k = (currentManifest == null || (c4726bju = (C4726bju) C9726vo.c(currentManifest, C4726bju.class)) == null) ? null : c4726bju.k();
            if (k == null) {
                longValue = 0;
            } else {
                C8632dsu.d(k);
                longValue = k.longValue();
            }
            long j2 = longValue;
            long currentPosition = player.getCurrentPosition() + j;
            c4692bjM.i.a(j2, StopReason.MISSING_SEGMENTS, currentPosition);
            player.seekTo(currentPosition);
        }
    }

    @Override // androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy
    public int getMinimumLoadableRetryCount(int i) {
        if (e(i)) {
            return 0;
        }
        return Prefetch.NANOSECONDS_PER_MILLISECOND;
    }

    private final boolean e(AseConfig aseConfig) {
        return this.f != -9223372036854775807L && SystemClock.elapsedRealtime() - this.f > ((long) aseConfig.d().g());
    }

    private final boolean e() {
        return this.f != -9223372036854775807L && SystemClock.elapsedRealtime() > this.f;
    }

    /* renamed from: o.bjM$a */
    /* loaded from: classes3.dex */
    public static final class a extends C1045Mp {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
            super("LoadErrorHandlingPolicy");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.bjM$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private final LiveStreamMissingSegmentProbe c;
        private final ConcurrentHashMap<Integer, c> d;

        public b(InterfaceC4793bmb interfaceC4793bmb) {
            C8632dsu.c((Object) interfaceC4793bmb, "");
            this.d = new ConcurrentHashMap<>();
            this.c = new LiveStreamMissingSegmentProbe(interfaceC4793bmb);
        }

        public final void b(LoadErrorHandlingPolicy.LoadErrorInfo loadErrorInfo) {
            C8632dsu.c((Object) loadErrorInfo, "");
            c(loadErrorInfo).e();
        }

        public final int e(LoadErrorHandlingPolicy.LoadErrorInfo loadErrorInfo) {
            int b;
            C8632dsu.c((Object) loadErrorInfo, "");
            c c = c(loadErrorInfo);
            b = C8657dts.b(c.a(), loadErrorInfo.errorCount);
            c.b(b);
            return c.a();
        }

        public final int a(LoadErrorHandlingPolicy.LoadErrorInfo loadErrorInfo, long j) {
            C8632dsu.c((Object) loadErrorInfo, "");
            c c = c(loadErrorInfo);
            LiveStreamMissingSegmentProbe.a b = c.b();
            if (b == null || b.a(j)) {
                C1045Mp c1045Mp = C4761blb.b$729240f0;
                try {
                    Object[] objArr = {loadErrorInfo.loadEventInfo.responseHeaders};
                    Object obj = C4755bkv.q.get(-93767631);
                    if (obj == null) {
                        obj = ((Class) C4755bkv.b((char) 0, 7, 1130)).getMethod("b", Map.class);
                        C4755bkv.q.put(-93767631, obj);
                    }
                    c.a(this.c.b(loadErrorInfo, ((Long) ((Method) obj).invoke(c1045Mp, objArr)).longValue()));
                    return 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
            return b.e();
        }

        private final c c(LoadErrorHandlingPolicy.LoadErrorInfo loadErrorInfo) {
            MediaLoadData mediaLoadData = loadErrorInfo.mediaLoadData;
            int i = mediaLoadData.trackType;
            long j = mediaLoadData.mediaStartTimeMs;
            c cVar = this.d.get(Integer.valueOf(i));
            if (cVar == null || cVar.d() != j) {
                c cVar2 = new c(j, 0, null, 6, null);
                this.d.put(Integer.valueOf(i), cVar2);
                return cVar2;
            }
            return cVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.bjM$c */
    /* loaded from: classes3.dex */
    public static final class c {
        private int a;
        private LiveStreamMissingSegmentProbe.a c;
        private final long d;

        public final int a() {
            return this.a;
        }

        public final void a(LiveStreamMissingSegmentProbe.a aVar) {
            this.c = aVar;
        }

        public final LiveStreamMissingSegmentProbe.a b() {
            return this.c;
        }

        public final void b(int i) {
            this.a = i;
        }

        public final long d() {
            return this.d;
        }

        public final void e() {
            this.a++;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return this.d == cVar.d && this.a == cVar.a && C8632dsu.c(this.c, cVar.c);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = Long.hashCode(this.d);
            int hashCode2 = Integer.hashCode(this.a);
            LiveStreamMissingSegmentProbe.a aVar = this.c;
            return (((hashCode * 31) + hashCode2) * 31) + (aVar == null ? 0 : aVar.hashCode());
        }

        public String toString() {
            long j = this.d;
            int i = this.a;
            LiveStreamMissingSegmentProbe.a aVar = this.c;
            return "MediaLoadDataHolder(mediaStartTimeMs=" + j + ", consecutiveErrors=" + i + ", missingSegmentCheckResult=" + aVar + ")";
        }

        public c(long j, int i, LiveStreamMissingSegmentProbe.a aVar) {
            this.d = j;
            this.a = i;
            this.c = aVar;
        }

        public /* synthetic */ c(long j, int i, LiveStreamMissingSegmentProbe.a aVar, int i2, C8627dsp c8627dsp) {
            this(j, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? null : aVar);
        }
    }
}
