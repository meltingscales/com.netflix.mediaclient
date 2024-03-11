package o;

import android.view.ViewParent;
import com.netflix.cl.model.AppView;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.mediaclient.servicemgr.interface_.details.LiveState;
import o.AbstractC3073as;
import o.InterfaceC3825bMa;
import o.bUY;

/* renamed from: o.bVc  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4070bVc extends bUY implements InterfaceC1673aK<bUY.b>, bUW {
    private InterfaceC4732bk<C4070bVc, bUY.b> g;
    private InterfaceC4467bf<C4070bVc, bUY.b> h;
    private InterfaceC4414be<C4070bVc, bUY.b> i;
    private InterfaceC4573bh<C4070bVc, bUY.b> j;

    @Override // o.InterfaceC1673aK
    /* renamed from: b */
    public void e(C1511aE c1511aE, bUY.b bVar, int i) {
    }

    @Override // o.bUW
    public /* synthetic */ bUW a(InterfaceC4732bk interfaceC4732bk) {
        return b((InterfaceC4732bk<C4070bVc, bUY.b>) interfaceC4732bk);
    }

    @Override // o.bUW
    public /* synthetic */ bUW b(InterfaceC4467bf interfaceC4467bf) {
        return d((InterfaceC4467bf<C4070bVc, bUY.b>) interfaceC4467bf);
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: d */
    public void a(bUY.b bVar, int i) {
        InterfaceC4467bf<C4070bVc, bUY.b> interfaceC4467bf = this.h;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, bVar, i);
        }
    }

    public C4070bVc d(InterfaceC4467bf<C4070bVc, bUY.b> interfaceC4467bf) {
        h();
        this.h = interfaceC4467bf;
        return this;
    }

    @Override // o.bUY, o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: d */
    public void e(bUY.b bVar) {
        super.e(bVar);
        InterfaceC4414be<C4070bVc, bUY.b> interfaceC4414be = this.i;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, bVar);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: b */
    public void c(int i, bUY.b bVar) {
        InterfaceC4732bk<C4070bVc, bUY.b> interfaceC4732bk = this.g;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, bVar, i);
        }
        super.a(i, (int) bVar);
    }

    public C4070bVc b(InterfaceC4732bk<C4070bVc, bUY.b> interfaceC4732bk) {
        h();
        this.g = interfaceC4732bk;
        return this;
    }

    @Override // o.AbstractC3336ax
    /* renamed from: a */
    public void d(float f, float f2, int i, int i2, bUY.b bVar) {
        InterfaceC4573bh<C4070bVc, bUY.b> interfaceC4573bh = this.j;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, bVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, bVar);
    }

    @Override // o.bUW
    /* renamed from: e */
    public C4070bVc b(InterfaceC3825bMa.a aVar) {
        h();
        super.b_(aVar);
        return this;
    }

    @Override // o.bUW
    /* renamed from: c */
    public C4070bVc a(InterfaceC5180btr interfaceC5180btr) {
        h();
        ((bUY) this).b = interfaceC5180btr;
        return this;
    }

    @Override // o.bUW
    /* renamed from: e */
    public C4070bVc d(TrackingInfoHolder trackingInfoHolder) {
        h();
        ((bUY) this).d = trackingInfoHolder;
        return this;
    }

    @Override // o.bUW
    /* renamed from: f */
    public C4070bVc d(int i) {
        h();
        super.q_(i);
        return this;
    }

    @Override // o.bUW
    /* renamed from: d */
    public C4070bVc c(LiveState liveState) {
        h();
        super.e(liveState);
        return this;
    }

    @Override // o.bUW
    /* renamed from: h */
    public C4070bVc b(int i) {
        h();
        super.p_(i);
        return this;
    }

    @Override // o.bUW
    /* renamed from: a */
    public C4070bVc b(AppView appView) {
        h();
        this.c = appView;
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: c */
    public C4070bVc e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.bUW
    /* renamed from: b */
    public C4070bVc e(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: c */
    public C4070bVc a(int i) {
        super.a(i);
        return this;
    }

    @Override // o.bUW
    /* renamed from: b */
    public C4070bVc e(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: d */
    public bUY.b b(ViewParent viewParent) {
        return new bUY.b();
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C4070bVc) && super.equals(obj)) {
            C4070bVc c4070bVc = (C4070bVc) obj;
            if ((this.h == null) != (c4070bVc.h == null)) {
                return false;
            }
            if ((this.i == null) != (c4070bVc.i == null)) {
                return false;
            }
            if ((this.g == null) != (c4070bVc.g == null)) {
                return false;
            }
            if ((this.j == null) != (c4070bVc.j == null)) {
                return false;
            }
            if (n() == null ? c4070bVc.n() == null : n().equals(c4070bVc.n())) {
                if ((((bUY) this).b == null) != (((bUY) c4070bVc).b == null)) {
                    return false;
                }
                if ((((bUY) this).d == null) == (((bUY) c4070bVc).d == null) && r() == c4070bVc.r() && q() == c4070bVc.q()) {
                    if (l() == null ? c4070bVc.l() == null : l().equals(c4070bVc.l())) {
                        if (t() != c4070bVc.t()) {
                            return false;
                        }
                        AppView appView = this.c;
                        AppView appView2 = c4070bVc.c;
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
        int i = this.h != null ? 1 : 0;
        int i2 = this.i != null ? 1 : 0;
        int i3 = this.g != null ? 1 : 0;
        int i4 = this.j != null ? 1 : 0;
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
        return "BillboardModel_{impressionInfo=" + n() + ", billboard=" + ((bUY) this).b + ", trackingInfoHolder=" + ((bUY) this).d + ", videoPosition=" + r() + ", onFirstPage=" + q() + ", liveState=" + l() + ", topPadding=" + t() + ", appView=" + this.c + "}" + super.toString();
    }
}
