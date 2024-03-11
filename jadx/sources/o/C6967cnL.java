package o;

import android.view.View;
import android.view.ViewParent;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import o.AbstractC3073as;
import o.AbstractC6968cnM;

/* renamed from: o.cnL  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6967cnL extends AbstractC6968cnM implements InterfaceC1673aK<AbstractC6968cnM.c>, InterfaceC6965cnJ {
    private InterfaceC4732bk<C6967cnL, AbstractC6968cnM.c> g;
    private InterfaceC4467bf<C6967cnL, AbstractC6968cnM.c> h;
    private InterfaceC4573bh<C6967cnL, AbstractC6968cnM.c> i;
    private InterfaceC4414be<C6967cnL, AbstractC6968cnM.c> j;

    @Override // o.InterfaceC1673aK
    /* renamed from: c */
    public void e(C1511aE c1511aE, AbstractC6968cnM.c cVar, int i) {
    }

    @Override // o.InterfaceC6965cnJ
    public /* synthetic */ InterfaceC6965cnJ b(InterfaceC4573bh interfaceC4573bh) {
        return c((InterfaceC4573bh<C6967cnL, AbstractC6968cnM.c>) interfaceC4573bh);
    }

    @Override // o.InterfaceC6965cnJ
    public /* synthetic */ InterfaceC6965cnJ e(InterfaceC4467bf interfaceC4467bf) {
        return c((InterfaceC4467bf<C6967cnL, AbstractC6968cnM.c>) interfaceC4467bf);
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: c */
    public void a(AbstractC6968cnM.c cVar, int i) {
        InterfaceC4467bf<C6967cnL, AbstractC6968cnM.c> interfaceC4467bf = this.h;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, cVar, i);
        }
    }

    public C6967cnL c(InterfaceC4467bf<C6967cnL, AbstractC6968cnM.c> interfaceC4467bf) {
        h();
        this.h = interfaceC4467bf;
        return this;
    }

    @Override // o.AbstractC6968cnM, o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: c */
    public void e(AbstractC6968cnM.c cVar) {
        super.e(cVar);
        InterfaceC4414be<C6967cnL, AbstractC6968cnM.c> interfaceC4414be = this.j;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, cVar);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    public void c(int i, AbstractC6968cnM.c cVar) {
        InterfaceC4732bk<C6967cnL, AbstractC6968cnM.c> interfaceC4732bk = this.g;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, cVar, i);
        }
        super.a(i, (int) cVar);
    }

    @Override // o.AbstractC3336ax
    /* renamed from: e */
    public void d(float f, float f2, int i, int i2, AbstractC6968cnM.c cVar) {
        InterfaceC4573bh<C6967cnL, AbstractC6968cnM.c> interfaceC4573bh = this.i;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, cVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, cVar);
    }

    public C6967cnL c(InterfaceC4573bh<C6967cnL, AbstractC6968cnM.c> interfaceC4573bh) {
        h();
        this.i = interfaceC4573bh;
        return this;
    }

    @Override // o.InterfaceC6965cnJ
    /* renamed from: c */
    public C6967cnL a(String str) {
        h();
        super.e(str);
        return this;
    }

    @Override // o.InterfaceC6965cnJ
    /* renamed from: g */
    public C6967cnL e(CharSequence charSequence) {
        h();
        super.c(charSequence);
        return this;
    }

    @Override // o.InterfaceC6965cnJ
    /* renamed from: d */
    public C6967cnL b(String str) {
        h();
        super.aa_(str);
        return this;
    }

    @Override // o.InterfaceC6965cnJ
    /* renamed from: c */
    public C6967cnL d(boolean z) {
        h();
        super.a(z);
        return this;
    }

    @Override // o.InterfaceC6965cnJ
    /* renamed from: b */
    public C6967cnL c(InterfaceC5160btX interfaceC5160btX) {
        h();
        super.a(interfaceC5160btX);
        return this;
    }

    @Override // o.InterfaceC6965cnJ
    /* renamed from: b */
    public C6967cnL e(VideoType videoType) {
        h();
        super.d(videoType);
        return this;
    }

    @Override // o.InterfaceC6965cnJ
    /* renamed from: b */
    public C6967cnL e(TrackingInfoHolder trackingInfoHolder) {
        h();
        this.c = trackingInfoHolder;
        return this;
    }

    @Override // o.InterfaceC6965cnJ
    /* renamed from: i */
    public C6967cnL c(View.OnClickListener onClickListener) {
        h();
        super.a(onClickListener);
        return this;
    }

    @Override // o.InterfaceC6965cnJ
    /* renamed from: j */
    public C6967cnL b(View.OnClickListener onClickListener) {
        h();
        super.i_(onClickListener);
        return this;
    }

    @Override // o.InterfaceC6965cnJ
    /* renamed from: g */
    public C6967cnL e(View.OnClickListener onClickListener) {
        h();
        super.d(onClickListener);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: c */
    public C6967cnL e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.InterfaceC6965cnJ
    /* renamed from: d */
    public C6967cnL b(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: d */
    public C6967cnL a(int i) {
        super.a(i);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: c */
    public C6967cnL a(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: d */
    public AbstractC6968cnM.c b(ViewParent viewParent) {
        return new AbstractC6968cnM.c();
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C6967cnL) && super.equals(obj)) {
            C6967cnL c6967cnL = (C6967cnL) obj;
            if ((this.h == null) != (c6967cnL.h == null)) {
                return false;
            }
            if ((this.j == null) != (c6967cnL.j == null)) {
                return false;
            }
            if ((this.g == null) != (c6967cnL.g == null)) {
                return false;
            }
            if ((this.i == null) != (c6967cnL.i == null)) {
                return false;
            }
            if (q() == null ? c6967cnL.q() == null : q().equals(c6967cnL.q())) {
                if ((t() == null) != (c6967cnL.t() == null)) {
                    return false;
                }
                if (i() == null ? c6967cnL.i() == null : i().equals(c6967cnL.i())) {
                    if (k() != c6967cnL.k()) {
                        return false;
                    }
                    if ((m() == null) != (c6967cnL.m() == null)) {
                        return false;
                    }
                    if ((s() == null) != (c6967cnL.s() == null)) {
                        return false;
                    }
                    if ((this.c == null) != (c6967cnL.c == null)) {
                        return false;
                    }
                    if ((n() == null) != (c6967cnL.n() == null)) {
                        return false;
                    }
                    if ((o() == null) != (c6967cnL.o() == null)) {
                        return false;
                    }
                    if ((r() == null) != (c6967cnL.r() == null)) {
                        return false;
                    }
                    return (l() == null) == (c6967cnL.l() == null);
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
        int i = this.h != null ? 1 : 0;
        int i2 = this.j != null ? 1 : 0;
        int i3 = this.g != null ? 1 : 0;
        int i4 = this.i != null ? 1 : 0;
        int hashCode2 = q() != null ? q().hashCode() : 0;
        int i5 = t() != null ? 1 : 0;
        int hashCode3 = i() != null ? i().hashCode() : 0;
        boolean k = k();
        int i6 = m() != null ? 1 : 0;
        int i7 = s() != null ? 1 : 0;
        int i8 = this.c != null ? 1 : 0;
        int i9 = n() != null ? 1 : 0;
        int i10 = o() != null ? 1 : 0;
        return (((((((((((((((((((((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + hashCode2) * 31) + i5) * 31) + hashCode3) * 31) + (k ? 1 : 0)) * 31) + i6) * 31) + i7) * 31) + i8) * 31) + i9) * 31) + i10) * 31) + (r() != null ? 1 : 0)) * 31) + (l() != null ? 1 : 0);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "MyListVideoModel_{videoId=" + q() + ", title=" + ((Object) t()) + ", boxShotUrl=" + i() + ", editable=" + k() + ", playable=" + m() + ", videoType=" + s() + ", trackingInfoHolder=" + this.c + ", clickListener=" + n() + ", playClickListener=" + o() + ", removeClickListener=" + r() + ", longClickListener=" + l() + "}" + super.toString();
    }
}
