package o;

import android.view.ViewParent;
import o.AbstractC3073as;
import o.AbstractC6173cWo;

/* renamed from: o.cWu  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C6179cWu extends AbstractC6173cWo implements InterfaceC1673aK<AbstractC6173cWo.e>, InterfaceC6177cWs {
    private InterfaceC4414be<C6179cWu, AbstractC6173cWo.e> b;
    private InterfaceC4573bh<C6179cWu, AbstractC6173cWo.e> c;
    private InterfaceC4467bf<C6179cWu, AbstractC6173cWo.e> d;
    private InterfaceC4732bk<C6179cWu, AbstractC6173cWo.e> f;

    @Override // o.InterfaceC1673aK
    /* renamed from: c */
    public void e(C1511aE c1511aE, AbstractC6173cWo.e eVar, int i) {
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: d */
    public void a(AbstractC6173cWo.e eVar, int i) {
        InterfaceC4467bf<C6179cWu, AbstractC6173cWo.e> interfaceC4467bf = this.d;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, eVar, i);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: a */
    public void e(AbstractC6173cWo.e eVar) {
        super.b((C6179cWu) eVar);
        InterfaceC4414be<C6179cWu, AbstractC6173cWo.e> interfaceC4414be = this.b;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, eVar);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public void c(int i, AbstractC6173cWo.e eVar) {
        InterfaceC4732bk<C6179cWu, AbstractC6173cWo.e> interfaceC4732bk = this.f;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, eVar, i);
        }
        super.a(i, (int) eVar);
    }

    @Override // o.AbstractC3336ax
    /* renamed from: c */
    public void d(float f, float f2, int i, int i2, AbstractC6173cWo.e eVar) {
        InterfaceC4573bh<C6179cWu, AbstractC6173cWo.e> interfaceC4573bh = this.c;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, eVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, eVar);
    }

    @Override // o.InterfaceC6177cWs
    /* renamed from: e */
    public C6179cWu b(CharSequence charSequence) {
        h();
        super.O_(charSequence);
        return this;
    }

    @Override // o.InterfaceC6177cWs
    /* renamed from: c */
    public C6179cWu d(boolean z) {
        h();
        super.b(z);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: d */
    public C6179cWu e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.InterfaceC6177cWs
    /* renamed from: d */
    public C6179cWu c(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: b */
    public C6179cWu a(int i) {
        super.a(i);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: b */
    public C6179cWu a(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: c */
    public AbstractC6173cWo.e b(ViewParent viewParent) {
        return new AbstractC6173cWo.e();
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C6179cWu) && super.equals(obj)) {
            C6179cWu c6179cWu = (C6179cWu) obj;
            if ((this.d == null) != (c6179cWu.d == null)) {
                return false;
            }
            if ((this.b == null) != (c6179cWu.b == null)) {
                return false;
            }
            if ((this.f == null) != (c6179cWu.f == null)) {
                return false;
            }
            if ((this.c == null) != (c6179cWu.c == null)) {
                return false;
            }
            if (m() == null ? c6179cWu.m() == null : m().equals(c6179cWu.m())) {
                return i() == c6179cWu.i();
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
        int i3 = this.f != null ? 1 : 0;
        return (((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + (this.c == null ? 0 : 1)) * 31) + (m() != null ? m().hashCode() : 0)) * 31) + (i() ? 1 : 0);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "HeaderTextModel_{text=" + ((Object) m()) + ", dark=" + i() + "}" + super.toString();
    }
}
