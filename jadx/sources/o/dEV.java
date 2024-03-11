package o;

import o.AbstractC7709dCl;

/* loaded from: classes5.dex */
public final class dEV implements dBT<dET> {
    public static final dEV e = new dEV();
    private static final InterfaceC7707dCj d = C7713dCp.b("kotlinx.serialization.json.JsonPrimitive", AbstractC7709dCl.f.e, new InterfaceC7707dCj[0], null, 8, null);

    @Override // o.dBT, o.dBZ, o.dBP
    public InterfaceC7707dCj e() {
        return d;
    }

    private dEV() {
    }

    @Override // o.dBZ
    public void e(InterfaceC7721dCx interfaceC7721dCx, dET det) {
        C8632dsu.c((Object) interfaceC7721dCx, "");
        C8632dsu.c((Object) det, "");
        dEE.e(interfaceC7721dCx);
        if (det instanceof dEQ) {
            interfaceC7721dCx.e(dER.b, dEQ.INSTANCE);
        } else {
            interfaceC7721dCx.e(dEM.b, (dEJ) det);
        }
    }

    @Override // o.dBP
    /* renamed from: d */
    public dET b(InterfaceC7720dCw interfaceC7720dCw) {
        C8632dsu.c((Object) interfaceC7720dCw, "");
        dEI l = dEE.e(interfaceC7720dCw).l();
        if (!(l instanceof dET)) {
            throw C7797dFs.a(-1, "Unexpected JSON element, expected JsonPrimitive, had " + dsA.a(l.getClass()), l.toString());
        }
        return (dET) l;
    }
}
