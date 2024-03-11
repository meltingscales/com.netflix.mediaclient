package o;

import android.view.ViewParent;
import o.AbstractC3073as;
import o.bQP;

/* loaded from: classes4.dex */
public class bQV extends bQP implements InterfaceC1673aK<bQP.e>, bQR {
    private InterfaceC4467bf<bQV, bQP.e> b;
    private InterfaceC4414be<bQV, bQP.e> c;
    private InterfaceC4573bh<bQV, bQP.e> d;
    private InterfaceC4732bk<bQV, bQP.e> h;

    @Override // o.InterfaceC1673aK
    /* renamed from: a */
    public void e(C1511aE c1511aE, bQP.e eVar, int i) {
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: c */
    public void a(bQP.e eVar, int i) {
        InterfaceC4467bf<bQV, bQP.e> interfaceC4467bf = this.b;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, eVar, i);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: a */
    public void e(bQP.e eVar) {
        super.b((bQV) eVar);
        InterfaceC4414be<bQV, bQP.e> interfaceC4414be = this.c;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, eVar);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public void c(int i, bQP.e eVar) {
        InterfaceC4732bk<bQV, bQP.e> interfaceC4732bk = this.h;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, eVar, i);
        }
        super.a(i, (int) eVar);
    }

    @Override // o.AbstractC3336ax
    /* renamed from: b */
    public void d(float f, float f2, int i, int i2, bQP.e eVar) {
        InterfaceC4573bh<bQV, bQP.e> interfaceC4573bh = this.d;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, eVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, eVar);
    }

    @Override // o.bQR
    /* renamed from: e */
    public bQV c(CharSequence charSequence) {
        h();
        super.B_(charSequence);
        return this;
    }

    @Override // o.bQR
    /* renamed from: c */
    public bQV a(String str) {
        h();
        super.d(str);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: a */
    public bQV e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.bQR
    /* renamed from: d */
    public bQV b(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: b */
    public bQV a(int i) {
        super.a(i);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: d */
    public bQV a(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: e */
    public bQP.e b(ViewParent viewParent) {
        return new bQP.e();
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof bQV) && super.equals(obj)) {
            bQV bqv = (bQV) obj;
            if ((this.b == null) != (bqv.b == null)) {
                return false;
            }
            if ((this.c == null) != (bqv.c == null)) {
                return false;
            }
            if ((this.h == null) != (bqv.h == null)) {
                return false;
            }
            if ((this.d == null) != (bqv.d == null)) {
                return false;
            }
            if (n() == null ? bqv.n() == null : n().equals(bqv.n())) {
                return i() == null ? bqv.i() == null : i().equals(bqv.i());
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
        int i3 = this.h != null ? 1 : 0;
        int i4 = this.d == null ? 0 : 1;
        return (((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + (n() != null ? n().hashCode() : 0)) * 31) + (i() != null ? i().hashCode() : 0);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "IdentityProfileImageModel_{name=" + ((Object) n()) + ", avatarImageUrl=" + i() + "}" + super.toString();
    }
}
