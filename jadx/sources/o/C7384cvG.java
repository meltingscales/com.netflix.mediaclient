package o;

import android.view.View;
import android.view.ViewParent;
import o.AbstractC3073as;
import o.AbstractC7379cvB;

/* renamed from: o.cvG  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C7384cvG extends AbstractC7379cvB implements InterfaceC1673aK<AbstractC7379cvB.a> {
    private InterfaceC4467bf<C7384cvG, AbstractC7379cvB.a> b;
    private InterfaceC4732bk<C7384cvG, AbstractC7379cvB.a> f;
    private InterfaceC4573bh<C7384cvG, AbstractC7379cvB.a> g;
    private InterfaceC4414be<C7384cvG, AbstractC7379cvB.a> h;

    @Override // o.InterfaceC1673aK
    /* renamed from: b */
    public void e(C1511aE c1511aE, AbstractC7379cvB.a aVar, int i) {
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: e */
    public void a(AbstractC7379cvB.a aVar, int i) {
        InterfaceC4467bf<C7384cvG, AbstractC7379cvB.a> interfaceC4467bf = this.b;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, aVar, i);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: b  reason: avoid collision after fix types in other method */
    public void e(AbstractC7379cvB.a aVar) {
        super.b((C7384cvG) aVar);
        InterfaceC4414be<C7384cvG, AbstractC7379cvB.a> interfaceC4414be = this.h;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, aVar);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: d */
    public void c(int i, AbstractC7379cvB.a aVar) {
        InterfaceC4732bk<C7384cvG, AbstractC7379cvB.a> interfaceC4732bk = this.f;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, aVar, i);
        }
        super.a(i, (int) aVar);
    }

    @Override // o.AbstractC3336ax
    /* renamed from: b */
    public void d(float f, float f2, int i, int i2, AbstractC7379cvB.a aVar) {
        InterfaceC4573bh<C7384cvG, AbstractC7379cvB.a> interfaceC4573bh = this.g;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, aVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, aVar);
    }

    public C7384cvG b(String str) {
        h();
        super.e(str);
        return this;
    }

    public C7384cvG c(String str) {
        h();
        super.a(str);
        return this;
    }

    public C7384cvG h(String str) {
        h();
        super.d(str);
        return this;
    }

    public C7384cvG c(boolean z) {
        h();
        super.d(z);
        return this;
    }

    public C7384cvG c(InterfaceC4308bc<C7384cvG, AbstractC7379cvB.a> interfaceC4308bc) {
        h();
        if (interfaceC4308bc == null) {
            super.c((View.OnClickListener) null);
        } else {
            super.c((View.OnClickListener) new View$OnClickListenerC4818bn(interfaceC4308bc));
        }
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: d */
    public C7384cvG e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: c */
    public C7384cvG a(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: d */
    public C7384cvG a(int i) {
        super.a(i);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: d */
    public C7384cvG a(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: c */
    public AbstractC7379cvB.a b(ViewParent viewParent) {
        return new AbstractC7379cvB.a();
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C7384cvG) && super.equals(obj)) {
            C7384cvG c7384cvG = (C7384cvG) obj;
            if ((this.b == null) != (c7384cvG.b == null)) {
                return false;
            }
            if ((this.h == null) != (c7384cvG.h == null)) {
                return false;
            }
            if ((this.f == null) != (c7384cvG.f == null)) {
                return false;
            }
            if ((this.g == null) != (c7384cvG.g == null)) {
                return false;
            }
            if (m() == null ? c7384cvG.m() == null : m().equals(c7384cvG.m())) {
                if (n() == null ? c7384cvG.n() == null : n().equals(c7384cvG.n())) {
                    if (k() == null ? c7384cvG.k() == null : k().equals(c7384cvG.k())) {
                        if (i() != c7384cvG.i()) {
                            return false;
                        }
                        return (l() == null) == (c7384cvG.l() == null);
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
        int i = this.b != null ? 1 : 0;
        int i2 = this.h != null ? 1 : 0;
        int i3 = this.f != null ? 1 : 0;
        int i4 = this.g != null ? 1 : 0;
        int hashCode2 = m() != null ? m().hashCode() : 0;
        int hashCode3 = n() != null ? n().hashCode() : 0;
        return (((((((((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + hashCode2) * 31) + hashCode3) * 31) + (k() != null ? k().hashCode() : 0)) * 31) + (i() ? 1 : 0)) * 31) + (l() != null ? 1 : 0);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "DownloadedForYouMerchView_{videoUrl1=" + m() + ", videoUrl2=" + n() + ", videoUrl3=" + k() + ", empty=" + i() + ", setupListener=" + l() + "}" + super.toString();
    }
}
