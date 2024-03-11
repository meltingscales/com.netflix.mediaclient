package o;

import android.os.SystemClock;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.source.ClippingMediaSource;
import com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.netflixdatasource.NetflixDataSourceUtil;
import com.netflix.mediaclient.servicemgr.LiveEventState;
import java.util.Arrays;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: o.bhD  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4577bhD implements InterfaceC4740bkZ, InterfaceC4574bhA {
    public static final b c = new b(null);
    private final long a;
    private long b;
    private final C4753bkr d;
    private final ClippingMediaSource e;
    private final long f;
    private long g;
    private long h;
    private LiveEventState i;
    private C5086bsC j;
    private String k;
    private final ExoPlayer l;
    private long m;
    private String n;

    /* renamed from: o  reason: collision with root package name */
    private long f13596o;
    private final long p;
    private final CopyOnWriteArrayList<C4582bhI> q;
    private C5086bsC r;
    private final C4585bhL s;
    private final C4886boO t;
    private long u;
    private final InterfaceC4610bhk y;

    public final long c() {
        return this.u;
    }

    public C4577bhD(long j, long j2, long j3, long j4, long j5, InterfaceC4610bhk interfaceC4610bhk, ExoPlayer exoPlayer, C4886boO c4886boO, C4585bhL c4585bhL, C4753bkr c4753bkr, ClippingMediaSource clippingMediaSource) {
        C8632dsu.c((Object) interfaceC4610bhk, "");
        C8632dsu.c((Object) exoPlayer, "");
        C8632dsu.c((Object) c4886boO, "");
        C8632dsu.c((Object) c4585bhL, "");
        C8632dsu.c((Object) c4753bkr, "");
        C8632dsu.c((Object) clippingMediaSource, "");
        this.p = j;
        this.a = j2;
        this.f = j3;
        this.y = interfaceC4610bhk;
        this.l = exoPlayer;
        this.t = c4886boO;
        this.s = c4585bhL;
        this.d = c4753bkr;
        this.e = clippingMediaSource;
        this.q = new CopyOnWriteArrayList<>();
        this.m = j4;
        this.f13596o = j5;
        this.u = -9223372036854775807L;
        this.g = -9223372036854775807L;
        LiveEventState liveEventState = LiveEventState.EVENT_WAITING_ROOM;
        this.i = liveEventState;
        this.j = new C5086bsC(liveEventState, true);
        this.b = -9223372036854775807L;
        b();
        e();
    }

    @Override // o.InterfaceC4740bkZ
    public void e(int i, C4760bla c4760bla) {
        C8632dsu.c((Object) c4760bla, "");
        d(c4760bla);
        d(i, c4760bla);
        b(c4760bla);
        b();
        e();
        d(this, false, 1, null);
    }

    public final void d(C4760bla c4760bla) {
        C8632dsu.c((Object) c4760bla, "");
        if (c4760bla.c() != -9223372036854775807L) {
            long c2 = c4760bla.c() - SystemClock.elapsedRealtime();
            if (c2 != this.b) {
                this.b = c2;
                this.t.b(this.p, c2);
            }
        }
    }

    public final void d(int i, C4760bla c4760bla) {
        C8632dsu.c((Object) c4760bla, "");
        String b2 = c4760bla.b();
        if (b2 == null) {
            b2 = this.k;
        }
        String e = c4760bla.e();
        if (e == null) {
            e = this.n;
        }
        boolean z = (C8632dsu.c((Object) b2, (Object) this.k) && C8632dsu.c((Object) e, (Object) this.n)) ? false : true;
        if (i == 2 && z) {
            this.t.e(this.p, this.k, b2, this.n, e);
            this.k = b2;
            this.n = e;
        }
    }

    public final void b(C4582bhI c4582bhI) {
        C8632dsu.c((Object) c4582bhI, "");
        long j = this.u;
        if (j != -9223372036854775807L) {
            c4582bhI.a(j);
        }
        this.q.add(c4582bhI);
    }

    private final void b(C4760bla c4760bla) {
        long d = NetflixDataSourceUtil.d(c4760bla.a(), this.f);
        long d2 = NetflixDataSourceUtil.d(c4760bla.d(), this.f);
        long j = this.m;
        if (d > j || j == -9223372036854775807L) {
            this.m = d;
        }
        if (d2 > this.f13596o || this.m == -9223372036854775807L) {
            this.f13596o = d2;
        }
    }

    public static /* synthetic */ void d(C4577bhD c4577bhD, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateStreamingListener");
        }
        if ((i & 1) != 0) {
            z = false;
        }
        c4577bhD.b(z);
    }

    public void b(boolean z) {
        if (!C8632dsu.c(this.r, this.j) || z) {
            this.y.b(this.j);
            this.r = this.j;
        }
    }

    public void c(long j) {
        d(j);
        this.y.c(this.h);
        d(this, false, 1, null);
    }

    public final void a(int i) {
        C1044Mm.e("LiveSlateMarkerHandler", "onPlayerStateChanged: " + i);
        b(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void d(long r11) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C4577bhD.d(long):void");
    }

    private final void b() {
        LiveEventState liveEventState;
        int i = (this.m > (-9223372036854775807L) ? 1 : (this.m == (-9223372036854775807L) ? 0 : -1));
        if (i != 0 && this.f13596o != -9223372036854775807L) {
            liveEventState = LiveEventState.EVENT_THANK_YOU;
        } else if (i != 0) {
            liveEventState = LiveEventState.EVENT_LIVE;
        } else {
            liveEventState = LiveEventState.EVENT_WAITING_ROOM;
        }
        if (liveEventState != this.i) {
            this.t.b(this.p, liveEventState);
            this.i = liveEventState;
        }
    }

    private final void e() {
        C5086bsC c5086bsC;
        long currentPosition = this.l.getCurrentPosition();
        boolean d = this.s.d();
        LiveEventState a = this.j.a();
        LiveEventState liveEventState = LiveEventState.EVENT_DVR_MODE;
        if (a != liveEventState) {
            long j = this.g;
            if (j == -9223372036854775807L) {
                long j2 = this.u;
                if (j2 != -9223372036854775807L) {
                    if (currentPosition >= j2 || this.j.a() == LiveEventState.EVENT_LIVE) {
                        c5086bsC = new C5086bsC(LiveEventState.EVENT_LIVE, d);
                    } else {
                        c5086bsC = new C5086bsC(LiveEventState.EVENT_WAITING_ROOM, true);
                    }
                } else {
                    c5086bsC = new C5086bsC(LiveEventState.EVENT_WAITING_ROOM, true);
                }
            } else if (currentPosition >= j) {
                c5086bsC = new C5086bsC(LiveEventState.EVENT_THANK_YOU, d);
            } else if (d) {
                c5086bsC = new C5086bsC(LiveEventState.EVENT_LIVE, true);
            } else {
                c5086bsC = new C5086bsC(liveEventState, false);
            }
            this.j = c5086bsC;
        }
        C5086bsC c5086bsC2 = this.j;
        C1044Mm.e("LiveSlateMarkerHandler", "LiveClientState: " + c5086bsC2);
    }

    public final boolean d() {
        return this.u == -9223372036854775807L || this.l.getCurrentPosition() < this.u;
    }

    @Override // o.InterfaceC4574bhA
    public void a() {
        e();
        b(true);
    }

    private final String b(long j) {
        if (j == -9223372036854775807L) {
            return "-";
        }
        long j2 = j / 1000;
        dsE dse = dsE.b;
        long j3 = 3600;
        long j4 = 60;
        String format = String.format("%02d:%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j2 / j3), Long.valueOf((j2 % j3) / j4), Long.valueOf(j2 % j4)}, 3));
        C8632dsu.a(format, "");
        return format;
    }

    /* renamed from: o.bhD$b */
    /* loaded from: classes3.dex */
    public static final class b {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
        }
    }
}
