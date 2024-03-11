package o;

import android.view.ViewParent;
import android.widget.CompoundButton;
import o.AbstractC3073as;
import o.AbstractC5501bzu;

/* renamed from: o.bzv  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C5502bzv extends AbstractC5501bzu implements InterfaceC1673aK<AbstractC5501bzu.b>, InterfaceC5500bzt {
    private InterfaceC4414be<C5502bzv, AbstractC5501bzu.b> b;
    private InterfaceC4573bh<C5502bzv, AbstractC5501bzu.b> c;
    private InterfaceC4467bf<C5502bzv, AbstractC5501bzu.b> d;
    private InterfaceC4732bk<C5502bzv, AbstractC5501bzu.b> j;

    @Override // o.InterfaceC1673aK
    /* renamed from: b */
    public void e(C1511aE c1511aE, AbstractC5501bzu.b bVar, int i) {
    }

    @Override // o.InterfaceC1673aK
    public void a(AbstractC5501bzu.b bVar, int i) {
        InterfaceC4467bf<C5502bzv, AbstractC5501bzu.b> interfaceC4467bf = this.d;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, bVar, i);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: a */
    public void e(AbstractC5501bzu.b bVar) {
        super.b((C5502bzv) bVar);
        InterfaceC4414be<C5502bzv, AbstractC5501bzu.b> interfaceC4414be = this.b;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, bVar);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    public void c(int i, AbstractC5501bzu.b bVar) {
        InterfaceC4732bk<C5502bzv, AbstractC5501bzu.b> interfaceC4732bk = this.j;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, bVar, i);
        }
        super.a(i, (int) bVar);
    }

    @Override // o.AbstractC3336ax
    public void d(float f, float f2, int i, int i2, AbstractC5501bzu.b bVar) {
        InterfaceC4573bh<C5502bzv, AbstractC5501bzu.b> interfaceC4573bh = this.c;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, bVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, (int) bVar);
    }

    @Override // o.InterfaceC5500bzt
    /* renamed from: b */
    public C5502bzv c(CharSequence charSequence) {
        h();
        super.d(charSequence);
        return this;
    }

    @Override // o.InterfaceC5500bzt
    /* renamed from: b */
    public C5502bzv c(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        h();
        super.e(onCheckedChangeListener);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: a */
    public C5502bzv e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.InterfaceC5500bzt
    /* renamed from: g */
    public C5502bzv e(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: e */
    public C5502bzv a(int i) {
        super.a(i);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: d */
    public C5502bzv a(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: e */
    public AbstractC5501bzu.b b(ViewParent viewParent) {
        return new AbstractC5501bzu.b();
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C5502bzv) && super.equals(obj)) {
            C5502bzv c5502bzv = (C5502bzv) obj;
            if ((this.d == null) != (c5502bzv.d == null)) {
                return false;
            }
            if ((this.b == null) != (c5502bzv.b == null)) {
                return false;
            }
            if ((this.j == null) != (c5502bzv.j == null)) {
                return false;
            }
            if ((this.c == null) != (c5502bzv.c == null)) {
                return false;
            }
            if (i() == null ? c5502bzv.i() == null : i().equals(c5502bzv.i())) {
                return (n() == null) == (c5502bzv.n() == null);
            }
            return false;
        }
        return false;
    }

    @Override // o.AbstractC3073as
    public int hashCode() {
        int hashCode = super.hashCode();
        int i = this.d != null ? 1 : 0;
        int i2 = this.b != null ? 1 : 0;
        int i3 = this.j != null ? 1 : 0;
        int i4 = this.c != null ? 1 : 0;
        return (((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + (i() != null ? i().hashCode() : 0)) * 31) + (n() != null ? 1 : 0);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "ConsentCheckboxModel_{consentText=" + ((Object) i()) + ", onChecked=" + n() + "}" + super.toString();
    }
}
