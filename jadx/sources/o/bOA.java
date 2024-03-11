package o;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewParent;
import o.AbstractC3073as;
import o.AbstractC3901bOw;

/* loaded from: classes4.dex */
public class bOA extends AbstractC3901bOw implements InterfaceC1673aK<AbstractC3901bOw.d>, InterfaceC3900bOv {
    private InterfaceC4414be<bOA, AbstractC3901bOw.d> b;
    private InterfaceC4467bf<bOA, AbstractC3901bOw.d> d;
    private InterfaceC4573bh<bOA, AbstractC3901bOw.d> i;
    private InterfaceC4732bk<bOA, AbstractC3901bOw.d> j;

    @Override // o.InterfaceC1673aK
    /* renamed from: d */
    public void e(C1511aE c1511aE, AbstractC3901bOw.d dVar, int i) {
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: e */
    public void a(AbstractC3901bOw.d dVar, int i) {
        InterfaceC4467bf<bOA, AbstractC3901bOw.d> interfaceC4467bf = this.d;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, dVar, i);
        }
    }

    @Override // o.AbstractC3901bOw, o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: a */
    public void e(AbstractC3901bOw.d dVar) {
        super.e(dVar);
        InterfaceC4414be<bOA, AbstractC3901bOw.d> interfaceC4414be = this.b;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, dVar);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public void c(int i, AbstractC3901bOw.d dVar) {
        InterfaceC4732bk<bOA, AbstractC3901bOw.d> interfaceC4732bk = this.j;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, dVar, i);
        }
        super.a(i, (int) dVar);
    }

    @Override // o.AbstractC3336ax
    /* renamed from: c */
    public void d(float f, float f2, int i, int i2, AbstractC3901bOw.d dVar) {
        InterfaceC4573bh<bOA, AbstractC3901bOw.d> interfaceC4573bh = this.i;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, dVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, dVar);
    }

    @Override // o.InterfaceC3900bOv
    /* renamed from: f */
    public bOA a(String str) {
        h();
        super.r_(str);
        return this;
    }

    @Override // o.InterfaceC3900bOv
    /* renamed from: j */
    public bOA e(String str) {
        h();
        super.s_(str);
        return this;
    }

    @Override // o.InterfaceC3900bOv
    /* renamed from: h */
    public bOA d(String str) {
        h();
        super.p_(str);
        return this;
    }

    @Override // o.InterfaceC3900bOv
    /* renamed from: g */
    public bOA c(String str) {
        h();
        super.q_(str);
        return this;
    }

    @Override // o.InterfaceC3900bOv
    /* renamed from: i */
    public bOA b(String str) {
        h();
        super.t_(str);
        return this;
    }

    @Override // o.InterfaceC3900bOv
    /* renamed from: d */
    public bOA e(Drawable drawable) {
        h();
        super.c(drawable);
        return this;
    }

    @Override // o.InterfaceC3900bOv
    /* renamed from: e */
    public bOA b(boolean z) {
        h();
        super.a(z);
        return this;
    }

    @Override // o.InterfaceC3900bOv
    /* renamed from: a */
    public bOA e(View.OnClickListener onClickListener) {
        h();
        super.c(onClickListener);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: d */
    public bOA e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: b */
    public bOA a(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: b */
    public bOA a(int i) {
        super.a(i);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: b */
    public bOA a(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: e */
    public AbstractC3901bOw.d b(ViewParent viewParent) {
        return new AbstractC3901bOw.d();
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof bOA) && super.equals(obj)) {
            bOA boa = (bOA) obj;
            if ((this.d == null) != (boa.d == null)) {
                return false;
            }
            if ((this.b == null) != (boa.b == null)) {
                return false;
            }
            if ((this.j == null) != (boa.j == null)) {
                return false;
            }
            if ((this.i == null) != (boa.i == null)) {
                return false;
            }
            if (o() == null ? boa.o() == null : o().equals(boa.o())) {
                if (m() == null ? boa.m() == null : m().equals(boa.m())) {
                    if (i() == null ? boa.i() == null : i().equals(boa.i())) {
                        if (n() == null ? boa.n() == null : n().equals(boa.n())) {
                            if (q() == null ? boa.q() == null : q().equals(boa.q())) {
                                if ((r() == null) == (boa.r() == null) && k() == boa.k()) {
                                    return (l() == null) == (boa.l() == null);
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
        int i = this.d != null ? 1 : 0;
        int i2 = this.b != null ? 1 : 0;
        int i3 = this.j != null ? 1 : 0;
        int i4 = this.i != null ? 1 : 0;
        int hashCode2 = o() != null ? o().hashCode() : 0;
        int hashCode3 = m() != null ? m().hashCode() : 0;
        int hashCode4 = i() != null ? i().hashCode() : 0;
        int hashCode5 = n() != null ? n().hashCode() : 0;
        int hashCode6 = q() != null ? q().hashCode() : 0;
        return (((((((((((((((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + (r() != null ? 1 : 0)) * 31) + (k() ? 1 : 0)) * 31) + (l() != null ? 1 : 0);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "GameBillboardRatingsModel_{gameId=" + o() + ", genre=" + m() + ", certification=" + i() + ", certificationContentDescription=" + n() + ", ratingDescription=" + q() + ", ratingIcon=" + r() + ", installed=" + k() + ", onRatingsClicked=" + l() + "}" + super.toString();
    }
}
