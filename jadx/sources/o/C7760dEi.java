package o;

import o.AbstractC7709dCl;

/* renamed from: o.dEi  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7760dEi implements dBT<String> {
    public static final C7760dEi b = new C7760dEi();
    private static final InterfaceC7707dCj d = new dDV("kotlin.String", AbstractC7709dCl.f.e);

    @Override // o.dBT, o.dBZ, o.dBP
    public InterfaceC7707dCj e() {
        return d;
    }

    private C7760dEi() {
    }

    @Override // o.dBZ
    /* renamed from: c */
    public void e(InterfaceC7721dCx interfaceC7721dCx, String str) {
        C8632dsu.c((Object) interfaceC7721dCx, "");
        C8632dsu.c((Object) str, "");
        interfaceC7721dCx.e(str);
    }

    @Override // o.dBP
    /* renamed from: d */
    public String b(InterfaceC7720dCw interfaceC7720dCw) {
        C8632dsu.c((Object) interfaceC7720dCw, "");
        return interfaceC7720dCw.m();
    }
}
