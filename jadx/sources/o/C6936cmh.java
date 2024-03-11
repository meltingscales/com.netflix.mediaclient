package o;

import android.view.View;
import android.view.ViewGroup;
import o.AbstractC3073as;

/* renamed from: o.cmh  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6936cmh extends AbstractC3073as<C6938cmj> implements InterfaceC1673aK<C6938cmj>, InterfaceC6937cmi {
    private InterfaceC4467bf<C6936cmh, C6938cmj> d;
    private InterfaceC4573bh<C6936cmh, C6938cmj> f;
    private InterfaceC4414be<C6936cmh, C6938cmj> g;
    private InterfaceC4732bk<C6936cmh, C6938cmj> h;
    private int c = 0;
    private View.OnClickListener b = null;

    @Override // o.AbstractC3073as
    public int Z_() {
        return 0;
    }

    @Override // o.AbstractC3073as
    public int b(int i, int i2, int i3) {
        return i;
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: b */
    public void e(C1511aE c1511aE, C6938cmj c6938cmj, int i) {
    }

    @Override // o.InterfaceC6937cmi
    public /* synthetic */ InterfaceC6937cmi b(InterfaceC4308bc interfaceC4308bc) {
        return d((InterfaceC4308bc<C6936cmh, C6938cmj>) interfaceC4308bc);
    }

    @Override // o.AbstractC3073as
    /* renamed from: e */
    public C6938cmj d(ViewGroup viewGroup) {
        C6938cmj c6938cmj = new C6938cmj(viewGroup.getContext());
        c6938cmj.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
        return c6938cmj;
    }

    @Override // o.AbstractC3073as
    /* renamed from: e  reason: avoid collision after fix types in other method */
    public void c(C6938cmj c6938cmj) {
        super.c((C6936cmh) c6938cmj);
        c6938cmj.setButtonClickListener(this.b);
        c6938cmj.setLabel(this.c);
    }

    @Override // o.AbstractC3073as
    /* renamed from: d */
    public void c(C6938cmj c6938cmj, AbstractC3073as abstractC3073as) {
        if (!(abstractC3073as instanceof C6936cmh)) {
            c(c6938cmj);
            return;
        }
        C6936cmh c6936cmh = (C6936cmh) abstractC3073as;
        super.c((C6936cmh) c6938cmj);
        View.OnClickListener onClickListener = this.b;
        if ((onClickListener == null) != (c6936cmh.b == null)) {
            c6938cmj.setButtonClickListener(onClickListener);
        }
        int i = this.c;
        if (i != c6936cmh.c) {
            c6938cmj.setLabel(i);
        }
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: e */
    public void a(C6938cmj c6938cmj, int i) {
        InterfaceC4467bf<C6936cmh, C6938cmj> interfaceC4467bf = this.d;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, c6938cmj, i);
        }
    }

    @Override // o.AbstractC3073as
    /* renamed from: b */
    public void e(C6938cmj c6938cmj) {
        super.e((C6936cmh) c6938cmj);
        InterfaceC4414be<C6936cmh, C6938cmj> interfaceC4414be = this.g;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, c6938cmj);
        }
        c6938cmj.setButtonClickListener(null);
    }

    @Override // o.AbstractC3073as
    public void c(int i, C6938cmj c6938cmj) {
        InterfaceC4732bk<C6936cmh, C6938cmj> interfaceC4732bk = this.h;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, c6938cmj, i);
        }
        super.c(i, (int) c6938cmj);
    }

    @Override // o.AbstractC3073as
    /* renamed from: c */
    public void b(float f, float f2, int i, int i2, C6938cmj c6938cmj) {
        InterfaceC4573bh<C6936cmh, C6938cmj> interfaceC4573bh = this.f;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, c6938cmj, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, c6938cmj);
    }

    @Override // o.InterfaceC6937cmi
    /* renamed from: b */
    public C6936cmh e(int i) {
        h();
        this.c = i;
        return this;
    }

    public C6936cmh d(InterfaceC4308bc<C6936cmh, C6938cmj> interfaceC4308bc) {
        h();
        if (interfaceC4308bc == null) {
            this.b = null;
        } else {
            this.b = new View$OnClickListenerC4818bn(interfaceC4308bc);
        }
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: b */
    public C6936cmh e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.InterfaceC6937cmi
    /* renamed from: c */
    public C6936cmh d(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: c */
    public C6936cmh a(int i) {
        throw new UnsupportedOperationException("Layout resources are unsupported with programmatic views.");
    }

    @Override // o.AbstractC3073as
    /* renamed from: e */
    public C6936cmh a(AbstractC3073as.b bVar) {
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
        if ((obj instanceof C6936cmh) && super.equals(obj)) {
            C6936cmh c6936cmh = (C6936cmh) obj;
            if ((this.d == null) != (c6936cmh.d == null)) {
                return false;
            }
            if ((this.g == null) != (c6936cmh.g == null)) {
                return false;
            }
            if ((this.h == null) != (c6936cmh.h == null)) {
                return false;
            }
            if ((this.f == null) == (c6936cmh.f == null) && this.c == c6936cmh.c) {
                return (this.b == null) == (c6936cmh.b == null);
            }
            return false;
        }
        return false;
    }

    @Override // o.AbstractC3073as
    public int hashCode() {
        int hashCode = super.hashCode();
        int i = this.d != null ? 1 : 0;
        int i2 = this.g != null ? 1 : 0;
        int i3 = this.h != null ? 1 : 0;
        int i4 = this.f != null ? 1 : 0;
        return (((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + this.c) * 31) + (this.b == null ? 0 : 1);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "MultiMonthDismissButtonViewModel_{label_Int=" + this.c + ", buttonClickListener_OnClickListener=" + this.b + "}" + super.toString();
    }
}
