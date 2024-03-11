package o;

import android.view.ViewParent;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.TrackingInfo;
import o.AbstractC3073as;
import o.InterfaceC3825bMa;
import o.bOL;

/* loaded from: classes4.dex */
public class bOJ extends bOL implements InterfaceC1673aK<bOL.a>, bOM {
    private InterfaceC4573bh<bOJ, bOL.a> f;
    private InterfaceC4732bk<bOJ, bOL.a> h;
    private InterfaceC4414be<bOJ, bOL.a> i;
    private InterfaceC4467bf<bOJ, bOL.a> j;

    @Override // o.InterfaceC1673aK
    /* renamed from: a */
    public void e(C1511aE c1511aE, bOL.a aVar, int i) {
    }

    @Override // o.bOM
    public /* synthetic */ bOM b(InterfaceC4732bk interfaceC4732bk) {
        return d((InterfaceC4732bk<bOJ, bOL.a>) interfaceC4732bk);
    }

    @Override // o.bOM
    public /* synthetic */ bOM c(InterfaceC4467bf interfaceC4467bf) {
        return a((InterfaceC4467bf<bOJ, bOL.a>) interfaceC4467bf);
    }

    @Override // o.bOM
    public /* synthetic */ bOM c(drM drm) {
        return a((drM<? super drM<? super String, dpR>, dpR>) drm);
    }

    @Override // o.bOM
    public /* synthetic */ bOM c(drO dro) {
        return e((drO<? extends TrackingInfo>) dro);
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: d */
    public void a(bOL.a aVar, int i) {
        InterfaceC4467bf<bOJ, bOL.a> interfaceC4467bf = this.j;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, aVar, i);
        }
    }

    public bOJ a(InterfaceC4467bf<bOJ, bOL.a> interfaceC4467bf) {
        h();
        this.j = interfaceC4467bf;
        return this;
    }

    @Override // o.bOL, o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: c */
    public void e(bOL.a aVar) {
        super.e(aVar);
        InterfaceC4414be<bOJ, bOL.a> interfaceC4414be = this.i;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, aVar);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public void c(int i, bOL.a aVar) {
        InterfaceC4732bk<bOJ, bOL.a> interfaceC4732bk = this.h;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, aVar, i);
        }
        super.a(i, (int) aVar);
    }

    public bOJ d(InterfaceC4732bk<bOJ, bOL.a> interfaceC4732bk) {
        h();
        this.h = interfaceC4732bk;
        return this;
    }

    @Override // o.AbstractC3336ax
    public void d(float f, float f2, int i, int i2, bOL.a aVar) {
        InterfaceC4573bh<bOJ, bOL.a> interfaceC4573bh = this.f;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, aVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, (int) aVar);
    }

    @Override // o.bOM
    /* renamed from: b */
    public bOJ a(InterfaceC3825bMa.a aVar) {
        h();
        super.e(aVar);
        return this;
    }

    public bOJ e(drO<? extends TrackingInfo> dro) {
        h();
        ((bOL) this).g = dro;
        return this;
    }

    public bOJ a(drM<? super drM<? super String, dpR>, dpR> drm) {
        h();
        this.c = drm;
        return this;
    }

    @Override // o.bOM
    /* renamed from: c */
    public bOJ b(AppView appView) {
        h();
        ((bOL) this).b = appView;
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: b */
    public bOJ e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.bOM
    /* renamed from: d */
    public bOJ e(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: e */
    public bOJ a(int i) {
        super.a(i);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: c */
    public bOJ a(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: d */
    public bOL.a b(ViewParent viewParent) {
        return new bOL.a();
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof bOJ) && super.equals(obj)) {
            bOJ boj = (bOJ) obj;
            if ((this.j == null) != (boj.j == null)) {
                return false;
            }
            if ((this.i == null) != (boj.i == null)) {
                return false;
            }
            if ((this.h == null) != (boj.h == null)) {
                return false;
            }
            if ((this.f == null) != (boj.f == null)) {
                return false;
            }
            if (n() == null ? boj.n() == null : n().equals(boj.n())) {
                if ((((bOL) this).g == null) != (((bOL) boj).g == null)) {
                    return false;
                }
                if ((this.c == null) != (boj.c == null)) {
                    return false;
                }
                AppView appView = ((bOL) this).b;
                if (appView == null ? ((bOL) boj).b == null : appView.equals(((bOL) boj).b)) {
                    return (((bOL) this).d == null) == (((bOL) boj).d == null);
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
        int i2 = this.i != null ? 1 : 0;
        int i3 = this.h != null ? 1 : 0;
        int i4 = this.f != null ? 1 : 0;
        int hashCode2 = n() != null ? n().hashCode() : 0;
        int i5 = ((bOL) this).g != null ? 1 : 0;
        int i6 = this.c != null ? 1 : 0;
        AppView appView = ((bOL) this).b;
        return (((((((((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + hashCode2) * 31) + i5) * 31) + i6) * 31) + (appView != null ? appView.hashCode() : 0)) * 31) + (((bOL) this).d != null ? 1 : 0);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "GamesFeatureEducationBillboardModel_{impressionInfo=" + n() + ", appView=" + ((bOL) this).b + ", eventBusFactory=" + ((bOL) this).d + "}" + super.toString();
    }
}
