package o;

import android.view.ViewParent;
import o.AbstractC3073as;
import o.bJQ;

/* loaded from: classes4.dex */
public class bJN extends bJQ implements InterfaceC1673aK<bJQ.e>, bJR {
    private InterfaceC4573bh<bJN, bJQ.e> b;
    private InterfaceC4414be<bJN, bJQ.e> c;
    private InterfaceC4467bf<bJN, bJQ.e> d;
    private InterfaceC4732bk<bJN, bJQ.e> j;

    @Override // o.InterfaceC1673aK
    /* renamed from: c */
    public void e(C1511aE c1511aE, bJQ.e eVar, int i) {
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: b */
    public void a(bJQ.e eVar, int i) {
        InterfaceC4467bf<bJN, bJQ.e> interfaceC4467bf = this.d;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, eVar, i);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: b  reason: avoid collision after fix types in other method */
    public void e(bJQ.e eVar) {
        super.b((bJN) eVar);
        InterfaceC4414be<bJN, bJQ.e> interfaceC4414be = this.c;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, eVar);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: d */
    public void c(int i, bJQ.e eVar) {
        InterfaceC4732bk<bJN, bJQ.e> interfaceC4732bk = this.j;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, eVar, i);
        }
        super.a(i, (int) eVar);
    }

    @Override // o.AbstractC3336ax
    /* renamed from: b */
    public void d(float f, float f2, int i, int i2, bJQ.e eVar) {
        InterfaceC4573bh<bJN, bJQ.e> interfaceC4573bh = this.b;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, eVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, eVar);
    }

    @Override // o.AbstractC3073as
    /* renamed from: c */
    public bJN e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.bJR
    /* renamed from: b */
    public bJN e(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: e */
    public bJN a(int i) {
        super.a(i);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: c */
    public bJN a(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: c */
    public bJQ.e b(ViewParent viewParent) {
        return new bJQ.e();
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof bJN) && super.equals(obj)) {
            bJN bjn = (bJN) obj;
            if ((this.d == null) != (bjn.d == null)) {
                return false;
            }
            if ((this.c == null) != (bjn.c == null)) {
                return false;
            }
            if ((this.j == null) != (bjn.j == null)) {
                return false;
            }
            return (this.b == null) == (bjn.b == null);
        }
        return false;
    }

    @Override // o.AbstractC3073as
    public int hashCode() {
        int hashCode = super.hashCode();
        int i = this.d != null ? 1 : 0;
        int i2 = this.c != null ? 1 : 0;
        return (((((((hashCode * 31) + i) * 31) + i2) * 31) + (this.j != null ? 1 : 0)) * 31) + (this.b == null ? 0 : 1);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "GoneModel_{}" + super.toString();
    }
}
