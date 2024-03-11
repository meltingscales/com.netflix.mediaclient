package o;

import android.view.View;
import android.view.ViewParent;
import o.AbstractC3073as;
import o.bJW;

/* renamed from: o.bJr  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C3761bJr extends AbstractC3762bJs implements InterfaceC1673aK<bJW.b>, InterfaceC3760bJq {
    private InterfaceC4573bh<C3761bJr, bJW.b> b;
    private InterfaceC4414be<C3761bJr, bJW.b> c;
    private InterfaceC4467bf<C3761bJr, bJW.b> d;
    private InterfaceC4732bk<C3761bJr, bJW.b> f;

    @Override // o.InterfaceC1673aK
    /* renamed from: d */
    public void e(C1511aE c1511aE, bJW.b bVar, int i) {
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: e */
    public void a(bJW.b bVar, int i) {
        InterfaceC4467bf<C3761bJr, bJW.b> interfaceC4467bf = this.d;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, bVar, i);
        }
    }

    @Override // o.bJW, o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: d */
    public void e(bJW.b bVar) {
        super.e(bVar);
        InterfaceC4414be<C3761bJr, bJW.b> interfaceC4414be = this.c;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, bVar);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    public void c(int i, bJW.b bVar) {
        InterfaceC4732bk<C3761bJr, bJW.b> interfaceC4732bk = this.f;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, bVar, i);
        }
        super.a(i, (int) bVar);
    }

    @Override // o.AbstractC3336ax
    /* renamed from: a */
    public void d(float f, float f2, int i, int i2, bJW.b bVar) {
        InterfaceC4573bh<C3761bJr, bJW.b> interfaceC4573bh = this.b;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, bVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, bVar);
    }

    @Override // o.InterfaceC3760bJq
    /* renamed from: e */
    public C3761bJr b(View.OnClickListener onClickListener) {
        h();
        super.d(onClickListener);
        return this;
    }

    @Override // o.InterfaceC3760bJq
    /* renamed from: a */
    public C3761bJr e(Integer num) {
        h();
        super.f_(num);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: a */
    public C3761bJr e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.InterfaceC3760bJq
    /* renamed from: e */
    public C3761bJr b(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: c */
    public C3761bJr a(int i) {
        super.a(i);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: d */
    public C3761bJr a(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: c */
    public bJW.b b(ViewParent viewParent) {
        return new bJW.b();
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C3761bJr) && super.equals(obj)) {
            C3761bJr c3761bJr = (C3761bJr) obj;
            if ((this.d == null) != (c3761bJr.d == null)) {
                return false;
            }
            if ((this.c == null) != (c3761bJr.c == null)) {
                return false;
            }
            if ((this.f == null) != (c3761bJr.f == null)) {
                return false;
            }
            if ((this.b == null) != (c3761bJr.b == null)) {
                return false;
            }
            if ((l() == null) != (c3761bJr.l() == null)) {
                return false;
            }
            if (i() == null ? c3761bJr.i() == null : i().equals(c3761bJr.i())) {
                if (n() != c3761bJr.n()) {
                    return false;
                }
                return o() == null ? c3761bJr.o() == null : o().equals(c3761bJr.o());
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
        int i5 = l() == null ? 0 : 1;
        return (((((((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + i5) * 31) + (i() != null ? i().hashCode() : 0)) * 31) + (n() ? 1 : 0)) * 31) + (o() != null ? o().hashCode() : 0);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "CloseSheetButtonModel_{onClick=" + l() + ", imageDrawableId=" + i() + ", enabled=" + n() + ", contentDescription=" + o() + "}" + super.toString();
    }
}
