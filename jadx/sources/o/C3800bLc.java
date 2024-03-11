package o;

import android.view.ViewParent;
import com.google.android.material.tabs.TabLayout;
import o.AbstractC3073as;
import o.AbstractC3802bLe;

/* renamed from: o.bLc  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C3800bLc extends AbstractC3802bLe implements InterfaceC1673aK<AbstractC3802bLe.c>, InterfaceC3801bLd {
    private InterfaceC4573bh<C3800bLc, AbstractC3802bLe.c> b;
    private InterfaceC4467bf<C3800bLc, AbstractC3802bLe.c> c;
    private InterfaceC4414be<C3800bLc, AbstractC3802bLe.c> d;
    private InterfaceC4732bk<C3800bLc, AbstractC3802bLe.c> i;

    @Override // o.InterfaceC1673aK
    /* renamed from: b */
    public void e(C1511aE c1511aE, AbstractC3802bLe.c cVar, int i) {
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: b */
    public void a(AbstractC3802bLe.c cVar, int i) {
        InterfaceC4467bf<C3800bLc, AbstractC3802bLe.c> interfaceC4467bf = this.c;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, cVar, i);
        }
    }

    @Override // o.AbstractC3802bLe, o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: d */
    public void e(AbstractC3802bLe.c cVar) {
        super.e(cVar);
        InterfaceC4414be<C3800bLc, AbstractC3802bLe.c> interfaceC4414be = this.d;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, cVar);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: b */
    public void c(int i, AbstractC3802bLe.c cVar) {
        InterfaceC4732bk<C3800bLc, AbstractC3802bLe.c> interfaceC4732bk = this.i;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, cVar, i);
        }
        super.a(i, (int) cVar);
    }

    @Override // o.AbstractC3336ax
    /* renamed from: a */
    public void d(float f, float f2, int i, int i2, AbstractC3802bLe.c cVar) {
        InterfaceC4573bh<C3800bLc, AbstractC3802bLe.c> interfaceC4573bh = this.b;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, cVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, cVar);
    }

    @Override // o.InterfaceC3801bLd
    /* renamed from: d */
    public C3800bLc b(AbstractC3802bLe.a aVar) {
        h();
        super.a_(aVar);
        return this;
    }

    @Override // o.InterfaceC3801bLd
    /* renamed from: b */
    public C3800bLc a(Integer num) {
        h();
        super.d(num);
        return this;
    }

    @Override // o.InterfaceC3801bLd
    /* renamed from: b */
    public C3800bLc a(TabLayout.OnTabSelectedListener onTabSelectedListener) {
        h();
        super.a_(onTabSelectedListener);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: d */
    public C3800bLc e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.InterfaceC3801bLd
    /* renamed from: e */
    public C3800bLc d(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.InterfaceC3801bLd
    /* renamed from: d */
    public C3800bLc b(int i) {
        super.a(i);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: b */
    public C3800bLc a(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: e */
    public AbstractC3802bLe.c b(ViewParent viewParent) {
        return new AbstractC3802bLe.c();
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C3800bLc) && super.equals(obj)) {
            C3800bLc c3800bLc = (C3800bLc) obj;
            if ((this.c == null) != (c3800bLc.c == null)) {
                return false;
            }
            if ((this.d == null) != (c3800bLc.d == null)) {
                return false;
            }
            if ((this.i == null) != (c3800bLc.i == null)) {
                return false;
            }
            if ((this.b == null) != (c3800bLc.b == null)) {
                return false;
            }
            if (k() == null ? c3800bLc.k() == null : k().equals(c3800bLc.k())) {
                if (i() == null ? c3800bLc.i() == null : i().equals(c3800bLc.i())) {
                    return (l() == null) == (c3800bLc.l() == null);
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
        int i = this.c != null ? 1 : 0;
        int i2 = this.d != null ? 1 : 0;
        int i3 = this.i != null ? 1 : 0;
        int i4 = this.b != null ? 1 : 0;
        int hashCode2 = k() != null ? k().hashCode() : 0;
        return (((((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + hashCode2) * 31) + (i() != null ? i().hashCode() : 0)) * 31) + (l() != null ? 1 : 0);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "TabLayoutModel_{tabList=" + k() + ", defaultActiveTab=" + i() + ", onTabSelected=" + l() + "}" + super.toString();
    }
}
