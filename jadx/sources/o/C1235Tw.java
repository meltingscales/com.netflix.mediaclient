package o;

import android.view.View;
import android.view.ViewParent;
import o.AbstractC1232Tt;
import o.AbstractC3073as;

/* renamed from: o.Tw  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1235Tw extends AbstractC1232Tt implements InterfaceC1673aK<AbstractC1232Tt.e>, InterfaceC1233Tu {
    private InterfaceC4414be<C1235Tw, AbstractC1232Tt.e> b;
    private InterfaceC4467bf<C1235Tw, AbstractC1232Tt.e> c;
    private InterfaceC4573bh<C1235Tw, AbstractC1232Tt.e> d;
    private InterfaceC4732bk<C1235Tw, AbstractC1232Tt.e> f;

    @Override // o.InterfaceC1673aK
    /* renamed from: d */
    public void e(C1511aE c1511aE, AbstractC1232Tt.e eVar, int i) {
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: b */
    public void a(AbstractC1232Tt.e eVar, int i) {
        InterfaceC4467bf<C1235Tw, AbstractC1232Tt.e> interfaceC4467bf = this.c;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, eVar, i);
        }
    }

    @Override // o.AbstractC1232Tt, o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: c */
    public void e(AbstractC1232Tt.e eVar) {
        super.e(eVar);
        InterfaceC4414be<C1235Tw, AbstractC1232Tt.e> interfaceC4414be = this.b;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, eVar);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: d */
    public void c(int i, AbstractC1232Tt.e eVar) {
        InterfaceC4732bk<C1235Tw, AbstractC1232Tt.e> interfaceC4732bk = this.f;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, eVar, i);
        }
        super.a(i, (int) eVar);
    }

    @Override // o.AbstractC3336ax
    /* renamed from: e */
    public void d(float f, float f2, int i, int i2, AbstractC1232Tt.e eVar) {
        InterfaceC4573bh<C1235Tw, AbstractC1232Tt.e> interfaceC4573bh = this.d;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, eVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, eVar);
    }

    @Override // o.InterfaceC1233Tu
    /* renamed from: d */
    public C1235Tw b(CharSequence charSequence) {
        h();
        super.a_(charSequence);
        return this;
    }

    @Override // o.InterfaceC1233Tu
    /* renamed from: d */
    public C1235Tw a(boolean z) {
        h();
        super.e(z);
        return this;
    }

    @Override // o.InterfaceC1233Tu
    /* renamed from: b */
    public C1235Tw c(boolean z) {
        h();
        super.a_(z);
        return this;
    }

    @Override // o.InterfaceC1233Tu
    /* renamed from: c */
    public C1235Tw d(View.OnClickListener onClickListener) {
        h();
        super.a(onClickListener);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: b */
    public C1235Tw e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.InterfaceC1233Tu
    /* renamed from: e */
    public C1235Tw c(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: c */
    public C1235Tw a(int i) {
        super.a(i);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: b */
    public C1235Tw a(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: a */
    public AbstractC1232Tt.e b(ViewParent viewParent) {
        return new AbstractC1232Tt.e();
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C1235Tw) && super.equals(obj)) {
            C1235Tw c1235Tw = (C1235Tw) obj;
            if ((this.c == null) != (c1235Tw.c == null)) {
                return false;
            }
            if ((this.b == null) != (c1235Tw.b == null)) {
                return false;
            }
            if ((this.f == null) != (c1235Tw.f == null)) {
                return false;
            }
            if ((this.d == null) != (c1235Tw.d == null)) {
                return false;
            }
            if (i() == null ? c1235Tw.i() == null : i().equals(c1235Tw.i())) {
                if (n() == c1235Tw.n() && o() == c1235Tw.o()) {
                    return (m() == null) == (c1235Tw.m() == null);
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
        int i3 = this.f != null ? 1 : 0;
        int i4 = this.d != null ? 1 : 0;
        return (((((((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + (i() != null ? i().hashCode() : 0)) * 31) + (n() ? 1 : 0)) * 31) + (o() ? 1 : 0)) * 31) + (m() != null ? 1 : 0);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "LanguageSelectionItemModel_{label=" + ((Object) i()) + ", selected=" + n() + ", showDivider=" + o() + ", onClick=" + m() + "}" + super.toString();
    }
}
