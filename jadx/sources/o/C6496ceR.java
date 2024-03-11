package o;

import android.view.View;
import android.view.ViewParent;
import o.AbstractC3073as;
import o.AbstractC6497ceS;

/* renamed from: o.ceR  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6496ceR extends AbstractC6497ceS implements InterfaceC1673aK<AbstractC6497ceS.a>, InterfaceC6499ceU {
    private InterfaceC4467bf<C6496ceR, AbstractC6497ceS.a> b;
    private InterfaceC4414be<C6496ceR, AbstractC6497ceS.a> c;
    private InterfaceC4573bh<C6496ceR, AbstractC6497ceS.a> d;
    private InterfaceC4732bk<C6496ceR, AbstractC6497ceS.a> i;

    @Override // o.InterfaceC1673aK
    /* renamed from: d */
    public void e(C1511aE c1511aE, AbstractC6497ceS.a aVar, int i) {
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: c */
    public void a(AbstractC6497ceS.a aVar, int i) {
        InterfaceC4467bf<C6496ceR, AbstractC6497ceS.a> interfaceC4467bf = this.b;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, aVar, i);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    public void e(AbstractC6497ceS.a aVar) {
        super.b((C6496ceR) aVar);
        InterfaceC4414be<C6496ceR, AbstractC6497ceS.a> interfaceC4414be = this.c;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, aVar);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: d */
    public void c(int i, AbstractC6497ceS.a aVar) {
        InterfaceC4732bk<C6496ceR, AbstractC6497ceS.a> interfaceC4732bk = this.i;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, aVar, i);
        }
        super.a(i, (int) aVar);
    }

    @Override // o.AbstractC3336ax
    /* renamed from: b */
    public void d(float f, float f2, int i, int i2, AbstractC6497ceS.a aVar) {
        InterfaceC4573bh<C6496ceR, AbstractC6497ceS.a> interfaceC4573bh = this.d;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, aVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, aVar);
    }

    @Override // o.InterfaceC6499ceU
    /* renamed from: b */
    public C6496ceR d(CharSequence charSequence) {
        h();
        super.c(charSequence);
        return this;
    }

    @Override // o.InterfaceC6499ceU
    /* renamed from: c */
    public C6496ceR b(View.OnClickListener onClickListener) {
        h();
        super.e(onClickListener);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: a */
    public C6496ceR e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.InterfaceC6499ceU
    /* renamed from: f */
    public C6496ceR e(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: d */
    public C6496ceR a(int i) {
        super.a(i);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: b */
    public C6496ceR a(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: c */
    public AbstractC6497ceS.a b(ViewParent viewParent) {
        return new AbstractC6497ceS.a();
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C6496ceR) && super.equals(obj)) {
            C6496ceR c6496ceR = (C6496ceR) obj;
            if ((this.b == null) != (c6496ceR.b == null)) {
                return false;
            }
            if ((this.c == null) != (c6496ceR.c == null)) {
                return false;
            }
            if ((this.i == null) != (c6496ceR.i == null)) {
                return false;
            }
            if ((this.d == null) != (c6496ceR.d == null)) {
                return false;
            }
            if (l() == null ? c6496ceR.l() == null : l().equals(c6496ceR.l())) {
                return (i() == null) == (c6496ceR.i() == null);
            }
            return false;
        }
        return false;
    }

    @Override // o.AbstractC3073as
    public int hashCode() {
        int hashCode = super.hashCode();
        int i = this.b != null ? 1 : 0;
        int i2 = this.c != null ? 1 : 0;
        int i3 = this.i != null ? 1 : 0;
        int i4 = this.d != null ? 1 : 0;
        return (((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + (l() != null ? l().hashCode() : 0)) * 31) + (i() != null ? 1 : 0);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "CastSheetCloseButtonModel_{contentDescription=" + ((Object) l()) + ", closeClickListener=" + i() + "}" + super.toString();
    }
}
