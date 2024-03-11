package o;

import android.view.ViewParent;
import o.AbstractC3073as;
import o.AbstractC3500bAd;

/* renamed from: o.bAh  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C3504bAh extends AbstractC3500bAd implements InterfaceC1673aK<AbstractC3500bAd.e>, InterfaceC3505bAi {
    private InterfaceC4573bh<C3504bAh, AbstractC3500bAd.e> b;
    private InterfaceC4467bf<C3504bAh, AbstractC3500bAd.e> c;
    private InterfaceC4414be<C3504bAh, AbstractC3500bAd.e> d;
    private InterfaceC4732bk<C3504bAh, AbstractC3500bAd.e> f;

    @Override // o.InterfaceC1673aK
    public void e(C1511aE c1511aE, AbstractC3500bAd.e eVar, int i) {
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: c */
    public void a(AbstractC3500bAd.e eVar, int i) {
        InterfaceC4467bf<C3504bAh, AbstractC3500bAd.e> interfaceC4467bf = this.c;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, eVar, i);
        }
    }

    @Override // o.AbstractC3500bAd, o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: d */
    public void e(AbstractC3500bAd.e eVar) {
        super.e(eVar);
        InterfaceC4414be<C3504bAh, AbstractC3500bAd.e> interfaceC4414be = this.d;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, eVar);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: e */
    public void c(int i, AbstractC3500bAd.e eVar) {
        InterfaceC4732bk<C3504bAh, AbstractC3500bAd.e> interfaceC4732bk = this.f;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, eVar, i);
        }
        super.a(i, (int) eVar);
    }

    @Override // o.AbstractC3336ax
    /* renamed from: a */
    public void d(float f, float f2, int i, int i2, AbstractC3500bAd.e eVar) {
        InterfaceC4573bh<C3504bAh, AbstractC3500bAd.e> interfaceC4573bh = this.b;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, eVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, eVar);
    }

    @Override // o.InterfaceC3505bAi
    /* renamed from: d */
    public C3504bAh c(C9935zP c9935zP) {
        h();
        super.a(c9935zP);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: b */
    public C3504bAh e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.InterfaceC3505bAi
    /* renamed from: b */
    public C3504bAh c(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: b */
    public C3504bAh a(int i) {
        super.a(i);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: d */
    public C3504bAh a(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: d */
    public AbstractC3500bAd.e b(ViewParent viewParent) {
        return new AbstractC3500bAd.e();
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C3504bAh) && super.equals(obj)) {
            C3504bAh c3504bAh = (C3504bAh) obj;
            if ((this.c == null) != (c3504bAh.c == null)) {
                return false;
            }
            if ((this.d == null) != (c3504bAh.d == null)) {
                return false;
            }
            if ((this.f == null) != (c3504bAh.f == null)) {
                return false;
            }
            if ((this.b == null) != (c3504bAh.b == null)) {
                return false;
            }
            return (i() == null) == (c3504bAh.i() == null);
        }
        return false;
    }

    @Override // o.AbstractC3073as
    public int hashCode() {
        int hashCode = super.hashCode();
        int i = this.c != null ? 1 : 0;
        int i2 = this.d != null ? 1 : 0;
        int i3 = this.f != null ? 1 : 0;
        return (((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + (this.b != null ? 1 : 0)) * 31) + (i() == null ? 0 : 1);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "DismissButtonModel_{eventBusFactory=" + i() + "}" + super.toString();
    }
}
