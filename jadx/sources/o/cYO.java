package o;

import android.view.View;
import android.view.ViewParent;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.TrackingInfo;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import o.AbstractC3073as;
import o.InterfaceC3825bMa;
import o.cYL;

/* loaded from: classes5.dex */
public class cYO extends cYL implements InterfaceC1673aK<cYL.a>, cYR {
    private InterfaceC4467bf<cYO, cYL.a> b;
    private InterfaceC4414be<cYO, cYL.a> f;
    private InterfaceC4573bh<cYO, cYL.a> g;
    private InterfaceC4732bk<cYO, cYL.a> h;

    @Override // o.InterfaceC1673aK
    /* renamed from: c */
    public void e(C1511aE c1511aE, cYL.a aVar, int i) {
    }

    @Override // o.cYR
    public /* synthetic */ cYR b(drO dro) {
        return d((drO<? extends TrackingInfo>) dro);
    }

    @Override // o.cYR
    public /* synthetic */ cYR e(InterfaceC4732bk interfaceC4732bk) {
        return d((InterfaceC4732bk<cYO, cYL.a>) interfaceC4732bk);
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: b */
    public void a(cYL.a aVar, int i) {
        InterfaceC4467bf<cYO, cYL.a> interfaceC4467bf = this.b;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, aVar, i);
        }
    }

    @Override // o.cYL, o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: a */
    public void e(cYL.a aVar) {
        super.e(aVar);
        InterfaceC4414be<cYO, cYL.a> interfaceC4414be = this.f;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, aVar);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: d */
    public void c(int i, cYL.a aVar) {
        InterfaceC4732bk<cYO, cYL.a> interfaceC4732bk = this.h;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, aVar, i);
        }
        super.a(i, (int) aVar);
    }

    public cYO d(InterfaceC4732bk<cYO, cYL.a> interfaceC4732bk) {
        h();
        this.h = interfaceC4732bk;
        return this;
    }

    @Override // o.AbstractC3336ax
    /* renamed from: a */
    public void d(float f, float f2, int i, int i2, cYL.a aVar) {
        InterfaceC4573bh<cYO, cYL.a> interfaceC4573bh = this.g;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, aVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, aVar);
    }

    @Override // o.cYR
    /* renamed from: d */
    public cYO b(String str) {
        h();
        super.aj_(str);
        return this;
    }

    @Override // o.cYR
    /* renamed from: a */
    public cYO c(String str) {
        h();
        super.e(str);
        return this;
    }

    @Override // o.cYR
    /* renamed from: c */
    public cYO a(View.OnClickListener onClickListener) {
        h();
        super.e(onClickListener);
        return this;
    }

    @Override // o.cYR
    /* renamed from: e */
    public cYO d(TrackingInfoHolder trackingInfoHolder) {
        h();
        super.a(trackingInfoHolder);
        return this;
    }

    @Override // o.cYR
    /* renamed from: a */
    public cYO e(InterfaceC3825bMa.a aVar) {
        h();
        super.d(aVar);
        return this;
    }

    public cYO d(drO<? extends TrackingInfo> dro) {
        h();
        this.c = dro;
        return this;
    }

    @Override // o.cYR
    /* renamed from: e */
    public cYO c(AppView appView) {
        h();
        ((cYL) this).d = appView;
        return this;
    }

    @Override // o.cYR
    /* renamed from: b */
    public cYO c(boolean z) {
        h();
        super.a(z);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: d */
    public cYO e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.cYR
    /* renamed from: b */
    public cYO d(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: c */
    public cYO a(int i) {
        super.a(i);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: c */
    public cYO a(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: a */
    public cYL.a b(ViewParent viewParent) {
        return new cYL.a();
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof cYO) && super.equals(obj)) {
            cYO cyo = (cYO) obj;
            if ((this.b == null) != (cyo.b == null)) {
                return false;
            }
            if ((this.f == null) != (cyo.f == null)) {
                return false;
            }
            if ((this.h == null) != (cyo.h == null)) {
                return false;
            }
            if ((this.g == null) != (cyo.g == null)) {
                return false;
            }
            if (o() == null ? cyo.o() == null : o().equals(cyo.o())) {
                if (k() == null ? cyo.k() == null : k().equals(cyo.k())) {
                    if (r() == null ? cyo.r() == null : r().equals(cyo.r())) {
                        if ((q() == null) != (cyo.q() == null)) {
                            return false;
                        }
                        if ((s() == null) != (cyo.s() == null)) {
                            return false;
                        }
                        if (n() == null ? cyo.n() == null : n().equals(cyo.n())) {
                            if ((this.c == null) != (cyo.c == null)) {
                                return false;
                            }
                            AppView appView = ((cYL) this).d;
                            if (appView == null ? ((cYL) cyo).d == null : appView.equals(((cYL) cyo).d)) {
                                return l() == cyo.l();
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
        int i3 = this.h != null ? 1 : 0;
        int i4 = this.g != null ? 1 : 0;
        int hashCode2 = o() != null ? o().hashCode() : 0;
        int hashCode3 = k() != null ? k().hashCode() : 0;
        int hashCode4 = r() != null ? r().hashCode() : 0;
        int i5 = q() != null ? 1 : 0;
        int i6 = s() != null ? 1 : 0;
        int hashCode5 = n() != null ? n().hashCode() : 0;
        int i7 = this.c == null ? 0 : 1;
        AppView appView = ((cYL) this).d;
        return (((((((((((((((((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + i5) * 31) + i6) * 31) + hashCode5) * 31) + i7) * 31) + (appView != null ? appView.hashCode() : 0)) * 31) + (l() ? 1 : 0);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "GameReadyToPlayModel_{gameId=" + o() + ", iconImageUrl=" + k() + ", title=" + r() + ", onClick=" + q() + ", trackingInfoHolder=" + s() + ", impressionInfo=" + n() + ", appView=" + ((cYL) this).d + ", installed=" + l() + "}" + super.toString();
    }
}
