package o;

import android.view.ViewParent;
import o.AbstractC3073as;
import o.AbstractC3969bRj;

/* renamed from: o.bRq  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C3976bRq extends AbstractC3969bRj implements InterfaceC1673aK<AbstractC3969bRj.a>, InterfaceC3970bRk {
    private InterfaceC4467bf<C3976bRq, AbstractC3969bRj.a> b;
    private InterfaceC4414be<C3976bRq, AbstractC3969bRj.a> c;
    private InterfaceC4573bh<C3976bRq, AbstractC3969bRj.a> d;
    private InterfaceC4732bk<C3976bRq, AbstractC3969bRj.a> j;

    @Override // o.InterfaceC1673aK
    /* renamed from: b */
    public void e(C1511aE c1511aE, AbstractC3969bRj.a aVar, int i) {
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: c */
    public void a(AbstractC3969bRj.a aVar, int i) {
        InterfaceC4467bf<C3976bRq, AbstractC3969bRj.a> interfaceC4467bf = this.b;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, aVar, i);
        }
    }

    @Override // o.AbstractC3969bRj, o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: c */
    public void e(AbstractC3969bRj.a aVar) {
        super.e(aVar);
        InterfaceC4414be<C3976bRq, AbstractC3969bRj.a> interfaceC4414be = this.c;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, aVar);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public void c(int i, AbstractC3969bRj.a aVar) {
        InterfaceC4732bk<C3976bRq, AbstractC3969bRj.a> interfaceC4732bk = this.j;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, aVar, i);
        }
        super.a(i, (int) aVar);
    }

    @Override // o.AbstractC3336ax
    public void d(float f, float f2, int i, int i2, AbstractC3969bRj.a aVar) {
        InterfaceC4573bh<C3976bRq, AbstractC3969bRj.a> interfaceC4573bh = this.d;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, aVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, (int) aVar);
    }

    @Override // o.InterfaceC3970bRk
    /* renamed from: g */
    public C3976bRq d(String str) {
        h();
        super.E_(str);
        return this;
    }

    @Override // o.InterfaceC3970bRk
    /* renamed from: a */
    public C3976bRq e(String str) {
        h();
        super.D_(str);
        return this;
    }

    @Override // o.InterfaceC3970bRk
    /* renamed from: h */
    public C3976bRq b(String str) {
        h();
        super.c(str);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: a */
    public C3976bRq e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.InterfaceC3970bRk
    /* renamed from: c */
    public C3976bRq e(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: d */
    public C3976bRq a(int i) {
        super.a(i);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: e */
    public C3976bRq a(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: c */
    public AbstractC3969bRj.a b(ViewParent viewParent) {
        return new AbstractC3969bRj.a();
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C3976bRq) && super.equals(obj)) {
            C3976bRq c3976bRq = (C3976bRq) obj;
            if ((this.b == null) != (c3976bRq.b == null)) {
                return false;
            }
            if ((this.c == null) != (c3976bRq.c == null)) {
                return false;
            }
            if ((this.j == null) != (c3976bRq.j == null)) {
                return false;
            }
            if ((this.d == null) != (c3976bRq.d == null)) {
                return false;
            }
            if (m() == null ? c3976bRq.m() == null : m().equals(c3976bRq.m())) {
                if (i() == null ? c3976bRq.i() == null : i().equals(c3976bRq.i())) {
                    return k() == null ? c3976bRq.k() == null : k().equals(c3976bRq.k());
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
        int i = this.b != null ? 1 : 0;
        int i2 = this.c != null ? 1 : 0;
        int i3 = this.j != null ? 1 : 0;
        int i4 = this.d == null ? 0 : 1;
        int hashCode2 = m() != null ? m().hashCode() : 0;
        return (((((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + hashCode2) * 31) + (i() != null ? i().hashCode() : 0)) * 31) + (k() != null ? k().hashCode() : 0);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "IPBasedGameTopBannerModel_{logoImageUrl=" + m() + ", bannerImageUrl=" + i() + ", title=" + k() + "}" + super.toString();
    }
}
