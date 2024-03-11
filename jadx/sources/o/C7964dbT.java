package o;

import android.view.ViewParent;
import o.AbstractC3073as;
import o.AbstractC7960dbP;

/* renamed from: o.dbT  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C7964dbT extends AbstractC7960dbP implements InterfaceC1673aK<AbstractC7960dbP.e>, InterfaceC7963dbS {
    private InterfaceC4467bf<C7964dbT, AbstractC7960dbP.e> d;
    private InterfaceC4732bk<C7964dbT, AbstractC7960dbP.e> f;
    private InterfaceC4414be<C7964dbT, AbstractC7960dbP.e> g;
    private InterfaceC4573bh<C7964dbT, AbstractC7960dbP.e> j;

    @Override // o.InterfaceC1673aK
    /* renamed from: d */
    public void e(C1511aE c1511aE, AbstractC7960dbP.e eVar, int i) {
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: c */
    public void a(AbstractC7960dbP.e eVar, int i) {
        InterfaceC4467bf<C7964dbT, AbstractC7960dbP.e> interfaceC4467bf = this.d;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, eVar, i);
        }
    }

    @Override // o.AbstractC7960dbP, o.AbstractC3336ax, o.AbstractC3073as
    public void e(AbstractC7960dbP.e eVar) {
        super.e(eVar);
        InterfaceC4414be<C7964dbT, AbstractC7960dbP.e> interfaceC4414be = this.g;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, eVar);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: b */
    public void c(int i, AbstractC7960dbP.e eVar) {
        InterfaceC4732bk<C7964dbT, AbstractC7960dbP.e> interfaceC4732bk = this.f;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, eVar, i);
        }
        super.a(i, (int) eVar);
    }

    @Override // o.AbstractC3336ax
    /* renamed from: e */
    public void d(float f, float f2, int i, int i2, AbstractC7960dbP.e eVar) {
        InterfaceC4573bh<C7964dbT, AbstractC7960dbP.e> interfaceC4573bh = this.j;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, eVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, eVar);
    }

    @Override // o.InterfaceC7963dbS
    /* renamed from: b */
    public C7964dbT a(C7965dbU c7965dbU) {
        h();
        this.c = c7965dbU;
        return this;
    }

    @Override // o.InterfaceC7963dbS
    /* renamed from: d */
    public C7964dbT b(int i) {
        h();
        super.e(i);
        return this;
    }

    @Override // o.InterfaceC7963dbS
    /* renamed from: a */
    public C7964dbT c(String str) {
        h();
        super.ao_(str);
        return this;
    }

    @Override // o.InterfaceC7963dbS
    /* renamed from: e */
    public C7964dbT b(String str) {
        h();
        super.an_(str);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: a */
    public C7964dbT e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.InterfaceC7963dbS
    /* renamed from: d */
    public C7964dbT c(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: c */
    public C7964dbT a(int i) {
        super.a(i);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: b */
    public C7964dbT a(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: a */
    public AbstractC7960dbP.e b(ViewParent viewParent) {
        return new AbstractC7960dbP.e();
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C7964dbT) && super.equals(obj)) {
            C7964dbT c7964dbT = (C7964dbT) obj;
            if ((this.d == null) != (c7964dbT.d == null)) {
                return false;
            }
            if ((this.g == null) != (c7964dbT.g == null)) {
                return false;
            }
            if ((this.f == null) != (c7964dbT.f == null)) {
                return false;
            }
            if ((this.j == null) != (c7964dbT.j == null)) {
                return false;
            }
            if ((this.c == null) == (c7964dbT.c == null) && s() == c7964dbT.s()) {
                if (q() == null ? c7964dbT.q() == null : q().equals(c7964dbT.q())) {
                    if (m() == null ? c7964dbT.m() == null : m().equals(c7964dbT.m())) {
                        return (r() == null) == (c7964dbT.r() == null);
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override // o.AbstractC3073as
    public int hashCode() {
        int hashCode = super.hashCode();
        int i = this.d != null ? 1 : 0;
        int i2 = this.g != null ? 1 : 0;
        int i3 = this.f != null ? 1 : 0;
        int i4 = this.j != null ? 1 : 0;
        int i5 = this.c != null ? 1 : 0;
        int s = s();
        int hashCode2 = q() != null ? q().hashCode() : 0;
        return (((((((((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + i5) * 31) + s) * 31) + hashCode2) * 31) + (m() != null ? m().hashCode() : 0)) * 31) + (r() != null ? 1 : 0);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "Top10NumberModel_{drawableCreator=" + this.c + ", position=" + s() + ", imageUrlForColorThieving=" + q() + ", contentDescription=" + m() + ", onClick=" + r() + "}" + super.toString();
    }
}
