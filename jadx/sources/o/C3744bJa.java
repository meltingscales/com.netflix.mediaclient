package o;

import android.view.View;
import android.view.ViewParent;
import o.AbstractC3073as;
import o.bLG;

/* renamed from: o.bJa  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C3744bJa extends AbstractC3746bJc implements InterfaceC1673aK<bLG.a>, InterfaceC3747bJd {
    private InterfaceC4467bf<C3744bJa, bLG.a> d;
    private InterfaceC4732bk<C3744bJa, bLG.a> g;
    private InterfaceC4414be<C3744bJa, bLG.a> h;
    private InterfaceC4573bh<C3744bJa, bLG.a> i;

    @Override // o.InterfaceC1673aK
    public void e(C1511aE c1511aE, bLG.a aVar, int i) {
    }

    @Override // o.InterfaceC3747bJd
    public /* synthetic */ InterfaceC3747bJd d(InterfaceC4732bk interfaceC4732bk) {
        return b((InterfaceC4732bk<C3744bJa, bLG.a>) interfaceC4732bk);
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: d */
    public void a(bLG.a aVar, int i) {
        InterfaceC4467bf<C3744bJa, bLG.a> interfaceC4467bf = this.d;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, aVar, i);
        }
    }

    @Override // o.bLG, o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: c */
    public void e(bLG.a aVar) {
        super.e(aVar);
        InterfaceC4414be<C3744bJa, bLG.a> interfaceC4414be = this.h;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, aVar);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: e */
    public void c(int i, bLG.a aVar) {
        InterfaceC4732bk<C3744bJa, bLG.a> interfaceC4732bk = this.g;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, aVar, i);
        }
        super.a(i, (int) aVar);
    }

    public C3744bJa b(InterfaceC4732bk<C3744bJa, bLG.a> interfaceC4732bk) {
        h();
        this.g = interfaceC4732bk;
        return this;
    }

    @Override // o.AbstractC3336ax
    /* renamed from: e */
    public void d(float f, float f2, int i, int i2, bLG.a aVar) {
        InterfaceC4573bh<C3744bJa, bLG.a> interfaceC4573bh = this.i;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, aVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, aVar);
    }

    @Override // o.InterfaceC3747bJd
    /* renamed from: e */
    public C3744bJa d(String str) {
        h();
        super.h(str);
        return this;
    }

    @Override // o.InterfaceC3747bJd
    /* renamed from: a */
    public C3744bJa c(String str) {
        h();
        super.g(str);
        return this;
    }

    @Override // o.InterfaceC3747bJd
    /* renamed from: c */
    public C3744bJa b(View.OnClickListener onClickListener) {
        h();
        super.a(onClickListener);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: b */
    public C3744bJa e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.InterfaceC3747bJd
    /* renamed from: e */
    public C3744bJa b(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: c */
    public C3744bJa a(int i) {
        super.a(i);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: c */
    public C3744bJa a(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: e */
    public bLG.a b(ViewParent viewParent) {
        return new bLG.a();
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C3744bJa) && super.equals(obj)) {
            C3744bJa c3744bJa = (C3744bJa) obj;
            if ((this.d == null) != (c3744bJa.d == null)) {
                return false;
            }
            if ((this.h == null) != (c3744bJa.h == null)) {
                return false;
            }
            if ((this.g == null) != (c3744bJa.g == null)) {
                return false;
            }
            if ((this.i == null) != (c3744bJa.i == null)) {
                return false;
            }
            if (n() == null ? c3744bJa.n() == null : n().equals(c3744bJa.n())) {
                if (o() == null ? c3744bJa.o() == null : o().equals(c3744bJa.o())) {
                    if (p() == null ? c3744bJa.p() == null : p().equals(c3744bJa.p())) {
                        if (q() == null ? c3744bJa.q() == null : q().equals(c3744bJa.q())) {
                            if (k() == null ? c3744bJa.k() == null : k().equals(c3744bJa.k())) {
                                if (s() != c3744bJa.s()) {
                                    return false;
                                }
                                if (t() == null ? c3744bJa.t() == null : t().equals(c3744bJa.t())) {
                                    if (l() == null ? c3744bJa.l() == null : l().equals(c3744bJa.l())) {
                                        if ((r() == null) != (c3744bJa.r() == null)) {
                                            return false;
                                        }
                                        if ((((bLG) this).f == null) != (((bLG) c3744bJa).f == null)) {
                                            return false;
                                        }
                                        return aj_() == null ? c3744bJa.aj_() == null : aj_().equals(c3744bJa.aj_());
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
        int i2 = this.h != null ? 1 : 0;
        int i3 = this.g != null ? 1 : 0;
        int i4 = this.i != null ? 1 : 0;
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
        return "BoxArtModel_{impressionInfo=" + n() + ", aspectRatio=" + o() + ", title=" + p() + ", contentDescription=" + ((Object) q()) + ", boxshotUrl=" + k() + ", roundAsCircle=" + s() + ", videoId=" + t() + ", backgroundColor=" + l() + ", onClick=" + r() + ", appView=" + aj_() + "}" + super.toString();
    }
}
