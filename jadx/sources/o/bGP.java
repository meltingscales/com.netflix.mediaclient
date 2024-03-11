package o;

import android.view.ViewParent;
import o.AbstractC3073as;
import o.bGM;

/* loaded from: classes4.dex */
public class bGP extends bGM implements InterfaceC1673aK<bGM.e>, bGS {
    private InterfaceC4573bh<bGP, bGM.e> b;
    private InterfaceC4414be<bGP, bGM.e> c;
    private InterfaceC4467bf<bGP, bGM.e> d;
    private InterfaceC4732bk<bGP, bGM.e> j;

    @Override // o.InterfaceC1673aK
    public void e(C1511aE c1511aE, bGM.e eVar, int i) {
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: d */
    public void a(bGM.e eVar, int i) {
        InterfaceC4467bf<bGP, bGM.e> interfaceC4467bf = this.d;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, eVar, i);
        }
    }

    @Override // o.bGM, o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: c */
    public void e(bGM.e eVar) {
        super.e(eVar);
        InterfaceC4414be<bGP, bGM.e> interfaceC4414be = this.c;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, eVar);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: e */
    public void c(int i, bGM.e eVar) {
        InterfaceC4732bk<bGP, bGM.e> interfaceC4732bk = this.j;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, eVar, i);
        }
        super.a(i, (int) eVar);
    }

    @Override // o.AbstractC3336ax
    /* renamed from: b */
    public void d(float f, float f2, int i, int i2, bGM.e eVar) {
        InterfaceC4573bh<bGP, bGM.e> interfaceC4573bh = this.b;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, eVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, eVar);
    }

    @Override // o.bGS
    /* renamed from: g */
    public bGP d(String str) {
        h();
        super.c(str);
        return this;
    }

    @Override // o.bGS
    /* renamed from: a */
    public bGP c(Integer num) {
        h();
        super.b(num);
        return this;
    }

    @Override // o.bGS
    /* renamed from: b */
    public bGP a(String str) {
        h();
        super.e(str);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: d */
    public bGP e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: d */
    public bGP a(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: c */
    public bGP a(int i) {
        super.a(i);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: b */
    public bGP a(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: e */
    public bGM.e b(ViewParent viewParent) {
        return new bGM.e();
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof bGP) && super.equals(obj)) {
            bGP bgp = (bGP) obj;
            if ((this.d == null) != (bgp.d == null)) {
                return false;
            }
            if ((this.c == null) != (bgp.c == null)) {
                return false;
            }
            if ((this.j == null) != (bgp.j == null)) {
                return false;
            }
            if ((this.b == null) != (bgp.b == null)) {
                return false;
            }
            if (k() == null ? bgp.k() == null : k().equals(bgp.k())) {
                if (l() == null ? bgp.l() == null : l().equals(bgp.l())) {
                    return i() == null ? bgp.i() == null : i().equals(bgp.i());
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
        int i3 = this.j != null ? 1 : 0;
        int i4 = this.b == null ? 0 : 1;
        int hashCode2 = k() != null ? k().hashCode() : 0;
        return (((((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + hashCode2) * 31) + (l() != null ? l().hashCode() : 0)) * 31) + (i() != null ? i().hashCode() : 0);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "DpMetadataBadgeItemModel_{tooltip=" + k() + ", icon=" + l() + ", contentDescription=" + i() + "}" + super.toString();
    }
}
