package o;

import o.AbstractC7709dCl;

/* renamed from: o.dDm  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7737dDm implements dBT<Integer> {
    public static final C7737dDm a = new C7737dDm();
    private static final InterfaceC7707dCj d = new dDV("kotlin.Int", AbstractC7709dCl.j.e);

    @Override // o.dBT, o.dBZ, o.dBP
    public InterfaceC7707dCj e() {
        return d;
    }

    private C7737dDm() {
    }

    @Override // o.dBZ
    public /* synthetic */ void e(InterfaceC7721dCx interfaceC7721dCx, Object obj) {
        e(interfaceC7721dCx, ((Number) obj).intValue());
    }

    public void e(InterfaceC7721dCx interfaceC7721dCx, int i) {
        C8632dsu.c((Object) interfaceC7721dCx, "");
        interfaceC7721dCx.b(i);
    }

    @Override // o.dBP
    /* renamed from: d */
    public Integer b(InterfaceC7720dCw interfaceC7720dCw) {
        C8632dsu.c((Object) interfaceC7720dCw, "");
        return Integer.valueOf(interfaceC7720dCw.f());
    }
}
