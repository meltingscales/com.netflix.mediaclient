package o;

import kotlin.Pair;
import o.AbstractC3073as;

/* renamed from: o.bKj  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C3780bKj extends AbstractC3782bKl implements InterfaceC1673aK<C2077aZ>, InterfaceC3779bKi {
    private InterfaceC4467bf<C3780bKj, C2077aZ> c;
    private InterfaceC4414be<C3780bKj, C2077aZ> d;
    private InterfaceC4573bh<C3780bKj, C2077aZ> h;
    private InterfaceC4732bk<C3780bKj, C2077aZ> j;

    @Override // o.InterfaceC1673aK
    public void e(C1511aE c1511aE, C2077aZ c2077aZ, int i) {
    }

    @Override // o.InterfaceC3779bKi
    public /* synthetic */ InterfaceC3779bKi b(InterfaceC4467bf interfaceC4467bf) {
        return d((InterfaceC4467bf<C3780bKj, C2077aZ>) interfaceC4467bf);
    }

    @Override // o.InterfaceC3779bKi
    public /* synthetic */ InterfaceC3779bKi c(Pair pair) {
        return e((Pair<Integer, Integer>) pair);
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: b */
    public void a(C2077aZ c2077aZ, int i) {
        InterfaceC4467bf<C3780bKj, C2077aZ> interfaceC4467bf = this.c;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, c2077aZ, i);
        }
    }

    public C3780bKj d(InterfaceC4467bf<C3780bKj, C2077aZ> interfaceC4467bf) {
        h();
        this.c = interfaceC4467bf;
        return this;
    }

    @Override // o.AbstractC3782bKl, o.C3126at, o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: c */
    public void e(C2077aZ c2077aZ) {
        super.e(c2077aZ);
        InterfaceC4414be<C3780bKj, C2077aZ> interfaceC4414be = this.d;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, c2077aZ);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: d */
    public void c(int i, C2077aZ c2077aZ) {
        InterfaceC4732bk<C3780bKj, C2077aZ> interfaceC4732bk = this.j;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, c2077aZ, i);
        }
        super.a(i, (int) c2077aZ);
    }

    @Override // o.AbstractC3336ax
    /* renamed from: c */
    public void d(float f, float f2, int i, int i2, C2077aZ c2077aZ) {
        InterfaceC4573bh<C3780bKj, C2077aZ> interfaceC4573bh = this.h;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, c2077aZ, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, c2077aZ);
    }

    public C3780bKj e(Pair<Integer, Integer> pair) {
        h();
        super.a_(pair);
        return this;
    }

    @Override // o.InterfaceC3779bKi
    /* renamed from: d */
    public C3780bKj e(boolean z) {
        h();
        super.b(z);
        return this;
    }

    @Override // o.InterfaceC3779bKi
    /* renamed from: b */
    public C3780bKj d(int i) {
        h();
        super.j_(i);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: c */
    public C3780bKj e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.InterfaceC3779bKi
    /* renamed from: b */
    public C3780bKj e(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.InterfaceC3779bKi
    /* renamed from: c */
    public C3780bKj e(int i) {
        super.a(i);
        return this;
    }

    @Override // o.InterfaceC3779bKi
    /* renamed from: c */
    public C3780bKj e(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    @Override // o.C3126at, o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C3780bKj) && super.equals(obj)) {
            C3780bKj c3780bKj = (C3780bKj) obj;
            if ((this.c == null) != (c3780bKj.c == null)) {
                return false;
            }
            if ((this.d == null) != (c3780bKj.d == null)) {
                return false;
            }
            if ((this.j == null) != (c3780bKj.j == null)) {
                return false;
            }
            if ((this.h == null) != (c3780bKj.h == null)) {
                return false;
            }
            if (k() == null ? c3780bKj.k() == null : k().equals(c3780bKj.k())) {
                if (m() == c3780bKj.m() && l() == c3780bKj.l()) {
                    return i() == null ? c3780bKj.i() == null : i().equals(c3780bKj.i());
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
        int i3 = this.j != null ? 1 : 0;
        int i4 = this.h == null ? 0 : 1;
        int hashCode2 = k() != null ? k().hashCode() : 0;
        boolean m = m();
        return (((((((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + hashCode2) * 31) + (m ? 1 : 0)) * 31) + l()) * 31) + (i() != null ? i().hashCode() : 0);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "LoadingShimmerGroupModel_{size=" + k() + ", optInMeasuring=" + m() + ", importantForAccessibility=" + l() + ", contentDescription=" + i() + "}" + super.toString();
    }
}
