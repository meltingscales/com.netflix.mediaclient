package o;

import android.view.ViewParent;
import o.AbstractC3073as;
import o.AbstractC3735bIs;

/* renamed from: o.bIz  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C3742bIz extends AbstractC3735bIs implements InterfaceC1673aK<AbstractC3735bIs.b>, InterfaceC3737bIu {
    private InterfaceC4467bf<C3742bIz, AbstractC3735bIs.b> b;
    private InterfaceC4414be<C3742bIz, AbstractC3735bIs.b> c;
    private InterfaceC4573bh<C3742bIz, AbstractC3735bIs.b> d;
    private InterfaceC4732bk<C3742bIz, AbstractC3735bIs.b> g;

    @Override // o.InterfaceC1673aK
    /* renamed from: a */
    public void e(C1511aE c1511aE, AbstractC3735bIs.b bVar, int i) {
    }

    @Override // o.InterfaceC1673aK
    public void a(AbstractC3735bIs.b bVar, int i) {
        InterfaceC4467bf<C3742bIz, AbstractC3735bIs.b> interfaceC4467bf = this.b;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, bVar, i);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: c */
    public void e(AbstractC3735bIs.b bVar) {
        super.b((C3742bIz) bVar);
        InterfaceC4414be<C3742bIz, AbstractC3735bIs.b> interfaceC4414be = this.c;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, bVar);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public void c(int i, AbstractC3735bIs.b bVar) {
        InterfaceC4732bk<C3742bIz, AbstractC3735bIs.b> interfaceC4732bk = this.g;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, bVar, i);
        }
        super.a(i, (int) bVar);
    }

    @Override // o.AbstractC3336ax
    /* renamed from: b */
    public void d(float f, float f2, int i, int i2, AbstractC3735bIs.b bVar) {
        InterfaceC4573bh<C3742bIz, AbstractC3735bIs.b> interfaceC4573bh = this.d;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, bVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, bVar);
    }

    @Override // o.InterfaceC3737bIu
    /* renamed from: j */
    public C3742bIz c(CharSequence charSequence) {
        h();
        super.q_(charSequence);
        return this;
    }

    @Override // o.InterfaceC3737bIu
    /* renamed from: l */
    public C3742bIz h(CharSequence charSequence) {
        h();
        super.r_(charSequence);
        return this;
    }

    @Override // o.InterfaceC3737bIu
    /* renamed from: f */
    public C3742bIz b(CharSequence charSequence) {
        h();
        super.p_(charSequence);
        return this;
    }

    @Override // o.InterfaceC3737bIu
    /* renamed from: b */
    public C3742bIz d(float f) {
        h();
        super.a(f);
        return this;
    }

    @Override // o.InterfaceC3737bIu
    /* renamed from: g */
    public C3742bIz e(CharSequence charSequence) {
        h();
        super.o_(charSequence);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: a */
    public C3742bIz e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.InterfaceC3737bIu
    /* renamed from: i */
    public C3742bIz d(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: d */
    public C3742bIz a(int i) {
        super.a(i);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: d */
    public C3742bIz a(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: c */
    public AbstractC3735bIs.b b(ViewParent viewParent) {
        return new AbstractC3735bIs.b();
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C3742bIz) && super.equals(obj)) {
            C3742bIz c3742bIz = (C3742bIz) obj;
            if ((this.b == null) != (c3742bIz.b == null)) {
                return false;
            }
            if ((this.c == null) != (c3742bIz.c == null)) {
                return false;
            }
            if ((this.g == null) != (c3742bIz.g == null)) {
                return false;
            }
            if ((this.d == null) != (c3742bIz.d == null)) {
                return false;
            }
            if (l() == null ? c3742bIz.l() == null : l().equals(c3742bIz.l())) {
                if (o() == null ? c3742bIz.o() == null : o().equals(c3742bIz.o())) {
                    if (k() == null ? c3742bIz.k() == null : k().equals(c3742bIz.k())) {
                        if (Float.compare(c3742bIz.n(), n()) != 0) {
                            return false;
                        }
                        return (i() == null) == (c3742bIz.i() == null);
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
        int i3 = this.g != null ? 1 : 0;
        int i4 = this.d != null ? 1 : 0;
        int hashCode2 = l() != null ? l().hashCode() : 0;
        int hashCode3 = o() != null ? o().hashCode() : 0;
        int hashCode4 = k() != null ? k().hashCode() : 0;
        return (((((((((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (n() != 0.0f ? Float.floatToIntBits(n()) : 0)) * 31) + (i() != null ? 1 : 0);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "FullDpVideoBookmarkModel_{title=" + ((Object) l()) + ", titleContentDescription=" + ((Object) o()) + ", timeRemainingText=" + ((Object) k()) + ", progressPercentage=" + n() + ", accessibilityLabel=" + ((Object) i()) + "}" + super.toString();
    }
}
