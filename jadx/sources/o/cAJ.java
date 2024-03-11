package o;

import o.AbstractC3073as;

/* loaded from: classes4.dex */
public class cAJ extends cAB implements InterfaceC1673aK<C2077aZ>, cAH {
    private InterfaceC4467bf<cAJ, C2077aZ> g;
    private InterfaceC4573bh<cAJ, C2077aZ> h;
    private InterfaceC4414be<cAJ, C2077aZ> i;
    private InterfaceC4732bk<cAJ, C2077aZ> j;

    @Override // o.InterfaceC1673aK
    /* renamed from: c */
    public void e(C1511aE c1511aE, C2077aZ c2077aZ, int i) {
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: b */
    public void a(C2077aZ c2077aZ, int i) {
        InterfaceC4467bf<cAJ, C2077aZ> interfaceC4467bf = this.g;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, c2077aZ, i);
        }
    }

    @Override // o.cAB, o.bJU, o.C3126at, o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: c */
    public void e(C2077aZ c2077aZ) {
        super.e(c2077aZ);
        InterfaceC4414be<cAJ, C2077aZ> interfaceC4414be = this.i;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, c2077aZ);
        }
    }

    @Override // o.cAB, o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: b */
    public void c(int i, C2077aZ c2077aZ) {
        InterfaceC4732bk<cAJ, C2077aZ> interfaceC4732bk = this.j;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, c2077aZ, i);
        }
        super.c(i, c2077aZ);
    }

    @Override // o.AbstractC3336ax
    /* renamed from: e */
    public void d(float f, float f2, int i, int i2, C2077aZ c2077aZ) {
        InterfaceC4573bh<cAJ, C2077aZ> interfaceC4573bh = this.h;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, c2077aZ, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, c2077aZ);
    }

    @Override // o.cAH
    /* renamed from: a */
    public cAJ d(C9935zP c9935zP) {
        h();
        ((cAB) this).d = c9935zP;
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: b */
    public cAJ e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.cAH
    /* renamed from: e */
    public cAJ d(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.cAH
    /* renamed from: b */
    public cAJ d(int i) {
        super.a(i);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: d */
    public cAJ a(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    @Override // o.C3126at, o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof cAJ) && super.equals(obj)) {
            cAJ caj = (cAJ) obj;
            if ((this.g == null) != (caj.g == null)) {
                return false;
            }
            if ((this.i == null) != (caj.i == null)) {
                return false;
            }
            if ((this.j == null) != (caj.j == null)) {
                return false;
            }
            if ((this.h == null) != (caj.h == null)) {
                return false;
            }
            return (((cAB) this).d == null) == (((cAB) caj).d == null);
        }
        return false;
    }

    @Override // o.C3126at, o.AbstractC3073as
    public int hashCode() {
        int hashCode = super.hashCode();
        int i = this.g != null ? 1 : 0;
        int i2 = this.i != null ? 1 : 0;
        int i3 = this.j != null ? 1 : 0;
        return (((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + (this.h != null ? 1 : 0)) * 31) + (((cAB) this).d == null ? 0 : 1);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "PostPlayPreviewsModelGroup_{eventBusFactory=" + ((cAB) this).d + "}" + super.toString();
    }
}
