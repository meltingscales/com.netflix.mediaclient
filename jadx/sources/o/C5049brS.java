package o;

import com.netflix.mediaclient.service.user.UserAgent;
import java.util.ArrayList;
import java.util.List;
import o.C7813dGh;

/* renamed from: o.brS  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5049brS implements InterfaceC7812dGg {
    private final UserAgent a;
    private final aOV b;

    @Override // o.InterfaceC7812dGg
    public void d(C7818dGm c7818dGm, List<C7813dGh> list) {
        C8632dsu.c((Object) c7818dGm, "");
        C8632dsu.c((Object) list, "");
    }

    public C5049brS(aOV aov, UserAgent userAgent) {
        C8632dsu.c((Object) aov, "");
        C8632dsu.c((Object) userAgent, "");
        this.b = aov;
        this.a = userAgent;
    }

    @Override // o.InterfaceC7812dGg
    public List<C7813dGh> b(C7818dGm c7818dGm) {
        boolean g;
        boolean g2;
        boolean g3;
        C8632dsu.c((Object) c7818dGm, "");
        ArrayList arrayList = new ArrayList();
        String a = C8284dhV.a();
        InterfaceC5034brD l = this.a.l();
        C8632dsu.a(l, "");
        if (a != null) {
            g3 = C8691duz.g(a);
            if (!g3) {
                arrayList.add(d("nfvdid", a));
            }
        }
        String i = l.i();
        if (i != null) {
            g2 = C8691duz.g(i);
            if (!g2) {
                String f = l.f();
                C8632dsu.a(f, "");
                String i2 = l.i();
                C8632dsu.d((Object) i2);
                arrayList.add(d(f, i2));
            }
        }
        String j = l.j();
        if (j != null) {
            g = C8691duz.g(j);
            if (!g) {
                String g4 = l.g();
                C8632dsu.a(g4, "");
                arrayList.add(d(g4, j));
            }
        }
        return arrayList;
    }

    private final C7813dGh d(String str, String str2) {
        return new C7813dGh.c().c("netflix.com").a("/").e(str).b(str2).c().a().b();
    }
}
