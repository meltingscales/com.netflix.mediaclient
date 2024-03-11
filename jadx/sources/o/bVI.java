package o;

import android.view.View;
import android.view.ViewParent;
import o.AbstractC3073as;
import o.bVB;

/* loaded from: classes4.dex */
public class bVI extends bVB implements InterfaceC1673aK<bVB.e>, bVE {
    private InterfaceC4414be<bVI, bVB.e> b;
    private InterfaceC4467bf<bVI, bVB.e> c;
    private InterfaceC4573bh<bVI, bVB.e> d;
    private InterfaceC4732bk<bVI, bVB.e> i;

    @Override // o.InterfaceC1673aK
    /* renamed from: b */
    public void e(C1511aE c1511aE, bVB.e eVar, int i) {
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: b */
    public void a(bVB.e eVar, int i) {
        InterfaceC4467bf<bVI, bVB.e> interfaceC4467bf = this.c;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, eVar, i);
        }
    }

    @Override // o.bVB, o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: a */
    public void e(bVB.e eVar) {
        super.e(eVar);
        InterfaceC4414be<bVI, bVB.e> interfaceC4414be = this.b;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, eVar);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: e */
    public void c(int i, bVB.e eVar) {
        InterfaceC4732bk<bVI, bVB.e> interfaceC4732bk = this.i;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, eVar, i);
        }
        super.a(i, (int) eVar);
    }

    @Override // o.AbstractC3336ax
    /* renamed from: c */
    public void d(float f, float f2, int i, int i2, bVB.e eVar) {
        InterfaceC4573bh<bVI, bVB.e> interfaceC4573bh = this.d;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, eVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, eVar);
    }

    @Override // o.bVE
    /* renamed from: i */
    public bVI b(CharSequence charSequence) {
        h();
        super.D_(charSequence);
        return this;
    }

    @Override // o.bVE
    /* renamed from: c */
    public bVI a(Integer num) {
        h();
        super.m_(num);
        return this;
    }

    @Override // o.bVE
    /* renamed from: c */
    public bVI d(CharSequence charSequence) {
        h();
        super.C_(charSequence);
        return this;
    }

    @Override // o.bVE
    /* renamed from: b */
    public bVI d(Integer num) {
        h();
        super.e(num);
        return this;
    }

    @Override // o.bVE
    /* renamed from: e */
    public bVI b(View.OnClickListener onClickListener) {
        h();
        super.d(onClickListener);
        return this;
    }

    @Override // o.bVE
    /* renamed from: e */
    public bVI d(boolean z) {
        h();
        super.b(z);
        return this;
    }

    @Override // o.bVB
    public boolean q() {
        return super.q();
    }

    @Override // o.AbstractC3073as
    /* renamed from: a */
    public bVI e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.bVE
    /* renamed from: f */
    public bVI e(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: b */
    public bVI a(int i) {
        super.a(i);
        return this;
    }

    @Override // o.bVE
    /* renamed from: e */
    public bVI c(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: a */
    public bVB.e b(ViewParent viewParent) {
        return new bVB.e();
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof bVI) && super.equals(obj)) {
            bVI bvi = (bVI) obj;
            if ((this.c == null) != (bvi.c == null)) {
                return false;
            }
            if ((this.b == null) != (bvi.b == null)) {
                return false;
            }
            if ((this.i == null) != (bvi.i == null)) {
                return false;
            }
            if ((this.d == null) != (bvi.d == null)) {
                return false;
            }
            if (n() == null ? bvi.n() == null : n().equals(bvi.n())) {
                if (o() == null ? bvi.o() == null : o().equals(bvi.o())) {
                    if (k() != bvi.k()) {
                        return false;
                    }
                    if (l() == null ? bvi.l() == null : l().equals(bvi.l())) {
                        if (i() == null ? bvi.i() == null : i().equals(bvi.i())) {
                            return (m() == null) == (bvi.m() == null) && q() == bvi.q();
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
        int i2 = this.b != null ? 1 : 0;
        int i3 = this.i != null ? 1 : 0;
        int i4 = this.d != null ? 1 : 0;
        int hashCode2 = n() != null ? n().hashCode() : 0;
        int hashCode3 = o() != null ? o().hashCode() : 0;
        int k = k();
        int hashCode4 = l() != null ? l().hashCode() : 0;
        return (((((((((((((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + hashCode2) * 31) + hashCode3) * 31) + k) * 31) + hashCode4) * 31) + (i() != null ? i().hashCode() : 0)) * 31) + (m() != null ? 1 : 0)) * 31) + (q() ? 1 : 0);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "RowTitleModel_{text=" + ((Object) n()) + ", drawableStartResId=" + o() + ", drawablePadding=" + k() + ", ctaText=" + ((Object) l()) + ", ctaEndDrawableResId=" + i() + ", ctaListener=" + m() + ", isSticky=" + q() + "}" + super.toString();
    }
}
