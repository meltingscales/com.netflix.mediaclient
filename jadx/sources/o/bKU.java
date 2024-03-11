package o;

import android.view.View;
import o.AbstractC3073as;

/* loaded from: classes4.dex */
public class bKU extends bKT implements InterfaceC1673aK<bIG>, bKS {
    private InterfaceC4467bf<bKU, bIG> b;
    private InterfaceC4573bh<bKU, bIG> c;
    private InterfaceC4414be<bKU, bIG> d;
    private InterfaceC4732bk<bKU, bIG> f;

    @Override // o.InterfaceC1673aK
    /* renamed from: d */
    public void e(C1511aE c1511aE, bIG big, int i) {
    }

    @Override // o.bKS
    public /* synthetic */ bKS a(InterfaceC4467bf interfaceC4467bf) {
        return e((InterfaceC4467bf<bKU, bIG>) interfaceC4467bf);
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: e */
    public void a(bIG big, int i) {
        InterfaceC4467bf<bKU, bIG> interfaceC4467bf = this.b;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, big, i);
        }
    }

    public bKU e(InterfaceC4467bf<bKU, bIG> interfaceC4467bf) {
        h();
        this.b = interfaceC4467bf;
        return this;
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: c */
    public void e(bIG big) {
        super.b((bKU) big);
        InterfaceC4414be<bKU, bIG> interfaceC4414be = this.d;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, big);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public void c(int i, bIG big) {
        InterfaceC4732bk<bKU, bIG> interfaceC4732bk = this.f;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, big, i);
        }
        super.a(i, (int) big);
    }

    @Override // o.AbstractC3336ax
    /* renamed from: c */
    public void d(float f, float f2, int i, int i2, bIG big) {
        InterfaceC4573bh<bKU, bIG> interfaceC4573bh = this.c;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, big, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, big);
    }

    @Override // o.bKS
    /* renamed from: j */
    public bKU d(Integer num) {
        h();
        super.b(num);
        return this;
    }

    @Override // o.bKS
    /* renamed from: e */
    public bKU a(Integer num) {
        h();
        super.c(num);
        return this;
    }

    @Override // o.bKS
    /* renamed from: b */
    public bKU d(int i) {
        h();
        super.e(i);
        return this;
    }

    public bKU d(View.OnClickListener onClickListener) {
        h();
        super.b(onClickListener);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: a */
    public bKU e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.bKS
    /* renamed from: b */
    public bKU d(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: c */
    public bKU a(int i) {
        super.a(i);
        return this;
    }

    @Override // o.bKS
    /* renamed from: d */
    public bKU b(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof bKU) && super.equals(obj)) {
            bKU bku = (bKU) obj;
            if ((this.b == null) != (bku.b == null)) {
                return false;
            }
            if ((this.d == null) != (bku.d == null)) {
                return false;
            }
            if ((this.f == null) != (bku.f == null)) {
                return false;
            }
            if ((this.c == null) != (bku.c == null)) {
                return false;
            }
            if (n() == null ? bku.n() == null : n().equals(bku.n())) {
                if (k() == null ? bku.k() == null : k().equals(bku.k())) {
                    if (m() != bku.m()) {
                        return false;
                    }
                    return (i() == null) == (bku.i() == null) && o() == bku.o();
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
        int i = this.b != null ? 1 : 0;
        int i2 = this.d != null ? 1 : 0;
        int i3 = this.f != null ? 1 : 0;
        int i4 = this.c != null ? 1 : 0;
        int hashCode2 = n() != null ? n().hashCode() : 0;
        int hashCode3 = k() != null ? k().hashCode() : 0;
        return (((((((((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + hashCode2) * 31) + hashCode3) * 31) + m()) * 31) + (i() != null ? 1 : 0)) * 31) + (o() ? 1 : 0);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "SpacerModel_{width=" + n() + ", height=" + k() + ", visibility=" + m() + ", clickListener=" + i() + ", optInMeasuring=" + o() + "}" + super.toString();
    }
}
