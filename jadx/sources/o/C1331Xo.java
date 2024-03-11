package o;

import com.netflix.mediaclient.android.widget.NetflixImageView;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.commanderinfra.api.util.ConnectionState;
import com.netflix.mediaclient.commanderinfra.api.util.TargetDeviceUiState;
import com.netflix.mediaclient.commanderinfra.impl.logging.CommanderFlexEventType;
import com.netflix.mediaclient.service.user.UserAgent;
import java.util.Map;
import o.C1302Wl;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;

/* renamed from: o.Xo  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1331Xo extends C1045Mp {
    public static final C1331Xo b = new C1331Xo();
    private static VA e;

    /* renamed from: o.Xo$e */
    /* loaded from: classes3.dex */
    public final /* synthetic */ class e {
        public static final /* synthetic */ int[] e;

        static {
            int[] iArr = new int[TargetDeviceUiState.values().length];
            try {
                iArr[TargetDeviceUiState.d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TargetDeviceUiState.e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            e = iArr;
        }
    }

    public final void b(VA va) {
        C8632dsu.c((Object) va, "");
        e = va;
    }

    private C1331Xo() {
        super("InfraUtil");
    }

    public final UserAgent b() {
        return AbstractApplicationC1040Mh.getInstance().i().k();
    }

    public final void d(InterfaceC1284Vt interfaceC1284Vt) {
        dpR dpr;
        Map d;
        Map k;
        Throwable th;
        C8632dsu.c((Object) interfaceC1284Vt, "");
        InterfaceC1251Um a = C1329Xm.c.a();
        if (a != null) {
            a.d();
            dpr = dpR.c;
        } else {
            dpr = null;
        }
        if (dpr == null) {
            InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
            d = dqE.d();
            k = dqE.k(d);
            C1596aHd c1596aHd = new C1596aHd("SPY-37761: removeTargetListeners can not be called", null, null, false, k, false, false, 96, null);
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
        interfaceC1284Vt.c();
        a();
    }

    public final String d() {
        C1295We g;
        VX b2 = C1317Xa.e.d().b();
        if (b2 == null || (g = b2.g()) == null) {
            return null;
        }
        return g.g() ? "Live" : g.a() ? "Interactive" : "Standard";
    }

    public final CommanderFlexEventType e(boolean z, TargetDeviceUiState targetDeviceUiState) {
        C8632dsu.c((Object) targetDeviceUiState, "");
        int i = e.e[targetDeviceUiState.ordinal()];
        if (i == 1 || i == 2) {
            if (z) {
                return CommanderFlexEventType.f;
            }
            return CommanderFlexEventType.g;
        } else if (z) {
            return CommanderFlexEventType.j;
        } else {
            return CommanderFlexEventType.d;
        }
    }

    public final InterfaceC5098bsO e() {
        InterfaceC1251Um a = AbstractApplicationC1040Mh.getInstance().i().a();
        C8632dsu.d(a);
        return ((aMF) a).agentContext.n();
    }

    public final void j() {
        VA va = e;
        if (va != null) {
            va.d();
        }
    }

    public final void c() {
        VA va = e;
        if (va != null) {
            va.c();
        }
    }

    public final void h() {
        VA va = e;
        if (va != null) {
            va.e();
        }
    }

    public final void b(VO vo) {
        C8632dsu.c((Object) vo, "");
        getLogTag();
        C1317Xa c1317Xa = C1317Xa.e;
        InterfaceC8812dzl<VX> d = c1317Xa.d();
        VX b2 = c1317Xa.d().b();
        d.d(b2 != null ? VX.e(b2, null, null, null, vo, null, null, null, NetflixImageView.DEFAULT_LAYER_GRAVITY, null) : null);
    }

    public final void b(C1293Wc c1293Wc) {
        C8632dsu.c((Object) c1293Wc, "");
        getLogTag();
        C1317Xa c1317Xa = C1317Xa.e;
        InterfaceC8812dzl<VX> d = c1317Xa.d();
        VX b2 = c1317Xa.d().b();
        d.d(b2 != null ? VX.e(b2, null, null, null, null, c1293Wc, null, null, 111, null) : null);
    }

    public final void a() {
        getLogTag();
        VA va = e;
        if (va != null) {
            va.a();
        }
        for (VQ vq : C1324Xh.a.a()) {
            vq.e();
        }
        C1317Xa c1317Xa = C1317Xa.e;
        c1317Xa.c().d(ConnectionState.a);
        c1317Xa.a().d(null);
        C1320Xd.c.b().d(null);
        c1317Xa.d().d(null);
        c1317Xa.d((C1302Wl.d) null);
        C1322Xf.e.c(null);
    }
}
