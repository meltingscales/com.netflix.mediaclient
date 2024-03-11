package o;

import com.netflix.mediaclient.api.logging.error.ErrorType;
import java.util.Map;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;

/* renamed from: o.brR  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5048brR extends C1045Mp {
    public static final C5048brR c = new C5048brR();

    public final void b(C7826dGu c7826dGu) {
        C8632dsu.c((Object) c7826dGu, "");
    }

    public final void e(Throwable th, C7824dGs c7824dGs) {
        C8632dsu.c((Object) th, "");
    }

    private C5048brR() {
        super("nf_zuul_ws_utils");
    }

    public static /* synthetic */ void b(C5048brR c5048brR, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        c5048brR.c(str, z);
    }

    public final void c(String str, boolean z) {
        Map d;
        Map k;
        Throwable th;
        C8632dsu.c((Object) str, "");
        getLogTag();
        if (z) {
            InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
            d = dqE.d();
            k = dqE.k(d);
            C1596aHd c1596aHd = new C1596aHd(str, null, null, false, k, false, false, 96, null);
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
}
