package o;

import android.view.ViewParent;
import o.AbstractC3073as;
import o.AbstractC3755bJl;

/* renamed from: o.bJn  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C3757bJn extends AbstractC3755bJl implements InterfaceC1673aK<AbstractC3755bJl.e>, InterfaceC3753bJj {
    private InterfaceC4573bh<C3757bJn, AbstractC3755bJl.e> b;
    private InterfaceC4467bf<C3757bJn, AbstractC3755bJl.e> c;
    private InterfaceC4414be<C3757bJn, AbstractC3755bJl.e> d;
    private InterfaceC4732bk<C3757bJn, AbstractC3755bJl.e> h;

    @Override // o.InterfaceC1673aK
    /* renamed from: d */
    public void e(C1511aE c1511aE, AbstractC3755bJl.e eVar, int i) {
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: d */
    public void a(AbstractC3755bJl.e eVar, int i) {
        InterfaceC4467bf<C3757bJn, AbstractC3755bJl.e> interfaceC4467bf = this.c;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, eVar, i);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: b  reason: avoid collision after fix types in other method */
    public void e(AbstractC3755bJl.e eVar) {
        super.b((C3757bJn) eVar);
        InterfaceC4414be<C3757bJn, AbstractC3755bJl.e> interfaceC4414be = this.d;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, eVar);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: d */
    public void c(int i, AbstractC3755bJl.e eVar) {
        InterfaceC4732bk<C3757bJn, AbstractC3755bJl.e> interfaceC4732bk = this.h;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, eVar, i);
        }
        super.a(i, (int) eVar);
    }

    @Override // o.AbstractC3336ax
    /* renamed from: b */
    public void d(float f, float f2, int i, int i2, AbstractC3755bJl.e eVar) {
        InterfaceC4573bh<C3757bJn, AbstractC3755bJl.e> interfaceC4573bh = this.b;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, eVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, eVar);
    }

    @Override // o.InterfaceC3753bJj
    /* renamed from: i */
    public C3757bJn d(int i) {
        h();
        super.c(i);
        return this;
    }

    @Override // o.InterfaceC3753bJj
    /* renamed from: g */
    public C3757bJn b(int i) {
        h();
        super.e(i);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: c */
    public C3757bJn e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.InterfaceC3753bJj
    /* renamed from: d */
    public C3757bJn c(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: h */
    public C3757bJn a(int i) {
        super.a(i);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: d */
    public C3757bJn a(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: a */
    public AbstractC3755bJl.e b(ViewParent viewParent) {
        return new AbstractC3755bJl.e();
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C3757bJn) && super.equals(obj)) {
            C3757bJn c3757bJn = (C3757bJn) obj;
            if ((this.c == null) != (c3757bJn.c == null)) {
                return false;
            }
            if ((this.d == null) != (c3757bJn.d == null)) {
                return false;
            }
            if ((this.h == null) != (c3757bJn.h == null)) {
                return false;
            }
            return (this.b == null) == (c3757bJn.b == null) && i() == c3757bJn.i() && k() == c3757bJn.k() && Float.compare(c3757bJn.l(), l()) == 0;
        }
        return false;
    }

    @Override // o.AbstractC3073as
    public int hashCode() {
        int hashCode = super.hashCode();
        int i = this.c != null ? 1 : 0;
        int i2 = this.d != null ? 1 : 0;
        int i3 = this.h != null ? 1 : 0;
        int i4 = this.b == null ? 0 : 1;
        int i5 = i();
        return (((((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + i5) * 31) + k()) * 31) + (l() != 0.0f ? Float.floatToIntBits(l()) : 0);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "CarouselWithPageIndicatorModel_{accentColor=" + i() + ", indicatorPadding=" + k() + ", numViewsToShowOnScreen=" + l() + "}" + super.toString();
    }
}
