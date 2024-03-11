package o;

import android.view.ViewParent;
import com.netflix.mediaclient.ui.collectphone.api.CollectPhone;
import o.AbstractC3073as;
import o.AbstractC3509bAm;

/* renamed from: o.bAv  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C3518bAv extends AbstractC3509bAm implements InterfaceC1673aK<AbstractC3509bAm.d>, InterfaceC3517bAu {
    private InterfaceC4467bf<C3518bAv, AbstractC3509bAm.d> b;
    private InterfaceC4414be<C3518bAv, AbstractC3509bAm.d> d;
    private InterfaceC4573bh<C3518bAv, AbstractC3509bAm.d> g;
    private InterfaceC4732bk<C3518bAv, AbstractC3509bAm.d> i;

    @Override // o.InterfaceC1673aK
    /* renamed from: c */
    public void e(C1511aE c1511aE, AbstractC3509bAm.d dVar, int i) {
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: d */
    public void a(AbstractC3509bAm.d dVar, int i) {
        InterfaceC4467bf<C3518bAv, AbstractC3509bAm.d> interfaceC4467bf = this.b;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, dVar, i);
        }
    }

    @Override // o.AbstractC3509bAm, o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: b  reason: avoid collision after fix types in other method */
    public void e(AbstractC3509bAm.d dVar) {
        super.e(dVar);
        InterfaceC4414be<C3518bAv, AbstractC3509bAm.d> interfaceC4414be = this.d;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, dVar);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public void c(int i, AbstractC3509bAm.d dVar) {
        InterfaceC4732bk<C3518bAv, AbstractC3509bAm.d> interfaceC4732bk = this.i;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, dVar, i);
        }
        super.a(i, (int) dVar);
    }

    @Override // o.AbstractC3336ax
    /* renamed from: e */
    public void d(float f, float f2, int i, int i2, AbstractC3509bAm.d dVar) {
        InterfaceC4573bh<C3518bAv, AbstractC3509bAm.d> interfaceC4573bh = this.g;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, dVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, dVar);
    }

    @Override // o.InterfaceC3517bAu
    /* renamed from: e */
    public C3518bAv b(C9935zP c9935zP) {
        h();
        super.d(c9935zP);
        return this;
    }

    @Override // o.InterfaceC3517bAu
    /* renamed from: d */
    public C3518bAv a(CollectPhone.d dVar) {
        h();
        super.a_(dVar);
        return this;
    }

    @Override // o.InterfaceC3517bAu
    /* renamed from: c */
    public C3518bAv d(boolean z) {
        h();
        this.c = z;
        return this;
    }

    @Override // o.InterfaceC3517bAu
    /* renamed from: e */
    public C3518bAv a(boolean z) {
        h();
        super.c_(z);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: c */
    public C3518bAv e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.InterfaceC3517bAu
    /* renamed from: c */
    public C3518bAv e(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: c */
    public C3518bAv a(int i) {
        super.a(i);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: c */
    public C3518bAv a(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: a */
    public AbstractC3509bAm.d b(ViewParent viewParent) {
        return new AbstractC3509bAm.d();
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C3518bAv) && super.equals(obj)) {
            C3518bAv c3518bAv = (C3518bAv) obj;
            if ((this.b == null) != (c3518bAv.b == null)) {
                return false;
            }
            if ((this.d == null) != (c3518bAv.d == null)) {
                return false;
            }
            if ((this.i == null) != (c3518bAv.i == null)) {
                return false;
            }
            if ((this.g == null) != (c3518bAv.g == null)) {
                return false;
            }
            if ((i() == null) != (c3518bAv.i() == null)) {
                return false;
            }
            if (n() == null ? c3518bAv.n() == null : n().equals(c3518bAv.n())) {
                return this.c == c3518bAv.c && m() == c3518bAv.m();
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
        int i3 = this.i != null ? 1 : 0;
        int i4 = this.g != null ? 1 : 0;
        return (((((((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + (i() == null ? 0 : 1)) * 31) + (n() != null ? n().hashCode() : 0)) * 31) + (this.c ? 1 : 0)) * 31) + (m() ? 1 : 0);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "PhoneInputModel_{eventBusFactory=" + i() + ", selectedCountry=" + n() + ", isValid=" + this.c + ", shouldShowValidationErrors=" + m() + "}" + super.toString();
    }
}
