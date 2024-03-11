package o;

import o.AbstractC7709dCl;

/* loaded from: classes5.dex */
public final class dCN implements dBT<Character> {
    public static final dCN c = new dCN();
    private static final InterfaceC7707dCj a = new dDV("kotlin.Char", AbstractC7709dCl.a.c);

    @Override // o.dBT, o.dBZ, o.dBP
    public InterfaceC7707dCj e() {
        return a;
    }

    private dCN() {
    }

    @Override // o.dBZ
    public /* synthetic */ void e(InterfaceC7721dCx interfaceC7721dCx, Object obj) {
        e(interfaceC7721dCx, ((Character) obj).charValue());
    }

    public void e(InterfaceC7721dCx interfaceC7721dCx, char c2) {
        C8632dsu.c((Object) interfaceC7721dCx, "");
        interfaceC7721dCx.d(c2);
    }

    @Override // o.dBP
    /* renamed from: d */
    public Character b(InterfaceC7720dCw interfaceC7720dCw) {
        C8632dsu.c((Object) interfaceC7720dCw, "");
        return Character.valueOf(interfaceC7720dCw.e());
    }
}
