package o;

import java.lang.ref.WeakReference;
import o.InterfaceC5344bww;

/* renamed from: o.bFz  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3657bFz implements InterfaceC5344bww {
    private WeakReference<InterfaceC5344bww.d> c;

    @Override // o.InterfaceC5344bww
    public void d(InterfaceC5344bww.d dVar) {
        C8632dsu.c((Object) dVar, "");
        this.c = new WeakReference<>(dVar);
    }

    @Override // o.InterfaceC5344bww
    public void c(InterfaceC5344bww.d dVar) {
        C8632dsu.c((Object) dVar, "");
        if (C8632dsu.c(c(), dVar)) {
            this.c = null;
        }
    }

    public InterfaceC5344bww.d c() {
        WeakReference<InterfaceC5344bww.d> weakReference = this.c;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }
}
