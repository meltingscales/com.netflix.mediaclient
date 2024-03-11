package o;

import o.AbstractC7709dCl;

/* loaded from: classes5.dex */
public final class dEM implements dBT<dEJ> {
    public static final dEM b = new dEM();
    private static final InterfaceC7707dCj c = C7713dCp.b("kotlinx.serialization.json.JsonLiteral", AbstractC7709dCl.f.e);

    @Override // o.dBT, o.dBZ, o.dBP
    public InterfaceC7707dCj e() {
        return c;
    }

    private dEM() {
    }

    @Override // o.dBZ
    /* renamed from: b */
    public void e(InterfaceC7721dCx interfaceC7721dCx, dEJ dej) {
        Long m;
        Double j;
        Boolean k;
        C8632dsu.c((Object) interfaceC7721dCx, "");
        C8632dsu.c((Object) dej, "");
        dEE.e(interfaceC7721dCx);
        if (dej.e()) {
            interfaceC7721dCx.e(dej.d());
        } else if (dej.c() != null) {
            interfaceC7721dCx.c(dej.c()).e(dej.d());
        } else {
            m = C8689dux.m(dej.d());
            if (m != null) {
                interfaceC7721dCx.e(m.longValue());
                return;
            }
            dpL h = duA.h(dej.d());
            if (h != null) {
                interfaceC7721dCx.c(C7706dCi.a(dpL.c).e()).e(h.a());
                return;
            }
            j = C8690duy.j(dej.d());
            if (j != null) {
                interfaceC7721dCx.c(j.doubleValue());
                return;
            }
            k = duD.k(dej.d());
            if (k != null) {
                interfaceC7721dCx.c(k.booleanValue());
            } else {
                interfaceC7721dCx.e(dej.d());
            }
        }
    }

    @Override // o.dBP
    /* renamed from: c */
    public dEJ b(InterfaceC7720dCw interfaceC7720dCw) {
        C8632dsu.c((Object) interfaceC7720dCw, "");
        dEI l = dEE.e(interfaceC7720dCw).l();
        if (!(l instanceof dEJ)) {
            throw C7797dFs.a(-1, "Unexpected JSON element, expected JsonLiteral, had " + dsA.a(l.getClass()), l.toString());
        }
        return (dEJ) l;
    }
}
