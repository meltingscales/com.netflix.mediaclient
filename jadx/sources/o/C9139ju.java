package o;

import o.InterfaceC8991hE;

/* renamed from: o.ju  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9139ju implements InterfaceC9136jr {
    private final InterfaceC9095jC b;
    private final InterfaceC9095jC c;
    private final dwQ d;

    public C9139ju(InterfaceC9095jC interfaceC9095jC, InterfaceC9095jC interfaceC9095jC2, dwQ dwq) {
        C8632dsu.c((Object) interfaceC9095jC, "");
        C8632dsu.c((Object) interfaceC9095jC2, "");
        C8632dsu.c((Object) dwq, "");
        this.c = interfaceC9095jC;
        this.b = interfaceC9095jC2;
        this.d = dwq;
    }

    @Override // o.InterfaceC9136jr
    public <D extends InterfaceC8991hE.b> dyS<C8954gU<D>> c(C8951gR<D> c8951gR, InterfaceC9135jq interfaceC9135jq) {
        dyS<C8954gU<D>> e;
        C8632dsu.c((Object) c8951gR, "");
        C8632dsu.c((Object) interfaceC9135jq, "");
        InterfaceC8991hE<D> h = c8951gR.h();
        if (h instanceof InterfaceC8999hM) {
            e = this.c.e(c8951gR);
        } else if (h instanceof InterfaceC8990hD) {
            e = this.c.e(c8951gR);
        } else if (!(h instanceof InterfaceC8995hI)) {
            throw new IllegalStateException("".toString());
        } else {
            e = this.b.e(c8951gR);
        }
        return dyR.a(e, this.d);
    }
}
