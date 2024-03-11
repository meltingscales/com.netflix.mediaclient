package o;

import android.view.View;
import android.view.ViewParent;
import o.AbstractC3073as;
import o.bIR;

/* loaded from: classes4.dex */
public class bIS extends bIR implements InterfaceC1673aK<bIR.e>, bIP {
    private InterfaceC4467bf<bIS, bIR.e> c;
    private InterfaceC4414be<bIS, bIR.e> d;
    private InterfaceC4573bh<bIS, bIR.e> g;
    private InterfaceC4732bk<bIS, bIR.e> h;

    @Override // o.InterfaceC1673aK
    /* renamed from: c */
    public void e(C1511aE c1511aE, bIR.e eVar, int i) {
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: c */
    public void a(bIR.e eVar, int i) {
        InterfaceC4467bf<bIS, bIR.e> interfaceC4467bf = this.c;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, eVar, i);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: a */
    public void e(bIR.e eVar) {
        super.b((bIS) eVar);
        InterfaceC4414be<bIS, bIR.e> interfaceC4414be = this.d;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, eVar);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    public void c(int i, bIR.e eVar) {
        InterfaceC4732bk<bIS, bIR.e> interfaceC4732bk = this.h;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, eVar, i);
        }
        super.a(i, (int) eVar);
    }

    @Override // o.AbstractC3336ax
    /* renamed from: e */
    public void d(float f, float f2, int i, int i2, bIR.e eVar) {
        InterfaceC4573bh<bIS, bIR.e> interfaceC4573bh = this.g;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, eVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, eVar);
    }

    @Override // o.bIP
    /* renamed from: b */
    public bIS e(View.OnClickListener onClickListener) {
        h();
        ((bIR) this).b = onClickListener;
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: b */
    public bIS e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.bIP
    /* renamed from: c */
    public bIS b(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: c */
    public bIS a(int i) {
        super.a(i);
        return this;
    }

    @Override // o.bIP
    /* renamed from: d */
    public bIS c(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: d */
    public bIR.e b(ViewParent viewParent) {
        return new bIR.e();
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof bIS) && super.equals(obj)) {
            bIS bis = (bIS) obj;
            if ((this.c == null) != (bis.c == null)) {
                return false;
            }
            if ((this.d == null) != (bis.d == null)) {
                return false;
            }
            if ((this.h == null) != (bis.h == null)) {
                return false;
            }
            if ((this.g == null) != (bis.g == null)) {
                return false;
            }
            if (l() == null ? bis.l() == null : l().equals(bis.l())) {
                return (((bIR) this).b == null) == (((bIR) bis).b == null);
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
        int i3 = this.h != null ? 1 : 0;
        int i4 = this.g != null ? 1 : 0;
        return (((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + (l() != null ? l().hashCode() : 0)) * 31) + (((bIR) this).b != null ? 1 : 0);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "RetryButtonModel_{gravity=" + l() + ", clickListener=" + ((bIR) this).b + "}" + super.toString();
    }
}
