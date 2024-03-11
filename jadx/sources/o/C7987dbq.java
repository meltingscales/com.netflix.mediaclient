package o;

import android.view.ViewParent;
import com.netflix.cl.model.AppView;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import o.AbstractC3073as;
import o.AbstractC7985dbo;
import o.InterfaceC3825bMa;

/* renamed from: o.dbq  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C7987dbq extends AbstractC7985dbo implements InterfaceC1673aK<AbstractC7985dbo.c>, InterfaceC7988dbr {
    private InterfaceC4573bh<C7987dbq, AbstractC7985dbo.c> f;
    private InterfaceC4467bf<C7987dbq, AbstractC7985dbo.c> g;
    private InterfaceC4732bk<C7987dbq, AbstractC7985dbo.c> h;
    private InterfaceC4414be<C7987dbq, AbstractC7985dbo.c> i;

    @Override // o.InterfaceC1673aK
    /* renamed from: a */
    public void e(C1511aE c1511aE, AbstractC7985dbo.c cVar, int i) {
    }

    @Override // o.InterfaceC7988dbr
    public /* synthetic */ InterfaceC7988dbr a(InterfaceC4467bf interfaceC4467bf) {
        return c((InterfaceC4467bf<C7987dbq, AbstractC7985dbo.c>) interfaceC4467bf);
    }

    @Override // o.InterfaceC7988dbr
    public /* synthetic */ InterfaceC7988dbr a(InterfaceC4732bk interfaceC4732bk) {
        return e((InterfaceC4732bk<C7987dbq, AbstractC7985dbo.c>) interfaceC4732bk);
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: c */
    public void a(AbstractC7985dbo.c cVar, int i) {
        InterfaceC4467bf<C7987dbq, AbstractC7985dbo.c> interfaceC4467bf = this.g;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, cVar, i);
        }
    }

    public C7987dbq c(InterfaceC4467bf<C7987dbq, AbstractC7985dbo.c> interfaceC4467bf) {
        h();
        this.g = interfaceC4467bf;
        return this;
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: a */
    public void e(AbstractC7985dbo.c cVar) {
        super.b((C7987dbq) cVar);
        InterfaceC4414be<C7987dbq, AbstractC7985dbo.c> interfaceC4414be = this.i;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, cVar);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: d */
    public void c(int i, AbstractC7985dbo.c cVar) {
        InterfaceC4732bk<C7987dbq, AbstractC7985dbo.c> interfaceC4732bk = this.h;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, cVar, i);
        }
        super.a(i, (int) cVar);
    }

    public C7987dbq e(InterfaceC4732bk<C7987dbq, AbstractC7985dbo.c> interfaceC4732bk) {
        h();
        this.h = interfaceC4732bk;
        return this;
    }

    @Override // o.AbstractC3336ax
    /* renamed from: b */
    public void d(float f, float f2, int i, int i2, AbstractC7985dbo.c cVar) {
        InterfaceC4573bh<C7987dbq, AbstractC7985dbo.c> interfaceC4573bh = this.f;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, cVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, cVar);
    }

    @Override // o.InterfaceC7988dbr
    /* renamed from: a */
    public C7987dbq d(InterfaceC3825bMa.a aVar) {
        h();
        super.e(aVar);
        return this;
    }

    @Override // o.InterfaceC7988dbr
    /* renamed from: d */
    public C7987dbq b(InterfaceC5179btq interfaceC5179btq) {
        h();
        ((AbstractC7985dbo) this).b = interfaceC5179btq;
        return this;
    }

    @Override // o.InterfaceC7988dbr
    /* renamed from: b */
    public C7987dbq e(TrackingInfoHolder trackingInfoHolder) {
        h();
        this.c = trackingInfoHolder;
        return this;
    }

    @Override // o.InterfaceC7988dbr
    /* renamed from: d */
    public C7987dbq b(int i) {
        h();
        super.w_(i);
        return this;
    }

    @Override // o.InterfaceC7988dbr
    /* renamed from: b */
    public C7987dbq e(AppView appView) {
        h();
        ((AbstractC7985dbo) this).d = appView;
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: d */
    public C7987dbq e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.InterfaceC7988dbr
    /* renamed from: b */
    public C7987dbq d(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: e */
    public C7987dbq a(int i) {
        super.a(i);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: e */
    public C7987dbq a(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: d */
    public AbstractC7985dbo.c b(ViewParent viewParent) {
        return new AbstractC7985dbo.c();
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C7987dbq) && super.equals(obj)) {
            C7987dbq c7987dbq = (C7987dbq) obj;
            if ((this.g == null) != (c7987dbq.g == null)) {
                return false;
            }
            if ((this.i == null) != (c7987dbq.i == null)) {
                return false;
            }
            if ((this.h == null) != (c7987dbq.h == null)) {
                return false;
            }
            if ((this.f == null) != (c7987dbq.f == null)) {
                return false;
            }
            if (n() == null ? c7987dbq.n() == null : n().equals(c7987dbq.n())) {
                if ((((AbstractC7985dbo) this).b == null) != (((AbstractC7985dbo) c7987dbq).b == null)) {
                    return false;
                }
                if ((this.c == null) == (c7987dbq.c == null) && r() == c7987dbq.r() && l() == c7987dbq.l()) {
                    AppView appView = ((AbstractC7985dbo) this).d;
                    if (appView == null ? ((AbstractC7985dbo) c7987dbq).d == null : appView.equals(((AbstractC7985dbo) c7987dbq).d)) {
                        return o() == null ? c7987dbq.o() == null : o().equals(c7987dbq.o());
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
        int i = this.g != null ? 1 : 0;
        int i2 = this.i != null ? 1 : 0;
        int i3 = this.h != null ? 1 : 0;
        int i4 = this.f != null ? 1 : 0;
        int hashCode2 = n() != null ? n().hashCode() : 0;
        int i5 = ((AbstractC7985dbo) this).b != null ? 1 : 0;
        int i6 = this.c == null ? 0 : 1;
        int r = r();
        boolean l = l();
        AppView appView = ((AbstractC7985dbo) this).d;
        return (((((((((((((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + hashCode2) * 31) + i5) * 31) + i6) * 31) + r) * 31) + (l ? 1 : 0)) * 31) + (appView != null ? appView.hashCode() : 0)) * 31) + (o() != null ? o().hashCode() : 0);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "ContinueWatchingModel_{impressionInfo=" + n() + ", continueWatching=" + ((AbstractC7985dbo) this).b + ", trackingInfoHolder=" + this.c + ", videoPosition=" + r() + ", onFirstPage=" + l() + ", appView=" + ((AbstractC7985dbo) this).d + ", liveState=" + o() + "}" + super.toString();
    }
}
