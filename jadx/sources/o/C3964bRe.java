package o;

import android.view.View;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.TrackingInfo;
import com.netflix.mediaclient.ui.miniplayer.api.MiniPlayerControlsType;
import com.netflix.mediaclient.ui.miniplayer.api.MiniPlayerVideoGroupViewModel;
import com.netflix.mediaclient.util.PlayContext;
import o.AbstractC3073as;
import o.AbstractC6729cim;

/* renamed from: o.bRe  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C3964bRe extends bQY implements InterfaceC1673aK<AbstractC6729cim.b>, InterfaceC3967bRh {
    private InterfaceC4467bf<C3964bRe, AbstractC6729cim.b> f;
    private InterfaceC4573bh<C3964bRe, AbstractC6729cim.b> l;
    private InterfaceC4732bk<C3964bRe, AbstractC6729cim.b> n;

    /* renamed from: o  reason: collision with root package name */
    private InterfaceC4414be<C3964bRe, AbstractC6729cim.b> f13537o;

    @Override // o.InterfaceC1673aK
    public void e(C1511aE c1511aE, AbstractC6729cim.b bVar, int i) {
    }

    @Override // o.InterfaceC3967bRh
    public /* synthetic */ InterfaceC3967bRh b(InterfaceC4732bk interfaceC4732bk) {
        return c((InterfaceC4732bk<C3964bRe, AbstractC6729cim.b>) interfaceC4732bk);
    }

    @Override // o.InterfaceC3967bRh
    public /* synthetic */ InterfaceC3967bRh e(drX drx) {
        return d((drX<? super View, ? super Boolean, dpR>) drx);
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: b */
    public void a(AbstractC6729cim.b bVar, int i) {
        InterfaceC4467bf<C3964bRe, AbstractC6729cim.b> interfaceC4467bf = this.f;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, bVar, i);
        }
    }

    public C3964bRe a(InterfaceC4467bf<C3964bRe, AbstractC6729cim.b> interfaceC4467bf) {
        h();
        this.f = interfaceC4467bf;
        return this;
    }

    @Override // o.bQY, o.AbstractC6729cim, o.AbstractC3336ax, o.AbstractC3073as
    public void e(AbstractC6729cim.b bVar) {
        super.e(bVar);
        InterfaceC4414be<C3964bRe, AbstractC6729cim.b> interfaceC4414be = this.f13537o;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, bVar);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: d */
    public void c(int i, AbstractC6729cim.b bVar) {
        InterfaceC4732bk<C3964bRe, AbstractC6729cim.b> interfaceC4732bk = this.n;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, bVar, i);
        }
        super.a(i, (int) bVar);
    }

    public C3964bRe c(InterfaceC4732bk<C3964bRe, AbstractC6729cim.b> interfaceC4732bk) {
        h();
        this.n = interfaceC4732bk;
        return this;
    }

    @Override // o.AbstractC3336ax
    /* renamed from: b */
    public void d(float f, float f2, int i, int i2, AbstractC6729cim.b bVar) {
        InterfaceC4573bh<C3964bRe, AbstractC6729cim.b> interfaceC4573bh = this.l;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, bVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, (int) bVar);
    }

    @Override // o.InterfaceC3967bRh
    /* renamed from: j */
    public C3964bRe c(int i) {
        h();
        super.o_(i);
        return this;
    }

    public C3964bRe c(drO<? extends TrackingInfo> dro) {
        h();
        ((bQY) this).c = dro;
        return this;
    }

    @Override // o.InterfaceC3967bRh
    /* renamed from: i */
    public C3964bRe e(String str) {
        h();
        super.p(str);
        return this;
    }

    @Override // o.InterfaceC3967bRh
    /* renamed from: c */
    public C3964bRe e(boolean z) {
        h();
        super.h(z);
        return this;
    }

    @Override // o.InterfaceC3967bRh
    /* renamed from: k */
    public C3964bRe e(int i) {
        h();
        super.m(i);
        return this;
    }

    @Override // o.InterfaceC3967bRh
    /* renamed from: e */
    public C3964bRe b(PlayContext playContext) {
        h();
        ((AbstractC6729cim) this).h = playContext;
        return this;
    }

    @Override // o.InterfaceC3967bRh
    /* renamed from: o */
    public C3964bRe f(int i) {
        h();
        super.r(i);
        return this;
    }

    @Override // o.InterfaceC3967bRh
    /* renamed from: b */
    public C3964bRe d(Float f) {
        h();
        super.b_(f);
        return this;
    }

    @Override // o.InterfaceC3967bRh
    /* renamed from: f */
    public C3964bRe d(String str) {
        h();
        super.o(str);
        return this;
    }

    @Override // o.InterfaceC3967bRh
    /* renamed from: l */
    public C3964bRe j(String str) {
        h();
        super.x(str);
        return this;
    }

    @Override // o.InterfaceC3967bRh
    /* renamed from: a */
    public C3964bRe d(boolean z) {
        h();
        super.i(z);
        return this;
    }

    @Override // o.InterfaceC3967bRh
    /* renamed from: d */
    public C3964bRe e(AppView appView) {
        h();
        super.c_(appView);
        return this;
    }

    @Override // o.InterfaceC3967bRh
    /* renamed from: k */
    public C3964bRe b(String str) {
        h();
        super.t(str);
        return this;
    }

    @Override // o.InterfaceC3967bRh
    /* renamed from: g */
    public C3964bRe b(boolean z) {
        h();
        super.j(z);
        return this;
    }

    public C3964bRe a(MiniPlayerControlsType miniPlayerControlsType) {
        h();
        super.a_(miniPlayerControlsType);
        return this;
    }

    @Override // o.InterfaceC3967bRh
    /* renamed from: g */
    public C3964bRe c(String str) {
        h();
        super.r(str);
        return this;
    }

    @Override // o.InterfaceC3967bRh
    /* renamed from: d */
    public C3964bRe a(MiniPlayerVideoGroupViewModel miniPlayerVideoGroupViewModel) {
        h();
        ((AbstractC6729cim) this).j = miniPlayerVideoGroupViewModel;
        return this;
    }

    @Override // o.InterfaceC3967bRh
    /* renamed from: h */
    public C3964bRe a(String str) {
        h();
        ((AbstractC6729cim) this).i = str;
        return this;
    }

    @Override // o.InterfaceC3967bRh
    /* renamed from: a */
    public C3964bRe e(InterfaceC6718cib interfaceC6718cib) {
        h();
        ((AbstractC6729cim) this).g = interfaceC6718cib;
        return this;
    }

    @Override // o.InterfaceC3967bRh
    /* renamed from: c */
    public C3964bRe e(C9935zP c9935zP) {
        h();
        ((AbstractC6729cim) this).d = c9935zP;
        return this;
    }

    public C3964bRe d(drX<? super View, ? super Boolean, dpR> drx) {
        h();
        super.b(drx);
        return this;
    }

    @Override // o.InterfaceC3967bRh
    /* renamed from: d */
    public C3964bRe a(C9686vA c9686vA) {
        h();
        super.c(c9686vA);
        return this;
    }

    public C3964bRe g(int i) {
        h();
        super.l(i);
        return this;
    }

    @Override // o.InterfaceC3967bRh
    /* renamed from: i */
    public C3964bRe b(int i) {
        h();
        super.n(i);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: c */
    public C3964bRe e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.InterfaceC3967bRh
    /* renamed from: d */
    public C3964bRe c(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.InterfaceC3967bRh
    /* renamed from: h */
    public C3964bRe d(int i) {
        super.a(i);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: e */
    public C3964bRe a(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C3964bRe) && super.equals(obj)) {
            C3964bRe c3964bRe = (C3964bRe) obj;
            if ((this.f == null) != (c3964bRe.f == null)) {
                return false;
            }
            if ((this.f13537o == null) != (c3964bRe.f13537o == null)) {
                return false;
            }
            if ((this.n == null) != (c3964bRe.n == null)) {
                return false;
            }
            if ((this.l == null) == (c3964bRe.l == null) && e() == c3964bRe.e()) {
                if ((((bQY) this).c == null) != (((bQY) c3964bRe).c == null)) {
                    return false;
                }
                if (n() == null ? c3964bRe.n() == null : n().equals(c3964bRe.n())) {
                    if (G() == null ? c3964bRe.G() == null : G().equals(c3964bRe.G())) {
                        if (q() != c3964bRe.q()) {
                            return false;
                        }
                        if (k() == null ? c3964bRe.k() == null : k().equals(c3964bRe.k())) {
                            if (A() == c3964bRe.A() && z() == c3964bRe.z()) {
                                if ((((AbstractC6729cim) this).h == null) == (((AbstractC6729cim) c3964bRe).h == null) && N() == c3964bRe.N()) {
                                    if (P() == null ? c3964bRe.P() == null : P().equals(c3964bRe.P())) {
                                        if (Q() == null ? c3964bRe.Q() == null : Q().equals(c3964bRe.Q())) {
                                            if (u() == null ? c3964bRe.u() == null : u().equals(c3964bRe.u())) {
                                                if (y() == null ? c3964bRe.y() == null : y().equals(c3964bRe.y())) {
                                                    if (v() == null ? c3964bRe.v() == null : v().equals(c3964bRe.v())) {
                                                        if ((w() == null) != (c3964bRe.w() == null)) {
                                                            return false;
                                                        }
                                                        if (W() == null ? c3964bRe.W() == null : W().equals(c3964bRe.W())) {
                                                            if (t() == null ? c3964bRe.t() == null : t().equals(c3964bRe.t())) {
                                                                if (L() == c3964bRe.L() && S() == c3964bRe.S()) {
                                                                    if (aj_() == null ? c3964bRe.aj_() == null : aj_().equals(c3964bRe.aj_())) {
                                                                        if (T() == null ? c3964bRe.T() == null : T().equals(c3964bRe.T())) {
                                                                            if (M() == null ? c3964bRe.M() == null : M().equals(c3964bRe.M())) {
                                                                                if (O() == null ? c3964bRe.O() == null : O().equals(c3964bRe.O())) {
                                                                                    if (R() != c3964bRe.R()) {
                                                                                        return false;
                                                                                    }
                                                                                    if (x() == null ? c3964bRe.x() == null : x().equals(c3964bRe.x())) {
                                                                                        if (B() == null ? c3964bRe.B() == null : B().equals(c3964bRe.B())) {
                                                                                            if ((((AbstractC6729cim) this).j == null) != (((AbstractC6729cim) c3964bRe).j == null)) {
                                                                                                return false;
                                                                                            }
                                                                                            String str = ((AbstractC6729cim) this).i;
                                                                                            if (str == null ? ((AbstractC6729cim) c3964bRe).i == null : str.equals(((AbstractC6729cim) c3964bRe).i)) {
                                                                                                if ((((AbstractC6729cim) this).g == null) != (((AbstractC6729cim) c3964bRe).g == null)) {
                                                                                                    return false;
                                                                                                }
                                                                                                if ((((AbstractC6729cim) this).d == null) != (((AbstractC6729cim) c3964bRe).d == null)) {
                                                                                                    return false;
                                                                                                }
                                                                                                if ((D() == null) != (c3964bRe.D() == null)) {
                                                                                                    return false;
                                                                                                }
                                                                                                if (J() == null ? c3964bRe.J() == null : J().equals(c3964bRe.J())) {
                                                                                                    if (p() == c3964bRe.p() && l() == c3964bRe.l()) {
                                                                                                        if (U() == null ? c3964bRe.U() == null : U().equals(c3964bRe.U())) {
                                                                                                            if (r() != c3964bRe.r()) {
                                                                                                                return false;
                                                                                                            }
                                                                                                            return (F() == null) == (c3964bRe.F() == null);
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
        int i2 = this.f13537o != null ? 1 : 0;
        int i3 = this.n != null ? 1 : 0;
        int i4 = this.l != null ? 1 : 0;
        int e = e();
        int i5 = ((bQY) this).c != null ? 1 : 0;
        int hashCode2 = n() != null ? n().hashCode() : 0;
        int hashCode3 = G() != null ? G().hashCode() : 0;
        boolean q = q();
        int hashCode4 = k() != null ? k().hashCode() : 0;
        int A = A();
        int z = z();
        int i6 = ((AbstractC6729cim) this).h != null ? 1 : 0;
        int N = N();
        int hashCode5 = P() != null ? P().hashCode() : 0;
        int hashCode6 = Q() != null ? Q().hashCode() : 0;
        int hashCode7 = u() != null ? u().hashCode() : 0;
        int hashCode8 = y() != null ? y().hashCode() : 0;
        int hashCode9 = v() != null ? v().hashCode() : 0;
        int i7 = w() != null ? 1 : 0;
        int hashCode10 = W() != null ? W().hashCode() : 0;
        int hashCode11 = t() != null ? t().hashCode() : 0;
        boolean L = L();
        boolean S = S();
        int hashCode12 = aj_() != null ? aj_().hashCode() : 0;
        int hashCode13 = T() != null ? T().hashCode() : 0;
        int hashCode14 = M() != null ? M().hashCode() : 0;
        int hashCode15 = O() != null ? O().hashCode() : 0;
        boolean R = R();
        int hashCode16 = x() != null ? x().hashCode() : 0;
        int hashCode17 = B() != null ? B().hashCode() : 0;
        int i8 = ((AbstractC6729cim) this).j != null ? 1 : 0;
        String str = ((AbstractC6729cim) this).i;
        int hashCode18 = str != null ? str.hashCode() : 0;
        int i9 = ((AbstractC6729cim) this).g != null ? 1 : 0;
        int i10 = ((AbstractC6729cim) this).d != null ? 1 : 0;
        int i11 = D() != null ? 1 : 0;
        int hashCode19 = J() != null ? J().hashCode() : 0;
        int p = p();
        int l = l();
        int hashCode20 = U() != null ? U().hashCode() : 0;
        int i12 = i6;
        int i13 = i10;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + e) * 31) + i5) * 31) + hashCode2) * 31) + hashCode3) * 31) + (q ? 1 : 0)) * 31) + hashCode4) * 31) + A) * 31) + z) * 31) + i12) * 31) + N) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + i7) * 31) + hashCode10) * 31) + hashCode11) * 31) + (L ? 1 : 0)) * 31) + (S ? 1 : 0)) * 31) + hashCode12) * 31) + hashCode13) * 31) + hashCode14) * 31) + hashCode15) * 31) + (R ? 1 : 0)) * 31) + hashCode16) * 31) + hashCode17) * 31) + i8) * 31) + hashCode18) * 31) + i9) * 31) + i13) * 31) + i11) * 31) + hashCode19) * 31) + p) * 31) + l) * 31) + hashCode20) * 31) + ((int) (r() ^ (r() >>> 32)))) * 31) + (F() != null ? 1 : 0);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "GameTrailerModel_{autoPlayRank=" + e() + ", impressionInfo=" + n() + ", playableId=" + G() + ", hideFullscreenControl=" + q() + ", accentColor=" + k() + ", miniPlayerPosition=" + A() + ", miniPlayerRow=" + z() + ", playContext=" + ((AbstractC6729cim) this).h + ", runtimeSeconds=" + N() + ", topNodeVideoId=" + P() + ", topNodeVideoType=" + Q() + ", imageAspectRatio=" + u() + ", imageUrl=" + y() + ", imageResId=" + v() + ", imageId=" + w() + ", videoTitle=" + W() + ", certificationRating=" + t() + ", shouldLoop=" + L() + ", silent=" + S() + ", appView=" + aj_() + ", uiLocation=" + T() + ", profileLanguage=" + M() + ", supplementalVideoType=" + O() + ", tapToPlayPauseEnabled=" + R() + ", miniPlayerControlsType=" + x() + ", playButtonIdleContentDescription=" + B() + ", playerViewModel=" + ((AbstractC6729cim) this).j + ", playlistId=" + ((AbstractC6729cim) this).i + ", playerEventListener=" + ((AbstractC6729cim) this).g + ", eventBusFactory=" + ((AbstractC6729cim) this).d + ", roundedCornerConfig=" + J() + ", borderWidth=" + p() + ", adapterPosition=" + l() + ", zoomed=" + U() + ", bookmarkMs=" + r() + ", playerSimpleStatusListener=" + F() + "}" + super.toString();
    }
}
