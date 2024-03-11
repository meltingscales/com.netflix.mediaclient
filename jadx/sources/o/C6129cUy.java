package o;

import android.view.View;
import android.view.ViewParent;
import o.AbstractC3073as;
import o.AbstractC6128cUx;

/* renamed from: o.cUy  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6129cUy extends AbstractC6128cUx implements InterfaceC1673aK<AbstractC6128cUx.a>, cUA {
    private InterfaceC4414be<C6129cUy, AbstractC6128cUx.a> b;
    private InterfaceC4467bf<C6129cUy, AbstractC6128cUx.a> c;
    private InterfaceC4573bh<C6129cUy, AbstractC6128cUx.a> d;
    private InterfaceC4732bk<C6129cUy, AbstractC6128cUx.a> j;

    @Override // o.InterfaceC1673aK
    /* renamed from: d */
    public void e(C1511aE c1511aE, AbstractC6128cUx.a aVar, int i) {
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: b */
    public void a(AbstractC6128cUx.a aVar, int i) {
        InterfaceC4467bf<C6129cUy, AbstractC6128cUx.a> interfaceC4467bf = this.c;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, aVar, i);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: c */
    public void e(AbstractC6128cUx.a aVar) {
        super.b((C6129cUy) aVar);
        InterfaceC4414be<C6129cUy, AbstractC6128cUx.a> interfaceC4414be = this.b;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, aVar);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: e */
    public void c(int i, AbstractC6128cUx.a aVar) {
        InterfaceC4732bk<C6129cUy, AbstractC6128cUx.a> interfaceC4732bk = this.j;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, aVar, i);
        }
        super.a(i, (int) aVar);
    }

    @Override // o.AbstractC3336ax
    /* renamed from: e */
    public void d(float f, float f2, int i, int i2, AbstractC6128cUx.a aVar) {
        InterfaceC4573bh<C6129cUy, AbstractC6128cUx.a> interfaceC4573bh = this.d;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, aVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, aVar);
    }

    @Override // o.cUA
    /* renamed from: e */
    public C6129cUy d(View.OnClickListener onClickListener) {
        h();
        super.c(onClickListener);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: b */
    public C6129cUy e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.cUA
    /* renamed from: b */
    public C6129cUy d(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: d */
    public C6129cUy a(int i) {
        super.a(i);
        return this;
    }

    @Override // o.cUA
    /* renamed from: e */
    public C6129cUy b(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: a */
    public AbstractC6128cUx.a b(ViewParent viewParent) {
        return new AbstractC6128cUx.a();
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C6129cUy) && super.equals(obj)) {
            C6129cUy c6129cUy = (C6129cUy) obj;
            if ((this.c == null) != (c6129cUy.c == null)) {
                return false;
            }
            if ((this.b == null) != (c6129cUy.b == null)) {
                return false;
            }
            if ((this.j == null) != (c6129cUy.j == null)) {
                return false;
            }
            if ((this.d == null) != (c6129cUy.d == null)) {
                return false;
            }
            return (i() == null) == (c6129cUy.i() == null);
        }
        return false;
    }

    @Override // o.AbstractC3073as
    public int hashCode() {
        int hashCode = super.hashCode();
        int i = this.c != null ? 1 : 0;
        int i2 = this.b != null ? 1 : 0;
        int i3 = this.j != null ? 1 : 0;
        return (((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + (this.d != null ? 1 : 0)) * 31) + (i() == null ? 0 : 1);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "SeeMoreButtonModel_{clickListener=" + i() + "}" + super.toString();
    }
}
