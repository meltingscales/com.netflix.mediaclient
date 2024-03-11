package o;

import o.AbstractC7709dCl;

/* loaded from: classes5.dex */
public final class dCD implements dBT<Boolean> {
    public static final dCD a = new dCD();
    private static final InterfaceC7707dCj b = new dDV("kotlin.Boolean", AbstractC7709dCl.b.b);

    @Override // o.dBT, o.dBZ, o.dBP
    public InterfaceC7707dCj e() {
        return b;
    }

    private dCD() {
    }

    @Override // o.dBZ
    public /* synthetic */ void e(InterfaceC7721dCx interfaceC7721dCx, Object obj) {
        d(interfaceC7721dCx, ((Boolean) obj).booleanValue());
    }

    public void d(InterfaceC7721dCx interfaceC7721dCx, boolean z) {
        C8632dsu.c((Object) interfaceC7721dCx, "");
        interfaceC7721dCx.c(z);
    }

    @Override // o.dBP
    /* renamed from: d */
    public Boolean b(InterfaceC7720dCw interfaceC7720dCw) {
        C8632dsu.c((Object) interfaceC7720dCw, "");
        return Boolean.valueOf(interfaceC7720dCw.c());
    }
}
