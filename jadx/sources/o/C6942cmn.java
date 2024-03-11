package o;

import android.view.View;
import android.view.ViewGroup;
import o.AbstractC3073as;

/* renamed from: o.cmn  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6942cmn extends AbstractC3073as<C6940cml> implements InterfaceC1673aK<C6940cml>, InterfaceC6941cmm {
    private InterfaceC4467bf<C6942cmn, C6940cml> b;
    private InterfaceC4414be<C6942cmn, C6940cml> f;
    private InterfaceC4573bh<C6942cmn, C6940cml> g;
    private InterfaceC4732bk<C6942cmn, C6940cml> j;
    private int d = 0;
    private View.OnClickListener c = null;

    @Override // o.AbstractC3073as
    public int Z_() {
        return 0;
    }

    @Override // o.AbstractC3073as
    public int b(int i, int i2, int i3) {
        return i;
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: d */
    public void e(C1511aE c1511aE, C6940cml c6940cml, int i) {
    }

    @Override // o.InterfaceC6941cmm
    public /* synthetic */ InterfaceC6941cmm b(InterfaceC4308bc interfaceC4308bc) {
        return e((InterfaceC4308bc<C6942cmn, C6940cml>) interfaceC4308bc);
    }

    @Override // o.AbstractC3073as
    /* renamed from: c */
    public C6940cml d(ViewGroup viewGroup) {
        C6940cml c6940cml = new C6940cml(viewGroup.getContext());
        c6940cml.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
        return c6940cml;
    }

    @Override // o.AbstractC3073as
    /* renamed from: b */
    public void c(C6940cml c6940cml) {
        super.c((C6942cmn) c6940cml);
        c6940cml.setButtonClickListener(this.c);
        c6940cml.setLabel(this.d);
    }

    @Override // o.AbstractC3073as
    /* renamed from: a */
    public void c(C6940cml c6940cml, AbstractC3073as abstractC3073as) {
        if (!(abstractC3073as instanceof C6942cmn)) {
            c(c6940cml);
            return;
        }
        C6942cmn c6942cmn = (C6942cmn) abstractC3073as;
        super.c((C6942cmn) c6940cml);
        View.OnClickListener onClickListener = this.c;
        if ((onClickListener == null) != (c6942cmn.c == null)) {
            c6940cml.setButtonClickListener(onClickListener);
        }
        int i = this.d;
        if (i != c6942cmn.d) {
            c6940cml.setLabel(i);
        }
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: c */
    public void a(C6940cml c6940cml, int i) {
        InterfaceC4467bf<C6942cmn, C6940cml> interfaceC4467bf = this.b;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, c6940cml, i);
        }
    }

    @Override // o.AbstractC3073as
    /* renamed from: a */
    public void e(C6940cml c6940cml) {
        super.e((C6942cmn) c6940cml);
        InterfaceC4414be<C6942cmn, C6940cml> interfaceC4414be = this.f;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, c6940cml);
        }
        c6940cml.setButtonClickListener(null);
    }

    @Override // o.AbstractC3073as
    /* renamed from: e */
    public void c(int i, C6940cml c6940cml) {
        InterfaceC4732bk<C6942cmn, C6940cml> interfaceC4732bk = this.j;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, c6940cml, i);
        }
        super.c(i, (int) c6940cml);
    }

    @Override // o.AbstractC3073as
    /* renamed from: d */
    public void b(float f, float f2, int i, int i2, C6940cml c6940cml) {
        InterfaceC4573bh<C6942cmn, C6940cml> interfaceC4573bh = this.g;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, c6940cml, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, c6940cml);
    }

    @Override // o.InterfaceC6941cmm
    /* renamed from: b */
    public C6942cmn d(int i) {
        h();
        this.d = i;
        return this;
    }

    public C6942cmn e(InterfaceC4308bc<C6942cmn, C6940cml> interfaceC4308bc) {
        h();
        if (interfaceC4308bc == null) {
            this.c = null;
        } else {
            this.c = new View$OnClickListenerC4818bn(interfaceC4308bc);
        }
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: d */
    public C6942cmn e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.InterfaceC6941cmm
    /* renamed from: c */
    public C6942cmn e(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: c */
    public C6942cmn a(int i) {
        throw new UnsupportedOperationException("Layout resources are unsupported with programmatic views.");
    }

    @Override // o.AbstractC3073as
    /* renamed from: d */
    public C6942cmn a(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    @Override // o.AbstractC3073as
    public int a() {
        throw new UnsupportedOperationException("Layout resources are unsupported for views created programmatically.");
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C6942cmn) && super.equals(obj)) {
            C6942cmn c6942cmn = (C6942cmn) obj;
            if ((this.b == null) != (c6942cmn.b == null)) {
                return false;
            }
            if ((this.f == null) != (c6942cmn.f == null)) {
                return false;
            }
            if ((this.j == null) != (c6942cmn.j == null)) {
                return false;
            }
            if ((this.g == null) == (c6942cmn.g == null) && this.d == c6942cmn.d) {
                return (this.c == null) == (c6942cmn.c == null);
            }
            return false;
        }
        return false;
    }

    @Override // o.AbstractC3073as
    public int hashCode() {
        int hashCode = super.hashCode();
        int i = this.b != null ? 1 : 0;
        int i2 = this.f != null ? 1 : 0;
        int i3 = this.j != null ? 1 : 0;
        int i4 = this.g != null ? 1 : 0;
        return (((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + this.d) * 31) + (this.c == null ? 0 : 1);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "MultiMonthSubmitButtonViewModel_{label_Int=" + this.d + ", buttonClickListener_OnClickListener=" + this.c + "}" + super.toString();
    }
}
