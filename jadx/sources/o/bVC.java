package o;

import android.view.View;
import o.AbstractC3073as;

/* loaded from: classes4.dex */
public class bVC extends AbstractC4093bVz implements InterfaceC1673aK<C1181Ru>, bVD {
    private InterfaceC4414be<bVC, C1181Ru> b;
    private InterfaceC4467bf<bVC, C1181Ru> c;
    private InterfaceC4573bh<bVC, C1181Ru> d;
    private InterfaceC4732bk<bVC, C1181Ru> j;

    @Override // o.InterfaceC1673aK
    public void e(C1511aE c1511aE, C1181Ru c1181Ru, int i) {
    }

    @Override // o.InterfaceC1673aK
    public void a(C1181Ru c1181Ru, int i) {
        InterfaceC4467bf<bVC, C1181Ru> interfaceC4467bf = this.c;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, c1181Ru, i);
        }
    }

    @Override // o.AbstractC4093bVz, o.AbstractC3073as
    /* renamed from: c */
    public void e(C1181Ru c1181Ru) {
        super.e(c1181Ru);
        InterfaceC4414be<bVC, C1181Ru> interfaceC4414be = this.b;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, c1181Ru);
        }
    }

    @Override // o.AbstractC3073as
    /* renamed from: a */
    public void c(int i, C1181Ru c1181Ru) {
        InterfaceC4732bk<bVC, C1181Ru> interfaceC4732bk = this.j;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, c1181Ru, i);
        }
        super.c(i, (int) c1181Ru);
    }

    @Override // o.AbstractC3073as
    public void b(float f, float f2, int i, int i2, C1181Ru c1181Ru) {
        InterfaceC4573bh<bVC, C1181Ru> interfaceC4573bh = this.d;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, c1181Ru, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, (int) c1181Ru);
    }

    @Override // o.bVD
    /* renamed from: e */
    public bVC a(View.OnClickListener onClickListener) {
        h();
        super.d(onClickListener);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: a */
    public bVC e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.bVD
    /* renamed from: b */
    public bVC c(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: e */
    public bVC a(int i) {
        super.a(i);
        return this;
    }

    @Override // o.bVD
    /* renamed from: b */
    public bVC c(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof bVC) && super.equals(obj)) {
            bVC bvc = (bVC) obj;
            if ((this.c == null) != (bvc.c == null)) {
                return false;
            }
            if ((this.b == null) != (bvc.b == null)) {
                return false;
            }
            if ((this.j == null) != (bvc.j == null)) {
                return false;
            }
            if ((this.d == null) == (bvc.d == null) && k() == bvc.k() && l() == bvc.l() && m() == bvc.m()) {
                return (i() == null) == (bvc.i() == null);
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
        int i3 = this.j != null ? 1 : 0;
        int i4 = this.d != null ? 1 : 0;
        int k = k();
        int l = l();
        return (((((((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + k) * 31) + l) * 31) + m()) * 31) + (i() == null ? 0 : 1);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "MyListGalleryEmptyStateModel_{iconDrawable=" + k() + ", messageText=" + l() + ", buttonText=" + m() + ", buttonClickListener=" + i() + "}" + super.toString();
    }
}
