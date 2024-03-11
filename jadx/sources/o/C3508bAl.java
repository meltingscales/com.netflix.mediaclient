package o;

import android.view.ViewParent;
import o.AbstractC3073as;
import o.AbstractC3506bAj;

/* renamed from: o.bAl  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C3508bAl extends AbstractC3506bAj implements InterfaceC1673aK<AbstractC3506bAj.b>, InterfaceC3507bAk {
    private InterfaceC4467bf<C3508bAl, AbstractC3506bAj.b> b;
    private InterfaceC4573bh<C3508bAl, AbstractC3506bAj.b> c;
    private InterfaceC4414be<C3508bAl, AbstractC3506bAj.b> d;
    private InterfaceC4732bk<C3508bAl, AbstractC3506bAj.b> h;

    @Override // o.InterfaceC1673aK
    /* renamed from: b */
    public void e(C1511aE c1511aE, AbstractC3506bAj.b bVar, int i) {
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: b */
    public void a(AbstractC3506bAj.b bVar, int i) {
        InterfaceC4467bf<C3508bAl, AbstractC3506bAj.b> interfaceC4467bf = this.b;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, bVar, i);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    public void e(AbstractC3506bAj.b bVar) {
        super.b((C3508bAl) bVar);
        InterfaceC4414be<C3508bAl, AbstractC3506bAj.b> interfaceC4414be = this.d;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, bVar);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public void c(int i, AbstractC3506bAj.b bVar) {
        InterfaceC4732bk<C3508bAl, AbstractC3506bAj.b> interfaceC4732bk = this.h;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, bVar, i);
        }
        super.a(i, (int) bVar);
    }

    @Override // o.AbstractC3336ax
    public void d(float f, float f2, int i, int i2, AbstractC3506bAj.b bVar) {
        InterfaceC4573bh<C3508bAl, AbstractC3506bAj.b> interfaceC4573bh = this.c;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, bVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, (int) bVar);
    }

    @Override // o.AbstractC3073as
    /* renamed from: d */
    public C3508bAl e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.InterfaceC3507bAk
    /* renamed from: e */
    public C3508bAl d(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: c */
    public C3508bAl a(int i) {
        super.a(i);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: b */
    public C3508bAl a(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: a */
    public AbstractC3506bAj.b b(ViewParent viewParent) {
        return new AbstractC3506bAj.b();
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C3508bAl) && super.equals(obj)) {
            C3508bAl c3508bAl = (C3508bAl) obj;
            if ((this.b == null) != (c3508bAl.b == null)) {
                return false;
            }
            if ((this.d == null) != (c3508bAl.d == null)) {
                return false;
            }
            if ((this.h == null) != (c3508bAl.h == null)) {
                return false;
            }
            return (this.c == null) == (c3508bAl.c == null);
        }
        return false;
    }

    @Override // o.AbstractC3073as
    public int hashCode() {
        int hashCode = super.hashCode();
        int i = this.b != null ? 1 : 0;
        int i2 = this.d != null ? 1 : 0;
        return (((((((hashCode * 31) + i) * 31) + i2) * 31) + (this.h != null ? 1 : 0)) * 31) + (this.c == null ? 0 : 1);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "GenericErrorModel_{}" + super.toString();
    }
}
