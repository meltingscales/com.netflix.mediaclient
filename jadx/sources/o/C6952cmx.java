package o;

import android.view.ViewParent;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import io.reactivex.Observable;
import o.AbstractC3073as;
import o.AbstractC6947cms;

/* renamed from: o.cmx  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6952cmx extends AbstractC6947cms implements InterfaceC1673aK<AbstractC6947cms.b>, InterfaceC6949cmu {
    private InterfaceC4732bk<C6952cmx, AbstractC6947cms.b> g;
    private InterfaceC4414be<C6952cmx, AbstractC6947cms.b> h;
    private InterfaceC4467bf<C6952cmx, AbstractC6947cms.b> i;
    private InterfaceC4573bh<C6952cmx, AbstractC6947cms.b> j;

    @Override // o.InterfaceC1673aK
    /* renamed from: d */
    public void e(C1511aE c1511aE, AbstractC6947cms.b bVar, int i) {
    }

    @Override // o.InterfaceC6949cmu
    public /* synthetic */ InterfaceC6949cmu c(Observable observable) {
        return e((Observable<dpR>) observable);
    }

    @Override // o.InterfaceC6949cmu
    public /* synthetic */ InterfaceC6949cmu e(drX drx) {
        return a((drX<? super Boolean, ? super InterfaceC6945cmq, dpR>) drx);
    }

    @Override // o.InterfaceC1673aK
    public void a(AbstractC6947cms.b bVar, int i) {
        InterfaceC4467bf<C6952cmx, AbstractC6947cms.b> interfaceC4467bf = this.i;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, bVar, i);
        }
    }

    @Override // o.AbstractC6947cms, o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: d */
    public void e(AbstractC6947cms.b bVar) {
        super.e(bVar);
        InterfaceC4414be<C6952cmx, AbstractC6947cms.b> interfaceC4414be = this.h;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, bVar);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: d */
    public void c(int i, AbstractC6947cms.b bVar) {
        InterfaceC4732bk<C6952cmx, AbstractC6947cms.b> interfaceC4732bk = this.g;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, bVar, i);
        }
        super.a(i, (int) bVar);
    }

    @Override // o.AbstractC3336ax
    /* renamed from: e */
    public void d(float f, float f2, int i, int i2, AbstractC6947cms.b bVar) {
        InterfaceC4573bh<C6952cmx, AbstractC6947cms.b> interfaceC4573bh = this.j;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, bVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, bVar);
    }

    @Override // o.InterfaceC6949cmu
    /* renamed from: c */
    public C6952cmx d(boolean z) {
        h();
        super.x_(z);
        return this;
    }

    @Override // o.AbstractC6947cms
    public boolean q() {
        return super.q();
    }

    @Override // o.InterfaceC6949cmu
    /* renamed from: a */
    public C6952cmx e(boolean z) {
        h();
        super.G_(z);
        return this;
    }

    @Override // o.InterfaceC6949cmu
    /* renamed from: d */
    public C6952cmx b(String str) {
        h();
        this.c = str;
        return this;
    }

    @Override // o.InterfaceC6949cmu
    /* renamed from: d */
    public C6952cmx c(VideoType videoType) {
        h();
        super.a(videoType);
        return this;
    }

    public C6952cmx a(drX<? super Boolean, ? super InterfaceC6945cmq, dpR> drx) {
        h();
        super.c(drx);
        return this;
    }

    @Override // o.InterfaceC6949cmu
    /* renamed from: d */
    public C6952cmx c(InterfaceC6903cmA interfaceC6903cmA) {
        h();
        super.a(interfaceC6903cmA);
        return this;
    }

    @Override // o.InterfaceC6949cmu
    /* renamed from: a */
    public C6952cmx e(String str) {
        h();
        super.ac_(str);
        return this;
    }

    @Override // o.InterfaceC6949cmu
    /* renamed from: d */
    public C6952cmx c(TrackingInfoHolder trackingInfoHolder) {
        h();
        ((AbstractC6947cms) this).d = trackingInfoHolder;
        return this;
    }

    public C6952cmx e(Observable<dpR> observable) {
        h();
        ((AbstractC6947cms) this).b = observable;
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: a */
    public C6952cmx e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.InterfaceC6949cmu
    /* renamed from: d */
    public C6952cmx e(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.InterfaceC6949cmu
    /* renamed from: c */
    public C6952cmx d(int i) {
        super.a(i);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: b */
    public C6952cmx a(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: e */
    public AbstractC6947cms.b b(ViewParent viewParent) {
        return new AbstractC6947cms.b();
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C6952cmx) && super.equals(obj)) {
            C6952cmx c6952cmx = (C6952cmx) obj;
            if ((this.i == null) != (c6952cmx.i == null)) {
                return false;
            }
            if ((this.h == null) != (c6952cmx.h == null)) {
                return false;
            }
            if ((this.g == null) != (c6952cmx.g == null)) {
                return false;
            }
            if ((this.j == null) == (c6952cmx.j == null) && m() == c6952cmx.m() && q() == c6952cmx.q() && n() == c6952cmx.n()) {
                String str = this.c;
                if (str == null ? c6952cmx.c == null : str.equals(c6952cmx.c)) {
                    if (p() == null ? c6952cmx.p() == null : p().equals(c6952cmx.p())) {
                        if ((o() == null) != (c6952cmx.o() == null)) {
                            return false;
                        }
                        if ((l() == null) != (c6952cmx.l() == null)) {
                            return false;
                        }
                        if (i() == null ? c6952cmx.i() == null : i().equals(c6952cmx.i())) {
                            if ((((AbstractC6947cms) this).d == null) != (((AbstractC6947cms) c6952cmx).d == null)) {
                                return false;
                            }
                            return (((AbstractC6947cms) this).b == null) == (((AbstractC6947cms) c6952cmx).b == null);
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
        int i2 = this.h != null ? 1 : 0;
        int i3 = this.g != null ? 1 : 0;
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
        return "MyListButtonModel_{showToastsOnToggle=" + m() + ", isRemindMe=" + q() + ", inQueue=" + n() + ", videoId=" + this.c + ", videoType=" + p() + ", mutationCallback=" + l() + ", actionToken=" + i() + ", trackingInfoHolder=" + ((AbstractC6947cms) this).d + ", destroyObservable=" + ((AbstractC6947cms) this).b + "}" + super.toString();
    }
}
