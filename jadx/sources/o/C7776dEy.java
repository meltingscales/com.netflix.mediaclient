package o;

/* renamed from: o.dEy  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7776dEy implements dBT<dpO> {
    public static final C7776dEy c = new C7776dEy();
    private static final InterfaceC7707dCj b = C7738dDn.a("kotlin.UShort", C7706dCi.a(dsF.d));

    @Override // o.dBT, o.dBZ, o.dBP
    public InterfaceC7707dCj e() {
        return b;
    }

    private C7776dEy() {
    }

    @Override // o.dBP
    public /* synthetic */ Object b(InterfaceC7720dCw interfaceC7720dCw) {
        return dpO.a(a(interfaceC7720dCw));
    }

    @Override // o.dBZ
    public /* synthetic */ void e(InterfaceC7721dCx interfaceC7721dCx, Object obj) {
        c(interfaceC7721dCx, ((dpO) obj).c());
    }

    public void c(InterfaceC7721dCx interfaceC7721dCx, short s) {
        C8632dsu.c((Object) interfaceC7721dCx, "");
        interfaceC7721dCx.c(e()).d(s);
    }

    public short a(InterfaceC7720dCw interfaceC7720dCw) {
        C8632dsu.c((Object) interfaceC7720dCw, "");
        return dpO.c(interfaceC7720dCw.a(e()).o());
    }
}
