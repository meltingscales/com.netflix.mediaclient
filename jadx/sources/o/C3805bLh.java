package o;

import android.view.View;
import android.view.ViewParent;
import o.AbstractC3073as;
import o.AbstractC3803bLf;

/* renamed from: o.bLh  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C3805bLh extends AbstractC3803bLf implements InterfaceC1673aK<AbstractC3803bLf.c>, InterfaceC3804bLg {
    private InterfaceC4414be<C3805bLh, AbstractC3803bLf.c> b;
    private InterfaceC4573bh<C3805bLh, AbstractC3803bLf.c> c;
    private InterfaceC4467bf<C3805bLh, AbstractC3803bLf.c> d;
    private InterfaceC4732bk<C3805bLh, AbstractC3803bLf.c> f;

    @Override // o.InterfaceC1673aK
    /* renamed from: d */
    public void e(C1511aE c1511aE, AbstractC3803bLf.c cVar, int i) {
    }

    @Override // o.InterfaceC3804bLg
    public /* synthetic */ InterfaceC3804bLg a(InterfaceC4308bc interfaceC4308bc) {
        return c((InterfaceC4308bc<C3805bLh, AbstractC3803bLf.c>) interfaceC4308bc);
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: d */
    public void a(AbstractC3803bLf.c cVar, int i) {
        InterfaceC4467bf<C3805bLh, AbstractC3803bLf.c> interfaceC4467bf = this.d;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, cVar, i);
        }
    }

    @Override // o.AbstractC3803bLf, o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: b  reason: avoid collision after fix types in other method */
    public void e(AbstractC3803bLf.c cVar) {
        super.e(cVar);
        InterfaceC4414be<C3805bLh, AbstractC3803bLf.c> interfaceC4414be = this.b;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, cVar);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public void c(int i, AbstractC3803bLf.c cVar) {
        InterfaceC4732bk<C3805bLh, AbstractC3803bLf.c> interfaceC4732bk = this.f;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, cVar, i);
        }
        super.a(i, (int) cVar);
    }

    @Override // o.AbstractC3336ax
    /* renamed from: e */
    public void d(float f, float f2, int i, int i2, AbstractC3803bLf.c cVar) {
        InterfaceC4573bh<C3805bLh, AbstractC3803bLf.c> interfaceC4573bh = this.c;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, cVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, cVar);
    }

    public C3805bLh c(InterfaceC4308bc<C3805bLh, AbstractC3803bLf.c> interfaceC4308bc) {
        h();
        if (interfaceC4308bc == null) {
            super.d((View.OnClickListener) null);
        } else {
            super.d((View.OnClickListener) new View$OnClickListenerC4818bn(interfaceC4308bc));
        }
        return this;
    }

    @Override // o.InterfaceC3804bLg
    /* renamed from: e */
    public C3805bLh b(View.OnClickListener onClickListener) {
        h();
        super.d(onClickListener);
        return this;
    }

    @Override // o.InterfaceC3804bLg
    /* renamed from: h */
    public C3805bLh b(CharSequence charSequence) {
        h();
        super.y_(charSequence);
        return this;
    }

    @Override // o.InterfaceC3804bLg
    /* renamed from: f */
    public C3805bLh c(CharSequence charSequence) {
        h();
        super.d(charSequence);
        return this;
    }

    @Override // o.InterfaceC3804bLg
    /* renamed from: e */
    public C3805bLh d(boolean z) {
        h();
        super.b(z);
        return this;
    }

    @Override // o.InterfaceC3804bLg
    /* renamed from: g */
    public C3805bLh d(Integer num) {
        h();
        super.i_(num);
        return this;
    }

    @Override // o.InterfaceC3804bLg
    /* renamed from: j */
    public C3805bLh a(Integer num) {
        h();
        super.j_(num);
        return this;
    }

    @Override // o.InterfaceC3804bLg
    /* renamed from: b */
    public C3805bLh e(Integer num) {
        h();
        super.q_(num);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: b */
    public C3805bLh e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.InterfaceC3804bLg
    /* renamed from: g */
    public C3805bLh e(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.InterfaceC3804bLg
    /* renamed from: b */
    public C3805bLh c(int i) {
        super.a(i);
        return this;
    }

    @Override // o.InterfaceC3804bLg
    /* renamed from: c */
    public C3805bLh e(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: e */
    public AbstractC3803bLf.c b(ViewParent viewParent) {
        return new AbstractC3803bLf.c();
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C3805bLh) && super.equals(obj)) {
            C3805bLh c3805bLh = (C3805bLh) obj;
            if ((this.d == null) != (c3805bLh.d == null)) {
                return false;
            }
            if ((this.b == null) != (c3805bLh.b == null)) {
                return false;
            }
            if ((this.f == null) != (c3805bLh.f == null)) {
                return false;
            }
            if ((this.c == null) != (c3805bLh.c == null)) {
                return false;
            }
            if ((s() == null) != (c3805bLh.s() == null)) {
                return false;
            }
            if (q() == null ? c3805bLh.q() == null : q().equals(c3805bLh.q())) {
                if (i() == null ? c3805bLh.i() == null : i().equals(c3805bLh.i())) {
                    if (p() != c3805bLh.p()) {
                        return false;
                    }
                    if (m() == null ? c3805bLh.m() == null : m().equals(c3805bLh.m())) {
                        if (r() == null ? c3805bLh.r() == null : r().equals(c3805bLh.r())) {
                            if (n() == null ? c3805bLh.n() == null : n().equals(c3805bLh.n())) {
                                if (l() == null ? c3805bLh.l() == null : l().equals(c3805bLh.l())) {
                                    if (o() == null ? c3805bLh.o() == null : o().equals(c3805bLh.o())) {
                                        return k() == c3805bLh.k();
                                    }
                                    return false;
                                }
                                return false;
                            }
                            return false;
                        }
                        return false;
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
        int i2 = this.b != null ? 1 : 0;
        int i3 = this.f != null ? 1 : 0;
        int i4 = this.c != null ? 1 : 0;
        int i5 = s() == null ? 0 : 1;
        int hashCode2 = q() != null ? q().hashCode() : 0;
        int hashCode3 = i() != null ? i().hashCode() : 0;
        boolean p = p();
        int hashCode4 = m() != null ? m().hashCode() : 0;
        int hashCode5 = r() != null ? r().hashCode() : 0;
        int hashCode6 = n() != null ? n().hashCode() : 0;
        return (((((((((((((((((((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + i5) * 31) + hashCode2) * 31) + hashCode3) * 31) + (p ? 1 : 0)) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + (l() != null ? l().hashCode() : 0)) * 31) + (o() != null ? o().hashCode() : 0)) * 31) + (k() ? 1 : 0);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "TextButtonModel_{onClick=" + s() + ", text=" + ((Object) q()) + ", accessibilityText=" + ((Object) i()) + ", enabled=" + p() + ", drawableStart=" + m() + ", drawableTop=" + r() + ", drawableEnd=" + n() + ", drawableBottom=" + l() + ", drawablePadding=" + o() + ", displayButtonLabels=" + k() + "}" + super.toString();
    }
}
