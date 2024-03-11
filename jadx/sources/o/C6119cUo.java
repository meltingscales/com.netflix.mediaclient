package o;

import android.view.View;
import com.netflix.cl.model.AppView;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import o.AbstractC3073as;
import o.AbstractC6118cUn;

/* renamed from: o.cUo  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6119cUo extends AbstractC6118cUn implements InterfaceC1673aK<AbstractC6118cUn.e>, InterfaceC6117cUm {
    private InterfaceC4414be<C6119cUo, AbstractC6118cUn.e> g;
    private InterfaceC4467bf<C6119cUo, AbstractC6118cUn.e> i;
    private InterfaceC4573bh<C6119cUo, AbstractC6118cUn.e> k;
    private InterfaceC4732bk<C6119cUo, AbstractC6118cUn.e> l;

    @Override // o.InterfaceC1673aK
    public void e(C1511aE c1511aE, AbstractC6118cUn.e eVar, int i) {
    }

    @Override // o.InterfaceC6117cUm
    public /* synthetic */ InterfaceC6117cUm b(InterfaceC4732bk interfaceC4732bk) {
        return e((InterfaceC4732bk<C6119cUo, AbstractC6118cUn.e>) interfaceC4732bk);
    }

    @Override // o.InterfaceC6117cUm
    public /* synthetic */ InterfaceC6117cUm c(InterfaceC4308bc interfaceC4308bc) {
        return a((InterfaceC4308bc<C6119cUo, AbstractC6118cUn.e>) interfaceC4308bc);
    }

    @Override // o.InterfaceC6117cUm
    public /* synthetic */ InterfaceC6117cUm d(InterfaceC4467bf interfaceC4467bf) {
        return c((InterfaceC4467bf<C6119cUo, AbstractC6118cUn.e>) interfaceC4467bf);
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: d */
    public void a(AbstractC6118cUn.e eVar, int i) {
        InterfaceC4467bf<C6119cUo, AbstractC6118cUn.e> interfaceC4467bf = this.i;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, eVar, i);
        }
    }

    public C6119cUo c(InterfaceC4467bf<C6119cUo, AbstractC6118cUn.e> interfaceC4467bf) {
        h();
        this.i = interfaceC4467bf;
        return this;
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: b  reason: avoid collision after fix types in other method */
    public void e(AbstractC6118cUn.e eVar) {
        super.b((C6119cUo) eVar);
        InterfaceC4414be<C6119cUo, AbstractC6118cUn.e> interfaceC4414be = this.g;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, eVar);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public void c(int i, AbstractC6118cUn.e eVar) {
        InterfaceC4732bk<C6119cUo, AbstractC6118cUn.e> interfaceC4732bk = this.l;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, eVar, i);
        }
        super.a(i, (int) eVar);
    }

    public C6119cUo e(InterfaceC4732bk<C6119cUo, AbstractC6118cUn.e> interfaceC4732bk) {
        h();
        this.l = interfaceC4732bk;
        return this;
    }

    @Override // o.AbstractC3336ax
    /* renamed from: c */
    public void d(float f, float f2, int i, int i2, AbstractC6118cUn.e eVar) {
        InterfaceC4573bh<C6119cUo, AbstractC6118cUn.e> interfaceC4573bh = this.k;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, eVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, eVar);
    }

    public C6119cUo a(InterfaceC4308bc<C6119cUo, AbstractC6118cUn.e> interfaceC4308bc) {
        h();
        if (interfaceC4308bc == null) {
            super.d((View.OnClickListener) null);
        } else {
            super.d((View.OnClickListener) new View$OnClickListenerC4818bn(interfaceC4308bc));
        }
        return this;
    }

    @Override // o.InterfaceC6117cUm
    /* renamed from: e */
    public C6119cUo a(String str) {
        h();
        ((AbstractC6118cUn) this).j = str;
        return this;
    }

    @Override // o.InterfaceC6117cUm
    /* renamed from: f */
    public C6119cUo d(String str) {
        h();
        ((AbstractC6118cUn) this).h = str;
        return this;
    }

    @Override // o.InterfaceC6117cUm
    /* renamed from: d */
    public C6119cUo e(CharSequence charSequence) {
        h();
        ((AbstractC6118cUn) this).b = charSequence;
        return this;
    }

    @Override // o.InterfaceC6117cUm
    /* renamed from: j */
    public C6119cUo c(int i) {
        h();
        super.e(i);
        return this;
    }

    @Override // o.InterfaceC6117cUm
    /* renamed from: c */
    public C6119cUo b(String str) {
        h();
        ((AbstractC6118cUn) this).d = str;
        return this;
    }

    @Override // o.InterfaceC6117cUm
    /* renamed from: e */
    public C6119cUo b(boolean z) {
        h();
        super.H_(z);
        return this;
    }

    @Override // o.InterfaceC6117cUm
    /* renamed from: c */
    public C6119cUo d(AppView appView) {
        h();
        this.c = appView;
        return this;
    }

    @Override // o.InterfaceC6117cUm
    /* renamed from: c */
    public C6119cUo b(TrackingInfoHolder trackingInfoHolder) {
        h();
        ((AbstractC6118cUn) this).f = trackingInfoHolder;
        return this;
    }

    @Override // o.InterfaceC6117cUm
    /* renamed from: h */
    public C6119cUo d(int i) {
        h();
        super.u_(i);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: b */
    public C6119cUo e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.InterfaceC6117cUm
    /* renamed from: c */
    public C6119cUo b(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: b */
    public C6119cUo a(int i) {
        super.a(i);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: c */
    public C6119cUo a(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C6119cUo) && super.equals(obj)) {
            C6119cUo c6119cUo = (C6119cUo) obj;
            if ((this.i == null) != (c6119cUo.i == null)) {
                return false;
            }
            if ((this.g == null) != (c6119cUo.g == null)) {
                return false;
            }
            if ((this.l == null) != (c6119cUo.l == null)) {
                return false;
            }
            if ((this.k == null) != (c6119cUo.k == null)) {
                return false;
            }
            if ((n() == null) != (c6119cUo.n() == null)) {
                return false;
            }
            if ((((AbstractC6118cUn) this).j == null) != (((AbstractC6118cUn) c6119cUo).j == null)) {
                return false;
            }
            String str = ((AbstractC6118cUn) this).h;
            if (str == null ? ((AbstractC6118cUn) c6119cUo).h == null : str.equals(((AbstractC6118cUn) c6119cUo).h)) {
                CharSequence charSequence = ((AbstractC6118cUn) this).b;
                if (charSequence == null ? ((AbstractC6118cUn) c6119cUo).b == null : charSequence.equals(((AbstractC6118cUn) c6119cUo).b)) {
                    if (l() != c6119cUo.l()) {
                        return false;
                    }
                    String str2 = ((AbstractC6118cUn) this).d;
                    if (str2 == null ? ((AbstractC6118cUn) c6119cUo).d == null : str2.equals(((AbstractC6118cUn) c6119cUo).d)) {
                        if (i() != c6119cUo.i()) {
                            return false;
                        }
                        if ((this.c == null) != (c6119cUo.c == null)) {
                            return false;
                        }
                        return (((AbstractC6118cUn) this).f == null) == (((AbstractC6118cUn) c6119cUo).f == null) && o() == c6119cUo.o();
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
        int i3 = this.l != null ? 1 : 0;
        int i4 = this.k != null ? 1 : 0;
        int i5 = n() != null ? 1 : 0;
        int i6 = ((AbstractC6118cUn) this).j != null ? 1 : 0;
        String str = ((AbstractC6118cUn) this).h;
        int hashCode2 = str != null ? str.hashCode() : 0;
        CharSequence charSequence = ((AbstractC6118cUn) this).b;
        int hashCode3 = charSequence != null ? charSequence.hashCode() : 0;
        int l = l();
        String str2 = ((AbstractC6118cUn) this).d;
        int hashCode4 = str2 != null ? str2.hashCode() : 0;
        boolean i7 = i();
        return (((((((((((((((((((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + i5) * 31) + i6) * 31) + hashCode2) * 31) + hashCode3) * 31) + l) * 31) + hashCode4) * 31) + (i7 ? 1 : 0)) * 31) + (this.c != null ? 1 : 0)) * 31) + (((AbstractC6118cUn) this).f != null ? 1 : 0)) * 31) + o();
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "SearchGridModel_{clickListener=" + n() + ", videoId=" + ((AbstractC6118cUn) this).j + ", videoTitle=" + ((AbstractC6118cUn) this).h + ", contentDescription=" + ((Object) ((AbstractC6118cUn) this).b) + ", position=" + l() + ", boxArtImageUrl=" + ((AbstractC6118cUn) this).d + ", availableToPlay=" + i() + ", appView=" + this.c + ", trackingInfoHolder=" + ((AbstractC6118cUn) this).f + ", totalSpanSize=" + o() + "}" + super.toString();
    }
}
