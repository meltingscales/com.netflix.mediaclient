package o;

import com.netflix.cl.model.TrackingInfo;
import o.InterfaceC3825bMa;

/* renamed from: o.ciu  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC6737ciu extends AbstractC6650chM implements InterfaceC3829bMe {
    public drO<? extends TrackingInfo> c;
    private InterfaceC3825bMa.a f;

    @Override // o.InterfaceC3829bMe
    public boolean h(AbstractC3179au abstractC3179au) {
        C8632dsu.c((Object) abstractC3179au, "");
        return true;
    }

    @Override // o.InterfaceC3825bMa
    public InterfaceC3825bMa.a n() {
        return this.f;
    }

    @Override // o.InterfaceC3829bMe
    public drO<TrackingInfo> m() {
        drO dro = this.c;
        if (dro != null) {
            return dro;
        }
        C8632dsu.d("");
        return null;
    }
}
