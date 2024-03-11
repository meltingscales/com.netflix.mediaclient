package o;

import android.view.ViewParent;
import o.AbstractC3073as;
import o.bLS;

/* loaded from: classes4.dex */
public class bLQ extends bLS implements InterfaceC1673aK<bLS.a>, bLO {
    private InterfaceC4467bf<bLQ, bLS.a> b;
    private InterfaceC4414be<bLQ, bLS.a> f;
    private InterfaceC4573bh<bLQ, bLS.a> h;
    private InterfaceC4732bk<bLQ, bLS.a> i;

    @Override // o.InterfaceC1673aK
    public void e(C1511aE c1511aE, bLS.a aVar, int i) {
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: d */
    public void a(bLS.a aVar, int i) {
        InterfaceC4467bf<bLQ, bLS.a> interfaceC4467bf = this.b;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, aVar, i);
        }
    }

    @Override // o.bLS, o.bLN, o.AbstractC3336ax, o.AbstractC3073as
    public void e(bLS.a aVar) {
        super.e(aVar);
        InterfaceC4414be<bLQ, bLS.a> interfaceC4414be = this.f;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, aVar);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: e */
    public void c(int i, bLS.a aVar) {
        InterfaceC4732bk<bLQ, bLS.a> interfaceC4732bk = this.i;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, aVar, i);
        }
        super.a(i, (int) aVar);
    }

    @Override // o.AbstractC3336ax
    /* renamed from: e */
    public void d(float f, float f2, int i, int i2, bLS.a aVar) {
        InterfaceC4573bh<bLQ, bLS.a> interfaceC4573bh = this.h;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, aVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, aVar);
    }

    @Override // o.bLO
    /* renamed from: b */
    public bLQ a(SX sx) {
        h();
        super.a_(sx);
        return this;
    }

    @Override // o.bLO
    /* renamed from: b */
    public bLQ a(long j) {
        h();
        super.d(j);
        return this;
    }

    @Override // o.bLO
    /* renamed from: b */
    public bLQ a(bLZ blz) {
        h();
        super.c(blz);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: c */
    public bLQ e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.bLO
    /* renamed from: c */
    public bLQ b(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: c */
    public bLQ a(int i) {
        super.a(i);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: e */
    public bLQ a(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: e */
    public bLS.a b(ViewParent viewParent) {
        return new bLS.a();
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof bLQ) && super.equals(obj)) {
            bLQ blq = (bLQ) obj;
            if ((this.b == null) != (blq.b == null)) {
                return false;
            }
            if ((this.f == null) != (blq.f == null)) {
                return false;
            }
            if ((this.i == null) != (blq.i == null)) {
                return false;
            }
            if ((this.h == null) != (blq.h == null)) {
                return false;
            }
            if (o() == null ? blq.o() == null : o().equals(blq.o())) {
                if (k() != blq.k()) {
                    return false;
                }
                return (n() == null) == (blq.n() == null);
            }
            return false;
        }
        return false;
    }

    @Override // o.AbstractC3073as
    public int hashCode() {
        int hashCode = super.hashCode();
        int i = this.b != null ? 1 : 0;
        int i2 = this.f != null ? 1 : 0;
        int i3 = this.i != null ? 1 : 0;
        int i4 = this.h != null ? 1 : 0;
        int hashCode2 = o() != null ? o().hashCode() : 0;
        return (((((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + hashCode2) * 31) + ((int) (k() ^ (k() >>> 32)))) * 31) + (n() != null ? 1 : 0);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "TinyMaturityRatingModel_{ratingData=" + o() + ", delayBeforeHidingInMS=" + k() + ", playerSimpleStatusListenerManager=" + n() + "}" + super.toString();
    }
}
