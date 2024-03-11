package o;

import android.view.View;
import android.view.ViewParent;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.model.leafs.advisory.Advisory;
import java.util.List;
import o.AbstractC3073as;
import o.bGT;

/* loaded from: classes4.dex */
public class bGW extends bGT implements InterfaceC1673aK<bGT.b>, bGX {
    private InterfaceC4573bh<bGW, bGT.b> b;
    private InterfaceC4467bf<bGW, bGT.b> c;
    private InterfaceC4414be<bGW, bGT.b> d;
    private InterfaceC4732bk<bGW, bGT.b> h;

    @Override // o.InterfaceC1673aK
    /* renamed from: c */
    public void e(C1511aE c1511aE, bGT.b bVar, int i) {
    }

    @Override // o.bGX
    public /* synthetic */ bGX b(List list) {
        return e((List<? extends Advisory>) list);
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: c */
    public void a(bGT.b bVar, int i) {
        InterfaceC4467bf<bGW, bGT.b> interfaceC4467bf = this.c;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, bVar, i);
        }
    }

    @Override // o.bGT, o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: b  reason: avoid collision after fix types in other method */
    public void e(bGT.b bVar) {
        super.e(bVar);
        InterfaceC4414be<bGW, bGT.b> interfaceC4414be = this.d;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, bVar);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: e */
    public void c(int i, bGT.b bVar) {
        InterfaceC4732bk<bGW, bGT.b> interfaceC4732bk = this.h;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, bVar, i);
        }
        super.a(i, (int) bVar);
    }

    @Override // o.AbstractC3336ax
    /* renamed from: c */
    public void d(float f, float f2, int i, int i2, bGT.b bVar) {
        InterfaceC4573bh<bGW, bGT.b> interfaceC4573bh = this.b;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, bVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, bVar);
    }

    @Override // o.bGX
    /* renamed from: g */
    public bGW b(int i) {
        h();
        super.f_(i);
        return this;
    }

    public bGW e(List<? extends Advisory> list) {
        h();
        super.a_(list);
        return this;
    }

    @Override // o.bGX
    /* renamed from: c */
    public bGW b(String str) {
        h();
        super.i_(str);
        return this;
    }

    @Override // o.bGX
    /* renamed from: a */
    public bGW e(String str) {
        h();
        super.d(str);
        return this;
    }

    @Override // o.bGX
    /* renamed from: i */
    public bGW c(int i) {
        h();
        super.d(i);
        return this;
    }

    @Override // o.bGX
    /* renamed from: a */
    public bGW d(VideoType videoType) {
        h();
        super.c(videoType);
        return this;
    }

    @Override // o.bGX
    /* renamed from: b */
    public bGW c(View.OnClickListener onClickListener) {
        h();
        super.d(onClickListener);
        return this;
    }

    @Override // o.bGX
    /* renamed from: c */
    public bGW d(CharSequence charSequence) {
        h();
        super.j_(charSequence);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: a */
    public bGW e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.bGX
    /* renamed from: e */
    public bGW b(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: e */
    public bGW a(int i) {
        super.a(i);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: d */
    public bGW a(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: d */
    public bGT.b b(ViewParent viewParent) {
        return new bGT.b();
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof bGW) && super.equals(obj)) {
            bGW bgw = (bGW) obj;
            if ((this.c == null) != (bgw.c == null)) {
                return false;
            }
            if ((this.d == null) != (bgw.d == null)) {
                return false;
            }
            if ((this.h == null) != (bgw.h == null)) {
                return false;
            }
            if ((this.b == null) == (bgw.b == null) && q() == bgw.q()) {
                if (i() == null ? bgw.i() == null : i().equals(bgw.i())) {
                    if (n() == null ? bgw.n() == null : n().equals(bgw.n())) {
                        if (t() == null ? bgw.t() == null : t().equals(bgw.t())) {
                            if (p() != bgw.p()) {
                                return false;
                            }
                            if (s() == null ? bgw.s() == null : s().equals(bgw.s())) {
                                if (l() != bgw.l()) {
                                    return false;
                                }
                                if ((k() == null) != (bgw.k() == null)) {
                                    return false;
                                }
                                if ((r() == null) != (bgw.r() == null)) {
                                    return false;
                                }
                                if (m() == null ? bgw.m() == null : m().equals(bgw.m())) {
                                    return o() == null ? bgw.o() == null : o().equals(bgw.o());
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
        int i4 = this.b != null ? 1 : 0;
        int q = q();
        int hashCode2 = i() != null ? i().hashCode() : 0;
        int hashCode3 = n() != null ? n().hashCode() : 0;
        int hashCode4 = t() != null ? t().hashCode() : 0;
        int p = p();
        int hashCode5 = s() != null ? s().hashCode() : 0;
        boolean l = l();
        int i5 = k() != null ? 1 : 0;
        int i6 = r() == null ? 0 : 1;
        return (((((((((((((((((((((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + q) * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + p) * 31) + hashCode5) * 31) + (l ? 1 : 0)) * 31) + i5) * 31) + i6) * 31) + (m() != null ? m().hashCode() : 0)) * 31) + (o() != null ? o().hashCode() : 0);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "DpMetadataNoBadgesModel_{year=" + q() + ", advisories=" + i() + ", certification=" + n() + ", seasonCountLabel=" + t() + ", runtime=" + p() + ", videoType=" + s() + ", loading=" + l() + ", onLoadingIndicatorClick=" + k() + ", onMetaDataClick=" + r() + ", horizontalMargin=" + m() + ", clickActivationPhrase=" + ((Object) o()) + "}" + super.toString();
    }
}
