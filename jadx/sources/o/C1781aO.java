package o;

import o.AbstractC3073as;

/* renamed from: o.aO  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1781aO extends AbstractC1754aN implements InterfaceC1673aK<C2077aZ>, InterfaceC1727aM {
    private InterfaceC4467bf<C1781aO, C2077aZ> c;
    private InterfaceC4414be<C1781aO, C2077aZ> d;
    private InterfaceC4732bk<C1781aO, C2077aZ> h;
    private InterfaceC4573bh<C1781aO, C2077aZ> i;

    public C1781aO() {
    }

    public C1781aO(int i) {
        super(i);
    }

    @Override // o.AbstractC3073as
    public void b(AbstractC2914ap abstractC2914ap) {
        super.b(abstractC2914ap);
        c(abstractC2914ap);
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: d */
    public void e(C1511aE c1511aE, C2077aZ c2077aZ, int i) {
        c("The model was changed between being added to the controller and being bound.", i);
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: e */
    public void a(C2077aZ c2077aZ, int i) {
        InterfaceC4467bf<C1781aO, C2077aZ> interfaceC4467bf = this.c;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, c2077aZ, i);
        }
        c("The model was changed during the bind call.", i);
    }

    @Override // o.C3126at, o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: c */
    public void e(C2077aZ c2077aZ) {
        super.e(c2077aZ);
        InterfaceC4414be<C1781aO, C2077aZ> interfaceC4414be = this.d;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, c2077aZ);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public void c(int i, C2077aZ c2077aZ) {
        InterfaceC4732bk<C1781aO, C2077aZ> interfaceC4732bk = this.h;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, c2077aZ, i);
        }
        super.a(i, (int) c2077aZ);
    }

    @Override // o.AbstractC3336ax
    /* renamed from: b */
    public void d(float f, float f2, int i, int i2, C2077aZ c2077aZ) {
        InterfaceC4573bh<C1781aO, C2077aZ> interfaceC4573bh = this.i;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, c2077aZ, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, c2077aZ);
    }

    @Override // o.AbstractC3073as
    /* renamed from: d */
    public C1781aO e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.InterfaceC1727aM
    /* renamed from: c */
    public C1781aO b(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.InterfaceC1727aM
    /* renamed from: b */
    public C1781aO e(int i) {
        super.a(i);
        return this;
    }

    @Override // o.InterfaceC1727aM
    /* renamed from: c */
    public C1781aO b(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    @Override // o.C3126at, o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C1781aO) && super.equals(obj)) {
            C1781aO c1781aO = (C1781aO) obj;
            if ((this.c == null) != (c1781aO.c == null)) {
                return false;
            }
            if ((this.d == null) != (c1781aO.d == null)) {
                return false;
            }
            if ((this.h == null) != (c1781aO.h == null)) {
                return false;
            }
            return (this.i == null) == (c1781aO.i == null);
        }
        return false;
    }

    @Override // o.C3126at, o.AbstractC3073as
    public int hashCode() {
        int hashCode = super.hashCode();
        int i = this.c != null ? 1 : 0;
        int i2 = this.d != null ? 1 : 0;
        return (((((((hashCode * 31) + i) * 31) + i2) * 31) + (this.h != null ? 1 : 0)) * 31) + (this.i == null ? 0 : 1);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "GroupModel_{}" + super.toString();
    }
}
