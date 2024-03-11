package o;

import android.view.ViewParent;
import android.widget.CompoundButton;
import o.AbstractC3073as;
import o.AbstractC3678bGp;

/* renamed from: o.bGs  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C3681bGs extends AbstractC3678bGp implements InterfaceC1673aK<AbstractC3678bGp.d>, InterfaceC3679bGq {
    private InterfaceC4573bh<C3681bGs, AbstractC3678bGp.d> b;
    private InterfaceC4414be<C3681bGs, AbstractC3678bGp.d> c;
    private InterfaceC4467bf<C3681bGs, AbstractC3678bGp.d> d;
    private InterfaceC4732bk<C3681bGs, AbstractC3678bGp.d> f;

    @Override // o.InterfaceC1673aK
    /* renamed from: d */
    public void e(C1511aE c1511aE, AbstractC3678bGp.d dVar, int i) {
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: e */
    public void a(AbstractC3678bGp.d dVar, int i) {
        InterfaceC4467bf<C3681bGs, AbstractC3678bGp.d> interfaceC4467bf = this.d;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, dVar, i);
        }
    }

    @Override // o.AbstractC3678bGp, o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: b  reason: avoid collision after fix types in other method */
    public void e(AbstractC3678bGp.d dVar) {
        super.e(dVar);
        InterfaceC4414be<C3681bGs, AbstractC3678bGp.d> interfaceC4414be = this.c;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, dVar);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: d */
    public void c(int i, AbstractC3678bGp.d dVar) {
        InterfaceC4732bk<C3681bGs, AbstractC3678bGp.d> interfaceC4732bk = this.f;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, dVar, i);
        }
        super.a(i, (int) dVar);
    }

    @Override // o.AbstractC3336ax
    /* renamed from: a */
    public void d(float f, float f2, int i, int i2, AbstractC3678bGp.d dVar) {
        InterfaceC4573bh<C3681bGs, AbstractC3678bGp.d> interfaceC4573bh = this.b;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, dVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, dVar);
    }

    @Override // o.InterfaceC3679bGq
    /* renamed from: c */
    public C3681bGs d(boolean z) {
        h();
        super.a(z);
        return this;
    }

    @Override // o.InterfaceC3679bGq
    /* renamed from: e */
    public C3681bGs d(CharSequence charSequence) {
        h();
        super.d_(charSequence);
        return this;
    }

    @Override // o.InterfaceC3679bGq
    /* renamed from: b */
    public C3681bGs e(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        h();
        super.a(onCheckedChangeListener);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: c */
    public C3681bGs e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.InterfaceC3679bGq
    /* renamed from: c */
    public C3681bGs b(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.InterfaceC3679bGq
    /* renamed from: d */
    public C3681bGs b(int i) {
        super.a(i);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: c */
    public C3681bGs a(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: d */
    public AbstractC3678bGp.d b(ViewParent viewParent) {
        return new AbstractC3678bGp.d();
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C3681bGs) && super.equals(obj)) {
            C3681bGs c3681bGs = (C3681bGs) obj;
            if ((this.d == null) != (c3681bGs.d == null)) {
                return false;
            }
            if ((this.c == null) != (c3681bGs.c == null)) {
                return false;
            }
            if ((this.f == null) != (c3681bGs.f == null)) {
                return false;
            }
            if ((this.b == null) == (c3681bGs.b == null) && l() == c3681bGs.l()) {
                if (k() == null ? c3681bGs.k() == null : k().equals(c3681bGs.k())) {
                    if (i() == null ? c3681bGs.i() == null : i().equals(c3681bGs.i())) {
                        return (m() == null) == (c3681bGs.m() == null);
                    }
                    return false;
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
        int i3 = this.f != null ? 1 : 0;
        int i4 = this.b != null ? 1 : 0;
        boolean l = l();
        int hashCode2 = k() != null ? k().hashCode() : 0;
        return (((((((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + (l ? 1 : 0)) * 31) + hashCode2) * 31) + (i() != null ? i().hashCode() : 0)) * 31) + (m() != null ? 1 : 0);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "DpCtaRemindMeButtonModel_{reminderSet=" + l() + ", label=" + ((Object) k()) + ", accessibilityLabel=" + ((Object) i()) + ", onCheckStateChanged=" + m() + "}" + super.toString();
    }
}
