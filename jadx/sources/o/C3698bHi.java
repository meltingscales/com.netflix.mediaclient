package o;

import android.view.ViewParent;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.TrackingInfo;
import o.AbstractC3073as;
import o.AbstractC3696bHg;

/* renamed from: o.bHi  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C3698bHi extends AbstractC3696bHg implements InterfaceC1673aK<AbstractC3696bHg.a>, InterfaceC3697bHh {
    private InterfaceC4467bf<C3698bHi, AbstractC3696bHg.a> c;
    private InterfaceC4573bh<C3698bHi, AbstractC3696bHg.a> f;
    private InterfaceC4732bk<C3698bHi, AbstractC3696bHg.a> h;
    private InterfaceC4414be<C3698bHi, AbstractC3696bHg.a> i;

    @Override // o.InterfaceC1673aK
    public void e(C1511aE c1511aE, AbstractC3696bHg.a aVar, int i) {
    }

    @Override // o.InterfaceC3697bHh
    public /* synthetic */ InterfaceC3697bHh a(drO dro) {
        return b((drO<? extends TrackingInfo>) dro);
    }

    @Override // o.InterfaceC3697bHh
    public /* synthetic */ InterfaceC3697bHh e(InterfaceC4732bk interfaceC4732bk) {
        return c((InterfaceC4732bk<C3698bHi, AbstractC3696bHg.a>) interfaceC4732bk);
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: d */
    public void a(AbstractC3696bHg.a aVar, int i) {
        InterfaceC4467bf<C3698bHi, AbstractC3696bHg.a> interfaceC4467bf = this.c;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, aVar, i);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    public void e(AbstractC3696bHg.a aVar) {
        super.b((C3698bHi) aVar);
        InterfaceC4414be<C3698bHi, AbstractC3696bHg.a> interfaceC4414be = this.i;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, aVar);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: b */
    public void c(int i, AbstractC3696bHg.a aVar) {
        InterfaceC4732bk<C3698bHi, AbstractC3696bHg.a> interfaceC4732bk = this.h;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, aVar, i);
        }
        super.a(i, (int) aVar);
    }

    public C3698bHi c(InterfaceC4732bk<C3698bHi, AbstractC3696bHg.a> interfaceC4732bk) {
        h();
        this.h = interfaceC4732bk;
        return this;
    }

    @Override // o.AbstractC3336ax
    public void d(float f, float f2, int i, int i2, AbstractC3696bHg.a aVar) {
        InterfaceC4573bh<C3698bHi, AbstractC3696bHg.a> interfaceC4573bh = this.f;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, aVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, (int) aVar);
    }

    @Override // o.InterfaceC3697bHh
    /* renamed from: a */
    public C3698bHi b(String str) {
        h();
        super.c(str);
        return this;
    }

    @Override // o.InterfaceC3697bHh
    /* renamed from: b */
    public C3698bHi c(Integer num) {
        h();
        super.d(num);
        return this;
    }

    @Override // o.InterfaceC3697bHh
    /* renamed from: j */
    public C3698bHi d(int i) {
        h();
        super.h_(i);
        return this;
    }

    @Override // o.InterfaceC3697bHh
    /* renamed from: c */
    public C3698bHi e(int i) {
        h();
        super.g_(i);
        return this;
    }

    public C3698bHi b(drO<? extends TrackingInfo> dro) {
        h();
        ((AbstractC3696bHg) this).d = dro;
        return this;
    }

    @Override // o.InterfaceC3697bHh
    /* renamed from: a */
    public C3698bHi c(AppView appView) {
        h();
        ((AbstractC3696bHg) this).b = appView;
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: b */
    public C3698bHi e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.InterfaceC3697bHh
    /* renamed from: c */
    public C3698bHi b(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: b */
    public C3698bHi a(int i) {
        super.a(i);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: c */
    public C3698bHi a(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: c */
    public AbstractC3696bHg.a b(ViewParent viewParent) {
        return new AbstractC3696bHg.a();
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C3698bHi) && super.equals(obj)) {
            C3698bHi c3698bHi = (C3698bHi) obj;
            if ((this.c == null) != (c3698bHi.c == null)) {
                return false;
            }
            if ((this.i == null) != (c3698bHi.i == null)) {
                return false;
            }
            if ((this.h == null) != (c3698bHi.h == null)) {
                return false;
            }
            if ((this.f == null) != (c3698bHi.f == null)) {
                return false;
            }
            if (t() == null ? c3698bHi.t() == null : t().equals(c3698bHi.t())) {
                if ((o() == null) != (c3698bHi.o() == null)) {
                    return false;
                }
                if (k() == null ? c3698bHi.k() == null : k().equals(c3698bHi.k())) {
                    if (p() == c3698bHi.p() && l() == c3698bHi.l()) {
                        if ((((AbstractC3696bHg) this).d == null) != (((AbstractC3696bHg) c3698bHi).d == null)) {
                            return false;
                        }
                        AppView appView = ((AbstractC3696bHg) this).b;
                        AppView appView2 = ((AbstractC3696bHg) c3698bHi).b;
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

    @Override // o.AbstractC3073as
    public int hashCode() {
        int hashCode = super.hashCode();
        int i = this.c != null ? 1 : 0;
        int i2 = this.i != null ? 1 : 0;
        int i3 = this.h != null ? 1 : 0;
        int i4 = this.f != null ? 1 : 0;
        int hashCode2 = t() != null ? t().hashCode() : 0;
        int i5 = o() != null ? 1 : 0;
        int hashCode3 = k() != null ? k().hashCode() : 0;
        int p = p();
        int l = l();
        int i6 = ((AbstractC3696bHg) this).d == null ? 0 : 1;
        AppView appView = ((AbstractC3696bHg) this).b;
        return (((((((((((((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + hashCode2) * 31) + i5) * 31) + hashCode3) * 31) + p) * 31) + l) * 31) + i6) * 31) + (appView != null ? appView.hashCode() : 0);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "DpSynopsisModel_{synopsisText=" + t() + ", onClick=" + o() + ", horizontalMargin=" + k() + ", paddingTop=" + p() + ", paddingBottom=" + l() + ", appView=" + ((AbstractC3696bHg) this).b + "}" + super.toString();
    }
}
