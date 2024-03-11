package o;

import android.view.ViewGroup;
import java.util.BitSet;
import o.AbstractC3073as;

/* renamed from: o.cmo  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6943cmo extends AbstractC3073as<C6939cmk> implements InterfaceC1673aK<C6939cmk>, InterfaceC6944cmp {
    private String d;
    private InterfaceC4573bh<C6943cmo, C6939cmk> f;
    private InterfaceC4467bf<C6943cmo, C6939cmk> g;
    private InterfaceC4414be<C6943cmo, C6939cmk> h;
    private InterfaceC4732bk<C6943cmo, C6939cmk> i;
    private final BitSet c = new BitSet(3);
    private boolean b = false;
    private int j = 0;

    @Override // o.AbstractC3073as
    public int Z_() {
        return 0;
    }

    @Override // o.AbstractC3073as
    public int b(int i, int i2, int i3) {
        return i;
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: d */
    public void e(C1511aE c1511aE, C6939cmk c6939cmk, int i) {
    }

    @Override // o.AbstractC3073as
    /* renamed from: e */
    public C6939cmk d(ViewGroup viewGroup) {
        C6939cmk c6939cmk = new C6939cmk(viewGroup.getContext());
        c6939cmk.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
        return c6939cmk;
    }

    @Override // o.AbstractC3073as
    /* renamed from: e  reason: avoid collision after fix types in other method */
    public void c(C6939cmk c6939cmk) {
        super.c((C6943cmo) c6939cmk);
        c6939cmk.setImageUrl(this.d);
        c6939cmk.setOfferLabel(this.j);
        c6939cmk.a(this.b);
    }

    @Override // o.AbstractC3073as
    public void c(C6939cmk c6939cmk, AbstractC3073as abstractC3073as) {
        if (!(abstractC3073as instanceof C6943cmo)) {
            c(c6939cmk);
            return;
        }
        C6943cmo c6943cmo = (C6943cmo) abstractC3073as;
        super.c((C6943cmo) c6939cmk);
        String str = this.d;
        if (str == null ? c6943cmo.d != null : !str.equals(c6943cmo.d)) {
            c6939cmk.setImageUrl(this.d);
        }
        int i = this.j;
        if (i != c6943cmo.j) {
            c6939cmk.setOfferLabel(i);
        }
        boolean z = this.b;
        if (z != c6943cmo.b) {
            c6939cmk.a(z);
        }
    }

    @Override // o.InterfaceC1673aK
    public void a(C6939cmk c6939cmk, int i) {
        InterfaceC4467bf<C6943cmo, C6939cmk> interfaceC4467bf = this.g;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, c6939cmk, i);
        }
    }

    @Override // o.AbstractC3073as
    /* renamed from: b */
    public void e(C6939cmk c6939cmk) {
        super.e((C6943cmo) c6939cmk);
        InterfaceC4414be<C6943cmo, C6939cmk> interfaceC4414be = this.h;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, c6939cmk);
        }
    }

    @Override // o.AbstractC3073as
    /* renamed from: a */
    public void c(int i, C6939cmk c6939cmk) {
        InterfaceC4732bk<C6943cmo, C6939cmk> interfaceC4732bk = this.i;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, c6939cmk, i);
        }
        super.c(i, (int) c6939cmk);
    }

    @Override // o.AbstractC3073as
    /* renamed from: a */
    public void b(float f, float f2, int i, int i2, C6939cmk c6939cmk) {
        InterfaceC4573bh<C6943cmo, C6939cmk> interfaceC4573bh = this.f;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, c6939cmk, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, c6939cmk);
    }

    @Override // o.InterfaceC6944cmp
    /* renamed from: b */
    public C6943cmo d(String str) {
        this.c.set(0);
        h();
        this.d = str;
        return this;
    }

    @Override // o.InterfaceC6944cmp
    /* renamed from: d */
    public C6943cmo a(boolean z) {
        h();
        this.b = z;
        return this;
    }

    @Override // o.InterfaceC6944cmp
    /* renamed from: e */
    public C6943cmo c(int i) {
        h();
        this.j = i;
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: b */
    public C6943cmo e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.InterfaceC6944cmp
    /* renamed from: d */
    public C6943cmo c(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: d */
    public C6943cmo a(int i) {
        throw new UnsupportedOperationException("Layout resources are unsupported with programmatic views.");
    }

    @Override // o.AbstractC3073as
    /* renamed from: c */
    public C6943cmo a(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    @Override // o.AbstractC3073as
    public int a() {
        throw new UnsupportedOperationException("Layout resources are unsupported for views created programmatically.");
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C6943cmo) && super.equals(obj)) {
            C6943cmo c6943cmo = (C6943cmo) obj;
            if ((this.g == null) != (c6943cmo.g == null)) {
                return false;
            }
            if ((this.h == null) != (c6943cmo.h == null)) {
                return false;
            }
            if ((this.i == null) != (c6943cmo.i == null)) {
                return false;
            }
            if ((this.f == null) != (c6943cmo.f == null)) {
                return false;
            }
            String str = this.d;
            if (str == null ? c6943cmo.d == null : str.equals(c6943cmo.d)) {
                return this.b == c6943cmo.b && this.j == c6943cmo.j;
            }
            return false;
        }
        return false;
    }

    @Override // o.AbstractC3073as
    public int hashCode() {
        int hashCode = super.hashCode();
        int i = this.g != null ? 1 : 0;
        int i2 = this.h != null ? 1 : 0;
        int i3 = this.i != null ? 1 : 0;
        int i4 = this.f == null ? 0 : 1;
        String str = this.d;
        return (((((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + (str != null ? str.hashCode() : 0)) * 31) + (this.b ? 1 : 0)) * 31) + this.j;
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "MultiMonthHeaderViewModel_{imageUrl_String=" + this.d + ", isAnnualOffer_Boolean=" + this.b + ", offerLabel_Int=" + this.j + "}" + super.toString();
    }
}
