package o;

import o.AbstractC7709dCl;

/* renamed from: o.dDb  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7726dDb implements dBT<duI> {
    public static final C7726dDb d = new C7726dDb();
    private static final InterfaceC7707dCj e = new dDV("kotlin.time.Duration", AbstractC7709dCl.f.e);

    @Override // o.dBT, o.dBZ, o.dBP
    public InterfaceC7707dCj e() {
        return e;
    }

    private C7726dDb() {
    }

    @Override // o.dBP
    public /* synthetic */ Object b(InterfaceC7720dCw interfaceC7720dCw) {
        return duI.e(a(interfaceC7720dCw));
    }

    @Override // o.dBZ
    public /* synthetic */ void e(InterfaceC7721dCx interfaceC7721dCx, Object obj) {
        e(interfaceC7721dCx, ((duI) obj).c());
    }

    public void e(InterfaceC7721dCx interfaceC7721dCx, long j) {
        C8632dsu.c((Object) interfaceC7721dCx, "");
        interfaceC7721dCx.e(duI.s(j));
    }

    public long a(InterfaceC7720dCw interfaceC7720dCw) {
        C8632dsu.c((Object) interfaceC7720dCw, "");
        return duI.d.d(interfaceC7720dCw.m());
    }
}
