package o;

import o.AbstractC7709dCl;

/* renamed from: o.dEj  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7761dEj implements dBT<Short> {
    public static final C7761dEj e = new C7761dEj();
    private static final InterfaceC7707dCj d = new dDV("kotlin.Short", AbstractC7709dCl.i.e);

    @Override // o.dBT, o.dBZ, o.dBP
    public InterfaceC7707dCj e() {
        return d;
    }

    private C7761dEj() {
    }

    @Override // o.dBZ
    public /* synthetic */ void e(InterfaceC7721dCx interfaceC7721dCx, Object obj) {
        c(interfaceC7721dCx, ((Number) obj).shortValue());
    }

    public void c(InterfaceC7721dCx interfaceC7721dCx, short s) {
        C8632dsu.c((Object) interfaceC7721dCx, "");
        interfaceC7721dCx.d(s);
    }

    @Override // o.dBP
    /* renamed from: d */
    public Short b(InterfaceC7720dCw interfaceC7720dCw) {
        C8632dsu.c((Object) interfaceC7720dCw, "");
        return Short.valueOf(interfaceC7720dCw.o());
    }
}
