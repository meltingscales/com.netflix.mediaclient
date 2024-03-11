package o;

import com.netflix.mediaclient.api.logging.error.ErrorType;
import java.util.Map;
import o.InterfaceC1593aHa;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;

/* renamed from: o.csL  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7230csL {
    public static final void a(C7460cwd c7460cwd) {
        Map d;
        Map k;
        Throwable th;
        boolean g;
        C8632dsu.c((Object) c7460cwd, "");
        String aA = c7460cwd.aA();
        if (aA != null) {
            g = C8691duz.g(aA);
            if (!g) {
                return;
            }
        }
        InterfaceC1593aHa.a aVar = InterfaceC1593aHa.c;
        String str = c7460cwd.W().u;
        String id = c7460cwd.getId();
        aVar.a("SPY-31531 - horzDispUrl - " + str + ", id: " + id);
        InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
        d = dqE.d();
        k = dqE.k(d);
        C1596aHd c1596aHd = new C1596aHd("SPY-31531 - download image URL is null", null, null, true, k, false, false, 96, null);
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
        } else {
            dVar.e().b(c1596aHd, th);
        }
    }
}
