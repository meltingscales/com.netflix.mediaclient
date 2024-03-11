package o;

import android.view.ViewParent;
import o.AbstractC3073as;
import o.AbstractC3516bAt;

/* loaded from: classes4.dex */
public class bAA extends AbstractC3516bAt implements InterfaceC1673aK<AbstractC3516bAt.a>, InterfaceC3520bAx {
    private InterfaceC4467bf<bAA, AbstractC3516bAt.a> b;
    private InterfaceC4414be<bAA, AbstractC3516bAt.a> g;
    private InterfaceC4732bk<bAA, AbstractC3516bAt.a> h;
    private InterfaceC4573bh<bAA, AbstractC3516bAt.a> j;

    @Override // o.InterfaceC1673aK
    /* renamed from: d */
    public void e(C1511aE c1511aE, AbstractC3516bAt.a aVar, int i) {
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: b */
    public void a(AbstractC3516bAt.a aVar, int i) {
        InterfaceC4467bf<bAA, AbstractC3516bAt.a> interfaceC4467bf = this.b;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, aVar, i);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    public void e(AbstractC3516bAt.a aVar) {
        super.b((bAA) aVar);
        InterfaceC4414be<bAA, AbstractC3516bAt.a> interfaceC4414be = this.g;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, aVar);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public void c(int i, AbstractC3516bAt.a aVar) {
        InterfaceC4732bk<bAA, AbstractC3516bAt.a> interfaceC4732bk = this.h;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, aVar, i);
        }
        super.a(i, (int) aVar);
    }

    @Override // o.AbstractC3336ax
    /* renamed from: c */
    public void d(float f, float f2, int i, int i2, AbstractC3516bAt.a aVar) {
        InterfaceC4573bh<bAA, AbstractC3516bAt.a> interfaceC4573bh = this.j;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, aVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, aVar);
    }

    @Override // o.InterfaceC3520bAx
    /* renamed from: e */
    public bAA d(C9935zP c9935zP) {
        h();
        super.c(c9935zP);
        return this;
    }

    @Override // o.InterfaceC3520bAx
    /* renamed from: d */
    public bAA b(String str) {
        h();
        super.a(str);
        return this;
    }

    @Override // o.InterfaceC3520bAx
    /* renamed from: a */
    public bAA d(boolean z) {
        h();
        this.c = z;
        return this;
    }

    @Override // o.InterfaceC3520bAx
    /* renamed from: e */
    public bAA b(boolean z) {
        h();
        ((AbstractC3516bAt) this).d = z;
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: a */
    public bAA e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.InterfaceC3520bAx
    /* renamed from: d */
    public bAA c(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: d */
    public bAA a(int i) {
        super.a(i);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: d */
    public bAA a(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: c */
    public AbstractC3516bAt.a b(ViewParent viewParent) {
        return new AbstractC3516bAt.a();
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof bAA) && super.equals(obj)) {
            bAA baa = (bAA) obj;
            if ((this.b == null) != (baa.b == null)) {
                return false;
            }
            if ((this.g == null) != (baa.g == null)) {
                return false;
            }
            if ((this.h == null) != (baa.h == null)) {
                return false;
            }
            if ((this.j == null) != (baa.j == null)) {
                return false;
            }
            if ((i() == null) != (baa.i() == null)) {
                return false;
            }
            if (n() == null ? baa.n() == null : n().equals(baa.n())) {
                return this.c == baa.c && ((AbstractC3516bAt) this).d == ((AbstractC3516bAt) baa).d;
            }
            return false;
        }
        return false;
    }

    @Override // o.AbstractC3073as
    public int hashCode() {
        int hashCode = super.hashCode();
        int i = this.b != null ? 1 : 0;
        int i2 = this.g != null ? 1 : 0;
        int i3 = this.h != null ? 1 : 0;
        int i4 = this.j != null ? 1 : 0;
        return (((((((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + (i() == null ? 0 : 1)) * 31) + (n() != null ? n().hashCode() : 0)) * 31) + (this.c ? 1 : 0)) * 31) + (((AbstractC3516bAt) this).d ? 1 : 0);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "SubmitButtonModel_{eventBusFactory=" + i() + ", text=" + n() + ", isEnabled=" + this.c + ", isLoading=" + ((AbstractC3516bAt) this).d + "}" + super.toString();
    }
}
