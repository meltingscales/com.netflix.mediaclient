package o;

/* renamed from: o.dEp  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7767dEp implements dBT<dpJ> {
    public static final C7767dEp d = new C7767dEp();
    private static final InterfaceC7707dCj a = C7738dDn.a("kotlin.UInt", C7706dCi.e(C8634dsw.d));

    @Override // o.dBT, o.dBZ, o.dBP
    public InterfaceC7707dCj e() {
        return a;
    }

    private C7767dEp() {
    }

    @Override // o.dBP
    public /* synthetic */ Object b(InterfaceC7720dCw interfaceC7720dCw) {
        return dpJ.a(e(interfaceC7720dCw));
    }

    @Override // o.dBZ
    public /* synthetic */ void e(InterfaceC7721dCx interfaceC7721dCx, Object obj) {
        c(interfaceC7721dCx, ((dpJ) obj).a());
    }

    public void c(InterfaceC7721dCx interfaceC7721dCx, int i) {
        C8632dsu.c((Object) interfaceC7721dCx, "");
        interfaceC7721dCx.c(e()).b(i);
    }

    public int e(InterfaceC7720dCw interfaceC7720dCw) {
        C8632dsu.c((Object) interfaceC7720dCw, "");
        return dpJ.c(interfaceC7720dCw.a(e()).f());
    }
}
