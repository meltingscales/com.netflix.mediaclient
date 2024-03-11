package o;

import dagger.hilt.android.scopes.ActivityScoped;
import javax.inject.Inject;

@ActivityScoped
/* renamed from: o.Wy  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1315Wy implements VK {
    private final InterfaceC1285Vu a;
    private final VG d;
    private final InterfaceC1284Vt e;

    @Override // o.VK
    public InterfaceC1284Vt a() {
        return this.e;
    }

    @Override // o.VK
    public InterfaceC1285Vu b() {
        return this.a;
    }

    @Override // o.VK
    public VG d() {
        return this.d;
    }

    @Inject
    public C1315Wy(VG vg, InterfaceC1284Vt interfaceC1284Vt, InterfaceC1285Vu interfaceC1285Vu) {
        C8632dsu.c((Object) vg, "");
        C8632dsu.c((Object) interfaceC1284Vt, "");
        C8632dsu.c((Object) interfaceC1285Vu, "");
        this.d = vg;
        this.e = interfaceC1284Vt;
        this.a = interfaceC1285Vu;
    }
}
