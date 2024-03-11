package o;

import dagger.hilt.android.scopes.ActivityScoped;
import javax.inject.Inject;

@ActivityScoped
/* renamed from: o.Ww  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1313Ww implements VL {
    private final VF a;
    private final bMT b;
    private final InterfaceC1286Vv d;
    private final VH e;

    @Override // o.VL
    public VF a() {
        return this.a;
    }

    @Override // o.VL
    public VH b() {
        return this.e;
    }

    @Override // o.VL
    public bMT c() {
        return this.b;
    }

    @Override // o.VL
    public InterfaceC1286Vv d() {
        return this.d;
    }

    @Inject
    public C1313Ww(VF vf, VH vh, InterfaceC1286Vv interfaceC1286Vv, bMT bmt) {
        C8632dsu.c((Object) vf, "");
        C8632dsu.c((Object) vh, "");
        C8632dsu.c((Object) interfaceC1286Vv, "");
        C8632dsu.c((Object) bmt, "");
        this.a = vf;
        this.e = vh;
        this.d = interfaceC1286Vv;
        this.b = bmt;
    }
}
