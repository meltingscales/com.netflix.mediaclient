package o;

import android.view.View;
import android.view.ViewParent;
import o.AbstractC3073as;
import o.AbstractC6515cek;

/* renamed from: o.cej  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6514cej extends AbstractC6515cek implements InterfaceC1673aK<AbstractC6515cek.b>, InterfaceC6513cei {
    private InterfaceC4573bh<C6514cej, AbstractC6515cek.b> b;
    private InterfaceC4467bf<C6514cej, AbstractC6515cek.b> c;
    private InterfaceC4414be<C6514cej, AbstractC6515cek.b> d;
    private InterfaceC4732bk<C6514cej, AbstractC6515cek.b> h;

    @Override // o.InterfaceC1673aK
    /* renamed from: a */
    public void e(C1511aE c1511aE, AbstractC6515cek.b bVar, int i) {
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: b */
    public void a(AbstractC6515cek.b bVar, int i) {
        InterfaceC4467bf<C6514cej, AbstractC6515cek.b> interfaceC4467bf = this.c;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, bVar, i);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    public void e(AbstractC6515cek.b bVar) {
        super.b((C6514cej) bVar);
        InterfaceC4414be<C6514cej, AbstractC6515cek.b> interfaceC4414be = this.d;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, bVar);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: d */
    public void c(int i, AbstractC6515cek.b bVar) {
        InterfaceC4732bk<C6514cej, AbstractC6515cek.b> interfaceC4732bk = this.h;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, bVar, i);
        }
        super.a(i, (int) bVar);
    }

    @Override // o.AbstractC3336ax
    /* renamed from: e */
    public void d(float f, float f2, int i, int i2, AbstractC6515cek.b bVar) {
        InterfaceC4573bh<C6514cej, AbstractC6515cek.b> interfaceC4573bh = this.b;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, bVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, bVar);
    }

    @Override // o.InterfaceC6513cei
    /* renamed from: d */
    public C6514cej b(View.OnClickListener onClickListener) {
        h();
        super.c(onClickListener);
        return this;
    }

    @Override // o.InterfaceC6513cei
    /* renamed from: b */
    public C6514cej a(Integer num) {
        h();
        super.n_(num);
        return this;
    }

    @Override // o.InterfaceC6513cei
    /* renamed from: c */
    public C6514cej e(Integer num) {
        h();
        super.d(num);
        return this;
    }

    @Override // o.InterfaceC6513cei
    /* renamed from: e */
    public C6514cej c(boolean z) {
        h();
        super.d(z);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: a */
    public C6514cej e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.InterfaceC6513cei
    /* renamed from: b */
    public C6514cej c(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: e */
    public C6514cej a(int i) {
        super.a(i);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: b */
    public C6514cej a(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: d */
    public AbstractC6515cek.b b(ViewParent viewParent) {
        return new AbstractC6515cek.b();
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C6514cej) && super.equals(obj)) {
            C6514cej c6514cej = (C6514cej) obj;
            if ((this.c == null) != (c6514cej.c == null)) {
                return false;
            }
            if ((this.d == null) != (c6514cej.d == null)) {
                return false;
            }
            if ((this.h == null) != (c6514cej.h == null)) {
                return false;
            }
            if ((this.b == null) != (c6514cej.b == null)) {
                return false;
            }
            if ((m() == null) != (c6514cej.m() == null)) {
                return false;
            }
            if (k() == null ? c6514cej.k() == null : k().equals(c6514cej.k())) {
                if (n() == null ? c6514cej.n() == null : n().equals(c6514cej.n())) {
                    return i() == c6514cej.i();
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
        int i2 = this.d != null ? 1 : 0;
        int i3 = this.h != null ? 1 : 0;
        int i4 = this.b != null ? 1 : 0;
        int i5 = m() == null ? 0 : 1;
        return (((((((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + i5) * 31) + (k() != null ? k().hashCode() : 0)) * 31) + (n() != null ? n().hashCode() : 0)) * 31) + (i() ? 1 : 0);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "CwDialogGenericItemRowModel_{itemClickListener=" + m() + ", iconDrawableRes=" + k() + ", textStringRes=" + n() + ", additionalBottomPadding=" + i() + "}" + super.toString();
    }
}
