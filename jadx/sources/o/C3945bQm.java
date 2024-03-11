package o;

import android.view.View;
import android.view.ViewParent;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.TrackingInfo;
import o.AbstractC3073as;
import o.AbstractC3940bQh;

/* renamed from: o.bQm  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C3945bQm extends AbstractC3940bQh implements InterfaceC1673aK<AbstractC3940bQh.a>, InterfaceC3943bQk {
    private InterfaceC4467bf<C3945bQm, AbstractC3940bQh.a> c;
    private InterfaceC4414be<C3945bQm, AbstractC3940bQh.a> f;
    private InterfaceC4573bh<C3945bQm, AbstractC3940bQh.a> g;
    private InterfaceC4732bk<C3945bQm, AbstractC3940bQh.a> i;

    @Override // o.InterfaceC1673aK
    /* renamed from: c */
    public void e(C1511aE c1511aE, AbstractC3940bQh.a aVar, int i) {
    }

    @Override // o.InterfaceC3943bQk
    public /* synthetic */ InterfaceC3943bQk e(InterfaceC4732bk interfaceC4732bk) {
        return c((InterfaceC4732bk<C3945bQm, AbstractC3940bQh.a>) interfaceC4732bk);
    }

    @Override // o.InterfaceC3943bQk
    public /* synthetic */ InterfaceC3943bQk e(drO dro) {
        return d((drO<? extends TrackingInfo>) dro);
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: c */
    public void a(AbstractC3940bQh.a aVar, int i) {
        InterfaceC4467bf<C3945bQm, AbstractC3940bQh.a> interfaceC4467bf = this.c;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, aVar, i);
        }
    }

    @Override // o.AbstractC3940bQh, o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: b  reason: avoid collision after fix types in other method */
    public void e(AbstractC3940bQh.a aVar) {
        super.e(aVar);
        InterfaceC4414be<C3945bQm, AbstractC3940bQh.a> interfaceC4414be = this.f;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, aVar);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    public void c(int i, AbstractC3940bQh.a aVar) {
        InterfaceC4732bk<C3945bQm, AbstractC3940bQh.a> interfaceC4732bk = this.i;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, aVar, i);
        }
        super.a(i, (int) aVar);
    }

    public C3945bQm c(InterfaceC4732bk<C3945bQm, AbstractC3940bQh.a> interfaceC4732bk) {
        h();
        this.i = interfaceC4732bk;
        return this;
    }

    @Override // o.AbstractC3336ax
    public void d(float f, float f2, int i, int i2, AbstractC3940bQh.a aVar) {
        InterfaceC4573bh<C3945bQm, AbstractC3940bQh.a> interfaceC4573bh = this.g;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, aVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, (int) aVar);
    }

    @Override // o.InterfaceC3943bQk
    /* renamed from: e */
    public C3945bQm c(View.OnClickListener onClickListener) {
        h();
        super.e_(onClickListener);
        return this;
    }

    @Override // o.InterfaceC3943bQk
    /* renamed from: c */
    public C3945bQm e(boolean z) {
        h();
        super.d(z);
        return this;
    }

    @Override // o.InterfaceC3943bQk
    /* renamed from: b */
    public C3945bQm a(boolean z) {
        h();
        super.v_(z);
        return this;
    }

    public C3945bQm d(drO<? extends TrackingInfo> dro) {
        h();
        ((AbstractC3940bQh) this).b = dro;
        return this;
    }

    @Override // o.InterfaceC3943bQk
    /* renamed from: e */
    public C3945bQm b(AppView appView) {
        h();
        ((AbstractC3940bQh) this).d = appView;
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: a */
    public C3945bQm e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.InterfaceC3943bQk
    /* renamed from: c */
    public C3945bQm e(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.InterfaceC3943bQk
    /* renamed from: b */
    public C3945bQm e(int i) {
        super.a(i);
        return this;
    }

    @Override // o.InterfaceC3943bQk
    /* renamed from: e */
    public C3945bQm d(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: c */
    public AbstractC3940bQh.a b(ViewParent viewParent) {
        return new AbstractC3940bQh.a();
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C3945bQm) && super.equals(obj)) {
            C3945bQm c3945bQm = (C3945bQm) obj;
            if ((this.c == null) != (c3945bQm.c == null)) {
                return false;
            }
            if ((this.f == null) != (c3945bQm.f == null)) {
                return false;
            }
            if ((this.i == null) != (c3945bQm.i == null)) {
                return false;
            }
            if ((this.g == null) != (c3945bQm.g == null)) {
                return false;
            }
            if ((k() == null) == (c3945bQm.k() == null) && l() == c3945bQm.l() && o() == c3945bQm.o()) {
                if (n() == null ? c3945bQm.n() == null : n().equals(c3945bQm.n())) {
                    if ((((AbstractC3940bQh) this).b == null) != (((AbstractC3940bQh) c3945bQm).b == null)) {
                        return false;
                    }
                    AppView appView = ((AbstractC3940bQh) this).d;
                    AppView appView2 = ((AbstractC3940bQh) c3945bQm).d;
                    return appView == null ? appView2 == null : appView.equals(appView2);
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
        int i3 = this.i != null ? 1 : 0;
        int i4 = this.g != null ? 1 : 0;
        int i5 = k() != null ? 1 : 0;
        boolean l = l();
        boolean o2 = o();
        int hashCode2 = n() != null ? n().hashCode() : 0;
        int i6 = ((AbstractC3940bQh) this).b == null ? 0 : 1;
        AppView appView = ((AbstractC3940bQh) this).d;
        return (((((((((((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + i5) * 31) + (l ? 1 : 0)) * 31) + (o2 ? 1 : 0)) * 31) + hashCode2) * 31) + i6) * 31) + (appView != null ? appView.hashCode() : 0);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "GdpCtasModel_{launchClickListener=" + k() + ", installed=" + l() + ", canInstall=" + o() + ", impressionInfo=" + n() + ", appView=" + ((AbstractC3940bQh) this).d + "}" + super.toString();
    }
}
