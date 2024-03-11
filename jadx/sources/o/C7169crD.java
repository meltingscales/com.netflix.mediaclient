package o;

import android.view.View;
import android.view.ViewParent;
import o.AbstractC3073as;
import o.AbstractC7171crF;

/* renamed from: o.crD  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C7169crD extends AbstractC7171crF implements InterfaceC1673aK<AbstractC7171crF.e>, InterfaceC7168crC {
    private InterfaceC4467bf<C7169crD, AbstractC7171crF.e> b;
    private InterfaceC4573bh<C7169crD, AbstractC7171crF.e> c;
    private InterfaceC4414be<C7169crD, AbstractC7171crF.e> d;
    private InterfaceC4732bk<C7169crD, AbstractC7171crF.e> g;

    @Override // o.InterfaceC1673aK
    /* renamed from: d */
    public void e(C1511aE c1511aE, AbstractC7171crF.e eVar, int i) {
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: d */
    public void a(AbstractC7171crF.e eVar, int i) {
        InterfaceC4467bf<C7169crD, AbstractC7171crF.e> interfaceC4467bf = this.b;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, eVar, i);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: a */
    public void e(AbstractC7171crF.e eVar) {
        super.b((C7169crD) eVar);
        InterfaceC4414be<C7169crD, AbstractC7171crF.e> interfaceC4414be = this.d;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, eVar);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: b */
    public void c(int i, AbstractC7171crF.e eVar) {
        InterfaceC4732bk<C7169crD, AbstractC7171crF.e> interfaceC4732bk = this.g;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, eVar, i);
        }
        super.a(i, (int) eVar);
    }

    @Override // o.AbstractC3336ax
    /* renamed from: b */
    public void d(float f, float f2, int i, int i2, AbstractC7171crF.e eVar) {
        InterfaceC4573bh<C7169crD, AbstractC7171crF.e> interfaceC4573bh = this.c;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, eVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, eVar);
    }

    @Override // o.InterfaceC7168crC
    /* renamed from: e */
    public C7169crD c(boolean z) {
        h();
        super.d(z);
        return this;
    }

    @Override // o.InterfaceC7168crC
    /* renamed from: d */
    public C7169crD e(View.OnClickListener onClickListener) {
        h();
        super.c(onClickListener);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: d */
    public C7169crD e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.InterfaceC7168crC
    /* renamed from: c */
    public C7169crD d(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: b */
    public C7169crD a(int i) {
        super.a(i);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: b */
    public C7169crD a(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: d */
    public AbstractC7171crF.e b(ViewParent viewParent) {
        return new AbstractC7171crF.e();
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C7169crD) && super.equals(obj)) {
            C7169crD c7169crD = (C7169crD) obj;
            if ((this.b == null) != (c7169crD.b == null)) {
                return false;
            }
            if ((this.d == null) != (c7169crD.d == null)) {
                return false;
            }
            if ((this.g == null) != (c7169crD.g == null)) {
                return false;
            }
            if ((this.c == null) == (c7169crD.c == null) && o() == c7169crD.o()) {
                return (i() == null) == (c7169crD.i() == null);
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
        int i3 = this.g != null ? 1 : 0;
        return (((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + (this.c != null ? 1 : 0)) * 31) + (o() ? 1 : 0)) * 31) + (i() == null ? 0 : 1);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "AllProfilesButtonModel_{displayingAll=" + o() + ", clickListener=" + i() + "}" + super.toString();
    }
}
