package o;

import android.view.ViewParent;
import com.netflix.cl.model.AppView;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.mediaclient.servicemgr.interface_.details.LiveState;
import o.AbstractC3073as;
import o.AbstractC4072bVe;
import o.InterfaceC3825bMa;

/* renamed from: o.bVb  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4069bVb extends AbstractC4072bVe implements InterfaceC1673aK<AbstractC4072bVe.d>, InterfaceC4071bVd {
    private InterfaceC4414be<C4069bVb, AbstractC4072bVe.d> f;
    private InterfaceC4732bk<C4069bVb, AbstractC4072bVe.d> g;
    private InterfaceC4467bf<C4069bVb, AbstractC4072bVe.d> h;
    private InterfaceC4573bh<C4069bVb, AbstractC4072bVe.d> i;

    @Override // o.InterfaceC1673aK
    /* renamed from: d */
    public void e(C1511aE c1511aE, AbstractC4072bVe.d dVar, int i) {
    }

    @Override // o.InterfaceC4071bVd
    public /* synthetic */ InterfaceC4071bVd a(InterfaceC4732bk interfaceC4732bk) {
        return c((InterfaceC4732bk<C4069bVb, AbstractC4072bVe.d>) interfaceC4732bk);
    }

    @Override // o.InterfaceC4071bVd
    public /* synthetic */ InterfaceC4071bVd b(InterfaceC4467bf interfaceC4467bf) {
        return d((InterfaceC4467bf<C4069bVb, AbstractC4072bVe.d>) interfaceC4467bf);
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: e */
    public void a(AbstractC4072bVe.d dVar, int i) {
        InterfaceC4467bf<C4069bVb, AbstractC4072bVe.d> interfaceC4467bf = this.h;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, dVar, i);
        }
    }

    public C4069bVb d(InterfaceC4467bf<C4069bVb, AbstractC4072bVe.d> interfaceC4467bf) {
        h();
        this.h = interfaceC4467bf;
        return this;
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: b  reason: avoid collision after fix types in other method */
    public void e(AbstractC4072bVe.d dVar) {
        super.b((C4069bVb) dVar);
        InterfaceC4414be<C4069bVb, AbstractC4072bVe.d> interfaceC4414be = this.f;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, dVar);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: d */
    public void c(int i, AbstractC4072bVe.d dVar) {
        InterfaceC4732bk<C4069bVb, AbstractC4072bVe.d> interfaceC4732bk = this.g;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, dVar, i);
        }
        super.a(i, (int) dVar);
    }

    public C4069bVb c(InterfaceC4732bk<C4069bVb, AbstractC4072bVe.d> interfaceC4732bk) {
        h();
        this.g = interfaceC4732bk;
        return this;
    }

    @Override // o.AbstractC3336ax
    /* renamed from: c */
    public void d(float f, float f2, int i, int i2, AbstractC4072bVe.d dVar) {
        InterfaceC4573bh<C4069bVb, AbstractC4072bVe.d> interfaceC4573bh = this.i;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, dVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, dVar);
    }

    @Override // o.InterfaceC4071bVd
    /* renamed from: a */
    public C4069bVb d(InterfaceC3825bMa.a aVar) {
        h();
        super.e(aVar);
        return this;
    }

    @Override // o.InterfaceC4071bVd
    /* renamed from: e */
    public C4069bVb c(InterfaceC5179btq interfaceC5179btq) {
        h();
        this.c = interfaceC5179btq;
        return this;
    }

    @Override // o.InterfaceC4071bVd
    /* renamed from: a */
    public C4069bVb e(TrackingInfoHolder trackingInfoHolder) {
        h();
        ((AbstractC4072bVe) this).d = trackingInfoHolder;
        return this;
    }

    @Override // o.InterfaceC4071bVd
    /* renamed from: d */
    public C4069bVb e(int i) {
        h();
        super.b(i);
        return this;
    }

    @Override // o.InterfaceC4071bVd
    /* renamed from: d */
    public C4069bVb b(AppView appView) {
        h();
        ((AbstractC4072bVe) this).b = appView;
        return this;
    }

    @Override // o.InterfaceC4071bVd
    /* renamed from: c */
    public C4069bVb b(LiveState liveState) {
        h();
        super.d(liveState);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: c */
    public C4069bVb e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.InterfaceC4071bVd
    /* renamed from: d */
    public C4069bVb c(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: c */
    public C4069bVb a(int i) {
        super.a(i);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: e */
    public C4069bVb a(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: d */
    public AbstractC4072bVe.d b(ViewParent viewParent) {
        return new AbstractC4072bVe.d();
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C4069bVb) && super.equals(obj)) {
            C4069bVb c4069bVb = (C4069bVb) obj;
            if ((this.h == null) != (c4069bVb.h == null)) {
                return false;
            }
            if ((this.f == null) != (c4069bVb.f == null)) {
                return false;
            }
            if ((this.g == null) != (c4069bVb.g == null)) {
                return false;
            }
            if ((this.i == null) != (c4069bVb.i == null)) {
                return false;
            }
            if (n() == null ? c4069bVb.n() == null : n().equals(c4069bVb.n())) {
                if ((this.c == null) != (c4069bVb.c == null)) {
                    return false;
                }
                if ((((AbstractC4072bVe) this).d == null) == (((AbstractC4072bVe) c4069bVb).d == null) && q() == c4069bVb.q() && k() == c4069bVb.k()) {
                    AppView appView = ((AbstractC4072bVe) this).b;
                    if (appView == null ? ((AbstractC4072bVe) c4069bVb).b == null : appView.equals(((AbstractC4072bVe) c4069bVb).b)) {
                        return l() == null ? c4069bVb.l() == null : l().equals(c4069bVb.l());
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override // o.AbstractC3073as
    public int hashCode() {
        int hashCode = super.hashCode();
        int i = this.h != null ? 1 : 0;
        int i2 = this.f != null ? 1 : 0;
        int i3 = this.g != null ? 1 : 0;
        int i4 = this.i != null ? 1 : 0;
        int hashCode2 = n() != null ? n().hashCode() : 0;
        int i5 = this.c != null ? 1 : 0;
        int i6 = ((AbstractC4072bVe) this).d == null ? 0 : 1;
        int q = q();
        boolean k = k();
        AppView appView = ((AbstractC4072bVe) this).b;
        return (((((((((((((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + hashCode2) * 31) + i5) * 31) + i6) * 31) + q) * 31) + (k ? 1 : 0)) * 31) + (appView != null ? appView.hashCode() : 0)) * 31) + (l() != null ? l().hashCode() : 0);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "ContinueWatchingModel_{impressionInfo=" + n() + ", continueWatching=" + this.c + ", trackingInfoHolder=" + ((AbstractC4072bVe) this).d + ", videoPosition=" + q() + ", onFirstPage=" + k() + ", appView=" + ((AbstractC4072bVe) this).b + ", liveState=" + l() + "}" + super.toString();
    }
}
