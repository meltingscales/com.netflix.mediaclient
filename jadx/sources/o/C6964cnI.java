package o;

import android.view.View;
import android.view.ViewParent;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import o.AbstractC3073as;
import o.AbstractC6960cnE;

/* renamed from: o.cnI  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6964cnI extends AbstractC6960cnE implements InterfaceC1673aK<AbstractC6960cnE.e>, InterfaceC6966cnK {
    private InterfaceC4414be<C6964cnI, AbstractC6960cnE.e> f;
    private InterfaceC4573bh<C6964cnI, AbstractC6960cnE.e> g;
    private InterfaceC4467bf<C6964cnI, AbstractC6960cnE.e> h;
    private InterfaceC4732bk<C6964cnI, AbstractC6960cnE.e> j;

    @Override // o.InterfaceC1673aK
    /* renamed from: b */
    public void e(C1511aE c1511aE, AbstractC6960cnE.e eVar, int i) {
    }

    @Override // o.InterfaceC6966cnK
    public /* synthetic */ InterfaceC6966cnK b(InterfaceC4467bf interfaceC4467bf) {
        return a((InterfaceC4467bf<C6964cnI, AbstractC6960cnE.e>) interfaceC4467bf);
    }

    @Override // o.InterfaceC6966cnK
    public /* synthetic */ InterfaceC6966cnK b(InterfaceC4573bh interfaceC4573bh) {
        return d((InterfaceC4573bh<C6964cnI, AbstractC6960cnE.e>) interfaceC4573bh);
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: d */
    public void a(AbstractC6960cnE.e eVar, int i) {
        InterfaceC4467bf<C6964cnI, AbstractC6960cnE.e> interfaceC4467bf = this.h;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, eVar, i);
        }
    }

    public C6964cnI a(InterfaceC4467bf<C6964cnI, AbstractC6960cnE.e> interfaceC4467bf) {
        h();
        this.h = interfaceC4467bf;
        return this;
    }

    @Override // o.AbstractC6960cnE, o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: d */
    public void e(AbstractC6960cnE.e eVar) {
        super.e(eVar);
        InterfaceC4414be<C6964cnI, AbstractC6960cnE.e> interfaceC4414be = this.f;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, eVar);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    public void c(int i, AbstractC6960cnE.e eVar) {
        InterfaceC4732bk<C6964cnI, AbstractC6960cnE.e> interfaceC4732bk = this.j;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, eVar, i);
        }
        super.a(i, (int) eVar);
    }

    @Override // o.AbstractC3336ax
    /* renamed from: e */
    public void d(float f, float f2, int i, int i2, AbstractC6960cnE.e eVar) {
        InterfaceC4573bh<C6964cnI, AbstractC6960cnE.e> interfaceC4573bh = this.g;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, eVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, eVar);
    }

    public C6964cnI d(InterfaceC4573bh<C6964cnI, AbstractC6960cnE.e> interfaceC4573bh) {
        h();
        this.g = interfaceC4573bh;
        return this;
    }

    @Override // o.InterfaceC6966cnK
    /* renamed from: f */
    public C6964cnI a(String str) {
        h();
        super.c(str);
        return this;
    }

    @Override // o.InterfaceC6966cnK
    /* renamed from: g */
    public C6964cnI e(String str) {
        h();
        super.Z_(str);
        return this;
    }

    @Override // o.InterfaceC6966cnK
    /* renamed from: i */
    public C6964cnI b(String str) {
        h();
        super.X_(str);
        return this;
    }

    @Override // o.InterfaceC6966cnK
    /* renamed from: j */
    public C6964cnI d(String str) {
        h();
        super.Y_(str);
        return this;
    }

    @Override // o.InterfaceC6966cnK
    /* renamed from: j */
    public C6964cnI b(boolean z) {
        h();
        super.z_(z);
        return this;
    }

    @Override // o.InterfaceC6966cnK
    /* renamed from: i */
    public C6964cnI d(boolean z) {
        h();
        super.e(z);
        return this;
    }

    @Override // o.InterfaceC6966cnK
    /* renamed from: a */
    public C6964cnI c(boolean z) {
        h();
        super.y_(z);
        return this;
    }

    @Override // o.InterfaceC6966cnK
    /* renamed from: a */
    public C6964cnI d(TrackingInfoHolder trackingInfoHolder) {
        h();
        ((AbstractC6960cnE) this).d = trackingInfoHolder;
        return this;
    }

    @Override // o.InterfaceC6966cnK
    /* renamed from: a */
    public C6964cnI e(View.OnClickListener onClickListener) {
        h();
        super.g_(onClickListener);
        return this;
    }

    @Override // o.InterfaceC6966cnK
    /* renamed from: i */
    public C6964cnI d(View.OnClickListener onClickListener) {
        h();
        super.h_(onClickListener);
        return this;
    }

    @Override // o.InterfaceC6966cnK
    /* renamed from: j */
    public C6964cnI b(View.OnClickListener onClickListener) {
        h();
        super.c(onClickListener);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: d */
    public C6964cnI e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.InterfaceC6966cnK
    /* renamed from: e */
    public C6964cnI c(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: c */
    public C6964cnI a(int i) {
        super.a(i);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: c */
    public C6964cnI a(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: d */
    public AbstractC6960cnE.e b(ViewParent viewParent) {
        return new AbstractC6960cnE.e();
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C6964cnI) && super.equals(obj)) {
            C6964cnI c6964cnI = (C6964cnI) obj;
            if ((this.h == null) != (c6964cnI.h == null)) {
                return false;
            }
            if ((this.f == null) != (c6964cnI.f == null)) {
                return false;
            }
            if ((this.j == null) != (c6964cnI.j == null)) {
                return false;
            }
            if ((this.g == null) != (c6964cnI.g == null)) {
                return false;
            }
            if (l() == null ? c6964cnI.l() == null : l().equals(c6964cnI.l())) {
                if (s() == null ? c6964cnI.s() == null : s().equals(c6964cnI.s())) {
                    if (k() == null ? c6964cnI.k() == null : k().equals(c6964cnI.k())) {
                        if (r() == null ? c6964cnI.r() == null : r().equals(c6964cnI.r())) {
                            if (o() == c6964cnI.o() && m() == c6964cnI.m() && i() == c6964cnI.i()) {
                                if ((((AbstractC6960cnE) this).d == null) != (((AbstractC6960cnE) c6964cnI).d == null)) {
                                    return false;
                                }
                                if ((n() == null) != (c6964cnI.n() == null)) {
                                    return false;
                                }
                                if ((t() == null) != (c6964cnI.t() == null)) {
                                    return false;
                                }
                                if ((q() == null) != (c6964cnI.q() == null)) {
                                    return false;
                                }
                                return (p() == null) == (c6964cnI.p() == null);
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
        int i = this.h != null ? 1 : 0;
        int i2 = this.f != null ? 1 : 0;
        int i3 = this.j != null ? 1 : 0;
        int i4 = this.g != null ? 1 : 0;
        int hashCode2 = l() != null ? l().hashCode() : 0;
        int hashCode3 = s() != null ? s().hashCode() : 0;
        int hashCode4 = k() != null ? k().hashCode() : 0;
        int hashCode5 = r() != null ? r().hashCode() : 0;
        boolean o2 = o();
        boolean m = m();
        boolean i5 = i();
        int i6 = ((AbstractC6960cnE) this).d != null ? 1 : 0;
        int i7 = n() != null ? 1 : 0;
        int i8 = t() != null ? 1 : 0;
        return (((((((((((((((((((((((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (o2 ? 1 : 0)) * 31) + (m ? 1 : 0)) * 31) + (i5 ? 1 : 0)) * 31) + i6) * 31) + i7) * 31) + i8) * 31) + (q() != null ? 1 : 0)) * 31) + (p() != null ? 1 : 0);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "MyListGameModel_{gameId=" + l() + ", title=" + s() + ", genre=" + k() + ", iconImageUrl=" + r() + ", downloaded=" + o() + ", editable=" + m() + ", canBeInstalled=" + i() + ", trackingInfoHolder=" + ((AbstractC6960cnE) this).d + ", clickListener=" + n() + ", playClickListener=" + t() + ", removeClickListener=" + q() + ", longClickListener=" + p() + "}" + super.toString();
    }
}
