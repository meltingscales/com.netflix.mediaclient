package o;

import dagger.hilt.android.scopes.ActivityScoped;
import javax.inject.Inject;

@ActivityScoped
/* renamed from: o.Wt  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1310Wt implements VE {
    private final VC c;
    private final InterfaceC1290Vz d;

    @Override // o.VE
    public VC b() {
        return this.c;
    }

    @Override // o.VE
    public InterfaceC1290Vz c() {
        return this.d;
    }

    @Inject
    public C1310Wt(VC vc, InterfaceC1290Vz interfaceC1290Vz) {
        C8632dsu.c((Object) vc, "");
        C8632dsu.c((Object) interfaceC1290Vz, "");
        this.c = vc;
        this.d = interfaceC1290Vz;
    }
}
