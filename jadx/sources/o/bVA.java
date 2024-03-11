package o;

import android.view.View;
import android.view.ViewParent;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.TrackingInfo;
import o.AbstractC3073as;
import o.AbstractC4092bVy;
import o.InterfaceC3825bMa;

/* loaded from: classes4.dex */
public class bVA extends AbstractC4092bVy implements InterfaceC1673aK<AbstractC4092bVy.b>, InterfaceC4090bVw {
    private InterfaceC4573bh<bVA, AbstractC4092bVy.b> f;
    private InterfaceC4414be<bVA, AbstractC4092bVy.b> g;
    private InterfaceC4467bf<bVA, AbstractC4092bVy.b> i;
    private InterfaceC4732bk<bVA, AbstractC4092bVy.b> j;

    @Override // o.InterfaceC1673aK
    /* renamed from: d */
    public void e(C1511aE c1511aE, AbstractC4092bVy.b bVar, int i) {
    }

    @Override // o.InterfaceC4090bVw
    public /* synthetic */ InterfaceC4090bVw a(InterfaceC4467bf interfaceC4467bf) {
        return c((InterfaceC4467bf<bVA, AbstractC4092bVy.b>) interfaceC4467bf);
    }

    @Override // o.InterfaceC4090bVw
    public /* synthetic */ InterfaceC4090bVw e(InterfaceC4732bk interfaceC4732bk) {
        return a((InterfaceC4732bk<bVA, AbstractC4092bVy.b>) interfaceC4732bk);
    }

    @Override // o.InterfaceC4090bVw
    public /* synthetic */ InterfaceC4090bVw e(drO dro) {
        return b((drO<? extends TrackingInfo>) dro);
    }

    @Override // o.InterfaceC1673aK
    public void a(AbstractC4092bVy.b bVar, int i) {
        InterfaceC4467bf<bVA, AbstractC4092bVy.b> interfaceC4467bf = this.i;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, bVar, i);
        }
    }

    public bVA c(InterfaceC4467bf<bVA, AbstractC4092bVy.b> interfaceC4467bf) {
        h();
        this.i = interfaceC4467bf;
        return this;
    }

    @Override // o.AbstractC4092bVy, o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: a */
    public void e(AbstractC4092bVy.b bVar) {
        super.e(bVar);
        InterfaceC4414be<bVA, AbstractC4092bVy.b> interfaceC4414be = this.g;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, bVar);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    public void c(int i, AbstractC4092bVy.b bVar) {
        InterfaceC4732bk<bVA, AbstractC4092bVy.b> interfaceC4732bk = this.j;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, bVar, i);
        }
        super.a(i, (int) bVar);
    }

    public bVA a(InterfaceC4732bk<bVA, AbstractC4092bVy.b> interfaceC4732bk) {
        h();
        this.j = interfaceC4732bk;
        return this;
    }

    @Override // o.AbstractC3336ax
    /* renamed from: c */
    public void d(float f, float f2, int i, int i2, AbstractC4092bVy.b bVar) {
        InterfaceC4573bh<bVA, AbstractC4092bVy.b> interfaceC4573bh = this.f;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, bVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, bVar);
    }

    @Override // o.InterfaceC4090bVw
    /* renamed from: b */
    public bVA a(InterfaceC3825bMa.a aVar) {
        h();
        super.c(aVar);
        return this;
    }

    @Override // o.InterfaceC4090bVw
    /* renamed from: i */
    public bVA c(String str) {
        h();
        super.M_(str);
        return this;
    }

    @Override // o.InterfaceC4090bVw
    /* renamed from: h */
    public bVA b(String str) {
        h();
        super.L_(str);
        return this;
    }

    @Override // o.InterfaceC4090bVw
    /* renamed from: e */
    public bVA a(String str) {
        h();
        super.d(str);
        return this;
    }

    @Override // o.InterfaceC4090bVw
    /* renamed from: b */
    public bVA d(View.OnClickListener onClickListener) {
        h();
        super.a(onClickListener);
        return this;
    }

    public bVA b(drO<? extends TrackingInfo> dro) {
        h();
        this.c = dro;
        return this;
    }

    @Override // o.InterfaceC4090bVw
    /* renamed from: a */
    public bVA c(AppView appView) {
        h();
        ((AbstractC4092bVy) this).b = appView;
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: c */
    public bVA e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.InterfaceC4090bVw
    /* renamed from: e */
    public bVA b(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: c */
    public bVA a(int i) {
        super.a(i);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: e */
    public bVA a(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: c */
    public AbstractC4092bVy.b b(ViewParent viewParent) {
        return new AbstractC4092bVy.b();
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof bVA) && super.equals(obj)) {
            bVA bva = (bVA) obj;
            if ((this.i == null) != (bva.i == null)) {
                return false;
            }
            if ((this.g == null) != (bva.g == null)) {
                return false;
            }
            if ((this.j == null) != (bva.j == null)) {
                return false;
            }
            if ((this.f == null) != (bva.f == null)) {
                return false;
            }
            if (n() == null ? bva.n() == null : n().equals(bva.n())) {
                if (s() == null ? bva.s() == null : s().equals(bva.s())) {
                    if (t() == null ? bva.t() == null : t().equals(bva.t())) {
                        if (o() == null ? bva.o() == null : o().equals(bva.o())) {
                            if (k() == null ? bva.k() == null : k().equals(bva.k())) {
                                if (q() != bva.q()) {
                                    return false;
                                }
                                if ((l() == null) != (bva.l() == null)) {
                                    return false;
                                }
                                if ((this.c == null) != (bva.c == null)) {
                                    return false;
                                }
                                AppView appView = ((AbstractC4092bVy) this).b;
                                AppView appView2 = ((AbstractC4092bVy) bva).b;
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

    @Override // o.AbstractC3073as
    public int hashCode() {
        int hashCode = super.hashCode();
        int i = this.i != null ? 1 : 0;
        int i2 = this.g != null ? 1 : 0;
        int i3 = this.j != null ? 1 : 0;
        int i4 = this.f != null ? 1 : 0;
        int hashCode2 = n() != null ? n().hashCode() : 0;
        int hashCode3 = s() != null ? s().hashCode() : 0;
        int hashCode4 = t() != null ? t().hashCode() : 0;
        int hashCode5 = o() != null ? o().hashCode() : 0;
        int hashCode6 = k() != null ? k().hashCode() : 0;
        boolean q = q();
        int i5 = l() != null ? 1 : 0;
        int i6 = this.c == null ? 0 : 1;
        AppView appView = ((AbstractC4092bVy) this).b;
        return (((((((((((((((((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + (q ? 1 : 0)) * 31) + i5) * 31) + i6) * 31) + (appView != null ? appView.hashCode() : 0);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "KidsFavoritesVideoModel_{impressionInfo=" + n() + ", videoId=" + s() + ", title=" + t() + ", characterUrl=" + o() + ", boxshotUrl=" + k() + ", roundAsCircle=" + q() + ", onClick=" + l() + ", appView=" + ((AbstractC4092bVy) this).b + "}" + super.toString();
    }
}
