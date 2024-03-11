package o;

import kotlin.Pair;
import o.AbstractC3073as;

/* renamed from: o.dbu  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C7991dbu extends AbstractC7986dbp implements InterfaceC1673aK<C2077aZ>, InterfaceC7984dbn {
    private InterfaceC4467bf<C7991dbu, C2077aZ> c;
    private InterfaceC4414be<C7991dbu, C2077aZ> d;
    private InterfaceC4732bk<C7991dbu, C2077aZ> g;
    private InterfaceC4573bh<C7991dbu, C2077aZ> j;

    @Override // o.InterfaceC1673aK
    /* renamed from: d */
    public void e(C1511aE c1511aE, C2077aZ c2077aZ, int i) {
    }

    @Override // o.InterfaceC7984dbn
    public /* synthetic */ InterfaceC7984dbn b(Pair pair) {
        return c((Pair<Integer, Integer>) pair);
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: b */
    public void a(C2077aZ c2077aZ, int i) {
        InterfaceC4467bf<C7991dbu, C2077aZ> interfaceC4467bf = this.c;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, c2077aZ, i);
        }
    }

    @Override // o.AbstractC7986dbp, o.C3126at, o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: c */
    public void e(C2077aZ c2077aZ) {
        super.e(c2077aZ);
        InterfaceC4414be<C7991dbu, C2077aZ> interfaceC4414be = this.d;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, c2077aZ);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: b */
    public void c(int i, C2077aZ c2077aZ) {
        InterfaceC4732bk<C7991dbu, C2077aZ> interfaceC4732bk = this.g;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, c2077aZ, i);
        }
        super.a(i, (int) c2077aZ);
    }

    @Override // o.AbstractC3336ax
    public void d(float f, float f2, int i, int i2, C2077aZ c2077aZ) {
        InterfaceC4573bh<C7991dbu, C2077aZ> interfaceC4573bh = this.j;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, c2077aZ, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, (int) c2077aZ);
    }

    public C7991dbu c(Pair<Integer, Integer> pair) {
        h();
        super.e(pair);
        return this;
    }

    @Override // o.InterfaceC7984dbn
    /* renamed from: a */
    public C7991dbu b(String str) {
        h();
        super.ak_(str);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: b */
    public C7991dbu e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.InterfaceC7984dbn
    /* renamed from: d */
    public C7991dbu e(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.InterfaceC7984dbn
    /* renamed from: c */
    public C7991dbu e(int i) {
        super.a(i);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: c */
    public C7991dbu a(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    @Override // o.C3126at, o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C7991dbu) && super.equals(obj)) {
            C7991dbu c7991dbu = (C7991dbu) obj;
            if ((this.c == null) != (c7991dbu.c == null)) {
                return false;
            }
            if ((this.d == null) != (c7991dbu.d == null)) {
                return false;
            }
            if ((this.g == null) != (c7991dbu.g == null)) {
                return false;
            }
            if ((this.j == null) != (c7991dbu.j == null)) {
                return false;
            }
            if (n() == null ? c7991dbu.n() == null : n().equals(c7991dbu.n())) {
                if (k() != c7991dbu.k()) {
                    return false;
                }
                return i() == null ? c7991dbu.i() == null : i().equals(c7991dbu.i());
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
        int i3 = this.g != null ? 1 : 0;
        int i4 = this.j == null ? 0 : 1;
        return (((((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + (n() != null ? n().hashCode() : 0)) * 31) + (k() ? 1 : 0)) * 31) + (i() != null ? i().hashCode() : 0);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "DateGroupModel_{size=" + n() + ", optInMeasuring=" + k() + ", contentDescription=" + i() + "}" + super.toString();
    }
}
