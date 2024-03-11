package o;

import android.view.View;
import android.view.ViewParent;
import com.netflix.cl.model.AppView;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import o.AbstractC3073as;
import o.AbstractC3813bLp;

/* loaded from: classes4.dex */
public class bKY extends bKX implements InterfaceC1673aK<AbstractC3813bLp.c>, bKV {
    private InterfaceC4467bf<bKY, AbstractC3813bLp.c> d;
    private InterfaceC4573bh<bKY, AbstractC3813bLp.c> g;
    private InterfaceC4732bk<bKY, AbstractC3813bLp.c> h;
    private InterfaceC4414be<bKY, AbstractC3813bLp.c> i;

    @Override // o.InterfaceC1673aK
    /* renamed from: a */
    public void e(C1511aE c1511aE, AbstractC3813bLp.c cVar, int i) {
    }

    @Override // o.bKV
    public /* synthetic */ bKV e(InterfaceC4732bk interfaceC4732bk) {
        return c((InterfaceC4732bk<bKY, AbstractC3813bLp.c>) interfaceC4732bk);
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: c */
    public void a(AbstractC3813bLp.c cVar, int i) {
        InterfaceC4467bf<bKY, AbstractC3813bLp.c> interfaceC4467bf = this.d;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, cVar, i);
        }
    }

    @Override // o.AbstractC3813bLp, o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: b  reason: avoid collision after fix types in other method */
    public void e(AbstractC3813bLp.c cVar) {
        super.e(cVar);
        InterfaceC4414be<bKY, AbstractC3813bLp.c> interfaceC4414be = this.i;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, cVar);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: d */
    public void c(int i, AbstractC3813bLp.c cVar) {
        InterfaceC4732bk<bKY, AbstractC3813bLp.c> interfaceC4732bk = this.h;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, cVar, i);
        }
        super.a(i, (int) cVar);
    }

    public bKY c(InterfaceC4732bk<bKY, AbstractC3813bLp.c> interfaceC4732bk) {
        h();
        this.h = interfaceC4732bk;
        return this;
    }

    @Override // o.AbstractC3336ax
    /* renamed from: a */
    public void d(float f, float f2, int i, int i2, AbstractC3813bLp.c cVar) {
        InterfaceC4573bh<bKY, AbstractC3813bLp.c> interfaceC4573bh = this.g;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, cVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, cVar);
    }

    @Override // o.bKV
    /* renamed from: e */
    public bKY b(String str) {
        h();
        super.l_(str);
        return this;
    }

    @Override // o.bKV
    /* renamed from: c */
    public bKY e(AppView appView) {
        h();
        ((bKX) this).c = appView;
        return this;
    }

    @Override // o.bKV
    /* renamed from: a */
    public bKY d(TrackingInfoHolder trackingInfoHolder) {
        h();
        ((bKX) this).b = trackingInfoHolder;
        return this;
    }

    @Override // o.bKV
    /* renamed from: e */
    public bKY d(View.OnClickListener onClickListener) {
        h();
        super.c(onClickListener);
        return this;
    }

    @Override // o.bKV
    /* renamed from: d */
    public bKY c(CharSequence charSequence) {
        h();
        super.h(charSequence);
        return this;
    }

    @Override // o.AbstractC3813bLp
    public boolean o() {
        return super.o();
    }

    @Override // o.AbstractC3073as
    /* renamed from: b */
    public bKY e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.bKV
    /* renamed from: e */
    public bKY b(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.bKV
    /* renamed from: c */
    public bKY b(int i) {
        super.a(i);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: c */
    public bKY a(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: e */
    public AbstractC3813bLp.c b(ViewParent viewParent) {
        return new AbstractC3813bLp.c();
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof bKY) && super.equals(obj)) {
            bKY bky = (bKY) obj;
            if ((this.d == null) != (bky.d == null)) {
                return false;
            }
            if ((this.i == null) != (bky.i == null)) {
                return false;
            }
            if ((this.h == null) != (bky.h == null)) {
                return false;
            }
            if ((this.g == null) != (bky.g == null)) {
                return false;
            }
            if (m() == null ? bky.m() == null : m().equals(bky.m())) {
                AppView appView = ((bKX) this).c;
                if (appView == null ? ((bKX) bky).c == null : appView.equals(((bKX) bky).c)) {
                    if ((((bKX) this).b == null) != (((bKX) bky).b == null)) {
                        return false;
                    }
                    if ((s() == null) != (bky.s() == null)) {
                        return false;
                    }
                    if (q() == null ? bky.q() == null : q().equals(bky.q())) {
                        return p() == bky.p() && t() == bky.t() && o() == bky.o();
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
        int i = this.d != null ? 1 : 0;
        int i2 = this.i != null ? 1 : 0;
        int i3 = this.h != null ? 1 : 0;
        int i4 = this.g != null ? 1 : 0;
        int hashCode2 = m() != null ? m().hashCode() : 0;
        AppView appView = ((bKX) this).c;
        int hashCode3 = appView != null ? appView.hashCode() : 0;
        int i5 = ((bKX) this).b != null ? 1 : 0;
        return (((((((((((((((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + hashCode2) * 31) + hashCode3) * 31) + i5) * 31) + (s() == null ? 0 : 1)) * 31) + (q() != null ? q().hashCode() : 0)) * 31) + p()) * 31) + (t() ? 1 : 0)) * 31) + (o() ? 1 : 0);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "SynopsisTextModel_{evidenceKey=" + m() + ", contextualTextAppView=" + ((bKX) this).c + ", trackingInfoHolder=" + ((bKX) this).b + ", onClick=" + s() + ", text=" + ((Object) q()) + ", stringId=" + p() + ", linksClickable=" + t() + ", isSticky=" + o() + "}" + super.toString();
    }
}
