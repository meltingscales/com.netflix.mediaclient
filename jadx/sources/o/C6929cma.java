package o;

import android.view.ViewParent;
import o.AbstractC3073as;

/* renamed from: o.cma  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6929cma extends AbstractC6871clV implements InterfaceC1673aK<C6946cmr>, InterfaceC6875clZ {
    private InterfaceC4414be<C6929cma, C6946cmr> b;
    private InterfaceC4573bh<C6929cma, C6946cmr> c;
    private InterfaceC4467bf<C6929cma, C6946cmr> d;
    private InterfaceC4732bk<C6929cma, C6946cmr> j;

    @Override // o.InterfaceC1673aK
    /* renamed from: b */
    public void e(C1511aE c1511aE, C6946cmr c6946cmr, int i) {
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: d */
    public void a(C6946cmr c6946cmr, int i) {
        InterfaceC4467bf<C6929cma, C6946cmr> interfaceC4467bf = this.d;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, c6946cmr, i);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: c */
    public void e(C6946cmr c6946cmr) {
        super.b((C6929cma) c6946cmr);
        InterfaceC4414be<C6929cma, C6946cmr> interfaceC4414be = this.b;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, c6946cmr);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: b */
    public void c(int i, C6946cmr c6946cmr) {
        InterfaceC4732bk<C6929cma, C6946cmr> interfaceC4732bk = this.j;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, c6946cmr, i);
        }
        super.a(i, (int) c6946cmr);
    }

    @Override // o.AbstractC3336ax
    /* renamed from: b */
    public void d(float f, float f2, int i, int i2, C6946cmr c6946cmr) {
        InterfaceC4573bh<C6929cma, C6946cmr> interfaceC4573bh = this.c;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, c6946cmr, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, c6946cmr);
    }

    @Override // o.InterfaceC6875clZ
    /* renamed from: b */
    public C6929cma a(String str) {
        h();
        super.V_(str);
        return this;
    }

    @Override // o.InterfaceC6875clZ
    /* renamed from: d */
    public C6929cma c(String str) {
        h();
        super.e(str);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: c */
    public C6929cma e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.InterfaceC6875clZ
    /* renamed from: e */
    public C6929cma b(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: d */
    public C6929cma a(int i) {
        super.a(i);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: d */
    public C6929cma a(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: d */
    public C6946cmr b(ViewParent viewParent) {
        return new C6946cmr();
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C6929cma) && super.equals(obj)) {
            C6929cma c6929cma = (C6929cma) obj;
            if ((this.d == null) != (c6929cma.d == null)) {
                return false;
            }
            if ((this.b == null) != (c6929cma.b == null)) {
                return false;
            }
            if ((this.j == null) != (c6929cma.j == null)) {
                return false;
            }
            if ((this.c == null) != (c6929cma.c == null)) {
                return false;
            }
            if (k() == null ? c6929cma.k() == null : k().equals(c6929cma.k())) {
                return i() == null ? c6929cma.i() == null : i().equals(c6929cma.i());
            }
            return false;
        }
        return false;
    }

    @Override // o.AbstractC3073as
    public int hashCode() {
        int hashCode = super.hashCode();
        int i = this.d != null ? 1 : 0;
        int i2 = this.b != null ? 1 : 0;
        int i3 = this.j != null ? 1 : 0;
        int i4 = this.c == null ? 0 : 1;
        return (((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + (k() != null ? k().hashCode() : 0)) * 31) + (i() != null ? i().hashCode() : 0);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "MultiMonthAnnualDiscountPriceModel_{price=" + k() + ", duration=" + i() + "}" + super.toString();
    }
}
