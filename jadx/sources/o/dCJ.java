package o;

import o.AbstractC7709dCl;

/* loaded from: classes5.dex */
public final class dCJ implements dBT<Byte> {
    public static final dCJ b = new dCJ();
    private static final InterfaceC7707dCj e = new dDV("kotlin.Byte", AbstractC7709dCl.d.a);

    @Override // o.dBT, o.dBZ, o.dBP
    public InterfaceC7707dCj e() {
        return e;
    }

    private dCJ() {
    }

    @Override // o.dBZ
    public /* synthetic */ void e(InterfaceC7721dCx interfaceC7721dCx, Object obj) {
        a(interfaceC7721dCx, ((Number) obj).byteValue());
    }

    public void a(InterfaceC7721dCx interfaceC7721dCx, byte b2) {
        C8632dsu.c((Object) interfaceC7721dCx, "");
        interfaceC7721dCx.b(b2);
    }

    @Override // o.dBP
    /* renamed from: a */
    public Byte b(InterfaceC7720dCw interfaceC7720dCw) {
        C8632dsu.c((Object) interfaceC7720dCw, "");
        return Byte.valueOf(interfaceC7720dCw.a());
    }
}
