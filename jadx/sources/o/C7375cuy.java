package o;

import android.view.ViewGroup;
import o.AbstractC3073as;

/* renamed from: o.cuy  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C7375cuy extends AbstractC3073as<C7376cuz> implements InterfaceC1673aK<C7376cuz> {
    private InterfaceC4467bf<C7375cuy, C7376cuz> b;
    private InterfaceC4573bh<C7375cuy, C7376cuz> f;
    private InterfaceC4414be<C7375cuy, C7376cuz> h;
    private InterfaceC4732bk<C7375cuy, C7376cuz> i;
    private String c = null;
    private int j = 0;
    private C4679bj d = new C4679bj(null);

    @Override // o.AbstractC3073as
    public int Z_() {
        return 0;
    }

    @Override // o.AbstractC3073as
    public int b(int i, int i2, int i3) {
        return i;
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: b */
    public void e(C1511aE c1511aE, C7376cuz c7376cuz, int i) {
    }

    @Override // o.AbstractC3073as
    /* renamed from: e */
    public C7376cuz d(ViewGroup viewGroup) {
        C7376cuz c7376cuz = new C7376cuz(viewGroup.getContext());
        c7376cuz.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
        return c7376cuz;
    }

    @Override // o.AbstractC3073as
    /* renamed from: a */
    public void c(C7376cuz c7376cuz) {
        super.c((C7375cuy) c7376cuz);
        c7376cuz.setName(this.d.d(c7376cuz.getContext()));
        c7376cuz.setAvatar(this.c);
        c7376cuz.d(this.j);
    }

    @Override // o.AbstractC3073as
    /* renamed from: d */
    public void c(C7376cuz c7376cuz, AbstractC3073as abstractC3073as) {
        if (!(abstractC3073as instanceof C7375cuy)) {
            c(c7376cuz);
            return;
        }
        C7375cuy c7375cuy = (C7375cuy) abstractC3073as;
        super.c((C7375cuy) c7376cuz);
        C4679bj c4679bj = this.d;
        if (c4679bj == null ? c7375cuy.d != null : !c4679bj.equals(c7375cuy.d)) {
            c7376cuz.setName(this.d.d(c7376cuz.getContext()));
        }
        String str = this.c;
        if (str == null ? c7375cuy.c != null : !str.equals(c7375cuy.c)) {
            c7376cuz.setAvatar(this.c);
        }
        int i = this.j;
        if (i != c7375cuy.j) {
            c7376cuz.d(i);
        }
    }

    @Override // o.InterfaceC1673aK
    public void a(C7376cuz c7376cuz, int i) {
        InterfaceC4467bf<C7375cuy, C7376cuz> interfaceC4467bf = this.b;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, c7376cuz, i);
        }
    }

    @Override // o.AbstractC3073as
    /* renamed from: d */
    public void e(C7376cuz c7376cuz) {
        super.e((C7375cuy) c7376cuz);
        InterfaceC4414be<C7375cuy, C7376cuz> interfaceC4414be = this.h;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, c7376cuz);
        }
    }

    @Override // o.AbstractC3073as
    /* renamed from: d */
    public void c(int i, C7376cuz c7376cuz) {
        InterfaceC4732bk<C7375cuy, C7376cuz> interfaceC4732bk = this.i;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, c7376cuz, i);
        }
        super.c(i, (int) c7376cuz);
    }

    @Override // o.AbstractC3073as
    /* renamed from: c */
    public void b(float f, float f2, int i, int i2, C7376cuz c7376cuz) {
        InterfaceC4573bh<C7375cuy, C7376cuz> interfaceC4573bh = this.f;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, c7376cuz, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, c7376cuz);
    }

    public C7375cuy a(String str) {
        h();
        this.c = str;
        return this;
    }

    public C7375cuy e(int i) {
        h();
        this.j = i;
        return this;
    }

    public C7375cuy c(CharSequence charSequence) {
        h();
        this.d.a(charSequence);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: a */
    public C7375cuy e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: d */
    public C7375cuy a(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: c */
    public C7375cuy a(int i) {
        throw new UnsupportedOperationException("Layout resources are unsupported with programmatic views.");
    }

    @Override // o.AbstractC3073as
    /* renamed from: e */
    public C7375cuy a(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    @Override // o.AbstractC3073as
    public int a() {
        throw new UnsupportedOperationException("Layout resources are unsupported for views created programmatically.");
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C7375cuy) && super.equals(obj)) {
            C7375cuy c7375cuy = (C7375cuy) obj;
            if ((this.b == null) != (c7375cuy.b == null)) {
                return false;
            }
            if ((this.h == null) != (c7375cuy.h == null)) {
                return false;
            }
            if ((this.i == null) != (c7375cuy.i == null)) {
                return false;
            }
            if ((this.f == null) != (c7375cuy.f == null)) {
                return false;
            }
            String str = this.c;
            if (str == null ? c7375cuy.c == null : str.equals(c7375cuy.c)) {
                if (this.j != c7375cuy.j) {
                    return false;
                }
                C4679bj c4679bj = this.d;
                C4679bj c4679bj2 = c7375cuy.d;
                return c4679bj == null ? c4679bj2 == null : c4679bj.equals(c4679bj2);
            }
            return false;
        }
        return false;
    }

    @Override // o.AbstractC3073as
    public int hashCode() {
        int hashCode = super.hashCode();
        int i = this.b != null ? 1 : 0;
        int i2 = this.h != null ? 1 : 0;
        int i3 = this.i != null ? 1 : 0;
        int i4 = this.f == null ? 0 : 1;
        String str = this.c;
        int hashCode2 = str != null ? str.hashCode() : 0;
        int i5 = this.j;
        C4679bj c4679bj = this.d;
        return (((((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + hashCode2) * 31) + i5) * 31) + (c4679bj != null ? c4679bj.hashCode() : 0);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "ProfileViewModel_{avatar_String=" + this.c + ", position_Int=" + this.j + ", name_StringAttributeData=" + this.d + "}" + super.toString();
    }
}
