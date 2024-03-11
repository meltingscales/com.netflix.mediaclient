package o;

import android.view.View;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.TrackingInfo;
import o.AbstractC3073as;
import o.InterfaceC3825bMa;

/* renamed from: o.bJt  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C3763bJt extends AbstractC3765bJv implements InterfaceC1673aK<C2077aZ>, InterfaceC3766bJw {
    private InterfaceC4732bk<C3763bJt, C2077aZ> f;
    private InterfaceC4467bf<C3763bJt, C2077aZ> g;
    private InterfaceC4573bh<C3763bJt, C2077aZ> h;
    private InterfaceC4414be<C3763bJt, C2077aZ> i;

    @Override // o.InterfaceC1673aK
    /* renamed from: d */
    public void e(C1511aE c1511aE, C2077aZ c2077aZ, int i) {
    }

    @Override // o.InterfaceC3766bJw
    public /* synthetic */ InterfaceC3766bJw a(drO dro) {
        return c((drO<? extends TrackingInfo>) dro);
    }

    @Override // o.InterfaceC3766bJw
    public /* synthetic */ InterfaceC3766bJw c(InterfaceC4467bf interfaceC4467bf) {
        return d((InterfaceC4467bf<C3763bJt, C2077aZ>) interfaceC4467bf);
    }

    @Override // o.InterfaceC3766bJw
    public /* synthetic */ InterfaceC3766bJw d(InterfaceC4732bk interfaceC4732bk) {
        return e((InterfaceC4732bk<C3763bJt, C2077aZ>) interfaceC4732bk);
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: b */
    public void a(C2077aZ c2077aZ, int i) {
        InterfaceC4467bf<C3763bJt, C2077aZ> interfaceC4467bf = this.g;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, c2077aZ, i);
        }
    }

    public C3763bJt d(InterfaceC4467bf<C3763bJt, C2077aZ> interfaceC4467bf) {
        h();
        this.g = interfaceC4467bf;
        return this;
    }

    @Override // o.AbstractC3765bJv, o.AbstractC3795bKy, o.C3126at, o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: c */
    public void e(C2077aZ c2077aZ) {
        super.e(c2077aZ);
        InterfaceC4414be<C3763bJt, C2077aZ> interfaceC4414be = this.i;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, c2077aZ);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: b */
    public void c(int i, C2077aZ c2077aZ) {
        InterfaceC4732bk<C3763bJt, C2077aZ> interfaceC4732bk = this.f;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, c2077aZ, i);
        }
        super.a(i, (int) c2077aZ);
    }

    public C3763bJt e(InterfaceC4732bk<C3763bJt, C2077aZ> interfaceC4732bk) {
        h();
        this.f = interfaceC4732bk;
        return this;
    }

    @Override // o.AbstractC3336ax
    /* renamed from: e */
    public void d(float f, float f2, int i, int i2, C2077aZ c2077aZ) {
        InterfaceC4573bh<C3763bJt, C2077aZ> interfaceC4573bh = this.h;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, c2077aZ, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, c2077aZ);
    }

    @Override // o.InterfaceC3766bJw
    /* renamed from: d */
    public C3763bJt c(CharSequence charSequence) {
        h();
        super.v_(charSequence);
        return this;
    }

    @Override // o.InterfaceC3766bJw
    /* renamed from: d */
    public C3763bJt b(View.OnClickListener onClickListener) {
        h();
        super.e(onClickListener);
        return this;
    }

    @Override // o.InterfaceC3766bJw
    /* renamed from: b */
    public C3763bJt a(boolean z) {
        h();
        super.w_(z);
        return this;
    }

    @Override // o.InterfaceC3766bJw
    /* renamed from: d */
    public C3763bJt b(InterfaceC3825bMa.a aVar) {
        h();
        super.a(aVar);
        return this;
    }

    public C3763bJt c(drO<? extends TrackingInfo> dro) {
        h();
        ((AbstractC3795bKy) this).c = dro;
        return this;
    }

    @Override // o.InterfaceC3766bJw
    /* renamed from: b */
    public C3763bJt c(AppView appView) {
        h();
        ((AbstractC3795bKy) this).d = appView;
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: d */
    public C3763bJt e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.InterfaceC3766bJw
    /* renamed from: e */
    public C3763bJt b(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.InterfaceC3766bJw
    /* renamed from: d */
    public C3763bJt c(int i) {
        super.a(i);
        return this;
    }

    @Override // o.InterfaceC3766bJw
    /* renamed from: c */
    public C3763bJt e(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    @Override // o.C3126at, o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C3763bJt) && super.equals(obj)) {
            C3763bJt c3763bJt = (C3763bJt) obj;
            if ((this.g == null) != (c3763bJt.g == null)) {
                return false;
            }
            if ((this.i == null) != (c3763bJt.i == null)) {
                return false;
            }
            if ((this.f == null) != (c3763bJt.f == null)) {
                return false;
            }
            if ((this.h == null) != (c3763bJt.h == null)) {
                return false;
            }
            if (l() == null ? c3763bJt.l() == null : l().equals(c3763bJt.l())) {
                if ((o() == null) == (c3763bJt.o() == null) && t() == c3763bJt.t() && k() == c3763bJt.k()) {
                    if (n() == null ? c3763bJt.n() == null : n().equals(c3763bJt.n())) {
                        if ((((AbstractC3795bKy) this).c == null) != (((AbstractC3795bKy) c3763bJt).c == null)) {
                            return false;
                        }
                        AppView appView = ((AbstractC3795bKy) this).d;
                        AppView appView2 = ((AbstractC3795bKy) c3763bJt).d;
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

    @Override // o.C3126at, o.AbstractC3073as
    public int hashCode() {
        int hashCode = super.hashCode();
        int i = this.g != null ? 1 : 0;
        int i2 = this.i != null ? 1 : 0;
        int i3 = this.f != null ? 1 : 0;
        int i4 = this.h != null ? 1 : 0;
        int hashCode2 = l() != null ? l().hashCode() : 0;
        int i5 = o() != null ? 1 : 0;
        boolean t = t();
        boolean k = k();
        int hashCode3 = n() != null ? n().hashCode() : 0;
        int i6 = ((AbstractC3795bKy) this).c == null ? 0 : 1;
        AppView appView = ((AbstractC3795bKy) this).d;
        return (((((((((((((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + hashCode2) * 31) + i5) * 31) + (t ? 1 : 0)) * 31) + (k ? 1 : 0)) * 31) + hashCode3) * 31) + i6) * 31) + (appView != null ? appView.hashCode() : 0);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "CustomDescriptionGroupModel_{contentDescription=" + ((Object) l()) + ", onClick=" + o() + ", optInMeasuring=" + t() + ", forwardMeasuring=" + k() + ", impressionInfo=" + n() + ", appView=" + ((AbstractC3795bKy) this).d + "}" + super.toString();
    }
}
