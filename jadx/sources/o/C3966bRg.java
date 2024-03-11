package o;

import android.view.View;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.TrackingInfo;
import o.AbstractC3073as;
import o.InterfaceC3825bMa;

/* renamed from: o.bRg  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C3966bRg extends AbstractC3963bRd implements InterfaceC1673aK<C2077aZ>, InterfaceC3965bRf {
    private InterfaceC4414be<C3966bRg, C2077aZ> f;
    private InterfaceC4573bh<C3966bRg, C2077aZ> g;
    private InterfaceC4732bk<C3966bRg, C2077aZ> h;
    private InterfaceC4467bf<C3966bRg, C2077aZ> i;

    @Override // o.InterfaceC1673aK
    /* renamed from: a */
    public void e(C1511aE c1511aE, C2077aZ c2077aZ, int i) {
    }

    @Override // o.InterfaceC3965bRf
    public /* synthetic */ InterfaceC3965bRf b(InterfaceC4732bk interfaceC4732bk) {
        return e((InterfaceC4732bk<C3966bRg, C2077aZ>) interfaceC4732bk);
    }

    @Override // o.InterfaceC3965bRf
    public /* synthetic */ InterfaceC3965bRf c(InterfaceC4467bf interfaceC4467bf) {
        return a((InterfaceC4467bf<C3966bRg, C2077aZ>) interfaceC4467bf);
    }

    @Override // o.InterfaceC3965bRf
    public /* synthetic */ InterfaceC3965bRf e(drO dro) {
        return a((drO<? extends TrackingInfo>) dro);
    }

    @Override // o.InterfaceC1673aK
    public void a(C2077aZ c2077aZ, int i) {
        InterfaceC4467bf<C3966bRg, C2077aZ> interfaceC4467bf = this.i;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, c2077aZ, i);
        }
    }

    public C3966bRg a(InterfaceC4467bf<C3966bRg, C2077aZ> interfaceC4467bf) {
        h();
        this.i = interfaceC4467bf;
        return this;
    }

    @Override // o.AbstractC3765bJv, o.AbstractC3795bKy, o.C3126at, o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: c */
    public void e(C2077aZ c2077aZ) {
        super.e(c2077aZ);
        InterfaceC4414be<C3966bRg, C2077aZ> interfaceC4414be = this.f;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, c2077aZ);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: b */
    public void c(int i, C2077aZ c2077aZ) {
        InterfaceC4732bk<C3966bRg, C2077aZ> interfaceC4732bk = this.h;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, c2077aZ, i);
        }
        super.a(i, (int) c2077aZ);
    }

    public C3966bRg e(InterfaceC4732bk<C3966bRg, C2077aZ> interfaceC4732bk) {
        h();
        this.h = interfaceC4732bk;
        return this;
    }

    @Override // o.AbstractC3336ax
    /* renamed from: a */
    public void d(float f, float f2, int i, int i2, C2077aZ c2077aZ) {
        InterfaceC4573bh<C3966bRg, C2077aZ> interfaceC4573bh = this.g;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, c2077aZ, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, c2077aZ);
    }

    @Override // o.InterfaceC3965bRf
    /* renamed from: c */
    public C3966bRg a(C9686vA c9686vA) {
        h();
        super.d(c9686vA);
        return this;
    }

    @Override // o.InterfaceC3965bRf
    /* renamed from: d */
    public C3966bRg b(Integer num) {
        h();
        super.a(num);
        return this;
    }

    @Override // o.InterfaceC3965bRf
    /* renamed from: d */
    public C3966bRg c(View.OnClickListener onClickListener) {
        h();
        super.e(onClickListener);
        return this;
    }

    @Override // o.InterfaceC3965bRf
    /* renamed from: a */
    public C3966bRg e(boolean z) {
        h();
        super.c(z);
        return this;
    }

    @Override // o.InterfaceC3965bRf
    /* renamed from: e */
    public C3966bRg c(InterfaceC3825bMa.a aVar) {
        h();
        super.a(aVar);
        return this;
    }

    public C3966bRg a(drO<? extends TrackingInfo> dro) {
        h();
        ((AbstractC3795bKy) this).c = dro;
        return this;
    }

    @Override // o.InterfaceC3965bRf
    /* renamed from: d */
    public C3966bRg a(AppView appView) {
        h();
        ((AbstractC3795bKy) this).d = appView;
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: b */
    public C3966bRg e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.InterfaceC3965bRf
    /* renamed from: d */
    public C3966bRg b(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.InterfaceC3965bRf
    /* renamed from: b */
    public C3966bRg d(int i) {
        super.a(i);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: e */
    public C3966bRg a(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    @Override // o.C3126at, o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C3966bRg) && super.equals(obj)) {
            C3966bRg c3966bRg = (C3966bRg) obj;
            if ((this.i == null) != (c3966bRg.i == null)) {
                return false;
            }
            if ((this.f == null) != (c3966bRg.f == null)) {
                return false;
            }
            if ((this.h == null) != (c3966bRg.h == null)) {
                return false;
            }
            if ((this.g == null) != (c3966bRg.g == null)) {
                return false;
            }
            if (s() == null ? c3966bRg.s() == null : s().equals(c3966bRg.s())) {
                if (r() == null ? c3966bRg.r() == null : r().equals(c3966bRg.r())) {
                    if (l() == null ? c3966bRg.l() == null : l().equals(c3966bRg.l())) {
                        if ((o() == null) == (c3966bRg.o() == null) && t() == c3966bRg.t() && k() == c3966bRg.k()) {
                            if (n() == null ? c3966bRg.n() == null : n().equals(c3966bRg.n())) {
                                if ((((AbstractC3795bKy) this).c == null) != (((AbstractC3795bKy) c3966bRg).c == null)) {
                                    return false;
                                }
                                AppView appView = ((AbstractC3795bKy) this).d;
                                AppView appView2 = ((AbstractC3795bKy) c3966bRg).d;
                                return appView == null ? appView2 == null : appView.equals(appView2);
                            }
                            return false;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override // o.C3126at, o.AbstractC3073as
    public int hashCode() {
        int hashCode = super.hashCode();
        int i = this.i != null ? 1 : 0;
        int i2 = this.f != null ? 1 : 0;
        int i3 = this.h != null ? 1 : 0;
        int i4 = this.g != null ? 1 : 0;
        int hashCode2 = s() != null ? s().hashCode() : 0;
        int hashCode3 = r() != null ? r().hashCode() : 0;
        int hashCode4 = l() != null ? l().hashCode() : 0;
        int i5 = o() != null ? 1 : 0;
        boolean t = t();
        boolean k = k();
        int hashCode5 = n() != null ? n().hashCode() : 0;
        int i6 = ((AbstractC3795bKy) this).c == null ? 0 : 1;
        AppView appView = ((AbstractC3795bKy) this).d;
        return (((((((((((((((((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + i5) * 31) + (t ? 1 : 0)) * 31) + (k ? 1 : 0)) * 31) + hashCode5) * 31) + i6) * 31) + (appView != null ? appView.hashCode() : 0);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "IPBasedGameGroupModel_{roundedCornersConfig=" + s() + ", width=" + r() + ", contentDescription=" + ((Object) l()) + ", onClick=" + o() + ", optInMeasuring=" + t() + ", forwardMeasuring=" + k() + ", impressionInfo=" + n() + ", appView=" + ((AbstractC3795bKy) this).d + "}" + super.toString();
    }
}
