package o;

import android.view.ViewParent;
import o.AbstractC3073as;
import o.AbstractC5506bzz;

/* renamed from: o.bzy  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C5505bzy extends AbstractC5506bzz implements InterfaceC1673aK<AbstractC5506bzz.a>, InterfaceC5457bzC {
    private InterfaceC4573bh<C5505bzy, AbstractC5506bzz.a> b;
    private InterfaceC4414be<C5505bzy, AbstractC5506bzz.a> c;
    private InterfaceC4467bf<C5505bzy, AbstractC5506bzz.a> d;
    private InterfaceC4732bk<C5505bzy, AbstractC5506bzz.a> j;

    @Override // o.InterfaceC1673aK
    /* renamed from: a */
    public void e(C1511aE c1511aE, AbstractC5506bzz.a aVar, int i) {
    }

    @Override // o.InterfaceC1673aK
    public void a(AbstractC5506bzz.a aVar, int i) {
        InterfaceC4467bf<C5505bzy, AbstractC5506bzz.a> interfaceC4467bf = this.d;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, aVar, i);
        }
    }

    @Override // o.AbstractC5506bzz, o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: b  reason: avoid collision after fix types in other method */
    public void e(AbstractC5506bzz.a aVar) {
        super.e(aVar);
        InterfaceC4414be<C5505bzy, AbstractC5506bzz.a> interfaceC4414be = this.c;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, aVar);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: d */
    public void c(int i, AbstractC5506bzz.a aVar) {
        InterfaceC4732bk<C5505bzy, AbstractC5506bzz.a> interfaceC4732bk = this.j;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, aVar, i);
        }
        super.a(i, (int) aVar);
    }

    @Override // o.AbstractC3336ax
    /* renamed from: a */
    public void d(float f, float f2, int i, int i2, AbstractC5506bzz.a aVar) {
        InterfaceC4573bh<C5505bzy, AbstractC5506bzz.a> interfaceC4573bh = this.b;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, aVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, aVar);
    }

    @Override // o.InterfaceC5457bzC
    /* renamed from: d */
    public C5505bzy a(String str) {
        h();
        super.a_(str);
        return this;
    }

    @Override // o.InterfaceC5457bzC
    /* renamed from: b */
    public C5505bzy e(String str) {
        h();
        super.c(str);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: c */
    public C5505bzy e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.InterfaceC5457bzC
    /* renamed from: e */
    public C5505bzy b(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: c */
    public C5505bzy a(int i) {
        super.a(i);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: c */
    public C5505bzy a(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: a */
    public AbstractC5506bzz.a b(ViewParent viewParent) {
        return new AbstractC5506bzz.a();
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C5505bzy) && super.equals(obj)) {
            C5505bzy c5505bzy = (C5505bzy) obj;
            if ((this.d == null) != (c5505bzy.d == null)) {
                return false;
            }
            if ((this.c == null) != (c5505bzy.c == null)) {
                return false;
            }
            if ((this.j == null) != (c5505bzy.j == null)) {
                return false;
            }
            if ((this.b == null) != (c5505bzy.b == null)) {
                return false;
            }
            if (i() == null ? c5505bzy.i() == null : i().equals(c5505bzy.i())) {
                return n() == null ? c5505bzy.n() == null : n().equals(c5505bzy.n());
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
        int i4 = this.b == null ? 0 : 1;
        return (((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + (i() != null ? i().hashCode() : 0)) * 31) + (n() != null ? n().hashCode() : 0);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "DemographicCollectionProfileModel_{imageUrl=" + i() + ", profileName=" + n() + "}" + super.toString();
    }
}
