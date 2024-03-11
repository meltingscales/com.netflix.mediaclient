package o;

import android.view.ViewParent;
import o.AbstractC3073as;
import o.bGY;

/* renamed from: o.bHb  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C3691bHb extends bGY implements InterfaceC1673aK<bGY.d>, bGZ {
    private InterfaceC4467bf<C3691bHb, bGY.d> b;
    private InterfaceC4414be<C3691bHb, bGY.d> c;
    private InterfaceC4573bh<C3691bHb, bGY.d> d;
    private InterfaceC4732bk<C3691bHb, bGY.d> g;

    @Override // o.InterfaceC1673aK
    /* renamed from: a */
    public void e(C1511aE c1511aE, bGY.d dVar, int i) {
    }

    @Override // o.InterfaceC1673aK
    public void a(bGY.d dVar, int i) {
        InterfaceC4467bf<C3691bHb, bGY.d> interfaceC4467bf = this.b;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, dVar, i);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    public void e(bGY.d dVar) {
        super.b((C3691bHb) dVar);
        InterfaceC4414be<C3691bHb, bGY.d> interfaceC4414be = this.c;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, dVar);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public void c(int i, bGY.d dVar) {
        InterfaceC4732bk<C3691bHb, bGY.d> interfaceC4732bk = this.g;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, dVar, i);
        }
        super.a(i, (int) dVar);
    }

    @Override // o.AbstractC3336ax
    /* renamed from: e */
    public void d(float f, float f2, int i, int i2, bGY.d dVar) {
        InterfaceC4573bh<C3691bHb, bGY.d> interfaceC4573bh = this.d;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, dVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, dVar);
    }

    @Override // o.AbstractC3073as
    /* renamed from: a */
    public C3691bHb e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.bGZ
    /* renamed from: d */
    public C3691bHb c(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: b */
    public C3691bHb a(int i) {
        super.a(i);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: d */
    public C3691bHb a(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: d */
    public bGY.d b(ViewParent viewParent) {
        return new bGY.d();
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C3691bHb) && super.equals(obj)) {
            C3691bHb c3691bHb = (C3691bHb) obj;
            if ((this.b == null) != (c3691bHb.b == null)) {
                return false;
            }
            if ((this.c == null) != (c3691bHb.c == null)) {
                return false;
            }
            if ((this.g == null) != (c3691bHb.g == null)) {
                return false;
            }
            return (this.d == null) == (c3691bHb.d == null);
        }
        return false;
    }

    @Override // o.AbstractC3073as
    public int hashCode() {
        int hashCode = super.hashCode();
        int i = this.b != null ? 1 : 0;
        int i2 = this.c != null ? 1 : 0;
        return (((((((hashCode * 31) + i) * 31) + i2) * 31) + (this.g != null ? 1 : 0)) * 31) + (this.d == null ? 0 : 1);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "DpSimsFillerModel_{}" + super.toString();
    }
}
