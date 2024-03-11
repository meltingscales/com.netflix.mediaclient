package o;

import android.view.View;
import android.view.ViewParent;
import o.AbstractC3073as;
import o.cTZ;

/* renamed from: o.cUf  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6110cUf extends cTZ implements InterfaceC1673aK<cTZ.b>, InterfaceC6107cUc {
    private InterfaceC4414be<C6110cUf, cTZ.b> b;
    private InterfaceC4467bf<C6110cUf, cTZ.b> c;
    private InterfaceC4573bh<C6110cUf, cTZ.b> d;
    private InterfaceC4732bk<C6110cUf, cTZ.b> j;

    @Override // o.InterfaceC1673aK
    /* renamed from: a */
    public void e(C1511aE c1511aE, cTZ.b bVar, int i) {
    }

    @Override // o.InterfaceC6107cUc
    public /* synthetic */ InterfaceC6107cUc a(InterfaceC4573bh interfaceC4573bh) {
        return b((InterfaceC4573bh<C6110cUf, cTZ.b>) interfaceC4573bh);
    }

    @Override // o.InterfaceC6107cUc
    public /* synthetic */ InterfaceC6107cUc e(InterfaceC4308bc interfaceC4308bc) {
        return a((InterfaceC4308bc<C6110cUf, cTZ.b>) interfaceC4308bc);
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: d */
    public void a(cTZ.b bVar, int i) {
        InterfaceC4467bf<C6110cUf, cTZ.b> interfaceC4467bf = this.c;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, bVar, i);
        }
    }

    @Override // o.cTZ, o.AbstractC3336ax, o.AbstractC3073as
    public void e(cTZ.b bVar) {
        super.e(bVar);
        InterfaceC4414be<C6110cUf, cTZ.b> interfaceC4414be = this.b;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, bVar);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    public void c(int i, cTZ.b bVar) {
        InterfaceC4732bk<C6110cUf, cTZ.b> interfaceC4732bk = this.j;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, bVar, i);
        }
        super.a(i, (int) bVar);
    }

    @Override // o.AbstractC3336ax
    /* renamed from: a */
    public void d(float f, float f2, int i, int i2, cTZ.b bVar) {
        InterfaceC4573bh<C6110cUf, cTZ.b> interfaceC4573bh = this.d;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, bVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, bVar);
    }

    public C6110cUf b(InterfaceC4573bh<C6110cUf, cTZ.b> interfaceC4573bh) {
        h();
        this.d = interfaceC4573bh;
        return this;
    }

    @Override // o.InterfaceC6107cUc
    /* renamed from: a */
    public C6110cUf d(String str) {
        h();
        super.e(str);
        return this;
    }

    @Override // o.InterfaceC6107cUc
    /* renamed from: b */
    public C6110cUf c(String str) {
        h();
        super.ad_(str);
        return this;
    }

    public C6110cUf a(InterfaceC4308bc<C6110cUf, cTZ.b> interfaceC4308bc) {
        h();
        if (interfaceC4308bc == null) {
            super.c((View.OnClickListener) null);
        } else {
            super.c((View.OnClickListener) new View$OnClickListenerC4818bn(interfaceC4308bc));
        }
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: a */
    public C6110cUf e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.InterfaceC6107cUc
    /* renamed from: b */
    public C6110cUf d(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: d */
    public C6110cUf a(int i) {
        super.a(i);
        return this;
    }

    @Override // o.InterfaceC6107cUc
    /* renamed from: e */
    public C6110cUf d(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: e */
    public cTZ.b b(ViewParent viewParent) {
        return new cTZ.b();
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C6110cUf) && super.equals(obj)) {
            C6110cUf c6110cUf = (C6110cUf) obj;
            if ((this.c == null) != (c6110cUf.c == null)) {
                return false;
            }
            if ((this.b == null) != (c6110cUf.b == null)) {
                return false;
            }
            if ((this.j == null) != (c6110cUf.j == null)) {
                return false;
            }
            if ((this.d == null) != (c6110cUf.d == null)) {
                return false;
            }
            if (i() == null ? c6110cUf.i() == null : i().equals(c6110cUf.i())) {
                if (l() == null ? c6110cUf.l() == null : l().equals(c6110cUf.l())) {
                    return (n() == null) == (c6110cUf.n() == null);
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
        int i = this.c != null ? 1 : 0;
        int i2 = this.b != null ? 1 : 0;
        int i3 = this.j != null ? 1 : 0;
        int i4 = this.d != null ? 1 : 0;
        int hashCode2 = i() != null ? i().hashCode() : 0;
        return (((((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + hashCode2) * 31) + (l() != null ? l().hashCode() : 0)) * 31) + (n() != null ? 1 : 0);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "CreatorHomeBannerModel_{bannerUrl=" + i() + ", contentDescription=" + l() + ", clickListener=" + n() + "}" + super.toString();
    }
}
