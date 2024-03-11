package o;

import android.view.View;
import android.view.ViewParent;
import o.AbstractC3073as;
import o.AbstractC6112cUh;

/* renamed from: o.cUl  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6116cUl extends AbstractC6112cUh implements InterfaceC1673aK<AbstractC6112cUh.d> {
    private InterfaceC4467bf<C6116cUl, AbstractC6112cUh.d> d;
    private InterfaceC4732bk<C6116cUl, AbstractC6112cUh.d> g;
    private InterfaceC4573bh<C6116cUl, AbstractC6112cUh.d> h;
    private InterfaceC4414be<C6116cUl, AbstractC6112cUh.d> i;

    @Override // o.InterfaceC1673aK
    /* renamed from: d */
    public void e(C1511aE c1511aE, AbstractC6112cUh.d dVar, int i) {
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: d */
    public void a(AbstractC6112cUh.d dVar, int i) {
        InterfaceC4467bf<C6116cUl, AbstractC6112cUh.d> interfaceC4467bf = this.d;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, dVar, i);
        }
    }

    public C6116cUl b(InterfaceC4467bf<C6116cUl, AbstractC6112cUh.d> interfaceC4467bf) {
        h();
        this.d = interfaceC4467bf;
        return this;
    }

    @Override // o.AbstractC6112cUh, o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: b  reason: avoid collision after fix types in other method */
    public void e(AbstractC6112cUh.d dVar) {
        super.e(dVar);
        InterfaceC4414be<C6116cUl, AbstractC6112cUh.d> interfaceC4414be = this.i;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, dVar);
        }
    }

    @Override // o.AbstractC6112cUh, o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: e */
    public void c(int i, AbstractC6112cUh.d dVar) {
        InterfaceC4732bk<C6116cUl, AbstractC6112cUh.d> interfaceC4732bk = this.g;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, dVar, i);
        }
        super.c(i, dVar);
    }

    public C6116cUl d(InterfaceC4732bk<C6116cUl, AbstractC6112cUh.d> interfaceC4732bk) {
        h();
        this.g = interfaceC4732bk;
        return this;
    }

    @Override // o.AbstractC3336ax
    /* renamed from: e */
    public void d(float f, float f2, int i, int i2, AbstractC6112cUh.d dVar) {
        InterfaceC4573bh<C6116cUl, AbstractC6112cUh.d> interfaceC4573bh = this.h;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, dVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, dVar);
    }

    public C6116cUl d(InterfaceC4308bc<C6116cUl, AbstractC6112cUh.d> interfaceC4308bc) {
        h();
        if (interfaceC4308bc == null) {
            super.c((View.OnClickListener) null);
        } else {
            super.c((View.OnClickListener) new View$OnClickListenerC4818bn(interfaceC4308bc));
        }
        return this;
    }

    public C6116cUl j(String str) {
        h();
        super.b(str);
        return this;
    }

    public C6116cUl e(CharSequence charSequence) {
        h();
        super.b(charSequence);
        return this;
    }

    public C6116cUl c(String str) {
        h();
        super.e(str);
        return this;
    }

    public C6116cUl a(String str) {
        h();
        super.d(str);
        return this;
    }

    public C6116cUl b(C9935zP c9935zP) {
        h();
        super.e(c9935zP);
        return this;
    }

    public C6116cUl i(int i) {
        h();
        super.d(i);
        return this;
    }

    public C6116cUl f(boolean z) {
        h();
        super.b(z);
        return this;
    }

    public C6116cUl g(boolean z) {
        h();
        super.c(z);
        return this;
    }

    public C6116cUl h(boolean z) {
        h();
        super.a(z);
        return this;
    }

    public C6116cUl f(String str) {
        h();
        this.c = str;
        return this;
    }

    public C6116cUl e(boolean z) {
        h();
        super.d(z);
        return this;
    }

    public C6116cUl c(int i) {
        h();
        super.e(i);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: a */
    public C6116cUl e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: c */
    public C6116cUl a(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: b */
    public C6116cUl a(int i) {
        super.a(i);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: d */
    public C6116cUl a(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: a */
    public AbstractC6112cUh.d b(ViewParent viewParent) {
        return new AbstractC6112cUh.d();
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C6116cUl) && super.equals(obj)) {
            C6116cUl c6116cUl = (C6116cUl) obj;
            if ((this.d == null) != (c6116cUl.d == null)) {
                return false;
            }
            if ((this.i == null) != (c6116cUl.i == null)) {
                return false;
            }
            if ((this.g == null) != (c6116cUl.g == null)) {
                return false;
            }
            if ((this.h == null) != (c6116cUl.h == null)) {
                return false;
            }
            if ((k() == null) != (c6116cUl.k() == null)) {
                return false;
            }
            if (w() == null ? c6116cUl.w() == null : w().equals(c6116cUl.w())) {
                if (o() == null ? c6116cUl.o() == null : o().equals(c6116cUl.o())) {
                    if (m() == null ? c6116cUl.m() == null : m().equals(c6116cUl.m())) {
                        if (r() == null ? c6116cUl.r() == null : r().equals(c6116cUl.r())) {
                            if ((n() == null) == (c6116cUl.n() == null) && p() == c6116cUl.p() && q() == c6116cUl.q() && l() == c6116cUl.l() && s() == c6116cUl.s()) {
                                return (this.c == null) == (c6116cUl.c == null) && i() == c6116cUl.i() && t() == c6116cUl.t();
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

    @Override // o.AbstractC3073as
    public int hashCode() {
        int hashCode = super.hashCode();
        int i = this.d != null ? 1 : 0;
        int i2 = this.i != null ? 1 : 0;
        int i3 = this.g != null ? 1 : 0;
        int i4 = this.h != null ? 1 : 0;
        int i5 = k() != null ? 1 : 0;
        int hashCode2 = w() != null ? w().hashCode() : 0;
        int hashCode3 = o() != null ? o().hashCode() : 0;
        int hashCode4 = m() != null ? m().hashCode() : 0;
        int hashCode5 = r() != null ? r().hashCode() : 0;
        int i6 = n() != null ? 1 : 0;
        return (((((((((((((((((((((((((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + i5) * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + i6) * 31) + p()) * 31) + (q() ? 1 : 0)) * 31) + (l() ? 1 : 0)) * 31) + (s() ? 1 : 0)) * 31) + (this.c != null ? 1 : 0)) * 31) + (i() ? 1 : 0)) * 31) + t();
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "SearchCarouselModel_{clickListener=" + k() + ", videoTitle=" + w() + ", contentDescription=" + ((Object) o()) + ", boxArtImageUrl=" + m() + ", queryKind=" + r() + ", eventBusFactory=" + n() + ", sectionIndex=" + p() + ", loading=" + q() + ", executeLoadMoreOnVisibilityStateChanged=" + l() + ", onFirstPage=" + s() + ", videoId=" + this.c + ", availableToPlay=" + i() + ", itemsPerPage=" + t() + "}" + super.toString();
    }
}
