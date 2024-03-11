package o;

import android.view.View;
import android.view.ViewParent;
import com.netflix.cl.model.AppView;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import o.AbstractC3073as;
import o.AbstractC4068bVa;

/* renamed from: o.bVi  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4076bVi extends AbstractC4068bVa implements InterfaceC1673aK<AbstractC4068bVa.a>, InterfaceC4073bVf {
    private InterfaceC4467bf<C4076bVi, AbstractC4068bVa.a> d;
    private InterfaceC4573bh<C4076bVi, AbstractC4068bVa.a> f;
    private InterfaceC4732bk<C4076bVi, AbstractC4068bVa.a> h;
    private InterfaceC4414be<C4076bVi, AbstractC4068bVa.a> j;

    @Override // o.InterfaceC1673aK
    /* renamed from: d */
    public void e(C1511aE c1511aE, AbstractC4068bVa.a aVar, int i) {
    }

    @Override // o.InterfaceC4073bVf
    public /* synthetic */ InterfaceC4073bVf a(InterfaceC4732bk interfaceC4732bk) {
        return e((InterfaceC4732bk<C4076bVi, AbstractC4068bVa.a>) interfaceC4732bk);
    }

    @Override // o.InterfaceC4073bVf
    public /* synthetic */ InterfaceC4073bVf d(InterfaceC4467bf interfaceC4467bf) {
        return a((InterfaceC4467bf<C4076bVi, AbstractC4068bVa.a>) interfaceC4467bf);
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: b */
    public void a(AbstractC4068bVa.a aVar, int i) {
        InterfaceC4467bf<C4076bVi, AbstractC4068bVa.a> interfaceC4467bf = this.d;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, aVar, i);
        }
    }

    public C4076bVi a(InterfaceC4467bf<C4076bVi, AbstractC4068bVa.a> interfaceC4467bf) {
        h();
        this.d = interfaceC4467bf;
        return this;
    }

    @Override // o.AbstractC4068bVa, o.AbstractC3336ax, o.AbstractC3073as
    public void e(AbstractC4068bVa.a aVar) {
        super.e(aVar);
        InterfaceC4414be<C4076bVi, AbstractC4068bVa.a> interfaceC4414be = this.j;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, aVar);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public void c(int i, AbstractC4068bVa.a aVar) {
        InterfaceC4732bk<C4076bVi, AbstractC4068bVa.a> interfaceC4732bk = this.h;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, aVar, i);
        }
        super.a(i, (int) aVar);
    }

    public C4076bVi e(InterfaceC4732bk<C4076bVi, AbstractC4068bVa.a> interfaceC4732bk) {
        h();
        this.h = interfaceC4732bk;
        return this;
    }

    @Override // o.AbstractC3336ax
    /* renamed from: c */
    public void d(float f, float f2, int i, int i2, AbstractC4068bVa.a aVar) {
        InterfaceC4573bh<C4076bVi, AbstractC4068bVa.a> interfaceC4573bh = this.f;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, aVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, aVar);
    }

    @Override // o.InterfaceC4073bVf
    /* renamed from: c */
    public C4076bVi e(View.OnClickListener onClickListener) {
        h();
        super.b(onClickListener);
        return this;
    }

    @Override // o.InterfaceC4073bVf
    /* renamed from: c */
    public C4076bVi b(AppView appView) {
        h();
        this.c = appView;
        return this;
    }

    @Override // o.InterfaceC4073bVf
    /* renamed from: d */
    public C4076bVi e(TrackingInfoHolder trackingInfoHolder) {
        h();
        ((AbstractC4068bVa) this).b = trackingInfoHolder;
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: c */
    public C4076bVi e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.InterfaceC4073bVf
    /* renamed from: d */
    public C4076bVi b(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: d */
    public C4076bVi a(int i) {
        super.a(i);
        return this;
    }

    @Override // o.InterfaceC4073bVf
    /* renamed from: d */
    public C4076bVi e(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: a */
    public AbstractC4068bVa.a b(ViewParent viewParent) {
        return new AbstractC4068bVa.a();
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C4076bVi) && super.equals(obj)) {
            C4076bVi c4076bVi = (C4076bVi) obj;
            if ((this.d == null) != (c4076bVi.d == null)) {
                return false;
            }
            if ((this.j == null) != (c4076bVi.j == null)) {
                return false;
            }
            if ((this.h == null) != (c4076bVi.h == null)) {
                return false;
            }
            if ((this.f == null) != (c4076bVi.f == null)) {
                return false;
            }
            if (n() == null ? c4076bVi.n() == null : n().equals(c4076bVi.n())) {
                if ((k() == null) != (c4076bVi.k() == null)) {
                    return false;
                }
                AppView appView = this.c;
                if (appView == null ? c4076bVi.c == null : appView.equals(c4076bVi.c)) {
                    return (((AbstractC4068bVa) this).b == null) == (((AbstractC4068bVa) c4076bVi).b == null);
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
        int i = this.d != null ? 1 : 0;
        int i2 = this.j != null ? 1 : 0;
        int i3 = this.h != null ? 1 : 0;
        int i4 = this.f != null ? 1 : 0;
        int hashCode2 = n() != null ? n().hashCode() : 0;
        int i5 = k() != null ? 1 : 0;
        AppView appView = this.c;
        return (((((((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + hashCode2) * 31) + i5) * 31) + (appView != null ? appView.hashCode() : 0)) * 31) + (((AbstractC4068bVa) this).b != null ? 1 : 0);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "GameIdentityRowModel_{impressionInfo=" + n() + ", onClick=" + k() + ", appView=" + this.c + ", trackingInfoHolder=" + ((AbstractC4068bVa) this).b + "}" + super.toString();
    }
}
