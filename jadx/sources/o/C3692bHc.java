package o;

import o.AbstractC3073as;

/* renamed from: o.bHc  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C3692bHc extends bGU implements InterfaceC1673aK<C2077aZ>, InterfaceC3690bHa {
    private InterfaceC4467bf<C3692bHc, C2077aZ> c;
    private InterfaceC4414be<C3692bHc, C2077aZ> d;
    private InterfaceC4573bh<C3692bHc, C2077aZ> h;
    private InterfaceC4732bk<C3692bHc, C2077aZ> i;

    @Override // o.InterfaceC1673aK
    /* renamed from: b */
    public void e(C1511aE c1511aE, C2077aZ c2077aZ, int i) {
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: d */
    public void a(C2077aZ c2077aZ, int i) {
        InterfaceC4467bf<C3692bHc, C2077aZ> interfaceC4467bf = this.c;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, c2077aZ, i);
        }
    }

    @Override // o.bJU, o.C3126at, o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: c */
    public void e(C2077aZ c2077aZ) {
        super.e(c2077aZ);
        InterfaceC4414be<C3692bHc, C2077aZ> interfaceC4414be = this.d;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, c2077aZ);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public void c(int i, C2077aZ c2077aZ) {
        InterfaceC4732bk<C3692bHc, C2077aZ> interfaceC4732bk = this.i;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, c2077aZ, i);
        }
        super.a(i, (int) c2077aZ);
    }

    @Override // o.AbstractC3336ax
    /* renamed from: b */
    public void d(float f, float f2, int i, int i2, C2077aZ c2077aZ) {
        InterfaceC4573bh<C3692bHc, C2077aZ> interfaceC4573bh = this.h;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, c2077aZ, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, c2077aZ);
    }

    @Override // o.InterfaceC3690bHa
    /* renamed from: h */
    public C3692bHc c(Integer num) {
        h();
        super.c_(num);
        return this;
    }

    @Override // o.InterfaceC3690bHa
    /* renamed from: f */
    public C3692bHc e(Integer num) {
        h();
        super.b_(num);
        return this;
    }

    @Override // o.InterfaceC3690bHa
    /* renamed from: i */
    public C3692bHc b(Integer num) {
        h();
        super.d_(num);
        return this;
    }

    @Override // o.InterfaceC3690bHa
    /* renamed from: d */
    public C3692bHc a(Integer num) {
        h();
        super.a_(num);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: b */
    public C3692bHc e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.InterfaceC3690bHa
    /* renamed from: c */
    public C3692bHc e(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.InterfaceC3690bHa
    /* renamed from: d */
    public C3692bHc b(int i) {
        super.a(i);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: e */
    public C3692bHc a(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    @Override // o.C3126at, o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C3692bHc) && super.equals(obj)) {
            C3692bHc c3692bHc = (C3692bHc) obj;
            if ((this.c == null) != (c3692bHc.c == null)) {
                return false;
            }
            if ((this.d == null) != (c3692bHc.d == null)) {
                return false;
            }
            if ((this.i == null) != (c3692bHc.i == null)) {
                return false;
            }
            if ((this.h == null) != (c3692bHc.h == null)) {
                return false;
            }
            if (m() == null ? c3692bHc.m() == null : m().equals(c3692bHc.m())) {
                if (l() == null ? c3692bHc.l() == null : l().equals(c3692bHc.l())) {
                    if (n() == null ? c3692bHc.n() == null : n().equals(c3692bHc.n())) {
                        return i() == null ? c3692bHc.i() == null : i().equals(c3692bHc.i());
                    }
                    return false;
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
        int i = this.c != null ? 1 : 0;
        int i2 = this.d != null ? 1 : 0;
        int i3 = this.i != null ? 1 : 0;
        int i4 = this.h == null ? 0 : 1;
        int hashCode2 = m() != null ? m().hashCode() : 0;
        int hashCode3 = l() != null ? l().hashCode() : 0;
        return (((((((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + hashCode2) * 31) + hashCode3) * 31) + (n() != null ? n().hashCode() : 0)) * 31) + (i() != null ? i().hashCode() : 0);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "DpSeasonSelectorGroupModel_{marginStart=" + m() + ", marginEnd=" + l() + ", marginTop=" + n() + ", marginBottom=" + i() + "}" + super.toString();
    }
}
