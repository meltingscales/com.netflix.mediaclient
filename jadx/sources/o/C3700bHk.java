package o;

import android.view.View;
import android.view.ViewParent;
import o.AbstractC3073as;
import o.AbstractC3702bHm;

/* renamed from: o.bHk  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C3700bHk extends AbstractC3702bHm implements InterfaceC1673aK<AbstractC3702bHm.e>, InterfaceC3699bHj {
    private InterfaceC4467bf<C3700bHk, AbstractC3702bHm.e> b;
    private InterfaceC4414be<C3700bHk, AbstractC3702bHm.e> c;
    private InterfaceC4573bh<C3700bHk, AbstractC3702bHm.e> d;
    private InterfaceC4732bk<C3700bHk, AbstractC3702bHm.e> j;

    @Override // o.InterfaceC1673aK
    /* renamed from: a */
    public void e(C1511aE c1511aE, AbstractC3702bHm.e eVar, int i) {
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: b */
    public void a(AbstractC3702bHm.e eVar, int i) {
        InterfaceC4467bf<C3700bHk, AbstractC3702bHm.e> interfaceC4467bf = this.b;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, eVar, i);
        }
    }

    @Override // o.AbstractC3702bHm, o.AbstractC3336ax, o.AbstractC3073as
    public void e(AbstractC3702bHm.e eVar) {
        super.e(eVar);
        InterfaceC4414be<C3700bHk, AbstractC3702bHm.e> interfaceC4414be = this.c;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, eVar);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: d */
    public void c(int i, AbstractC3702bHm.e eVar) {
        InterfaceC4732bk<C3700bHk, AbstractC3702bHm.e> interfaceC4732bk = this.j;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, eVar, i);
        }
        super.a(i, (int) eVar);
    }

    @Override // o.AbstractC3336ax
    /* renamed from: e */
    public void d(float f, float f2, int i, int i2, AbstractC3702bHm.e eVar) {
        InterfaceC4573bh<C3700bHk, AbstractC3702bHm.e> interfaceC4573bh = this.d;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, eVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, eVar);
    }

    @Override // o.InterfaceC3699bHj
    /* renamed from: g */
    public C3700bHk d(CharSequence charSequence) {
        h();
        super.l_(charSequence);
        return this;
    }

    @Override // o.InterfaceC3699bHj
    /* renamed from: e */
    public C3700bHk c(Integer num) {
        h();
        super.b(num);
        return this;
    }

    @Override // o.InterfaceC3699bHj
    /* renamed from: a */
    public C3700bHk d(Integer num) {
        h();
        super.e_(num);
        return this;
    }

    @Override // o.InterfaceC3699bHj
    /* renamed from: b */
    public C3700bHk c(CharSequence charSequence) {
        h();
        super.k_(charSequence);
        return this;
    }

    @Override // o.InterfaceC3699bHj
    /* renamed from: e */
    public C3700bHk b(View.OnClickListener onClickListener) {
        h();
        super.c(onClickListener);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: d */
    public C3700bHk e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.InterfaceC3699bHj
    /* renamed from: j */
    public C3700bHk e(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: e */
    public C3700bHk a(int i) {
        super.a(i);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: c */
    public C3700bHk a(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: d */
    public AbstractC3702bHm.e b(ViewParent viewParent) {
        return new AbstractC3702bHm.e();
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C3700bHk) && super.equals(obj)) {
            C3700bHk c3700bHk = (C3700bHk) obj;
            if ((this.b == null) != (c3700bHk.b == null)) {
                return false;
            }
            if ((this.c == null) != (c3700bHk.c == null)) {
                return false;
            }
            if ((this.j == null) != (c3700bHk.j == null)) {
                return false;
            }
            if ((this.d == null) != (c3700bHk.d == null)) {
                return false;
            }
            if (r() == null ? c3700bHk.r() == null : r().equals(c3700bHk.r())) {
                if (m() == null ? c3700bHk.m() == null : m().equals(c3700bHk.m())) {
                    if (k() == c3700bHk.k() && n() == c3700bHk.n()) {
                        if (l() == null ? c3700bHk.l() == null : l().equals(c3700bHk.l())) {
                            if (i() == null ? c3700bHk.i() == null : i().equals(c3700bHk.i())) {
                                return (o() == null) == (c3700bHk.o() == null);
                            }
                            return false;
                        }
                        return false;
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
        int i = this.b != null ? 1 : 0;
        int i2 = this.c != null ? 1 : 0;
        int i3 = this.j != null ? 1 : 0;
        int i4 = this.d != null ? 1 : 0;
        int hashCode2 = r() != null ? r().hashCode() : 0;
        int hashCode3 = m() != null ? m().hashCode() : 0;
        int k = k();
        int n = n();
        int hashCode4 = l() != null ? l().hashCode() : 0;
        return (((((((((((((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + hashCode2) * 31) + hashCode3) * 31) + k) * 31) + n) * 31) + hashCode4) * 31) + (i() != null ? i().hashCode() : 0)) * 31) + (o() != null ? 1 : 0);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "DpTextSecondaryMicroModel_{text=" + ((Object) r()) + ", horizontalMargin=" + m() + ", paddingTop=" + k() + ", paddingBottom=" + n() + ", maxLines=" + l() + ", clickActivationPhrase=" + ((Object) i()) + ", clickListener=" + o() + "}" + super.toString();
    }
}
