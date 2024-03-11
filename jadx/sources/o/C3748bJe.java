package o;

import android.view.ViewParent;
import o.AbstractC3073as;
import o.bIZ;

/* renamed from: o.bJe  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C3748bJe extends bIZ implements InterfaceC1673aK<bIZ.d>, InterfaceC3749bJf {
    private InterfaceC4573bh<C3748bJe, bIZ.d> b;
    private InterfaceC4414be<C3748bJe, bIZ.d> c;
    private InterfaceC4467bf<C3748bJe, bIZ.d> d;
    private InterfaceC4732bk<C3748bJe, bIZ.d> i;

    @Override // o.InterfaceC1673aK
    /* renamed from: d */
    public void e(C1511aE c1511aE, bIZ.d dVar, int i) {
    }

    @Override // o.InterfaceC1673aK
    public void a(bIZ.d dVar, int i) {
        InterfaceC4467bf<C3748bJe, bIZ.d> interfaceC4467bf = this.d;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, dVar, i);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: d */
    public void e(bIZ.d dVar) {
        super.b((C3748bJe) dVar);
        InterfaceC4414be<C3748bJe, bIZ.d> interfaceC4414be = this.c;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, dVar);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: d */
    public void c(int i, bIZ.d dVar) {
        InterfaceC4732bk<C3748bJe, bIZ.d> interfaceC4732bk = this.i;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, dVar, i);
        }
        super.a(i, (int) dVar);
    }

    @Override // o.AbstractC3336ax
    /* renamed from: b */
    public void d(float f, float f2, int i, int i2, bIZ.d dVar) {
        InterfaceC4573bh<C3748bJe, bIZ.d> interfaceC4573bh = this.b;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, dVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, dVar);
    }

    @Override // o.AbstractC3073as
    /* renamed from: a */
    public C3748bJe e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.InterfaceC3749bJf
    /* renamed from: c */
    public C3748bJe d(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.InterfaceC3749bJf
    /* renamed from: b */
    public C3748bJe e(int i) {
        super.a(i);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: d */
    public C3748bJe a(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: e */
    public bIZ.d b(ViewParent viewParent) {
        return new bIZ.d();
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C3748bJe) && super.equals(obj)) {
            C3748bJe c3748bJe = (C3748bJe) obj;
            if ((this.d == null) != (c3748bJe.d == null)) {
                return false;
            }
            if ((this.c == null) != (c3748bJe.c == null)) {
                return false;
            }
            if ((this.i == null) != (c3748bJe.i == null)) {
                return false;
            }
            return (this.b == null) == (c3748bJe.b == null) && Float.compare(c3748bJe.i(), i()) == 0;
        }
        return false;
    }

    @Override // o.AbstractC3073as
    public int hashCode() {
        int hashCode = super.hashCode();
        int i = this.d != null ? 1 : 0;
        int i2 = this.c != null ? 1 : 0;
        int i3 = this.i != null ? 1 : 0;
        return (((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + (this.b == null ? 0 : 1)) * 31) + (i() != 0.0f ? Float.floatToIntBits(i()) : 0);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "CarouselModel_{numViewsToShowOnScreen=" + i() + "}" + super.toString();
    }
}
