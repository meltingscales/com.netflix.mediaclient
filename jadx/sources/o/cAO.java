package o;

import android.view.ViewParent;
import o.AbstractC3073as;
import o.bJY;

/* loaded from: classes4.dex */
public class cAO extends cAS implements InterfaceC1673aK<bJY.c>, cAP {
    private InterfaceC4467bf<cAO, bJY.c> b;
    private InterfaceC4414be<cAO, bJY.c> c;
    private InterfaceC4573bh<cAO, bJY.c> d;
    private InterfaceC4732bk<cAO, bJY.c> g;

    @Override // o.InterfaceC1673aK
    /* renamed from: b */
    public void e(C1511aE c1511aE, bJY.c cVar, int i) {
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: c */
    public void a(bJY.c cVar, int i) {
        InterfaceC4467bf<cAO, bJY.c> interfaceC4467bf = this.b;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, cVar, i);
        }
    }

    @Override // o.bJY, o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: a */
    public void e(bJY.c cVar) {
        super.e(cVar);
        InterfaceC4414be<cAO, bJY.c> interfaceC4414be = this.c;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, cVar);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: b */
    public void c(int i, bJY.c cVar) {
        InterfaceC4732bk<cAO, bJY.c> interfaceC4732bk = this.g;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, cVar, i);
        }
        super.a(i, (int) cVar);
    }

    @Override // o.AbstractC3336ax
    /* renamed from: e */
    public void d(float f, float f2, int i, int i2, bJY.c cVar) {
        InterfaceC4573bh<cAO, bJY.c> interfaceC4573bh = this.d;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, cVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, cVar);
    }

    @Override // o.cAP
    /* renamed from: e */
    public cAO c(String str) {
        h();
        super.k_(str);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: b */
    public cAO e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.cAP
    /* renamed from: c */
    public cAO d(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: e */
    public cAO a(int i) {
        super.a(i);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: d */
    public cAO a(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: a */
    public bJY.c b(ViewParent viewParent) {
        return new bJY.c();
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof cAO) && super.equals(obj)) {
            cAO cao = (cAO) obj;
            if ((this.b == null) != (cao.b == null)) {
                return false;
            }
            if ((this.c == null) != (cao.c == null)) {
                return false;
            }
            if ((this.g == null) != (cao.g == null)) {
                return false;
            }
            if ((this.d == null) != (cao.d == null)) {
                return false;
            }
            if ((o() == null) != (cao.o() == null)) {
                return false;
            }
            if (m() == null ? cao.m() == null : m().equals(cao.m())) {
                if (n() != cao.n()) {
                    return false;
                }
                if (k() == null ? cao.k() == null : k().equals(cao.k())) {
                    return i() == null ? cao.i() == null : i().equals(cao.i());
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
        int i2 = this.c != null ? 1 : 0;
        int i3 = this.g != null ? 1 : 0;
        int i4 = this.d != null ? 1 : 0;
        int i5 = o() == null ? 0 : 1;
        int hashCode2 = m() != null ? m().hashCode() : 0;
        boolean n = n();
        return (((((((((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + i5) * 31) + hashCode2) * 31) + (n ? 1 : 0)) * 31) + (k() != null ? k().hashCode() : 0)) * 31) + (i() != null ? i().hashCode() : 0);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "PreviewLogoModel_{onClick=" + o() + ", url=" + m() + ", blurImage=" + n() + ", contentDescription=" + ((Object) k()) + ", backgroundColor=" + i() + "}" + super.toString();
    }
}
