package o;

import android.view.View;
import android.view.ViewParent;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.model.leafs.advisory.Advisory;
import java.util.List;
import o.AbstractC3073as;
import o.bGO;

/* loaded from: classes4.dex */
public class bGV extends bGO implements InterfaceC1673aK<bGO.c>, bGR {
    private InterfaceC4573bh<bGV, bGO.c> b;
    private InterfaceC4414be<bGV, bGO.c> c;
    private InterfaceC4467bf<bGV, bGO.c> d;
    private InterfaceC4732bk<bGV, bGO.c> g;

    @Override // o.InterfaceC1673aK
    /* renamed from: b */
    public void e(C1511aE c1511aE, bGO.c cVar, int i) {
    }

    @Override // o.bGR
    public /* synthetic */ bGR d(List list) {
        return b((List<? extends Advisory>) list);
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: e */
    public void a(bGO.c cVar, int i) {
        InterfaceC4467bf<bGV, bGO.c> interfaceC4467bf = this.d;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, cVar, i);
        }
    }

    @Override // o.bGO, o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: a */
    public void e(bGO.c cVar) {
        super.e(cVar);
        InterfaceC4414be<bGV, bGO.c> interfaceC4414be = this.c;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, cVar);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: e */
    public void c(int i, bGO.c cVar) {
        InterfaceC4732bk<bGV, bGO.c> interfaceC4732bk = this.g;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, cVar, i);
        }
        super.a(i, (int) cVar);
    }

    @Override // o.AbstractC3336ax
    public void d(float f, float f2, int i, int i2, bGO.c cVar) {
        InterfaceC4573bh<bGV, bGO.c> interfaceC4573bh = this.b;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, cVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, (int) cVar);
    }

    @Override // o.bGR
    /* renamed from: f */
    public bGV e(int i) {
        h();
        super.b(i);
        return this;
    }

    public bGV b(List<? extends Advisory> list) {
        h();
        super.c(list);
        return this;
    }

    @Override // o.bGR
    /* renamed from: f */
    public bGV e(String str) {
        h();
        super.h_(str);
        return this;
    }

    @Override // o.bGR
    /* renamed from: g */
    public bGV b(String str) {
        h();
        super.c(str);
        return this;
    }

    @Override // o.bGR
    /* renamed from: g */
    public bGV d(int i) {
        h();
        super.e_(i);
        return this;
    }

    @Override // o.bGR
    /* renamed from: e */
    public bGV c(VideoType videoType) {
        h();
        super.a(videoType);
        return this;
    }

    @Override // o.bGR
    /* renamed from: i */
    public bGV a(String str) {
        h();
        super.f_(str);
        return this;
    }

    @Override // o.bGR
    /* renamed from: h */
    public bGV d(String str) {
        h();
        super.g_(str);
        return this;
    }

    @Override // o.bGR
    /* renamed from: g */
    public bGV b(boolean z) {
        h();
        super.j_(z);
        return this;
    }

    @Override // o.bGR
    /* renamed from: e */
    public bGV d(boolean z) {
        h();
        super.i_(z);
        return this;
    }

    @Override // o.bGR
    /* renamed from: j */
    public bGV a(boolean z) {
        h();
        super.c(z);
        return this;
    }

    @Override // o.bGR
    /* renamed from: a */
    public bGV c(View.OnClickListener onClickListener) {
        h();
        super.b(onClickListener);
        return this;
    }

    @Override // o.bGR
    /* renamed from: e */
    public bGV b(CharSequence charSequence) {
        h();
        super.i_(charSequence);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: d */
    public bGV e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.bGR
    /* renamed from: c */
    public bGV d(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.bGR
    /* renamed from: i */
    public bGV c(int i) {
        super.a(i);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: c */
    public bGV a(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: c */
    public bGO.c b(ViewParent viewParent) {
        return new bGO.c();
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof bGV) && super.equals(obj)) {
            bGV bgv = (bGV) obj;
            if ((this.d == null) != (bgv.d == null)) {
                return false;
            }
            if ((this.c == null) != (bgv.c == null)) {
                return false;
            }
            if ((this.g == null) != (bgv.g == null)) {
                return false;
            }
            if ((this.b == null) == (bgv.b == null) && w() == bgv.w()) {
                if (i() == null ? bgv.i() == null : i().equals(bgv.i())) {
                    if (m() == null ? bgv.m() == null : m().equals(bgv.m())) {
                        if (q() == null ? bgv.q() == null : q().equals(bgv.q())) {
                            if (p() != bgv.p()) {
                                return false;
                            }
                            if (x() == null ? bgv.x() == null : x().equals(bgv.x())) {
                                if (k() == null ? bgv.k() == null : k().equals(bgv.k())) {
                                    if (l() == null ? bgv.l() == null : l().equals(bgv.l())) {
                                        if (u() == bgv.u() && y() == bgv.y() && v() == bgv.v() && r() == bgv.r()) {
                                            if ((s() == null) != (bgv.s() == null)) {
                                                return false;
                                            }
                                            if ((t() == null) != (bgv.t() == null)) {
                                                return false;
                                            }
                                            if (o() == null ? bgv.o() == null : o().equals(bgv.o())) {
                                                return n() == null ? bgv.n() == null : n().equals(bgv.n());
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
        int i = this.d != null ? 1 : 0;
        int i2 = this.c != null ? 1 : 0;
        int i3 = this.g != null ? 1 : 0;
        int i4 = this.b != null ? 1 : 0;
        int w = w();
        int hashCode2 = i() != null ? i().hashCode() : 0;
        int hashCode3 = m() != null ? m().hashCode() : 0;
        int hashCode4 = q() != null ? q().hashCode() : 0;
        int p = p();
        int hashCode5 = x() != null ? x().hashCode() : 0;
        int hashCode6 = k() != null ? k().hashCode() : 0;
        int hashCode7 = l() != null ? l().hashCode() : 0;
        boolean u = u();
        boolean y = y();
        boolean v = v();
        boolean r = r();
        int i5 = s() != null ? 1 : 0;
        int i6 = t() == null ? 0 : 1;
        return (((((((((((((((((((((((((((((((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + w) * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + p) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + (u ? 1 : 0)) * 31) + (y ? 1 : 0)) * 31) + (v ? 1 : 0)) * 31) + (r ? 1 : 0)) * 31) + i5) * 31) + i6) * 31) + (o() != null ? o().hashCode() : 0)) * 31) + (n() != null ? n().hashCode() : 0);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "DpMetadataModel_{year=" + w() + ", advisories=" + i() + ", certification=" + m() + ", seasonCountLabel=" + q() + ", runtime=" + p() + ", videoType=" + x() + ", capabilitiesBadges=" + k() + ", capabilitiesBadgesContentDescription=" + l() + ", showSpatialAudioBadge=" + u() + ", showAudioDescriptionBadge=" + y() + ", showClosedCaptionBadge=" + v() + ", loading=" + r() + ", onLoadingIndicatorClick=" + s() + ", onMetaDataClick=" + t() + ", horizontalMargin=" + o() + ", clickActivationPhrase=" + ((Object) n()) + "}" + super.toString();
    }
}
