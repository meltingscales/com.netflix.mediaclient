package o;

import java.util.List;

/* renamed from: o.jF  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9098jF implements InterfaceC9102jJ {
    private final int a;
    private final List<InterfaceC9103jK> d;

    /* JADX WARN: Multi-variable type inference failed */
    public C9098jF(List<? extends InterfaceC9103jK> list, int i) {
        C8632dsu.c((Object) list, "");
        this.d = list;
        this.a = i;
    }

    @Override // o.InterfaceC9102jJ
    public Object a(C9008hV c9008hV, InterfaceC8585dra<? super C9009hW> interfaceC8585dra) {
        if (this.a >= this.d.size()) {
            throw new IllegalStateException("Check failed.".toString());
        }
        return this.d.get(this.a).e(c9008hV, new C9098jF(this.d, this.a + 1), interfaceC8585dra);
    }
}
