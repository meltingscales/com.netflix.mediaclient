package o;

import android.view.View;
import android.view.ViewParent;
import o.AbstractC3073as;
import o.AbstractC6959cnD;

/* renamed from: o.cnG  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6962cnG extends AbstractC6959cnD implements InterfaceC1673aK<AbstractC6959cnD.c>, InterfaceC6961cnF {
    private InterfaceC4573bh<C6962cnG, AbstractC6959cnD.c> b;
    private InterfaceC4414be<C6962cnG, AbstractC6959cnD.c> c;
    private InterfaceC4467bf<C6962cnG, AbstractC6959cnD.c> d;
    private InterfaceC4732bk<C6962cnG, AbstractC6959cnD.c> i;

    @Override // o.InterfaceC1673aK
    /* renamed from: a */
    public void e(C1511aE c1511aE, AbstractC6959cnD.c cVar, int i) {
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: e */
    public void a(AbstractC6959cnD.c cVar, int i) {
        InterfaceC4467bf<C6962cnG, AbstractC6959cnD.c> interfaceC4467bf = this.d;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, cVar, i);
        }
    }

    @Override // o.AbstractC6959cnD, o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: d */
    public void e(AbstractC6959cnD.c cVar) {
        super.e(cVar);
        InterfaceC4414be<C6962cnG, AbstractC6959cnD.c> interfaceC4414be = this.c;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, cVar);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public void c(int i, AbstractC6959cnD.c cVar) {
        InterfaceC4732bk<C6962cnG, AbstractC6959cnD.c> interfaceC4732bk = this.i;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, cVar, i);
        }
        super.a(i, (int) cVar);
    }

    @Override // o.AbstractC3336ax
    /* renamed from: c */
    public void d(float f, float f2, int i, int i2, AbstractC6959cnD.c cVar) {
        InterfaceC4573bh<C6962cnG, AbstractC6959cnD.c> interfaceC4573bh = this.b;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, cVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, cVar);
    }

    @Override // o.InterfaceC6961cnF
    /* renamed from: g */
    public C6962cnG c(Integer num) {
        h();
        super.d(num);
        return this;
    }

    @Override // o.InterfaceC6961cnF
    /* renamed from: h */
    public C6962cnG a(Integer num) {
        h();
        super.p_(num);
        return this;
    }

    @Override // o.InterfaceC6961cnF
    /* renamed from: b */
    public C6962cnG e(Integer num) {
        h();
        super.o_(num);
        return this;
    }

    @Override // o.InterfaceC6961cnF
    /* renamed from: c */
    public C6962cnG d(View.OnClickListener onClickListener) {
        h();
        super.b(onClickListener);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: c */
    public C6962cnG e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.InterfaceC6961cnF
    /* renamed from: d */
    public C6962cnG e(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: c */
    public C6962cnG a(int i) {
        super.a(i);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: c */
    public C6962cnG a(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: d */
    public AbstractC6959cnD.c b(ViewParent viewParent) {
        return new AbstractC6959cnD.c();
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C6962cnG) && super.equals(obj)) {
            C6962cnG c6962cnG = (C6962cnG) obj;
            if ((this.d == null) != (c6962cnG.d == null)) {
                return false;
            }
            if ((this.c == null) != (c6962cnG.c == null)) {
                return false;
            }
            if ((this.i == null) != (c6962cnG.i == null)) {
                return false;
            }
            if ((this.b == null) != (c6962cnG.b == null)) {
                return false;
            }
            if (l() == null ? c6962cnG.l() == null : l().equals(c6962cnG.l())) {
                if (o() == null ? c6962cnG.o() == null : o().equals(c6962cnG.o())) {
                    if (m() == null ? c6962cnG.m() == null : m().equals(c6962cnG.m())) {
                        return (i() == null) == (c6962cnG.i() == null);
                    }
                    return false;
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
        int i3 = this.i != null ? 1 : 0;
        int i4 = this.b != null ? 1 : 0;
        int hashCode2 = l() != null ? l().hashCode() : 0;
        int hashCode3 = o() != null ? o().hashCode() : 0;
        return (((((((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + hashCode2) * 31) + hashCode3) * 31) + (m() != null ? m().hashCode() : 0)) * 31) + (i() != null ? 1 : 0);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "MyListEmptyStateModel_{titleRes=" + l() + ", subtitleRes=" + o() + ", buttonTextRes=" + m() + ", buttonClickListener=" + i() + "}" + super.toString();
    }
}
