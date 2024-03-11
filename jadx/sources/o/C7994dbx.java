package o;

import android.view.ViewParent;
import android.widget.CompoundButton;
import o.AbstractC3073as;
import o.AbstractC3815bLr;

/* renamed from: o.dbx  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C7994dbx extends AbstractC7993dbw implements InterfaceC1673aK<AbstractC3815bLr.c>, InterfaceC7946dbB {
    private InterfaceC4573bh<C7994dbx, AbstractC3815bLr.c> b;
    private InterfaceC4467bf<C7994dbx, AbstractC3815bLr.c> c;
    private InterfaceC4414be<C7994dbx, AbstractC3815bLr.c> d;
    private InterfaceC4732bk<C7994dbx, AbstractC3815bLr.c> g;

    @Override // o.InterfaceC1673aK
    /* renamed from: d */
    public void e(C1511aE c1511aE, AbstractC3815bLr.c cVar, int i) {
    }

    @Override // o.InterfaceC1673aK
    public void a(AbstractC3815bLr.c cVar, int i) {
        InterfaceC4467bf<C7994dbx, AbstractC3815bLr.c> interfaceC4467bf = this.c;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, cVar, i);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: d */
    public void e(AbstractC3815bLr.c cVar) {
        super.b((C7994dbx) cVar);
        InterfaceC4414be<C7994dbx, AbstractC3815bLr.c> interfaceC4414be = this.d;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, cVar);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: e */
    public void c(int i, AbstractC3815bLr.c cVar) {
        InterfaceC4732bk<C7994dbx, AbstractC3815bLr.c> interfaceC4732bk = this.g;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, cVar, i);
        }
        super.a(i, (int) cVar);
    }

    @Override // o.AbstractC3336ax
    /* renamed from: a */
    public void d(float f, float f2, int i, int i2, AbstractC3815bLr.c cVar) {
        InterfaceC4573bh<C7994dbx, AbstractC3815bLr.c> interfaceC4573bh = this.b;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, cVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, cVar);
    }

    @Override // o.InterfaceC7946dbB
    /* renamed from: f */
    public C7994dbx e(int i) {
        h();
        super.x_(i);
        return this;
    }

    @Override // o.InterfaceC7946dbB
    /* renamed from: d */
    public C7994dbx e(CharSequence charSequence) {
        h();
        super.z_(charSequence);
        return this;
    }

    @Override // o.InterfaceC7946dbB
    /* renamed from: g */
    public C7994dbx c(int i) {
        h();
        super.l_(i);
        return this;
    }

    @Override // o.InterfaceC7946dbB
    /* renamed from: c */
    public C7994dbx b(boolean z) {
        h();
        super.a(z);
        return this;
    }

    @Override // o.InterfaceC7946dbB
    /* renamed from: a */
    public C7994dbx e(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        h();
        super.d(onCheckedChangeListener);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: c */
    public C7994dbx e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.InterfaceC7946dbB
    /* renamed from: c */
    public C7994dbx b(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.InterfaceC7946dbB
    /* renamed from: i */
    public C7994dbx b(int i) {
        super.a(i);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: c */
    public C7994dbx a(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: a */
    public AbstractC3815bLr.c b(ViewParent viewParent) {
        return new AbstractC3815bLr.c();
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C7994dbx) && super.equals(obj)) {
            C7994dbx c7994dbx = (C7994dbx) obj;
            if ((this.c == null) != (c7994dbx.c == null)) {
                return false;
            }
            if ((this.d == null) != (c7994dbx.d == null)) {
                return false;
            }
            if ((this.g == null) != (c7994dbx.g == null)) {
                return false;
            }
            if ((this.b == null) == (c7994dbx.b == null) && x() == c7994dbx.x() && m() == c7994dbx.m()) {
                if (v() == null ? c7994dbx.v() == null : v().equals(c7994dbx.v())) {
                    if (k() == null ? c7994dbx.k() == null : k().equals(c7994dbx.k())) {
                        if (p() == c7994dbx.p() && s() == c7994dbx.s() && l() == c7994dbx.l() && n() == c7994dbx.n() && q() == c7994dbx.q() && o() == c7994dbx.o()) {
                            if (i() == null ? c7994dbx.i() == null : i().equals(c7994dbx.i())) {
                                return (r() == null) == (c7994dbx.r() == null);
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
        int i = this.c != null ? 1 : 0;
        int i2 = this.d != null ? 1 : 0;
        int i3 = this.g != null ? 1 : 0;
        int i4 = this.b != null ? 1 : 0;
        int x = x();
        boolean m = m();
        int hashCode2 = v() != null ? v().hashCode() : 0;
        int hashCode3 = k() != null ? k().hashCode() : 0;
        int p = p();
        int s = s();
        int l = l();
        int n = n();
        int q = q();
        boolean o2 = o();
        return (((((((((((((((((((((((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + x) * 31) + (m ? 1 : 0)) * 31) + hashCode2) * 31) + hashCode3) * 31) + p) * 31) + s) * 31) + l) * 31) + n) * 31) + q) * 31) + (o2 ? 1 : 0)) * 31) + (i() != null ? i().hashCode() : 0)) * 31) + (r() != null ? 1 : 0);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "FixedWidthToggleButton_{fixedWidth=" + x() + ", displayButtonLabels=" + m() + ", text=" + ((Object) v()) + ", contentDescription=" + k() + ", drawableStart=" + p() + ", drawableTop=" + s() + ", drawableEnd=" + l() + ", drawableBottom=" + n() + ", drawablePadding=" + q() + ", checked=" + o() + ", accentColor=" + i() + ", onToggle=" + r() + "}" + super.toString();
    }
}
