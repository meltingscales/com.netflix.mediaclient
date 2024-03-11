package o;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewParent;
import com.netflix.mediaclient.ui.epoxy.models.HorizontalGravity;
import o.AbstractC3073as;
import o.AbstractC4163bYo;

/* renamed from: o.bYv  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4170bYv extends AbstractC4163bYo implements InterfaceC1673aK<AbstractC4163bYo.b>, InterfaceC4164bYp {
    private InterfaceC4467bf<C4170bYv, AbstractC4163bYo.b> c;
    private InterfaceC4573bh<C4170bYv, AbstractC4163bYo.b> g;
    private InterfaceC4732bk<C4170bYv, AbstractC4163bYo.b> i;
    private InterfaceC4414be<C4170bYv, AbstractC4163bYo.b> j;

    @Override // o.InterfaceC1673aK
    /* renamed from: b */
    public void e(C1511aE c1511aE, AbstractC4163bYo.b bVar, int i) {
    }

    @Override // o.InterfaceC4164bYp
    public /* synthetic */ InterfaceC4164bYp e(InterfaceC4732bk interfaceC4732bk) {
        return a((InterfaceC4732bk<C4170bYv, AbstractC4163bYo.b>) interfaceC4732bk);
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: e */
    public void a(AbstractC4163bYo.b bVar, int i) {
        InterfaceC4467bf<C4170bYv, AbstractC4163bYo.b> interfaceC4467bf = this.c;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, bVar, i);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: a */
    public void e(AbstractC4163bYo.b bVar) {
        super.b((C4170bYv) bVar);
        InterfaceC4414be<C4170bYv, AbstractC4163bYo.b> interfaceC4414be = this.j;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, bVar);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    public void c(int i, AbstractC4163bYo.b bVar) {
        InterfaceC4732bk<C4170bYv, AbstractC4163bYo.b> interfaceC4732bk = this.i;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, bVar, i);
        }
        super.a(i, (int) bVar);
    }

    public C4170bYv a(InterfaceC4732bk<C4170bYv, AbstractC4163bYo.b> interfaceC4732bk) {
        h();
        this.i = interfaceC4732bk;
        return this;
    }

    @Override // o.AbstractC3336ax
    /* renamed from: b */
    public void d(float f, float f2, int i, int i2, AbstractC4163bYo.b bVar) {
        InterfaceC4573bh<C4170bYv, AbstractC4163bYo.b> interfaceC4573bh = this.g;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, bVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, bVar);
    }

    @Override // o.InterfaceC4164bYp
    /* renamed from: r */
    public C4170bYv h(String str) {
        h();
        ((AbstractC4163bYo) this).d = str;
        return this;
    }

    @Override // o.InterfaceC4164bYp
    /* renamed from: t */
    public C4170bYv f(String str) {
        h();
        ((AbstractC4163bYo) this).b = str;
        return this;
    }

    @Override // o.InterfaceC4164bYp
    /* renamed from: o */
    public C4170bYv d(String str) {
        h();
        super.R_(str);
        return this;
    }

    @Override // o.InterfaceC4164bYp
    /* renamed from: s */
    public C4170bYv i(String str) {
        h();
        super.S_(str);
        return this;
    }

    @Override // o.InterfaceC4164bYp
    /* renamed from: n */
    public C4170bYv b(String str) {
        h();
        super.O_(str);
        return this;
    }

    @Override // o.InterfaceC4164bYp
    /* renamed from: b */
    public C4170bYv c(Drawable drawable) {
        h();
        super.d(drawable);
        return this;
    }

    @Override // o.InterfaceC4164bYp
    /* renamed from: l */
    public C4170bYv a(String str) {
        h();
        super.Q_(str);
        return this;
    }

    @Override // o.InterfaceC4164bYp
    /* renamed from: k */
    public C4170bYv c(String str) {
        h();
        super.P_(str);
        return this;
    }

    @Override // o.InterfaceC4164bYp
    /* renamed from: q */
    public C4170bYv g(String str) {
        h();
        super.j(str);
        return this;
    }

    @Override // o.InterfaceC4164bYp
    /* renamed from: m */
    public C4170bYv e(String str) {
        h();
        super.N_(str);
        return this;
    }

    @Override // o.InterfaceC4164bYp
    /* renamed from: c */
    public C4170bYv a(HorizontalGravity horizontalGravity) {
        h();
        super.a_(horizontalGravity);
        return this;
    }

    @Override // o.InterfaceC4164bYp
    /* renamed from: e */
    public C4170bYv a(View.OnClickListener onClickListener) {
        h();
        super.c(onClickListener);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: d */
    public C4170bYv e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.InterfaceC4164bYp
    /* renamed from: d */
    public C4170bYv b(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: c */
    public C4170bYv a(int i) {
        super.a(i);
        return this;
    }

    @Override // o.InterfaceC4164bYp
    /* renamed from: c */
    public C4170bYv d(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: c */
    public AbstractC4163bYo.b b(ViewParent viewParent) {
        return new AbstractC4163bYo.b();
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C4170bYv) && super.equals(obj)) {
            C4170bYv c4170bYv = (C4170bYv) obj;
            if ((this.c == null) != (c4170bYv.c == null)) {
                return false;
            }
            if ((this.j == null) != (c4170bYv.j == null)) {
                return false;
            }
            if ((this.i == null) != (c4170bYv.i == null)) {
                return false;
            }
            if ((this.g == null) != (c4170bYv.g == null)) {
                return false;
            }
            String str = ((AbstractC4163bYo) this).d;
            if (str == null ? ((AbstractC4163bYo) c4170bYv).d == null : str.equals(((AbstractC4163bYo) c4170bYv).d)) {
                String str2 = ((AbstractC4163bYo) this).b;
                if (str2 == null ? ((AbstractC4163bYo) c4170bYv).b == null : str2.equals(((AbstractC4163bYo) c4170bYv).b)) {
                    if (t() == null ? c4170bYv.t() == null : t().equals(c4170bYv.t())) {
                        if (x() == null ? c4170bYv.x() == null : x().equals(c4170bYv.x())) {
                            if (r() != c4170bYv.r()) {
                                return false;
                            }
                            if (m() == null ? c4170bYv.m() == null : m().equals(c4170bYv.m())) {
                                if ((s() == null) != (c4170bYv.s() == null)) {
                                    return false;
                                }
                                if (o() == null ? c4170bYv.o() == null : o().equals(c4170bYv.o())) {
                                    if (l() == null ? c4170bYv.l() == null : l().equals(c4170bYv.l())) {
                                        if (q() == null ? c4170bYv.q() == null : q().equals(c4170bYv.q())) {
                                            if (p() == null ? c4170bYv.p() == null : p().equals(c4170bYv.p())) {
                                                if (u() != c4170bYv.u()) {
                                                    return false;
                                                }
                                                if (i() == null ? c4170bYv.i() == null : i().equals(c4170bYv.i())) {
                                                    if (n() == null ? c4170bYv.n() == null : n().equals(c4170bYv.n())) {
                                                        return (k() == null) == (c4170bYv.k() == null);
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
        int i2 = this.j != null ? 1 : 0;
        int i3 = this.i != null ? 1 : 0;
        int i4 = this.g != null ? 1 : 0;
        String str = ((AbstractC4163bYo) this).d;
        int hashCode2 = str != null ? str.hashCode() : 0;
        String str2 = ((AbstractC4163bYo) this).b;
        int hashCode3 = str2 != null ? str2.hashCode() : 0;
        int hashCode4 = t() != null ? t().hashCode() : 0;
        int hashCode5 = x() != null ? x().hashCode() : 0;
        int r = r();
        int hashCode6 = m() != null ? m().hashCode() : 0;
        int i5 = s() != null ? 1 : 0;
        int hashCode7 = o() != null ? o().hashCode() : 0;
        int hashCode8 = l() != null ? l().hashCode() : 0;
        int hashCode9 = q() != null ? q().hashCode() : 0;
        int hashCode10 = p() != null ? p().hashCode() : 0;
        int u = u();
        int hashCode11 = i() != null ? i().hashCode() : 0;
        return (((((((((((((((((((((((((((((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + r) * 31) + hashCode6) * 31) + i5) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + u) * 31) + hashCode11) * 31) + (n() != null ? n().hashCode() : 0)) * 31) + (k() != null ? 1 : 0);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "KidsCharacterModel_{videoId=" + ((AbstractC4163bYo) this).d + ", title=" + ((AbstractC4163bYo) this).b + ", storyImageUrl=" + t() + ", titleImageUrl=" + x() + ", runtime=" + r() + ", certification=" + m() + ", ratingIcon=" + s() + ", ratingContentDescription=" + o() + ", playableTitle=" + l() + ", supplementalInfo=" + q() + ", requestId=" + p() + ", trackId=" + u() + ", boxartId=" + i() + ", horizontalGravity=" + n() + ", clickHandler=" + k() + "}" + super.toString();
    }
}
