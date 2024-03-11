package o;

import android.view.View;
import android.view.ViewParent;
import o.AbstractC3073as;
import o.bGC;

/* renamed from: o.bGz  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C3688bGz extends bGC implements InterfaceC1673aK<bGC.b>, bGD {
    private InterfaceC4573bh<C3688bGz, bGC.b> b;
    private InterfaceC4414be<C3688bGz, bGC.b> c;
    private InterfaceC4467bf<C3688bGz, bGC.b> d;
    private InterfaceC4732bk<C3688bGz, bGC.b> g;

    @Override // o.InterfaceC1673aK
    /* renamed from: d */
    public void e(C1511aE c1511aE, bGC.b bVar, int i) {
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: e */
    public void a(bGC.b bVar, int i) {
        InterfaceC4467bf<C3688bGz, bGC.b> interfaceC4467bf = this.d;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, bVar, i);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: c */
    public void e(bGC.b bVar) {
        super.b((C3688bGz) bVar);
        InterfaceC4414be<C3688bGz, bGC.b> interfaceC4414be = this.c;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, bVar);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: d */
    public void c(int i, bGC.b bVar) {
        InterfaceC4732bk<C3688bGz, bGC.b> interfaceC4732bk = this.g;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, bVar, i);
        }
        super.a(i, (int) bVar);
    }

    @Override // o.AbstractC3336ax
    /* renamed from: a */
    public void d(float f, float f2, int i, int i2, bGC.b bVar) {
        InterfaceC4573bh<C3688bGz, bGC.b> interfaceC4573bh = this.b;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, bVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, bVar);
    }

    @Override // o.bGD
    /* renamed from: d */
    public C3688bGz e(View.OnClickListener onClickListener) {
        h();
        super.a(onClickListener);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: b */
    public C3688bGz e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.bGD
    /* renamed from: d */
    public C3688bGz b(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: d */
    public C3688bGz a(int i) {
        super.a(i);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: d */
    public C3688bGz a(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: a */
    public bGC.b b(ViewParent viewParent) {
        return new bGC.b();
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C3688bGz) && super.equals(obj)) {
            C3688bGz c3688bGz = (C3688bGz) obj;
            if ((this.d == null) != (c3688bGz.d == null)) {
                return false;
            }
            if ((this.c == null) != (c3688bGz.c == null)) {
                return false;
            }
            if ((this.g == null) != (c3688bGz.g == null)) {
                return false;
            }
            if ((this.b == null) != (c3688bGz.b == null)) {
                return false;
            }
            return (i() == null) == (c3688bGz.i() == null);
        }
        return false;
    }

    @Override // o.AbstractC3073as
    public int hashCode() {
        int hashCode = super.hashCode();
        int i = this.d != null ? 1 : 0;
        int i2 = this.c != null ? 1 : 0;
        int i3 = this.g != null ? 1 : 0;
        return (((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + (this.b != null ? 1 : 0)) * 31) + (i() == null ? 0 : 1);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "DpCtaShareButtonModel_{onClickListener=" + i() + "}" + super.toString();
    }
}
