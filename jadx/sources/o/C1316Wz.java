package o;

import dagger.hilt.android.scopes.ActivityScoped;
import javax.inject.Inject;

@ActivityScoped
/* renamed from: o.Wz  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1316Wz implements VJ {
    private final InterfaceC1289Vy a;
    private final VD c;
    private final InterfaceC1288Vx e;

    @Override // o.VJ
    public InterfaceC1289Vy a() {
        return this.a;
    }

    @Override // o.VJ
    public InterfaceC1288Vx b() {
        return this.e;
    }

    @Override // o.VJ
    public VD e() {
        return this.c;
    }

    @Inject
    public C1316Wz(InterfaceC1289Vy interfaceC1289Vy, VD vd, InterfaceC1288Vx interfaceC1288Vx) {
        C8632dsu.c((Object) interfaceC1289Vy, "");
        C8632dsu.c((Object) vd, "");
        C8632dsu.c((Object) interfaceC1288Vx, "");
        this.a = interfaceC1289Vy;
        this.c = vd;
        this.e = interfaceC1288Vx;
    }
}
