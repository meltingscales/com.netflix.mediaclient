package o;

import android.view.View;
import android.view.ViewParent;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import o.AbstractC3073as;
import o.AbstractC8025dcb;

/* renamed from: o.dcj  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C8033dcj extends AbstractC8025dcb implements InterfaceC1673aK<AbstractC8025dcb.e>, InterfaceC8034dck {
    private InterfaceC4414be<C8033dcj, AbstractC8025dcb.e> c;
    private InterfaceC4467bf<C8033dcj, AbstractC8025dcb.e> d;
    private InterfaceC4573bh<C8033dcj, AbstractC8025dcb.e> h;
    private InterfaceC4732bk<C8033dcj, AbstractC8025dcb.e> j;

    @Override // o.InterfaceC1673aK
    /* renamed from: d */
    public void e(C1511aE c1511aE, AbstractC8025dcb.e eVar, int i) {
    }

    @Override // o.InterfaceC8034dck
    public /* synthetic */ InterfaceC8034dck d(InterfaceC4573bh interfaceC4573bh) {
        return e((InterfaceC4573bh<C8033dcj, AbstractC8025dcb.e>) interfaceC4573bh);
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: b */
    public void a(AbstractC8025dcb.e eVar, int i) {
        InterfaceC4467bf<C8033dcj, AbstractC8025dcb.e> interfaceC4467bf = this.d;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, eVar, i);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: d */
    public void e(AbstractC8025dcb.e eVar) {
        super.b((C8033dcj) eVar);
        InterfaceC4414be<C8033dcj, AbstractC8025dcb.e> interfaceC4414be = this.c;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, eVar);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: d */
    public void c(int i, AbstractC8025dcb.e eVar) {
        InterfaceC4732bk<C8033dcj, AbstractC8025dcb.e> interfaceC4732bk = this.j;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, eVar, i);
        }
        super.a(i, (int) eVar);
    }

    @Override // o.AbstractC3336ax
    public void d(float f, float f2, int i, int i2, AbstractC8025dcb.e eVar) {
        InterfaceC4573bh<C8033dcj, AbstractC8025dcb.e> interfaceC4573bh = this.h;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, eVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, (int) eVar);
    }

    public C8033dcj e(InterfaceC4573bh<C8033dcj, AbstractC8025dcb.e> interfaceC4573bh) {
        h();
        this.h = interfaceC4573bh;
        return this;
    }

    @Override // o.InterfaceC8034dck
    /* renamed from: g */
    public C8033dcj b(String str) {
        h();
        super.aq_(str);
        return this;
    }

    @Override // o.InterfaceC8034dck
    /* renamed from: f */
    public C8033dcj e(String str) {
        h();
        super.d(str);
        return this;
    }

    @Override // o.InterfaceC8034dck
    /* renamed from: i */
    public C8033dcj d(CharSequence charSequence) {
        h();
        super.R_(charSequence);
        return this;
    }

    @Override // o.InterfaceC8034dck
    /* renamed from: f */
    public C8033dcj c(CharSequence charSequence) {
        h();
        super.S_(charSequence);
        return this;
    }

    @Override // o.InterfaceC8034dck
    /* renamed from: g */
    public C8033dcj b(CharSequence charSequence) {
        h();
        super.Q_(charSequence);
        return this;
    }

    @Override // o.InterfaceC8034dck
    /* renamed from: a */
    public C8033dcj c(String str) {
        h();
        super.ap_(str);
        return this;
    }

    @Override // o.InterfaceC8034dck
    /* renamed from: j */
    public C8033dcj d(boolean z) {
        h();
        super.a(z);
        return this;
    }

    @Override // o.InterfaceC8034dck
    /* renamed from: h */
    public C8033dcj c(boolean z) {
        h();
        super.b(z);
        return this;
    }

    @Override // o.InterfaceC8034dck
    /* renamed from: g */
    public C8033dcj e(boolean z) {
        h();
        super.N_(z);
        return this;
    }

    @Override // o.InterfaceC8034dck
    /* renamed from: i */
    public C8033dcj b(View.OnClickListener onClickListener) {
        h();
        super.a(onClickListener);
        return this;
    }

    @Override // o.InterfaceC8034dck
    /* renamed from: f */
    public C8033dcj c(View.OnClickListener onClickListener) {
        h();
        super.m_(onClickListener);
        return this;
    }

    @Override // o.InterfaceC8034dck
    /* renamed from: j */
    public C8033dcj e(View.OnClickListener onClickListener) {
        h();
        super.d(onClickListener);
        return this;
    }

    @Override // o.InterfaceC8034dck
    /* renamed from: d */
    public C8033dcj c(TrackingInfoHolder trackingInfoHolder) {
        h();
        ((AbstractC8025dcb) this).b = trackingInfoHolder;
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: b */
    public C8033dcj e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.InterfaceC8034dck
    /* renamed from: h */
    public C8033dcj e(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: b */
    public C8033dcj a(int i) {
        super.a(i);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: b */
    public C8033dcj a(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: c */
    public AbstractC8025dcb.e b(ViewParent viewParent) {
        return new AbstractC8025dcb.e();
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C8033dcj) && super.equals(obj)) {
            C8033dcj c8033dcj = (C8033dcj) obj;
            if ((this.d == null) != (c8033dcj.d == null)) {
                return false;
            }
            if ((this.c == null) != (c8033dcj.c == null)) {
                return false;
            }
            if ((this.j == null) != (c8033dcj.j == null)) {
                return false;
            }
            if ((this.h == null) != (c8033dcj.h == null)) {
                return false;
            }
            if (v() == null ? c8033dcj.v() == null : v().equals(c8033dcj.v())) {
                if (k() == null ? c8033dcj.k() == null : k().equals(c8033dcj.k())) {
                    if (n() == null ? c8033dcj.n() == null : n().equals(c8033dcj.n())) {
                        if (q() == null ? c8033dcj.q() == null : q().equals(c8033dcj.q())) {
                            if (l() == null ? c8033dcj.l() == null : l().equals(c8033dcj.l())) {
                                if (i() == null ? c8033dcj.i() == null : i().equals(c8033dcj.i())) {
                                    if (t() == c8033dcj.t() && m() == c8033dcj.m() && s() == c8033dcj.s()) {
                                        if ((o() == null) != (c8033dcj.o() == null)) {
                                            return false;
                                        }
                                        if ((r() == null) != (c8033dcj.r() == null)) {
                                            return false;
                                        }
                                        if ((p() == null) != (c8033dcj.p() == null)) {
                                            return false;
                                        }
                                        return (((AbstractC8025dcb) this).b == null) == (((AbstractC8025dcb) c8033dcj).b == null);
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
        int i = this.d != null ? 1 : 0;
        int i2 = this.c != null ? 1 : 0;
        int i3 = this.j != null ? 1 : 0;
        int i4 = this.h != null ? 1 : 0;
        int hashCode2 = v() != null ? v().hashCode() : 0;
        int hashCode3 = k() != null ? k().hashCode() : 0;
        int hashCode4 = n() != null ? n().hashCode() : 0;
        int hashCode5 = q() != null ? q().hashCode() : 0;
        int hashCode6 = l() != null ? l().hashCode() : 0;
        int hashCode7 = i() != null ? i().hashCode() : 0;
        boolean t = t();
        boolean m = m();
        boolean s = s();
        int i5 = o() != null ? 1 : 0;
        int i6 = r() != null ? 1 : 0;
        return (((((((((((((((((((((((((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + (t ? 1 : 0)) * 31) + (m ? 1 : 0)) * 31) + (s ? 1 : 0)) * 31) + i5) * 31) + i6) * 31) + (p() != null ? 1 : 0)) * 31) + (((AbstractC8025dcb) this).b != null ? 1 : 0);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "UserMarkModel_{userMarkId=" + v() + ", playableId=" + k() + ", parentTitle=" + ((Object) n()) + ", title=" + ((Object) q()) + ", formattedTimestamp=" + ((Object) l()) + ", boxShotUrl=" + i() + ", selected=" + t() + ", editable=" + m() + ", shareable=" + s() + ", clickListener=" + o() + ", removeClickListener=" + r() + ", shareClickListener=" + p() + ", trackingInfoHolder=" + ((AbstractC8025dcb) this).b + "}" + super.toString();
    }
}
