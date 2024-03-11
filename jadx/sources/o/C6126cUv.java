package o;

import android.view.View;
import android.view.ViewParent;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import o.AbstractC3073as;
import o.AbstractC6120cUp;

/* renamed from: o.cUv  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6126cUv extends AbstractC6120cUp implements InterfaceC1673aK<AbstractC6120cUp.d>, InterfaceC6121cUq {
    private InterfaceC4414be<C6126cUv, AbstractC6120cUp.d> g;
    private InterfaceC4467bf<C6126cUv, AbstractC6120cUp.d> j;
    private InterfaceC4732bk<C6126cUv, AbstractC6120cUp.d> k;

    /* renamed from: o  reason: collision with root package name */
    private InterfaceC4573bh<C6126cUv, AbstractC6120cUp.d> f13701o;

    @Override // o.InterfaceC1673aK
    /* renamed from: d */
    public void e(C1511aE c1511aE, AbstractC6120cUp.d dVar, int i) {
    }

    @Override // o.InterfaceC6121cUq
    public /* synthetic */ InterfaceC6121cUq c(InterfaceC4308bc interfaceC4308bc) {
        return b((InterfaceC4308bc<C6126cUv, AbstractC6120cUp.d>) interfaceC4308bc);
    }

    @Override // o.InterfaceC6121cUq
    public /* synthetic */ InterfaceC6121cUq e(InterfaceC4308bc interfaceC4308bc) {
        return a((InterfaceC4308bc<C6126cUv, AbstractC6120cUp.d>) interfaceC4308bc);
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: d */
    public void a(AbstractC6120cUp.d dVar, int i) {
        InterfaceC4467bf<C6126cUv, AbstractC6120cUp.d> interfaceC4467bf = this.j;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, dVar, i);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    public void e(AbstractC6120cUp.d dVar) {
        super.b((C6126cUv) dVar);
        InterfaceC4414be<C6126cUv, AbstractC6120cUp.d> interfaceC4414be = this.g;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, dVar);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: b */
    public void c(int i, AbstractC6120cUp.d dVar) {
        InterfaceC4732bk<C6126cUv, AbstractC6120cUp.d> interfaceC4732bk = this.k;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, dVar, i);
        }
        super.a(i, (int) dVar);
    }

    @Override // o.AbstractC3336ax
    /* renamed from: e */
    public void d(float f, float f2, int i, int i2, AbstractC6120cUp.d dVar) {
        InterfaceC4573bh<C6126cUv, AbstractC6120cUp.d> interfaceC4573bh = this.f13701o;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, dVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, dVar);
    }

    public C6126cUv a(InterfaceC4308bc<C6126cUv, AbstractC6120cUp.d> interfaceC4308bc) {
        h();
        if (interfaceC4308bc == null) {
            super.a((View.OnClickListener) null);
        } else {
            super.a((View.OnClickListener) new View$OnClickListenerC4818bn(interfaceC4308bc));
        }
        return this;
    }

    public C6126cUv b(InterfaceC4308bc<C6126cUv, AbstractC6120cUp.d> interfaceC4308bc) {
        h();
        if (interfaceC4308bc == null) {
            super.b((View.OnClickListener) null);
        } else {
            super.b((View.OnClickListener) new View$OnClickListenerC4818bn(interfaceC4308bc));
        }
        return this;
    }

    @Override // o.InterfaceC6121cUq
    /* renamed from: b */
    public C6126cUv c(String str) {
        h();
        ((AbstractC6120cUp) this).i = str;
        return this;
    }

    @Override // o.InterfaceC6121cUq
    /* renamed from: e */
    public C6126cUv c(CharSequence charSequence) {
        h();
        this.c = charSequence;
        return this;
    }

    @Override // o.InterfaceC6121cUq
    /* renamed from: e */
    public C6126cUv a(String str) {
        h();
        ((AbstractC6120cUp) this).f = str;
        return this;
    }

    @Override // o.InterfaceC6121cUq
    /* renamed from: a */
    public C6126cUv b(boolean z) {
        h();
        super.c(z);
        return this;
    }

    @Override // o.InterfaceC6121cUq
    /* renamed from: i */
    public C6126cUv d(String str) {
        h();
        ((AbstractC6120cUp) this).h = str;
        return this;
    }

    @Override // o.InterfaceC6121cUq
    /* renamed from: b */
    public C6126cUv c(TrackingInfoHolder trackingInfoHolder) {
        h();
        ((AbstractC6120cUp) this).b = trackingInfoHolder;
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: a */
    public C6126cUv e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.InterfaceC6121cUq
    /* renamed from: d */
    public C6126cUv b(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: c */
    public C6126cUv a(int i) {
        super.a(i);
        return this;
    }

    @Override // o.InterfaceC6121cUq
    /* renamed from: d */
    public C6126cUv b(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: c */
    public AbstractC6120cUp.d b(ViewParent viewParent) {
        return new AbstractC6120cUp.d();
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C6126cUv) && super.equals(obj)) {
            C6126cUv c6126cUv = (C6126cUv) obj;
            if ((this.j == null) != (c6126cUv.j == null)) {
                return false;
            }
            if ((this.g == null) != (c6126cUv.g == null)) {
                return false;
            }
            if ((this.k == null) != (c6126cUv.k == null)) {
                return false;
            }
            if ((this.f13701o == null) != (c6126cUv.f13701o == null)) {
                return false;
            }
            if ((o() == null) != (c6126cUv.o() == null)) {
                return false;
            }
            if ((p() == null) != (c6126cUv.p() == null)) {
                return false;
            }
            String str = ((AbstractC6120cUp) this).i;
            if (str == null ? ((AbstractC6120cUp) c6126cUv).i == null : str.equals(((AbstractC6120cUp) c6126cUv).i)) {
                CharSequence charSequence = this.c;
                if (charSequence == null ? c6126cUv.c == null : charSequence.equals(c6126cUv.c)) {
                    String str2 = ((AbstractC6120cUp) this).f;
                    if (str2 == null ? ((AbstractC6120cUp) c6126cUv).f == null : str2.equals(((AbstractC6120cUp) c6126cUv).f)) {
                        if (l() != c6126cUv.l()) {
                            return false;
                        }
                        if ((((AbstractC6120cUp) this).h == null) != (((AbstractC6120cUp) c6126cUv).h == null)) {
                            return false;
                        }
                        if ((((AbstractC6120cUp) this).b == null) != (((AbstractC6120cUp) c6126cUv).b == null)) {
                            return false;
                        }
                        return q() == null ? c6126cUv.q() == null : q().equals(c6126cUv.q());
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
        int i2 = this.g != null ? 1 : 0;
        int i3 = this.k != null ? 1 : 0;
        int i4 = this.f13701o != null ? 1 : 0;
        int i5 = o() != null ? 1 : 0;
        int i6 = p() != null ? 1 : 0;
        String str = ((AbstractC6120cUp) this).i;
        int hashCode2 = str != null ? str.hashCode() : 0;
        CharSequence charSequence = this.c;
        int hashCode3 = charSequence != null ? charSequence.hashCode() : 0;
        String str2 = ((AbstractC6120cUp) this).f;
        int hashCode4 = str2 != null ? str2.hashCode() : 0;
        boolean l = l();
        int i7 = ((AbstractC6120cUp) this).h != null ? 1 : 0;
        return (((((((((((((((((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + i5) * 31) + i6) * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (l ? 1 : 0)) * 31) + i7) * 31) + (((AbstractC6120cUp) this).b == null ? 0 : 1)) * 31) + (q() != null ? q().hashCode() : 0);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "SearchListModel_{clickListener=" + o() + ", videoPlayClickListener=" + p() + ", title=" + ((AbstractC6120cUp) this).i + ", contentDescription=" + ((Object) this.c) + ", preQueryImgUrl=" + ((AbstractC6120cUp) this).f + ", showPlayButton=" + l() + ", videoId=" + ((AbstractC6120cUp) this).h + ", itemTrackingInfoHolder=" + ((AbstractC6120cUp) this).b + ", type=" + q() + "}" + super.toString();
    }
}
