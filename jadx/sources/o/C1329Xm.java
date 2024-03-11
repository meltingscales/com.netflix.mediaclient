package o;

import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.cdx.api.DeviceType;
import com.netflix.mediaclient.cdx.api.NavigationCommand;
import com.netflix.mediaclient.cdx.api.PairingType;
import com.netflix.mediaclient.cdx.api.Route;
import com.netflix.mediaclient.commanderinfra.api.util.ConnectionType;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import o.C1255Uq;
import o.C1329Xm;
import o.C8632dsu;
import o.InterfaceC1251Um;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import o.UD;
import o.VX;
import o.WI;
import o.dpR;

/* renamed from: o.Xm  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1329Xm extends C1045Mp {
    public static final C1329Xm c = new C1329Xm();

    /* renamed from: o.Xm$c */
    /* loaded from: classes3.dex */
    public final /* synthetic */ class c {
        public static final /* synthetic */ int[] e;

        static {
            int[] iArr = new int[ConnectionType.values().length];
            try {
                iArr[ConnectionType.b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ConnectionType.e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ConnectionType.a.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ConnectionType.c.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ConnectionType.d.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            e = iArr;
        }
    }

    private C1329Xm() {
        super("MessageInfraUtil");
    }

    public final InterfaceC1251Um a() {
        Map d;
        Map k;
        Throwable th;
        InterfaceC1251Um a = AbstractApplicationC1040Mh.getInstance().i().a();
        if (a == null) {
            InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
            d = dqE.d();
            k = dqE.k(d);
            C1596aHd c1596aHd = new C1596aHd("SPY-37756: cdxAgent is null", null, null, false, k, false, false, 96, null);
            ErrorType errorType = c1596aHd.a;
            if (errorType != null) {
                c1596aHd.e.put("errorType", errorType.c());
                String b = c1596aHd.b();
                if (b != null) {
                    String c2 = errorType.c();
                    c1596aHd.a(c2 + " " + b);
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
        return a;
    }

    public final void b() {
        dpR dpr;
        Map d;
        Map k;
        Throwable th;
        InterfaceC1251Um a = a();
        if (a != null) {
            C1322Xf.e.c(a.c());
            dpr = dpR.c;
        } else {
            dpr = null;
        }
        if (dpr == null) {
            InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
            d = dqE.d();
            k = dqE.k(d);
            C1596aHd c1596aHd = new C1596aHd("SPY-37761: createSession can not be called", null, null, false, k, false, false, 96, null);
            ErrorType errorType = c1596aHd.a;
            if (errorType != null) {
                c1596aHd.e.put("errorType", errorType.c());
                String b = c1596aHd.b();
                if (b != null) {
                    String c2 = errorType.c();
                    c1596aHd.a(c2 + " " + b);
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
    }

    public final void d() {
        dpR dpr;
        Map d;
        Map k;
        Throwable th;
        InterfaceC1251Um a = a();
        if (a != null) {
            a.e();
            dpr = dpR.c;
        } else {
            dpr = null;
        }
        if (dpr == null) {
            InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
            d = dqE.d();
            k = dqE.k(d);
            C1596aHd c1596aHd = new C1596aHd("SPY-37761: closeSession can not be called", null, null, false, k, false, false, 96, null);
            ErrorType errorType = c1596aHd.a;
            if (errorType != null) {
                c1596aHd.e.put("errorType", errorType.c());
                String b = c1596aHd.b();
                if (b != null) {
                    String c2 = errorType.c();
                    c1596aHd.a(c2 + " " + b);
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
    }

    public final void f() {
        dpR dpr;
        Map d;
        Map k;
        Throwable th;
        InterfaceC1251Um a = a();
        if (a != null) {
            a.b();
            dpr = dpR.c;
        } else {
            dpr = null;
        }
        if (dpr == null) {
            InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
            d = dqE.d();
            k = dqE.k(d);
            C1596aHd c1596aHd = new C1596aHd("SPY-37761: userDeclinedPairing can not be called", null, null, false, k, false, false, 96, null);
            ErrorType errorType = c1596aHd.a;
            if (errorType != null) {
                c1596aHd.e.put("errorType", errorType.c());
                String b = c1596aHd.b();
                if (b != null) {
                    String c2 = errorType.c();
                    c1596aHd.a(c2 + " " + b);
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
    }

    public final void h() {
        Map d;
        Map k;
        Throwable th;
        if (((dpR) C9726vo.d(a(), C1317Xa.e.d().b(), new drX<InterfaceC1251Um, VX, dpR>() { // from class: com.netflix.mediaclient.commanderinfra.impl.util.MessageInfraUtil$subscribeToPlayer$1
            @Override // o.drX
            public /* synthetic */ dpR invoke(InterfaceC1251Um interfaceC1251Um, VX vx) {
                a(interfaceC1251Um, vx);
                return dpR.c;
            }

            public final void a(InterfaceC1251Um interfaceC1251Um, VX vx) {
                C8632dsu.c((Object) interfaceC1251Um, "");
                C8632dsu.c((Object) vx, "");
                C1329Xm.c.getLogTag();
                interfaceC1251Um.c(new WI());
                interfaceC1251Um.c(new C1255Uq(vx.e().e(), vx.e().b(), vx.e().h(), vx.e().c(), DeviceType.a, vx.e().g(), vx.e().j(), false, 128, null));
            }
        })) == null) {
            InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
            d = dqE.d();
            k = dqE.k(d);
            C1596aHd c1596aHd = new C1596aHd("SPY-37761: subscribeToPlayer can not be called", null, null, false, k, false, false, 96, null);
            ErrorType errorType = c1596aHd.a;
            if (errorType != null) {
                c1596aHd.e.put("errorType", errorType.c());
                String b = c1596aHd.b();
                if (b != null) {
                    String c2 = errorType.c();
                    c1596aHd.a(c2 + " " + b);
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
            InterfaceC1598aHf a = dVar.a();
            if (a != null) {
                a.e(c1596aHd, th);
            } else {
                dVar.e().b(c1596aHd, th);
            }
        }
    }

    public final void d(UD ud) {
        Map d;
        Map k;
        Throwable th;
        C8632dsu.c((Object) ud, "");
        if (((dpR) C9726vo.d(a(), C1317Xa.e.d().b(), ud, new InterfaceC8612dsa<InterfaceC1251Um, VX, UD, dpR>() { // from class: com.netflix.mediaclient.commanderinfra.impl.util.MessageInfraUtil$sendTVUIAction$1
            @Override // o.InterfaceC8612dsa
            public /* synthetic */ dpR invoke(InterfaceC1251Um interfaceC1251Um, VX vx, UD ud2) {
                c(interfaceC1251Um, vx, ud2);
                return dpR.c;
            }

            public final void c(InterfaceC1251Um interfaceC1251Um, VX vx, UD ud2) {
                C8632dsu.c((Object) interfaceC1251Um, "");
                C8632dsu.c((Object) vx, "");
                C8632dsu.c((Object) ud2, "");
                C1329Xm.c.getLogTag();
                interfaceC1251Um.d(new C1255Uq(vx.e().e(), vx.e().b(), vx.e().h(), vx.e().c(), DeviceType.a, vx.e().g(), vx.e().j(), false, 128, null), ud2);
            }
        })) == null) {
            InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
            d = dqE.d();
            k = dqE.k(d);
            C1596aHd c1596aHd = new C1596aHd("SPY-37761: sendAction can not be called", null, null, false, k, false, false, 96, null);
            ErrorType errorType = c1596aHd.a;
            if (errorType != null) {
                c1596aHd.e.put("errorType", errorType.c());
                String b = c1596aHd.b();
                if (b != null) {
                    String c2 = errorType.c();
                    c1596aHd.a(c2 + " " + b);
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
            InterfaceC1598aHf a = dVar.a();
            if (a != null) {
                a.e(c1596aHd, th);
            } else {
                dVar.e().b(c1596aHd, th);
            }
        }
    }

    public final void d(Route route) {
        Map d;
        Map k;
        Throwable th;
        C8632dsu.c((Object) route, "");
        if (((dpR) C9726vo.d(a(), C1317Xa.e.d().b(), route, new InterfaceC8612dsa<InterfaceC1251Um, VX, Route, dpR>() { // from class: com.netflix.mediaclient.commanderinfra.impl.util.MessageInfraUtil$sendRouteCommand$1
            @Override // o.InterfaceC8612dsa
            public /* synthetic */ dpR invoke(InterfaceC1251Um interfaceC1251Um, VX vx, Route route2) {
                d(interfaceC1251Um, vx, route2);
                return dpR.c;
            }

            public final void d(InterfaceC1251Um interfaceC1251Um, VX vx, Route route2) {
                C8632dsu.c((Object) interfaceC1251Um, "");
                C8632dsu.c((Object) vx, "");
                C8632dsu.c((Object) route2, "");
                C1329Xm.c.getLogTag();
                interfaceC1251Um.c(new C1255Uq(vx.e().e(), vx.e().b(), vx.e().h(), vx.e().c(), DeviceType.a, vx.e().g(), vx.e().j(), false, 128, null), route2);
            }
        })) == null) {
            InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
            d = dqE.d();
            k = dqE.k(d);
            C1596aHd c1596aHd = new C1596aHd("SPY-37761: routeTo can not be called", null, null, false, k, false, false, 96, null);
            ErrorType errorType = c1596aHd.a;
            if (errorType != null) {
                c1596aHd.e.put("errorType", errorType.c());
                String b = c1596aHd.b();
                if (b != null) {
                    String c2 = errorType.c();
                    c1596aHd.a(c2 + " " + b);
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
            InterfaceC1598aHf a = dVar.a();
            if (a != null) {
                a.e(c1596aHd, th);
            } else {
                dVar.e().b(c1596aHd, th);
            }
        }
    }

    public final void c(NavigationCommand navigationCommand) {
        Map d;
        Map k;
        Throwable th;
        C8632dsu.c((Object) navigationCommand, "");
        if (((dpR) C9726vo.d(a(), C1317Xa.e.d().b(), navigationCommand, new InterfaceC8612dsa<InterfaceC1251Um, VX, NavigationCommand, dpR>() { // from class: com.netflix.mediaclient.commanderinfra.impl.util.MessageInfraUtil$sendNavigationCommand$1
            @Override // o.InterfaceC8612dsa
            public /* synthetic */ dpR invoke(InterfaceC1251Um interfaceC1251Um, VX vx, NavigationCommand navigationCommand2) {
                b(interfaceC1251Um, vx, navigationCommand2);
                return dpR.c;
            }

            public final void b(InterfaceC1251Um interfaceC1251Um, VX vx, NavigationCommand navigationCommand2) {
                C8632dsu.c((Object) interfaceC1251Um, "");
                C8632dsu.c((Object) vx, "");
                C8632dsu.c((Object) navigationCommand2, "");
                C1329Xm.c.getLogTag();
                interfaceC1251Um.d(new C1255Uq(vx.e().e(), vx.e().b(), vx.e().h(), vx.e().c(), DeviceType.a, vx.e().g(), vx.e().j(), false, 128, null), navigationCommand2);
            }
        })) == null) {
            InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
            d = dqE.d();
            k = dqE.k(d);
            C1596aHd c1596aHd = new C1596aHd("SPY-37761: sendNavigationCommand can not be called", null, null, false, k, false, false, 96, null);
            ErrorType errorType = c1596aHd.a;
            if (errorType != null) {
                c1596aHd.e.put("errorType", errorType.c());
                String b = c1596aHd.b();
                if (b != null) {
                    String c2 = errorType.c();
                    c1596aHd.a(c2 + " " + b);
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
            InterfaceC1598aHf a = dVar.a();
            if (a != null) {
                a.e(c1596aHd, th);
            } else {
                dVar.e().b(c1596aHd, th);
            }
        }
    }

    public final void i() {
        Map d;
        Map k;
        Throwable th;
        if (((dpR) C9726vo.d(a(), C1317Xa.e.d().b(), new drX<InterfaceC1251Um, VX, dpR>() { // from class: com.netflix.mediaclient.commanderinfra.impl.util.MessageInfraUtil$sendPauseRequest$1
            @Override // o.drX
            public /* synthetic */ dpR invoke(InterfaceC1251Um interfaceC1251Um, VX vx) {
                d(interfaceC1251Um, vx);
                return dpR.c;
            }

            public final void d(InterfaceC1251Um interfaceC1251Um, VX vx) {
                C8632dsu.c((Object) interfaceC1251Um, "");
                C8632dsu.c((Object) vx, "");
                C1329Xm.c.getLogTag();
                interfaceC1251Um.e(new C1255Uq(vx.e().e(), vx.e().b(), vx.e().h(), vx.e().c(), DeviceType.a, vx.e().g(), vx.e().j(), false, 128, null));
            }
        })) == null) {
            InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
            d = dqE.d();
            k = dqE.k(d);
            C1596aHd c1596aHd = new C1596aHd("SPY-37761: sendPauseRequest can not be called", null, null, false, k, false, false, 96, null);
            ErrorType errorType = c1596aHd.a;
            if (errorType != null) {
                c1596aHd.e.put("errorType", errorType.c());
                String b = c1596aHd.b();
                if (b != null) {
                    String c2 = errorType.c();
                    c1596aHd.a(c2 + " " + b);
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
            InterfaceC1598aHf a = dVar.a();
            if (a != null) {
                a.e(c1596aHd, th);
            } else {
                dVar.e().b(c1596aHd, th);
            }
        }
    }

    public final void j() {
        Map d;
        Map k;
        Throwable th;
        if (((dpR) C9726vo.d(a(), C1317Xa.e.d().b(), new drX<InterfaceC1251Um, VX, dpR>() { // from class: com.netflix.mediaclient.commanderinfra.impl.util.MessageInfraUtil$sendUnpauseRequest$1
            @Override // o.drX
            public /* synthetic */ dpR invoke(InterfaceC1251Um interfaceC1251Um, VX vx) {
                b(interfaceC1251Um, vx);
                return dpR.c;
            }

            public final void b(InterfaceC1251Um interfaceC1251Um, VX vx) {
                C8632dsu.c((Object) interfaceC1251Um, "");
                C8632dsu.c((Object) vx, "");
                C1329Xm.c.getLogTag();
                interfaceC1251Um.a(new C1255Uq(vx.e().e(), vx.e().b(), vx.e().h(), vx.e().c(), DeviceType.a, vx.e().g(), vx.e().j(), false, 128, null));
            }
        })) == null) {
            InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
            d = dqE.d();
            k = dqE.k(d);
            C1596aHd c1596aHd = new C1596aHd("SPY-37761: sendUnpauseRequest can not be called", null, null, false, k, false, false, 96, null);
            ErrorType errorType = c1596aHd.a;
            if (errorType != null) {
                c1596aHd.e.put("errorType", errorType.c());
                String b = c1596aHd.b();
                if (b != null) {
                    String c2 = errorType.c();
                    c1596aHd.a(c2 + " " + b);
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
            InterfaceC1598aHf a = dVar.a();
            if (a != null) {
                a.e(c1596aHd, th);
            } else {
                dVar.e().b(c1596aHd, th);
            }
        }
    }

    public final void d(final String str) {
        Map d;
        Map k;
        Throwable th;
        C8632dsu.c((Object) str, "");
        if (((dpR) C9726vo.d(a(), C1317Xa.e.d().b(), new drX<InterfaceC1251Um, VX, dpR>() { // from class: com.netflix.mediaclient.commanderinfra.impl.util.MessageInfraUtil$requestTrackList$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // o.drX
            public /* synthetic */ dpR invoke(InterfaceC1251Um interfaceC1251Um, VX vx) {
                b(interfaceC1251Um, vx);
                return dpR.c;
            }

            public final void b(InterfaceC1251Um interfaceC1251Um, VX vx) {
                C8632dsu.c((Object) interfaceC1251Um, "");
                C8632dsu.c((Object) vx, "");
                C1329Xm.c.getLogTag();
                interfaceC1251Um.a(new C1255Uq(vx.e().e(), vx.e().b(), vx.e().h(), vx.e().c(), DeviceType.a, vx.e().g(), vx.e().j(), false, 128, null), str);
            }
        })) == null) {
            InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
            d = dqE.d();
            k = dqE.k(d);
            C1596aHd c1596aHd = new C1596aHd("SPY-37761: requestTrackList can not be called", null, null, false, k, false, false, 96, null);
            ErrorType errorType = c1596aHd.a;
            if (errorType != null) {
                c1596aHd.e.put("errorType", errorType.c());
                String b = c1596aHd.b();
                if (b != null) {
                    String c2 = errorType.c();
                    c1596aHd.a(c2 + " " + b);
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
            InterfaceC1598aHf a = dVar.a();
            if (a != null) {
                a.e(c1596aHd, th);
            } else {
                dVar.e().b(c1596aHd, th);
            }
        }
    }

    public final void d(final PairingType pairingType) {
        Map d;
        Map k;
        Throwable th;
        C8632dsu.c((Object) pairingType, "");
        if (((dpR) C9726vo.d(a(), C1317Xa.e.d().b(), new drX<InterfaceC1251Um, VX, dpR>() { // from class: com.netflix.mediaclient.commanderinfra.impl.util.MessageInfraUtil$requestMetadata$1
            {
                super(2);
            }

            @Override // o.drX
            public /* synthetic */ dpR invoke(InterfaceC1251Um interfaceC1251Um, VX vx) {
                e(interfaceC1251Um, vx);
                return dpR.c;
            }

            public final void e(InterfaceC1251Um interfaceC1251Um, VX vx) {
                C8632dsu.c((Object) interfaceC1251Um, "");
                C8632dsu.c((Object) vx, "");
                C1329Xm.c.getLogTag();
                interfaceC1251Um.d(new C1255Uq(vx.e().e(), vx.e().b(), vx.e().h(), vx.e().c(), DeviceType.a, vx.e().g(), vx.e().j(), false, 128, null), PairingType.this);
            }
        })) == null) {
            InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
            d = dqE.d();
            k = dqE.k(d);
            C1596aHd c1596aHd = new C1596aHd("SPY-37761: requestMetadata can not be called", null, null, false, k, false, false, 96, null);
            ErrorType errorType = c1596aHd.a;
            if (errorType != null) {
                c1596aHd.e.put("errorType", errorType.c());
                String b = c1596aHd.b();
                if (b != null) {
                    String c2 = errorType.c();
                    c1596aHd.a(c2 + " " + b);
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
            InterfaceC1598aHf a = dVar.a();
            if (a != null) {
                a.e(c1596aHd, th);
            } else {
                dVar.e().b(c1596aHd, th);
            }
        }
    }

    public final PairingType c() {
        ConnectionType b = C1317Xa.e.a().b();
        int i = b == null ? -1 : c.e[b.ordinal()];
        if (i != -1) {
            if (i == 1) {
                return PairingType.b;
            }
            if (i == 2 || i == 3) {
                return PairingType.e;
            }
            if (i == 4) {
                return PairingType.d;
            }
            if (i != 5) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return PairingType.a;
    }

    public final void e() {
        getLogTag();
        d(PairingType.d);
        h();
    }
}
