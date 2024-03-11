package o;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewParent;
import o.AbstractC3073as;
import o.AbstractC9922zC;

/* renamed from: o.zL  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C9931zL extends AbstractC9922zC implements InterfaceC1673aK<AbstractC9922zC.a> {
    private InterfaceC4414be<C9931zL, AbstractC9922zC.a> c;
    private InterfaceC4467bf<C9931zL, AbstractC9922zC.a> d;
    private InterfaceC4573bh<C9931zL, AbstractC9922zC.a> f;
    private InterfaceC4732bk<C9931zL, AbstractC9922zC.a> g;

    @Override // o.InterfaceC1673aK
    /* renamed from: d */
    public void e(C1511aE c1511aE, AbstractC9922zC.a aVar, int i) {
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: c */
    public void a(AbstractC9922zC.a aVar, int i) {
        InterfaceC4467bf<C9931zL, AbstractC9922zC.a> interfaceC4467bf = this.d;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, aVar, i);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: b  reason: avoid collision after fix types in other method */
    public void e(AbstractC9922zC.a aVar) {
        super.b((C9931zL) aVar);
        InterfaceC4414be<C9931zL, AbstractC9922zC.a> interfaceC4414be = this.c;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, aVar);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: d */
    public void c(int i, AbstractC9922zC.a aVar) {
        InterfaceC4732bk<C9931zL, AbstractC9922zC.a> interfaceC4732bk = this.g;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, aVar, i);
        }
        super.a(i, (int) aVar);
    }

    @Override // o.AbstractC3336ax
    public void d(float f, float f2, int i, int i2, AbstractC9922zC.a aVar) {
        InterfaceC4573bh<C9931zL, AbstractC9922zC.a> interfaceC4573bh = this.f;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, aVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, (int) aVar);
    }

    public C9931zL e(Drawable drawable) {
        h();
        super.b(drawable);
        return this;
    }

    public C9931zL e(CharSequence charSequence) {
        h();
        ((AbstractC9922zC) this).b = charSequence;
        return this;
    }

    public C9931zL b(float f) {
        h();
        super.e(f);
        return this;
    }

    public C9931zL b(boolean z) {
        h();
        super.c(z);
        return this;
    }

    public C9931zL d(View.OnClickListener onClickListener) {
        h();
        super.e(onClickListener);
        return this;
    }

    public C9931zL a(View.OnClickListener onClickListener) {
        h();
        super.c(onClickListener);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: c */
    public C9931zL e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: b */
    public C9931zL a(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: c */
    public C9931zL a(int i) {
        super.a(i);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: e */
    public C9931zL a(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: a */
    public AbstractC9922zC.a b(ViewParent viewParent) {
        return new AbstractC9922zC.a();
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C9931zL) && super.equals(obj)) {
            C9931zL c9931zL = (C9931zL) obj;
            if ((this.d == null) != (c9931zL.d == null)) {
                return false;
            }
            if ((this.c == null) != (c9931zL.c == null)) {
                return false;
            }
            if ((this.g == null) != (c9931zL.g == null)) {
                return false;
            }
            if ((this.f == null) != (c9931zL.f == null)) {
                return false;
            }
            if (o() == null ? c9931zL.o() == null : o().equals(c9931zL.o())) {
                CharSequence charSequence = ((AbstractC9922zC) this).b;
                if (charSequence == null ? ((AbstractC9922zC) c9931zL).b == null : charSequence.equals(((AbstractC9922zC) c9931zL).b)) {
                    if (Float.compare(c9931zL.i(), i()) == 0 && k() == c9931zL.k()) {
                        if ((n() == null) != (c9931zL.n() == null)) {
                            return false;
                        }
                        return (m() == null) == (c9931zL.m() == null);
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
        int i = this.d != null ? 1 : 0;
        int i2 = this.c != null ? 1 : 0;
        int i3 = this.g != null ? 1 : 0;
        int i4 = this.f != null ? 1 : 0;
        int hashCode2 = o() != null ? o().hashCode() : 0;
        CharSequence charSequence = ((AbstractC9922zC) this).b;
        int hashCode3 = charSequence != null ? charSequence.hashCode() : 0;
        int floatToIntBits = i() != 0.0f ? Float.floatToIntBits(i()) : 0;
        boolean k = k();
        return (((((((((((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + hashCode2) * 31) + hashCode3) * 31) + floatToIntBits) * 31) + (k ? 1 : 0)) * 31) + (n() != null ? 1 : 0)) * 31) + (m() != null ? 1 : 0);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "MenuItemModel_{icon=" + o() + ", text=" + ((Object) ((AbstractC9922zC) this).b) + ", alpha=" + i() + ", progressVisible=" + k() + ", clickListener=" + n() + ", outsideClickListener=" + m() + "}" + super.toString();
    }
}
