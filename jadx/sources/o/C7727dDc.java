package o;

import o.AbstractC7709dCl;

/* renamed from: o.dDc  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7727dDc implements dBT<Float> {
    public static final C7727dDc b = new C7727dDc();
    private static final InterfaceC7707dCj a = new dDV("kotlin.Float", AbstractC7709dCl.c.b);

    @Override // o.dBT, o.dBZ, o.dBP
    public InterfaceC7707dCj e() {
        return a;
    }

    private C7727dDc() {
    }

    @Override // o.dBZ
    public /* synthetic */ void e(InterfaceC7721dCx interfaceC7721dCx, Object obj) {
        a(interfaceC7721dCx, ((Number) obj).floatValue());
    }

    public void a(InterfaceC7721dCx interfaceC7721dCx, float f) {
        C8632dsu.c((Object) interfaceC7721dCx, "");
        interfaceC7721dCx.a(f);
    }

    @Override // o.dBP
    /* renamed from: d */
    public Float b(InterfaceC7720dCw interfaceC7720dCw) {
        C8632dsu.c((Object) interfaceC7720dCw, "");
        return Float.valueOf(interfaceC7720dCw.b());
    }
}
