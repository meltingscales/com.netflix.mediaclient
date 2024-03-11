package o;

import android.view.ViewParent;
import java.util.List;
import o.AbstractC3073as;
import o.bKJ;
import o.bKP;

/* loaded from: classes4.dex */
public class bKL extends bKP implements InterfaceC1673aK<bKP.d>, bKM {
    private InterfaceC4573bh<bKL, bKP.d> b;
    private InterfaceC4414be<bKL, bKP.d> c;
    private InterfaceC4467bf<bKL, bKP.d> d;
    private InterfaceC4732bk<bKL, bKP.d> i;

    @Override // o.InterfaceC1673aK
    /* renamed from: a */
    public void e(C1511aE c1511aE, bKP.d dVar, int i) {
    }

    @Override // o.bKM
    public /* synthetic */ bKM a(List list) {
        return e((List<bKJ.e>) list);
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: c */
    public void a(bKP.d dVar, int i) {
        InterfaceC4467bf<bKL, bKP.d> interfaceC4467bf = this.d;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, dVar, i);
        }
    }

    @Override // o.bKP, o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: b  reason: avoid collision after fix types in other method */
    public void e(bKP.d dVar) {
        super.e(dVar);
        InterfaceC4414be<bKL, bKP.d> interfaceC4414be = this.c;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, dVar);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public void c(int i, bKP.d dVar) {
        InterfaceC4732bk<bKL, bKP.d> interfaceC4732bk = this.i;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, dVar, i);
        }
        super.a(i, (int) dVar);
    }

    @Override // o.AbstractC3336ax
    /* renamed from: b */
    public void d(float f, float f2, int i, int i2, bKP.d dVar) {
        InterfaceC4573bh<bKL, bKP.d> interfaceC4573bh = this.b;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, dVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, dVar);
    }

    public bKL e(List<bKJ.e> list) {
        h();
        super.c(list);
        return this;
    }

    @Override // o.bKM
    /* renamed from: a */
    public bKL d(bKJ.c cVar) {
        h();
        super.b(cVar);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: c */
    public bKL e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.bKM
    /* renamed from: c */
    public bKL b(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.bKM
    /* renamed from: c */
    public bKL d(int i) {
        super.a(i);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: c */
    public bKL a(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: c */
    public bKP.d b(ViewParent viewParent) {
        return new bKP.d();
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof bKL) && super.equals(obj)) {
            bKL bkl = (bKL) obj;
            if ((this.d == null) != (bkl.d == null)) {
                return false;
            }
            if ((this.c == null) != (bkl.c == null)) {
                return false;
            }
            if ((this.i == null) != (bkl.i == null)) {
                return false;
            }
            if ((this.b == null) != (bkl.b == null)) {
                return false;
            }
            if (i() == null ? bkl.i() == null : i().equals(bkl.i())) {
                return (k() == null) == (bkl.k() == null) && n() == bkl.n() && l() == bkl.l();
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
        int i3 = this.i != null ? 1 : 0;
        int i4 = this.b != null ? 1 : 0;
        return (((((((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + (i() != null ? i().hashCode() : 0)) * 31) + (k() != null ? 1 : 0)) * 31) + n()) * 31) + l();
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "ScrollableTabBarModel_{scrollableTabBarItems=" + i() + ", tabSelectedListener=" + k() + ", selectedIndex=" + n() + ", textViewResId=" + l() + "}" + super.toString();
    }
}
