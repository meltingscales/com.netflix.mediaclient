package o;

import o.AbstractC7709dCl;

/* loaded from: classes5.dex */
public final class dCZ implements dBT<Double> {
    public static final dCZ e = new dCZ();
    private static final InterfaceC7707dCj b = new dDV("kotlin.Double", AbstractC7709dCl.e.e);

    @Override // o.dBT, o.dBZ, o.dBP
    public InterfaceC7707dCj e() {
        return b;
    }

    private dCZ() {
    }

    @Override // o.dBZ
    public /* synthetic */ void e(InterfaceC7721dCx interfaceC7721dCx, Object obj) {
        c(interfaceC7721dCx, ((Number) obj).doubleValue());
    }

    public void c(InterfaceC7721dCx interfaceC7721dCx, double d) {
        C8632dsu.c((Object) interfaceC7721dCx, "");
        interfaceC7721dCx.c(d);
    }

    @Override // o.dBP
    /* renamed from: c */
    public Double b(InterfaceC7720dCw interfaceC7720dCw) {
        C8632dsu.c((Object) interfaceC7720dCw, "");
        return Double.valueOf(interfaceC7720dCw.d());
    }
}
