package o;

import android.view.View;
import android.view.ViewParent;
import o.AbstractC3073as;
import o.AbstractC3813bLp;

/* renamed from: o.bLt  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C3817bLt extends AbstractC3809bLl implements InterfaceC1673aK<AbstractC3813bLp.c>, InterfaceC3810bLm {
    private InterfaceC4414be<C3817bLt, AbstractC3813bLp.c> b;
    private InterfaceC4467bf<C3817bLt, AbstractC3813bLp.c> c;
    private InterfaceC4573bh<C3817bLt, AbstractC3813bLp.c> d;
    private InterfaceC4732bk<C3817bLt, AbstractC3813bLp.c> f;

    @Override // o.InterfaceC1673aK
    public void e(C1511aE c1511aE, AbstractC3813bLp.c cVar, int i) {
    }

    @Override // o.InterfaceC1673aK
    public void a(AbstractC3813bLp.c cVar, int i) {
        InterfaceC4467bf<C3817bLt, AbstractC3813bLp.c> interfaceC4467bf = this.c;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, cVar, i);
        }
    }

    @Override // o.AbstractC3813bLp, o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: b  reason: avoid collision after fix types in other method */
    public void e(AbstractC3813bLp.c cVar) {
        super.e(cVar);
        InterfaceC4414be<C3817bLt, AbstractC3813bLp.c> interfaceC4414be = this.b;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, cVar);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: d */
    public void c(int i, AbstractC3813bLp.c cVar) {
        InterfaceC4732bk<C3817bLt, AbstractC3813bLp.c> interfaceC4732bk = this.f;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, cVar, i);
        }
        super.a(i, (int) cVar);
    }

    @Override // o.AbstractC3336ax
    public void d(float f, float f2, int i, int i2, AbstractC3813bLp.c cVar) {
        InterfaceC4573bh<C3817bLt, AbstractC3813bLp.c> interfaceC4573bh = this.d;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, cVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, (int) cVar);
    }

    public C3817bLt e(View.OnClickListener onClickListener) {
        h();
        super.c(onClickListener);
        return this;
    }

    @Override // o.InterfaceC3810bLm
    /* renamed from: e */
    public C3817bLt c(CharSequence charSequence) {
        h();
        super.h(charSequence);
        return this;
    }

    @Override // o.AbstractC3813bLp
    public boolean o() {
        return super.o();
    }

    @Override // o.AbstractC3073as
    /* renamed from: b */
    public C3817bLt e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.InterfaceC3810bLm
    /* renamed from: d */
    public C3817bLt b(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: d */
    public C3817bLt a(int i) {
        super.a(i);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: e */
    public C3817bLt a(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: c */
    public AbstractC3813bLp.c b(ViewParent viewParent) {
        return new AbstractC3813bLp.c();
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C3817bLt) && super.equals(obj)) {
            C3817bLt c3817bLt = (C3817bLt) obj;
            if ((this.c == null) != (c3817bLt.c == null)) {
                return false;
            }
            if ((this.b == null) != (c3817bLt.b == null)) {
                return false;
            }
            if ((this.f == null) != (c3817bLt.f == null)) {
                return false;
            }
            if ((this.d == null) != (c3817bLt.d == null)) {
                return false;
            }
            if (i() == null ? c3817bLt.i() == null : i().equals(c3817bLt.i())) {
                if ((s() == null) != (c3817bLt.s() == null)) {
                    return false;
                }
                if (q() == null ? c3817bLt.q() == null : q().equals(c3817bLt.q())) {
                    return p() == c3817bLt.p() && t() == c3817bLt.t() && o() == c3817bLt.o();
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
        int i2 = this.b != null ? 1 : 0;
        int i3 = this.f != null ? 1 : 0;
        int i4 = this.d != null ? 1 : 0;
        int hashCode2 = i() != null ? i().hashCode() : 0;
        return (((((((((((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + hashCode2) * 31) + (s() == null ? 0 : 1)) * 31) + (q() != null ? q().hashCode() : 0)) * 31) + p()) * 31) + (t() ? 1 : 0)) * 31) + (o() ? 1 : 0);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "TextMenuItemModel_{layoutGravity=" + i() + ", onClick=" + s() + ", text=" + ((Object) q()) + ", stringId=" + p() + ", linksClickable=" + t() + ", isSticky=" + o() + "}" + super.toString();
    }
}
