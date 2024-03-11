package o;

import android.view.View;
import android.view.ViewParent;
import o.AbstractC3073as;
import o.AbstractC9928zI;

/* renamed from: o.zK  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C9930zK extends AbstractC9928zI implements InterfaceC1673aK<AbstractC9928zI.b> {
    private InterfaceC4414be<C9930zK, AbstractC9928zI.b> b;
    private InterfaceC4573bh<C9930zK, AbstractC9928zI.b> c;
    private InterfaceC4467bf<C9930zK, AbstractC9928zI.b> d;
    private InterfaceC4732bk<C9930zK, AbstractC9928zI.b> g;

    @Override // o.InterfaceC1673aK
    /* renamed from: a */
    public void e(C1511aE c1511aE, AbstractC9928zI.b bVar, int i) {
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: d */
    public void a(AbstractC9928zI.b bVar, int i) {
        InterfaceC4467bf<C9930zK, AbstractC9928zI.b> interfaceC4467bf = this.d;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, bVar, i);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: b  reason: avoid collision after fix types in other method */
    public void e(AbstractC9928zI.b bVar) {
        super.b((C9930zK) bVar);
        InterfaceC4414be<C9930zK, AbstractC9928zI.b> interfaceC4414be = this.b;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, bVar);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: e */
    public void c(int i, AbstractC9928zI.b bVar) {
        InterfaceC4732bk<C9930zK, AbstractC9928zI.b> interfaceC4732bk = this.g;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, bVar, i);
        }
        super.a(i, (int) bVar);
    }

    @Override // o.AbstractC3336ax
    /* renamed from: b */
    public void d(float f, float f2, int i, int i2, AbstractC9928zI.b bVar) {
        InterfaceC4573bh<C9930zK, AbstractC9928zI.b> interfaceC4573bh = this.c;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, bVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, bVar);
    }

    public C9930zK b(CharSequence charSequence) {
        h();
        super.e(charSequence);
        return this;
    }

    public C9930zK c(int i) {
        h();
        super.e(i);
        return this;
    }

    public C9930zK c(float f) {
        h();
        super.a(f);
        return this;
    }

    public C9930zK e(View.OnClickListener onClickListener) {
        h();
        super.d(onClickListener);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: a */
    public C9930zK e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: d */
    public C9930zK a(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: b */
    public C9930zK a(int i) {
        super.a(i);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: c */
    public C9930zK a(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: d */
    public AbstractC9928zI.b b(ViewParent viewParent) {
        return new AbstractC9928zI.b();
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C9930zK) && super.equals(obj)) {
            C9930zK c9930zK = (C9930zK) obj;
            if ((this.d == null) != (c9930zK.d == null)) {
                return false;
            }
            if ((this.b == null) != (c9930zK.b == null)) {
                return false;
            }
            if ((this.g == null) != (c9930zK.g == null)) {
                return false;
            }
            if ((this.c == null) != (c9930zK.c == null)) {
                return false;
            }
            if (l() == null ? c9930zK.l() == null : l().equals(c9930zK.l())) {
                if (k() == c9930zK.k() && o() == c9930zK.o() && Float.compare(c9930zK.i(), i()) == 0) {
                    return (n() == null) == (c9930zK.n() == null);
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
        int i2 = this.b != null ? 1 : 0;
        int i3 = this.g != null ? 1 : 0;
        int i4 = this.c != null ? 1 : 0;
        int hashCode2 = l() != null ? l().hashCode() : 0;
        int k = k();
        int o2 = o();
        return (((((((((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + hashCode2) * 31) + k) * 31) + o2) * 31) + (i() != 0.0f ? Float.floatToIntBits(i()) : 0)) * 31) + (n() != null ? 1 : 0);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "MenuTitleModel_{text=" + ((Object) l()) + ", paddingTop=" + k() + ", paddingBottom=" + o() + ", alpha=" + i() + ", outsideClickListener=" + n() + "}" + super.toString();
    }
}
