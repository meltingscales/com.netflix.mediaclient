package o;

import android.view.View;
import android.view.ViewParent;
import com.netflix.mediaclient.acquisition.components.form2.edittext.FormViewEditTextViewModel;
import o.AbstractC3073as;
import o.AbstractC6607cgW;

/* renamed from: o.cgX  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6608cgX extends AbstractC6607cgW implements InterfaceC1673aK<AbstractC6607cgW.a>, InterfaceC6609cgY {
    private InterfaceC4573bh<C6608cgX, AbstractC6607cgW.a> b;
    private InterfaceC4414be<C6608cgX, AbstractC6607cgW.a> c;
    private InterfaceC4467bf<C6608cgX, AbstractC6607cgW.a> d;
    private InterfaceC4732bk<C6608cgX, AbstractC6607cgW.a> g;

    @Override // o.InterfaceC1673aK
    /* renamed from: a */
    public void e(C1511aE c1511aE, AbstractC6607cgW.a aVar, int i) {
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: e */
    public void a(AbstractC6607cgW.a aVar, int i) {
        InterfaceC4467bf<C6608cgX, AbstractC6607cgW.a> interfaceC4467bf = this.d;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, aVar, i);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: c */
    public void e(AbstractC6607cgW.a aVar) {
        super.b((C6608cgX) aVar);
        InterfaceC4414be<C6608cgX, AbstractC6607cgW.a> interfaceC4414be = this.c;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, aVar);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: e */
    public void c(int i, AbstractC6607cgW.a aVar) {
        InterfaceC4732bk<C6608cgX, AbstractC6607cgW.a> interfaceC4732bk = this.g;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, aVar, i);
        }
        super.a(i, (int) aVar);
    }

    @Override // o.AbstractC3336ax
    public void d(float f, float f2, int i, int i2, AbstractC6607cgW.a aVar) {
        InterfaceC4573bh<C6608cgX, AbstractC6607cgW.a> interfaceC4573bh = this.b;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, aVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, (int) aVar);
    }

    @Override // o.InterfaceC6609cgY
    /* renamed from: i */
    public C6608cgX b(CharSequence charSequence) {
        h();
        super.J_(charSequence);
        return this;
    }

    @Override // o.InterfaceC6609cgY
    /* renamed from: d */
    public C6608cgX c(CharSequence charSequence) {
        h();
        super.I_(charSequence);
        return this;
    }

    @Override // o.InterfaceC6609cgY
    /* renamed from: j */
    public C6608cgX d(boolean z) {
        h();
        super.c(z);
        return this;
    }

    @Override // o.InterfaceC6609cgY
    /* renamed from: a */
    public C6608cgX e(boolean z) {
        h();
        super.b(z);
        return this;
    }

    @Override // o.InterfaceC6609cgY
    /* renamed from: a */
    public C6608cgX e(FormViewEditTextViewModel formViewEditTextViewModel) {
        h();
        super.c(formViewEditTextViewModel);
        return this;
    }

    @Override // o.InterfaceC6609cgY
    /* renamed from: d */
    public C6608cgX c(View.OnClickListener onClickListener) {
        h();
        super.b(onClickListener);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: a */
    public C6608cgX e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.InterfaceC6609cgY
    /* renamed from: j */
    public C6608cgX e(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: b */
    public C6608cgX a(int i) {
        super.a(i);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: d */
    public C6608cgX a(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: c */
    public AbstractC6607cgW.a b(ViewParent viewParent) {
        return new AbstractC6607cgW.a();
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C6608cgX) && super.equals(obj)) {
            C6608cgX c6608cgX = (C6608cgX) obj;
            if ((this.d == null) != (c6608cgX.d == null)) {
                return false;
            }
            if ((this.c == null) != (c6608cgX.c == null)) {
                return false;
            }
            if ((this.g == null) != (c6608cgX.g == null)) {
                return false;
            }
            if ((this.b == null) != (c6608cgX.b == null)) {
                return false;
            }
            if (q() == null ? c6608cgX.q() == null : q().equals(c6608cgX.q())) {
                if (l() == null ? c6608cgX.l() == null : l().equals(c6608cgX.l())) {
                    if (i() == null ? c6608cgX.i() == null : i().equals(c6608cgX.i())) {
                        if (s() != c6608cgX.s()) {
                            return false;
                        }
                        if ((m() == null) == (c6608cgX.m() == null) && n() == c6608cgX.n()) {
                            if ((k() == null) != (c6608cgX.k() == null)) {
                                return false;
                            }
                            return (o() == null) == (c6608cgX.o() == null);
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
        int i = this.d != null ? 1 : 0;
        int i2 = this.c != null ? 1 : 0;
        int i3 = this.g != null ? 1 : 0;
        int i4 = this.b != null ? 1 : 0;
        int hashCode2 = q() != null ? q().hashCode() : 0;
        int hashCode3 = l() != null ? l().hashCode() : 0;
        int hashCode4 = i() != null ? i().hashCode() : 0;
        boolean s = s();
        int i5 = m() != null ? 1 : 0;
        boolean n = n();
        return (((((((((((((((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (s ? 1 : 0)) * 31) + i5) * 31) + (n ? 1 : 0)) * 31) + (k() != null ? 1 : 0)) * 31) + (o() != null ? 1 : 0);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "MethodOfPaymentModel_{title=" + ((Object) q()) + ", price=" + ((Object) l()) + ", description=" + ((Object) i()) + ", showSecurityCodeField=" + s() + ", onEditSecurityCode=" + m() + ", showFormErrors=" + n() + ", securityCodeEditTextViewModel=" + k() + ", onIconClick=" + o() + "}" + super.toString();
    }
}
