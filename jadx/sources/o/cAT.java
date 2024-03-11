package o;

import android.view.ViewParent;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import io.reactivex.Observable;
import o.AbstractC3073as;
import o.AbstractC6947cms;

/* loaded from: classes4.dex */
public class cAT extends cAR implements InterfaceC1673aK<AbstractC6947cms.b>, cAQ {
    private InterfaceC4732bk<cAT, AbstractC6947cms.b> f;
    private InterfaceC4414be<cAT, AbstractC6947cms.b> g;
    private InterfaceC4467bf<cAT, AbstractC6947cms.b> i;
    private InterfaceC4573bh<cAT, AbstractC6947cms.b> j;

    @Override // o.InterfaceC1673aK
    /* renamed from: b */
    public void e(C1511aE c1511aE, AbstractC6947cms.b bVar, int i) {
    }

    @Override // o.cAQ
    public /* synthetic */ cAQ a(Observable observable) {
        return c((Observable<dpR>) observable);
    }

    @Override // o.cAQ
    public /* synthetic */ cAQ a(drX drx) {
        return b((drX<? super Boolean, ? super InterfaceC6945cmq, dpR>) drx);
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: d */
    public void a(AbstractC6947cms.b bVar, int i) {
        InterfaceC4467bf<cAT, AbstractC6947cms.b> interfaceC4467bf = this.i;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, bVar, i);
        }
    }

    @Override // o.AbstractC6947cms, o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: d */
    public void e(AbstractC6947cms.b bVar) {
        super.e(bVar);
        InterfaceC4414be<cAT, AbstractC6947cms.b> interfaceC4414be = this.g;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, bVar);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    public void c(int i, AbstractC6947cms.b bVar) {
        InterfaceC4732bk<cAT, AbstractC6947cms.b> interfaceC4732bk = this.f;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, bVar, i);
        }
        super.a(i, (int) bVar);
    }

    @Override // o.AbstractC3336ax
    public void d(float f, float f2, int i, int i2, AbstractC6947cms.b bVar) {
        InterfaceC4573bh<cAT, AbstractC6947cms.b> interfaceC4573bh = this.j;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, bVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, (int) bVar);
    }

    @Override // o.AbstractC6947cms
    public boolean q() {
        return super.q();
    }

    @Override // o.cAQ
    /* renamed from: a */
    public cAT b(boolean z) {
        h();
        super.G_(z);
        return this;
    }

    @Override // o.cAQ
    /* renamed from: b */
    public cAT c(String str) {
        h();
        this.c = str;
        return this;
    }

    @Override // o.cAQ
    /* renamed from: d */
    public cAT c(VideoType videoType) {
        h();
        super.a(videoType);
        return this;
    }

    public cAT b(drX<? super Boolean, ? super InterfaceC6945cmq, dpR> drx) {
        h();
        super.c(drx);
        return this;
    }

    @Override // o.cAQ
    /* renamed from: b */
    public cAT a(TrackingInfoHolder trackingInfoHolder) {
        h();
        ((AbstractC6947cms) this).d = trackingInfoHolder;
        return this;
    }

    public cAT c(Observable<dpR> observable) {
        h();
        ((AbstractC6947cms) this).b = observable;
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: b */
    public cAT e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.cAQ
    /* renamed from: b */
    public cAT d(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.cAQ
    /* renamed from: d */
    public cAT b(int i) {
        super.a(i);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: c */
    public cAT a(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: a */
    public AbstractC6947cms.b b(ViewParent viewParent) {
        return new AbstractC6947cms.b();
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof cAT) && super.equals(obj)) {
            cAT cat = (cAT) obj;
            if ((this.i == null) != (cat.i == null)) {
                return false;
            }
            if ((this.g == null) != (cat.g == null)) {
                return false;
            }
            if ((this.f == null) != (cat.f == null)) {
                return false;
            }
            if ((this.j == null) == (cat.j == null) && m() == cat.m() && q() == cat.q() && n() == cat.n()) {
                String str = this.c;
                if (str == null ? cat.c == null : str.equals(cat.c)) {
                    if (p() == null ? cat.p() == null : p().equals(cat.p())) {
                        if ((o() == null) != (cat.o() == null)) {
                            return false;
                        }
                        if ((l() == null) != (cat.l() == null)) {
                            return false;
                        }
                        if (i() == null ? cat.i() == null : i().equals(cat.i())) {
                            if ((((AbstractC6947cms) this).d == null) != (((AbstractC6947cms) cat).d == null)) {
                                return false;
                            }
                            return (((AbstractC6947cms) this).b == null) == (((AbstractC6947cms) cat).b == null);
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
        int i3 = this.f != null ? 1 : 0;
        int i4 = this.j != null ? 1 : 0;
        boolean m = m();
        boolean q = q();
        boolean n = n();
        String str = this.c;
        int hashCode2 = str != null ? str.hashCode() : 0;
        int hashCode3 = p() != null ? p().hashCode() : 0;
        int i5 = o() != null ? 1 : 0;
        int i6 = l() != null ? 1 : 0;
        int hashCode4 = i() != null ? i().hashCode() : 0;
        return (((((((((((((((((((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + (m ? 1 : 0)) * 31) + (q ? 1 : 0)) * 31) + (n ? 1 : 0)) * 31) + hashCode2) * 31) + hashCode3) * 31) + i5) * 31) + i6) * 31) + hashCode4) * 31) + (((AbstractC6947cms) this).d != null ? 1 : 0)) * 31) + (((AbstractC6947cms) this).b != null ? 1 : 0);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "PreviewMyListButtonModel_{showToastsOnToggle=" + m() + ", isRemindMe=" + q() + ", inQueue=" + n() + ", videoId=" + this.c + ", videoType=" + p() + ", mutationCallback=" + l() + ", actionToken=" + i() + ", trackingInfoHolder=" + ((AbstractC6947cms) this).d + ", destroyObservable=" + ((AbstractC6947cms) this).b + "}" + super.toString();
    }
}
