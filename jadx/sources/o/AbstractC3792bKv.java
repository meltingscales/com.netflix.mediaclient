package o;

import com.netflix.cl.model.AppView;
import com.netflix.cl.model.TrackingInfo;
import o.InterfaceC3825bMa;

/* renamed from: o.bKv  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3792bKv extends bJG implements InterfaceC3829bMe {
    public drO<? extends TrackingInfo> b;
    private InterfaceC3825bMa.a c;
    private AppView d = AppView.errorDialog;

    @Override // o.InterfaceC3829bMe
    public AppView aj_() {
        return this.d;
    }

    @Override // o.InterfaceC3829bMe
    public boolean h(AbstractC3179au abstractC3179au) {
        C8632dsu.c((Object) abstractC3179au, "");
        return true;
    }

    @Override // o.InterfaceC3825bMa
    public InterfaceC3825bMa.a n() {
        return this.c;
    }

    @Override // o.InterfaceC3829bMe
    public drO<TrackingInfo> m() {
        drO dro = this.b;
        if (dro != null) {
            return dro;
        }
        C8632dsu.d("");
        return null;
    }
}
