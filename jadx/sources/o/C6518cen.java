package o;

import android.view.View;
import android.view.ViewParent;
import o.AbstractC3073as;
import o.AbstractC6520cep;

/* renamed from: o.cen  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6518cen extends AbstractC6520cep implements InterfaceC1673aK<AbstractC6520cep.b> {
    private InterfaceC4414be<C6518cen, AbstractC6520cep.b> b;
    private InterfaceC4467bf<C6518cen, AbstractC6520cep.b> c;
    private InterfaceC4573bh<C6518cen, AbstractC6520cep.b> d;
    private InterfaceC4732bk<C6518cen, AbstractC6520cep.b> i;

    @Override // o.InterfaceC1673aK
    public void e(C1511aE c1511aE, AbstractC6520cep.b bVar, int i) {
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: b */
    public void a(AbstractC6520cep.b bVar, int i) {
        InterfaceC4467bf<C6518cen, AbstractC6520cep.b> interfaceC4467bf = this.c;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, bVar, i);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: c */
    public void e(AbstractC6520cep.b bVar) {
        super.b((C6518cen) bVar);
        InterfaceC4414be<C6518cen, AbstractC6520cep.b> interfaceC4414be = this.b;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, bVar);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: d */
    public void c(int i, AbstractC6520cep.b bVar) {
        InterfaceC4732bk<C6518cen, AbstractC6520cep.b> interfaceC4732bk = this.i;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, bVar, i);
        }
        super.a(i, (int) bVar);
    }

    @Override // o.AbstractC3336ax
    /* renamed from: a */
    public void d(float f, float f2, int i, int i2, AbstractC6520cep.b bVar) {
        InterfaceC4573bh<C6518cen, AbstractC6520cep.b> interfaceC4573bh = this.d;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, bVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, bVar);
    }

    public C6518cen a(View.OnClickListener onClickListener) {
        h();
        super.e(onClickListener);
        return this;
    }

    public C6518cen j(int i) {
        h();
        super.c(i);
        return this;
    }

    public int l() {
        return super.m();
    }

    public C6518cen d(int i) {
        h();
        super.e(i);
        return this;
    }

    public C6518cen d(boolean z) {
        h();
        super.a(z);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: b */
    public C6518cen e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: c */
    public C6518cen a(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: b */
    public C6518cen a(int i) {
        super.a(i);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: d */
    public C6518cen a(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: d */
    public AbstractC6520cep.b b(ViewParent viewParent) {
        return new AbstractC6520cep.b();
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C6518cen) && super.equals(obj)) {
            C6518cen c6518cen = (C6518cen) obj;
            if ((this.c == null) != (c6518cen.c == null)) {
                return false;
            }
            if ((this.b == null) != (c6518cen.b == null)) {
                return false;
            }
            if ((this.i == null) != (c6518cen.i == null)) {
                return false;
            }
            if ((this.d == null) != (c6518cen.d == null)) {
                return false;
            }
            return (k() == null) == (c6518cen.k() == null) && m() == c6518cen.m() && o() == c6518cen.o() && i() == c6518cen.i();
        }
        return false;
    }

    @Override // o.AbstractC3073as
    public int hashCode() {
        int hashCode = super.hashCode();
        int i = this.c != null ? 1 : 0;
        int i2 = this.b != null ? 1 : 0;
        int i3 = this.i != null ? 1 : 0;
        int i4 = this.d != null ? 1 : 0;
        return (((((((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + (k() == null ? 0 : 1)) * 31) + m()) * 31) + o()) * 31) + (i() ? 1 : 0);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "CwDialogThumbsRatingRowModel_{ratingClickListener=" + k() + ", userThumbRating=" + m() + ", ratingWhenClicked=" + o() + ", ratingApiCallInProgress=" + i() + "}" + super.toString();
    }
}
