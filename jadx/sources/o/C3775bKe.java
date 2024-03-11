package o;

import android.view.ViewParent;
import o.AbstractC3073as;
import o.bJY;

/* renamed from: o.bKe  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C3775bKe extends bJY implements InterfaceC1673aK<bJY.c>, InterfaceC3777bKg {
    private InterfaceC4414be<C3775bKe, bJY.c> b;
    private InterfaceC4467bf<C3775bKe, bJY.c> c;
    private InterfaceC4573bh<C3775bKe, bJY.c> d;
    private InterfaceC4732bk<C3775bKe, bJY.c> h;

    @Override // o.InterfaceC1673aK
    /* renamed from: c */
    public void e(C1511aE c1511aE, bJY.c cVar, int i) {
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: b */
    public void a(bJY.c cVar, int i) {
        InterfaceC4467bf<C3775bKe, bJY.c> interfaceC4467bf = this.c;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, cVar, i);
        }
    }

    @Override // o.bJY, o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: a */
    public void e(bJY.c cVar) {
        super.e(cVar);
        InterfaceC4414be<C3775bKe, bJY.c> interfaceC4414be = this.b;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, cVar);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: e */
    public void c(int i, bJY.c cVar) {
        InterfaceC4732bk<C3775bKe, bJY.c> interfaceC4732bk = this.h;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, cVar, i);
        }
        super.a(i, (int) cVar);
    }

    @Override // o.AbstractC3336ax
    public void d(float f, float f2, int i, int i2, bJY.c cVar) {
        InterfaceC4573bh<C3775bKe, bJY.c> interfaceC4573bh = this.d;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, cVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, (int) cVar);
    }

    @Override // o.InterfaceC3777bKg
    /* renamed from: c */
    public C3775bKe a(String str) {
        h();
        super.k_(str);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: b */
    public C3775bKe e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.InterfaceC3777bKg
    /* renamed from: b */
    public C3775bKe c(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.InterfaceC3777bKg
    /* renamed from: d */
    public C3775bKe b(int i) {
        super.a(i);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: c */
    public C3775bKe a(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: e */
    public bJY.c b(ViewParent viewParent) {
        return new bJY.c();
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C3775bKe) && super.equals(obj)) {
            C3775bKe c3775bKe = (C3775bKe) obj;
            if ((this.c == null) != (c3775bKe.c == null)) {
                return false;
            }
            if ((this.b == null) != (c3775bKe.b == null)) {
                return false;
            }
            if ((this.h == null) != (c3775bKe.h == null)) {
                return false;
            }
            if ((this.d == null) != (c3775bKe.d == null)) {
                return false;
            }
            if ((o() == null) != (c3775bKe.o() == null)) {
                return false;
            }
            if (m() == null ? c3775bKe.m() == null : m().equals(c3775bKe.m())) {
                if (n() != c3775bKe.n()) {
                    return false;
                }
                if (k() == null ? c3775bKe.k() == null : k().equals(c3775bKe.k())) {
                    return i() == null ? c3775bKe.i() == null : i().equals(c3775bKe.i());
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
        int i3 = this.h != null ? 1 : 0;
        int i4 = this.d != null ? 1 : 0;
        int i5 = o() == null ? 0 : 1;
        int hashCode2 = m() != null ? m().hashCode() : 0;
        boolean n = n();
        return (((((((((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + i5) * 31) + hashCode2) * 31) + (n ? 1 : 0)) * 31) + (k() != null ? k().hashCode() : 0)) * 31) + (i() != null ? i().hashCode() : 0);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "ImageUrlModel_{onClick=" + o() + ", url=" + m() + ", blurImage=" + n() + ", contentDescription=" + ((Object) k()) + ", backgroundColor=" + i() + "}" + super.toString();
    }
}
