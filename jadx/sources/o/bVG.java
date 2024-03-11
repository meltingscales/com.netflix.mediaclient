package o;

import android.view.ViewParent;
import com.netflix.cl.model.AppView;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.mediaclient.servicemgr.interface_.details.LiveState;
import o.AbstractC3073as;
import o.InterfaceC3825bMa;
import o.bUY;

/* loaded from: classes4.dex */
public class bVG extends bVH implements InterfaceC1673aK<bUY.b>, bVF {
    private InterfaceC4573bh<bVG, bUY.b> f;
    private InterfaceC4414be<bVG, bUY.b> g;
    private InterfaceC4732bk<bVG, bUY.b> i;
    private InterfaceC4467bf<bVG, bUY.b> j;

    @Override // o.InterfaceC1673aK
    /* renamed from: b */
    public void e(C1511aE c1511aE, bUY.b bVar, int i) {
    }

    @Override // o.bVF
    public /* synthetic */ bVF a(InterfaceC4467bf interfaceC4467bf) {
        return e((InterfaceC4467bf<bVG, bUY.b>) interfaceC4467bf);
    }

    @Override // o.bVF
    public /* synthetic */ bVF a(InterfaceC4732bk interfaceC4732bk) {
        return b((InterfaceC4732bk<bVG, bUY.b>) interfaceC4732bk);
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: c */
    public void a(bUY.b bVar, int i) {
        InterfaceC4467bf<bVG, bUY.b> interfaceC4467bf = this.j;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, bVar, i);
        }
    }

    public bVG e(InterfaceC4467bf<bVG, bUY.b> interfaceC4467bf) {
        h();
        this.j = interfaceC4467bf;
        return this;
    }

    @Override // o.bUY, o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: d */
    public void e(bUY.b bVar) {
        super.e(bVar);
        InterfaceC4414be<bVG, bUY.b> interfaceC4414be = this.g;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, bVar);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    public void c(int i, bUY.b bVar) {
        InterfaceC4732bk<bVG, bUY.b> interfaceC4732bk = this.i;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, bVar, i);
        }
        super.a(i, (int) bVar);
    }

    public bVG b(InterfaceC4732bk<bVG, bUY.b> interfaceC4732bk) {
        h();
        this.i = interfaceC4732bk;
        return this;
    }

    @Override // o.AbstractC3336ax
    public void d(float f, float f2, int i, int i2, bUY.b bVar) {
        InterfaceC4573bh<bVG, bUY.b> interfaceC4573bh = this.f;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, bVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, (int) bVar);
    }

    @Override // o.bVF
    /* renamed from: e */
    public bVG b(InterfaceC3825bMa.a aVar) {
        h();
        super.b_(aVar);
        return this;
    }

    @Override // o.bVF
    /* renamed from: b */
    public bVG a(InterfaceC5180btr interfaceC5180btr) {
        h();
        ((bUY) this).b = interfaceC5180btr;
        return this;
    }

    @Override // o.bVF
    /* renamed from: c */
    public bVG d(TrackingInfoHolder trackingInfoHolder) {
        h();
        ((bUY) this).d = trackingInfoHolder;
        return this;
    }

    @Override // o.bVF
    /* renamed from: f */
    public bVG e(int i) {
        h();
        super.q_(i);
        return this;
    }

    @Override // o.bVF
    /* renamed from: b */
    public bVG c(LiveState liveState) {
        h();
        super.e(liveState);
        return this;
    }

    @Override // o.bVF
    /* renamed from: i */
    public bVG c(int i) {
        h();
        super.p_(i);
        return this;
    }

    @Override // o.bVF
    /* renamed from: c */
    public bVG d(AppView appView) {
        h();
        this.c = appView;
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: b */
    public bVG e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.bVF
    /* renamed from: d */
    public bVG e(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: d */
    public bVG a(int i) {
        super.a(i);
        return this;
    }

    @Override // o.bVF
    /* renamed from: c */
    public bVG e(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: a */
    public bUY.b b(ViewParent viewParent) {
        return new bUY.b();
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof bVG) && super.equals(obj)) {
            bVG bvg = (bVG) obj;
            if ((this.j == null) != (bvg.j == null)) {
                return false;
            }
            if ((this.g == null) != (bvg.g == null)) {
                return false;
            }
            if ((this.i == null) != (bvg.i == null)) {
                return false;
            }
            if ((this.f == null) != (bvg.f == null)) {
                return false;
            }
            if (n() == null ? bvg.n() == null : n().equals(bvg.n())) {
                if ((((bUY) this).b == null) != (((bUY) bvg).b == null)) {
                    return false;
                }
                if ((((bUY) this).d == null) == (((bUY) bvg).d == null) && r() == bvg.r() && q() == bvg.q()) {
                    if (l() == null ? bvg.l() == null : l().equals(bvg.l())) {
                        if (t() != bvg.t()) {
                            return false;
                        }
                        AppView appView = this.c;
                        AppView appView2 = bvg.c;
                        return appView == null ? appView2 == null : appView.equals(appView2);
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
        int i = this.j != null ? 1 : 0;
        int i2 = this.g != null ? 1 : 0;
        int i3 = this.i != null ? 1 : 0;
        int i4 = this.f != null ? 1 : 0;
        int hashCode2 = n() != null ? n().hashCode() : 0;
        int i5 = ((bUY) this).b != null ? 1 : 0;
        int i6 = ((bUY) this).d == null ? 0 : 1;
        int r = r();
        boolean q = q();
        int hashCode3 = l() != null ? l().hashCode() : 0;
        int t = t();
        AppView appView = this.c;
        return (((((((((((((((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + hashCode2) * 31) + i5) * 31) + i6) * 31) + r) * 31) + (q ? 1 : 0)) * 31) + hashCode3) * 31) + t) * 31) + (appView != null ? appView.hashCode() : 0);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "VerticalBillboardModel_{impressionInfo=" + n() + ", billboard=" + ((bUY) this).b + ", trackingInfoHolder=" + ((bUY) this).d + ", videoPosition=" + r() + ", onFirstPage=" + q() + ", liveState=" + l() + ", topPadding=" + t() + ", appView=" + this.c + "}" + super.toString();
    }
}
