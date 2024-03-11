package o;

/* renamed from: o.dEt  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7771dEt implements dBT<dpL> {
    public static final C7771dEt e = new C7771dEt();
    private static final InterfaceC7707dCj d = C7738dDn.a("kotlin.ULong", C7706dCi.b(dsB.d));

    @Override // o.dBT, o.dBZ, o.dBP
    public InterfaceC7707dCj e() {
        return d;
    }

    private C7771dEt() {
    }

    @Override // o.dBP
    public /* synthetic */ Object b(InterfaceC7720dCw interfaceC7720dCw) {
        return dpL.e(e(interfaceC7720dCw));
    }

    @Override // o.dBZ
    public /* synthetic */ void e(InterfaceC7721dCx interfaceC7721dCx, Object obj) {
        b(interfaceC7721dCx, ((dpL) obj).a());
    }

    public void b(InterfaceC7721dCx interfaceC7721dCx, long j) {
        C8632dsu.c((Object) interfaceC7721dCx, "");
        interfaceC7721dCx.c(e()).e(j);
    }

    public long e(InterfaceC7720dCw interfaceC7720dCw) {
        C8632dsu.c((Object) interfaceC7720dCw, "");
        return dpL.b(interfaceC7720dCw.a(e()).j());
    }
}
