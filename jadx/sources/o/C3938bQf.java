package o;

import android.view.ViewParent;
import o.AbstractC3073as;
import o.AbstractC3941bQi;

/* renamed from: o.bQf  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C3938bQf extends AbstractC3941bQi implements InterfaceC1673aK<AbstractC3941bQi.c>, InterfaceC3942bQj {
    private InterfaceC4467bf<C3938bQf, AbstractC3941bQi.c> b;
    private InterfaceC4414be<C3938bQf, AbstractC3941bQi.c> d;
    private InterfaceC4573bh<C3938bQf, AbstractC3941bQi.c> f;
    private InterfaceC4732bk<C3938bQf, AbstractC3941bQi.c> j;

    @Override // o.InterfaceC1673aK
    /* renamed from: a */
    public void e(C1511aE c1511aE, AbstractC3941bQi.c cVar, int i) {
    }

    @Override // o.InterfaceC3942bQj
    public /* synthetic */ InterfaceC3942bQj b(drM drm) {
        return c((drM<? super Integer, dpR>) drm);
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: c */
    public void a(AbstractC3941bQi.c cVar, int i) {
        InterfaceC4467bf<C3938bQf, AbstractC3941bQi.c> interfaceC4467bf = this.b;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, cVar, i);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: d */
    public void e(AbstractC3941bQi.c cVar) {
        super.b((C3938bQf) cVar);
        InterfaceC4414be<C3938bQf, AbstractC3941bQi.c> interfaceC4414be = this.d;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, cVar);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: b */
    public void c(int i, AbstractC3941bQi.c cVar) {
        InterfaceC4732bk<C3938bQf, AbstractC3941bQi.c> interfaceC4732bk = this.j;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, cVar, i);
        }
        super.a(i, (int) cVar);
    }

    @Override // o.AbstractC3336ax
    public void d(float f, float f2, int i, int i2, AbstractC3941bQi.c cVar) {
        InterfaceC4573bh<C3938bQf, AbstractC3941bQi.c> interfaceC4573bh = this.f;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, cVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, (int) cVar);
    }

    @Override // o.InterfaceC3942bQj
    /* renamed from: c */
    public C3938bQf b(int i) {
        h();
        super.m_(i);
        return this;
    }

    public C3938bQf c(drM<? super Integer, dpR> drm) {
        h();
        super.e(drm);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: a */
    public C3938bQf e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.InterfaceC3942bQj
    /* renamed from: d */
    public C3938bQf e(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: e */
    public C3938bQf a(int i) {
        super.a(i);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: e */
    public C3938bQf a(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: a */
    public AbstractC3941bQi.c b(ViewParent viewParent) {
        return new AbstractC3941bQi.c();
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C3938bQf) && super.equals(obj)) {
            C3938bQf c3938bQf = (C3938bQf) obj;
            if ((this.b == null) != (c3938bQf.b == null)) {
                return false;
            }
            if ((this.d == null) != (c3938bQf.d == null)) {
                return false;
            }
            if ((this.j == null) != (c3938bQf.j == null)) {
                return false;
            }
            if ((this.f == null) == (c3938bQf.f == null) && l() == c3938bQf.l()) {
                return (i() == null) == (c3938bQf.i() == null);
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
        int i3 = this.j != null ? 1 : 0;
        int i4 = this.f != null ? 1 : 0;
        return (((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + l()) * 31) + (i() == null ? 0 : 1);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "GdpCtaUserRatingButtonModel_{thumbRating=" + l() + "}" + super.toString();
    }
}
