package o;

import android.view.View;
import android.view.ViewParent;
import android.view.animation.Animation;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.TrackingInfo;
import o.AbstractC3073as;
import o.AbstractC4087bVt;
import o.InterfaceC3825bMa;

/* renamed from: o.bVu  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4088bVu extends AbstractC4087bVt implements InterfaceC1673aK<AbstractC4087bVt.b>, InterfaceC4089bVv {
    private InterfaceC4467bf<C4088bVu, AbstractC4087bVt.b> g;
    private InterfaceC4573bh<C4088bVu, AbstractC4087bVt.b> h;
    private InterfaceC4732bk<C4088bVu, AbstractC4087bVt.b> i;
    private InterfaceC4414be<C4088bVu, AbstractC4087bVt.b> j;

    @Override // o.InterfaceC1673aK
    /* renamed from: a */
    public void e(C1511aE c1511aE, AbstractC4087bVt.b bVar, int i) {
    }

    @Override // o.InterfaceC4089bVv
    public /* synthetic */ InterfaceC4089bVv a(InterfaceC4467bf interfaceC4467bf) {
        return e((InterfaceC4467bf<C4088bVu, AbstractC4087bVt.b>) interfaceC4467bf);
    }

    @Override // o.InterfaceC4089bVv
    public /* synthetic */ InterfaceC4089bVv a(InterfaceC4732bk interfaceC4732bk) {
        return b((InterfaceC4732bk<C4088bVu, AbstractC4087bVt.b>) interfaceC4732bk);
    }

    @Override // o.InterfaceC4089bVv
    public /* synthetic */ InterfaceC4089bVv a(drO dro) {
        return d((drO<? extends TrackingInfo>) dro);
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: d */
    public void a(AbstractC4087bVt.b bVar, int i) {
        InterfaceC4467bf<C4088bVu, AbstractC4087bVt.b> interfaceC4467bf = this.g;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, bVar, i);
        }
    }

    public C4088bVu e(InterfaceC4467bf<C4088bVu, AbstractC4087bVt.b> interfaceC4467bf) {
        h();
        this.g = interfaceC4467bf;
        return this;
    }

    @Override // o.AbstractC4087bVt, o.AbstractC3336ax, o.AbstractC3073as
    public void e(AbstractC4087bVt.b bVar) {
        super.e(bVar);
        InterfaceC4414be<C4088bVu, AbstractC4087bVt.b> interfaceC4414be = this.j;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, bVar);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: d */
    public void c(int i, AbstractC4087bVt.b bVar) {
        InterfaceC4732bk<C4088bVu, AbstractC4087bVt.b> interfaceC4732bk = this.i;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, bVar, i);
        }
        super.a(i, (int) bVar);
    }

    public C4088bVu b(InterfaceC4732bk<C4088bVu, AbstractC4087bVt.b> interfaceC4732bk) {
        h();
        this.i = interfaceC4732bk;
        return this;
    }

    @Override // o.AbstractC3336ax
    /* renamed from: b */
    public void d(float f, float f2, int i, int i2, AbstractC4087bVt.b bVar) {
        InterfaceC4573bh<C4088bVu, AbstractC4087bVt.b> interfaceC4573bh = this.h;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, bVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, bVar);
    }

    @Override // o.InterfaceC4089bVv
    /* renamed from: a */
    public C4088bVu c(InterfaceC3825bMa.a aVar) {
        h();
        super.b(aVar);
        return this;
    }

    @Override // o.InterfaceC4089bVv
    /* renamed from: g */
    public C4088bVu c(String str) {
        h();
        super.K_(str);
        return this;
    }

    @Override // o.InterfaceC4089bVv
    /* renamed from: c */
    public C4088bVu a(boolean z) {
        h();
        super.b(z);
        return this;
    }

    @Override // o.InterfaceC4089bVv
    /* renamed from: f */
    public C4088bVu b(String str) {
        h();
        super.J_(str);
        return this;
    }

    @Override // o.InterfaceC4089bVv
    /* renamed from: i */
    public C4088bVu e(String str) {
        h();
        super.I_(str);
        return this;
    }

    @Override // o.InterfaceC4089bVv
    /* renamed from: a */
    public C4088bVu d(String str) {
        h();
        super.H_(str);
        return this;
    }

    @Override // o.InterfaceC4089bVv
    /* renamed from: b */
    public C4088bVu e(View.OnClickListener onClickListener) {
        h();
        super.a(onClickListener);
        return this;
    }

    @Override // o.InterfaceC4089bVv
    /* renamed from: d */
    public C4088bVu c(Animation.AnimationListener animationListener) {
        h();
        super.e(animationListener);
        return this;
    }

    public C4088bVu d(drO<? extends TrackingInfo> dro) {
        h();
        ((AbstractC4087bVt) this).b = dro;
        return this;
    }

    @Override // o.InterfaceC4089bVv
    /* renamed from: c */
    public C4088bVu a(AppView appView) {
        h();
        ((AbstractC4087bVt) this).d = appView;
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: a */
    public C4088bVu e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.InterfaceC4089bVv
    /* renamed from: e */
    public C4088bVu b(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: b */
    public C4088bVu a(int i) {
        super.a(i);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: c */
    public C4088bVu a(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: d */
    public AbstractC4087bVt.b b(ViewParent viewParent) {
        return new AbstractC4087bVt.b();
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C4088bVu) && super.equals(obj)) {
            C4088bVu c4088bVu = (C4088bVu) obj;
            if ((this.g == null) != (c4088bVu.g == null)) {
                return false;
            }
            if ((this.j == null) != (c4088bVu.j == null)) {
                return false;
            }
            if ((this.i == null) != (c4088bVu.i == null)) {
                return false;
            }
            if ((this.h == null) != (c4088bVu.h == null)) {
                return false;
            }
            if (n() == null ? c4088bVu.n() == null : n().equals(c4088bVu.n())) {
                if (t() == null ? c4088bVu.t() == null : t().equals(c4088bVu.t())) {
                    if (q() == null ? c4088bVu.q() == null : q().equals(c4088bVu.q())) {
                        if (s() != c4088bVu.s()) {
                            return false;
                        }
                        if (k() == null ? c4088bVu.k() == null : k().equals(c4088bVu.k())) {
                            if (l() == null ? c4088bVu.l() == null : l().equals(c4088bVu.l())) {
                                if (o() == null ? c4088bVu.o() == null : o().equals(c4088bVu.o())) {
                                    if ((r() == null) != (c4088bVu.r() == null)) {
                                        return false;
                                    }
                                    if ((p() == null) != (c4088bVu.p() == null)) {
                                        return false;
                                    }
                                    if ((((AbstractC4087bVt) this).b == null) != (((AbstractC4087bVt) c4088bVu).b == null)) {
                                        return false;
                                    }
                                    AppView appView = ((AbstractC4087bVt) this).d;
                                    AppView appView2 = ((AbstractC4087bVt) c4088bVu).d;
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
                return false;
            }
            return false;
        }
        return false;
    }

    @Override // o.AbstractC3073as
    public int hashCode() {
        int hashCode = super.hashCode();
        int i = this.g != null ? 1 : 0;
        int i2 = this.j != null ? 1 : 0;
        int i3 = this.i != null ? 1 : 0;
        int i4 = this.h != null ? 1 : 0;
        int hashCode2 = n() != null ? n().hashCode() : 0;
        int hashCode3 = t() != null ? t().hashCode() : 0;
        int hashCode4 = q() != null ? q().hashCode() : 0;
        boolean s = s();
        int hashCode5 = k() != null ? k().hashCode() : 0;
        int hashCode6 = l() != null ? l().hashCode() : 0;
        int hashCode7 = o() != null ? o().hashCode() : 0;
        int i5 = r() != null ? 1 : 0;
        int i6 = p() != null ? 1 : 0;
        int i7 = ((AbstractC4087bVt) this).b != null ? 1 : 0;
        AppView appView = ((AbstractC4087bVt) this).d;
        return (((((((((((((((((((((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (s ? 1 : 0)) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + i5) * 31) + i6) * 31) + i7) * 31) + (appView != null ? appView.hashCode() : 0);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "KidsFavoritesMysteryBoxModel_{impressionInfo=" + n() + ", videoId=" + t() + ", title=" + q() + ", mysteryRevealed=" + s() + ", mysteryBoxUrl=" + k() + ", characterUrl=" + l() + ", boxshotUrl=" + o() + ", onClick=" + r() + ", revealAnimation=" + p() + ", appView=" + ((AbstractC4087bVt) this).d + "}" + super.toString();
    }
}
