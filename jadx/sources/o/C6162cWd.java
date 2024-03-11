package o;

import android.view.ViewParent;
import o.AbstractC3073as;
import o.AbstractC6166cWh;
import o.AbstractC6184cWz;

/* renamed from: o.cWd  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C6162cWd extends AbstractC6166cWh implements InterfaceC1673aK<AbstractC6166cWh.e>, InterfaceC6164cWf {
    private InterfaceC4414be<C6162cWd, AbstractC6166cWh.e> b;
    private InterfaceC4467bf<C6162cWd, AbstractC6166cWh.e> c;
    private InterfaceC4573bh<C6162cWd, AbstractC6166cWh.e> d;
    private InterfaceC4732bk<C6162cWd, AbstractC6166cWh.e> f;

    @Override // o.InterfaceC1673aK
    /* renamed from: d */
    public void e(C1511aE c1511aE, AbstractC6166cWh.e eVar, int i) {
    }

    @Override // o.InterfaceC1673aK
    public void a(AbstractC6166cWh.e eVar, int i) {
        InterfaceC4467bf<C6162cWd, AbstractC6166cWh.e> interfaceC4467bf = this.c;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, eVar, i);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: a */
    public void e(AbstractC6166cWh.e eVar) {
        super.b((C6162cWd) eVar);
        InterfaceC4414be<C6162cWd, AbstractC6166cWh.e> interfaceC4414be = this.b;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, eVar);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: b */
    public void c(int i, AbstractC6166cWh.e eVar) {
        InterfaceC4732bk<C6162cWd, AbstractC6166cWh.e> interfaceC4732bk = this.f;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, eVar, i);
        }
        super.a(i, (int) eVar);
    }

    @Override // o.AbstractC3336ax
    public void d(float f, float f2, int i, int i2, AbstractC6166cWh.e eVar) {
        InterfaceC4573bh<C6162cWd, AbstractC6166cWh.e> interfaceC4573bh = this.d;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, eVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, (int) eVar);
    }

    @Override // o.InterfaceC6164cWf
    /* renamed from: c */
    public C6162cWd e(C9935zP c9935zP) {
        h();
        super.a_(c9935zP);
        return this;
    }

    @Override // o.InterfaceC6164cWf
    /* renamed from: j */
    public C6162cWd d(CharSequence charSequence) {
        h();
        super.N_(charSequence);
        return this;
    }

    @Override // o.InterfaceC6164cWf
    /* renamed from: f */
    public C6162cWd e(CharSequence charSequence) {
        h();
        super.b(charSequence);
        return this;
    }

    @Override // o.InterfaceC6164cWf
    /* renamed from: b */
    public C6162cWd e(boolean z) {
        h();
        super.d(z);
        return this;
    }

    @Override // o.InterfaceC6164cWf
    /* renamed from: a */
    public C6162cWd c(AbstractC6184cWz.d dVar) {
        h();
        super.a_(dVar);
        return this;
    }

    @Override // o.InterfaceC6164cWf
    /* renamed from: d */
    public C6162cWd b(AbstractC6184cWz.d dVar) {
        h();
        super.e(dVar);
        return this;
    }

    @Override // o.InterfaceC6164cWf
    /* renamed from: b */
    public C6162cWd a(Integer num) {
        h();
        super.d(num);
        return this;
    }

    @Override // o.InterfaceC6164cWf
    /* renamed from: c */
    public C6162cWd e(Integer num) {
        h();
        super.r_(num);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: c */
    public C6162cWd e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.InterfaceC6164cWf
    /* renamed from: g */
    public C6162cWd c(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: c */
    public C6162cWd a(int i) {
        super.a(i);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: c */
    public C6162cWd a(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: d */
    public AbstractC6166cWh.e b(ViewParent viewParent) {
        return new AbstractC6166cWh.e();
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C6162cWd) && super.equals(obj)) {
            C6162cWd c6162cWd = (C6162cWd) obj;
            if ((this.c == null) != (c6162cWd.c == null)) {
                return false;
            }
            if ((this.b == null) != (c6162cWd.b == null)) {
                return false;
            }
            if ((this.f == null) != (c6162cWd.f == null)) {
                return false;
            }
            if ((this.d == null) != (c6162cWd.d == null)) {
                return false;
            }
            if ((i() == null) != (c6162cWd.i() == null)) {
                return false;
            }
            if (o() == null ? c6162cWd.o() == null : o().equals(c6162cWd.o())) {
                if (n() == null ? c6162cWd.n() == null : n().equals(c6162cWd.n())) {
                    if (k() == c6162cWd.k() && q() == c6162cWd.q()) {
                        if (l() == null ? c6162cWd.l() == null : l().equals(c6162cWd.l())) {
                            if (r() == null ? c6162cWd.r() == null : r().equals(c6162cWd.r())) {
                                if (m() == null ? c6162cWd.m() == null : m().equals(c6162cWd.m())) {
                                    return t() == null ? c6162cWd.t() == null : t().equals(c6162cWd.t());
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
        return false;
    }

    @Override // o.AbstractC3073as
    public int hashCode() {
        int hashCode = super.hashCode();
        int i = this.c != null ? 1 : 0;
        int i2 = this.b != null ? 1 : 0;
        int i3 = this.f != null ? 1 : 0;
        int i4 = this.d != null ? 1 : 0;
        int i5 = i() == null ? 0 : 1;
        int hashCode2 = o() != null ? o().hashCode() : 0;
        int hashCode3 = n() != null ? n().hashCode() : 0;
        boolean k = k();
        boolean q = q();
        int hashCode4 = l() != null ? l().hashCode() : 0;
        int hashCode5 = r() != null ? r().hashCode() : 0;
        return (((((((((((((((((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + i5) * 31) + hashCode2) * 31) + hashCode3) * 31) + (k ? 1 : 0)) * 31) + (q ? 1 : 0)) * 31) + hashCode4) * 31) + hashCode5) * 31) + (m() != null ? m().hashCode() : 0)) * 31) + (t() != null ? t().hashCode() : 0);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "ButtonsModel_{eventBusFactory=" + i() + ", negative=" + ((Object) o()) + ", positive=" + ((Object) n()) + ", negativeEnabled=" + k() + ", positiveEnabled=" + q() + ", negativeEvent=" + l() + ", positiveEvent=" + r() + ", negativeStyle=" + m() + ", positiveStyle=" + t() + "}" + super.toString();
    }
}
