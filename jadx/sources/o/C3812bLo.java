package o;

import android.view.ViewParent;
import o.AbstractC3073as;
import o.AbstractC3813bLp;

/* renamed from: o.bLo  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C3812bLo extends AbstractC3811bLn implements InterfaceC1673aK<AbstractC3813bLp.c>, InterfaceC3808bLk {
    private InterfaceC4414be<C3812bLo, AbstractC3813bLp.c> b;
    private InterfaceC4573bh<C3812bLo, AbstractC3813bLp.c> c;
    private InterfaceC4467bf<C3812bLo, AbstractC3813bLp.c> d;
    private InterfaceC4732bk<C3812bLo, AbstractC3813bLp.c> h;

    @Override // o.InterfaceC1673aK
    /* renamed from: b */
    public void e(C1511aE c1511aE, AbstractC3813bLp.c cVar, int i) {
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: c */
    public void a(AbstractC3813bLp.c cVar, int i) {
        InterfaceC4467bf<C3812bLo, AbstractC3813bLp.c> interfaceC4467bf = this.d;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, cVar, i);
        }
    }

    @Override // o.AbstractC3813bLp, o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: b  reason: avoid collision after fix types in other method */
    public void e(AbstractC3813bLp.c cVar) {
        super.e(cVar);
        InterfaceC4414be<C3812bLo, AbstractC3813bLp.c> interfaceC4414be = this.b;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, cVar);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: e */
    public void c(int i, AbstractC3813bLp.c cVar) {
        InterfaceC4732bk<C3812bLo, AbstractC3813bLp.c> interfaceC4732bk = this.h;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, cVar, i);
        }
        super.a(i, (int) cVar);
    }

    @Override // o.AbstractC3336ax
    /* renamed from: c */
    public void d(float f, float f2, int i, int i2, AbstractC3813bLp.c cVar) {
        InterfaceC4573bh<C3812bLo, AbstractC3813bLp.c> interfaceC4573bh = this.c;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, cVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, cVar);
    }

    @Override // o.InterfaceC3808bLk
    /* renamed from: c */
    public C3812bLo d(CharSequence charSequence) {
        h();
        super.h(charSequence);
        return this;
    }

    @Override // o.AbstractC3813bLp
    public boolean o() {
        return super.o();
    }

    @Override // o.AbstractC3073as
    /* renamed from: a */
    public C3812bLo e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.InterfaceC3808bLk
    /* renamed from: b */
    public C3812bLo e(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: b */
    public C3812bLo a(int i) {
        super.a(i);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: b */
    public C3812bLo a(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: d */
    public AbstractC3813bLp.c b(ViewParent viewParent) {
        return new AbstractC3813bLp.c();
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C3812bLo) && super.equals(obj)) {
            C3812bLo c3812bLo = (C3812bLo) obj;
            if ((this.d == null) != (c3812bLo.d == null)) {
                return false;
            }
            if ((this.b == null) != (c3812bLo.b == null)) {
                return false;
            }
            if ((this.h == null) != (c3812bLo.h == null)) {
                return false;
            }
            if ((this.c == null) != (c3812bLo.c == null)) {
                return false;
            }
            if (i() == null ? c3812bLo.i() == null : i().equals(c3812bLo.i())) {
                if ((s() == null) != (c3812bLo.s() == null)) {
                    return false;
                }
                if (q() == null ? c3812bLo.q() == null : q().equals(c3812bLo.q())) {
                    return p() == c3812bLo.p() && t() == c3812bLo.t() && o() == c3812bLo.o();
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
        int i = this.d != null ? 1 : 0;
        int i2 = this.b != null ? 1 : 0;
        int i3 = this.h != null ? 1 : 0;
        int i4 = this.c != null ? 1 : 0;
        int hashCode2 = i() != null ? i().hashCode() : 0;
        return (((((((((((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + hashCode2) * 31) + (s() == null ? 0 : 1)) * 31) + (q() != null ? q().hashCode() : 0)) * 31) + p()) * 31) + (t() ? 1 : 0)) * 31) + (o() ? 1 : 0);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "TextMenuHeaderItemModel_{layoutGravity=" + i() + ", onClick=" + s() + ", text=" + ((Object) q()) + ", stringId=" + p() + ", linksClickable=" + t() + ", isSticky=" + o() + "}" + super.toString();
    }
}
