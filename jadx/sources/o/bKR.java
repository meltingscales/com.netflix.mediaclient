package o;

import o.AbstractC3073as;

/* loaded from: classes4.dex */
public class bKR extends bKO implements InterfaceC1673aK<bIG>, bKN {
    private InterfaceC4467bf<bKR, bIG> b;
    private InterfaceC4732bk<bKR, bIG> f;
    private InterfaceC4573bh<bKR, bIG> g;
    private InterfaceC4414be<bKR, bIG> j;

    @Override // o.InterfaceC1673aK
    /* renamed from: c */
    public void e(C1511aE c1511aE, bIG big, int i) {
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: d */
    public void a(bIG big, int i) {
        InterfaceC4467bf<bKR, bIG> interfaceC4467bf = this.b;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, big, i);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: c */
    public void e(bIG big) {
        super.b((bKR) big);
        InterfaceC4414be<bKR, bIG> interfaceC4414be = this.j;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, big);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: d */
    public void c(int i, bIG big) {
        InterfaceC4732bk<bKR, bIG> interfaceC4732bk = this.f;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, big, i);
        }
        super.a(i, (int) big);
    }

    @Override // o.AbstractC3336ax
    public void d(float f, float f2, int i, int i2, bIG big) {
        InterfaceC4573bh<bKR, bIG> interfaceC4573bh = this.g;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, big, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, (int) big);
    }

    @Override // o.AbstractC3073as
    /* renamed from: c */
    public bKR e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.bKN
    /* renamed from: b */
    public bKR d(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: b */
    public bKR a(int i) {
        super.a(i);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: c */
    public bKR a(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof bKR) && super.equals(obj)) {
            bKR bkr = (bKR) obj;
            if ((this.b == null) != (bkr.b == null)) {
                return false;
            }
            if ((this.j == null) != (bkr.j == null)) {
                return false;
            }
            if ((this.f == null) != (bkr.f == null)) {
                return false;
            }
            if ((this.g == null) == (bkr.g == null) && k() == bkr.k() && m() == bkr.m()) {
                return i() == null ? bkr.i() == null : i().equals(bkr.i());
            }
            return false;
        }
        return false;
    }

    @Override // o.AbstractC3073as
    public int hashCode() {
        int hashCode = super.hashCode();
        int i = this.b != null ? 1 : 0;
        int i2 = this.j != null ? 1 : 0;
        int i3 = this.f != null ? 1 : 0;
        int i4 = this.g == null ? 0 : 1;
        int k = k();
        return (((((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + k) * 31) + m()) * 31) + (i() != null ? i().hashCode() : 0);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "SeparatorModel_{thickness=" + k() + ", padding=" + m() + ", color=" + i() + "}" + super.toString();
    }
}
