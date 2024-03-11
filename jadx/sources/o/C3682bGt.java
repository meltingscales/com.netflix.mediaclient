package o;

import android.view.View;
import android.view.ViewParent;
import o.AbstractC3073as;
import o.AbstractC3673bGk;

/* renamed from: o.bGt  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C3682bGt extends AbstractC3673bGk implements InterfaceC1673aK<AbstractC3673bGk.a>, InterfaceC3675bGm {
    private InterfaceC4467bf<C3682bGt, AbstractC3673bGk.a> b;
    private InterfaceC4414be<C3682bGt, AbstractC3673bGk.a> c;
    private InterfaceC4573bh<C3682bGt, AbstractC3673bGk.a> d;
    private InterfaceC4732bk<C3682bGt, AbstractC3673bGk.a> f;

    @Override // o.InterfaceC1673aK
    /* renamed from: c */
    public void e(C1511aE c1511aE, AbstractC3673bGk.a aVar, int i) {
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: c */
    public void a(AbstractC3673bGk.a aVar, int i) {
        InterfaceC4467bf<C3682bGt, AbstractC3673bGk.a> interfaceC4467bf = this.b;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, aVar, i);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: a */
    public void e(AbstractC3673bGk.a aVar) {
        super.b((C3682bGt) aVar);
        InterfaceC4414be<C3682bGt, AbstractC3673bGk.a> interfaceC4414be = this.c;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, aVar);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: e */
    public void c(int i, AbstractC3673bGk.a aVar) {
        InterfaceC4732bk<C3682bGt, AbstractC3673bGk.a> interfaceC4732bk = this.f;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, aVar, i);
        }
        super.a(i, (int) aVar);
    }

    @Override // o.AbstractC3336ax
    /* renamed from: a */
    public void d(float f, float f2, int i, int i2, AbstractC3673bGk.a aVar) {
        InterfaceC4573bh<C3682bGt, AbstractC3673bGk.a> interfaceC4573bh = this.d;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, aVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, aVar);
    }

    @Override // o.InterfaceC3675bGm
    /* renamed from: j */
    public C3682bGt e(CharSequence charSequence) {
        h();
        super.d(charSequence);
        return this;
    }

    @Override // o.InterfaceC3675bGm
    /* renamed from: h */
    public C3682bGt c(CharSequence charSequence) {
        h();
        super.c_(charSequence);
        return this;
    }

    @Override // o.InterfaceC3675bGm
    /* renamed from: e */
    public C3682bGt c(View.OnClickListener onClickListener) {
        h();
        super.d(onClickListener);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: b */
    public C3682bGt e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.InterfaceC3675bGm
    /* renamed from: i */
    public C3682bGt b(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.InterfaceC3675bGm
    /* renamed from: e */
    public C3682bGt b(int i) {
        super.a(i);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: c */
    public C3682bGt a(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: a */
    public AbstractC3673bGk.a b(ViewParent viewParent) {
        return new AbstractC3673bGk.a();
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C3682bGt) && super.equals(obj)) {
            C3682bGt c3682bGt = (C3682bGt) obj;
            if ((this.b == null) != (c3682bGt.b == null)) {
                return false;
            }
            if ((this.c == null) != (c3682bGt.c == null)) {
                return false;
            }
            if ((this.f == null) != (c3682bGt.f == null)) {
                return false;
            }
            if ((this.d == null) != (c3682bGt.d == null)) {
                return false;
            }
            if (l() == null ? c3682bGt.l() == null : l().equals(c3682bGt.l())) {
                if (i() == null ? c3682bGt.i() == null : i().equals(c3682bGt.i())) {
                    return (n() == null) == (c3682bGt.n() == null);
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
        int i = this.b != null ? 1 : 0;
        int i2 = this.c != null ? 1 : 0;
        int i3 = this.f != null ? 1 : 0;
        int i4 = this.d != null ? 1 : 0;
        int hashCode2 = l() != null ? l().hashCode() : 0;
        return (((((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + hashCode2) * 31) + (i() != null ? i().hashCode() : 0)) * 31) + (n() != null ? 1 : 0);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "DpCtaPlayButtonModel_{label=" + ((Object) l()) + ", accessibilityLabel=" + ((Object) i()) + ", onClick=" + n() + "}" + super.toString();
    }
}
