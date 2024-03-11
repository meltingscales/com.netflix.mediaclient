package o;

import o.AbstractC3073as;

/* renamed from: o.bVo  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4082bVo extends AbstractC4078bVk implements InterfaceC1673aK<C2077aZ>, InterfaceC4081bVn {
    private InterfaceC4467bf<C4082bVo, C2077aZ> c;
    private InterfaceC4414be<C4082bVo, C2077aZ> d;
    private InterfaceC4573bh<C4082bVo, C2077aZ> g;
    private InterfaceC4732bk<C4082bVo, C2077aZ> j;

    @Override // o.InterfaceC1673aK
    public void e(C1511aE c1511aE, C2077aZ c2077aZ, int i) {
    }

    @Override // o.InterfaceC4081bVn
    public /* synthetic */ InterfaceC4081bVn d(InterfaceC4414be interfaceC4414be) {
        return e((InterfaceC4414be<C4082bVo, C2077aZ>) interfaceC4414be);
    }

    @Override // o.InterfaceC4081bVn
    public /* synthetic */ InterfaceC4081bVn e(InterfaceC4467bf interfaceC4467bf) {
        return d((InterfaceC4467bf<C4082bVo, C2077aZ>) interfaceC4467bf);
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: d */
    public void a(C2077aZ c2077aZ, int i) {
        InterfaceC4467bf<C4082bVo, C2077aZ> interfaceC4467bf = this.c;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, c2077aZ, i);
        }
    }

    public C4082bVo d(InterfaceC4467bf<C4082bVo, C2077aZ> interfaceC4467bf) {
        h();
        this.c = interfaceC4467bf;
        return this;
    }

    @Override // o.C3126at, o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: c */
    public void e(C2077aZ c2077aZ) {
        super.e(c2077aZ);
        InterfaceC4414be<C4082bVo, C2077aZ> interfaceC4414be = this.d;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, c2077aZ);
        }
    }

    public C4082bVo e(InterfaceC4414be<C4082bVo, C2077aZ> interfaceC4414be) {
        h();
        this.d = interfaceC4414be;
        return this;
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: e */
    public void c(int i, C2077aZ c2077aZ) {
        InterfaceC4732bk<C4082bVo, C2077aZ> interfaceC4732bk = this.j;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, c2077aZ, i);
        }
        super.a(i, (int) c2077aZ);
    }

    @Override // o.AbstractC3336ax
    /* renamed from: e */
    public void d(float f, float f2, int i, int i2, C2077aZ c2077aZ) {
        InterfaceC4573bh<C4082bVo, C2077aZ> interfaceC4573bh = this.g;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, c2077aZ, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, c2077aZ);
    }

    @Override // o.InterfaceC4081bVn
    /* renamed from: c */
    public C4082bVo b(String str) {
        h();
        super.G_(str);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: d */
    public C4082bVo e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.InterfaceC4081bVn
    /* renamed from: c */
    public C4082bVo e(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.InterfaceC4081bVn
    /* renamed from: e */
    public C4082bVo b(int i) {
        super.a(i);
        return this;
    }

    @Override // o.InterfaceC4081bVn
    /* renamed from: c */
    public C4082bVo e(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    @Override // o.C3126at, o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C4082bVo) && super.equals(obj)) {
            C4082bVo c4082bVo = (C4082bVo) obj;
            if ((this.c == null) != (c4082bVo.c == null)) {
                return false;
            }
            if ((this.d == null) != (c4082bVo.d == null)) {
                return false;
            }
            if ((this.j == null) != (c4082bVo.j == null)) {
                return false;
            }
            if ((this.g == null) != (c4082bVo.g == null)) {
                return false;
            }
            return (i() == null) == (c4082bVo.i() == null);
        }
        return false;
    }

    @Override // o.C3126at, o.AbstractC3073as
    public int hashCode() {
        int hashCode = super.hashCode();
        int i = this.c != null ? 1 : 0;
        int i2 = this.d != null ? 1 : 0;
        int i3 = this.j != null ? 1 : 0;
        return (((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + (this.g != null ? 1 : 0)) * 31) + (i() == null ? 0 : 1);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "GroupModel_{debugInfo=" + i() + "}" + super.toString();
    }
}
