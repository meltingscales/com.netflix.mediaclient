package o;

import android.view.View;
import android.view.ViewParent;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.TrackingInfo;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import o.AbstractC3073as;
import o.AbstractC3961bRb;
import o.InterfaceC3825bMa;

/* renamed from: o.bRc  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C3962bRc extends AbstractC3961bRb implements InterfaceC1673aK<AbstractC3961bRb.d> {
    private InterfaceC4467bf<C3962bRc, AbstractC3961bRb.d> b;
    private InterfaceC4414be<C3962bRc, AbstractC3961bRb.d> f;
    private InterfaceC4732bk<C3962bRc, AbstractC3961bRb.d> i;
    private InterfaceC4573bh<C3962bRc, AbstractC3961bRb.d> j;

    @Override // o.InterfaceC1673aK
    /* renamed from: a */
    public void e(C1511aE c1511aE, AbstractC3961bRb.d dVar, int i) {
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: b */
    public void a(AbstractC3961bRb.d dVar, int i) {
        InterfaceC4467bf<C3962bRc, AbstractC3961bRb.d> interfaceC4467bf = this.b;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, dVar, i);
        }
    }

    public C3962bRc e(InterfaceC4467bf<C3962bRc, AbstractC3961bRb.d> interfaceC4467bf) {
        h();
        this.b = interfaceC4467bf;
        return this;
    }

    @Override // o.AbstractC3961bRb, o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: c */
    public void e(AbstractC3961bRb.d dVar) {
        super.e(dVar);
        InterfaceC4414be<C3962bRc, AbstractC3961bRb.d> interfaceC4414be = this.f;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, dVar);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: b */
    public void c(int i, AbstractC3961bRb.d dVar) {
        InterfaceC4732bk<C3962bRc, AbstractC3961bRb.d> interfaceC4732bk = this.i;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, dVar, i);
        }
        super.a(i, (int) dVar);
    }

    public C3962bRc c(InterfaceC4732bk<C3962bRc, AbstractC3961bRb.d> interfaceC4732bk) {
        h();
        this.i = interfaceC4732bk;
        return this;
    }

    @Override // o.AbstractC3336ax
    public void d(float f, float f2, int i, int i2, AbstractC3961bRb.d dVar) {
        InterfaceC4573bh<C3962bRc, AbstractC3961bRb.d> interfaceC4573bh = this.j;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, dVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, (int) dVar);
    }

    public C3962bRc a(String str) {
        h();
        super.b(str);
        return this;
    }

    public C3962bRc a(Integer num) {
        h();
        super.e(num);
        return this;
    }

    public C3962bRc g(String str) {
        h();
        super.d(str);
        return this;
    }

    public C3962bRc c(String str) {
        h();
        super.e(str);
        return this;
    }

    public C3962bRc b(View.OnClickListener onClickListener) {
        h();
        super.a(onClickListener);
        return this;
    }

    public C3962bRc e(TrackingInfoHolder trackingInfoHolder) {
        h();
        super.c(trackingInfoHolder);
        return this;
    }

    public C3962bRc e(InterfaceC3825bMa.a aVar) {
        h();
        super.a(aVar);
        return this;
    }

    public C3962bRc d(drO<? extends TrackingInfo> dro) {
        h();
        ((AbstractC3961bRb) this).d = dro;
        return this;
    }

    public C3962bRc b(AppView appView) {
        h();
        this.c = appView;
        return this;
    }

    public C3962bRc d(Integer num) {
        h();
        super.b(num);
        return this;
    }

    public C3962bRc b(int i) {
        h();
        super.e(i);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: b */
    public C3962bRc e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: b */
    public C3962bRc a(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: c */
    public C3962bRc a(int i) {
        super.a(i);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: e */
    public C3962bRc a(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: c */
    public AbstractC3961bRb.d b(ViewParent viewParent) {
        return new AbstractC3961bRb.d();
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C3962bRc) && super.equals(obj)) {
            C3962bRc c3962bRc = (C3962bRc) obj;
            if ((this.b == null) != (c3962bRc.b == null)) {
                return false;
            }
            if ((this.f == null) != (c3962bRc.f == null)) {
                return false;
            }
            if ((this.i == null) != (c3962bRc.i == null)) {
                return false;
            }
            if ((this.j == null) != (c3962bRc.j == null)) {
                return false;
            }
            if (l() == null ? c3962bRc.l() == null : l().equals(c3962bRc.l())) {
                if (t() == null ? c3962bRc.t() == null : t().equals(c3962bRc.t())) {
                    if (p() == null ? c3962bRc.p() == null : p().equals(c3962bRc.p())) {
                        if (s() == null ? c3962bRc.s() == null : s().equals(c3962bRc.s())) {
                            if (k() == null ? c3962bRc.k() == null : k().equals(c3962bRc.k())) {
                                if ((q() == null) != (c3962bRc.q() == null)) {
                                    return false;
                                }
                                if ((r() == null) != (c3962bRc.r() == null)) {
                                    return false;
                                }
                                if (n() == null ? c3962bRc.n() == null : n().equals(c3962bRc.n())) {
                                    if ((((AbstractC3961bRb) this).d == null) != (((AbstractC3961bRb) c3962bRc).d == null)) {
                                        return false;
                                    }
                                    AppView appView = this.c;
                                    if (appView == null ? c3962bRc.c == null : appView.equals(c3962bRc.c)) {
                                        if (w() == null ? c3962bRc.w() == null : w().equals(c3962bRc.w())) {
                                            return o() == c3962bRc.o();
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
        return false;
    }

    @Override // o.AbstractC3073as
    public int hashCode() {
        int hashCode = super.hashCode();
        int i = this.b != null ? 1 : 0;
        int i2 = this.f != null ? 1 : 0;
        int i3 = this.i != null ? 1 : 0;
        int i4 = this.j != null ? 1 : 0;
        int hashCode2 = l() != null ? l().hashCode() : 0;
        int hashCode3 = t() != null ? t().hashCode() : 0;
        int hashCode4 = p() != null ? p().hashCode() : 0;
        int hashCode5 = s() != null ? s().hashCode() : 0;
        int hashCode6 = k() != null ? k().hashCode() : 0;
        int i5 = q() != null ? 1 : 0;
        int i6 = r() != null ? 1 : 0;
        int hashCode7 = n() != null ? n().hashCode() : 0;
        int i7 = ((AbstractC3961bRb) this).d != null ? 1 : 0;
        AppView appView = this.c;
        return (((((((((((((((((((((((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + i5) * 31) + i6) * 31) + hashCode7) * 31) + i7) * 31) + (appView != null ? appView.hashCode() : 0)) * 31) + (w() != null ? w().hashCode() : 0)) * 31) + o();
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "GameIconModel_{gameId=" + l() + ", iconImageUrl=" + t() + ", iconForegroundDrawableResId=" + p() + ", title=" + s() + ", genre=" + k() + ", onClick=" + q() + ", trackingInfoHolder=" + r() + ", impressionInfo=" + n() + ", appView=" + this.c + ", width=" + w() + ", genreMaxLine=" + o() + "}" + super.toString();
    }
}
