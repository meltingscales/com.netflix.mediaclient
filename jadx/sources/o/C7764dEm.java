package o;

/* renamed from: o.dEm  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7764dEm implements dBT<dpF> {
    public static final C7764dEm e = new C7764dEm();
    private static final InterfaceC7707dCj c = C7738dDn.a("kotlin.UByte", C7706dCi.a(C8623dsl.a));

    @Override // o.dBT, o.dBZ, o.dBP
    public InterfaceC7707dCj e() {
        return c;
    }

    private C7764dEm() {
    }

    @Override // o.dBP
    public /* synthetic */ Object b(InterfaceC7720dCw interfaceC7720dCw) {
        return dpF.e(e(interfaceC7720dCw));
    }

    @Override // o.dBZ
    public /* synthetic */ void e(InterfaceC7721dCx interfaceC7721dCx, Object obj) {
        d(interfaceC7721dCx, ((dpF) obj).c());
    }

    public void d(InterfaceC7721dCx interfaceC7721dCx, byte b) {
        C8632dsu.c((Object) interfaceC7721dCx, "");
        interfaceC7721dCx.c(e()).b(b);
    }

    public byte e(InterfaceC7720dCw interfaceC7720dCw) {
        C8632dsu.c((Object) interfaceC7720dCw, "");
        return dpF.a(interfaceC7720dCw.a(e()).a());
    }
}
