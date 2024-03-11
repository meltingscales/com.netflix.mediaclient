package o;

import android.view.View;
import android.view.ViewParent;
import com.netflix.cl.model.AppView;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import o.AbstractC3073as;
import o.AbstractC6123cUs;

/* renamed from: o.cUz  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6130cUz extends AbstractC6123cUs implements InterfaceC1673aK<AbstractC6123cUs.e>, InterfaceC6122cUr {
    private InterfaceC4732bk<C6130cUz, AbstractC6123cUs.e> g;
    private InterfaceC4414be<C6130cUz, AbstractC6123cUs.e> h;
    private InterfaceC4573bh<C6130cUz, AbstractC6123cUs.e> i;
    private InterfaceC4467bf<C6130cUz, AbstractC6123cUs.e> j;

    @Override // o.InterfaceC1673aK
    public void e(C1511aE c1511aE, AbstractC6123cUs.e eVar, int i) {
    }

    @Override // o.InterfaceC6122cUr
    public /* synthetic */ InterfaceC6122cUr c(InterfaceC4308bc interfaceC4308bc) {
        return a((InterfaceC4308bc<C6130cUz, AbstractC6123cUs.e>) interfaceC4308bc);
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: c */
    public void a(AbstractC6123cUs.e eVar, int i) {
        InterfaceC4467bf<C6130cUz, AbstractC6123cUs.e> interfaceC4467bf = this.j;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, eVar, i);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: a */
    public void e(AbstractC6123cUs.e eVar) {
        super.b((C6130cUz) eVar);
        InterfaceC4414be<C6130cUz, AbstractC6123cUs.e> interfaceC4414be = this.h;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, eVar);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    public void c(int i, AbstractC6123cUs.e eVar) {
        InterfaceC4732bk<C6130cUz, AbstractC6123cUs.e> interfaceC4732bk = this.g;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, eVar, i);
        }
        super.a(i, (int) eVar);
    }

    @Override // o.AbstractC3336ax
    /* renamed from: a */
    public void d(float f, float f2, int i, int i2, AbstractC6123cUs.e eVar) {
        InterfaceC4573bh<C6130cUz, AbstractC6123cUs.e> interfaceC4573bh = this.i;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, eVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, eVar);
    }

    @Override // o.InterfaceC6122cUr
    /* renamed from: e */
    public C6130cUz b(String str) {
        h();
        ((AbstractC6123cUs) this).d = str;
        return this;
    }

    public C6130cUz a(InterfaceC4308bc<C6130cUz, AbstractC6123cUs.e> interfaceC4308bc) {
        h();
        if (interfaceC4308bc == null) {
            super.b((View.OnClickListener) null);
        } else {
            super.b((View.OnClickListener) new View$OnClickListenerC4818bn(interfaceC4308bc));
        }
        return this;
    }

    @Override // o.InterfaceC6122cUr
    /* renamed from: a */
    public C6130cUz c(String str) {
        h();
        super.ag_(str);
        return this;
    }

    @Override // o.InterfaceC6122cUr
    /* renamed from: d */
    public C6130cUz e(boolean z) {
        h();
        super.c(z);
        return this;
    }

    @Override // o.InterfaceC6122cUr
    /* renamed from: e */
    public C6130cUz a(AppView appView) {
        h();
        this.c = appView;
        return this;
    }

    @Override // o.InterfaceC6122cUr
    /* renamed from: b */
    public C6130cUz d(TrackingInfoHolder trackingInfoHolder) {
        h();
        ((AbstractC6123cUs) this).b = trackingInfoHolder;
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: c */
    public C6130cUz e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.InterfaceC6122cUr
    /* renamed from: d */
    public C6130cUz c(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: d */
    public C6130cUz a(int i) {
        super.a(i);
        return this;
    }

    @Override // o.InterfaceC6122cUr
    /* renamed from: c */
    public C6130cUz b(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: e */
    public AbstractC6123cUs.e b(ViewParent viewParent) {
        return new AbstractC6123cUs.e();
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C6130cUz) && super.equals(obj)) {
            C6130cUz c6130cUz = (C6130cUz) obj;
            if ((this.j == null) != (c6130cUz.j == null)) {
                return false;
            }
            if ((this.h == null) != (c6130cUz.h == null)) {
                return false;
            }
            if ((this.g == null) != (c6130cUz.g == null)) {
                return false;
            }
            if ((this.i == null) != (c6130cUz.i == null)) {
                return false;
            }
            String str = ((AbstractC6123cUs) this).d;
            if (str == null ? ((AbstractC6123cUs) c6130cUz).d == null : str.equals(((AbstractC6123cUs) c6130cUz).d)) {
                if ((i() == null) != (c6130cUz.i() == null)) {
                    return false;
                }
                if ((((AbstractC6123cUs) this).f == null) != (((AbstractC6123cUs) c6130cUz).f == null)) {
                    return false;
                }
                if (n() == null ? c6130cUz.n() == null : n().equals(c6130cUz.n())) {
                    if (l() != c6130cUz.l()) {
                        return false;
                    }
                    if ((this.c == null) != (c6130cUz.c == null)) {
                        return false;
                    }
                    return (((AbstractC6123cUs) this).b == null) == (((AbstractC6123cUs) c6130cUz).b == null);
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
        int i = this.j != null ? 1 : 0;
        int i2 = this.h != null ? 1 : 0;
        int i3 = this.g != null ? 1 : 0;
        int i4 = this.i != null ? 1 : 0;
        String str = ((AbstractC6123cUs) this).d;
        int hashCode2 = str != null ? str.hashCode() : 0;
        int i5 = i() != null ? 1 : 0;
        int i6 = ((AbstractC6123cUs) this).f != null ? 1 : 0;
        int hashCode3 = n() != null ? n().hashCode() : 0;
        boolean l = l();
        return (((((((((((((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + hashCode2) * 31) + i5) * 31) + i6) * 31) + hashCode3) * 31) + (l ? 1 : 0)) * 31) + (this.c != null ? 1 : 0)) * 31) + (((AbstractC6123cUs) this).b != null ? 1 : 0);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "SearchSuggestionViewModel_{title=" + ((AbstractC6123cUs) this).d + ", clickListener=" + i() + ", videoId=" + ((AbstractC6123cUs) this).f + ", query=" + n() + ", enableTitleGroupTreatment=" + l() + ", appView=" + this.c + ", trackingInfoHolder=" + ((AbstractC6123cUs) this).b + "}" + super.toString();
    }
}
