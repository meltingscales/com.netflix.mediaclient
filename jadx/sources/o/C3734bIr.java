package o;

import android.view.View;
import android.view.ViewParent;
import o.AbstractC3073as;
import o.AbstractC3736bIt;

/* renamed from: o.bIr  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C3734bIr extends AbstractC3736bIt implements InterfaceC1673aK<AbstractC3736bIt.e>, InterfaceC3733bIq {
    private InterfaceC4467bf<C3734bIr, AbstractC3736bIt.e> b;
    private InterfaceC4414be<C3734bIr, AbstractC3736bIt.e> c;
    private InterfaceC4573bh<C3734bIr, AbstractC3736bIt.e> d;
    private InterfaceC4732bk<C3734bIr, AbstractC3736bIt.e> j;

    @Override // o.InterfaceC1673aK
    /* renamed from: c */
    public void e(C1511aE c1511aE, AbstractC3736bIt.e eVar, int i) {
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: d */
    public void a(AbstractC3736bIt.e eVar, int i) {
        InterfaceC4467bf<C3734bIr, AbstractC3736bIt.e> interfaceC4467bf = this.b;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, eVar, i);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: c */
    public void e(AbstractC3736bIt.e eVar) {
        super.b((C3734bIr) eVar);
        InterfaceC4414be<C3734bIr, AbstractC3736bIt.e> interfaceC4414be = this.c;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, eVar);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    public void c(int i, AbstractC3736bIt.e eVar) {
        InterfaceC4732bk<C3734bIr, AbstractC3736bIt.e> interfaceC4732bk = this.j;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, eVar, i);
        }
        super.a(i, (int) eVar);
    }

    @Override // o.AbstractC3336ax
    /* renamed from: e */
    public void d(float f, float f2, int i, int i2, AbstractC3736bIt.e eVar) {
        InterfaceC4573bh<C3734bIr, AbstractC3736bIt.e> interfaceC4573bh = this.d;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, eVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, eVar);
    }

    @Override // o.InterfaceC3733bIq
    /* renamed from: j */
    public C3734bIr d(CharSequence charSequence) {
        h();
        super.n_(charSequence);
        return this;
    }

    @Override // o.InterfaceC3733bIq
    /* renamed from: c */
    public C3734bIr b(CharSequence charSequence) {
        h();
        super.m_(charSequence);
        return this;
    }

    @Override // o.InterfaceC3733bIq
    /* renamed from: c */
    public C3734bIr d(String str) {
        h();
        super.j_(str);
        return this;
    }

    @Override // o.InterfaceC3733bIq
    /* renamed from: e */
    public C3734bIr b(View.OnClickListener onClickListener) {
        h();
        super.d(onClickListener);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: b */
    public C3734bIr e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.InterfaceC3733bIq
    /* renamed from: g */
    public C3734bIr e(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: d */
    public C3734bIr a(int i) {
        super.a(i);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: b */
    public C3734bIr a(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: c */
    public AbstractC3736bIt.e b(ViewParent viewParent) {
        return new AbstractC3736bIt.e();
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C3734bIr) && super.equals(obj)) {
            C3734bIr c3734bIr = (C3734bIr) obj;
            if ((this.b == null) != (c3734bIr.b == null)) {
                return false;
            }
            if ((this.c == null) != (c3734bIr.c == null)) {
                return false;
            }
            if ((this.j == null) != (c3734bIr.j == null)) {
                return false;
            }
            if ((this.d == null) != (c3734bIr.d == null)) {
                return false;
            }
            if (k() == null ? c3734bIr.k() == null : k().equals(c3734bIr.k())) {
                if (i() == null ? c3734bIr.i() == null : i().equals(c3734bIr.i())) {
                    if (m() == null ? c3734bIr.m() == null : m().equals(c3734bIr.m())) {
                        return (n() == null) == (c3734bIr.n() == null);
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
        int hashCode2 = k() != null ? k().hashCode() : 0;
        int hashCode3 = i() != null ? i().hashCode() : 0;
        return (((((((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + hashCode2) * 31) + hashCode3) * 31) + (m() != null ? m().hashCode() : 0)) * 31) + (n() != null ? 1 : 0);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "FullDpTrailerModel_{title=" + ((Object) k()) + ", accessibilityLabel=" + ((Object) i()) + ", imageUrl=" + m() + ", onClick=" + n() + "}" + super.toString();
    }
}
