package o;

import o.AbstractC7709dCl;

/* loaded from: classes5.dex */
public final class dDF implements dBT<Long> {
    public static final dDF a = new dDF();
    private static final InterfaceC7707dCj e = new dDV("kotlin.Long", AbstractC7709dCl.h.c);

    @Override // o.dBT, o.dBZ, o.dBP
    public InterfaceC7707dCj e() {
        return e;
    }

    private dDF() {
    }

    @Override // o.dBZ
    public /* synthetic */ void e(InterfaceC7721dCx interfaceC7721dCx, Object obj) {
        b(interfaceC7721dCx, ((Number) obj).longValue());
    }

    public void b(InterfaceC7721dCx interfaceC7721dCx, long j) {
        C8632dsu.c((Object) interfaceC7721dCx, "");
        interfaceC7721dCx.e(j);
    }

    @Override // o.dBP
    /* renamed from: d */
    public Long b(InterfaceC7720dCw interfaceC7720dCw) {
        C8632dsu.c((Object) interfaceC7720dCw, "");
        return Long.valueOf(interfaceC7720dCw.j());
    }
}
