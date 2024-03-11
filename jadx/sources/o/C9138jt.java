package o;

import java.util.List;
import o.InterfaceC8991hE;

/* renamed from: o.jt  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9138jt implements InterfaceC9135jq {
    private final List<InterfaceC9136jr> c;
    private final int d;

    /* JADX WARN: Multi-variable type inference failed */
    public C9138jt(List<? extends InterfaceC9136jr> list, int i) {
        C8632dsu.c((Object) list, "");
        this.c = list;
        this.d = i;
    }

    @Override // o.InterfaceC9135jq
    public <D extends InterfaceC8991hE.b> dyS<C8954gU<D>> a(C8951gR<D> c8951gR) {
        C8632dsu.c((Object) c8951gR, "");
        if (this.d >= this.c.size()) {
            throw new IllegalStateException("Check failed.".toString());
        }
        return this.c.get(this.d).c(c8951gR, new C9138jt(this.c, this.d + 1));
    }
}
