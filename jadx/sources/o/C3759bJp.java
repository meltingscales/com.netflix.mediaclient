package o;

import android.view.ViewParent;
import android.widget.CompoundButton;
import o.AbstractC3073as;
import o.AbstractC3756bJm;

/* renamed from: o.bJp  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C3759bJp extends AbstractC3756bJm implements InterfaceC1673aK<AbstractC3756bJm.a>, InterfaceC3754bJk {
    private InterfaceC4467bf<C3759bJp, AbstractC3756bJm.a> b;
    private InterfaceC4414be<C3759bJp, AbstractC3756bJm.a> c;
    private InterfaceC4573bh<C3759bJp, AbstractC3756bJm.a> d;
    private InterfaceC4732bk<C3759bJp, AbstractC3756bJm.a> g;

    @Override // o.InterfaceC1673aK
    /* renamed from: d */
    public void e(C1511aE c1511aE, AbstractC3756bJm.a aVar, int i) {
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: e */
    public void a(AbstractC3756bJm.a aVar, int i) {
        InterfaceC4467bf<C3759bJp, AbstractC3756bJm.a> interfaceC4467bf = this.b;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, aVar, i);
        }
    }

    @Override // o.AbstractC3756bJm, o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: b  reason: avoid collision after fix types in other method */
    public void e(AbstractC3756bJm.a aVar) {
        super.e(aVar);
        InterfaceC4414be<C3759bJp, AbstractC3756bJm.a> interfaceC4414be = this.c;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, aVar);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: b */
    public void c(int i, AbstractC3756bJm.a aVar) {
        InterfaceC4732bk<C3759bJp, AbstractC3756bJm.a> interfaceC4732bk = this.g;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, aVar, i);
        }
        super.a(i, (int) aVar);
    }

    @Override // o.AbstractC3336ax
    /* renamed from: a */
    public void d(float f, float f2, int i, int i2, AbstractC3756bJm.a aVar) {
        InterfaceC4573bh<C3759bJp, AbstractC3756bJm.a> interfaceC4573bh = this.d;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, aVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, aVar);
    }

    @Override // o.InterfaceC3754bJk
    /* renamed from: c */
    public C3759bJp b(CharSequence charSequence) {
        h();
        super.t_(charSequence);
        return this;
    }

    @Override // o.InterfaceC3754bJk
    /* renamed from: b */
    public C3759bJp c(boolean z) {
        h();
        super.l_(z);
        return this;
    }

    @Override // o.InterfaceC3754bJk
    /* renamed from: e */
    public C3759bJp a(boolean z) {
        h();
        super.m_(z);
        return this;
    }

    @Override // o.InterfaceC3754bJk
    /* renamed from: e */
    public C3759bJp b(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        h();
        super.c(onCheckedChangeListener);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: b */
    public C3759bJp e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.InterfaceC3754bJk
    /* renamed from: d */
    public C3759bJp e(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.InterfaceC3754bJk
    /* renamed from: e */
    public C3759bJp c(int i) {
        super.a(i);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: c */
    public C3759bJp a(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: a */
    public AbstractC3756bJm.a b(ViewParent viewParent) {
        return new AbstractC3756bJm.a();
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C3759bJp) && super.equals(obj)) {
            C3759bJp c3759bJp = (C3759bJp) obj;
            if ((this.b == null) != (c3759bJp.b == null)) {
                return false;
            }
            if ((this.c == null) != (c3759bJp.c == null)) {
                return false;
            }
            if ((this.g == null) != (c3759bJp.g == null)) {
                return false;
            }
            if ((this.d == null) != (c3759bJp.d == null)) {
                return false;
            }
            if (l() == null ? c3759bJp.l() == null : l().equals(c3759bJp.l())) {
                if (i() == c3759bJp.i() && k() == c3759bJp.k()) {
                    return (m() == null) == (c3759bJp.m() == null);
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
        int i = this.b != null ? 1 : 0;
        int i2 = this.c != null ? 1 : 0;
        int i3 = this.g != null ? 1 : 0;
        int i4 = this.d != null ? 1 : 0;
        return (((((((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + (l() != null ? l().hashCode() : 0)) * 31) + (i() ? 1 : 0)) * 31) + (k() ? 1 : 0)) * 31) + (m() != null ? 1 : 0);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "CheckBoxModel_{text=" + ((Object) l()) + ", checked=" + i() + ", enabled=" + k() + ", checkedChangeListener=" + m() + "}" + super.toString();
    }
}
