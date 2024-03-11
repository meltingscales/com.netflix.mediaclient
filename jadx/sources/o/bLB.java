package o;

import android.view.View;
import android.view.ViewParent;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.TrackingInfo;
import o.AbstractC3073as;
import o.AbstractC3823bLz;
import o.InterfaceC3825bMa;

/* loaded from: classes4.dex */
public class bLB extends AbstractC3823bLz implements InterfaceC1673aK<AbstractC3823bLz.a>, bLA {
    private InterfaceC4467bf<bLB, AbstractC3823bLz.a> c;
    private InterfaceC4414be<bLB, AbstractC3823bLz.a> d;
    private InterfaceC4732bk<bLB, AbstractC3823bLz.a> h;
    private InterfaceC4573bh<bLB, AbstractC3823bLz.a> i;

    @Override // o.InterfaceC1673aK
    /* renamed from: b */
    public void e(C1511aE c1511aE, AbstractC3823bLz.a aVar, int i) {
    }

    @Override // o.bLA
    public /* synthetic */ bLA b(InterfaceC4467bf interfaceC4467bf) {
        return a((InterfaceC4467bf<bLB, AbstractC3823bLz.a>) interfaceC4467bf);
    }

    @Override // o.bLA
    public /* synthetic */ bLA b(drO dro) {
        return d((drO<? extends TrackingInfo>) dro);
    }

    @Override // o.bLA
    public /* synthetic */ bLA d(InterfaceC4732bk interfaceC4732bk) {
        return b((InterfaceC4732bk<bLB, AbstractC3823bLz.a>) interfaceC4732bk);
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: c */
    public void a(AbstractC3823bLz.a aVar, int i) {
        InterfaceC4467bf<bLB, AbstractC3823bLz.a> interfaceC4467bf = this.c;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, aVar, i);
        }
    }

    public bLB a(InterfaceC4467bf<bLB, AbstractC3823bLz.a> interfaceC4467bf) {
        h();
        this.c = interfaceC4467bf;
        return this;
    }

    @Override // o.AbstractC3823bLz, o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: c */
    public void e(AbstractC3823bLz.a aVar) {
        super.e(aVar);
        InterfaceC4414be<bLB, AbstractC3823bLz.a> interfaceC4414be = this.d;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, aVar);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: d */
    public void c(int i, AbstractC3823bLz.a aVar) {
        InterfaceC4732bk<bLB, AbstractC3823bLz.a> interfaceC4732bk = this.h;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, aVar, i);
        }
        super.a(i, (int) aVar);
    }

    public bLB b(InterfaceC4732bk<bLB, AbstractC3823bLz.a> interfaceC4732bk) {
        h();
        this.h = interfaceC4732bk;
        return this;
    }

    @Override // o.AbstractC3336ax
    /* renamed from: c */
    public void d(float f, float f2, int i, int i2, AbstractC3823bLz.a aVar) {
        InterfaceC4573bh<bLB, AbstractC3823bLz.a> interfaceC4573bh = this.i;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, aVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, aVar);
    }

    @Override // o.bLA
    /* renamed from: c */
    public bLB b(View.OnClickListener onClickListener) {
        h();
        super.d_(onClickListener);
        return this;
    }

    @Override // o.bLA
    /* renamed from: h */
    public bLB d(String str) {
        h();
        super.b(str);
        return this;
    }

    @Override // o.bLA
    /* renamed from: f */
    public bLB a(String str) {
        h();
        super.c(str);
        return this;
    }

    @Override // o.bLA
    /* renamed from: e */
    public bLB b(CharSequence charSequence) {
        h();
        super.d(charSequence);
        return this;
    }

    @Override // o.bLA
    /* renamed from: g */
    public bLB e(String str) {
        h();
        super.m_(str);
        return this;
    }

    public bLB d(drO<? extends TrackingInfo> dro) {
        h();
        ((AbstractC3823bLz) this).b = dro;
        return this;
    }

    @Override // o.bLA
    /* renamed from: d */
    public bLB a(AppView appView) {
        h();
        super.a_(appView);
        return this;
    }

    @Override // o.bLA
    /* renamed from: b */
    public bLB a(InterfaceC3825bMa.a aVar) {
        h();
        super.c(aVar);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: c */
    public bLB e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.bLA
    /* renamed from: i */
    public bLB c(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: d */
    public bLB a(int i) {
        super.a(i);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: b */
    public bLB a(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: e */
    public AbstractC3823bLz.a b(ViewParent viewParent) {
        return new AbstractC3823bLz.a();
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof bLB) && super.equals(obj)) {
            bLB blb = (bLB) obj;
            if ((this.c == null) != (blb.c == null)) {
                return false;
            }
            if ((this.d == null) != (blb.d == null)) {
                return false;
            }
            if ((this.h == null) != (blb.h == null)) {
                return false;
            }
            if ((this.i == null) != (blb.i == null)) {
                return false;
            }
            if ((l() == null) != (blb.l() == null)) {
                return false;
            }
            if (r() == null ? blb.r() == null : r().equals(blb.r())) {
                if (p() == null ? blb.p() == null : p().equals(blb.p())) {
                    if (k() == null ? blb.k() == null : k().equals(blb.k())) {
                        if (o() == null ? blb.o() == null : o().equals(blb.o())) {
                            if ((((AbstractC3823bLz) this).b == null) != (((AbstractC3823bLz) blb).b == null)) {
                                return false;
                            }
                            if (aj_() == null ? blb.aj_() == null : aj_().equals(blb.aj_())) {
                                return n() == null ? blb.n() == null : n().equals(blb.n());
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
        int i2 = this.d != null ? 1 : 0;
        int i3 = this.h != null ? 1 : 0;
        int i4 = this.i != null ? 1 : 0;
        int i5 = l() != null ? 1 : 0;
        int hashCode2 = r() != null ? r().hashCode() : 0;
        int hashCode3 = p() != null ? p().hashCode() : 0;
        int hashCode4 = k() != null ? k().hashCode() : 0;
        int hashCode5 = o() != null ? o().hashCode() : 0;
        int i6 = ((AbstractC3823bLz) this).b == null ? 0 : 1;
        return (((((((((((((((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + i5) * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + i6) * 31) + (aj_() != null ? aj_().hashCode() : 0)) * 31) + (n() != null ? n().hashCode() : 0);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "TrendingNowLocalMomentModel_{onClick=" + l() + ", title=" + r() + ", synopsis=" + p() + ", contentDescription=" + ((Object) k()) + ", backgroundImageUrl=" + o() + ", appView=" + aj_() + ", impressionInfo=" + n() + "}" + super.toString();
    }
}
