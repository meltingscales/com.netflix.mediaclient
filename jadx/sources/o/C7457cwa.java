package o;

import android.view.View;
import android.view.ViewParent;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.mediaclient.servicemgr.interface_.offline.DownloadState;
import com.netflix.mediaclient.servicemgr.interface_.offline.StopReason;
import com.netflix.mediaclient.servicemgr.interface_.offline.WatchState;
import o.AbstractC3073as;
import o.AbstractC7402cvY;

/* renamed from: o.cwa  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C7457cwa extends AbstractC7402cvY implements InterfaceC1673aK<AbstractC7402cvY.a> {
    private InterfaceC4467bf<C7457cwa, AbstractC7402cvY.a> f;
    private InterfaceC4573bh<C7457cwa, AbstractC7402cvY.a> k;
    private InterfaceC4414be<C7457cwa, AbstractC7402cvY.a> m;

    /* renamed from: o  reason: collision with root package name */
    private InterfaceC4732bk<C7457cwa, AbstractC7402cvY.a> f13782o;

    public String B() {
        return ((AbstractC7402cvY) this).j;
    }

    public VideoType I() {
        return ((AbstractC7402cvY) this).g;
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: d */
    public void e(C1511aE c1511aE, AbstractC7402cvY.a aVar, int i) {
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: e */
    public void a(AbstractC7402cvY.a aVar, int i) {
        InterfaceC4467bf<C7457cwa, AbstractC7402cvY.a> interfaceC4467bf = this.f;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, aVar, i);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: c */
    public void e(AbstractC7402cvY.a aVar) {
        super.b((C7457cwa) aVar);
        InterfaceC4414be<C7457cwa, AbstractC7402cvY.a> interfaceC4414be = this.m;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, aVar);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: e */
    public void c(int i, AbstractC7402cvY.a aVar) {
        InterfaceC4732bk<C7457cwa, AbstractC7402cvY.a> interfaceC4732bk = this.f13782o;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, aVar, i);
        }
        super.a(i, (int) aVar);
    }

    @Override // o.AbstractC3336ax
    public void d(float f, float f2, int i, int i2, AbstractC7402cvY.a aVar) {
        InterfaceC4573bh<C7457cwa, AbstractC7402cvY.a> interfaceC4573bh = this.k;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, aVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, (int) aVar);
    }

    public C7457cwa d(String str) {
        h();
        ((AbstractC7402cvY) this).j = str;
        return this;
    }

    public C7457cwa a(VideoType videoType) {
        h();
        ((AbstractC7402cvY) this).g = videoType;
        return this;
    }

    public C7457cwa b(CharSequence charSequence) {
        h();
        super.d(charSequence);
        return this;
    }

    public C7457cwa e(WatchState watchState) {
        h();
        ((AbstractC7402cvY) this).h = watchState;
        return this;
    }

    public C7457cwa d(long j) {
        h();
        super.b(j);
        return this;
    }

    public C7457cwa a(DownloadState downloadState) {
        h();
        ((AbstractC7402cvY) this).b = downloadState;
        return this;
    }

    public C7457cwa e(StopReason stopReason) {
        h();
        super.c(stopReason);
        return this;
    }

    public C7457cwa f(int i) {
        h();
        super.c(i);
        return this;
    }

    public C7457cwa a(String str) {
        h();
        ((AbstractC7402cvY) this).i = str;
        return this;
    }

    public C7457cwa m(int i) {
        h();
        super.g(i);
        return this;
    }

    public C7457cwa j(int i) {
        h();
        super.d(i);
        return this;
    }

    public C7457cwa n(int i) {
        h();
        super.b(i);
        return this;
    }

    public C7457cwa h(int i) {
        h();
        super.e(i);
        return this;
    }

    public C7457cwa b(boolean z) {
        h();
        super.e(z);
        return this;
    }

    public C7457cwa c(boolean z) {
        h();
        super.a(z);
        return this;
    }

    public C7457cwa b(InterfaceC4308bc<C7457cwa, AbstractC7402cvY.a> interfaceC4308bc) {
        h();
        if (interfaceC4308bc == null) {
            super.d((View.OnClickListener) null);
        } else {
            super.d((View.OnClickListener) new View$OnClickListenerC4818bn(interfaceC4308bc));
        }
        return this;
    }

    public C7457cwa d(InterfaceC4308bc<C7457cwa, AbstractC7402cvY.a> interfaceC4308bc) {
        h();
        if (interfaceC4308bc == null) {
            super.e((View.OnClickListener) null);
        } else {
            super.e((View.OnClickListener) new View$OnClickListenerC4818bn(interfaceC4308bc));
        }
        return this;
    }

    public C7457cwa c(InterfaceC4308bc<C7457cwa, AbstractC7402cvY.a> interfaceC4308bc) {
        h();
        if (interfaceC4308bc == null) {
            super.a((View.OnClickListener) null);
        } else {
            super.a((View.OnClickListener) new View$OnClickListenerC4818bn(interfaceC4308bc));
        }
        return this;
    }

    public C7457cwa a(InterfaceC4361bd<C7457cwa, AbstractC7402cvY.a> interfaceC4361bd) {
        h();
        if (interfaceC4361bd == null) {
            super.d((View.OnLongClickListener) null);
        } else {
            super.d((View.OnLongClickListener) new View$OnClickListenerC4818bn(interfaceC4361bd));
        }
        return this;
    }

    public C7457cwa f(CharSequence charSequence) {
        h();
        super.e(charSequence);
        return this;
    }

    public C7457cwa c(String str) {
        h();
        super.e(str);
        return this;
    }

    public C7457cwa a(long j) {
        h();
        super.c(j);
        return this;
    }

    public boolean F() {
        return super.K();
    }

    @Override // o.AbstractC3073as
    /* renamed from: h */
    public C7457cwa e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: c */
    public C7457cwa a(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: i */
    public C7457cwa a(int i) {
        super.a(i);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: b */
    public C7457cwa a(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: a */
    public AbstractC7402cvY.a b(ViewParent viewParent) {
        return new AbstractC7402cvY.a();
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C7457cwa) && super.equals(obj)) {
            C7457cwa c7457cwa = (C7457cwa) obj;
            if ((this.f == null) != (c7457cwa.f == null)) {
                return false;
            }
            if ((this.m == null) != (c7457cwa.m == null)) {
                return false;
            }
            if ((this.f13782o == null) != (c7457cwa.f13782o == null)) {
                return false;
            }
            if ((this.k == null) != (c7457cwa.k == null)) {
                return false;
            }
            String str = ((AbstractC7402cvY) this).j;
            if (str == null ? ((AbstractC7402cvY) c7457cwa).j == null : str.equals(((AbstractC7402cvY) c7457cwa).j)) {
                VideoType videoType = ((AbstractC7402cvY) this).g;
                if (videoType == null ? ((AbstractC7402cvY) c7457cwa).g == null : videoType.equals(((AbstractC7402cvY) c7457cwa).g)) {
                    if (o() == null ? c7457cwa.o() == null : o().equals(c7457cwa.o())) {
                        WatchState watchState = ((AbstractC7402cvY) this).h;
                        if (watchState == null ? ((AbstractC7402cvY) c7457cwa).h == null : watchState.equals(((AbstractC7402cvY) c7457cwa).h)) {
                            if (r() != c7457cwa.r()) {
                                return false;
                            }
                            DownloadState downloadState = ((AbstractC7402cvY) this).b;
                            if (downloadState == null ? ((AbstractC7402cvY) c7457cwa).b == null : downloadState.equals(((AbstractC7402cvY) c7457cwa).b)) {
                                if (z() == null ? c7457cwa.z() == null : z().equals(c7457cwa.z())) {
                                    if (q() != c7457cwa.q()) {
                                        return false;
                                    }
                                    String str2 = ((AbstractC7402cvY) this).i;
                                    if (str2 == null ? ((AbstractC7402cvY) c7457cwa).i == null : str2.equals(((AbstractC7402cvY) c7457cwa).i)) {
                                        if (A() == c7457cwa.A() && u() == c7457cwa.u() && y() == c7457cwa.y() && t() == c7457cwa.t() && x() == c7457cwa.x() && k() == c7457cwa.k()) {
                                            if ((v() == null) != (c7457cwa.v() == null)) {
                                                return false;
                                            }
                                            if ((s() == null) != (c7457cwa.s() == null)) {
                                                return false;
                                            }
                                            if ((l() == null) != (c7457cwa.l() == null)) {
                                                return false;
                                            }
                                            if ((w() == null) != (c7457cwa.w() == null)) {
                                                return false;
                                            }
                                            if (n() == null ? c7457cwa.n() == null : n().equals(c7457cwa.n())) {
                                                if (i() == null ? c7457cwa.i() == null : i().equals(c7457cwa.i())) {
                                                    return m() == c7457cwa.m() && K() == c7457cwa.K() && N() == c7457cwa.N();
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
        int i = this.f != null ? 1 : 0;
        int i2 = this.m != null ? 1 : 0;
        int i3 = this.f13782o != null ? 1 : 0;
        int i4 = this.k != null ? 1 : 0;
        String str = ((AbstractC7402cvY) this).j;
        int hashCode2 = str != null ? str.hashCode() : 0;
        VideoType videoType = ((AbstractC7402cvY) this).g;
        int hashCode3 = videoType != null ? videoType.hashCode() : 0;
        int hashCode4 = o() != null ? o().hashCode() : 0;
        WatchState watchState = ((AbstractC7402cvY) this).h;
        int hashCode5 = watchState != null ? watchState.hashCode() : 0;
        int r = (int) (r() ^ (r() >>> 32));
        DownloadState downloadState = ((AbstractC7402cvY) this).b;
        int hashCode6 = downloadState != null ? downloadState.hashCode() : 0;
        int hashCode7 = z() != null ? z().hashCode() : 0;
        int q = q();
        String str2 = ((AbstractC7402cvY) this).i;
        int hashCode8 = str2 != null ? str2.hashCode() : 0;
        int A = A();
        int u = u();
        int y = y();
        int t = t();
        boolean x = x();
        boolean k = k();
        int i5 = v() != null ? 1 : 0;
        int i6 = s() != null ? 1 : 0;
        int i7 = l() != null ? 1 : 0;
        int i8 = w() != null ? 1 : 0;
        int hashCode9 = n() != null ? n().hashCode() : 0;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + r) * 31) + hashCode6) * 31) + hashCode7) * 31) + q) * 31) + hashCode8) * 31) + A) * 31) + u) * 31) + y) * 31) + t) * 31) + (x ? 1 : 0)) * 31) + (k ? 1 : 0)) * 31) + i5) * 31) + i6) * 31) + i7) * 31) + i8) * 31) + hashCode9) * 31) + (i() != null ? i().hashCode() : 0)) * 31) + ((int) (m() ^ (m() >>> 32)))) * 31) + (K() ? 1 : 0)) * 31) + (N() ? 1 : 0);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "DownloadedErrorVideoModel_{playableId=" + ((AbstractC7402cvY) this).j + ", videoType=" + ((AbstractC7402cvY) this).g + ", certification=" + ((Object) o()) + ", watchState=" + ((AbstractC7402cvY) this).h + ", expiringInMillis=" + r() + ", downloadState=" + ((AbstractC7402cvY) this).b + ", stopReason=" + z() + ", downloadProgress=" + q() + ", profileId=" + ((AbstractC7402cvY) this).i + ", trackId=" + A() + ", runtime=" + u() + ", seasonId=" + y() + ", episodeNumber=" + t() + ", hideEpisodeNumber=" + x() + ", canRenew=" + k() + ", renewClickListener=" + v() + ", deleteClickListener=" + s() + ", clickListener=" + l() + ", longClickListener=" + w() + ", title=" + ((Object) n()) + ", boxShotUrl=" + i() + ", currentSize=" + m() + ", selectable=" + K() + ", selected=" + N() + "}" + super.toString();
    }
}
