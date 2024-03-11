package o;

import android.view.ViewParent;
import o.AbstractC3073as;
import o.bLG;

/* renamed from: o.bJy  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C3768bJy extends bJC implements InterfaceC1673aK<bLG.a>, bJA {
    private InterfaceC4467bf<C3768bJy, bLG.a> c;
    private InterfaceC4414be<C3768bJy, bLG.a> g;
    private InterfaceC4573bh<C3768bJy, bLG.a> h;
    private InterfaceC4732bk<C3768bJy, bLG.a> i;

    @Override // o.InterfaceC1673aK
    /* renamed from: d */
    public void e(C1511aE c1511aE, bLG.a aVar, int i) {
    }

    @Override // o.bJA
    public /* synthetic */ bJA e(InterfaceC4467bf interfaceC4467bf) {
        return b((InterfaceC4467bf<C3768bJy, bLG.a>) interfaceC4467bf);
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: b */
    public void a(bLG.a aVar, int i) {
        InterfaceC4467bf<C3768bJy, bLG.a> interfaceC4467bf = this.c;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, aVar, i);
        }
    }

    public C3768bJy b(InterfaceC4467bf<C3768bJy, bLG.a> interfaceC4467bf) {
        h();
        this.c = interfaceC4467bf;
        return this;
    }

    @Override // o.bLG, o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: c */
    public void e(bLG.a aVar) {
        super.e(aVar);
        InterfaceC4414be<C3768bJy, bLG.a> interfaceC4414be = this.g;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, aVar);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: b */
    public void c(int i, bLG.a aVar) {
        InterfaceC4732bk<C3768bJy, bLG.a> interfaceC4732bk = this.i;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, aVar, i);
        }
        super.a(i, (int) aVar);
    }

    @Override // o.AbstractC3336ax
    /* renamed from: c */
    public void d(float f, float f2, int i, int i2, bLG.a aVar) {
        InterfaceC4573bh<C3768bJy, bLG.a> interfaceC4573bh = this.h;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, aVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, aVar);
    }

    @Override // o.bJA
    /* renamed from: d */
    public C3768bJy c(String str) {
        h();
        super.h(str);
        return this;
    }

    @Override // o.bJA
    /* renamed from: e */
    public C3768bJy b(String str) {
        h();
        super.g(str);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: b */
    public C3768bJy e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.bJA
    /* renamed from: d */
    public C3768bJy e(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: b */
    public C3768bJy a(int i) {
        super.a(i);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: d */
    public C3768bJy a(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: c */
    public bLG.a b(ViewParent viewParent) {
        return new bLG.a();
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C3768bJy) && super.equals(obj)) {
            C3768bJy c3768bJy = (C3768bJy) obj;
            if ((this.c == null) != (c3768bJy.c == null)) {
                return false;
            }
            if ((this.g == null) != (c3768bJy.g == null)) {
                return false;
            }
            if ((this.i == null) != (c3768bJy.i == null)) {
                return false;
            }
            if ((this.h == null) != (c3768bJy.h == null)) {
                return false;
            }
            if (n() == null ? c3768bJy.n() == null : n().equals(c3768bJy.n())) {
                if (o() == null ? c3768bJy.o() == null : o().equals(c3768bJy.o())) {
                    if (p() == null ? c3768bJy.p() == null : p().equals(c3768bJy.p())) {
                        if (q() == null ? c3768bJy.q() == null : q().equals(c3768bJy.q())) {
                            if (k() == null ? c3768bJy.k() == null : k().equals(c3768bJy.k())) {
                                if (s() != c3768bJy.s()) {
                                    return false;
                                }
                                if (t() == null ? c3768bJy.t() == null : t().equals(c3768bJy.t())) {
                                    if (l() == null ? c3768bJy.l() == null : l().equals(c3768bJy.l())) {
                                        if ((r() == null) != (c3768bJy.r() == null)) {
                                            return false;
                                        }
                                        if ((((bLG) this).f == null) != (((bLG) c3768bJy).f == null)) {
                                            return false;
                                        }
                                        return aj_() == null ? c3768bJy.aj_() == null : aj_().equals(c3768bJy.aj_());
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
        int i = this.c != null ? 1 : 0;
        int i2 = this.g != null ? 1 : 0;
        int i3 = this.i != null ? 1 : 0;
        int i4 = this.h != null ? 1 : 0;
        int hashCode2 = n() != null ? n().hashCode() : 0;
        int hashCode3 = o() != null ? o().hashCode() : 0;
        int hashCode4 = p() != null ? p().hashCode() : 0;
        int hashCode5 = q() != null ? q().hashCode() : 0;
        int hashCode6 = k() != null ? k().hashCode() : 0;
        boolean s = s();
        int hashCode7 = t() != null ? t().hashCode() : 0;
        int hashCode8 = l() != null ? l().hashCode() : 0;
        int i5 = r() != null ? 1 : 0;
        return (((((((((((((((((((((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + (s ? 1 : 0)) * 31) + hashCode7) * 31) + hashCode8) * 31) + i5) * 31) + (((bLG) this).f != null ? 1 : 0)) * 31) + (aj_() != null ? aj_().hashCode() : 0);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "CustomDescriptionVideoModel_{impressionInfo=" + n() + ", aspectRatio=" + o() + ", title=" + p() + ", contentDescription=" + ((Object) q()) + ", boxshotUrl=" + k() + ", roundAsCircle=" + s() + ", videoId=" + t() + ", backgroundColor=" + l() + ", onClick=" + r() + ", appView=" + aj_() + "}" + super.toString();
    }
}
