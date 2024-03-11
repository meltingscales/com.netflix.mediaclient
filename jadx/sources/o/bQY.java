package o;

import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.netflix.cl.model.TrackingInfo;
import o.AbstractC6729cim;
import o.InterfaceC3825bMa;
import o.bLR;

/* loaded from: classes4.dex */
public abstract class bQY extends AbstractC6729cim implements bLR<AbstractC6729cim.b>, InterfaceC3829bMe {
    public drO<? extends TrackingInfo> c;
    private int f = -1;

    /* renamed from: o  reason: collision with root package name */
    private InterfaceC3825bMa.a f13533o;

    @Override // o.bLR
    public int e() {
        return this.f;
    }

    @Override // o.InterfaceC3825bMa
    public InterfaceC3825bMa.a n() {
        return this.f13533o;
    }

    public void o_(int i) {
        this.f = i;
    }

    @Override // o.bLR
    public Integer d() {
        return bLR.c.d(this);
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

    @Override // o.AbstractC6729cim, o.AbstractC3336ax, o.AbstractC3073as
    public void e(AbstractC6729cim.b bVar) {
        C8632dsu.c((Object) bVar, "");
        super.e(bVar);
        ConstraintLayout a = bVar.c().a();
        ViewGroup.LayoutParams layoutParams = a.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = -2;
            a.setLayoutParams(layoutParams);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    @Override // o.bLR
    /* renamed from: d */
    public void c(AbstractC6729cim.b bVar) {
        C8632dsu.c((Object) bVar, "");
        AbstractC6729cim.b.getLogTag();
        bVar.g();
    }

    @Override // o.bLR
    /* renamed from: b */
    public void d(AbstractC6729cim.b bVar, boolean z) {
        C8632dsu.c((Object) bVar, "");
        AbstractC6729cim.b.getLogTag();
        AbstractC6729cim.b.a(bVar, false, 1, null);
    }

    @Override // o.InterfaceC3829bMe
    public boolean h(AbstractC3179au abstractC3179au) {
        C8632dsu.c((Object) abstractC3179au, "");
        return ((AbstractC6729cim.b) C9726vo.d(abstractC3179au, AbstractC6729cim.b.class)).c().e();
    }
}
