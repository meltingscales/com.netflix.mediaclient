package o;

import com.netflix.cl.model.AppView;
import com.netflix.cl.model.TrackingInfo;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.mediaclient.ui.miniplayer.api.MiniPlayerVideoGroupViewModel;
import com.netflix.mediaclient.util.PlayContext;
import o.AbstractC3073as;
import o.AbstractC6729cim;

/* renamed from: o.cit  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6736cit extends AbstractC6737ciu implements InterfaceC1673aK<AbstractC6729cim.b>, InterfaceC6739ciw {
    private InterfaceC4467bf<C6736cit, AbstractC6729cim.b> f;
    private InterfaceC4573bh<C6736cit, AbstractC6729cim.b> m;
    private InterfaceC4732bk<C6736cit, AbstractC6729cim.b> n;

    /* renamed from: o  reason: collision with root package name */
    private InterfaceC4414be<C6736cit, AbstractC6729cim.b> f13738o;

    @Override // o.InterfaceC1673aK
    /* renamed from: d */
    public void e(C1511aE c1511aE, AbstractC6729cim.b bVar, int i) {
    }

    @Override // o.InterfaceC6739ciw
    public /* synthetic */ InterfaceC6739ciw b(InterfaceC4467bf interfaceC4467bf) {
        return d((InterfaceC4467bf<C6736cit, AbstractC6729cim.b>) interfaceC4467bf);
    }

    @Override // o.InterfaceC6739ciw
    public /* synthetic */ InterfaceC6739ciw c(InterfaceC4732bk interfaceC4732bk) {
        return b((InterfaceC4732bk<C6736cit, AbstractC6729cim.b>) interfaceC4732bk);
    }

    @Override // o.InterfaceC6739ciw
    public /* synthetic */ InterfaceC6739ciw d(drO dro) {
        return a((drO<? extends TrackingInfo>) dro);
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: e */
    public void a(AbstractC6729cim.b bVar, int i) {
        InterfaceC4467bf<C6736cit, AbstractC6729cim.b> interfaceC4467bf = this.f;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, bVar, i);
        }
    }

    public C6736cit d(InterfaceC4467bf<C6736cit, AbstractC6729cim.b> interfaceC4467bf) {
        h();
        this.f = interfaceC4467bf;
        return this;
    }

    @Override // o.AbstractC6729cim, o.AbstractC3336ax, o.AbstractC3073as
    public void e(AbstractC6729cim.b bVar) {
        super.e(bVar);
        InterfaceC4414be<C6736cit, AbstractC6729cim.b> interfaceC4414be = this.f13738o;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, bVar);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: b */
    public void c(int i, AbstractC6729cim.b bVar) {
        InterfaceC4732bk<C6736cit, AbstractC6729cim.b> interfaceC4732bk = this.n;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, bVar, i);
        }
        super.a(i, (int) bVar);
    }

    public C6736cit b(InterfaceC4732bk<C6736cit, AbstractC6729cim.b> interfaceC4732bk) {
        h();
        this.n = interfaceC4732bk;
        return this;
    }

    @Override // o.AbstractC3336ax
    public void d(float f, float f2, int i, int i2, AbstractC6729cim.b bVar) {
        InterfaceC4573bh<C6736cit, AbstractC6729cim.b> interfaceC4573bh = this.m;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, bVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, (int) bVar);
    }

    public C6736cit a(drO<? extends TrackingInfo> dro) {
        h();
        ((AbstractC6737ciu) this).c = dro;
        return this;
    }

    @Override // o.InterfaceC6739ciw
    /* renamed from: f */
    public C6736cit b(int i) {
        h();
        super.r_(i);
        return this;
    }

    @Override // o.InterfaceC6739ciw
    /* renamed from: e */
    public C6736cit b(Integer num) {
        h();
        super.d(num);
        return this;
    }

    @Override // o.InterfaceC6739ciw
    /* renamed from: w */
    public C6736cit d(String str) {
        h();
        super.p(str);
        return this;
    }

    @Override // o.InterfaceC6739ciw
    /* renamed from: d */
    public C6736cit b(boolean z) {
        h();
        super.h(z);
        return this;
    }

    @Override // o.InterfaceC6739ciw
    /* renamed from: o */
    public C6736cit e(int i) {
        h();
        super.m(i);
        return this;
    }

    @Override // o.InterfaceC6739ciw
    /* renamed from: k */
    public C6736cit j(int i) {
        h();
        super.s(i);
        return this;
    }

    @Override // o.InterfaceC6739ciw
    /* renamed from: d */
    public C6736cit b(PlayContext playContext) {
        h();
        ((AbstractC6729cim) this).h = playContext;
        return this;
    }

    @Override // o.InterfaceC6739ciw
    /* renamed from: q */
    public C6736cit h(int i) {
        h();
        super.r(i);
        return this;
    }

    @Override // o.InterfaceC6739ciw
    /* renamed from: v */
    public C6736cit j(String str) {
        h();
        super.q(str);
        return this;
    }

    @Override // o.InterfaceC6739ciw
    /* renamed from: a */
    public C6736cit e(VideoType videoType) {
        h();
        super.a_(videoType);
        return this;
    }

    @Override // o.InterfaceC6739ciw
    /* renamed from: e */
    public C6736cit a(Float f) {
        h();
        super.b_(f);
        return this;
    }

    @Override // o.InterfaceC6739ciw
    /* renamed from: k */
    public C6736cit c(String str) {
        h();
        super.o(str);
        return this;
    }

    @Override // o.InterfaceC6739ciw
    /* renamed from: l */
    public C6736cit a(String str) {
        h();
        super.m(str);
        return this;
    }

    @Override // o.InterfaceC6739ciw
    /* renamed from: D */
    public C6736cit i(String str) {
        h();
        super.x(str);
        return this;
    }

    @Override // o.InterfaceC6739ciw
    /* renamed from: h */
    public C6736cit e(String str) {
        h();
        super.n(str);
        return this;
    }

    @Override // o.InterfaceC6739ciw
    /* renamed from: e */
    public C6736cit a(boolean z) {
        h();
        super.i(z);
        return this;
    }

    @Override // o.InterfaceC6739ciw
    /* renamed from: e */
    public C6736cit a(AppView appView) {
        h();
        super.c_(appView);
        return this;
    }

    @Override // o.InterfaceC6739ciw
    /* renamed from: A */
    public C6736cit g(String str) {
        h();
        super.t(str);
        return this;
    }

    @Override // o.InterfaceC6739ciw
    /* renamed from: g */
    public C6736cit c(boolean z) {
        h();
        super.j(z);
        return this;
    }

    @Override // o.InterfaceC6739ciw
    /* renamed from: u */
    public C6736cit b(String str) {
        h();
        super.r(str);
        return this;
    }

    @Override // o.InterfaceC6739ciw
    /* renamed from: e */
    public C6736cit a(MiniPlayerVideoGroupViewModel miniPlayerVideoGroupViewModel) {
        h();
        ((AbstractC6729cim) this).j = miniPlayerVideoGroupViewModel;
        return this;
    }

    @Override // o.InterfaceC6739ciw
    /* renamed from: y */
    public C6736cit f(String str) {
        h();
        ((AbstractC6729cim) this).i = str;
        return this;
    }

    @Override // o.InterfaceC6739ciw
    /* renamed from: b */
    public C6736cit d(InterfaceC6718cib interfaceC6718cib) {
        h();
        ((AbstractC6729cim) this).g = interfaceC6718cib;
        return this;
    }

    @Override // o.InterfaceC6739ciw
    /* renamed from: e */
    public C6736cit c(C9935zP c9935zP) {
        h();
        ((AbstractC6729cim) this).d = c9935zP;
        return this;
    }

    @Override // o.InterfaceC6739ciw
    /* renamed from: e */
    public C6736cit b(C9686vA c9686vA) {
        h();
        super.c(c9686vA);
        return this;
    }

    @Override // o.InterfaceC6739ciw
    /* renamed from: i */
    public C6736cit d(int i) {
        h();
        super.n(i);
        return this;
    }

    @Override // o.InterfaceC6739ciw
    /* renamed from: e */
    public C6736cit a(Boolean bool) {
        h();
        super.c(bool);
        return this;
    }

    @Override // o.InterfaceC6739ciw
    /* renamed from: a */
    public C6736cit e(InterfaceC3826bMb interfaceC3826bMb) {
        h();
        super.a_(interfaceC3826bMb);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: b */
    public C6736cit e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.InterfaceC6739ciw
    /* renamed from: c */
    public C6736cit b(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.InterfaceC6739ciw
    /* renamed from: g */
    public C6736cit c(int i) {
        super.a(i);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: c */
    public C6736cit a(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C6736cit) && super.equals(obj)) {
            C6736cit c6736cit = (C6736cit) obj;
            if ((this.f == null) != (c6736cit.f == null)) {
                return false;
            }
            if ((this.f13738o == null) != (c6736cit.f13738o == null)) {
                return false;
            }
            if ((this.n == null) != (c6736cit.n == null)) {
                return false;
            }
            if ((this.m == null) != (c6736cit.m == null)) {
                return false;
            }
            if ((((AbstractC6737ciu) this).c == null) != (((AbstractC6737ciu) c6736cit).c == null)) {
                return false;
            }
            if ((n() == null) == (c6736cit.n() == null) && e() == c6736cit.e()) {
                if (o() == null ? c6736cit.o() == null : o().equals(c6736cit.o())) {
                    if (G() == null ? c6736cit.G() == null : G().equals(c6736cit.G())) {
                        if (q() != c6736cit.q()) {
                            return false;
                        }
                        if (k() == null ? c6736cit.k() == null : k().equals(c6736cit.k())) {
                            if (A() == c6736cit.A() && z() == c6736cit.z()) {
                                if ((((AbstractC6729cim) this).h == null) == (((AbstractC6729cim) c6736cit).h == null) && N() == c6736cit.N()) {
                                    if (P() == null ? c6736cit.P() == null : P().equals(c6736cit.P())) {
                                        if (Q() == null ? c6736cit.Q() == null : Q().equals(c6736cit.Q())) {
                                            if (u() == null ? c6736cit.u() == null : u().equals(c6736cit.u())) {
                                                if (y() == null ? c6736cit.y() == null : y().equals(c6736cit.y())) {
                                                    if (v() == null ? c6736cit.v() == null : v().equals(c6736cit.v())) {
                                                        if ((w() == null) != (c6736cit.w() == null)) {
                                                            return false;
                                                        }
                                                        if (W() == null ? c6736cit.W() == null : W().equals(c6736cit.W())) {
                                                            if (t() == null ? c6736cit.t() == null : t().equals(c6736cit.t())) {
                                                                if (L() == c6736cit.L() && S() == c6736cit.S()) {
                                                                    if (aj_() == null ? c6736cit.aj_() == null : aj_().equals(c6736cit.aj_())) {
                                                                        if (T() == null ? c6736cit.T() == null : T().equals(c6736cit.T())) {
                                                                            if (M() == null ? c6736cit.M() == null : M().equals(c6736cit.M())) {
                                                                                if (O() == null ? c6736cit.O() == null : O().equals(c6736cit.O())) {
                                                                                    if (R() != c6736cit.R()) {
                                                                                        return false;
                                                                                    }
                                                                                    if (x() == null ? c6736cit.x() == null : x().equals(c6736cit.x())) {
                                                                                        if (B() == null ? c6736cit.B() == null : B().equals(c6736cit.B())) {
                                                                                            if ((((AbstractC6729cim) this).j == null) != (((AbstractC6729cim) c6736cit).j == null)) {
                                                                                                return false;
                                                                                            }
                                                                                            String str = ((AbstractC6729cim) this).i;
                                                                                            if (str == null ? ((AbstractC6729cim) c6736cit).i == null : str.equals(((AbstractC6729cim) c6736cit).i)) {
                                                                                                if ((((AbstractC6729cim) this).g == null) != (((AbstractC6729cim) c6736cit).g == null)) {
                                                                                                    return false;
                                                                                                }
                                                                                                if ((((AbstractC6729cim) this).d == null) != (((AbstractC6729cim) c6736cit).d == null)) {
                                                                                                    return false;
                                                                                                }
                                                                                                if ((D() == null) != (c6736cit.D() == null)) {
                                                                                                    return false;
                                                                                                }
                                                                                                if (J() == null ? c6736cit.J() == null : J().equals(c6736cit.J())) {
                                                                                                    if (p() == c6736cit.p() && l() == c6736cit.l()) {
                                                                                                        if (U() == null ? c6736cit.U() == null : U().equals(c6736cit.U())) {
                                                                                                            if (r() != c6736cit.r()) {
                                                                                                                return false;
                                                                                                            }
                                                                                                            return (F() == null) == (c6736cit.F() == null);
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
        int i2 = this.f13738o != null ? 1 : 0;
        int i3 = this.n != null ? 1 : 0;
        int i4 = this.m != null ? 1 : 0;
        int i5 = ((AbstractC6737ciu) this).c != null ? 1 : 0;
        int i6 = n() != null ? 1 : 0;
        int e = e();
        int hashCode2 = o() != null ? o().hashCode() : 0;
        int hashCode3 = G() != null ? G().hashCode() : 0;
        boolean q = q();
        int hashCode4 = k() != null ? k().hashCode() : 0;
        int A = A();
        int z = z();
        int i7 = ((AbstractC6729cim) this).h != null ? 1 : 0;
        int N = N();
        int hashCode5 = P() != null ? P().hashCode() : 0;
        int hashCode6 = Q() != null ? Q().hashCode() : 0;
        int hashCode7 = u() != null ? u().hashCode() : 0;
        int hashCode8 = y() != null ? y().hashCode() : 0;
        int hashCode9 = v() != null ? v().hashCode() : 0;
        int i8 = w() != null ? 1 : 0;
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
        int i9 = ((AbstractC6729cim) this).j != null ? 1 : 0;
        String str = ((AbstractC6729cim) this).i;
        int hashCode18 = str != null ? str.hashCode() : 0;
        int i10 = ((AbstractC6729cim) this).g != null ? 1 : 0;
        int i11 = ((AbstractC6729cim) this).d != null ? 1 : 0;
        int i12 = D() != null ? 1 : 0;
        int hashCode19 = J() != null ? J().hashCode() : 0;
        int p = p();
        int l = l();
        int hashCode20 = U() != null ? U().hashCode() : 0;
        int i13 = i7;
        int i14 = i11;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + i5) * 31) + i6) * 31) + e) * 31) + hashCode2) * 31) + hashCode3) * 31) + (q ? 1 : 0)) * 31) + hashCode4) * 31) + A) * 31) + z) * 31) + i13) * 31) + N) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + i8) * 31) + hashCode10) * 31) + hashCode11) * 31) + (L ? 1 : 0)) * 31) + (S ? 1 : 0)) * 31) + hashCode12) * 31) + hashCode13) * 31) + hashCode14) * 31) + hashCode15) * 31) + (R ? 1 : 0)) * 31) + hashCode16) * 31) + hashCode17) * 31) + i9) * 31) + hashCode18) * 31) + i10) * 31) + i14) * 31) + i12) * 31) + hashCode19) * 31) + p) * 31) + l) * 31) + hashCode20) * 31) + ((int) (r() ^ (r() >>> 32)))) * 31) + (F() != null ? 1 : 0);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "PresentableAutoPlayableMiniPlayerModel_{impressionInfo=" + n() + ", autoPlayRank=" + e() + ", itemPosition=" + o() + ", playableId=" + G() + ", hideFullscreenControl=" + q() + ", accentColor=" + k() + ", miniPlayerPosition=" + A() + ", miniPlayerRow=" + z() + ", playContext=" + ((AbstractC6729cim) this).h + ", runtimeSeconds=" + N() + ", topNodeVideoId=" + P() + ", topNodeVideoType=" + Q() + ", imageAspectRatio=" + u() + ", imageUrl=" + y() + ", imageResId=" + v() + ", imageId=" + w() + ", videoTitle=" + W() + ", certificationRating=" + t() + ", shouldLoop=" + L() + ", silent=" + S() + ", appView=" + aj_() + ", uiLocation=" + T() + ", profileLanguage=" + M() + ", supplementalVideoType=" + O() + ", tapToPlayPauseEnabled=" + R() + ", miniPlayerControlsType=" + x() + ", playButtonIdleContentDescription=" + B() + ", playerViewModel=" + ((AbstractC6729cim) this).j + ", playlistId=" + ((AbstractC6729cim) this).i + ", playerEventListener=" + ((AbstractC6729cim) this).g + ", eventBusFactory=" + ((AbstractC6729cim) this).d + ", roundedCornerConfig=" + J() + ", borderWidth=" + p() + ", adapterPosition=" + l() + ", zoomed=" + U() + ", bookmarkMs=" + r() + ", playerSimpleStatusListener=" + F() + "}" + super.toString();
    }
}
