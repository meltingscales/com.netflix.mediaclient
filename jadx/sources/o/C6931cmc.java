package o;

import android.view.ViewParent;
import o.AbstractC3073as;

/* renamed from: o.cmc  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6931cmc extends AbstractC6932cmd implements InterfaceC1673aK<C6946cmr>, InterfaceC6934cmf {
    private InterfaceC4467bf<C6931cmc, C6946cmr> b;
    private InterfaceC4414be<C6931cmc, C6946cmr> c;
    private InterfaceC4573bh<C6931cmc, C6946cmr> d;
    private InterfaceC4732bk<C6931cmc, C6946cmr> j;

    @Override // o.InterfaceC1673aK
    /* renamed from: d */
    public void e(C1511aE c1511aE, C6946cmr c6946cmr, int i) {
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: e */
    public void a(C6946cmr c6946cmr, int i) {
        InterfaceC4467bf<C6931cmc, C6946cmr> interfaceC4467bf = this.b;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, c6946cmr, i);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: c */
    public void e(C6946cmr c6946cmr) {
        super.b((C6931cmc) c6946cmr);
        InterfaceC4414be<C6931cmc, C6946cmr> interfaceC4414be = this.c;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, c6946cmr);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public void c(int i, C6946cmr c6946cmr) {
        InterfaceC4732bk<C6931cmc, C6946cmr> interfaceC4732bk = this.j;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, c6946cmr, i);
        }
        super.a(i, (int) c6946cmr);
    }

    @Override // o.AbstractC3336ax
    /* renamed from: e */
    public void d(float f, float f2, int i, int i2, C6946cmr c6946cmr) {
        InterfaceC4573bh<C6931cmc, C6946cmr> interfaceC4573bh = this.d;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, c6946cmr, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, c6946cmr);
    }

    @Override // o.InterfaceC6934cmf
    /* renamed from: a */
    public C6931cmc c(String str) {
        h();
        super.e(str);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: d */
    public C6931cmc e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.InterfaceC6934cmf
    /* renamed from: d */
    public C6931cmc e(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: c */
    public C6931cmc a(int i) {
        super.a(i);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: d */
    public C6931cmc a(AbstractC3073as.b bVar) {
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
        if ((obj instanceof C6931cmc) && super.equals(obj)) {
            C6931cmc c6931cmc = (C6931cmc) obj;
            if ((this.b == null) != (c6931cmc.b == null)) {
                return false;
            }
            if ((this.c == null) != (c6931cmc.c == null)) {
                return false;
            }
            if ((this.j == null) != (c6931cmc.j == null)) {
                return false;
            }
            if ((this.d == null) != (c6931cmc.d == null)) {
                return false;
            }
            return i() == null ? c6931cmc.i() == null : i().equals(c6931cmc.i());
        }
        return false;
    }

    @Override // o.AbstractC3073as
    public int hashCode() {
        int hashCode = super.hashCode();
        int i = this.b != null ? 1 : 0;
        int i2 = this.c != null ? 1 : 0;
        int i3 = this.j != null ? 1 : 0;
        return (((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + (this.d == null ? 0 : 1)) * 31) + (i() != null ? i().hashCode() : 0);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "MultiMonthAnnualSaveDiscountModel_{discountPercentage=" + i() + "}" + super.toString();
    }
}
