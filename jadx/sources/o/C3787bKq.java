package o;

import android.graphics.Rect;
import android.view.ViewParent;
import o.AbstractC3073as;
import o.AbstractC3781bKk;

/* renamed from: o.bKq  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C3787bKq extends AbstractC3781bKk implements InterfaceC1673aK<AbstractC3781bKk.a>, InterfaceC3784bKn {
    private InterfaceC4573bh<C3787bKq, AbstractC3781bKk.a> b;
    private InterfaceC4414be<C3787bKq, AbstractC3781bKk.a> c;
    private InterfaceC4467bf<C3787bKq, AbstractC3781bKk.a> d;
    private InterfaceC4732bk<C3787bKq, AbstractC3781bKk.a> i;

    @Override // o.InterfaceC1673aK
    /* renamed from: a */
    public void e(C1511aE c1511aE, AbstractC3781bKk.a aVar, int i) {
    }

    @Override // o.InterfaceC3784bKn
    public /* synthetic */ InterfaceC3784bKn c(InterfaceC4467bf interfaceC4467bf) {
        return a((InterfaceC4467bf<C3787bKq, AbstractC3781bKk.a>) interfaceC4467bf);
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: d */
    public void a(AbstractC3781bKk.a aVar, int i) {
        InterfaceC4467bf<C3787bKq, AbstractC3781bKk.a> interfaceC4467bf = this.d;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, aVar, i);
        }
    }

    public C3787bKq a(InterfaceC4467bf<C3787bKq, AbstractC3781bKk.a> interfaceC4467bf) {
        h();
        this.d = interfaceC4467bf;
        return this;
    }

    @Override // o.AbstractC3781bKk, o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: d */
    public void e(AbstractC3781bKk.a aVar) {
        super.e(aVar);
        InterfaceC4414be<C3787bKq, AbstractC3781bKk.a> interfaceC4414be = this.c;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, aVar);
        }
    }

    @Override // o.AbstractC3781bKk, o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: d */
    public void c(int i, AbstractC3781bKk.a aVar) {
        InterfaceC4732bk<C3787bKq, AbstractC3781bKk.a> interfaceC4732bk = this.i;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, aVar, i);
        }
        super.c(i, aVar);
    }

    @Override // o.AbstractC3336ax
    /* renamed from: a */
    public void d(float f, float f2, int i, int i2, AbstractC3781bKk.a aVar) {
        InterfaceC4573bh<C3787bKq, AbstractC3781bKk.a> interfaceC4573bh = this.b;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, aVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, aVar);
    }

    @Override // o.InterfaceC3784bKn
    /* renamed from: a */
    public C3787bKq c(long j) {
        h();
        super.d(j);
        return this;
    }

    @Override // o.InterfaceC3784bKn
    /* renamed from: h */
    public C3787bKq d(boolean z) {
        h();
        super.p_(z);
        return this;
    }

    @Override // o.InterfaceC3784bKn
    /* renamed from: f */
    public C3787bKq b(boolean z) {
        h();
        super.e(z);
        return this;
    }

    @Override // o.InterfaceC3784bKn
    /* renamed from: i */
    public C3787bKq a(boolean z) {
        h();
        super.n_(z);
        return this;
    }

    @Override // o.InterfaceC3784bKn
    /* renamed from: e */
    public C3787bKq d(Integer num) {
        h();
        super.h_(num);
        return this;
    }

    @Override // o.InterfaceC3784bKn
    /* renamed from: a */
    public C3787bKq d(Rect rect) {
        h();
        super.e(rect);
        return this;
    }

    @Override // o.InterfaceC3784bKn
    /* renamed from: g */
    public C3787bKq c(boolean z) {
        h();
        super.o_(z);
        return this;
    }

    @Override // o.InterfaceC3784bKn
    /* renamed from: a */
    public C3787bKq c(Integer num) {
        h();
        super.b(num);
        return this;
    }

    @Override // o.InterfaceC3784bKn
    /* renamed from: a */
    public C3787bKq e(String str) {
        h();
        super.c(str);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: b */
    public C3787bKq e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.InterfaceC3784bKn
    /* renamed from: e */
    public C3787bKq b(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.InterfaceC3784bKn
    /* renamed from: b */
    public C3787bKq c(int i) {
        super.a(i);
        return this;
    }

    @Override // o.InterfaceC3784bKn
    /* renamed from: d */
    public C3787bKq e(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: d */
    public AbstractC3781bKk.a b(ViewParent viewParent) {
        return new AbstractC3781bKk.a();
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C3787bKq) && super.equals(obj)) {
            C3787bKq c3787bKq = (C3787bKq) obj;
            if ((this.d == null) != (c3787bKq.d == null)) {
                return false;
            }
            if ((this.c == null) != (c3787bKq.c == null)) {
                return false;
            }
            if ((this.i == null) != (c3787bKq.i == null)) {
                return false;
            }
            if ((this.b == null) == (c3787bKq.b == null) && k() == c3787bKq.k() && s() == c3787bKq.s() && r() == c3787bKq.r() && l() == c3787bKq.l()) {
                if (q() == null ? c3787bKq.q() == null : q().equals(c3787bKq.q())) {
                    if (p() == null ? c3787bKq.p() == null : p().equals(c3787bKq.p())) {
                        if (n() != c3787bKq.n()) {
                            return false;
                        }
                        if (t() == null ? c3787bKq.t() == null : t().equals(c3787bKq.t())) {
                            if (x() != c3787bKq.x()) {
                                return false;
                            }
                            if (i() == null ? c3787bKq.i() == null : i().equals(c3787bKq.i())) {
                                if (o() != c3787bKq.o()) {
                                    return false;
                                }
                                return m() == null ? c3787bKq.m() == null : m().equals(c3787bKq.m());
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
        int i = this.d != null ? 1 : 0;
        int i2 = this.c != null ? 1 : 0;
        int i3 = this.i != null ? 1 : 0;
        int i4 = this.b == null ? 0 : 1;
        int k = (int) (k() ^ (k() >>> 32));
        boolean s = s();
        boolean r = r();
        boolean l = l();
        int hashCode2 = q() != null ? q().hashCode() : 0;
        int hashCode3 = p() != null ? p().hashCode() : 0;
        boolean n = n();
        int hashCode4 = t() != null ? t().hashCode() : 0;
        boolean x = x();
        int hashCode5 = i() != null ? i().hashCode() : 0;
        return (((((((((((((((((((((((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + k) * 31) + (s ? 1 : 0)) * 31) + (r ? 1 : 0)) * 31) + (l ? 1 : 0)) * 31) + hashCode2) * 31) + hashCode3) * 31) + (n ? 1 : 0)) * 31) + hashCode4) * 31) + (x ? 1 : 0)) * 31) + hashCode5) * 31) + o()) * 31) + (m() != null ? m().hashCode() : 0);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "LoadingShimmerModel_{delayInMs=" + k() + ", roundedCorner=" + s() + ", roundAsCircle=" + r() + ", lightTheme=" + l() + ", roundedCornerRadius=" + q() + ", shimmerPadding=" + p() + ", optInMeasuring=" + n() + ", rowConfigSpan=" + t() + ", startTransparent=" + x() + ", color=" + i() + ", importantForAccessibility=" + o() + ", contentDescription=" + m() + "}" + super.toString();
    }
}
