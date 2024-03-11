package o;

import android.view.ViewParent;
import com.netflix.mediaclient.ui.mdx.CastState;
import o.AbstractC3073as;
import o.AbstractC6570cfm;

/* renamed from: o.cfp  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6573cfp extends AbstractC6570cfm implements InterfaceC1673aK<AbstractC6570cfm.c>, InterfaceC6569cfl {
    private InterfaceC4467bf<C6573cfp, AbstractC6570cfm.c> b;
    private InterfaceC4573bh<C6573cfp, AbstractC6570cfm.c> c;
    private InterfaceC4414be<C6573cfp, AbstractC6570cfm.c> d;
    private InterfaceC4732bk<C6573cfp, AbstractC6570cfm.c> f;

    @Override // o.InterfaceC1673aK
    public void e(C1511aE c1511aE, AbstractC6570cfm.c cVar, int i) {
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: c */
    public void a(AbstractC6570cfm.c cVar, int i) {
        InterfaceC4467bf<C6573cfp, AbstractC6570cfm.c> interfaceC4467bf = this.b;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, cVar, i);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: a */
    public void e(AbstractC6570cfm.c cVar) {
        super.b((C6573cfp) cVar);
        InterfaceC4414be<C6573cfp, AbstractC6570cfm.c> interfaceC4414be = this.d;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, cVar);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: b */
    public void c(int i, AbstractC6570cfm.c cVar) {
        InterfaceC4732bk<C6573cfp, AbstractC6570cfm.c> interfaceC4732bk = this.f;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, cVar, i);
        }
        super.a(i, (int) cVar);
    }

    @Override // o.AbstractC3336ax
    public void d(float f, float f2, int i, int i2, AbstractC6570cfm.c cVar) {
        InterfaceC4573bh<C6573cfp, AbstractC6570cfm.c> interfaceC4573bh = this.c;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, cVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, (int) cVar);
    }

    @Override // o.InterfaceC6569cfl
    /* renamed from: b */
    public C6573cfp e(CastState castState) {
        h();
        super.c(castState);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: a */
    public C6573cfp e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.InterfaceC6569cfl
    /* renamed from: e */
    public C6573cfp d(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: e */
    public C6573cfp a(int i) {
        super.a(i);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: b */
    public C6573cfp a(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: e */
    public AbstractC6570cfm.c b(ViewParent viewParent) {
        return new AbstractC6570cfm.c();
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C6573cfp) && super.equals(obj)) {
            C6573cfp c6573cfp = (C6573cfp) obj;
            if ((this.b == null) != (c6573cfp.b == null)) {
                return false;
            }
            if ((this.d == null) != (c6573cfp.d == null)) {
                return false;
            }
            if ((this.f == null) != (c6573cfp.f == null)) {
                return false;
            }
            if ((this.c == null) != (c6573cfp.c == null)) {
                return false;
            }
            return i() == null ? c6573cfp.i() == null : i().equals(c6573cfp.i());
        }
        return false;
    }

    @Override // o.AbstractC3073as
    public int hashCode() {
        int hashCode = super.hashCode();
        int i = this.b != null ? 1 : 0;
        int i2 = this.d != null ? 1 : 0;
        int i3 = this.f != null ? 1 : 0;
        return (((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + (this.c == null ? 0 : 1)) * 31) + (i() != null ? i().hashCode() : 0);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "CastSheetTitleModel_{castState=" + i() + "}" + super.toString();
    }
}
