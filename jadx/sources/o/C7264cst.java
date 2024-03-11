package o;

import android.view.View;
import android.view.ViewParent;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.mediaclient.servicemgr.interface_.offline.DownloadState;
import com.netflix.mediaclient.servicemgr.interface_.offline.StopReason;
import com.netflix.mediaclient.servicemgr.interface_.offline.WatchState;
import com.netflix.mediaclient.ui.offline.DownloadButton;
import o.AbstractC3073as;
import o.AbstractC7260csp;

/* renamed from: o.cst  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C7264cst extends AbstractC7260csp implements InterfaceC1673aK<AbstractC7260csp.c> {
    private InterfaceC4573bh<C7264cst, AbstractC7260csp.c> l;
    private InterfaceC4732bk<C7264cst, AbstractC7260csp.c> m;
    private InterfaceC4414be<C7264cst, AbstractC7260csp.c> n;

    /* renamed from: o  reason: collision with root package name */
    private InterfaceC4467bf<C7264cst, AbstractC7260csp.c> f13768o;

    public String F() {
        return ((AbstractC7260csp) this).h;
    }

    public VideoType M() {
        return ((AbstractC7260csp) this).j;
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: c */
    public void e(C1511aE c1511aE, AbstractC7260csp.c cVar, int i) {
    }

    @Override // o.InterfaceC1673aK
    public void a(AbstractC7260csp.c cVar, int i) {
        InterfaceC4467bf<C7264cst, AbstractC7260csp.c> interfaceC4467bf = this.f13768o;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, cVar, i);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: c */
    public void e(AbstractC7260csp.c cVar) {
        super.b((C7264cst) cVar);
        InterfaceC4414be<C7264cst, AbstractC7260csp.c> interfaceC4414be = this.n;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, cVar);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    public void c(int i, AbstractC7260csp.c cVar) {
        InterfaceC4732bk<C7264cst, AbstractC7260csp.c> interfaceC4732bk = this.m;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, cVar, i);
        }
        super.a(i, (int) cVar);
    }

    @Override // o.AbstractC3336ax
    /* renamed from: a */
    public void d(float f, float f2, int i, int i2, AbstractC7260csp.c cVar) {
        InterfaceC4573bh<C7264cst, AbstractC7260csp.c> interfaceC4573bh = this.l;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, cVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, cVar);
    }

    public C7264cst e(InterfaceC4573bh<C7264cst, AbstractC7260csp.c> interfaceC4573bh) {
        h();
        this.l = interfaceC4573bh;
        return this;
    }

    public C7264cst c(String str) {
        h();
        ((AbstractC7260csp) this).h = str;
        return this;
    }

    public C7264cst c(boolean z) {
        h();
        super.a(z);
        return this;
    }

    public C7264cst e(VideoType videoType) {
        h();
        ((AbstractC7260csp) this).j = videoType;
        return this;
    }

    public C7264cst d(CharSequence charSequence) {
        h();
        super.c(charSequence);
        return this;
    }

    public C7264cst d(WatchState watchState) {
        h();
        ((AbstractC7260csp) this).f = watchState;
        return this;
    }

    public C7264cst e(Integer num) {
        h();
        super.b(num);
        return this;
    }

    public C7264cst a(long j) {
        h();
        super.b(j);
        return this;
    }

    public C7264cst c(DownloadState downloadState) {
        h();
        ((AbstractC7260csp) this).g = downloadState;
        return this;
    }

    public C7264cst e(StopReason stopReason) {
        h();
        super.b(stopReason);
        return this;
    }

    public C7264cst f(int i) {
        h();
        super.b(i);
        return this;
    }

    public C7264cst d(DownloadButton.ButtonState buttonState) {
        h();
        ((AbstractC7260csp) this).d = buttonState;
        return this;
    }

    public C7264cst b(String str) {
        h();
        ((AbstractC7260csp) this).i = str;
        return this;
    }

    public C7264cst a(TrackingInfoHolder trackingInfoHolder) {
        h();
        super.c(trackingInfoHolder);
        return this;
    }

    public TrackingInfoHolder E() {
        return super.D();
    }

    public C7264cst i(int i) {
        h();
        super.d(i);
        return this;
    }

    public C7264cst j(int i) {
        h();
        super.e(i);
        return this;
    }

    public C7264cst g(int i) {
        h();
        super.c(i);
        return this;
    }

    public C7264cst e(boolean z) {
        h();
        super.b(z);
        return this;
    }

    public C7264cst d(InterfaceC4308bc<C7264cst, AbstractC7260csp.c> interfaceC4308bc) {
        h();
        if (interfaceC4308bc == null) {
            super.b((View.OnClickListener) null);
        } else {
            super.b((View.OnClickListener) new View$OnClickListenerC4818bn(interfaceC4308bc));
        }
        return this;
    }

    public C7264cst b(InterfaceC4361bd<C7264cst, AbstractC7260csp.c> interfaceC4361bd) {
        h();
        if (interfaceC4361bd == null) {
            super.d((View.OnLongClickListener) null);
        } else {
            super.d((View.OnLongClickListener) new View$OnClickListenerC4818bn(interfaceC4361bd));
        }
        return this;
    }

    public C7264cst j(CharSequence charSequence) {
        h();
        super.e(charSequence);
        return this;
    }

    public C7264cst d(String str) {
        h();
        super.e(str);
        return this;
    }

    public C7264cst d(long j) {
        h();
        super.c(j);
        return this;
    }

    public boolean H() {
        return super.K();
    }

    @Override // o.AbstractC3073as
    /* renamed from: j */
    public C7264cst e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: b */
    public C7264cst a(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: h */
    public C7264cst a(int i) {
        super.a(i);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: b */
    public C7264cst a(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: c */
    public AbstractC7260csp.c b(ViewParent viewParent) {
        return new AbstractC7260csp.c();
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C7264cst) && super.equals(obj)) {
            C7264cst c7264cst = (C7264cst) obj;
            if ((this.f13768o == null) != (c7264cst.f13768o == null)) {
                return false;
            }
            if ((this.n == null) != (c7264cst.n == null)) {
                return false;
            }
            if ((this.m == null) != (c7264cst.m == null)) {
                return false;
            }
            if ((this.l == null) != (c7264cst.l == null)) {
                return false;
            }
            String str = ((AbstractC7260csp) this).h;
            if (str == null ? ((AbstractC7260csp) c7264cst).h == null : str.equals(((AbstractC7260csp) c7264cst).h)) {
                if (v() != c7264cst.v()) {
                    return false;
                }
                VideoType videoType = ((AbstractC7260csp) this).j;
                if (videoType == null ? ((AbstractC7260csp) c7264cst).j == null : videoType.equals(((AbstractC7260csp) c7264cst).j)) {
                    if (o() == null ? c7264cst.o() == null : o().equals(c7264cst.o())) {
                        WatchState watchState = ((AbstractC7260csp) this).f;
                        if (watchState == null ? ((AbstractC7260csp) c7264cst).f == null : watchState.equals(((AbstractC7260csp) c7264cst).f)) {
                            if (z() == null ? c7264cst.z() == null : z().equals(c7264cst.z())) {
                                if (q() != c7264cst.q()) {
                                    return false;
                                }
                                DownloadState downloadState = ((AbstractC7260csp) this).g;
                                if (downloadState == null ? ((AbstractC7260csp) c7264cst).g == null : downloadState.equals(((AbstractC7260csp) c7264cst).g)) {
                                    if (A() == null ? c7264cst.A() == null : A().equals(c7264cst.A())) {
                                        if (p() != c7264cst.p()) {
                                            return false;
                                        }
                                        DownloadButton.ButtonState buttonState = ((AbstractC7260csp) this).d;
                                        if (buttonState == null ? ((AbstractC7260csp) c7264cst).d == null : buttonState.equals(((AbstractC7260csp) c7264cst).d)) {
                                            String str2 = ((AbstractC7260csp) this).i;
                                            if (str2 == null ? ((AbstractC7260csp) c7264cst).i == null : str2.equals(((AbstractC7260csp) c7264cst).i)) {
                                                if (D() == null ? c7264cst.D() == null : D().equals(c7264cst.D())) {
                                                    if (y() == c7264cst.y() && x() == c7264cst.x() && r() == c7264cst.r() && s() == c7264cst.s()) {
                                                        if ((l() == null) != (c7264cst.l() == null)) {
                                                            return false;
                                                        }
                                                        if ((u() == null) != (c7264cst.u() == null)) {
                                                            return false;
                                                        }
                                                        if (n() == null ? c7264cst.n() == null : n().equals(c7264cst.n())) {
                                                            if (i() == null ? c7264cst.i() == null : i().equals(c7264cst.i())) {
                                                                return m() == c7264cst.m() && K() == c7264cst.K() && N() == c7264cst.N();
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
        int i = this.f13768o != null ? 1 : 0;
        int i2 = this.n != null ? 1 : 0;
        int i3 = this.m != null ? 1 : 0;
        int i4 = this.l != null ? 1 : 0;
        String str = ((AbstractC7260csp) this).h;
        int hashCode2 = str != null ? str.hashCode() : 0;
        boolean v = v();
        VideoType videoType = ((AbstractC7260csp) this).j;
        int hashCode3 = videoType != null ? videoType.hashCode() : 0;
        int hashCode4 = o() != null ? o().hashCode() : 0;
        WatchState watchState = ((AbstractC7260csp) this).f;
        int hashCode5 = watchState != null ? watchState.hashCode() : 0;
        int hashCode6 = z() != null ? z().hashCode() : 0;
        int q = (int) (q() ^ (q() >>> 32));
        DownloadState downloadState = ((AbstractC7260csp) this).g;
        int hashCode7 = downloadState != null ? downloadState.hashCode() : 0;
        int hashCode8 = A() != null ? A().hashCode() : 0;
        int p = p();
        DownloadButton.ButtonState buttonState = ((AbstractC7260csp) this).d;
        int hashCode9 = buttonState != null ? buttonState.hashCode() : 0;
        String str2 = ((AbstractC7260csp) this).i;
        int hashCode10 = str2 != null ? str2.hashCode() : 0;
        int hashCode11 = D() != null ? D().hashCode() : 0;
        int y = y();
        int x = x();
        int r = r();
        boolean s = s();
        int i5 = l() != null ? 1 : 0;
        int i6 = u() != null ? 1 : 0;
        int hashCode12 = n() != null ? n().hashCode() : 0;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + hashCode2) * 31) + (v ? 1 : 0)) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + q) * 31) + hashCode7) * 31) + hashCode8) * 31) + p) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + y) * 31) + x) * 31) + r) * 31) + (s ? 1 : 0)) * 31) + i5) * 31) + i6) * 31) + hashCode12) * 31) + (i() != null ? i().hashCode() : 0)) * 31) + ((int) (m() ^ (m() >>> 32)))) * 31) + (K() ? 1 : 0)) * 31) + (N() ? 1 : 0);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "DownloadedVideoModel_{playableId=" + ((AbstractC7260csp) this).h + ", playable=" + v() + ", videoType=" + ((AbstractC7260csp) this).j + ", certification=" + ((Object) o()) + ", watchState=" + ((AbstractC7260csp) this).f + ", watchProgress=" + z() + ", expiringInMillis=" + q() + ", downloadState=" + ((AbstractC7260csp) this).g + ", stopReason=" + A() + ", downloadProgress=" + p() + ", downloadButtonState=" + ((AbstractC7260csp) this).d + ", profileId=" + ((AbstractC7260csp) this).i + ", trackingInfoHolder=" + D() + ", runtime=" + y() + ", seasonId=" + x() + ", episodeNumber=" + r() + ", hideEpisodeNumber=" + s() + ", clickListener=" + l() + ", longClickListener=" + u() + ", title=" + ((Object) n()) + ", boxShotUrl=" + i() + ", currentSize=" + m() + ", selectable=" + K() + ", selected=" + N() + "}" + super.toString();
    }
}
