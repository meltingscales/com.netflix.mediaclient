package o;

import java.util.List;
import o.C7824dGs;
import o.C7826dGu;
import o.InterfaceC7817dGl;

/* loaded from: classes5.dex */
public final class dGU implements InterfaceC7817dGl {
    private final InterfaceC7812dGg a;

    public dGU(InterfaceC7812dGg interfaceC7812dGg) {
        C8632dsu.d(interfaceC7812dGg, "");
        this.a = interfaceC7812dGg;
    }

    @Override // o.InterfaceC7817dGl
    public C7824dGs a(InterfaceC7817dGl.e eVar) {
        boolean a;
        AbstractC7829dGx e;
        C8632dsu.d(eVar, "");
        C7826dGu e2 = eVar.e();
        C7826dGu.b g = e2.g();
        AbstractC7825dGt b = e2.b();
        if (b != null) {
            C7822dGq a2 = b.a();
            if (a2 != null) {
                g.a("Content-Type", a2.toString());
            }
            long d = b.d();
            if (d != -1) {
                g.a("Content-Length", String.valueOf(d));
                g.b("Transfer-Encoding");
            } else {
                g.a("Transfer-Encoding", "chunked");
                g.b("Content-Length");
            }
        }
        boolean z = false;
        if (e2.a("Host") == null) {
            g.a("Host", dGB.a(e2.j(), false, 1, null));
        }
        if (e2.a("Connection") == null) {
            g.a("Connection", "Keep-Alive");
        }
        if (e2.a("Accept-Encoding") == null && e2.a("Range") == null) {
            g.a("Accept-Encoding", "gzip");
            z = true;
        }
        List<C7813dGh> b2 = this.a.b(e2.j());
        if (!b2.isEmpty()) {
            g.a("Cookie", a(b2));
        }
        if (e2.a("User-Agent") == null) {
            g.a("User-Agent", "okhttp/4.7.2");
        }
        C7824dGs e3 = eVar.e(g.a());
        C7833dHa.b(this.a, e2.j(), e3.j());
        C7824dGs.b e4 = e3.k().e(e2);
        if (z) {
            a = C8691duz.a("gzip", C7824dGs.c(e3, "Content-Encoding", null, 2, null), true);
            if (a && C7833dHa.d(e3) && (e = e3.e()) != null) {
                dIr dir = new dIr(e.e());
                e4.d(e3.j().e().d("Content-Encoding").d("Content-Length").b());
                e4.e(new C7836dHd(C7824dGs.c(e3, "Content-Type", null, 2, null), -1L, dIw.e(dir)));
            }
        }
        return e4.a();
    }

    private final String a(List<C7813dGh> list) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (Object obj : list) {
            if (i < 0) {
                C8569dql.h();
            }
            C7813dGh c7813dGh = (C7813dGh) obj;
            if (i > 0) {
                sb.append("; ");
            }
            sb.append(c7813dGh.a());
            sb.append('=');
            sb.append(c7813dGh.i());
            i++;
        }
        String sb2 = sb.toString();
        C8632dsu.b(sb2, "");
        return sb2;
    }
}
