package o;

import kotlinx.serialization.json.internal.JsonElementMarker$origin$1;

/* renamed from: o.dFt  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7798dFt {
    private boolean a;
    private final dCX d;

    public final boolean c() {
        return this.a;
    }

    public C7798dFt(InterfaceC7707dCj interfaceC7707dCj) {
        C8632dsu.c((Object) interfaceC7707dCj, "");
        this.d = new dCX(interfaceC7707dCj, new JsonElementMarker$origin$1(this));
    }

    public final void a(int i) {
        this.d.a(i);
    }

    public final int d() {
        return this.d.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean d(InterfaceC7707dCj interfaceC7707dCj, int i) {
        boolean z = !interfaceC7707dCj.e(i) && interfaceC7707dCj.c(i).i();
        this.a = z;
        return z;
    }
}
