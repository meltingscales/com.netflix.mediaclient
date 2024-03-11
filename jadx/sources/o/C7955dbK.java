package o;

import android.view.View;
import android.view.ViewParent;
import o.AbstractC3073as;
import o.AbstractC7951dbG;

/* renamed from: o.dbK  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C7955dbK extends AbstractC7951dbG implements InterfaceC1673aK<AbstractC7951dbG.d>, InterfaceC7954dbJ {
    private InterfaceC4573bh<C7955dbK, AbstractC7951dbG.d> b;
    private InterfaceC4414be<C7955dbK, AbstractC7951dbG.d> c;
    private InterfaceC4467bf<C7955dbK, AbstractC7951dbG.d> d;
    private InterfaceC4732bk<C7955dbK, AbstractC7951dbG.d> i;

    @Override // o.InterfaceC1673aK
    /* renamed from: b */
    public void e(C1511aE c1511aE, AbstractC7951dbG.d dVar, int i) {
    }

    @Override // o.InterfaceC1673aK
    public void a(AbstractC7951dbG.d dVar, int i) {
        InterfaceC4467bf<C7955dbK, AbstractC7951dbG.d> interfaceC4467bf = this.d;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, dVar, i);
        }
    }

    @Override // o.AbstractC7951dbG, o.AbstractC3336ax, o.AbstractC3073as
    public void e(AbstractC7951dbG.d dVar) {
        super.e(dVar);
        InterfaceC4414be<C7955dbK, AbstractC7951dbG.d> interfaceC4414be = this.c;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, dVar);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    public void c(int i, AbstractC7951dbG.d dVar) {
        InterfaceC4732bk<C7955dbK, AbstractC7951dbG.d> interfaceC4732bk = this.i;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, dVar, i);
        }
        super.a(i, (int) dVar);
    }

    @Override // o.AbstractC3336ax
    /* renamed from: e */
    public void d(float f, float f2, int i, int i2, AbstractC7951dbG.d dVar) {
        InterfaceC4573bh<C7955dbK, AbstractC7951dbG.d> interfaceC4573bh = this.b;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, dVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, dVar);
    }

    @Override // o.InterfaceC7954dbJ
    /* renamed from: e */
    public C7955dbK c(String str) {
        h();
        super.a(str);
        return this;
    }

    @Override // o.InterfaceC7954dbJ
    /* renamed from: d */
    public C7955dbK b(String str) {
        h();
        super.al_(str);
        return this;
    }

    @Override // o.InterfaceC7954dbJ
    /* renamed from: c */
    public C7955dbK a(View.OnClickListener onClickListener) {
        h();
        super.e(onClickListener);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: b */
    public C7955dbK e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.InterfaceC7954dbJ
    /* renamed from: e */
    public C7955dbK b(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: d */
    public C7955dbK a(int i) {
        super.a(i);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: b */
    public C7955dbK a(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: a */
    public AbstractC7951dbG.d b(ViewParent viewParent) {
        return new AbstractC7951dbG.d();
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C7955dbK) && super.equals(obj)) {
            C7955dbK c7955dbK = (C7955dbK) obj;
            if ((this.d == null) != (c7955dbK.d == null)) {
                return false;
            }
            if ((this.c == null) != (c7955dbK.c == null)) {
                return false;
            }
            if ((this.i == null) != (c7955dbK.i == null)) {
                return false;
            }
            if ((this.b == null) != (c7955dbK.b == null)) {
                return false;
            }
            if (k() == null ? c7955dbK.k() == null : k().equals(c7955dbK.k())) {
                if (n() == null ? c7955dbK.n() == null : n().equals(c7955dbK.n())) {
                    return (i() == null) == (c7955dbK.i() == null);
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
        int i2 = this.c != null ? 1 : 0;
        int i3 = this.i != null ? 1 : 0;
        int i4 = this.b != null ? 1 : 0;
        int hashCode2 = k() != null ? k().hashCode() : 0;
        return (((((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + hashCode2) * 31) + (n() != null ? n().hashCode() : 0)) * 31) + (i() != null ? 1 : 0);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "TitleTreatmentModel_{titleTreatmentUrl=" + k() + ", textFallback=" + n() + ", onClick=" + i() + "}" + super.toString();
    }
}
