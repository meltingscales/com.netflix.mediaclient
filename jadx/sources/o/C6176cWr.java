package o;

import android.view.ViewParent;
import o.AbstractC3073as;
import o.AbstractC6167cWi;

/* renamed from: o.cWr  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C6176cWr extends AbstractC6167cWi implements InterfaceC1673aK<AbstractC6167cWi.c>, InterfaceC6175cWq {
    private InterfaceC4573bh<C6176cWr, AbstractC6167cWi.c> b;
    private InterfaceC4467bf<C6176cWr, AbstractC6167cWi.c> c;
    private InterfaceC4414be<C6176cWr, AbstractC6167cWi.c> d;
    private InterfaceC4732bk<C6176cWr, AbstractC6167cWi.c> j;

    @Override // o.InterfaceC1673aK
    /* renamed from: a */
    public void e(C1511aE c1511aE, AbstractC6167cWi.c cVar, int i) {
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: c */
    public void a(AbstractC6167cWi.c cVar, int i) {
        InterfaceC4467bf<C6176cWr, AbstractC6167cWi.c> interfaceC4467bf = this.c;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, cVar, i);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: c */
    public void e(AbstractC6167cWi.c cVar) {
        super.b((C6176cWr) cVar);
        InterfaceC4414be<C6176cWr, AbstractC6167cWi.c> interfaceC4414be = this.d;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, cVar);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    public void c(int i, AbstractC6167cWi.c cVar) {
        InterfaceC4732bk<C6176cWr, AbstractC6167cWi.c> interfaceC4732bk = this.j;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, cVar, i);
        }
        super.a(i, (int) cVar);
    }

    @Override // o.AbstractC3336ax
    public void d(float f, float f2, int i, int i2, AbstractC6167cWi.c cVar) {
        InterfaceC4573bh<C6176cWr, AbstractC6167cWi.c> interfaceC4573bh = this.b;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, cVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, (int) cVar);
    }

    @Override // o.InterfaceC6175cWq
    /* renamed from: c */
    public C6176cWr d(C9935zP c9935zP) {
        h();
        super.e(c9935zP);
        return this;
    }

    @Override // o.InterfaceC6175cWq
    /* renamed from: e */
    public C6176cWr d(Integer num) {
        h();
        super.c(num);
        return this;
    }

    @Override // o.InterfaceC6175cWq
    /* renamed from: d */
    public C6176cWr c(boolean z) {
        h();
        super.M_(z);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: a */
    public C6176cWr e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.InterfaceC6175cWq
    /* renamed from: e */
    public C6176cWr b(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: b */
    public C6176cWr a(int i) {
        super.a(i);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: b */
    public C6176cWr a(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: d */
    public AbstractC6167cWi.c b(ViewParent viewParent) {
        return new AbstractC6167cWi.c();
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C6176cWr) && super.equals(obj)) {
            C6176cWr c6176cWr = (C6176cWr) obj;
            if ((this.c == null) != (c6176cWr.c == null)) {
                return false;
            }
            if ((this.d == null) != (c6176cWr.d == null)) {
                return false;
            }
            if ((this.j == null) != (c6176cWr.j == null)) {
                return false;
            }
            if ((this.b == null) != (c6176cWr.b == null)) {
                return false;
            }
            if ((m() == null) != (c6176cWr.m() == null)) {
                return false;
            }
            if (l() == null ? c6176cWr.l() == null : l().equals(c6176cWr.l())) {
                if (i() != c6176cWr.i()) {
                    return false;
                }
                if (n() == null ? c6176cWr.n() == null : n().equals(c6176cWr.n())) {
                    return o() == null ? c6176cWr.o() == null : o().equals(c6176cWr.o());
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
        int i3 = this.j != null ? 1 : 0;
        int i4 = this.b != null ? 1 : 0;
        int i5 = m() == null ? 0 : 1;
        int hashCode2 = l() != null ? l().hashCode() : 0;
        boolean i6 = i();
        return (((((((((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + i5) * 31) + hashCode2) * 31) + (i6 ? 1 : 0)) * 31) + (n() != null ? n().hashCode() : 0)) * 31) + (o() != null ? o().hashCode() : 0);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "HeaderImageModel_{eventBusFactory=" + m() + ", drawableId=" + l() + ", closeButton=" + i() + ", imageHeight=" + n() + ", imagePaddingBottom=" + o() + "}" + super.toString();
    }
}
