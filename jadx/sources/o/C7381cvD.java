package o;

import android.view.ViewParent;
import o.AbstractC3073as;
import o.AbstractC7429cvz;

/* renamed from: o.cvD  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C7381cvD extends AbstractC7429cvz implements InterfaceC1673aK<AbstractC7429cvz.a>, InterfaceC7380cvC {
    private InterfaceC4467bf<C7381cvD, AbstractC7429cvz.a> c;
    private InterfaceC4573bh<C7381cvD, AbstractC7429cvz.a> f;
    private InterfaceC4414be<C7381cvD, AbstractC7429cvz.a> h;
    private InterfaceC4732bk<C7381cvD, AbstractC7429cvz.a> i;

    @Override // o.InterfaceC1673aK
    public void e(C1511aE c1511aE, AbstractC7429cvz.a aVar, int i) {
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: d */
    public void a(AbstractC7429cvz.a aVar, int i) {
        InterfaceC4467bf<C7381cvD, AbstractC7429cvz.a> interfaceC4467bf = this.c;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, aVar, i);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    public void e(AbstractC7429cvz.a aVar) {
        super.b((C7381cvD) aVar);
        InterfaceC4414be<C7381cvD, AbstractC7429cvz.a> interfaceC4414be = this.h;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, aVar);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    public void c(int i, AbstractC7429cvz.a aVar) {
        InterfaceC4732bk<C7381cvD, AbstractC7429cvz.a> interfaceC4732bk = this.i;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, aVar, i);
        }
        super.a(i, (int) aVar);
    }

    @Override // o.AbstractC3336ax
    /* renamed from: a */
    public void d(float f, float f2, int i, int i2, AbstractC7429cvz.a aVar) {
        InterfaceC4573bh<C7381cvD, AbstractC7429cvz.a> interfaceC4573bh = this.f;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, aVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, aVar);
    }

    @Override // o.InterfaceC7380cvC
    /* renamed from: d */
    public C7381cvD a(boolean z) {
        h();
        super.e(z);
        return this;
    }

    @Override // o.InterfaceC7380cvC
    /* renamed from: e */
    public C7381cvD b(int i) {
        h();
        super.d(i);
        return this;
    }

    public C7381cvD d(String str) {
        h();
        super.c(str);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: b */
    public C7381cvD e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.InterfaceC7380cvC
    /* renamed from: e */
    public C7381cvD d(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: c */
    public C7381cvD a(int i) {
        super.a(i);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: e */
    public C7381cvD a(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: a */
    public AbstractC7429cvz.a b(ViewParent viewParent) {
        return new AbstractC7429cvz.a();
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C7381cvD) && super.equals(obj)) {
            C7381cvD c7381cvD = (C7381cvD) obj;
            if ((this.c == null) != (c7381cvD.c == null)) {
                return false;
            }
            if ((this.h == null) != (c7381cvD.h == null)) {
                return false;
            }
            if ((this.i == null) != (c7381cvD.i == null)) {
                return false;
            }
            if ((this.f == null) == (c7381cvD.f == null) && i() == c7381cvD.i() && o() == c7381cvD.o()) {
                return n() == null ? c7381cvD.n() == null : n().equals(c7381cvD.n());
            }
            return false;
        }
        return false;
    }

    @Override // o.AbstractC3073as
    public int hashCode() {
        int hashCode = super.hashCode();
        int i = this.c != null ? 1 : 0;
        int i2 = this.h != null ? 1 : 0;
        int i3 = this.i != null ? 1 : 0;
        int i4 = this.f == null ? 0 : 1;
        boolean i5 = i();
        return (((((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + (i5 ? 1 : 0)) * 31) + o()) * 31) + (n() != null ? n().hashCode() : 0);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "DownloadedForYouHeaderView_{empty=" + i() + ", lastUpdated=" + o() + ", profile=" + n() + "}" + super.toString();
    }
}
