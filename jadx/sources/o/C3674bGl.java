package o;

import android.view.ViewParent;
import o.AbstractC3073as;
import o.AbstractC3676bGn;

/* renamed from: o.bGl  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C3674bGl extends AbstractC3676bGn implements InterfaceC1673aK<AbstractC3676bGn.a>, InterfaceC3677bGo {
    private InterfaceC4573bh<C3674bGl, AbstractC3676bGn.a> b;
    private InterfaceC4467bf<C3674bGl, AbstractC3676bGn.a> c;
    private InterfaceC4414be<C3674bGl, AbstractC3676bGn.a> d;
    private InterfaceC4732bk<C3674bGl, AbstractC3676bGn.a> i;

    @Override // o.InterfaceC1673aK
    public void e(C1511aE c1511aE, AbstractC3676bGn.a aVar, int i) {
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: b */
    public void a(AbstractC3676bGn.a aVar, int i) {
        InterfaceC4467bf<C3674bGl, AbstractC3676bGn.a> interfaceC4467bf = this.c;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, aVar, i);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: d */
    public void e(AbstractC3676bGn.a aVar) {
        super.b((C3674bGl) aVar);
        InterfaceC4414be<C3674bGl, AbstractC3676bGn.a> interfaceC4414be = this.d;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, aVar);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: d */
    public void c(int i, AbstractC3676bGn.a aVar) {
        InterfaceC4732bk<C3674bGl, AbstractC3676bGn.a> interfaceC4732bk = this.i;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, aVar, i);
        }
        super.a(i, (int) aVar);
    }

    @Override // o.AbstractC3336ax
    /* renamed from: c */
    public void d(float f, float f2, int i, int i2, AbstractC3676bGn.a aVar) {
        InterfaceC4573bh<C3674bGl, AbstractC3676bGn.a> interfaceC4573bh = this.b;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, aVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, aVar);
    }

    @Override // o.InterfaceC3677bGo
    /* renamed from: d */
    public C3674bGl e(String str) {
        h();
        super.a(str);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: c */
    public C3674bGl e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.InterfaceC3677bGo
    /* renamed from: e */
    public C3674bGl d(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.InterfaceC3677bGo
    /* renamed from: d */
    public C3674bGl c(int i) {
        super.a(i);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: e */
    public C3674bGl a(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: c */
    public AbstractC3676bGn.a b(ViewParent viewParent) {
        return new AbstractC3676bGn.a();
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C3674bGl) && super.equals(obj)) {
            C3674bGl c3674bGl = (C3674bGl) obj;
            if ((this.c == null) != (c3674bGl.c == null)) {
                return false;
            }
            if ((this.d == null) != (c3674bGl.d == null)) {
                return false;
            }
            if ((this.i == null) != (c3674bGl.i == null)) {
                return false;
            }
            if ((this.b == null) != (c3674bGl.b == null)) {
                return false;
            }
            if (i() == null ? c3674bGl.i() == null : i().equals(c3674bGl.i())) {
                return (m() == null) == (c3674bGl.m() == null);
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
        return (((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + (i() != null ? i().hashCode() : 0)) * 31) + (m() != null ? 1 : 0);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "DpBrandAndGenreBadgeModel_{imageUrl=" + i() + ", onClick=" + m() + "}" + super.toString();
    }
}
