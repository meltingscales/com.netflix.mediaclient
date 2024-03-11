package o;

import android.view.ViewParent;
import o.AbstractC3073as;
import o.cWB;

/* renamed from: o.cWy  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C6183cWy extends cWB implements InterfaceC1673aK<cWB.c>, InterfaceC6182cWx {
    private InterfaceC4414be<C6183cWy, cWB.c> b;
    private InterfaceC4573bh<C6183cWy, cWB.c> c;
    private InterfaceC4467bf<C6183cWy, cWB.c> d;
    private InterfaceC4732bk<C6183cWy, cWB.c> h;

    @Override // o.InterfaceC1673aK
    /* renamed from: b */
    public void e(C1511aE c1511aE, cWB.c cVar, int i) {
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: c */
    public void a(cWB.c cVar, int i) {
        InterfaceC4467bf<C6183cWy, cWB.c> interfaceC4467bf = this.d;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, cVar, i);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: d */
    public void e(cWB.c cVar) {
        super.b((C6183cWy) cVar);
        InterfaceC4414be<C6183cWy, cWB.c> interfaceC4414be = this.b;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, cVar);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    public void c(int i, cWB.c cVar) {
        InterfaceC4732bk<C6183cWy, cWB.c> interfaceC4732bk = this.h;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, cVar, i);
        }
        super.a(i, (int) cVar);
    }

    @Override // o.AbstractC3336ax
    public void d(float f, float f2, int i, int i2, cWB.c cVar) {
        InterfaceC4573bh<C6183cWy, cWB.c> interfaceC4573bh = this.c;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, cVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, (int) cVar);
    }

    @Override // o.InterfaceC6182cWx
    /* renamed from: g */
    public C6183cWy b(CharSequence charSequence) {
        h();
        super.e(charSequence);
        return this;
    }

    @Override // o.InterfaceC6182cWx
    /* renamed from: c */
    public C6183cWy b(int i) {
        h();
        super.e(i);
        return this;
    }

    @Override // o.InterfaceC6182cWx
    /* renamed from: c */
    public C6183cWy a(boolean z) {
        h();
        super.b(z);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: b */
    public C6183cWy e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.InterfaceC6182cWx
    /* renamed from: d */
    public C6183cWy c(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: d */
    public C6183cWy a(int i) {
        super.a(i);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: c */
    public C6183cWy a(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: d */
    public cWB.c b(ViewParent viewParent) {
        return new cWB.c();
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C6183cWy) && super.equals(obj)) {
            C6183cWy c6183cWy = (C6183cWy) obj;
            if ((this.d == null) != (c6183cWy.d == null)) {
                return false;
            }
            if ((this.b == null) != (c6183cWy.b == null)) {
                return false;
            }
            if ((this.h == null) != (c6183cWy.h == null)) {
                return false;
            }
            if ((this.c == null) != (c6183cWy.c == null)) {
                return false;
            }
            if (m() == null ? c6183cWy.m() == null : m().equals(c6183cWy.m())) {
                return o() == c6183cWy.o() && i() == c6183cWy.i();
            }
            return false;
        }
        return false;
    }

    @Override // o.AbstractC3073as
    public int hashCode() {
        int hashCode = super.hashCode();
        int i = this.d != null ? 1 : 0;
        int i2 = this.b != null ? 1 : 0;
        int i3 = this.h != null ? 1 : 0;
        return (((((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + (this.c == null ? 0 : 1)) * 31) + (m() != null ? m().hashCode() : 0)) * 31) + o()) * 31) + (i() ? 1 : 0);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "TextModel_{text=" + ((Object) m()) + ", minHeight=" + o() + ", dark=" + i() + "}" + super.toString();
    }
}
