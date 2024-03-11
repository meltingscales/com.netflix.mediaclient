package o;

import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.cdx.api.DeviceType;
import com.netflix.mediaclient.commanderinfra.api.util.ConnectionState;
import com.netflix.mediaclient.commanderinfra.api.util.ConnectionType;
import com.netflix.mediaclient.commanderinfra.api.util.TargetDeviceUiState;
import com.netflix.mediaclient.commanderinfra.impl.logging.CommanderFlexEventType;
import dagger.hilt.android.scopes.ActivityScoped;
import java.util.Map;
import javax.inject.Inject;
import o.C1255Uq;
import o.C1311Wu;
import o.C8632dsu;
import o.InterfaceC1251Um;
import o.InterfaceC1284Vt;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import o.VH;
import o.VX;
import o.dpR;

@ActivityScoped
/* renamed from: o.Wu  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1311Wu implements VH {
    public static final a b = new a(null);
    private final VA c;
    private final InterfaceC1284Vt d;
    private final VG e;

    /* renamed from: o.Wu$e */
    /* loaded from: classes3.dex */
    public final /* synthetic */ class e {
        public static final /* synthetic */ int[] c;

        static {
            int[] iArr = new int[ConnectionState.values().length];
            try {
                iArr[ConnectionState.i.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ConnectionState.c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ConnectionState.g.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ConnectionState.b.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ConnectionState.d.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            c = iArr;
        }
    }

    @Inject
    public C1311Wu(VG vg, VA va, InterfaceC1284Vt interfaceC1284Vt) {
        C8632dsu.c((Object) vg, "");
        C8632dsu.c((Object) va, "");
        C8632dsu.c((Object) interfaceC1284Vt, "");
        this.e = vg;
        this.c = va;
        this.d = interfaceC1284Vt;
    }

    /* renamed from: o.Wu$a */
    /* loaded from: classes3.dex */
    public static final class a extends C1045Mp {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
            super("TargetConnectionInfraImpl");
        }
    }

    @Override // o.VH
    public VX a() {
        return C1317Xa.e.d().b();
    }

    @Override // o.VH
    public InterfaceC8822dzv<VX> e() {
        return C1317Xa.e.d();
    }

    @Override // o.VH
    public ConnectionState b() {
        return C1317Xa.e.c().b();
    }

    @Override // o.VH
    public boolean f() {
        C1317Xa c1317Xa = C1317Xa.e;
        return c1317Xa.c().b() == ConnectionState.e || c1317Xa.c().b() == ConnectionState.d;
    }

    @Override // o.VH
    public InterfaceC8822dzv<ConnectionState> d() {
        return C1317Xa.e.c();
    }

    @Override // o.VH
    public void b(InterfaceC5283bvo interfaceC5283bvo) {
        VN a2;
        C8632dsu.c((Object) interfaceC5283bvo, "");
        VT e2 = C1317Xa.e.e();
        if (e2 == null || (a2 = e2.a()) == null || !C8632dsu.c((Object) a2.j(), (Object) interfaceC5283bvo.getProfileGuid())) {
            return;
        }
        VH.d.e(this, new VX(new VZ(a2.c(), a2.e(), a2.i(), a2.a(), a2.j(), a2.d()), TargetDeviceUiState.c, null, null, null, null, null, 124, null), false, a2.j(), 2, null);
    }

    private final void j() {
        Map d;
        Map k;
        Throwable th;
        InterfaceC1251Um a2 = C1329Xm.c.a();
        if (a2 != null) {
            a2.d(new WB(this.d));
            a2.d(new WD());
            a2.e(new WH());
            a2.c(new WP());
            a2.c(new WO());
            a2.b(new WA());
            a2.b(C1321Xe.c);
            a2.a(new WG());
            a2.a(new WK());
            a2.c(new WM(this.d));
            a2.c(new WE());
            a2.a(new WF());
            a2.c(new WJ());
            return;
        }
        InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
        d = dqE.d();
        k = dqE.k(d);
        C1596aHd c1596aHd = new C1596aHd("SPY-37761: setListeners can not be called", null, null, false, k, false, false, 96, null);
        ErrorType errorType = c1596aHd.a;
        if (errorType != null) {
            c1596aHd.e.put("errorType", errorType.c());
            String b2 = c1596aHd.b();
            if (b2 != null) {
                String c = errorType.c();
                c1596aHd.a(c + " " + b2);
            }
        }
        if (c1596aHd.b() != null && c1596aHd.i != null) {
            th = new Throwable(c1596aHd.b(), c1596aHd.i);
        } else if (c1596aHd.b() != null) {
            th = new Throwable(c1596aHd.b());
        } else {
            th = c1596aHd.i;
            if (th == null) {
                th = new Throwable("Handled exception with no message");
            } else if (th == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        }
        InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
        InterfaceC1598aHf a3 = dVar.a();
        if (a3 != null) {
            a3.e(c1596aHd, th);
        } else {
            dVar.e().b(c1596aHd, th);
        }
    }

    private final ConnectionState c(boolean z) {
        if (z) {
            return ConnectionState.d;
        }
        return ConnectionState.e;
    }

    @Override // o.VH
    public void e(VX vx, boolean z, String str) {
        C8632dsu.c((Object) vx, "");
        C8632dsu.c((Object) str, "");
        b.getLogTag();
        WL.d(WL.d, C1322Xf.e.b(), CommanderFlexEventType.i, null, 4, null);
        a(c(z));
        for (VQ vq : C1324Xh.a.a()) {
            vq.e();
        }
        C1317Xa.e.d().d(vx);
        C1329Xm c1329Xm = C1329Xm.c;
        c1329Xm.d(c1329Xm.c());
        j();
        c1329Xm.h();
        this.e.d(vx.e(), str);
    }

    @Override // o.VH
    public void c() {
        Map d;
        Map k;
        Throwable th;
        b.getLogTag();
        WL.d(WL.d, C1322Xf.e.b(), CommanderFlexEventType.m, null, 4, null);
        if (((dpR) C9726vo.d(C1329Xm.c.a(), C1317Xa.e.d().b(), new drX<InterfaceC1251Um, VX, dpR>() { // from class: com.netflix.mediaclient.commanderinfra.impl.TargetConnectionInfraImpl$disconnectTargetDevice$2
            {
                super(2);
            }

            @Override // o.drX
            public /* synthetic */ dpR invoke(InterfaceC1251Um interfaceC1251Um, VX vx) {
                b(interfaceC1251Um, vx);
                return dpR.c;
            }

            public final void b(InterfaceC1251Um interfaceC1251Um, VX vx) {
                InterfaceC1284Vt interfaceC1284Vt;
                C8632dsu.c((Object) interfaceC1251Um, "");
                C8632dsu.c((Object) vx, "");
                interfaceC1251Um.d();
                interfaceC1251Um.d(new C1255Uq(vx.e().e(), vx.e().b(), vx.e().h(), vx.e().c(), DeviceType.a, vx.e().g(), vx.e().j(), false, 128, null));
                interfaceC1284Vt = C1311Wu.this.d;
                interfaceC1284Vt.c();
            }
        })) == null) {
            InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
            d = dqE.d();
            k = dqE.k(d);
            C1596aHd c1596aHd = new C1596aHd("SPY-37761: disconnect can not be called", null, null, false, k, false, false, 96, null);
            ErrorType errorType = c1596aHd.a;
            if (errorType != null) {
                c1596aHd.e.put("errorType", errorType.c());
                String b2 = c1596aHd.b();
                if (b2 != null) {
                    String c = errorType.c();
                    c1596aHd.a(c + " " + b2);
                }
            }
            if (c1596aHd.b() != null && c1596aHd.i != null) {
                th = new Throwable(c1596aHd.b(), c1596aHd.i);
            } else if (c1596aHd.b() != null) {
                th = new Throwable(c1596aHd.b());
            } else {
                th = c1596aHd.i;
                if (th == null) {
                    th = new Throwable("Handled exception with no message");
                } else if (th == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            }
            InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
            InterfaceC1598aHf a2 = dVar.a();
            if (a2 != null) {
                a2.e(c1596aHd, th);
            } else {
                dVar.e().b(c1596aHd, th);
            }
        }
        this.c.a();
        C1331Xo.b.a();
    }

    @Override // o.VH
    public void a(ConnectionState connectionState) {
        C8632dsu.c((Object) connectionState, "");
        b.getLogTag();
        C1317Xa.e.c().d(connectionState);
        d(connectionState);
    }

    private final void d(ConnectionState connectionState) {
        b.getLogTag();
        int i = e.c[connectionState.ordinal()];
        if (i == 1 || i == 2) {
            C1317Xa.e.a().d(null);
        } else if (i == 3) {
            C1317Xa.e.a().d(ConnectionType.e);
        } else if (i == 4) {
            C1317Xa.e.a().d(ConnectionType.a);
        } else if (i != 5) {
        } else {
            C1317Xa.e.a().d(ConnectionType.b);
        }
    }
}
