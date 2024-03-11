package o;

import o.C1375Yz;

/* loaded from: classes6.dex */
public final class aEP implements InterfaceC5224bui {
    private final C1375Yz.d d;

    public aEP(C1375Yz.d dVar) {
        C8632dsu.c((Object) dVar, "");
        this.d = dVar;
    }

    @Override // o.InterfaceC5224bui
    public String b() {
        C1375Yz.k a;
        C1375Yz.h c;
        C1375Yz.j d = this.d.d();
        if (d == null || (a = d.a()) == null || (c = a.c()) == null) {
            return null;
        }
        return c.e();
    }

    @Override // o.InterfaceC5224bui
    public String d() {
        C1375Yz.k a;
        C1375Yz.m a2;
        C1375Yz.j d = this.d.d();
        if (d == null || (a = d.a()) == null || (a2 = a.a()) == null) {
            return null;
        }
        return a2.a();
    }

    @Override // o.InterfaceC5224bui
    public int c() {
        C1375Yz.k a;
        Integer e;
        C1375Yz.j d = this.d.d();
        if (d == null || (a = d.a()) == null || (e = a.e()) == null) {
            return 0;
        }
        return e.intValue();
    }

    @Override // o.InterfaceC5224bui
    public String e() {
        C1375Yz.k a;
        C1375Yz.j d = this.d.d();
        String num = (d == null || (a = d.a()) == null) ? null : Integer.valueOf(a.b()).toString();
        return num == null ? "" : num;
    }
}
