package o;

import android.view.ViewParent;
import java.util.List;
import o.AbstractC3073as;
import o.bKC;

/* loaded from: classes4.dex */
public class bKD extends bKC implements InterfaceC1673aK<bKC.c>, bKF {
    private InterfaceC4573bh<bKD, bKC.c> b;
    private InterfaceC4414be<bKD, bKC.c> c;
    private InterfaceC4467bf<bKD, bKC.c> d;
    private InterfaceC4732bk<bKD, bKC.c> h;

    @Override // o.InterfaceC1673aK
    public void e(C1511aE c1511aE, bKC.c cVar, int i) {
    }

    @Override // o.bKF
    public /* synthetic */ bKF a(drM drm) {
        return c((drM<? super Integer, dpR>) drm);
    }

    @Override // o.bKF
    public /* synthetic */ bKF b(List list) {
        return d((List<String>) list);
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: c */
    public void a(bKC.c cVar, int i) {
        InterfaceC4467bf<bKD, bKC.c> interfaceC4467bf = this.d;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, cVar, i);
        }
    }

    @Override // o.bKC, o.AbstractC3336ax, o.AbstractC3073as
    public void e(bKC.c cVar) {
        super.e(cVar);
        InterfaceC4414be<bKD, bKC.c> interfaceC4414be = this.c;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, cVar);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    public void c(int i, bKC.c cVar) {
        InterfaceC4732bk<bKD, bKC.c> interfaceC4732bk = this.h;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, cVar, i);
        }
        super.a(i, (int) cVar);
    }

    @Override // o.AbstractC3336ax
    /* renamed from: c */
    public void d(float f, float f2, int i, int i2, bKC.c cVar) {
        InterfaceC4573bh<bKD, bKC.c> interfaceC4573bh = this.b;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, cVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, cVar);
    }

    public bKD d(List<String> list) {
        h();
        super.e(list);
        return this;
    }

    @Override // o.bKF
    /* renamed from: b */
    public bKD a(Integer num) {
        h();
        super.d(num);
        return this;
    }

    public bKD c(drM<? super Integer, dpR> drm) {
        h();
        super.d(drm);
        return this;
    }

    @Override // o.bKF
    /* renamed from: c */
    public bKD b(int i) {
        h();
        super.d(i);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: d */
    public bKD e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.bKF
    /* renamed from: b */
    public bKD c(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: e */
    public bKD a(int i) {
        super.a(i);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: c */
    public bKD a(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: e */
    public bKC.c b(ViewParent viewParent) {
        return new bKC.c();
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof bKD) && super.equals(obj)) {
            bKD bkd = (bKD) obj;
            if ((this.d == null) != (bkd.d == null)) {
                return false;
            }
            if ((this.c == null) != (bkd.c == null)) {
                return false;
            }
            if ((this.h == null) != (bkd.h == null)) {
                return false;
            }
            if ((this.b == null) != (bkd.b == null)) {
                return false;
            }
            if (o() == null ? bkd.o() == null : o().equals(bkd.o())) {
                if (m() == null ? bkd.m() == null : m().equals(bkd.m())) {
                    return (i() == null) == (bkd.i() == null) && k() == bkd.k();
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
        int i3 = this.h != null ? 1 : 0;
        int i4 = this.b != null ? 1 : 0;
        int hashCode2 = o() != null ? o().hashCode() : 0;
        return (((((((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + hashCode2) * 31) + (m() != null ? m().hashCode() : 0)) * 31) + (i() != null ? 1 : 0)) * 31) + k();
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "RadioGroupModel_{radioOptions=" + o() + ", preselectedOption=" + m() + ", radioButtonLayout=" + k() + "}" + super.toString();
    }
}
