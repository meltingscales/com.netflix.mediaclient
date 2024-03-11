package o;

import android.view.View;
import android.view.ViewParent;
import o.AbstractC3073as;
import o.AbstractC7210crs;

/* renamed from: o.crB  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C7167crB extends AbstractC7210crs implements InterfaceC1673aK<AbstractC7210crs.e>, InterfaceC7213crv {
    private InterfaceC4414be<C7167crB, AbstractC7210crs.e> b;
    private InterfaceC4467bf<C7167crB, AbstractC7210crs.e> d;
    private InterfaceC4732bk<C7167crB, AbstractC7210crs.e> h;
    private InterfaceC4573bh<C7167crB, AbstractC7210crs.e> i;

    @Override // o.InterfaceC1673aK
    public void e(C1511aE c1511aE, AbstractC7210crs.e eVar, int i) {
    }

    @Override // o.InterfaceC7213crv
    public /* synthetic */ InterfaceC7213crv b(InterfaceC4732bk interfaceC4732bk) {
        return a((InterfaceC4732bk<C7167crB, AbstractC7210crs.e>) interfaceC4732bk);
    }

    @Override // o.InterfaceC7213crv
    public /* synthetic */ InterfaceC7213crv e(InterfaceC4467bf interfaceC4467bf) {
        return a((InterfaceC4467bf<C7167crB, AbstractC7210crs.e>) interfaceC4467bf);
    }

    @Override // o.InterfaceC1673aK
    public void a(AbstractC7210crs.e eVar, int i) {
        InterfaceC4467bf<C7167crB, AbstractC7210crs.e> interfaceC4467bf = this.d;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, eVar, i);
        }
    }

    public C7167crB a(InterfaceC4467bf<C7167crB, AbstractC7210crs.e> interfaceC4467bf) {
        h();
        this.d = interfaceC4467bf;
        return this;
    }

    @Override // o.AbstractC7210crs, o.AbstractC3336ax, o.AbstractC3073as
    public void e(AbstractC7210crs.e eVar) {
        super.e(eVar);
        InterfaceC4414be<C7167crB, AbstractC7210crs.e> interfaceC4414be = this.b;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, eVar);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    public void c(int i, AbstractC7210crs.e eVar) {
        InterfaceC4732bk<C7167crB, AbstractC7210crs.e> interfaceC4732bk = this.h;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, eVar, i);
        }
        super.a(i, (int) eVar);
    }

    public C7167crB a(InterfaceC4732bk<C7167crB, AbstractC7210crs.e> interfaceC4732bk) {
        h();
        this.h = interfaceC4732bk;
        return this;
    }

    @Override // o.AbstractC3336ax
    /* renamed from: b */
    public void d(float f, float f2, int i, int i2, AbstractC7210crs.e eVar) {
        InterfaceC4573bh<C7167crB, AbstractC7210crs.e> interfaceC4573bh = this.i;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, eVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, eVar);
    }

    @Override // o.InterfaceC7213crv
    /* renamed from: c */
    public C7167crB a(View.OnClickListener onClickListener) {
        h();
        super.e(onClickListener);
        return this;
    }

    @Override // o.InterfaceC7213crv
    /* renamed from: d */
    public C7167crB c(C7201crj c7201crj) {
        h();
        this.c = c7201crj;
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: d */
    public C7167crB e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.InterfaceC7213crv
    /* renamed from: d */
    public C7167crB c(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: e */
    public C7167crB a(int i) {
        super.a(i);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: d */
    public C7167crB a(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: c */
    public AbstractC7210crs.e b(ViewParent viewParent) {
        return new AbstractC7210crs.e();
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C7167crB) && super.equals(obj)) {
            C7167crB c7167crB = (C7167crB) obj;
            if ((this.d == null) != (c7167crB.d == null)) {
                return false;
            }
            if ((this.b == null) != (c7167crB.b == null)) {
                return false;
            }
            if ((this.h == null) != (c7167crB.h == null)) {
                return false;
            }
            if ((this.i == null) != (c7167crB.i == null)) {
                return false;
            }
            if ((n() == null) != (c7167crB.n() == null)) {
                return false;
            }
            C7201crj c7201crj = this.c;
            C7201crj c7201crj2 = c7167crB.c;
            return c7201crj == null ? c7201crj2 == null : c7201crj.equals(c7201crj2);
        }
        return false;
    }

    @Override // o.AbstractC3073as
    public int hashCode() {
        int hashCode = super.hashCode();
        int i = this.d != null ? 1 : 0;
        int i2 = this.b != null ? 1 : 0;
        int i3 = this.h != null ? 1 : 0;
        int i4 = this.i != null ? 1 : 0;
        int i5 = n() == null ? 0 : 1;
        C7201crj c7201crj = this.c;
        return (((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + i5) * 31) + (c7201crj != null ? c7201crj.hashCode() : 0);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "NuxCarouselCardItemModel_{onClick=" + n() + ", nux=" + this.c + "}" + super.toString();
    }
}
