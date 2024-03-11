package o;

import android.view.View;
import android.view.ViewParent;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.TrackingInfo;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import o.AbstractC3073as;
import o.AbstractC4074bVg;
import o.InterfaceC3825bMa;

/* renamed from: o.bVj  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4077bVj extends AbstractC4074bVg implements InterfaceC1673aK<AbstractC4074bVg.b>, InterfaceC4075bVh {
    private InterfaceC4467bf<C4077bVj, AbstractC4074bVg.b> b;
    private InterfaceC4414be<C4077bVj, AbstractC4074bVg.b> f;
    private InterfaceC4573bh<C4077bVj, AbstractC4074bVg.b> i;
    private InterfaceC4732bk<C4077bVj, AbstractC4074bVg.b> j;

    @Override // o.InterfaceC1673aK
    /* renamed from: a */
    public void e(C1511aE c1511aE, AbstractC4074bVg.b bVar, int i) {
    }

    @Override // o.InterfaceC4075bVh
    public /* synthetic */ InterfaceC4075bVh a(InterfaceC4467bf interfaceC4467bf) {
        return d((InterfaceC4467bf<C4077bVj, AbstractC4074bVg.b>) interfaceC4467bf);
    }

    @Override // o.InterfaceC4075bVh
    public /* synthetic */ InterfaceC4075bVh b(InterfaceC4732bk interfaceC4732bk) {
        return c((InterfaceC4732bk<C4077bVj, AbstractC4074bVg.b>) interfaceC4732bk);
    }

    @Override // o.InterfaceC4075bVh
    public /* synthetic */ InterfaceC4075bVh d(drO dro) {
        return e((drO<? extends TrackingInfo>) dro);
    }

    @Override // o.InterfaceC1673aK
    public void a(AbstractC4074bVg.b bVar, int i) {
        InterfaceC4467bf<C4077bVj, AbstractC4074bVg.b> interfaceC4467bf = this.b;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, bVar, i);
        }
    }

    public C4077bVj d(InterfaceC4467bf<C4077bVj, AbstractC4074bVg.b> interfaceC4467bf) {
        h();
        this.b = interfaceC4467bf;
        return this;
    }

    @Override // o.AbstractC4074bVg, o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: a */
    public void e(AbstractC4074bVg.b bVar) {
        super.e(bVar);
        InterfaceC4414be<C4077bVj, AbstractC4074bVg.b> interfaceC4414be = this.f;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, bVar);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: b */
    public void c(int i, AbstractC4074bVg.b bVar) {
        InterfaceC4732bk<C4077bVj, AbstractC4074bVg.b> interfaceC4732bk = this.j;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, bVar, i);
        }
        super.a(i, (int) bVar);
    }

    public C4077bVj c(InterfaceC4732bk<C4077bVj, AbstractC4074bVg.b> interfaceC4732bk) {
        h();
        this.j = interfaceC4732bk;
        return this;
    }

    @Override // o.AbstractC3336ax
    /* renamed from: a */
    public void d(float f, float f2, int i, int i2, AbstractC4074bVg.b bVar) {
        InterfaceC4573bh<C4077bVj, AbstractC4074bVg.b> interfaceC4573bh = this.i;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, bVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, bVar);
    }

    @Override // o.InterfaceC4075bVh
    /* renamed from: b */
    public C4077bVj a(String str) {
        h();
        super.c(str);
        return this;
    }

    @Override // o.InterfaceC4075bVh
    /* renamed from: d */
    public C4077bVj e(String str) {
        h();
        super.F_(str);
        return this;
    }

    @Override // o.InterfaceC4075bVh
    /* renamed from: d */
    public C4077bVj a(View.OnClickListener onClickListener) {
        h();
        super.c(onClickListener);
        return this;
    }

    @Override // o.InterfaceC4075bVh
    /* renamed from: e */
    public C4077bVj d(TrackingInfoHolder trackingInfoHolder) {
        h();
        super.a(trackingInfoHolder);
        return this;
    }

    @Override // o.InterfaceC4075bVh
    /* renamed from: d */
    public C4077bVj e(InterfaceC3825bMa.a aVar) {
        h();
        super.c_(aVar);
        return this;
    }

    public C4077bVj e(drO<? extends TrackingInfo> dro) {
        h();
        ((AbstractC4074bVg) this).d = dro;
        return this;
    }

    @Override // o.InterfaceC4075bVh
    /* renamed from: b */
    public C4077bVj e(AppView appView) {
        h();
        this.c = appView;
        return this;
    }

    @Override // o.InterfaceC4075bVh
    /* renamed from: e */
    public C4077bVj c(boolean z) {
        h();
        super.d(z);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: b */
    public C4077bVj e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.InterfaceC4075bVh
    /* renamed from: b */
    public C4077bVj c(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: e */
    public C4077bVj a(int i) {
        super.a(i);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: c */
    public C4077bVj a(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: a */
    public AbstractC4074bVg.b b(ViewParent viewParent) {
        return new AbstractC4074bVg.b();
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C4077bVj) && super.equals(obj)) {
            C4077bVj c4077bVj = (C4077bVj) obj;
            if ((this.b == null) != (c4077bVj.b == null)) {
                return false;
            }
            if ((this.f == null) != (c4077bVj.f == null)) {
                return false;
            }
            if ((this.j == null) != (c4077bVj.j == null)) {
                return false;
            }
            if ((this.i == null) != (c4077bVj.i == null)) {
                return false;
            }
            if (k() == null ? c4077bVj.k() == null : k().equals(c4077bVj.k())) {
                if (l() == null ? c4077bVj.l() == null : l().equals(c4077bVj.l())) {
                    if (s() == null ? c4077bVj.s() == null : s().equals(c4077bVj.s())) {
                        if ((q() == null) != (c4077bVj.q() == null)) {
                            return false;
                        }
                        if ((t() == null) != (c4077bVj.t() == null)) {
                            return false;
                        }
                        if (n() == null ? c4077bVj.n() == null : n().equals(c4077bVj.n())) {
                            if ((((AbstractC4074bVg) this).d == null) != (((AbstractC4074bVg) c4077bVj).d == null)) {
                                return false;
                            }
                            AppView appView = this.c;
                            if (appView == null ? c4077bVj.c == null : appView.equals(c4077bVj.c)) {
                                return o() == c4077bVj.o();
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
        int i = this.b != null ? 1 : 0;
        int i2 = this.f != null ? 1 : 0;
        int i3 = this.j != null ? 1 : 0;
        int i4 = this.i != null ? 1 : 0;
        int hashCode2 = k() != null ? k().hashCode() : 0;
        int hashCode3 = l() != null ? l().hashCode() : 0;
        int hashCode4 = s() != null ? s().hashCode() : 0;
        int i5 = q() != null ? 1 : 0;
        int i6 = t() != null ? 1 : 0;
        int hashCode5 = n() != null ? n().hashCode() : 0;
        int i7 = ((AbstractC4074bVg) this).d == null ? 0 : 1;
        AppView appView = this.c;
        return (((((((((((((((((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + i5) * 31) + i6) * 31) + hashCode5) * 31) + i7) * 31) + (appView != null ? appView.hashCode() : 0)) * 31) + (o() ? 1 : 0);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "GameReadyToPlayModel_{gameId=" + k() + ", iconImageUrl=" + l() + ", title=" + s() + ", onClick=" + q() + ", trackingInfoHolder=" + t() + ", impressionInfo=" + n() + ", appView=" + this.c + ", installed=" + o() + "}" + super.toString();
    }
}
