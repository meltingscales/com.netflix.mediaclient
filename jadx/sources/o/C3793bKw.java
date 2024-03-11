package o;

import com.netflix.cl.model.AppView;
import com.netflix.cl.model.TrackingInfo;
import o.AbstractC3073as;
import o.InterfaceC3825bMa;

/* renamed from: o.bKw  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C3793bKw extends AbstractC3795bKy implements InterfaceC1673aK<C2077aZ>, bKA {
    private InterfaceC4467bf<C3793bKw, C2077aZ> g;
    private InterfaceC4573bh<C3793bKw, C2077aZ> h;
    private InterfaceC4414be<C3793bKw, C2077aZ> i;
    private InterfaceC4732bk<C3793bKw, C2077aZ> j;

    @Override // o.InterfaceC1673aK
    /* renamed from: c */
    public void e(C1511aE c1511aE, C2077aZ c2077aZ, int i) {
    }

    @Override // o.bKA
    public /* synthetic */ bKA b(InterfaceC4467bf interfaceC4467bf) {
        return d((InterfaceC4467bf<C3793bKw, C2077aZ>) interfaceC4467bf);
    }

    @Override // o.bKA
    public /* synthetic */ bKA b(drO dro) {
        return d((drO<? extends TrackingInfo>) dro);
    }

    @Override // o.bKA
    public /* synthetic */ bKA d(InterfaceC4732bk interfaceC4732bk) {
        return a((InterfaceC4732bk<C3793bKw, C2077aZ>) interfaceC4732bk);
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: c */
    public void a(C2077aZ c2077aZ, int i) {
        InterfaceC4467bf<C3793bKw, C2077aZ> interfaceC4467bf = this.g;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, c2077aZ, i);
        }
    }

    public C3793bKw d(InterfaceC4467bf<C3793bKw, C2077aZ> interfaceC4467bf) {
        h();
        this.g = interfaceC4467bf;
        return this;
    }

    @Override // o.AbstractC3795bKy, o.C3126at, o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: c */
    public void e(C2077aZ c2077aZ) {
        super.e(c2077aZ);
        InterfaceC4414be<C3793bKw, C2077aZ> interfaceC4414be = this.i;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, c2077aZ);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: b */
    public void c(int i, C2077aZ c2077aZ) {
        InterfaceC4732bk<C3793bKw, C2077aZ> interfaceC4732bk = this.j;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, c2077aZ, i);
        }
        super.a(i, (int) c2077aZ);
    }

    public C3793bKw a(InterfaceC4732bk<C3793bKw, C2077aZ> interfaceC4732bk) {
        h();
        this.j = interfaceC4732bk;
        return this;
    }

    @Override // o.AbstractC3336ax
    /* renamed from: c */
    public void d(float f, float f2, int i, int i2, C2077aZ c2077aZ) {
        InterfaceC4573bh<C3793bKw, C2077aZ> interfaceC4573bh = this.h;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, c2077aZ, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, c2077aZ);
    }

    @Override // o.bKA
    /* renamed from: d */
    public C3793bKw a(boolean z) {
        h();
        super.c(z);
        return this;
    }

    @Override // o.bKA
    /* renamed from: b */
    public C3793bKw d(InterfaceC3825bMa.a aVar) {
        h();
        super.a(aVar);
        return this;
    }

    public C3793bKw d(drO<? extends TrackingInfo> dro) {
        h();
        ((AbstractC3795bKy) this).c = dro;
        return this;
    }

    @Override // o.bKA
    /* renamed from: d */
    public C3793bKw c(AppView appView) {
        h();
        ((AbstractC3795bKy) this).d = appView;
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: d */
    public C3793bKw e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.bKA
    /* renamed from: d */
    public C3793bKw e(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.bKA
    /* renamed from: e */
    public C3793bKw c(int i) {
        super.a(i);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: b */
    public C3793bKw a(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    @Override // o.C3126at, o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C3793bKw) && super.equals(obj)) {
            C3793bKw c3793bKw = (C3793bKw) obj;
            if ((this.g == null) != (c3793bKw.g == null)) {
                return false;
            }
            if ((this.i == null) != (c3793bKw.i == null)) {
                return false;
            }
            if ((this.j == null) != (c3793bKw.j == null)) {
                return false;
            }
            if ((this.h == null) == (c3793bKw.h == null) && t() == c3793bKw.t() && k() == c3793bKw.k()) {
                if (n() == null ? c3793bKw.n() == null : n().equals(c3793bKw.n())) {
                    if ((((AbstractC3795bKy) this).c == null) != (((AbstractC3795bKy) c3793bKw).c == null)) {
                        return false;
                    }
                    AppView appView = ((AbstractC3795bKy) this).d;
                    AppView appView2 = ((AbstractC3795bKy) c3793bKw).d;
                    return appView == null ? appView2 == null : appView.equals(appView2);
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
        int i3 = this.j != null ? 1 : 0;
        int i4 = this.h != null ? 1 : 0;
        boolean t = t();
        boolean k = k();
        int hashCode2 = n() != null ? n().hashCode() : 0;
        int i5 = ((AbstractC3795bKy) this).c == null ? 0 : 1;
        AppView appView = ((AbstractC3795bKy) this).d;
        return (((((((((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + (t ? 1 : 0)) * 31) + (k ? 1 : 0)) * 31) + hashCode2) * 31) + i5) * 31) + (appView != null ? appView.hashCode() : 0);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "PresentableGroupModel_{optInMeasuring=" + t() + ", forwardMeasuring=" + k() + ", impressionInfo=" + n() + ", appView=" + ((AbstractC3795bKy) this).d + "}" + super.toString();
    }
}
