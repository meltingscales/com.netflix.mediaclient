package o;

import android.view.ViewParent;
import android.widget.CompoundButton;
import o.AbstractC3073as;
import o.AbstractC3815bLr;

/* renamed from: o.bLy  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C3822bLy extends AbstractC3815bLr implements InterfaceC1673aK<AbstractC3815bLr.c>, InterfaceC3819bLv {
    private InterfaceC4467bf<C3822bLy, AbstractC3815bLr.c> b;
    private InterfaceC4573bh<C3822bLy, AbstractC3815bLr.c> c;
    private InterfaceC4414be<C3822bLy, AbstractC3815bLr.c> d;
    private InterfaceC4732bk<C3822bLy, AbstractC3815bLr.c> g;

    @Override // o.InterfaceC1673aK
    /* renamed from: b */
    public void e(C1511aE c1511aE, AbstractC3815bLr.c cVar, int i) {
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: e */
    public void a(AbstractC3815bLr.c cVar, int i) {
        InterfaceC4467bf<C3822bLy, AbstractC3815bLr.c> interfaceC4467bf = this.b;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, cVar, i);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: b  reason: avoid collision after fix types in other method */
    public void e(AbstractC3815bLr.c cVar) {
        super.b((C3822bLy) cVar);
        InterfaceC4414be<C3822bLy, AbstractC3815bLr.c> interfaceC4414be = this.d;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, cVar);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: e */
    public void c(int i, AbstractC3815bLr.c cVar) {
        InterfaceC4732bk<C3822bLy, AbstractC3815bLr.c> interfaceC4732bk = this.g;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, cVar, i);
        }
        super.a(i, (int) cVar);
    }

    @Override // o.AbstractC3336ax
    /* renamed from: c */
    public void d(float f, float f2, int i, int i2, AbstractC3815bLr.c cVar) {
        InterfaceC4573bh<C3822bLy, AbstractC3815bLr.c> interfaceC4573bh = this.c;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, cVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, cVar);
    }

    @Override // o.InterfaceC3819bLv
    /* renamed from: b */
    public C3822bLy d(CharSequence charSequence) {
        h();
        super.z_(charSequence);
        return this;
    }

    @Override // o.InterfaceC3819bLv
    /* renamed from: b */
    public C3822bLy d(String str) {
        h();
        super.c(str);
        return this;
    }

    @Override // o.InterfaceC3819bLv
    /* renamed from: b */
    public C3822bLy d(int i) {
        h();
        super.k_(i);
        return this;
    }

    @Override // o.InterfaceC3819bLv
    /* renamed from: g */
    public C3822bLy e(int i) {
        h();
        super.l_(i);
        return this;
    }

    @Override // o.InterfaceC3819bLv
    /* renamed from: c */
    public C3822bLy b(boolean z) {
        h();
        super.a(z);
        return this;
    }

    @Override // o.InterfaceC3819bLv
    /* renamed from: a */
    public C3822bLy e(Integer num) {
        h();
        super.b(num);
        return this;
    }

    @Override // o.InterfaceC3819bLv
    /* renamed from: b */
    public C3822bLy a(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        h();
        super.d(onCheckedChangeListener);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: d */
    public C3822bLy e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.InterfaceC3819bLv
    /* renamed from: c */
    public C3822bLy e(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.InterfaceC3819bLv
    /* renamed from: h */
    public C3822bLy c(int i) {
        super.a(i);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: e */
    public C3822bLy a(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: c */
    public AbstractC3815bLr.c b(ViewParent viewParent) {
        return new AbstractC3815bLr.c();
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C3822bLy) && super.equals(obj)) {
            C3822bLy c3822bLy = (C3822bLy) obj;
            if ((this.b == null) != (c3822bLy.b == null)) {
                return false;
            }
            if ((this.d == null) != (c3822bLy.d == null)) {
                return false;
            }
            if ((this.g == null) != (c3822bLy.g == null)) {
                return false;
            }
            if ((this.c == null) == (c3822bLy.c == null) && m() == c3822bLy.m()) {
                if (v() == null ? c3822bLy.v() == null : v().equals(c3822bLy.v())) {
                    if (k() == null ? c3822bLy.k() == null : k().equals(c3822bLy.k())) {
                        if (p() == c3822bLy.p() && s() == c3822bLy.s() && l() == c3822bLy.l() && n() == c3822bLy.n() && q() == c3822bLy.q() && o() == c3822bLy.o()) {
                            if (i() == null ? c3822bLy.i() == null : i().equals(c3822bLy.i())) {
                                return (r() == null) == (c3822bLy.r() == null);
                            }
                            return false;
                        }
                        return false;
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
        int i = this.b != null ? 1 : 0;
        int i2 = this.d != null ? 1 : 0;
        int i3 = this.g != null ? 1 : 0;
        int i4 = this.c != null ? 1 : 0;
        boolean m = m();
        int hashCode2 = v() != null ? v().hashCode() : 0;
        int hashCode3 = k() != null ? k().hashCode() : 0;
        int p = p();
        int s = s();
        int l = l();
        int n = n();
        int q = q();
        boolean o2 = o();
        return (((((((((((((((((((((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + (m ? 1 : 0)) * 31) + hashCode2) * 31) + hashCode3) * 31) + p) * 31) + s) * 31) + l) * 31) + n) * 31) + q) * 31) + (o2 ? 1 : 0)) * 31) + (i() != null ? i().hashCode() : 0)) * 31) + (r() != null ? 1 : 0);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "ToggleButtonModel_{displayButtonLabels=" + m() + ", text=" + ((Object) v()) + ", contentDescription=" + k() + ", drawableStart=" + p() + ", drawableTop=" + s() + ", drawableEnd=" + l() + ", drawableBottom=" + n() + ", drawablePadding=" + q() + ", checked=" + o() + ", accentColor=" + i() + ", onToggle=" + r() + "}" + super.toString();
    }
}
