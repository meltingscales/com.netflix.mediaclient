package o;

import android.view.View;
import android.view.ViewParent;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.TrackingInfo;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import o.AbstractC3073as;
import o.AbstractC3893bOo;
import o.InterfaceC3825bMa;

/* loaded from: classes4.dex */
public class bOD extends bOC implements InterfaceC1673aK<AbstractC3893bOo.b>, bOH {
    private InterfaceC4414be<bOD, AbstractC3893bOo.b> f;
    private InterfaceC4467bf<bOD, AbstractC3893bOo.b> h;
    private InterfaceC4732bk<bOD, AbstractC3893bOo.b> i;
    private InterfaceC4573bh<bOD, AbstractC3893bOo.b> j;

    @Override // o.InterfaceC1673aK
    /* renamed from: c */
    public void e(C1511aE c1511aE, AbstractC3893bOo.b bVar, int i) {
    }

    @Override // o.bOH
    public /* synthetic */ bOH a(drO dro) {
        return b((drO<? extends TrackingInfo>) dro);
    }

    @Override // o.bOH
    public /* synthetic */ bOH b(InterfaceC4467bf interfaceC4467bf) {
        return c((InterfaceC4467bf<bOD, AbstractC3893bOo.b>) interfaceC4467bf);
    }

    @Override // o.bOH
    public /* synthetic */ bOH e(InterfaceC4732bk interfaceC4732bk) {
        return a((InterfaceC4732bk<bOD, AbstractC3893bOo.b>) interfaceC4732bk);
    }

