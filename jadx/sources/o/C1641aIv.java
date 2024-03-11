package o;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.netflixactivity.api.NetflixActivityBase;
import java.util.Map;
import java.util.Set;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;

/* renamed from: o.aIv  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1641aIv {
    private static final Set<String> d;

    static {
        Set<String> d2;
        d2 = dqN.d("android.intent.action.VIEW", "android.intent.action.SEND", "android.intent.action.CHOOSER", "android.speech.action.RECOGNIZE_SPEECH", "miui.intent.action.CHECK_ACCESS_CONTROL", "com.huawei.intent.action.hwCHOOSER");
        d = d2;
    }

    public static final void b(NetflixActivityBase netflixActivityBase, Intent intent) {
        Map d2;
        Map k;
        Throwable th;
        C8632dsu.c((Object) netflixActivityBase, "");
        C8632dsu.c((Object) intent, "");
        ComponentName component = intent.getComponent();
        if (component != null && C8632dsu.c((Object) component.getPackageName(), (Object) netflixActivityBase.getPackageName())) {
            String className = component.getClassName();
            C1044Mm.e("propagateState", "Target class " + className);
            Class<?> cls = Class.forName(component.getClassName());
            if (!NetflixActivityBase.class.isAssignableFrom(cls)) {
                InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                d2 = dqE.d();
                k = dqE.k(d2);
                C1596aHd c1596aHd = new C1596aHd("SPY-35026 - unable to propagate activity state, target is not a NetflixActivityBase", null, null, true, k, false, false, 96, null);
                ErrorType errorType = c1596aHd.a;
                if (errorType != null) {
                    c1596aHd.e.put("errorType", errorType.c());
                    String b = c1596aHd.b();
                    if (b != null) {
                        String c = errorType.c();
                        c1596aHd.a(c + " " + b);
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
                    return;
                } else {
                    dVar.e().b(c1596aHd, th);
                    return;
                }
            }
            C8632dsu.d(cls);
            if (cls.getAnnotation(InterfaceC1639aIt.class) != null) {
                C1044Mm.e("propagateState", "Target class has annotation NonAccountScopedNetflixActivity");
            } else if (cls.getAnnotation(InterfaceC1631aIl.class) != null) {
                C1044Mm.e("propagateState", "Target class has annotation AccountScopedNetflixActivity");
                d(netflixActivityBase, intent);
            } else if (cls.getAnnotation(aIA.class) != null) {
                C1044Mm.e("propagateState", "Target class has annotation ProfileScopedNetflixActivity");
                c(netflixActivityBase, intent);
            } else {
                C1044Mm.d("propagateState", "SPY-35026 - unable to propagate activity state, target is not scoped, " + intent);
            }
        }
    }

    public static final void c(Intent intent, Intent intent2) {
        if (intent == null) {
            return;
        }
        if (intent2 == null) {
            C1044Mm.d("propagateStateOnIntentChange", "SPY-35026 - unable to propagate state, new intent is null");
            return;
        }
        C1632aIm.c.e(intent, intent2);
        C1638aIs.d.d(intent, intent2);
    }

    public static final void a(NetflixActivityBase netflixActivityBase) {
        C8632dsu.c((Object) netflixActivityBase, "");
        if (netflixActivityBase.getClass().getAnnotation(InterfaceC1639aIt.class) != null) {
            return;
        }
        if (netflixActivityBase.getClass().getAnnotation(InterfaceC1631aIl.class) != null) {
            C1632aIm.c.a(netflixActivityBase);
        } else if (netflixActivityBase.getClass().getAnnotation(aIA.class) != null) {
            C1632aIm.c.a(netflixActivityBase);
            C1638aIs.d.c(netflixActivityBase);
        } else {
            C1044Mm.d("validatePropagatedState", "SPY-35026 - unable to validate state, target is not scoped, " + netflixActivityBase);
        }
    }

    public static final void c(Context context, InterfaceC5282bvn interfaceC5282bvn, Intent intent) {
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) interfaceC5282bvn, "");
        C8632dsu.c((Object) intent, "");
        C1632aIm.c.a(interfaceC5282bvn, intent);
        context.startActivity(intent);
    }

    public static final void b(InterfaceC5282bvn interfaceC5282bvn, InterfaceC5283bvo interfaceC5283bvo, Intent intent) {
        C8632dsu.c((Object) interfaceC5282bvn, "");
        C8632dsu.c((Object) interfaceC5283bvo, "");
        C8632dsu.c((Object) intent, "");
        C1632aIm.c.a(interfaceC5282bvn, intent);
        C1638aIs.d.b(interfaceC5283bvo, intent);
    }

    private static final void d(NetflixActivityBase netflixActivityBase, Intent intent) {
        if (netflixActivityBase.getClass().getAnnotation(InterfaceC1639aIt.class) != null) {
            C1632aIm.c.a(netflixActivityBase, intent);
        } else if (netflixActivityBase.getClass().getAnnotation(InterfaceC1631aIl.class) != null || netflixActivityBase.getClass().getAnnotation(aIA.class) != null) {
            C1632aIm.c.d(netflixActivityBase, intent);
        } else {
            C1044Mm.d("propagateAccountState", "SPY-35026 - propagating account state, " + netflixActivityBase + " is not scoped");
            C1632aIm.c.a(netflixActivityBase, intent);
        }
    }

    private static final void c(NetflixActivityBase netflixActivityBase, Intent intent) {
        if (netflixActivityBase.getClass().getAnnotation(InterfaceC1639aIt.class) != null) {
            C1632aIm.c.a(netflixActivityBase, intent);
            C1638aIs.d.a(netflixActivityBase, intent);
        } else if (netflixActivityBase.getClass().getAnnotation(InterfaceC1631aIl.class) != null) {
            C1632aIm.c.d(netflixActivityBase, intent);
            C1638aIs.d.a(netflixActivityBase, intent);
        } else if (netflixActivityBase.getClass().getAnnotation(aIA.class) != null) {
            C1632aIm.c.d(netflixActivityBase, intent);
            C1638aIs.d.d(netflixActivityBase, intent);
        } else {
            C1044Mm.d("propagateProfileState", "SPY-35026 - propagating profile state, " + netflixActivityBase + " is not scoped");
            C1632aIm.c.a(netflixActivityBase, intent);
            C1638aIs.d.a(netflixActivityBase, intent);
        }
    }
}
