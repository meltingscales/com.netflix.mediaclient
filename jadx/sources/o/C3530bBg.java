package o;

import android.view.ViewParent;
import o.AbstractC3073as;
import o.AbstractC3525bBb;

/* renamed from: o.bBg  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C3530bBg extends AbstractC3525bBb implements InterfaceC1673aK<AbstractC3525bBb.a>, InterfaceC3527bBd {
    private InterfaceC4467bf<C3530bBg, AbstractC3525bBb.a> c;
    private InterfaceC4732bk<C3530bBg, AbstractC3525bBb.a> g;
    private InterfaceC4414be<C3530bBg, AbstractC3525bBb.a> h;
    private InterfaceC4573bh<C3530bBg, AbstractC3525bBb.a> i;

    @Override // o.InterfaceC1673aK
    /* renamed from: c */
    public void e(C1511aE c1511aE, AbstractC3525bBb.a aVar, int i) {
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: d */
    public void a(AbstractC3525bBb.a aVar, int i) {
        InterfaceC4467bf<C3530bBg, AbstractC3525bBb.a> interfaceC4467bf = this.c;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, aVar, i);
        }
    }

    @Override // o.AbstractC3525bBb, o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: d */
    public void e(AbstractC3525bBb.a aVar) {
        super.e(aVar);
        InterfaceC4414be<C3530bBg, AbstractC3525bBb.a> interfaceC4414be = this.h;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, aVar);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: b */
    public void c(int i, AbstractC3525bBb.a aVar) {
        InterfaceC4732bk<C3530bBg, AbstractC3525bBb.a> interfaceC4732bk = this.g;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, aVar, i);
        }
        super.a(i, (int) aVar);
    }

    @Override // o.AbstractC3336ax
    /* renamed from: b */
    public void d(float f, float f2, int i, int i2, AbstractC3525bBb.a aVar) {
        InterfaceC4573bh<C3530bBg, AbstractC3525bBb.a> interfaceC4573bh = this.i;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, aVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, aVar);
    }

    @Override // o.InterfaceC3527bBd
    /* renamed from: f */
    public C3530bBg b(String str) {
        h();
        super.a(str);
        return this;
    }

    @Override // o.InterfaceC3527bBd
    /* renamed from: e */
    public C3530bBg c(CharSequence charSequence) {
        h();
        super.b(charSequence);
        return this;
    }

    @Override // o.InterfaceC3527bBd
    /* renamed from: e */
    public C3530bBg c(String str) {
        h();
        super.d(str);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: d */
    public C3530bBg e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.InterfaceC3527bBd
    /* renamed from: f */
    public C3530bBg d(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: e */
    public C3530bBg a(int i) {
        super.a(i);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: b */
    public C3530bBg a(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: d */
    public AbstractC3525bBb.a b(ViewParent viewParent) {
        return new AbstractC3525bBb.a();
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C3530bBg) && super.equals(obj)) {
            C3530bBg c3530bBg = (C3530bBg) obj;
            if ((this.c == null) != (c3530bBg.c == null)) {
                return false;
            }
            if ((this.h == null) != (c3530bBg.h == null)) {
                return false;
            }
            if ((this.g == null) != (c3530bBg.g == null)) {
                return false;
            }
            if ((this.i == null) != (c3530bBg.i == null)) {
                return false;
            }
            if (n() == null ? c3530bBg.n() == null : n().equals(c3530bBg.n())) {
                if (l() == null ? c3530bBg.l() == null : l().equals(c3530bBg.l())) {
                    if (k() == null ? c3530bBg.k() == null : k().equals(c3530bBg.k())) {
                        if (o() == null ? c3530bBg.o() == null : o().equals(c3530bBg.o())) {
                            if ((((AbstractC3525bBb) this).b == null) != (((AbstractC3525bBb) c3530bBg).b == null)) {
                                return false;
                            }
                            return aj_() == null ? c3530bBg.aj_() == null : aj_().equals(c3530bBg.aj_());
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
        int i = this.c != null ? 1 : 0;
        int i2 = this.h != null ? 1 : 0;
        int i3 = this.g != null ? 1 : 0;
        int i4 = this.i != null ? 1 : 0;
        int hashCode2 = n() != null ? n().hashCode() : 0;
        int hashCode3 = l() != null ? l().hashCode() : 0;
        int hashCode4 = k() != null ? k().hashCode() : 0;
        int hashCode5 = o() != null ? o().hashCode() : 0;
        return (((((((((((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (((AbstractC3525bBb) this).b == null ? 0 : 1)) * 31) + (aj_() != null ? aj_().hashCode() : 0);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "CollectTasteTitleCardModel_{impressionInfo=" + n() + ", title=" + l() + ", contentDescription=" + ((Object) k()) + ", boxshotUrl=" + o() + ", appView=" + aj_() + "}" + super.toString();
    }
}
