package o;

import androidx.media3.common.Timeline;
import androidx.media3.exoplayer.LoadControl;
import androidx.media3.exoplayer.Renderer;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.TrackGroupArray;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import androidx.media3.exoplayer.upstream.Allocator;
import androidx.media3.exoplayer.upstream.DefaultAllocator;
import com.netflix.ale.AleCryptoBouncyCastle;
import com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.aseinterface.IAsePlayerState;
import com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.netflixase.AseConfig;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.List;
import java.util.concurrent.TimeUnit;
import o.InterfaceC4657bie;
import o.InterfaceC4660bih;

/* renamed from: o.bkW  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4738bkW implements LoadControl, InterfaceC4657bie.b {
    private static final long a = TimeUnit.SECONDS.toMicros(10);
    private IAsePlayerState b;
    private final InterfaceC4734bkH c;
    private final C4736bkM d;
    private long g;
    private Object h$7487fb8b;
    private final C4753bkr i;
    private boolean j;
    private int k;
    private int l;
    private final int m;
    private boolean n;

    /* renamed from: o  reason: collision with root package name */
    private final InterfaceC4663bik f13616o;
    private long p;
    private long q;
    private int r;
    private int s;
    private long t;
    private boolean w;
    private InterfaceC4657bie x;
    private int y = 0;
    private long v = 0;
    private final DefaultAllocator e = new DefaultAllocator(true, AleCryptoBouncyCastle.MAX_RANDOM_BYTES);
    private long f = 0;

    @Override // o.InterfaceC4657bie.b
    public void a(int i) {
    }

    public int b() {
        return this.k;
    }

    public int d() {
        return this.l;
    }

    public int e() {
        return this.s;
    }

    @Override // androidx.media3.exoplayer.LoadControl
    public Allocator getAllocator() {
        return this.e;
    }

    public int j() {
        return this.r;
    }

    @Override // androidx.media3.exoplayer.LoadControl
    public boolean retainBackBufferFromKeyframe() {
        return true;
    }

    public C4738bkW(InterfaceC4734bkH interfaceC4734bkH, C4736bkM c4736bkM, IAsePlayerState iAsePlayerState, InterfaceC4663bik interfaceC4663bik, InterfaceC4657bie interfaceC4657bie, C4753bkr c4753bkr) {
        this.c = interfaceC4734bkH;
        this.d = c4736bkM;
        this.b = iAsePlayerState;
        this.f13616o = interfaceC4663bik;
        this.i = c4753bkr;
        this.m = interfaceC4657bie.i();
        this.x = interfaceC4657bie;
        interfaceC4657bie.c(this);
        this.w = false;
        b(c4753bkr.d());
        this.g = TimeUnit.HOURS.toMicros(5L);
    }

    @Override // o.InterfaceC4657bie.b
    public void d(C4598bhY c4598bhY) {
        b(this.i.d());
    }

    private void b(AseConfig aseConfig) {
        boolean z = false;
        if (InterfaceC4657bie.e(this.x)) {
            this.s = aseConfig.aK();
            this.k = aseConfig.ax();
            this.r = aseConfig.aR();
            this.l = aseConfig.r();
            if (aseConfig.cd() && this.x.o()) {
                z = true;
            }
            this.w = z;
            return;
        }
        this.s = aseConfig.aJ();
        this.k = aseConfig.az();
        this.r = aseConfig.aT();
        this.l = aseConfig.t();
        this.w = false;
    }

    public int a() {
        return this.m - this.e.getTotalBytesAllocated();
    }

    public int c() {
        IAsePlayerState.a e = this.b.e(1);
        if (e != null) {
            return e.i();
        }
        return 64000;
    }

    @Override // androidx.media3.exoplayer.LoadControl
    public void onPrepared() {
        c(false);
    }

    @Override // androidx.media3.exoplayer.LoadControl
    public void onTracksSelected(Timeline timeline, MediaSource.MediaPeriodId mediaPeriodId, Renderer[] rendererArr, TrackGroupArray trackGroupArray, ExoTrackSelection[] exoTrackSelectionArr) {
        Timeline.Window window = new Timeline.Window();
        Timeline.Period period = new Timeline.Period();
        timeline.getPeriodByUid(mediaPeriodId.periodUid, period);
        timeline.getWindow(period.windowIndex, window);
        Object obj = window.manifest;
        if (obj instanceof C4726bju) {
            C4726bju c4726bju = (C4726bju) obj;
            this.n = c4726bju.l();
            this.q = c4726bju.j().longValue();
        }
        b(this.i.d());
    }

    @Override // androidx.media3.exoplayer.LoadControl
    public void onStopped() {
        c(true);
    }

    @Override // androidx.media3.exoplayer.LoadControl
    public void onReleased() {
        C1044Mm.a("ASE-LoadControl", "onReleased");
        c(true);
        this.x.b(this);
    }

    @Override // androidx.media3.exoplayer.LoadControl
    public long getBackBufferDurationUs() {
        AseConfig d = this.i.d();
        return !d.I() ? this.w ? d.bC() : a : this.g;
    }

    public long i() {
        AseConfig d = this.i.d();
        if (!d.I() && this.w) {
            return d.bC();
        }
        return a;
    }

    @Override // androidx.media3.exoplayer.LoadControl
    public boolean shouldStartPlayback(Timeline timeline, MediaSource.MediaPeriodId mediaPeriodId, long j, float f, boolean z, long j2) {
        bkE$b e;
        InterfaceC4660bih.b a2;
        AseConfig d = this.i.d();
        if (this.n) {
            C1044Mm.e("ASE-LoadControl", "shouldStartPlayback: in offline mode");
            e = new bkE$b(true, 1.0d, 2500.0d, 0L, "offline");
        } else {
            if (j2 != -9223372036854775807L) {
                long j3 = j2 / 2;
                if (j >= j3) {
                    C1044Mm.e("ASE-LoadControl", "shouldStartPlayback: in live mode");
                    e = new bkE$b(true, 1.0d, androidx.media3.common.C.usToMs(j3), this.c.getBitrateEstimate() / 1000, "live");
                }
            }
            e = e(d, j, f, z, d.v());
        }
        if (e.a) {
            this.f = 0L;
            InterfaceC4660bih.b a3 = this.d.a();
            if (a3 != null) {
                a3.e(this.q, d.u() == 1 ? d.w() : "", androidx.media3.common.C.usToMs(j), (long) e.d, e.c, e.b);
            }
        } else if (!z && (a2 = this.d.a()) != null) {
            a2.a(this.q, androidx.media3.common.C.usToMs(j), (long) e.d, e.c, e.b);
        }
        return e.a;
    }

    public boolean b(AseConfig aseConfig, long j, float f, boolean z, boolean z2) {
        return e(aseConfig, j, f, z, z2).a;
    }

    private bkE$b e(AseConfig aseConfig, long j, float f, boolean z, boolean z2) {
        if (this.h$7487fb8b == null) {
            try {
                Object[] objArr = {aseConfig, this.f13616o};
                Object obj = C4755bkv.q.get(-1849310587);
                if (obj == null) {
                    obj = ((Class) C4755bkv.b((char) 0, 5, 780)).getDeclaredConstructor(AseConfig.class, InterfaceC4663bik.class);
                    C4755bkv.q.put(-1849310587, obj);
                }
                this.h$7487fb8b = ((Constructor) obj).newInstance(objArr);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        Object obj2 = this.h$7487fb8b;
        try {
            Object[] objArr2 = {Long.valueOf(this.b.d()), Float.valueOf(f), Long.valueOf(j), Long.valueOf(this.f), Long.valueOf(this.c.getBitrateEstimate() / 1000), Integer.valueOf(aseConfig.y() ? this.c.c() : 0), Integer.valueOf(c()), this.b.b(), Boolean.valueOf(z), this.b.e(2), Integer.valueOf(a()), Boolean.valueOf(z2)};
            Object obj3 = C4755bkv.q.get(238461833);
            if (obj3 == null) {
                obj3 = ((Class) C4755bkv.b((char) 0, 5, 780)).getMethod("c", Long.TYPE, Float.TYPE, Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE, Integer.TYPE, IAsePlayerState.AsePlayerState.class, Boolean.TYPE, IAsePlayerState.a.class, Integer.TYPE, Boolean.TYPE);
                C4755bkv.q.put(238461833, obj3);
            }
            return (bkE$b) ((Method) obj3).invoke(obj2, objArr2);
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 != null) {
                throw cause2;
            }
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00c2  */
    @Override // androidx.media3.exoplayer.LoadControl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean shouldContinueLoading(long r21, long r23, float r25) {
        /*
            Method dump skipped, instructions count: 375
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C4738bkW.shouldContinueLoading(long, long, float):boolean");
    }

    private int c(AseConfig aseConfig) {
        IAsePlayerState.a e = this.b.e(2);
        if (e != null) {
            String b = e.b();
            long d = e.d();
            List<C4656bid> b2 = this.f13616o.b(b, 100000 + d, 1L);
            if (b2 != null && !b2.isEmpty()) {
                return (int) b2.get(0).a();
            }
            if (e.h()) {
                int i = (int) (((((e.i() / 1000) / 8) * e.j()) / 1000) * aseConfig.ar().b());
                C1044Mm.a("ASE-LoadControl", "getNextChunkSize for live @ %d ms is %d kB", Long.valueOf(d / 1000), Integer.valueOf(i / 1000));
                return i;
            }
        }
        return 0;
    }

    private void c(boolean z) {
        this.j = true;
        if (z) {
            this.e.reset();
        }
    }

    private void b(AseConfig aseConfig, int i, int i2, long j, long j2) {
        if (i > i2 || j > j2) {
            this.g = TimeUnit.HOURS.toMicros(5L);
            return;
        }
        long d = this.b.d(2);
        long a2 = this.b.a(2);
        this.g = Math.max(((d - a2) - aseConfig.n()) * 1000, a);
    }
}
