package o;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewParent;
import o.AbstractC3073as;
import o.AbstractC3772bKb;

/* loaded from: classes4.dex */
public class bJX extends AbstractC3772bKb implements InterfaceC1673aK<AbstractC3772bKb.c>, bJZ {
    private InterfaceC4414be<bJX, AbstractC3772bKb.c> b;
    private InterfaceC4573bh<bJX, AbstractC3772bKb.c> c;
    private InterfaceC4467bf<bJX, AbstractC3772bKb.c> d;
    private InterfaceC4732bk<bJX, AbstractC3772bKb.c> f;

    @Override // o.InterfaceC1673aK
    /* renamed from: c */
    public void e(C1511aE c1511aE, AbstractC3772bKb.c cVar, int i) {
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: e */
    public void a(AbstractC3772bKb.c cVar, int i) {
        InterfaceC4467bf<bJX, AbstractC3772bKb.c> interfaceC4467bf = this.d;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, cVar, i);
        }
    }

    @Override // o.AbstractC3772bKb, o.AbstractC3336ax, o.AbstractC3073as
    public void e(AbstractC3772bKb.c cVar) {
        super.e(cVar);
        InterfaceC4414be<bJX, AbstractC3772bKb.c> interfaceC4414be = this.b;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, cVar);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: b */
    public void c(int i, AbstractC3772bKb.c cVar) {
        InterfaceC4732bk<bJX, AbstractC3772bKb.c> interfaceC4732bk = this.f;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, cVar, i);
        }
        super.a(i, (int) cVar);
    }

    @Override // o.AbstractC3336ax
    public void d(float f, float f2, int i, int i2, AbstractC3772bKb.c cVar) {
        InterfaceC4573bh<bJX, AbstractC3772bKb.c> interfaceC4573bh = this.c;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, cVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, (int) cVar);
    }

    @Override // o.bJZ
    /* renamed from: a */
    public bJX e(View.OnClickListener onClickListener) {
        h();
        super.d(onClickListener);
        return this;
    }

    @Override // o.bJZ
    /* renamed from: b */
    public bJX a(Integer num) {
        h();
        super.e(num);
        return this;
    }

    @Override // o.bJZ
    /* renamed from: e */
    public bJX b(Drawable drawable) {
        h();
        super.a_(drawable);
        return this;
    }

    @Override // o.bJZ
    /* renamed from: a */
    public bJX d(String str) {
        h();
        super.b(str);
        return this;
    }

    @Override // o.bJZ
    /* renamed from: d */
    public bJX c(Integer num) {
        h();
        super.g_(num);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: c */
    public bJX e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.bJZ
    /* renamed from: c */
    public bJX b(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.bJZ
    /* renamed from: e */
    public bJX d(int i) {
        super.a(i);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: b */
    public bJX a(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: a */
    public AbstractC3772bKb.c b(ViewParent viewParent) {
        return new AbstractC3772bKb.c();
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof bJX) && super.equals(obj)) {
            bJX bjx = (bJX) obj;
            if ((this.d == null) != (bjx.d == null)) {
                return false;
            }
            if ((this.b == null) != (bjx.b == null)) {
                return false;
            }
            if ((this.f == null) != (bjx.f == null)) {
                return false;
            }
            if ((this.c == null) != (bjx.c == null)) {
                return false;
            }
            if ((l() == null) != (bjx.l() == null)) {
                return false;
            }
            if (k() == null ? bjx.k() == null : k().equals(bjx.k())) {
                if ((o() == null) != (bjx.o() == null)) {
                    return false;
                }
                if (i() == null ? bjx.i() == null : i().equals(bjx.i())) {
                    return m() == null ? bjx.m() == null : m().equals(bjx.m());
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
        int i3 = this.f != null ? 1 : 0;
        int i4 = this.c != null ? 1 : 0;
        int i5 = l() != null ? 1 : 0;
        int hashCode2 = k() != null ? k().hashCode() : 0;
        int i6 = o() == null ? 0 : 1;
        return (((((((((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + i5) * 31) + hashCode2) * 31) + i6) * 31) + (i() != null ? i().hashCode() : 0)) * 31) + (m() != null ? m().hashCode() : 0);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "ImageModel_{onClick=" + l() + ", imageDrawableId=" + k() + ", imageDrawableResource=" + o() + ", contentDescription=" + i() + ", imageTint=" + m() + "}" + super.toString();
    }
}
