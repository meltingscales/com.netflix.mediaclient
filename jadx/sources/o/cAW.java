package o;

import android.view.View;
import android.view.ViewParent;
import o.AbstractC3073as;
import o.AbstractC3803bLf;

/* loaded from: classes4.dex */
public class cAW extends cAV implements InterfaceC1673aK<AbstractC3803bLf.c>, cAU {
    private InterfaceC4573bh<cAW, AbstractC3803bLf.c> b;
    private InterfaceC4467bf<cAW, AbstractC3803bLf.c> c;
    private InterfaceC4414be<cAW, AbstractC3803bLf.c> d;
    private InterfaceC4732bk<cAW, AbstractC3803bLf.c> f;

    @Override // o.InterfaceC1673aK
    /* renamed from: d */
    public void e(C1511aE c1511aE, AbstractC3803bLf.c cVar, int i) {
    }

    @Override // o.cAU
    public /* synthetic */ cAU a(InterfaceC4308bc interfaceC4308bc) {
        return d((InterfaceC4308bc<cAW, AbstractC3803bLf.c>) interfaceC4308bc);
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: b */
    public void a(AbstractC3803bLf.c cVar, int i) {
        InterfaceC4467bf<cAW, AbstractC3803bLf.c> interfaceC4467bf = this.c;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, cVar, i);
        }
    }

    @Override // o.AbstractC3803bLf, o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: b  reason: avoid collision after fix types in other method */
    public void e(AbstractC3803bLf.c cVar) {
        super.e(cVar);
        InterfaceC4414be<cAW, AbstractC3803bLf.c> interfaceC4414be = this.d;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, cVar);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: e */
    public void c(int i, AbstractC3803bLf.c cVar) {
        InterfaceC4732bk<cAW, AbstractC3803bLf.c> interfaceC4732bk = this.f;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, cVar, i);
        }
        super.a(i, (int) cVar);
    }

    @Override // o.AbstractC3336ax
    /* renamed from: a */
    public void d(float f, float f2, int i, int i2, AbstractC3803bLf.c cVar) {
        InterfaceC4573bh<cAW, AbstractC3803bLf.c> interfaceC4573bh = this.b;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, cVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, cVar);
    }

    public cAW d(InterfaceC4308bc<cAW, AbstractC3803bLf.c> interfaceC4308bc) {
        h();
        if (interfaceC4308bc == null) {
            super.d((View.OnClickListener) null);
        } else {
            super.d((View.OnClickListener) new View$OnClickListenerC4818bn(interfaceC4308bc));
        }
        return this;
    }

    @Override // o.cAU
    /* renamed from: h */
    public cAW e(CharSequence charSequence) {
        h();
        super.y_(charSequence);
        return this;
    }

    @Override // o.cAU
    /* renamed from: d */
    public cAW c(Integer num) {
        h();
        super.i_(num);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: c */
    public cAW e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.cAU
    /* renamed from: b */
    public cAW c(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.cAU
    /* renamed from: d */
    public cAW c(int i) {
        super.a(i);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: d */
    public cAW a(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: c */
    public AbstractC3803bLf.c b(ViewParent viewParent) {
        return new AbstractC3803bLf.c();
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof cAW) && super.equals(obj)) {
            cAW caw = (cAW) obj;
            if ((this.c == null) != (caw.c == null)) {
                return false;
            }
            if ((this.d == null) != (caw.d == null)) {
                return false;
            }
            if ((this.f == null) != (caw.f == null)) {
                return false;
            }
            if ((this.b == null) != (caw.b == null)) {
                return false;
            }
            if ((s() == null) != (caw.s() == null)) {
                return false;
            }
            if (q() == null ? caw.q() == null : q().equals(caw.q())) {
                if (i() == null ? caw.i() == null : i().equals(caw.i())) {
                    if (p() != caw.p()) {
                        return false;
                    }
                    if (m() == null ? caw.m() == null : m().equals(caw.m())) {
                        if (r() == null ? caw.r() == null : r().equals(caw.r())) {
                            if (n() == null ? caw.n() == null : n().equals(caw.n())) {
                                if (l() == null ? caw.l() == null : l().equals(caw.l())) {
                                    if (o() == null ? caw.o() == null : o().equals(caw.o())) {
                                        return k() == caw.k();
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
            return false;
        }
        return false;
    }

    @Override // o.AbstractC3073as
    public int hashCode() {
        int hashCode = super.hashCode();
        int i = this.c != null ? 1 : 0;
        int i2 = this.d != null ? 1 : 0;
        int i3 = this.f != null ? 1 : 0;
        int i4 = this.b != null ? 1 : 0;
        int i5 = s() == null ? 0 : 1;
        int hashCode2 = q() != null ? q().hashCode() : 0;
        int hashCode3 = i() != null ? i().hashCode() : 0;
        boolean p = p();
        int hashCode4 = m() != null ? m().hashCode() : 0;
        int hashCode5 = r() != null ? r().hashCode() : 0;
        int hashCode6 = n() != null ? n().hashCode() : 0;
        return (((((((((((((((((((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + i5) * 31) + hashCode2) * 31) + hashCode3) * 31) + (p ? 1 : 0)) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + (l() != null ? l().hashCode() : 0)) * 31) + (o() != null ? o().hashCode() : 0)) * 31) + (k() ? 1 : 0);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "PreviewTextButtonModel_{onClick=" + s() + ", text=" + ((Object) q()) + ", accessibilityText=" + ((Object) i()) + ", enabled=" + p() + ", drawableStart=" + m() + ", drawableTop=" + r() + ", drawableEnd=" + n() + ", drawableBottom=" + l() + ", drawablePadding=" + o() + ", displayButtonLabels=" + k() + "}" + super.toString();
    }
}
