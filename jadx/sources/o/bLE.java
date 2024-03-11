package o;

import android.view.View;
import android.view.ViewParent;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.TrackingInfo;
import o.AbstractC3073as;
import o.InterfaceC3825bMa;
import o.bLG;

/* loaded from: classes4.dex */
public class bLE extends bLG implements InterfaceC1673aK<bLG.a>, bLH {
    private InterfaceC4467bf<bLE, bLG.a> c;
    private InterfaceC4414be<bLE, bLG.a> d;
    private InterfaceC4573bh<bLE, bLG.a> g;
    private InterfaceC4732bk<bLE, bLG.a> h;

    @Override // o.InterfaceC1673aK
    /* renamed from: a */
    public void e(C1511aE c1511aE, bLG.a aVar, int i) {
    }

    @Override // o.bLH
    public /* synthetic */ bLH b(InterfaceC4732bk interfaceC4732bk) {
        return d((InterfaceC4732bk<bLE, bLG.a>) interfaceC4732bk);
    }

    @Override // o.bLH
    public /* synthetic */ bLH c(InterfaceC4467bf interfaceC4467bf) {
        return b((InterfaceC4467bf<bLE, bLG.a>) interfaceC4467bf);
    }

    @Override // o.bLH
    public /* synthetic */ bLH c(drO dro) {
        return a((drO<? extends TrackingInfo>) dro);
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: c */
    public void a(bLG.a aVar, int i) {
        InterfaceC4467bf<bLE, bLG.a> interfaceC4467bf = this.c;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, aVar, i);
        }
    }

    public bLE b(InterfaceC4467bf<bLE, bLG.a> interfaceC4467bf) {
        h();
        this.c = interfaceC4467bf;
        return this;
    }

    @Override // o.bLG, o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: c */
    public void e(bLG.a aVar) {
        super.e(aVar);
        InterfaceC4414be<bLE, bLG.a> interfaceC4414be = this.d;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, aVar);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    public void c(int i, bLG.a aVar) {
        InterfaceC4732bk<bLE, bLG.a> interfaceC4732bk = this.h;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, aVar, i);
        }
        super.a(i, (int) aVar);
    }

    public bLE d(InterfaceC4732bk<bLE, bLG.a> interfaceC4732bk) {
        h();
        this.h = interfaceC4732bk;
        return this;
    }

    @Override // o.AbstractC3336ax
    /* renamed from: c */
    public void d(float f, float f2, int i, int i2, bLG.a aVar) {
        InterfaceC4573bh<bLE, bLG.a> interfaceC4573bh = this.g;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, aVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, aVar);
    }

    @Override // o.bLH
    /* renamed from: e */
    public bLE b(InterfaceC3825bMa.a aVar) {
        h();
        super.a_(aVar);
        return this;
    }

    @Override // o.bLH
    /* renamed from: a */
    public bLE e(Float f) {
        h();
        super.c(f);
        return this;
    }

    @Override // o.bLH
    /* renamed from: e */
    public bLE d(String str) {
        h();
        super.h(str);
        return this;
    }

    @Override // o.bLH
    /* renamed from: e */
    public bLE c(CharSequence charSequence) {
        h();
        super.A_(charSequence);
        return this;
    }

    @Override // o.bLH
    /* renamed from: c */
    public bLE b(String str) {
        h();
        super.g(str);
        return this;
    }

    @Override // o.bLH
    /* renamed from: j */
    public bLE a(String str) {
        h();
        super.f(str);
        return this;
    }

    @Override // o.bLH
    /* renamed from: d */
    public bLE b(View.OnClickListener onClickListener) {
        h();
        super.a(onClickListener);
        return this;
    }

    public bLE a(drO<? extends TrackingInfo> dro) {
        h();
        ((bLG) this).f = dro;
        return this;
    }

    @Override // o.bLH
    /* renamed from: c */
    public bLE b(AppView appView) {
        h();
        super.b_(appView);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: c */
    public bLE e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.bLH
    /* renamed from: b */
    public bLE d(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.bLH
    /* renamed from: d */
    public bLE e(int i) {
        super.a(i);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: b */
    public bLE a(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: d */
    public bLG.a b(ViewParent viewParent) {
        return new bLG.a();
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof bLE) && super.equals(obj)) {
            bLE ble = (bLE) obj;
            if ((this.c == null) != (ble.c == null)) {
                return false;
            }
            if ((this.d == null) != (ble.d == null)) {
                return false;
            }
            if ((this.h == null) != (ble.h == null)) {
                return false;
            }
            if ((this.g == null) != (ble.g == null)) {
                return false;
            }
            if (n() == null ? ble.n() == null : n().equals(ble.n())) {
                if (o() == null ? ble.o() == null : o().equals(ble.o())) {
                    if (p() == null ? ble.p() == null : p().equals(ble.p())) {
                        if (q() == null ? ble.q() == null : q().equals(ble.q())) {
                            if (k() == null ? ble.k() == null : k().equals(ble.k())) {
                                if (s() != ble.s()) {
                                    return false;
                                }
                                if (t() == null ? ble.t() == null : t().equals(ble.t())) {
                                    if (l() == null ? ble.l() == null : l().equals(ble.l())) {
                                        if ((r() == null) != (ble.r() == null)) {
                                            return false;
                                        }
                                        if ((((bLG) this).f == null) != (((bLG) ble).f == null)) {
                                            return false;
                                        }
                                        return aj_() == null ? ble.aj_() == null : aj_().equals(ble.aj_());
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
        int i2 = this.d != null ? 1 : 0;
        int i3 = this.h != null ? 1 : 0;
        int i4 = this.g != null ? 1 : 0;
        int hashCode2 = n() != null ? n().hashCode() : 0;
        int hashCode3 = o() != null ? o().hashCode() : 0;
        int hashCode4 = p() != null ? p().hashCode() : 0;
        int hashCode5 = q() != null ? q().hashCode() : 0;
        int hashCode6 = k() != null ? k().hashCode() : 0;
        boolean s = s();
        int hashCode7 = t() != null ? t().hashCode() : 0;
        int hashCode8 = l() != null ? l().hashCode() : 0;
        int i5 = r() != null ? 1 : 0;
        return (((((((((((((((((((((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + (s ? 1 : 0)) * 31) + hashCode7) * 31) + hashCode8) * 31) + i5) * 31) + (((bLG) this).f != null ? 1 : 0)) * 31) + (aj_() != null ? aj_().hashCode() : 0);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "VideoModel_{impressionInfo=" + n() + ", aspectRatio=" + o() + ", title=" + p() + ", contentDescription=" + ((Object) q()) + ", boxshotUrl=" + k() + ", roundAsCircle=" + s() + ", videoId=" + t() + ", backgroundColor=" + l() + ", onClick=" + r() + ", appView=" + aj_() + "}" + super.toString();
    }
}
