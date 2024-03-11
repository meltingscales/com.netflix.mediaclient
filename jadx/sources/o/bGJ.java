package o;

import android.view.View;
import android.view.ViewParent;
import android.widget.CompoundButton;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.TrackingInfo;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.mediaclient.servicemgr.interface_.offline.WatchState;
import com.netflix.mediaclient.ui.offline.DownloadButton;
import o.AbstractC3073as;
import o.bGK;

/* loaded from: classes4.dex */
public class bGJ extends bGK implements InterfaceC1673aK<bGK.b>, bGN {
    private InterfaceC4467bf<bGJ, bGK.b> h;
    private InterfaceC4414be<bGJ, bGK.b> j;
    private InterfaceC4573bh<bGJ, bGK.b> l;
    private InterfaceC4732bk<bGJ, bGK.b> m;

    @Override // o.InterfaceC1673aK
    /* renamed from: b */
    public void e(C1511aE c1511aE, bGK.b bVar, int i) {
    }

    @Override // o.bGN
    public /* synthetic */ bGN c(InterfaceC4732bk interfaceC4732bk) {
        return a((InterfaceC4732bk<bGJ, bGK.b>) interfaceC4732bk);
    }

    @Override // o.bGN
    public /* synthetic */ bGN c(drO dro) {
        return a((drO<? extends TrackingInfo>) dro);
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: b */
    public void a(bGK.b bVar, int i) {
        InterfaceC4467bf<bGJ, bGK.b> interfaceC4467bf = this.h;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, bVar, i);
        }
    }

    @Override // o.bGK, o.AbstractC3336ax, o.AbstractC3073as
    public void e(bGK.b bVar) {
        super.e(bVar);
        InterfaceC4414be<bGJ, bGK.b> interfaceC4414be = this.j;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, bVar);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: d */
    public void c(int i, bGK.b bVar) {
        InterfaceC4732bk<bGJ, bGK.b> interfaceC4732bk = this.m;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, bVar, i);
        }
        super.a(i, (int) bVar);
    }

    public bGJ a(InterfaceC4732bk<bGJ, bGK.b> interfaceC4732bk) {
        h();
        this.m = interfaceC4732bk;
        return this;
    }

    @Override // o.AbstractC3336ax
    /* renamed from: b */
    public void d(float f, float f2, int i, int i2, bGK.b bVar) {
        InterfaceC4573bh<bGJ, bGK.b> interfaceC4573bh = this.l;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, bVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, bVar);
    }

    @Override // o.bGN
    /* renamed from: l */
    public bGJ h(CharSequence charSequence) {
        h();
        super.h_(charSequence);
        return this;
    }

    @Override // o.bGN
    /* renamed from: f */
    public bGJ e(int i) {
        h();
        super.c_(i);
        return this;
    }

    @Override // o.bGN
    /* renamed from: i */
    public bGJ e(CharSequence charSequence) {
        h();
        super.g_(charSequence);
        return this;
    }

    @Override // o.bGN
    /* renamed from: c */
    public bGJ b(String str) {
        h();
        super.c_(str);
        return this;
    }

    @Override // o.bGN
    /* renamed from: g */
    public bGJ d(CharSequence charSequence) {
        h();
        super.f_(charSequence);
        return this;
    }

    @Override // o.bGN
    /* renamed from: g */
    public bGJ c(int i) {
        h();
        super.a_(i);
        return this;
    }

    @Override // o.bGN
    /* renamed from: f */
    public bGJ b(CharSequence charSequence) {
        h();
        super.e_(charSequence);
        return this;
    }

    @Override // o.bGN
    /* renamed from: h */
    public bGJ b(int i) {
        h();
        super.d_(i);
        return this;
    }

    @Override // o.bGN
    /* renamed from: j */
    public bGJ c(boolean z) {
        h();
        super.e_(z);
        return this;
    }

    @Override // o.bGN
    /* renamed from: a */
    public bGJ d(String str) {
        h();
        super.d_(str);
        return this;
    }

    @Override // o.bGN
    /* renamed from: i */
    public bGJ a(boolean z) {
        h();
        super.d_(z);
        return this;
    }

    @Override // o.bGN
    /* renamed from: f */
    public bGJ e(boolean z) {
        h();
        super.f_(z);
        return this;
    }

    @Override // o.bGN
    /* renamed from: a */
    public bGJ d(bIN bin) {
        h();
        ((bGK) this).d = bin;
        return this;
    }

    @Override // o.bGN
    /* renamed from: a */
    public bGJ c(DownloadButton.ButtonState buttonState) {
        h();
        this.c = buttonState;
        return this;
    }

    @Override // o.bGN
    /* renamed from: j */
    public bGJ d(int i) {
        h();
        super.b_(i);
        return this;
    }

    @Override // o.bGN
    /* renamed from: e */
    public bGJ a(WatchState watchState) {
        h();
        super.c(watchState);
        return this;
    }

    @Override // o.bGN
    /* renamed from: j */
    public bGJ e(String str) {
        h();
        super.e_(str);
        return this;
    }

    @Override // o.bGN
    /* renamed from: c */
    public bGJ d(View.OnClickListener onClickListener) {
        h();
        super.a_(onClickListener);
        return this;
    }

    @Override // o.bGN
    /* renamed from: c */
    public bGJ e(AppView appView) {
        h();
        ((bGK) this).b = appView;
        return this;
    }

    @Override // o.bGN
    /* renamed from: h */
    public bGJ b(boolean z) {
        h();
        super.h_(z);
        return this;
    }

    @Override // o.bGN
    /* renamed from: g */
    public bGJ d(boolean z) {
        h();
        super.g_(z);
        return this;
    }

    @Override // o.bGN
    /* renamed from: b */
    public bGJ a(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        h();
        super.d(onCheckedChangeListener);
        return this;
    }

    @Override // o.bGN
    /* renamed from: b */
    public bGJ e(C9935zP c9935zP) {
        h();
        ((bGK) this).i = c9935zP;
        return this;
    }

    public bGJ a(drO<? extends TrackingInfo> dro) {
        h();
        ((bGK) this).f = dro;
        return this;
    }

    @Override // o.bGN
    /* renamed from: c */
    public bGJ b(TrackingInfoHolder trackingInfoHolder) {
        h();
        ((bGK) this).g = trackingInfoHolder;
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: b */
    public bGJ e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.bGN
    /* renamed from: j */
    public bGJ c(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: i */
    public bGJ a(int i) {
        super.a(i);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: d */
    public bGJ a(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: a */
    public bGK.b b(ViewParent viewParent) {
        return new bGK.b();
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof bGJ) && super.equals(obj)) {
            bGJ bgj = (bGJ) obj;
            if ((this.h == null) != (bgj.h == null)) {
                return false;
            }
            if ((this.j == null) != (bgj.j == null)) {
                return false;
            }
            if ((this.m == null) != (bgj.m == null)) {
                return false;
            }
            if ((this.l == null) != (bgj.l == null)) {
                return false;
            }
            if (E() == null ? bgj.E() == null : E().equals(bgj.E())) {
                if (t() != bgj.t()) {
                    return false;
                }
                if (F() == null ? bgj.F() == null : F().equals(bgj.F())) {
                    if (o() == null ? bgj.o() == null : o().equals(bgj.o())) {
                        if (x() == null ? bgj.x() == null : x().equals(bgj.x())) {
                            if (q() != bgj.q()) {
                                return false;
                            }
                            if (w() == null ? bgj.w() == null : w().equals(bgj.w())) {
                                if (z() == bgj.z() && s() == bgj.s()) {
                                    if (y() == null ? bgj.y() == null : y().equals(bgj.y())) {
                                        if (k() == bgj.k() && u() == bgj.u()) {
                                            bIN bin = ((bGK) this).d;
                                            if (bin == null ? ((bGK) bgj).d == null : bin.equals(((bGK) bgj).d)) {
                                                DownloadButton.ButtonState buttonState = this.c;
                                                if (buttonState == null ? bgj.c == null : buttonState.equals(bgj.c)) {
                                                    if (r() != bgj.r()) {
                                                        return false;
                                                    }
                                                    if (G() == null ? bgj.G() == null : G().equals(bgj.G())) {
                                                        if (D() == null ? bgj.D() == null : D().equals(bgj.D())) {
                                                            if ((l() == null) != (bgj.l() == null)) {
                                                                return false;
                                                            }
                                                            AppView appView = ((bGK) this).b;
                                                            if (appView == null ? ((bGK) bgj).b == null : appView.equals(((bGK) bgj).b)) {
                                                                if (A() == bgj.A() && B() == bgj.B()) {
                                                                    if ((C() == null) != (bgj.C() == null)) {
                                                                        return false;
                                                                    }
                                                                    if ((((bGK) this).i == null) != (((bGK) bgj).i == null)) {
                                                                        return false;
                                                                    }
                                                                    if ((((bGK) this).f == null) != (((bGK) bgj).f == null)) {
                                                                        return false;
                                                                    }
                                                                    return (((bGK) this).g == null) == (((bGK) bgj).g == null);
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
        int i2 = this.j != null ? 1 : 0;
        int i3 = this.m != null ? 1 : 0;
        int i4 = this.l != null ? 1 : 0;
        int hashCode2 = E() != null ? E().hashCode() : 0;
        int t = t();
        int hashCode3 = F() != null ? F().hashCode() : 0;
        int hashCode4 = o() != null ? o().hashCode() : 0;
        int hashCode5 = x() != null ? x().hashCode() : 0;
        int q = q();
        int hashCode6 = w() != null ? w().hashCode() : 0;
        int z = z();
        boolean s = s();
        int hashCode7 = y() != null ? y().hashCode() : 0;
        boolean k = k();
        boolean u = u();
        bIN bin = ((bGK) this).d;
        int hashCode8 = bin != null ? bin.hashCode() : 0;
        DownloadButton.ButtonState buttonState = this.c;
        int hashCode9 = buttonState != null ? buttonState.hashCode() : 0;
        int r = r();
        int hashCode10 = G() != null ? G().hashCode() : 0;
        int hashCode11 = D() != null ? D().hashCode() : 0;
        int i5 = hashCode9;
        int i6 = l() != null ? 1 : 0;
        AppView appView = ((bGK) this).b;
        int hashCode12 = appView != null ? appView.hashCode() : 0;
        boolean A = A();
        boolean B = B();
        int i7 = hashCode12;
        int i8 = C() != null ? 1 : 0;
        int i9 = ((bGK) this).i != null ? 1 : 0;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + hashCode2) * 31) + t) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + q) * 31) + hashCode6) * 31) + z) * 31) + (s ? 1 : 0)) * 31) + hashCode7) * 31) + (k ? 1 : 0)) * 31) + (u ? 1 : 0)) * 31) + hashCode8) * 31) + i5) * 31) + r) * 31) + hashCode10) * 31) + hashCode11) * 31) + i6) * 31) + i7) * 31) + (A ? 1 : 0)) * 31) + (B ? 1 : 0)) * 31) + i8) * 31) + i9) * 31) + (((bGK) this).f != null ? 1 : 0)) * 31) + (((bGK) this).g != null ? 1 : 0);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "DpEpisodeRowModel_{title=" + ((Object) E()) + ", episodeNumber=" + t() + ", synopsis=" + ((Object) F()) + ", contentDescription=" + o() + ", newBadge=" + ((Object) x()) + ", displayRuntime=" + q() + ", episodeTime=" + ((Object) w()) + ", progress=" + z() + ", currentEpisode=" + s() + ", imageUrl=" + y() + ", canPlay=" + k() + ", locked=" + u() + ", epoxyPlayable=" + ((bGK) this).d + ", downloadState=" + this.c + ", downloadProgress=" + r() + ", watchState=" + G() + ", playableId=" + D() + ", clickListener=" + l() + ", appView=" + ((bGK) this).b + ", showRemindMeButton=" + A() + ", remindMeButtonChecked=" + B() + ", onCheckedChangeListener=" + C() + ", eventBusFactory=" + ((bGK) this).i + ", trackingInfoHolder=" + ((bGK) this).g + "}" + super.toString();
    }
}
