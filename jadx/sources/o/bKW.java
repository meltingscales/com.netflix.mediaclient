package o;

import android.view.ViewParent;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.TrackingInfo;
import o.AbstractC3073as;
import o.bKQ;

/* loaded from: classes4.dex */
public class bKW extends bKQ implements InterfaceC1673aK<bKQ.d>, bKZ {
    private InterfaceC4467bf<bKW, bKQ.d> c;
    private InterfaceC4573bh<bKW, bKQ.d> f;
    private InterfaceC4732bk<bKW, bKQ.d> h;
    private InterfaceC4414be<bKW, bKQ.d> j;

    @Override // o.InterfaceC1673aK
    /* renamed from: d */
    public void e(C1511aE c1511aE, bKQ.d dVar, int i) {
    }

    @Override // o.bKZ
    public /* synthetic */ bKZ a(drO dro) {
        return d((drO<? extends TrackingInfo>) dro);
    }

    @Override // o.bKZ
    public /* synthetic */ bKZ c(InterfaceC4732bk interfaceC4732bk) {
        return a((InterfaceC4732bk<bKW, bKQ.d>) interfaceC4732bk);
    }

    @Override // o.bKZ
    public /* synthetic */ bKZ e(InterfaceC4467bf interfaceC4467bf) {
        return b((InterfaceC4467bf<bKW, bKQ.d>) interfaceC4467bf);
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: e */
    public void a(bKQ.d dVar, int i) {
        InterfaceC4467bf<bKW, bKQ.d> interfaceC4467bf = this.c;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, dVar, i);
        }
    }

    public bKW b(InterfaceC4467bf<bKW, bKQ.d> interfaceC4467bf) {
        h();
        this.c = interfaceC4467bf;
        return this;
    }

    @Override // o.bKQ, o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: b  reason: avoid collision after fix types in other method */
    public void e(bKQ.d dVar) {
        super.e(dVar);
        InterfaceC4414be<bKW, bKQ.d> interfaceC4414be = this.j;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, dVar);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: d */
    public void c(int i, bKQ.d dVar) {
        InterfaceC4732bk<bKW, bKQ.d> interfaceC4732bk = this.h;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, dVar, i);
        }
        super.a(i, (int) dVar);
    }

    public bKW a(InterfaceC4732bk<bKW, bKQ.d> interfaceC4732bk) {
        h();
        this.h = interfaceC4732bk;
        return this;
    }

    @Override // o.AbstractC3336ax
    /* renamed from: c */
    public void d(float f, float f2, int i, int i2, bKQ.d dVar) {
        InterfaceC4573bh<bKW, bKQ.d> interfaceC4573bh = this.f;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, dVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, dVar);
    }

    @Override // o.bKZ
    /* renamed from: b */
    public bKW c(Float f) {
        h();
        super.a_(f);
        return this;
    }

    @Override // o.bKZ
    /* renamed from: e */
    public bKW b(String str) {
        h();
        super.a(str);
        return this;
    }

    @Override // o.bKZ
    /* renamed from: c */
    public bKW b(C9686vA c9686vA) {
        h();
        super.a_(c9686vA);
        return this;
    }

    @Override // o.bKZ
    /* renamed from: d */
    public bKW e(AppView appView) {
        h();
        ((bKQ) this).b = appView;
        return this;
    }

    public bKW d(drO<? extends TrackingInfo> dro) {
        h();
        ((bKQ) this).d = dro;
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: b */
    public bKW e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.bKZ
    /* renamed from: e */
    public bKW b(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: c */
    public bKW a(int i) {
        super.a(i);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: b */
    public bKW a(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: c */
    public bKQ.d b(ViewParent viewParent) {
        return new bKQ.d();
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof bKW) && super.equals(obj)) {
            bKW bkw = (bKW) obj;
            if ((this.c == null) != (bkw.c == null)) {
                return false;
            }
            if ((this.j == null) != (bkw.j == null)) {
                return false;
            }
            if ((this.h == null) != (bkw.h == null)) {
                return false;
            }
            if ((this.f == null) != (bkw.f == null)) {
                return false;
            }
            if (q() == null ? bkw.q() == null : q().equals(bkw.q())) {
                if (o() == null ? bkw.o() == null : o().equals(bkw.o())) {
                    if (k() == null ? bkw.k() == null : k().equals(bkw.k())) {
                        if (l() == null ? bkw.l() == null : l().equals(bkw.l())) {
                            AppView appView = ((bKQ) this).b;
                            if (appView == null ? ((bKQ) bkw).b == null : appView.equals(((bKQ) bkw).b)) {
                                if ((((bKQ) this).d == null) != (((bKQ) bkw).d == null)) {
                                    return false;
                                }
                                return (n() == null) == (bkw.n() == null);
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
        int i3 = this.h != null ? 1 : 0;
        int i4 = this.f != null ? 1 : 0;
        int hashCode2 = q() != null ? q().hashCode() : 0;
        int hashCode3 = o() != null ? o().hashCode() : 0;
        int hashCode4 = k() != null ? k().hashCode() : 0;
        int hashCode5 = l() != null ? l().hashCode() : 0;
        AppView appView = ((bKQ) this).b;
        int hashCode6 = appView != null ? appView.hashCode() : 0;
        return (((((((((((((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + (((bKQ) this).d != null ? 1 : 0)) * 31) + (n() != null ? 1 : 0);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "StillImageModel_{videoId=" + q() + ", imageAspectRatio=" + o() + ", url=" + k() + ", roundedCornerConfig=" + l() + ", appView=" + ((bKQ) this).b + ", impressionInfo=" + n() + "}" + super.toString();
    }
}
