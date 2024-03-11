package o;

import android.view.View;
import android.view.ViewParent;
import o.AbstractC3073as;
import o.cXW;

/* loaded from: classes5.dex */
public class cXV extends cXW implements InterfaceC1673aK<cXW.e>, cXY {
    private InterfaceC4467bf<cXV, cXW.e> c;
    private InterfaceC4414be<cXV, cXW.e> d;
    private InterfaceC4732bk<cXV, cXW.e> g;
    private InterfaceC4573bh<cXV, cXW.e> h;

    @Override // o.InterfaceC1673aK
    /* renamed from: d */
    public void e(C1511aE c1511aE, cXW.e eVar, int i) {
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: c */
    public void a(cXW.e eVar, int i) {
        InterfaceC4467bf<cXV, cXW.e> interfaceC4467bf = this.c;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, eVar, i);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: a */
    public void e(cXW.e eVar) {
        super.b((cXV) eVar);
        InterfaceC4414be<cXV, cXW.e> interfaceC4414be = this.d;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, eVar);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: e */
    public void c(int i, cXW.e eVar) {
        InterfaceC4732bk<cXV, cXW.e> interfaceC4732bk = this.g;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, eVar, i);
        }
        super.a(i, (int) eVar);
    }

    @Override // o.AbstractC3336ax
    /* renamed from: a */
    public void d(float f, float f2, int i, int i2, cXW.e eVar) {
        InterfaceC4573bh<cXV, cXW.e> interfaceC4573bh = this.h;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, eVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, eVar);
    }

    @Override // o.cXY
    /* renamed from: a */
    public cXV b(View.OnClickListener onClickListener) {
        h();
        ((cXW) this).b = onClickListener;
        return this;
    }

    @Override // o.cXY
    /* renamed from: c */
    public cXV d(CharSequence charSequence) {
        h();
        super.b(charSequence);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: c */
    public cXV e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.cXY
    /* renamed from: i */
    public cXV e(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: b */
    public cXV a(int i) {
        super.a(i);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: d */
    public cXV a(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: e */
    public cXW.e b(ViewParent viewParent) {
        return new cXW.e();
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof cXV) && super.equals(obj)) {
            cXV cxv = (cXV) obj;
            if ((this.c == null) != (cxv.c == null)) {
                return false;
            }
            if ((this.d == null) != (cxv.d == null)) {
                return false;
            }
            if ((this.g == null) != (cxv.g == null)) {
                return false;
            }
            if ((this.h == null) != (cxv.h == null)) {
                return false;
            }
            if ((((cXW) this).b == null) != (((cXW) cxv).b == null)) {
                return false;
            }
            return i() == null ? cxv.i() == null : i().equals(cxv.i());
        }
        return false;
    }

    @Override // o.AbstractC3073as
    public int hashCode() {
        int hashCode = super.hashCode();
        int i = this.c != null ? 1 : 0;
        int i2 = this.d != null ? 1 : 0;
        int i3 = this.g != null ? 1 : 0;
        int i4 = this.h != null ? 1 : 0;
        return (((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + (((cXW) this).b == null ? 0 : 1)) * 31) + (i() != null ? i().hashCode() : 0);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "ConfirmButtonModel_{confirmClickListener=" + ((cXW) this).b + ", billingDateDisclosureText=" + ((Object) i()) + "}" + super.toString();
    }
}
