package o;

import android.view.View;
import android.view.ViewParent;
import o.AbstractC3073as;
import o.AbstractC3818bLu;

/* loaded from: classes4.dex */
public class bLD extends AbstractC3818bLu implements InterfaceC1673aK<AbstractC3818bLu.d>, bLC {
    private InterfaceC4573bh<bLD, AbstractC3818bLu.d> b;
    private InterfaceC4467bf<bLD, AbstractC3818bLu.d> c;
    private InterfaceC4414be<bLD, AbstractC3818bLu.d> d;
    private InterfaceC4732bk<bLD, AbstractC3818bLu.d> g;

    @Override // o.InterfaceC1673aK
    /* renamed from: a */
    public void e(C1511aE c1511aE, AbstractC3818bLu.d dVar, int i) {
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: c */
    public void a(AbstractC3818bLu.d dVar, int i) {
        InterfaceC4467bf<bLD, AbstractC3818bLu.d> interfaceC4467bf = this.c;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, dVar, i);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    public void e(AbstractC3818bLu.d dVar) {
        super.b((bLD) dVar);
        InterfaceC4414be<bLD, AbstractC3818bLu.d> interfaceC4414be = this.d;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, dVar);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: b */
    public void c(int i, AbstractC3818bLu.d dVar) {
        InterfaceC4732bk<bLD, AbstractC3818bLu.d> interfaceC4732bk = this.g;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, dVar, i);
        }
        super.a(i, (int) dVar);
    }

    @Override // o.AbstractC3336ax
    /* renamed from: c */
    public void d(float f, float f2, int i, int i2, AbstractC3818bLu.d dVar) {
        InterfaceC4573bh<bLD, AbstractC3818bLu.d> interfaceC4573bh = this.b;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, dVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, dVar);
    }

    @Override // o.bLC
    /* renamed from: b */
    public bLD a(View.OnClickListener onClickListener) {
        h();
        super.c_(onClickListener);
        return this;
    }

    @Override // o.bLC
    /* renamed from: b */
    public bLD d(Integer num) {
        h();
        super.k_(num);
        return this;
    }

    @Override // o.bLC
    /* renamed from: e */
    public bLD c(Integer num) {
        h();
        super.a(num);
        return this;
    }

    @Override // o.bLC
    /* renamed from: d */
    public bLD c(boolean z) {
        h();
        super.r_(z);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: c */
    public bLD e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.bLC
    /* renamed from: e */
    public bLD d(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: c */
    public bLD a(int i) {
        super.a(i);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: d */
    public bLD a(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: a */
    public AbstractC3818bLu.d b(ViewParent viewParent) {
        return new AbstractC3818bLu.d();
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof bLD) && super.equals(obj)) {
            bLD bld = (bLD) obj;
            if ((this.c == null) != (bld.c == null)) {
                return false;
            }
            if ((this.d == null) != (bld.d == null)) {
                return false;
            }
            if ((this.g == null) != (bld.g == null)) {
                return false;
            }
            if ((this.b == null) != (bld.b == null)) {
                return false;
            }
            if ((l() == null) != (bld.l() == null)) {
                return false;
            }
            if (o() == null ? bld.o() == null : o().equals(bld.o())) {
                if (m() == null ? bld.m() == null : m().equals(bld.m())) {
                    if (n() == null ? bld.n() == null : n().equals(bld.n())) {
                        return i() == bld.i();
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
        int i5 = l() == null ? 0 : 1;
        int hashCode2 = o() != null ? o().hashCode() : 0;
        return (((((((((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + i5) * 31) + hashCode2) * 31) + (m() != null ? m().hashCode() : 0)) * 31) + (n() != null ? n().hashCode() : 0)) * 31) + (i() ? 1 : 0);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "ToolbarModel_{navigationOnClickListener=" + l() + ", title=" + ((Object) o()) + ", iconRes=" + m() + ", iconContentDescription=" + n() + ", dark=" + i() + "}" + super.toString();
    }
}
