package o;

import android.view.ViewParent;
import o.AbstractC3073as;
import o.AbstractC6111cUg;

/* renamed from: o.cUd  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6108cUd extends AbstractC6111cUg implements InterfaceC1673aK<AbstractC6111cUg.e>, InterfaceC6109cUe {
    private InterfaceC4467bf<C6108cUd, AbstractC6111cUg.e> c;
    private InterfaceC4414be<C6108cUd, AbstractC6111cUg.e> d;
    private InterfaceC4573bh<C6108cUd, AbstractC6111cUg.e> f;
    private InterfaceC4732bk<C6108cUd, AbstractC6111cUg.e> j;

    @Override // o.InterfaceC1673aK
    /* renamed from: d */
    public void e(C1511aE c1511aE, AbstractC6111cUg.e eVar, int i) {
    }

    @Override // o.InterfaceC1673aK
    public void a(AbstractC6111cUg.e eVar, int i) {
        InterfaceC4467bf<C6108cUd, AbstractC6111cUg.e> interfaceC4467bf = this.c;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, eVar, i);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: a */
    public void e(AbstractC6111cUg.e eVar) {
        super.b((C6108cUd) eVar);
        InterfaceC4414be<C6108cUd, AbstractC6111cUg.e> interfaceC4414be = this.d;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, eVar);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public void c(int i, AbstractC6111cUg.e eVar) {
        InterfaceC4732bk<C6108cUd, AbstractC6111cUg.e> interfaceC4732bk = this.j;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, eVar, i);
        }
        super.a(i, (int) eVar);
    }

    @Override // o.AbstractC3336ax
    /* renamed from: b */
    public void d(float f, float f2, int i, int i2, AbstractC6111cUg.e eVar) {
        InterfaceC4573bh<C6108cUd, AbstractC6111cUg.e> interfaceC4573bh = this.f;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, eVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, eVar);
    }

    @Override // o.InterfaceC6109cUe
    /* renamed from: h */
    public C6108cUd d(String str) {
        h();
        ((AbstractC6111cUg) this).b = str;
        return this;
    }

    @Override // o.InterfaceC6109cUe
    /* renamed from: g */
    public C6108cUd b(String str) {
        h();
        super.af_(str);
        return this;
    }

    @Override // o.InterfaceC6109cUe
    /* renamed from: j */
    public C6108cUd e(String str) {
        h();
        super.ae_(str);
        return this;
    }

    @Override // o.InterfaceC6109cUe
    /* renamed from: f */
    public C6108cUd a(String str) {
        h();
        super.c(str);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: b */
    public C6108cUd e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.InterfaceC6109cUe
    /* renamed from: d */
    public C6108cUd c(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: c */
    public C6108cUd a(int i) {
        super.a(i);
        return this;
    }

    @Override // o.InterfaceC6109cUe
    /* renamed from: e */
    public C6108cUd d(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: e */
    public AbstractC6111cUg.e b(ViewParent viewParent) {
        return new AbstractC6111cUg.e();
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C6108cUd) && super.equals(obj)) {
            C6108cUd c6108cUd = (C6108cUd) obj;
            if ((this.c == null) != (c6108cUd.c == null)) {
                return false;
            }
            if ((this.d == null) != (c6108cUd.d == null)) {
                return false;
            }
            if ((this.j == null) != (c6108cUd.j == null)) {
                return false;
            }
            if ((this.f == null) != (c6108cUd.f == null)) {
                return false;
            }
            String str = ((AbstractC6111cUg) this).b;
            if (str == null ? ((AbstractC6111cUg) c6108cUd).b == null : str.equals(((AbstractC6111cUg) c6108cUd).b)) {
                if (n() == null ? c6108cUd.n() == null : n().equals(c6108cUd.n())) {
                    if (i() == null ? c6108cUd.i() == null : i().equals(c6108cUd.i())) {
                        return l() == null ? c6108cUd.l() == null : l().equals(c6108cUd.l());
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
        int i2 = this.d != null ? 1 : 0;
        int i3 = this.j != null ? 1 : 0;
        int i4 = this.f == null ? 0 : 1;
        String str = ((AbstractC6111cUg) this).b;
        int hashCode2 = str != null ? str.hashCode() : 0;
        int hashCode3 = n() != null ? n().hashCode() : 0;
        return (((((((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + hashCode2) * 31) + hashCode3) * 31) + (i() != null ? i().hashCode() : 0)) * 31) + (l() != null ? l().hashCode() : 0);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "HeaderModel_{title=" + ((AbstractC6111cUg) this).b + ", secondaryTitle=" + n() + ", queryKind=" + i() + ", sectionListType=" + l() + "}" + super.toString();
    }
}
