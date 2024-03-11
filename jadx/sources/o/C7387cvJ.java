package o;

import android.view.ViewParent;
import o.AbstractC3073as;
import o.AbstractC7383cvF;

/* renamed from: o.cvJ  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C7387cvJ extends AbstractC7383cvF implements InterfaceC1673aK<AbstractC7383cvF.a>, InterfaceC7382cvE {
    private InterfaceC4414be<C7387cvJ, AbstractC7383cvF.a> b;
    private InterfaceC4467bf<C7387cvJ, AbstractC7383cvF.a> c;
    private InterfaceC4573bh<C7387cvJ, AbstractC7383cvF.a> d;
    private InterfaceC4732bk<C7387cvJ, AbstractC7383cvF.a> i;

    @Override // o.InterfaceC1673aK
    /* renamed from: d */
    public void e(C1511aE c1511aE, AbstractC7383cvF.a aVar, int i) {
    }

    @Override // o.InterfaceC1673aK
    public void a(AbstractC7383cvF.a aVar, int i) {
        InterfaceC4467bf<C7387cvJ, AbstractC7383cvF.a> interfaceC4467bf = this.c;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, aVar, i);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: c */
    public void e(AbstractC7383cvF.a aVar) {
        super.b((C7387cvJ) aVar);
        InterfaceC4414be<C7387cvJ, AbstractC7383cvF.a> interfaceC4414be = this.b;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, aVar);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: e */
    public void c(int i, AbstractC7383cvF.a aVar) {
        InterfaceC4732bk<C7387cvJ, AbstractC7383cvF.a> interfaceC4732bk = this.i;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, aVar, i);
        }
        super.a(i, (int) aVar);
    }

    @Override // o.AbstractC3336ax
    /* renamed from: e */
    public void d(float f, float f2, int i, int i2, AbstractC7383cvF.a aVar) {
        InterfaceC4573bh<C7387cvJ, AbstractC7383cvF.a> interfaceC4573bh = this.d;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, aVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, aVar);
    }

    @Override // o.InterfaceC7382cvE
    /* renamed from: j */
    public C7387cvJ c(CharSequence charSequence) {
        h();
        super.e(charSequence);
        return this;
    }

    @Override // o.InterfaceC7382cvE
    /* renamed from: d */
    public C7387cvJ e(String str) {
        h();
        super.ab_(str);
        return this;
    }

    @Override // o.InterfaceC7382cvE
    /* renamed from: a */
    public C7387cvJ d(float f) {
        h();
        super.a_(f);
        return this;
    }

    @Override // o.InterfaceC7382cvE
    /* renamed from: h */
    public C7387cvJ a(boolean z) {
        h();
        super.B_(z);
        return this;
    }

    @Override // o.InterfaceC7382cvE
    /* renamed from: f */
    public C7387cvJ d(boolean z) {
        h();
        super.A_(z);
        return this;
    }

    @Override // o.InterfaceC7382cvE
    /* renamed from: c */
    public C7387cvJ e(boolean z) {
        h();
        super.b(z);
        return this;
    }

    @Override // o.InterfaceC7382cvE
    /* renamed from: a */
    public C7387cvJ b(AbstractC7383cvF.c cVar) {
        h();
        super.c(cVar);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: c */
    public C7387cvJ e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.InterfaceC7382cvE
    /* renamed from: d */
    public C7387cvJ b(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: e */
    public C7387cvJ a(int i) {
        super.a(i);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: e */
    public C7387cvJ a(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: a */
    public AbstractC7383cvF.a b(ViewParent viewParent) {
        return new AbstractC7383cvF.a();
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C7387cvJ) && super.equals(obj)) {
            C7387cvJ c7387cvJ = (C7387cvJ) obj;
            if ((this.c == null) != (c7387cvJ.c == null)) {
                return false;
            }
            if ((this.b == null) != (c7387cvJ.b == null)) {
                return false;
            }
            if ((this.i == null) != (c7387cvJ.i == null)) {
                return false;
            }
            if ((this.d == null) != (c7387cvJ.d == null)) {
                return false;
            }
            if (n() == null ? c7387cvJ.n() == null : n().equals(c7387cvJ.n())) {
                if (q() == null ? c7387cvJ.q() == null : q().equals(c7387cvJ.q())) {
                    if (Float.compare(c7387cvJ.l(), l()) == 0 && m() == c7387cvJ.m() && o() == c7387cvJ.o() && i() == c7387cvJ.i()) {
                        return (k() == null) == (c7387cvJ.k() == null);
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
        int i = this.c != null ? 1 : 0;
        int i2 = this.b != null ? 1 : 0;
        int i3 = this.i != null ? 1 : 0;
        int i4 = this.d != null ? 1 : 0;
        int hashCode2 = n() != null ? n().hashCode() : 0;
        int hashCode3 = q() != null ? q().hashCode() : 0;
        return (((((((((((((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + hashCode2) * 31) + hashCode3) * 31) + (l() != 0.0f ? Float.floatToIntBits(l()) : 0)) * 31) + (m() ? 1 : 0)) * 31) + (o() ? 1 : 0)) * 31) + (i() ? 1 : 0)) * 31) + (k() != null ? 1 : 0);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "DownloadedForYouProfileView_{name=" + ((Object) n()) + ", url=" + q() + ", amount=" + l() + ", last=" + m() + ", enable=" + o() + ", allowMore=" + i() + ", storageChangedListener=" + k() + "}" + super.toString();
    }
}
