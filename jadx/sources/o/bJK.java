package o;

import android.view.ViewParent;
import o.AbstractC3073as;
import o.bJL;

/* loaded from: classes4.dex */
public class bJK extends bJL implements InterfaceC1673aK<bJL.e>, bJJ {
    private InterfaceC4467bf<bJK, bJL.e> d;
    private InterfaceC4414be<bJK, bJL.e> f;
    private InterfaceC4732bk<bJK, bJL.e> h;
    private InterfaceC4573bh<bJK, bJL.e> j;

    @Override // o.InterfaceC1673aK
    public void e(C1511aE c1511aE, bJL.e eVar, int i) {
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: c */
    public void a(bJL.e eVar, int i) {
        InterfaceC4467bf<bJK, bJL.e> interfaceC4467bf = this.d;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, eVar, i);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: a */
    public void e(bJL.e eVar) {
        super.b((bJK) eVar);
        InterfaceC4414be<bJK, bJL.e> interfaceC4414be = this.f;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, eVar);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: d */
    public void c(int i, bJL.e eVar) {
        InterfaceC4732bk<bJK, bJL.e> interfaceC4732bk = this.h;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, eVar, i);
        }
        super.a(i, (int) eVar);
    }

    @Override // o.AbstractC3336ax
    /* renamed from: c */
    public void d(float f, float f2, int i, int i2, bJL.e eVar) {
        InterfaceC4573bh<bJK, bJL.e> interfaceC4573bh = this.j;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, eVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, eVar);
    }

    @Override // o.bJJ
    /* renamed from: b */
    public bJK d(Float f) {
        h();
        super.a(f);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: d */
    public bJK e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.bJJ
    /* renamed from: b */
    public bJK d(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: e */
    public bJK a(int i) {
        super.a(i);
        return this;
    }

    @Override // o.bJJ
    /* renamed from: e */
    public bJK b(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: c */
    public bJL.e b(ViewParent viewParent) {
        return new bJL.e();
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof bJK) && super.equals(obj)) {
            bJK bjk = (bJK) obj;
            if ((this.d == null) != (bjk.d == null)) {
                return false;
            }
            if ((this.f == null) != (bjk.f == null)) {
                return false;
            }
            if ((this.h == null) != (bjk.h == null)) {
                return false;
            }
            if ((this.j == null) != (bjk.j == null)) {
                return false;
            }
            return o() == null ? bjk.o() == null : o().equals(bjk.o());
        }
        return false;
    }

    @Override // o.AbstractC3073as
    public int hashCode() {
        int hashCode = super.hashCode();
        int i = this.d != null ? 1 : 0;
        int i2 = this.f != null ? 1 : 0;
        int i3 = this.h != null ? 1 : 0;
        return (((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + (this.j == null ? 0 : 1)) * 31) + (o() != null ? o().hashCode() : 0);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "FillerModel_{weight=" + o() + "}" + super.toString();
    }
}
