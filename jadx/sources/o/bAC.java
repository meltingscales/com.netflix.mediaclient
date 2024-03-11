package o;

import android.view.ViewParent;
import o.AbstractC3073as;
import o.AbstractC3522bAz;

/* loaded from: classes4.dex */
public class bAC extends AbstractC3522bAz implements InterfaceC1673aK<AbstractC3522bAz.e>, bAF {
    private InterfaceC4573bh<bAC, AbstractC3522bAz.e> b;
    private InterfaceC4414be<bAC, AbstractC3522bAz.e> c;
    private InterfaceC4467bf<bAC, AbstractC3522bAz.e> d;
    private InterfaceC4732bk<bAC, AbstractC3522bAz.e> f;

    @Override // o.InterfaceC1673aK
    /* renamed from: c */
    public void e(C1511aE c1511aE, AbstractC3522bAz.e eVar, int i) {
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: e */
    public void a(AbstractC3522bAz.e eVar, int i) {
        InterfaceC4467bf<bAC, AbstractC3522bAz.e> interfaceC4467bf = this.d;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, eVar, i);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: c */
    public void e(AbstractC3522bAz.e eVar) {
        super.b((bAC) eVar);
        InterfaceC4414be<bAC, AbstractC3522bAz.e> interfaceC4414be = this.c;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, eVar);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public void c(int i, AbstractC3522bAz.e eVar) {
        InterfaceC4732bk<bAC, AbstractC3522bAz.e> interfaceC4732bk = this.f;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, eVar, i);
        }
        super.a(i, (int) eVar);
    }

    @Override // o.AbstractC3336ax
    /* renamed from: c */
    public void d(float f, float f2, int i, int i2, AbstractC3522bAz.e eVar) {
        InterfaceC4573bh<bAC, AbstractC3522bAz.e> interfaceC4573bh = this.b;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, eVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, eVar);
    }

    @Override // o.bAF
    /* renamed from: c */
    public bAC e(C9935zP c9935zP) {
        h();
        super.b(c9935zP);
        return this;
    }

    @Override // o.bAF
    /* renamed from: b */
    public bAC d(String str) {
        h();
        super.e(str);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: c */
    public bAC e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.bAF
    /* renamed from: c */
    public bAC d(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: d */
    public bAC a(int i) {
        super.a(i);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: c */
    public bAC a(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: e */
    public AbstractC3522bAz.e b(ViewParent viewParent) {
        return new AbstractC3522bAz.e();
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof bAC) && super.equals(obj)) {
            bAC bac = (bAC) obj;
            if ((this.d == null) != (bac.d == null)) {
                return false;
            }
            if ((this.c == null) != (bac.c == null)) {
                return false;
            }
            if ((this.f == null) != (bac.f == null)) {
                return false;
            }
            if ((this.b == null) != (bac.b == null)) {
                return false;
            }
            if ((i() == null) != (bac.i() == null)) {
                return false;
            }
            return l() == null ? bac.l() == null : l().equals(bac.l());
        }
        return false;
    }

    @Override // o.AbstractC3073as
    public int hashCode() {
        int hashCode = super.hashCode();
        int i = this.d != null ? 1 : 0;
        int i2 = this.c != null ? 1 : 0;
        int i3 = this.f != null ? 1 : 0;
        int i4 = this.b != null ? 1 : 0;
        return (((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + (i() == null ? 0 : 1)) * 31) + (l() != null ? l().hashCode() : 0);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "VerifyFooterModel_{eventBusFactory=" + i() + ", resendCodeText=" + l() + "}" + super.toString();
    }
}
