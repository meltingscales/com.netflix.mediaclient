package o;

import android.view.ViewParent;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import o.AbstractC3073as;
import o.bGE;

/* loaded from: classes4.dex */
public class bGH extends bGE implements InterfaceC1673aK<bGE.a>, bGG {
    private InterfaceC4414be<bGH, bGE.a> b;
    private InterfaceC4467bf<bGH, bGE.a> c;
    private InterfaceC4573bh<bGH, bGE.a> d;
    private InterfaceC4732bk<bGH, bGE.a> i;

    @Override // o.InterfaceC1673aK
    /* renamed from: a */
    public void e(C1511aE c1511aE, bGE.a aVar, int i) {
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: c */
    public void a(bGE.a aVar, int i) {
        InterfaceC4467bf<bGH, bGE.a> interfaceC4467bf = this.c;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, aVar, i);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: b  reason: avoid collision after fix types in other method */
    public void e(bGE.a aVar) {
        super.b((bGH) aVar);
        InterfaceC4414be<bGH, bGE.a> interfaceC4414be = this.b;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, aVar);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: b */
    public void c(int i, bGE.a aVar) {
        InterfaceC4732bk<bGH, bGE.a> interfaceC4732bk = this.i;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, aVar, i);
        }
        super.a(i, (int) aVar);
    }

    @Override // o.AbstractC3336ax
    /* renamed from: e */
    public void d(float f, float f2, int i, int i2, bGE.a aVar) {
        InterfaceC4573bh<bGH, bGE.a> interfaceC4573bh = this.d;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, aVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, aVar);
    }

    @Override // o.bGG
    /* renamed from: a */
    public bGH c(boolean z) {
        h();
        super.b(z);
        return this;
    }

    @Override // o.bGG
    /* renamed from: d */
    public bGH b(int i) {
        h();
        super.c(i);
        return this;
    }

    @Override // o.bGG
    /* renamed from: d */
    public bGH a(String str) {
        h();
        super.b(str);
        return this;
    }

    @Override // o.bGG
    /* renamed from: c */
    public bGH a(TrackingInfoHolder trackingInfoHolder) {
        h();
        super.e(trackingInfoHolder);
        return this;
    }

    @Override // o.bGG
    /* renamed from: d */
    public bGH c(InterfaceC5176btn interfaceC5176btn) {
        h();
        super.b(interfaceC5176btn);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: b */
    public bGH e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.bGG
    /* renamed from: e */
    public bGH b(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: e */
    public bGH a(int i) {
        super.a(i);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: d */
    public bGH a(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: a */
    public bGE.a b(ViewParent viewParent) {
        return new bGE.a();
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof bGH) && super.equals(obj)) {
            bGH bgh = (bGH) obj;
            if ((this.c == null) != (bgh.c == null)) {
                return false;
            }
            if ((this.b == null) != (bgh.b == null)) {
                return false;
            }
            if ((this.i == null) != (bgh.i == null)) {
                return false;
            }
            if ((this.d == null) == (bgh.d == null) && l() == bgh.l() && i() == bgh.i()) {
                if (m() == null ? bgh.m() == null : m().equals(bgh.m())) {
                    if ((n() == null) != (bgh.n() == null)) {
                        return false;
                    }
                    if ((o() == null) != (bgh.o() == null)) {
                        return false;
                    }
                    return (k() == null) == (bgh.k() == null);
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
        int i2 = this.b != null ? 1 : 0;
        int i3 = this.i != null ? 1 : 0;
        int i4 = this.d != null ? 1 : 0;
        boolean l = l();
        int i5 = i();
        int hashCode2 = m() != null ? m().hashCode() : 0;
        int i6 = n() != null ? 1 : 0;
        return (((((((((((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + (l ? 1 : 0)) * 31) + i5) * 31) + hashCode2) * 31) + i6) * 31) + (o() != null ? 1 : 0)) * 31) + (k() != null ? 1 : 0);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "DpDownloadButtonModel_{episodeNumberIsHidden=" + l() + ", episodeNumber=" + i() + ", seasonNumberAbbreviation=" + m() + ", trackingInfoHolder=" + n() + ", playableForDownload=" + o() + ", onClick=" + k() + "}" + super.toString();
    }
}
