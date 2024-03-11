package o;

import o.AbstractC3073as;

/* loaded from: classes4.dex */
public class bJS extends bJU implements InterfaceC1673aK<C2077aZ>, bJT {
    private InterfaceC4467bf<bJS, C2077aZ> c;
    private InterfaceC4414be<bJS, C2077aZ> d;
    private InterfaceC4573bh<bJS, C2077aZ> f;
    private InterfaceC4732bk<bJS, C2077aZ> g;

    @Override // o.InterfaceC1673aK
    /* renamed from: b */
    public void e(C1511aE c1511aE, C2077aZ c2077aZ, int i) {
    }

    @Override // o.bJT
    public /* synthetic */ bJT d(InterfaceC4467bf interfaceC4467bf) {
        return c((InterfaceC4467bf<bJS, C2077aZ>) interfaceC4467bf);
    }

    public bJS() {
    }

    public bJS(int i) {
        super(i);
    }

    @Override // o.InterfaceC1673aK
    public void a(C2077aZ c2077aZ, int i) {
        InterfaceC4467bf<bJS, C2077aZ> interfaceC4467bf = this.c;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, c2077aZ, i);
        }
    }

    public bJS c(InterfaceC4467bf<bJS, C2077aZ> interfaceC4467bf) {
        h();
        this.c = interfaceC4467bf;
        return this;
    }

    @Override // o.bJU, o.C3126at, o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: c */
    public void e(C2077aZ c2077aZ) {
        super.e(c2077aZ);
        InterfaceC4414be<bJS, C2077aZ> interfaceC4414be = this.d;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, c2077aZ);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: e */
    public void c(int i, C2077aZ c2077aZ) {
        InterfaceC4732bk<bJS, C2077aZ> interfaceC4732bk = this.g;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, c2077aZ, i);
        }
        super.a(i, (int) c2077aZ);
    }

    @Override // o.AbstractC3336ax
    /* renamed from: e */
    public void d(float f, float f2, int i, int i2, C2077aZ c2077aZ) {
        InterfaceC4573bh<bJS, C2077aZ> interfaceC4573bh = this.f;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, c2077aZ, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, c2077aZ);
    }

    @Override // o.AbstractC3073as
    /* renamed from: a */
    public bJS e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.bJT
    /* renamed from: c */
    public bJS b(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: e */
    public bJS a(int i) {
        super.a(i);
        return this;
    }

    @Override // o.bJT
    /* renamed from: d */
    public bJS c(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    @Override // o.C3126at, o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof bJS) && super.equals(obj)) {
            bJS bjs = (bJS) obj;
            if ((this.c == null) != (bjs.c == null)) {
                return false;
            }
            if ((this.d == null) != (bjs.d == null)) {
                return false;
            }
            if ((this.g == null) != (bjs.g == null)) {
                return false;
            }
            return (this.f == null) == (bjs.f == null);
        }
        return false;
    }

    @Override // o.C3126at, o.AbstractC3073as
    public int hashCode() {
        int hashCode = super.hashCode();
        int i = this.c != null ? 1 : 0;
        int i2 = this.d != null ? 1 : 0;
        return (((((((hashCode * 31) + i) * 31) + i2) * 31) + (this.g != null ? 1 : 0)) * 31) + (this.f == null ? 0 : 1);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "GroupNoAccessibilityModel_{}" + super.toString();
    }
}
