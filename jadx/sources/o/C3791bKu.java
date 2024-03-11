package o;

import android.view.ViewParent;
import o.AbstractC3073as;
import o.AbstractC3789bKs;
import o.C1208Sv;

/* renamed from: o.bKu  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C3791bKu extends AbstractC3789bKs implements InterfaceC1673aK<AbstractC3789bKs.c>, InterfaceC3788bKr {
    private InterfaceC4467bf<C3791bKu, AbstractC3789bKs.c> b;
    private InterfaceC4573bh<C3791bKu, AbstractC3789bKs.c> c;
    private InterfaceC4414be<C3791bKu, AbstractC3789bKs.c> d;
    private InterfaceC4732bk<C3791bKu, AbstractC3789bKs.c> f;

    @Override // o.InterfaceC1673aK
    public void e(C1511aE c1511aE, AbstractC3789bKs.c cVar, int i) {
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: e */
    public void a(AbstractC3789bKs.c cVar, int i) {
        InterfaceC4467bf<C3791bKu, AbstractC3789bKs.c> interfaceC4467bf = this.b;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, cVar, i);
        }
    }

    @Override // o.AbstractC3789bKs, o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: d */
    public void e(AbstractC3789bKs.c cVar) {
        super.e(cVar);
        InterfaceC4414be<C3791bKu, AbstractC3789bKs.c> interfaceC4414be = this.d;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, cVar);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: e */
    public void c(int i, AbstractC3789bKs.c cVar) {
        InterfaceC4732bk<C3791bKu, AbstractC3789bKs.c> interfaceC4732bk = this.f;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, cVar, i);
        }
        super.a(i, (int) cVar);
    }

    @Override // o.AbstractC3336ax
    /* renamed from: a */
    public void d(float f, float f2, int i, int i2, AbstractC3789bKs.c cVar) {
        InterfaceC4573bh<C3791bKu, AbstractC3789bKs.c> interfaceC4573bh = this.c;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, cVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, cVar);
    }

    @Override // o.InterfaceC3788bKr
    /* renamed from: b */
    public C3791bKu c(C1208Sv.d dVar) {
        h();
        super.e(dVar);
        return this;
    }

    @Override // o.InterfaceC3788bKr
    /* renamed from: e */
    public C3791bKu d(String str) {
        h();
        super.c(str);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: a */
    public C3791bKu e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.InterfaceC3788bKr
    /* renamed from: b */
    public C3791bKu d(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.InterfaceC3788bKr
    /* renamed from: c */
    public C3791bKu e(int i) {
        super.a(i);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: e */
    public C3791bKu a(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: d */
    public AbstractC3789bKs.c b(ViewParent viewParent) {
        return new AbstractC3789bKs.c();
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C3791bKu) && super.equals(obj)) {
            C3791bKu c3791bKu = (C3791bKu) obj;
            if ((this.b == null) != (c3791bKu.b == null)) {
                return false;
            }
            if ((this.d == null) != (c3791bKu.d == null)) {
                return false;
            }
            if ((this.f == null) != (c3791bKu.f == null)) {
                return false;
            }
            if ((this.c == null) != (c3791bKu.c == null)) {
                return false;
            }
            if ((l() == null) == (c3791bKu.l() == null) && i() == c3791bKu.i()) {
                return k() == null ? c3791bKu.k() == null : k().equals(c3791bKu.k());
            }
            return false;
        }
        return false;
    }

    @Override // o.AbstractC3073as
    public int hashCode() {
        int hashCode = super.hashCode();
        int i = this.b != null ? 1 : 0;
        int i2 = this.d != null ? 1 : 0;
        int i3 = this.f != null ? 1 : 0;
        int i4 = this.c != null ? 1 : 0;
        return (((((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + (l() == null ? 0 : 1)) * 31) + (i() ? 1 : 0)) * 31) + (k() != null ? k().hashCode() : 0);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "PinEntryModel_{pinChangeListener=" + l() + ", dark=" + i() + ", overridePin=" + k() + "}" + super.toString();
    }
}