    @Override // o.InterfaceC1673aK
    public void a(AbstractC3893bOo.b bVar, int i) {
        InterfaceC4467bf<bOD, AbstractC3893bOo.b> interfaceC4467bf = this.h;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, bVar, i);
        }
    }

    public bOD c(InterfaceC4467bf<bOD, AbstractC3893bOo.b> interfaceC4467bf) {
        h();
        this.h = interfaceC4467bf;
        return this;
    }

    @Override // o.bOC, o.AbstractC3893bOo, o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: a */
    public void e(AbstractC3893bOo.b bVar) {
        super.e(bVar);
        InterfaceC4414be<bOD, AbstractC3893bOo.b> interfaceC4414be = this.f;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, bVar);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: d */
    public void c(int i, AbstractC3893bOo.b bVar) {
        InterfaceC4732bk<bOD, AbstractC3893bOo.b> interfaceC4732bk = this.i;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, bVar, i);
        }
        super.a(i, (int) bVar);
    }

    public bOD a(InterfaceC4732bk<bOD, AbstractC3893bOo.b> interfaceC4732bk) {
        h();
        this.i = interfaceC4732bk;
        return this;
    }

    @Override // o.AbstractC3336ax
    /* renamed from: c */
    public void d(float f, float f2, int i, int i2, AbstractC3893bOo.b bVar) {
        InterfaceC4573bh<bOD, AbstractC3893bOo.b> interfaceC4573bh = this.j;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, bVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, bVar);
    }

    @Override // o.bOH
    /* renamed from: b */
    public bOD c(TrackingInfoHolder trackingInfoHolder) {
        h();
        super.a_(trackingInfoHolder);
        return this;
    }

    @Override // o.bOH
    /* renamed from: e */
    public bOD a(AbstractC5100bsQ abstractC5100bsQ) {
        h();
        super.b(abstractC5100bsQ);
        return this;
    }

    @Override // o.bOH
    /* renamed from: a */
    public bOD c(boolean z) {
        h();
        super.s_(z);
        return this;
    }

    @Override // o.bOH
    /* renamed from: b */
    public bOD d(Long l) {
        h();
        super.a(l);
        return this;
    }

    @Override // o.bOH
    /* renamed from: e */
    public bOD b(C9686vA c9686vA) {
        h();
        super.d(c9686vA);
        return this;
    }

    @Override // o.bOH
    /* renamed from: a */
    public bOD e(String str) {
        h();
        super.c(str);
        return this;
    }

    @Override // o.bOH
    /* renamed from: j */
    public bOD d(String str) {
        h();
        super.v_(str);
        return this;
    }

    @Override // o.bOH
    /* renamed from: f */
    public bOD b(String str) {
        h();
        super.u_(str);
        return this;
    }

    @Override // o.bOH
    /* renamed from: e */
    public bOD b(View.OnClickListener onClickListener) {
        h();
        super.d(onClickListener);
        return this;
    }

    @Override // o.bOH
    /* renamed from: d */
    public bOD a(Integer num) {
        h();
        super.l_(num);
        return this;
    }

    @Override // o.bOH
    /* renamed from: b */
    public bOD e(boolean z) {
        h();
        super.t_(z);
        return this;
    }

    @Override // o.bOH
    /* renamed from: j */
    public bOD d(boolean z) {
        h();
        super.u_(z);
        return this;
    }

    @Override // o.bOH
    /* renamed from: c */
    public bOD d(InterfaceC3825bMa.a aVar) {
        h();
        super.b(aVar);
        return this;
    }

    public bOD b(drO<? extends TrackingInfo> dro) {
        h();
        ((AbstractC3893bOo) this).d = dro;
        return this;
    }

    @Override // o.bOH
    /* renamed from: d */
    public bOD a(AppView appView) {
        h();
        this.c = appView;
        return this;
    }

    @Override // o.bOH
    /* renamed from: c */
    public bOD a(dwU dwu) {
        h();
        super.e(dwu);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: b */
    public bOD e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.bOH
    /* renamed from: c */
    public bOD b(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.bOH
    /* renamed from: e */
    public bOD d(int i) {
        super.a(i);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: e */
    public bOD a(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: e */
    public AbstractC3893bOo.b b(ViewParent viewParent) {
        return new AbstractC3893bOo.b();
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof bOD) && super.equals(obj)) {
            bOD bod = (bOD) obj;
            if ((this.h == null) != (bod.h == null)) {
                return false;
            }
            if ((this.f == null) != (bod.f == null)) {
                return false;
            }
            if ((this.i == null) != (bod.i == null)) {
                return false;
            }
            if ((this.j == null) != (bod.j == null)) {
                return false;
            }
            if ((w() == null) != (bod.w() == null)) {
                return false;
            }
            if ((z() == null) == (bod.z() == null) && y() == bod.y()) {
                if (v() == null ? bod.v() == null : v().equals(bod.v())) {
                    if (x() == null ? bod.x() == null : x().equals(bod.x())) {
                        if (l() == null ? bod.l() == null : l().equals(bod.l())) {
                            if (q() == null ? bod.q() == null : q().equals(bod.q())) {
                                if (o() == null ? bod.o() == null : o().equals(bod.o())) {
                                    if ((k() == null) != (bod.k() == null)) {
                                        return false;
                                    }
                                    if (t() == null ? bod.t() == null : t().equals(bod.t())) {
                                        if (s() == bod.s() && r() == bod.r()) {
                                            if (n() == null ? bod.n() == null : n().equals(bod.n())) {
                                                if ((((AbstractC3893bOo) this).d == null) != (((AbstractC3893bOo) bod).d == null)) {
                                                    return false;
                                                }
                                                AppView appView = this.c;
                                                if (appView == null ? bod.c == null : appView.equals(bod.c)) {
                                                    return (p() == null) == (bod.p() == null);
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
            return false;
        }
        return false;
    }

    @Override // o.AbstractC3073as
    public int hashCode() {
        int hashCode = super.hashCode();
        int i = this.h != null ? 1 : 0;
        int i2 = this.f != null ? 1 : 0;
        int i3 = this.i != null ? 1 : 0;
        int i4 = this.j != null ? 1 : 0;
        int i5 = w() != null ? 1 : 0;
        int i6 = z() != null ? 1 : 0;
        boolean y = y();
        int hashCode2 = v() != null ? v().hashCode() : 0;
        int hashCode3 = x() != null ? x().hashCode() : 0;
        int hashCode4 = l() != null ? l().hashCode() : 0;
        int hashCode5 = q() != null ? q().hashCode() : 0;
        int hashCode6 = o() != null ? o().hashCode() : 0;
        int i7 = k() != null ? 1 : 0;
        int hashCode7 = t() != null ? t().hashCode() : 0;
        boolean s = s();
        boolean r = r();
        int hashCode8 = n() != null ? n().hashCode() : 0;
        int i8 = ((AbstractC3893bOo) this).d != null ? 1 : 0;
        AppView appView = this.c;
        return (((((((((((((((((((((((((((((((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + i5) * 31) + i6) * 31) + (y ? 1 : 0)) * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + i7) * 31) + hashCode7) * 31) + (s ? 1 : 0)) * 31) + (r ? 1 : 0)) * 31) + hashCode8) * 31) + i8) * 31) + (appView != null ? appView.hashCode() : 0)) * 31) + (p() != null ? 1 : 0);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "GameMotionBillboardBackgroundModel_{trackingInfoHolder=" + w() + ", videoGroup=" + z() + ", showTopGradient=" + y() + ", playableId=" + v() + ", roundedCornersConfig=" + x() + ", gameId=" + l() + ", title=" + q() + ", heroImageUrl=" + o() + ", onClick=" + k() + ", width=" + t() + ", useColorExtraction=" + s() + ", useMeasuredHeight=" + r() + ", impressionInfo=" + n() + ", appView=" + this.c + ", scope=" + p() + "}" + super.toString();
    }
}
