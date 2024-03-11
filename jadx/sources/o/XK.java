package o;

import com.netflix.mediaclient.api.logging.error.ErrorType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Singleton;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import o.XH;

@Singleton
/* loaded from: classes3.dex */
public final class XK implements XH {
    private final XM a;
    private final List<XH.d> e;

    @Inject
    public XK(XM xm) {
        C8632dsu.c((Object) xm, "");
        this.a = xm;
        this.e = new ArrayList();
    }

    @Override // o.XH
    public void c(XH.d dVar) {
        C8632dsu.c((Object) dVar, "");
        C8166dfJ.e(null, false, 3, null);
        this.e.add(dVar);
    }

    @Override // o.XH
    public void a(XH.d dVar) {
        C8632dsu.c((Object) dVar, "");
        C8166dfJ.e(null, false, 3, null);
        this.e.remove(dVar);
    }

    @Override // o.XH
    public void e(String str) {
        Map d;
        Map k;
        Throwable th;
        C8632dsu.c((Object) str, "");
        try {
            this.a.a(str);
            for (XH.d dVar : this.e) {
                dVar.d();
            }
        } catch (Exception e) {
            InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
            d = dqE.d();
            k = dqE.k(d);
            C1596aHd c1596aHd = new C1596aHd(null, e, null, true, k, false, false, 96, null);
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
            InterfaceC1601aHi.d dVar2 = InterfaceC1601aHi.c;
            InterfaceC1598aHf a = dVar2.a();
            if (a != null) {
                a.e(c1596aHd, th);
            } else {
                dVar2.e().b(c1596aHd, th);
            }
        }
    }

    @Override // o.XH
    public XI d() {
        return this.a.a().c();
    }

    @Override // o.XH
    public XI c() {
        return this.a.a().a();
    }

    @Override // o.XH
    public XI a() {
        return this.a.a().d();
    }

    @Override // o.XH
    public XI f() {
        return this.a.a().b();
    }

    @Override // o.XH
    public XI i() {
        return this.a.a().h();
    }

    @Override // o.XH
    public XI b() {
        return this.a.a().e();
    }

    @Override // o.XH
    public void e() {
        this.a.d();
        for (XH.d dVar : this.e) {
            dVar.d();
        }
    }
}
