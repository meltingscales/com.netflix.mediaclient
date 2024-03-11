package o;

import android.view.View;
import android.view.ViewParent;
import o.AbstractC3073as;
import o.AbstractC3684bGv;

/* renamed from: o.bGu  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C3683bGu extends AbstractC3684bGv implements InterfaceC1673aK<AbstractC3684bGv.b>, InterfaceC3685bGw {
    private InterfaceC4414be<C3683bGu, AbstractC3684bGv.b> b;
    private InterfaceC4573bh<C3683bGu, AbstractC3684bGv.b> c;
    private InterfaceC4467bf<C3683bGu, AbstractC3684bGv.b> d;
    private InterfaceC4732bk<C3683bGu, AbstractC3684bGv.b> g;

    @Override // o.InterfaceC1673aK
    /* renamed from: b */
    public void e(C1511aE c1511aE, AbstractC3684bGv.b bVar, int i) {
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: d */
    public void a(AbstractC3684bGv.b bVar, int i) {
        InterfaceC4467bf<C3683bGu, AbstractC3684bGv.b> interfaceC4467bf = this.d;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, bVar, i);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: b  reason: avoid collision after fix types in other method */
    public void e(AbstractC3684bGv.b bVar) {
        super.b((C3683bGu) bVar);
        InterfaceC4414be<C3683bGu, AbstractC3684bGv.b> interfaceC4414be = this.b;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, bVar);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: b */
    public void c(int i, AbstractC3684bGv.b bVar) {
        InterfaceC4732bk<C3683bGu, AbstractC3684bGv.b> interfaceC4732bk = this.g;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, bVar, i);
        }
        super.a(i, (int) bVar);
    }

    @Override // o.AbstractC3336ax
    /* renamed from: e */
    public void d(float f, float f2, int i, int i2, AbstractC3684bGv.b bVar) {
        InterfaceC4573bh<C3683bGu, AbstractC3684bGv.b> interfaceC4573bh = this.c;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, bVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, bVar);
    }

    @Override // o.InterfaceC3685bGw
    /* renamed from: a */
    public C3683bGu d(View.OnClickListener onClickListener) {
        h();
        super.c(onClickListener);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: b */
    public C3683bGu e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.InterfaceC3685bGw
    /* renamed from: e */
    public C3683bGu b(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: e */
    public C3683bGu a(int i) {
        super.a(i);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: d */
    public C3683bGu a(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: a */
    public AbstractC3684bGv.b b(ViewParent viewParent) {
        return new AbstractC3684bGv.b();
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C3683bGu) && super.equals(obj)) {
            C3683bGu c3683bGu = (C3683bGu) obj;
            if ((this.d == null) != (c3683bGu.d == null)) {
                return false;
            }
            if ((this.b == null) != (c3683bGu.b == null)) {
                return false;
            }
            if ((this.g == null) != (c3683bGu.g == null)) {
                return false;
            }
            if ((this.c == null) != (c3683bGu.c == null)) {
                return false;
            }
            return (i() == null) == (c3683bGu.i() == null);
        }
        return false;
    }

    @Override // o.AbstractC3073as
    public int hashCode() {
        int hashCode = super.hashCode();
        int i = this.d != null ? 1 : 0;
        int i2 = this.b != null ? 1 : 0;
        int i3 = this.g != null ? 1 : 0;
        return (((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + (this.c != null ? 1 : 0)) * 31) + (i() == null ? 0 : 1);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "DpCtaRestartIkoButtonModel_{onClickListener=" + i() + "}" + super.toString();
    }
}
