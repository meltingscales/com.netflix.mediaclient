package o;

import android.view.ViewParent;
import o.AbstractC3073as;
import o.bGA;

/* loaded from: classes4.dex */
public class bGF extends bGA implements InterfaceC1673aK<bGA.c>, bGI {
    private InterfaceC4414be<bGF, bGA.c> c;
    private InterfaceC4467bf<bGF, bGA.c> d;
    private InterfaceC4573bh<bGF, bGA.c> h;
    private InterfaceC4732bk<bGF, bGA.c> i;

    @Override // o.InterfaceC1673aK
    /* renamed from: c */
    public void e(C1511aE c1511aE, bGA.c cVar, int i) {
    }

    @Override // o.bGI
    public /* synthetic */ bGI b(drM drm) {
        return e((drM<? super Integer, dpR>) drm);
    }

    @Override // o.InterfaceC1673aK
    public void a(bGA.c cVar, int i) {
        InterfaceC4467bf<bGF, bGA.c> interfaceC4467bf = this.d;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, cVar, i);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: a */
    public void e(bGA.c cVar) {
        super.b((bGF) cVar);
        InterfaceC4414be<bGF, bGA.c> interfaceC4414be = this.c;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, cVar);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    public void c(int i, bGA.c cVar) {
        InterfaceC4732bk<bGF, bGA.c> interfaceC4732bk = this.i;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, cVar, i);
        }
        super.a(i, (int) cVar);
    }

    @Override // o.AbstractC3336ax
    /* renamed from: c */
    public void d(float f, float f2, int i, int i2, bGA.c cVar) {
        InterfaceC4573bh<bGF, bGA.c> interfaceC4573bh = this.h;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, cVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, cVar);
    }

    @Override // o.bGI
    /* renamed from: d */
    public bGF e(int i) {
        h();
        super.c(i);
        return this;
    }

    public bGF e(drM<? super Integer, dpR> drm) {
        h();
        super.d(drm);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: a */
    public bGF e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.bGI
    /* renamed from: d */
    public bGF b(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: b */
    public bGF a(int i) {
        super.a(i);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: d */
    public bGF a(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: e */
    public bGA.c b(ViewParent viewParent) {
        return new bGA.c();
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof bGF) && super.equals(obj)) {
            bGF bgf = (bGF) obj;
            if ((this.d == null) != (bgf.d == null)) {
                return false;
            }
            if ((this.c == null) != (bgf.c == null)) {
                return false;
            }
            if ((this.i == null) != (bgf.i == null)) {
                return false;
            }
            if ((this.h == null) == (bgf.h == null) && l() == bgf.l()) {
                return (i() == null) == (bgf.i() == null);
            }
            return false;
        }
        return false;
    }

    @Override // o.AbstractC3073as
    public int hashCode() {
        int hashCode = super.hashCode();
        int i = this.d != null ? 1 : 0;
        int i2 = this.c != null ? 1 : 0;
        int i3 = this.i != null ? 1 : 0;
        int i4 = this.h != null ? 1 : 0;
        return (((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + l()) * 31) + (i() == null ? 0 : 1);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "DpCtaUserRatingButtonModel_{thumbRating=" + l() + "}" + super.toString();
    }
}
