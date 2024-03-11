package o;

import android.view.ViewParent;
import o.AbstractC3073as;
import o.AbstractC6178cWt;

/* renamed from: o.cWv  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C6180cWv extends AbstractC6178cWt implements InterfaceC1673aK<AbstractC6178cWt.b>, InterfaceC6181cWw {
    private InterfaceC4467bf<C6180cWv, AbstractC6178cWt.b> b;
    private InterfaceC4414be<C6180cWv, AbstractC6178cWt.b> c;
    private InterfaceC4573bh<C6180cWv, AbstractC6178cWt.b> d;
    private InterfaceC4732bk<C6180cWv, AbstractC6178cWt.b> h;

    @Override // o.InterfaceC1673aK
    public void e(C1511aE c1511aE, AbstractC6178cWt.b bVar, int i) {
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: b */
    public void a(AbstractC6178cWt.b bVar, int i) {
        InterfaceC4467bf<C6180cWv, AbstractC6178cWt.b> interfaceC4467bf = this.b;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, bVar, i);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: b  reason: avoid collision after fix types in other method */
    public void e(AbstractC6178cWt.b bVar) {
        super.b((C6180cWv) bVar);
        InterfaceC4414be<C6180cWv, AbstractC6178cWt.b> interfaceC4414be = this.c;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, bVar);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    public void c(int i, AbstractC6178cWt.b bVar) {
        InterfaceC4732bk<C6180cWv, AbstractC6178cWt.b> interfaceC4732bk = this.h;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, bVar, i);
        }
        super.a(i, (int) bVar);
    }

    @Override // o.AbstractC3336ax
    /* renamed from: a */
    public void d(float f, float f2, int i, int i2, AbstractC6178cWt.b bVar) {
        InterfaceC4573bh<C6180cWv, AbstractC6178cWt.b> interfaceC4573bh = this.d;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, bVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, bVar);
    }

    @Override // o.InterfaceC6181cWw
    /* renamed from: c */
    public C6180cWv d(CharSequence charSequence) {
        h();
        super.P_(charSequence);
        return this;
    }

    @Override // o.InterfaceC6181cWw
    /* renamed from: b */
    public C6180cWv a(boolean z) {
        h();
        super.e(z);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: d */
    public C6180cWv e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.InterfaceC6181cWw
    /* renamed from: e */
    public C6180cWv b(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: e */
    public C6180cWv a(int i) {
        super.a(i);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: d */
    public C6180cWv a(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: c */
    public AbstractC6178cWt.b b(ViewParent viewParent) {
        return new AbstractC6178cWt.b();
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C6180cWv) && super.equals(obj)) {
            C6180cWv c6180cWv = (C6180cWv) obj;
            if ((this.b == null) != (c6180cWv.b == null)) {
                return false;
            }
            if ((this.c == null) != (c6180cWv.c == null)) {
                return false;
            }
            if ((this.h == null) != (c6180cWv.h == null)) {
                return false;
            }
            if ((this.d == null) != (c6180cWv.d == null)) {
                return false;
            }
            if (m() == null ? c6180cWv.m() == null : m().equals(c6180cWv.m())) {
                return o() == c6180cWv.o() && i() == c6180cWv.i();
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
        int i3 = this.h != null ? 1 : 0;
        return (((((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + (this.d == null ? 0 : 1)) * 31) + (m() != null ? m().hashCode() : 0)) * 31) + o()) * 31) + (i() ? 1 : 0);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "SectionTitleModel_{text=" + ((Object) m()) + ", gravity=" + o() + ", dark=" + i() + "}" + super.toString();
    }
}
