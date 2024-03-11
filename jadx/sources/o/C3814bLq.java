package o;

import android.view.View;
import android.view.ViewParent;
import o.AbstractC3073as;
import o.AbstractC3813bLp;

/* renamed from: o.bLq  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C3814bLq extends AbstractC3813bLp implements InterfaceC1673aK<AbstractC3813bLp.c>, InterfaceC3816bLs {
    private InterfaceC4573bh<C3814bLq, AbstractC3813bLp.c> b;
    private InterfaceC4467bf<C3814bLq, AbstractC3813bLp.c> c;
    private InterfaceC4414be<C3814bLq, AbstractC3813bLp.c> d;
    private InterfaceC4732bk<C3814bLq, AbstractC3813bLp.c> g;

    @Override // o.InterfaceC1673aK
    /* renamed from: d */
    public void e(C1511aE c1511aE, AbstractC3813bLp.c cVar, int i) {
    }

    @Override // o.InterfaceC3816bLs
    public /* synthetic */ InterfaceC3816bLs a(InterfaceC4308bc interfaceC4308bc) {
        return b((InterfaceC4308bc<C3814bLq, AbstractC3813bLp.c>) interfaceC4308bc);
    }

    @Override // o.InterfaceC3816bLs
    public /* synthetic */ InterfaceC3816bLs d(InterfaceC4467bf interfaceC4467bf) {
        return a((InterfaceC4467bf<C3814bLq, AbstractC3813bLp.c>) interfaceC4467bf);
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: e */
    public void a(AbstractC3813bLp.c cVar, int i) {
        InterfaceC4467bf<C3814bLq, AbstractC3813bLp.c> interfaceC4467bf = this.c;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, cVar, i);
        }
    }

    public C3814bLq a(InterfaceC4467bf<C3814bLq, AbstractC3813bLp.c> interfaceC4467bf) {
        h();
        this.c = interfaceC4467bf;
        return this;
    }

    @Override // o.AbstractC3813bLp, o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: b  reason: avoid collision after fix types in other method */
    public void e(AbstractC3813bLp.c cVar) {
        super.e(cVar);
        InterfaceC4414be<C3814bLq, AbstractC3813bLp.c> interfaceC4414be = this.d;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, cVar);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: b */
    public void c(int i, AbstractC3813bLp.c cVar) {
        InterfaceC4732bk<C3814bLq, AbstractC3813bLp.c> interfaceC4732bk = this.g;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, cVar, i);
        }
        super.a(i, (int) cVar);
    }

    @Override // o.AbstractC3336ax
    /* renamed from: c */
    public void d(float f, float f2, int i, int i2, AbstractC3813bLp.c cVar) {
        InterfaceC4573bh<C3814bLq, AbstractC3813bLp.c> interfaceC4573bh = this.b;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, cVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, cVar);
    }

    public C3814bLq b(InterfaceC4308bc<C3814bLq, AbstractC3813bLp.c> interfaceC4308bc) {
        h();
        if (interfaceC4308bc == null) {
            super.c((View.OnClickListener) null);
        } else {
            super.c((View.OnClickListener) new View$OnClickListenerC4818bn(interfaceC4308bc));
        }
        return this;
    }

    @Override // o.InterfaceC3816bLs
    /* renamed from: b */
    public C3814bLq a(View.OnClickListener onClickListener) {
        h();
        super.c(onClickListener);
        return this;
    }

    @Override // o.InterfaceC3816bLs
    /* renamed from: e */
    public C3814bLq d(CharSequence charSequence) {
        h();
        super.h(charSequence);
        return this;
    }

    @Override // o.InterfaceC3816bLs
    /* renamed from: d */
    public C3814bLq b(boolean z) {
        h();
        super.e(z);
        return this;
    }

    @Override // o.InterfaceC3816bLs
    /* renamed from: c */
    public C3814bLq a(boolean z) {
        h();
        super.q_(z);
        return this;
    }

    @Override // o.AbstractC3813bLp
    public boolean o() {
        return super.o();
    }

    @Override // o.AbstractC3073as
    /* renamed from: d */
    public C3814bLq e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.InterfaceC3816bLs
    /* renamed from: c */
    public C3814bLq b(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.InterfaceC3816bLs
    /* renamed from: b */
    public C3814bLq d(int i) {
        super.a(i);
        return this;
    }

    @Override // o.InterfaceC3816bLs
    /* renamed from: b */
    public C3814bLq d(AbstractC3073as.b bVar) {
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
        if ((obj instanceof C3814bLq) && super.equals(obj)) {
            C3814bLq c3814bLq = (C3814bLq) obj;
            if ((this.c == null) != (c3814bLq.c == null)) {
                return false;
            }
            if ((this.d == null) != (c3814bLq.d == null)) {
                return false;
            }
            if ((this.g == null) != (c3814bLq.g == null)) {
                return false;
            }
            if ((this.b == null) != (c3814bLq.b == null)) {
                return false;
            }
            if ((s() == null) != (c3814bLq.s() == null)) {
                return false;
            }
            if (q() == null ? c3814bLq.q() == null : q().equals(c3814bLq.q())) {
                return p() == c3814bLq.p() && t() == c3814bLq.t() && o() == c3814bLq.o();
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
        int i3 = this.g != null ? 1 : 0;
        int i4 = this.b != null ? 1 : 0;
        return (((((((((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + (s() == null ? 0 : 1)) * 31) + (q() != null ? q().hashCode() : 0)) * 31) + p()) * 31) + (t() ? 1 : 0)) * 31) + (o() ? 1 : 0);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "TextModel_{onClick=" + s() + ", text=" + ((Object) q()) + ", stringId=" + p() + ", linksClickable=" + t() + ", isSticky=" + o() + "}" + super.toString();
    }
}
