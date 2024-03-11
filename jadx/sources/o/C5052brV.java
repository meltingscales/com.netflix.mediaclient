package o;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_Zuul;
import com.netflix.mediaclient.service.user.UserAgent;
import com.netflix.mediaclient.servicemgr.ZuulAgent;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;

/* renamed from: o.brV  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5052brV extends C1045Mp {
    public static final C5052brV b = new C5052brV();

    private C5052brV() {
        super("nf_zuul_ws_utils");
    }

    public final UserAgent a(C1052Mw c1052Mw) {
        C8632dsu.c((Object) c1052Mw, "");
        UserAgent k = c1052Mw.k();
        C8632dsu.d(k);
        return k;
    }

    public final aOV e(C1052Mw c1052Mw) {
        C8632dsu.c((Object) c1052Mw, "");
        aOV d = c1052Mw.d();
        C8632dsu.d(d);
        return d;
    }

    static /* synthetic */ void e(C5052brV c5052brV, StringBuilder sb, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 8) != 0) {
            z = false;
        }
        c5052brV.d(sb, str, str2, z);
    }

    private final void d(StringBuilder sb, String str, String str2, boolean z) {
        sb.append(str);
        sb.append("=");
        sb.append(str2);
        if (z) {
            return;
        }
        sb.append("; ");
    }

    public final String a(UserAgent userAgent) {
        C8632dsu.c((Object) userAgent, "");
        StringBuilder sb = new StringBuilder();
        InterfaceC5034brD l = userAgent.l();
        C8632dsu.a(l, "");
        String a = C8284dhV.a();
        if (C8168dfL.h(a)) {
            e(this, sb, "nfvdid", a, false, 8, null);
        }
        if (C8168dfL.h(l.i())) {
            String f = l.f();
            C8632dsu.a(f, "");
            e(this, sb, f, l.i(), false, 8, null);
        }
        if (C8168dfL.h(l.j())) {
            String g = l.g();
            C8632dsu.a(g, "");
            d(sb, g, l.j(), true);
        }
        String sb2 = sb.toString();
        C8632dsu.a(sb2, "");
        return sb2;
    }

    public final boolean a(boolean z) {
        return Config_FastProperty_Zuul.Companion.f() && z;
    }

    public final boolean a(ZuulAgent.e eVar) {
        C8632dsu.c((Object) eVar, "");
        return eVar.c() < Config_FastProperty_Zuul.Companion.d();
    }

    public final void e(Context context, ConnectivityManager.NetworkCallback networkCallback) {
        Throwable th;
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) networkCallback, "");
        getLogTag();
        try {
            Object systemService = context.getSystemService("connectivity");
            C8632dsu.d(systemService);
            ((ConnectivityManager) systemService).registerNetworkCallback(new NetworkRequest.Builder().addCapability(12).build(), networkCallback);
        } catch (Throwable th2) {
            InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
            C1596aHd d = new C1596aHd("SPY-37223: Failed to register for network availability", null, null, false, null, false, false, 126, null).b(false).b(ErrorType.v).d(th2);
            ErrorType errorType = d.a;
            if (errorType != null) {
                d.e.put("errorType", errorType.c());
                String b2 = d.b();
                if (b2 != null) {
                    String c = errorType.c();
                    d.a(c + " " + b2);
                }
            }
            if (d.b() != null && d.i != null) {
                th = new Throwable(d.b(), d.i);
            } else if (d.b() != null) {
                th = new Throwable(d.b());
            } else {
                th = d.i;
                if (th == null) {
                    th = new Throwable("Handled exception with no message");
                } else if (th == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            }
            InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
            InterfaceC1598aHf a = dVar.a();
            if (a != null) {
                a.e(d, th);
            } else {
                dVar.e().b(d, th);
            }
        }
    }
}
