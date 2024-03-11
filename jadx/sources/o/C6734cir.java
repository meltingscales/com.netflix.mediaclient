package o;

import android.view.View;
import com.netflix.cl.model.AppView;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.mediaclient.ui.miniplayer.api.MiniPlayerControlsType;
import com.netflix.mediaclient.ui.miniplayer.api.MiniPlayerVideoGroupViewModel;
import com.netflix.mediaclient.util.PlayContext;
import o.AbstractC3073as;
import o.AbstractC6729cim;

/* renamed from: o.cir  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6734cir extends AbstractC6729cim implements InterfaceC1673aK<AbstractC6729cim.b>, InterfaceC6732cip {
    private InterfaceC4467bf<C6734cir, AbstractC6729cim.b> c;
    private InterfaceC4414be<C6734cir, AbstractC6729cim.b> f;
    private InterfaceC4732bk<C6734cir, AbstractC6729cim.b> l;

    /* renamed from: o  reason: collision with root package name */
    private InterfaceC4573bh<C6734cir, AbstractC6729cim.b> f13737o;

    @Override // o.InterfaceC1673aK
    /* renamed from: c */
    public void e(C1511aE c1511aE, AbstractC6729cim.b bVar, int i) {
    }

    @Override // o.InterfaceC6732cip
    public /* synthetic */ InterfaceC6732cip c(InterfaceC4467bf interfaceC4467bf) {
        return a((InterfaceC4467bf<C6734cir, AbstractC6729cim.b>) interfaceC4467bf);
    }

    @Override // o.InterfaceC6732cip
    public /* synthetic */ InterfaceC6732cip c(InterfaceC4732bk interfaceC4732bk) {
        return a((InterfaceC4732bk<C6734cir, AbstractC6729cim.b>) interfaceC4732bk);
    }

    @Override // o.InterfaceC6732cip
    public /* synthetic */ InterfaceC6732cip d(drX drx) {
        return e((drX<? super View, ? super Boolean, dpR>) drx);
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: e */
    public void a(AbstractC6729cim.b bVar, int i) {
        InterfaceC4467bf<C6734cir, AbstractC6729cim.b> interfaceC4467bf = this.c;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, bVar, i);
        }
    }

    public C6734cir a(InterfaceC4467bf<C6734cir, AbstractC6729cim.b> interfaceC4467bf) {
        h();
        this.c = interfaceC4467bf;
        return this;
    }

    @Override // o.AbstractC6729cim, o.AbstractC3336ax, o.AbstractC3073as
    public void e(AbstractC6729cim.b bVar) {
        super.e(bVar);
        InterfaceC4414be<C6734cir, AbstractC6729cim.b> interfaceC4414be = this.f;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, bVar);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: b */
    public void c(int i, AbstractC6729cim.b bVar) {
        InterfaceC4732bk<C6734cir, AbstractC6729cim.b> interfaceC4732bk = this.l;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, bVar, i);
        }
        super.a(i, (int) bVar);
    }

    public C6734cir a(InterfaceC4732bk<C6734cir, AbstractC6729cim.b> interfaceC4732bk) {
        h();
        this.l = interfaceC4732bk;
        return this;
    }

    @Override // o.AbstractC3336ax
    public void d(float f, float f2, int i, int i2, AbstractC6729cim.b bVar) {
        InterfaceC4573bh<C6734cir, AbstractC6729cim.b> interfaceC4573bh = this.f13737o;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, bVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, (int) bVar);
    }

    @Override // o.InterfaceC6732cip
    /* renamed from: w */
    public C6734cir b(String str) {
        h();
        super.p(str);
        return this;
    }

    @Override // o.InterfaceC6732cip
    /* renamed from: c */
    public C6734cir e(boolean z) {
        h();
        super.h(z);
        return this;
    }

    @Override // o.InterfaceC6732cip
    /* renamed from: e */
    public C6734cir d(PlayContext playContext) {
        h();
        ((AbstractC6729cim) this).h = playContext;
        return this;
    }

    @Override // o.InterfaceC6732cip
    /* renamed from: e */
    public C6734cir c(int i) {
        h();
        super.r(i);
        return this;
    }

    @Override // o.InterfaceC6732cip
    /* renamed from: u */
    public C6734cir h(String str) {
        h();
        super.q(str);
        return this;
    }

    @Override // o.InterfaceC6732cip
    /* renamed from: c */
    public C6734cir b(VideoType videoType) {
        h();
        super.a_(videoType);
        return this;
    }

    @Override // o.InterfaceC6732cip
    /* renamed from: e */
    public C6734cir c(Float f) {
        h();
        super.b_(f);
        return this;
    }

    @Override // o.InterfaceC6732cip
    /* renamed from: l */
    public C6734cir e(String str) {
        h();
        super.o(str);
        return this;
    }

    @Override // o.InterfaceC6732cip
    /* renamed from: g */
    public C6734cir a(String str) {
        h();
        super.m(str);
        return this;
    }

    @Override // o.InterfaceC6732cip
    /* renamed from: D */
    public C6734cir f(String str) {
        h();
        super.x(str);
        return this;
    }

    @Override // o.InterfaceC6732cip
    /* renamed from: d */
    public C6734cir b(boolean z) {
        h();
        super.i(z);
        return this;
    }

    @Override // o.InterfaceC6732cip
    /* renamed from: e */
    public C6734cir a(AppView appView) {
        h();
        super.c_(appView);
        return this;
    }

    @Override // o.InterfaceC6732cip
    /* renamed from: C */
    public C6734cir j(String str) {
        h();
        super.t(str);
        return this;
    }

    @Override // o.InterfaceC6732cip
    /* renamed from: y */
    public C6734cir i(String str) {
        h();
        super.s(str);
        return this;
    }

    @Override // o.InterfaceC6732cip
    /* renamed from: f */
    public C6734cir a(boolean z) {
        h();
        super.j(z);
        return this;
    }

    @Override // o.InterfaceC6732cip
    /* renamed from: b */
    public C6734cir e(MiniPlayerControlsType miniPlayerControlsType) {
        h();
        super.a_(miniPlayerControlsType);
        return this;
    }

    @Override // o.InterfaceC6732cip
    /* renamed from: k */
    public C6734cir c(String str) {
        h();
        super.r(str);
        return this;
    }

    @Override // o.InterfaceC6732cip
    /* renamed from: e */
    public C6734cir b(MiniPlayerVideoGroupViewModel miniPlayerVideoGroupViewModel) {
        h();
        ((AbstractC6729cim) this).j = miniPlayerVideoGroupViewModel;
        return this;
    }

    @Override // o.InterfaceC6732cip
    /* renamed from: v */
    public C6734cir d(String str) {
        h();
        ((AbstractC6729cim) this).i = str;
        return this;
    }

    @Override // o.InterfaceC6732cip
    /* renamed from: e */
    public C6734cir b(InterfaceC6718cib interfaceC6718cib) {
        h();
        ((AbstractC6729cim) this).g = interfaceC6718cib;
        return this;
    }

    @Override // o.InterfaceC6732cip
    /* renamed from: e */
    public C6734cir b(C9935zP c9935zP) {
        h();
        ((AbstractC6729cim) this).d = c9935zP;
        return this;
    }

    public C6734cir e(drX<? super View, ? super Boolean, dpR> drx) {
        h();
        super.b(drx);
        return this;
    }

    @Override // o.InterfaceC6732cip
    /* renamed from: b */
    public C6734cir d(long j) {
        h();
        super.a(j);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: c */
    public C6734cir e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.InterfaceC6732cip
    /* renamed from: e */
    public C6734cir b(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.InterfaceC6732cip
    /* renamed from: d */
    public C6734cir b(int i) {
        super.a(i);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: d */
    public C6734cir a(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C6734cir) && super.equals(obj)) {
            C6734cir c6734cir = (C6734cir) obj;
            if ((this.c == null) != (c6734cir.c == null)) {
                return false;
            }
            if ((this.f == null) != (c6734cir.f == null)) {
                return false;
            }
            if ((this.l == null) != (c6734cir.l == null)) {
                return false;
            }
            if ((this.f13737o == null) != (c6734cir.f13737o == null)) {
                return false;
            }
            if (G() == null ? c6734cir.G() == null : G().equals(c6734cir.G())) {
                if (q() != c6734cir.q()) {
                    return false;
                }
                if (k() == null ? c6734cir.k() == null : k().equals(c6734cir.k())) {
                    if (A() == c6734cir.A() && z() == c6734cir.z()) {
                        if ((((AbstractC6729cim) this).h == null) == (((AbstractC6729cim) c6734cir).h == null) && N() == c6734cir.N()) {
                            if (P() == null ? c6734cir.P() == null : P().equals(c6734cir.P())) {
                                if (Q() == null ? c6734cir.Q() == null : Q().equals(c6734cir.Q())) {
                                    if (u() == null ? c6734cir.u() == null : u().equals(c6734cir.u())) {
                                        if (y() == null ? c6734cir.y() == null : y().equals(c6734cir.y())) {
                                            if (v() == null ? c6734cir.v() == null : v().equals(c6734cir.v())) {
                                                if ((w() == null) != (c6734cir.w() == null)) {
                                                    return false;
                                                }
                                                if (W() == null ? c6734cir.W() == null : W().equals(c6734cir.W())) {
                                                    if (t() == null ? c6734cir.t() == null : t().equals(c6734cir.t())) {
                                                        if (L() == c6734cir.L() && S() == c6734cir.S()) {
                                                            if (aj_() == null ? c6734cir.aj_() == null : aj_().equals(c6734cir.aj_())) {
                                                                if (T() == null ? c6734cir.T() == null : T().equals(c6734cir.T())) {
                                                                    if (M() == null ? c6734cir.M() == null : M().equals(c6734cir.M())) {
                                                                        if (O() == null ? c6734cir.O() == null : O().equals(c6734cir.O())) {
                                                                            if (R() != c6734cir.R()) {
                                                                                return false;
                                                                            }
                                                                            if (x() == null ? c6734cir.x() == null : x().equals(c6734cir.x())) {
                                                                                if (B() == null ? c6734cir.B() == null : B().equals(c6734cir.B())) {
                                                                                    if ((((AbstractC6729cim) this).j == null) != (((AbstractC6729cim) c6734cir).j == null)) {
                                                                                        return false;
                                                                                    }
                                                                                    String str = ((AbstractC6729cim) this).i;
                                                                                    if (str == null ? ((AbstractC6729cim) c6734cir).i == null : str.equals(((AbstractC6729cim) c6734cir).i)) {
                                                                                        if ((((AbstractC6729cim) this).g == null) != (((AbstractC6729cim) c6734cir).g == null)) {
                                                                                            return false;
                                                                                        }
                                                                                        if ((((AbstractC6729cim) this).d == null) != (((AbstractC6729cim) c6734cir).d == null)) {
                                                                                            return false;
                                                                                        }
                                                                                        if ((D() == null) != (c6734cir.D() == null)) {
                                                                                            return false;
                                                                                        }
                                                                                        if (J() == null ? c6734cir.J() == null : J().equals(c6734cir.J())) {
                                                                                            if (p() == c6734cir.p() && l() == c6734cir.l()) {
                                                                                                if (U() == null ? c6734cir.U() == null : U().equals(c6734cir.U())) {
                                                                                                    if (r() != c6734cir.r()) {
                                                                                                        return false;
                                                                                                    }
                                                                                                    return (F() == null) == (c6734cir.F() == null);
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
        int i = this.c != null ? 1 : 0;
        int i2 = this.f != null ? 1 : 0;
        int i3 = this.l != null ? 1 : 0;
        int i4 = this.f13737o != null ? 1 : 0;
        int hashCode2 = G() != null ? G().hashCode() : 0;
        boolean q = q();
        int hashCode3 = k() != null ? k().hashCode() : 0;
        int A = A();
        int z = z();
        int i5 = ((AbstractC6729cim) this).h != null ? 1 : 0;
        int N = N();
        int hashCode4 = P() != null ? P().hashCode() : 0;
        int hashCode5 = Q() != null ? Q().hashCode() : 0;
        int hashCode6 = u() != null ? u().hashCode() : 0;
        int hashCode7 = y() != null ? y().hashCode() : 0;
        int hashCode8 = v() != null ? v().hashCode() : 0;
        int i6 = w() != null ? 1 : 0;
        int hashCode9 = W() != null ? W().hashCode() : 0;
        int hashCode10 = t() != null ? t().hashCode() : 0;
        boolean L = L();
        boolean S = S();
        int hashCode11 = aj_() != null ? aj_().hashCode() : 0;
        int hashCode12 = T() != null ? T().hashCode() : 0;
        int hashCode13 = M() != null ? M().hashCode() : 0;
        int hashCode14 = O() != null ? O().hashCode() : 0;
        boolean R = R();
        int hashCode15 = x() != null ? x().hashCode() : 0;
        int hashCode16 = B() != null ? B().hashCode() : 0;
        int i7 = ((AbstractC6729cim) this).j != null ? 1 : 0;
        String str = ((AbstractC6729cim) this).i;
        int hashCode17 = str != null ? str.hashCode() : 0;
        int i8 = ((AbstractC6729cim) this).g != null ? 1 : 0;
        int i9 = ((AbstractC6729cim) this).d != null ? 1 : 0;
        int i10 = D() != null ? 1 : 0;
        int hashCode18 = J() != null ? J().hashCode() : 0;
        int p = p();
        int l = l();
        int hashCode19 = U() != null ? U().hashCode() : 0;
        int i11 = i7;
        int i12 = i9;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + hashCode2) * 31) + (q ? 1 : 0)) * 31) + hashCode3) * 31) + A) * 31) + z) * 31) + i5) * 31) + N) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + i6) * 31) + hashCode9) * 31) + hashCode10) * 31) + (L ? 1 : 0)) * 31) + (S ? 1 : 0)) * 31) + hashCode11) * 31) + hashCode12) * 31) + hashCode13) * 31) + hashCode14) * 31) + (R ? 1 : 0)) * 31) + hashCode15) * 31) + hashCode16) * 31) + i11) * 31) + hashCode17) * 31) + i8) * 31) + i12) * 31) + i10) * 31) + hashCode18) * 31) + p) * 31) + l) * 31) + hashCode19) * 31) + ((int) (r() ^ (r() >>> 32)))) * 31) + (F() != null ? 1 : 0);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "MiniPlayerVideoViewModel_{playableId=" + G() + ", hideFullscreenControl=" + q() + ", accentColor=" + k() + ", miniPlayerPosition=" + A() + ", miniPlayerRow=" + z() + ", playContext=" + ((AbstractC6729cim) this).h + ", runtimeSeconds=" + N() + ", topNodeVideoId=" + P() + ", topNodeVideoType=" + Q() + ", imageAspectRatio=" + u() + ", imageUrl=" + y() + ", imageResId=" + v() + ", imageId=" + w() + ", videoTitle=" + W() + ", certificationRating=" + t() + ", shouldLoop=" + L() + ", silent=" + S() + ", appView=" + aj_() + ", uiLocation=" + T() + ", profileLanguage=" + M() + ", supplementalVideoType=" + O() + ", tapToPlayPauseEnabled=" + R() + ", miniPlayerControlsType=" + x() + ", playButtonIdleContentDescription=" + B() + ", playerViewModel=" + ((AbstractC6729cim) this).j + ", playlistId=" + ((AbstractC6729cim) this).i + ", playerEventListener=" + ((AbstractC6729cim) this).g + ", eventBusFactory=" + ((AbstractC6729cim) this).d + ", roundedCornerConfig=" + J() + ", borderWidth=" + p() + ", adapterPosition=" + l() + ", zoomed=" + U() + ", bookmarkMs=" + r() + ", playerSimpleStatusListener=" + F() + "}" + super.toString();
    }
}
