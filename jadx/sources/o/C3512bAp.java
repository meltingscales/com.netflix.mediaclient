package o;

import android.view.ViewParent;
import o.AbstractC3073as;
import o.AbstractC3513bAq;

/* renamed from: o.bAp  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C3512bAp extends AbstractC3513bAq implements InterfaceC1673aK<AbstractC3513bAq.d>, InterfaceC3511bAo {
    private InterfaceC4467bf<C3512bAp, AbstractC3513bAq.d> b;
    private InterfaceC4573bh<C3512bAp, AbstractC3513bAq.d> c;
    private InterfaceC4414be<C3512bAp, AbstractC3513bAq.d> d;
    private InterfaceC4732bk<C3512bAp, AbstractC3513bAq.d> g;

    @Override // o.InterfaceC1673aK
    /* renamed from: c */
    public void e(C1511aE c1511aE, AbstractC3513bAq.d dVar, int i) {
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: c */
    public void a(AbstractC3513bAq.d dVar, int i) {
        InterfaceC4467bf<C3512bAp, AbstractC3513bAq.d> interfaceC4467bf = this.b;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, dVar, i);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: c */
    public void e(AbstractC3513bAq.d dVar) {
        super.b((C3512bAp) dVar);
        InterfaceC4414be<C3512bAp, AbstractC3513bAq.d> interfaceC4414be = this.d;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, dVar);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: d */
    public void c(int i, AbstractC3513bAq.d dVar) {
        InterfaceC4732bk<C3512bAp, AbstractC3513bAq.d> interfaceC4732bk = this.g;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, dVar, i);
        }
        super.a(i, (int) dVar);
    }

    @Override // o.AbstractC3336ax
    /* renamed from: c */
    public void d(float f, float f2, int i, int i2, AbstractC3513bAq.d dVar) {
        InterfaceC4573bh<C3512bAp, AbstractC3513bAq.d> interfaceC4573bh = this.c;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, dVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, dVar);
    }

    @Override // o.InterfaceC3511bAo
    /* renamed from: d */
    public C3512bAp e(CharSequence charSequence) {
        h();
        super.b_(charSequence);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: b */
    public C3512bAp e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.InterfaceC3511bAo
    /* renamed from: c */
    public C3512bAp b(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: d */
    public C3512bAp a(int i) {
        super.a(i);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: b */
    public C3512bAp a(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: e */
    public AbstractC3513bAq.d b(ViewParent viewParent) {
        return new AbstractC3513bAq.d();
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C3512bAp) && super.equals(obj)) {
            C3512bAp c3512bAp = (C3512bAp) obj;
            if ((this.b == null) != (c3512bAp.b == null)) {
                return false;
            }
            if ((this.d == null) != (c3512bAp.d == null)) {
                return false;
            }
            if ((this.g == null) != (c3512bAp.g == null)) {
                return false;
            }
            if ((this.c == null) != (c3512bAp.c == null)) {
                return false;
            }
            return i() == null ? c3512bAp.i() == null : i().equals(c3512bAp.i());
        }
        return false;
    }

    @Override // o.AbstractC3073as
    public int hashCode() {
        int hashCode = super.hashCode();
        int i = this.b != null ? 1 : 0;
        int i2 = this.d != null ? 1 : 0;
        int i3 = this.g != null ? 1 : 0;
        return (((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + (this.c == null ? 0 : 1)) * 31) + (i() != null ? i().hashCode() : 0);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "HeaderModel_{text=" + ((Object) i()) + "}" + super.toString();
    }
}
