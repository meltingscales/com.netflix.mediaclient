package o;

import android.view.View;
import android.view.ViewParent;
import com.netflix.mediaclient.ui.offline.DownloadButton;
import o.AbstractC3073as;
import o.bIQ;

/* loaded from: classes4.dex */
public class bIX extends bIQ implements InterfaceC1673aK<bIQ.c>, bIY {
    private InterfaceC4732bk<bIX, bIQ.c> g;
    private InterfaceC4414be<bIX, bIQ.c> h;
    private InterfaceC4573bh<bIX, bIQ.c> i;
    private InterfaceC4467bf<bIX, bIQ.c> j;

    @Override // o.InterfaceC1673aK
    /* renamed from: d */
    public void e(C1511aE c1511aE, bIQ.c cVar, int i) {
    }

    @Override // o.bIY
    public /* synthetic */ bIY a(InterfaceC4732bk interfaceC4732bk) {
        return c((InterfaceC4732bk<bIX, bIQ.c>) interfaceC4732bk);
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: d */
    public void a(bIQ.c cVar, int i) {
        InterfaceC4467bf<bIX, bIQ.c> interfaceC4467bf = this.j;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, cVar, i);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: c */
    public void e(bIQ.c cVar) {
        super.b((bIX) cVar);
        InterfaceC4414be<bIX, bIQ.c> interfaceC4414be = this.h;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, cVar);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: d */
    public void c(int i, bIQ.c cVar) {
        InterfaceC4732bk<bIX, bIQ.c> interfaceC4732bk = this.g;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, cVar, i);
        }
        super.a(i, (int) cVar);
    }

    public bIX c(InterfaceC4732bk<bIX, bIQ.c> interfaceC4732bk) {
        h();
        this.g = interfaceC4732bk;
        return this;
    }

    @Override // o.AbstractC3336ax
    /* renamed from: a */
    public void d(float f, float f2, int i, int i2, bIQ.c cVar) {
        InterfaceC4573bh<bIX, bIQ.c> interfaceC4573bh = this.i;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, cVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, cVar);
    }

    @Override // o.bIY
    /* renamed from: j */
    public bIX e(CharSequence charSequence) {
        h();
        super.s_(charSequence);
        return this;
    }

    @Override // o.bIY
    /* renamed from: i */
    public bIX c(CharSequence charSequence) {
        h();
        super.b(charSequence);
        return this;
    }

    @Override // o.bIY
    /* renamed from: j */
    public bIX e(int i) {
        h();
        super.i_(i);
        return this;
    }

    @Override // o.bIY
    /* renamed from: i */
    public bIX e(boolean z) {
        h();
        super.b(z);
        return this;
    }

    @Override // o.bIY
    /* renamed from: b */
    public bIX e(String str) {
        h();
        super.d(str);
        return this;
    }

    @Override // o.bIY
    /* renamed from: h */
    public bIX d(boolean z) {
        h();
        super.k_(z);
        return this;
    }

    @Override // o.bIY
    /* renamed from: g */
    public bIX c(boolean z) {
        h();
        super.a(z);
        return this;
    }

    @Override // o.bIY
    /* renamed from: d */
    public bIX e(bIN bin) {
        h();
        ((bIQ) this).f = bin;
        return this;
    }

    @Override // o.bIY
    /* renamed from: c */
    public bIX b(DownloadButton.ButtonState buttonState) {
        h();
        this.c = buttonState;
        return this;
    }

    @Override // o.bIY
    /* renamed from: d */
    public bIX c(int i) {
        h();
        super.b(i);
        return this;
    }

    @Override // o.bIY
    /* renamed from: e */
    public bIX b(View.OnClickListener onClickListener) {
        h();
        super.a(onClickListener);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: d */
    public bIX e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.bIY
    /* renamed from: h */
    public bIX d(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: f */
    public bIX a(int i) {
        super.a(i);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: c */
    public bIX a(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: c */
    public bIQ.c b(ViewParent viewParent) {
        return new bIQ.c();
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof bIX) && super.equals(obj)) {
            bIX bix = (bIX) obj;
            if ((this.j == null) != (bix.j == null)) {
                return false;
            }
            if ((this.h == null) != (bix.h == null)) {
                return false;
            }
            if ((this.g == null) != (bix.g == null)) {
                return false;
            }
            if ((this.i == null) != (bix.i == null)) {
                return false;
            }
            if (x() == null ? bix.x() == null : x().equals(bix.x())) {
                if (k() != bix.k()) {
                    return false;
                }
                if (w() == null ? bix.w() == null : w().equals(bix.w())) {
                    if (s() == null ? bix.s() == null : s().equals(bix.s())) {
                        if (q() != bix.q()) {
                            return false;
                        }
                        if (n() == null ? bix.n() == null : n().equals(bix.n())) {
                            if (p() == bix.p() && m() == bix.m()) {
                                if (r() == null ? bix.r() == null : r().equals(bix.r())) {
                                    if (i() == bix.i() && v() == bix.v()) {
                                        bIN bin = ((bIQ) this).f;
                                        if (bin == null ? ((bIQ) bix).f == null : bin.equals(((bIQ) bix).f)) {
                                            DownloadButton.ButtonState buttonState = this.c;
                                            if (buttonState == null ? bix.c == null : buttonState.equals(bix.c)) {
                                                if (o() != bix.o()) {
                                                    return false;
                                                }
                                                return (l() == null) == (bix.l() == null);
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
        int hashCode2 = x() != null ? x().hashCode() : 0;
        int k = k();
        int hashCode3 = w() != null ? w().hashCode() : 0;
        int hashCode4 = s() != null ? s().hashCode() : 0;
        int q = q();
        int hashCode5 = n() != null ? n().hashCode() : 0;
        int p = p();
        boolean m = m();
        int hashCode6 = r() != null ? r().hashCode() : 0;
        boolean i5 = i();
        boolean v = v();
        bIN bin = ((bIQ) this).f;
        int hashCode7 = bin != null ? bin.hashCode() : 0;
        DownloadButton.ButtonState buttonState = this.c;
        int hashCode8 = buttonState != null ? buttonState.hashCode() : 0;
        return (((((((((((((((((((((((((((((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + hashCode2) * 31) + k) * 31) + hashCode3) * 31) + hashCode4) * 31) + q) * 31) + hashCode5) * 31) + p) * 31) + (m ? 1 : 0)) * 31) + hashCode6) * 31) + (i5 ? 1 : 0)) * 31) + (v ? 1 : 0)) * 31) + hashCode7) * 31) + hashCode8) * 31) + o()) * 31) + (l() != null ? 1 : 0);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "SquareEpisodeModel_{title=" + ((Object) x()) + ", episodeNumber=" + k() + ", synopsis=" + ((Object) w()) + ", newBadge=" + ((Object) s()) + ", runtime=" + q() + ", episodeTime=" + ((Object) n()) + ", progress=" + p() + ", currentEpisode=" + m() + ", imageUrl=" + r() + ", canPlay=" + i() + ", showPlayIcon=" + v() + ", epoxyPlayable=" + ((bIQ) this).f + ", downloadState=" + this.c + ", downloadProgress=" + o() + ", clickListener=" + l() + "}" + super.toString();
    }
}
