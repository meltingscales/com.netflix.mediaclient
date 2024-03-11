package o;

import android.view.ViewParent;
import o.AbstractC3073as;
import o.AbstractC6168cWj;

/* renamed from: o.cWm  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C6171cWm extends AbstractC6168cWj implements InterfaceC1673aK<AbstractC6168cWj.e>, InterfaceC6169cWk {
    private InterfaceC4414be<C6171cWm, AbstractC6168cWj.e> c;
    private InterfaceC4467bf<C6171cWm, AbstractC6168cWj.e> d;
    private InterfaceC4573bh<C6171cWm, AbstractC6168cWj.e> g;
    private InterfaceC4732bk<C6171cWm, AbstractC6168cWj.e> h;

    @Override // o.InterfaceC1673aK
    /* renamed from: d */
    public void e(C1511aE c1511aE, AbstractC6168cWj.e eVar, int i) {
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: d */
    public void a(AbstractC6168cWj.e eVar, int i) {
        InterfaceC4467bf<C6171cWm, AbstractC6168cWj.e> interfaceC4467bf = this.d;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, eVar, i);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    public void e(AbstractC6168cWj.e eVar) {
        super.b((C6171cWm) eVar);
        InterfaceC4414be<C6171cWm, AbstractC6168cWj.e> interfaceC4414be = this.c;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, eVar);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    public void c(int i, AbstractC6168cWj.e eVar) {
        InterfaceC4732bk<C6171cWm, AbstractC6168cWj.e> interfaceC4732bk = this.h;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, eVar, i);
        }
        super.a(i, (int) eVar);
    }

    @Override // o.AbstractC3336ax
    /* renamed from: b */
    public void d(float f, float f2, int i, int i2, AbstractC6168cWj.e eVar) {
        InterfaceC4573bh<C6171cWm, AbstractC6168cWj.e> interfaceC4573bh = this.g;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, eVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, eVar);
    }

    @Override // o.InterfaceC6169cWk
    /* renamed from: c */
    public C6171cWm e(C9935zP c9935zP) {
        h();
        super.b(c9935zP);
        return this;
    }

    @Override // o.InterfaceC6169cWk
    /* renamed from: b */
    public C6171cWm d(String str) {
        h();
        super.a(str);
        return this;
    }

    @Override // o.InterfaceC6169cWk
    /* renamed from: i */
    public C6171cWm b(CharSequence charSequence) {
        h();
        super.d(charSequence);
        return this;
    }

    @Override // o.InterfaceC6169cWk
    /* renamed from: d */
    public C6171cWm c(Boolean bool) {
        h();
        super.a(bool);
        return this;
    }

    @Override // o.InterfaceC6169cWk
    /* renamed from: j */
    public C6171cWm e(boolean z) {
        h();
        super.J_(z);
        return this;
    }

    @Override // o.InterfaceC6169cWk
    /* renamed from: g */
    public C6171cWm c(boolean z) {
        h();
        super.L_(z);
        return this;
    }

    @Override // o.InterfaceC6169cWk
    /* renamed from: h */
    public C6171cWm d(boolean z) {
        h();
        super.K_(z);
        return this;
    }

    @Override // o.InterfaceC6169cWk
    /* renamed from: b */
    public C6171cWm e(int i) {
        h();
        super.v_(i);
        return this;
    }

    @Override // o.InterfaceC6169cWk
    /* renamed from: b */
    public C6171cWm a(boolean z) {
        h();
        super.I_(z);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: c */
    public C6171cWm e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.InterfaceC6169cWk
    /* renamed from: e */
    public C6171cWm c(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: d */
    public C6171cWm a(int i) {
        super.a(i);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: d */
    public C6171cWm a(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: c */
    public AbstractC6168cWj.e b(ViewParent viewParent) {
        return new AbstractC6168cWj.e();
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C6171cWm) && super.equals(obj)) {
            C6171cWm c6171cWm = (C6171cWm) obj;
            if ((this.d == null) != (c6171cWm.d == null)) {
                return false;
            }
            if ((this.c == null) != (c6171cWm.c == null)) {
                return false;
            }
            if ((this.h == null) != (c6171cWm.h == null)) {
                return false;
            }
            if ((this.g == null) != (c6171cWm.g == null)) {
                return false;
            }
            if ((m() == null) != (c6171cWm.m() == null)) {
                return false;
            }
            if ((t() == null) != (c6171cWm.t() == null)) {
                return false;
            }
            if (o() == null ? c6171cWm.o() == null : o().equals(c6171cWm.o())) {
                if (i() == null ? c6171cWm.i() == null : i().equals(c6171cWm.i())) {
                    return k() == c6171cWm.k() && r() == c6171cWm.r() && l() == c6171cWm.l() && p() == c6171cWm.p() && n() == c6171cWm.n();
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
        int i2 = this.c != null ? 1 : 0;
        int i3 = this.h != null ? 1 : 0;
        int i4 = this.g != null ? 1 : 0;
        int i5 = m() != null ? 1 : 0;
        int i6 = t() == null ? 0 : 1;
        return (((((((((((((((((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + i5) * 31) + i6) * 31) + (o() != null ? o().hashCode() : 0)) * 31) + (i() != null ? i().hashCode() : 0)) * 31) + (k() ? 1 : 0)) * 31) + (r() ? 1 : 0)) * 31) + (l() ? 1 : 0)) * 31) + p()) * 31) + (n() ? 1 : 0);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "DeviceItemModel_{eventBusFactory=" + m() + ", uuid=" + t() + ", name=" + ((Object) o()) + ", checked=" + i() + ", last=" + k() + ", solo=" + r() + ", selectable=" + l() + ", status=" + p() + ", dark=" + n() + "}" + super.toString();
    }
}
