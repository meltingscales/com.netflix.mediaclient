package o;

import android.view.ViewParent;
import o.AbstractC3073as;
import o.bIM;

/* loaded from: classes4.dex */
public class bIT extends bIM implements InterfaceC1673aK<bIM.c> {
    private InterfaceC4467bf<bIT, bIM.c> b;
    private InterfaceC4573bh<bIT, bIM.c> c;
    private InterfaceC4414be<bIT, bIM.c> d;
    private InterfaceC4732bk<bIT, bIM.c> h;

    @Override // o.InterfaceC1673aK
    /* renamed from: c */
    public void e(C1511aE c1511aE, bIM.c cVar, int i) {
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: d */
    public void a(bIM.c cVar, int i) {
        InterfaceC4467bf<bIT, bIM.c> interfaceC4467bf = this.b;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, cVar, i);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: c */
    public void e(bIM.c cVar) {
        super.b((bIT) cVar);
        InterfaceC4414be<bIT, bIM.c> interfaceC4414be = this.d;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, cVar);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: b */
    public void c(int i, bIM.c cVar) {
        InterfaceC4732bk<bIT, bIM.c> interfaceC4732bk = this.h;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, cVar, i);
        }
        super.a(i, (int) cVar);
    }

    @Override // o.AbstractC3336ax
    public void d(float f, float f2, int i, int i2, bIM.c cVar) {
        InterfaceC4573bh<bIT, bIM.c> interfaceC4573bh = this.c;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, cVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, (int) cVar);
    }

    public bIT e(InterfaceC5198buI interfaceC5198buI) {
        h();
        super.d(interfaceC5198buI);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: b */
    public bIT e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: c */
    public bIT a(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: c */
    public bIT a(int i) {
        super.a(i);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: c */
    public bIT a(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: a */
    public bIM.c b(ViewParent viewParent) {
        return new bIM.c();
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof bIT) && super.equals(obj)) {
            bIT bit = (bIT) obj;
            if ((this.b == null) != (bit.b == null)) {
                return false;
            }
            if ((this.d == null) != (bit.d == null)) {
                return false;
            }
            if ((this.h == null) != (bit.h == null)) {
                return false;
            }
            if ((this.c == null) != (bit.c == null)) {
                return false;
            }
            return (i() == null) == (bit.i() == null);
        }
        return false;
    }

    @Override // o.AbstractC3073as
    public int hashCode() {
        int hashCode = super.hashCode();
        int i = this.b != null ? 1 : 0;
        int i2 = this.d != null ? 1 : 0;
        int i3 = this.h != null ? 1 : 0;
        return (((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + (this.c != null ? 1 : 0)) * 31) + (i() == null ? 0 : 1);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "MaturityRatingModel_{videoDetails=" + i() + "}" + super.toString();
    }
}
