package o;

import android.view.View;
import android.view.ViewGroup;
import java.util.BitSet;
import o.AbstractC3073as;

/* renamed from: o.cmg  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6935cmg extends AbstractC3073as<C6933cme> implements InterfaceC1673aK<C6933cme>, InterfaceC6930cmb {
    private String b;
    private InterfaceC4467bf<C6935cmg, C6933cme> i;
    private InterfaceC4414be<C6935cmg, C6933cme> j;
    private InterfaceC4732bk<C6935cmg, C6933cme> k;
    private InterfaceC4573bh<C6935cmg, C6933cme> m;

    /* renamed from: o  reason: collision with root package name */
    private String f13748o;
    private final BitSet c = new BitSet(7);
    private boolean d = false;
    private boolean n = false;
    private C4679bj h = new C4679bj(null);
    private C4679bj f = new C4679bj(null);
    private View.OnClickListener g = null;

    @Override // o.AbstractC3073as
    public int Z_() {
        return 0;
    }

    @Override // o.AbstractC3073as
    public int b(int i, int i2, int i3) {
        return i;
    }

    @Override // o.InterfaceC1673aK
    public void e(C1511aE c1511aE, C6933cme c6933cme, int i) {
    }

    @Override // o.InterfaceC6930cmb
    public /* synthetic */ InterfaceC6930cmb c(InterfaceC4308bc interfaceC4308bc) {
        return d((InterfaceC4308bc<C6935cmg, C6933cme>) interfaceC4308bc);
    }

    @Override // o.AbstractC3073as
    /* renamed from: c */
    public C6933cme d(ViewGroup viewGroup) {
        C6933cme c6933cme = new C6933cme(viewGroup.getContext());
        c6933cme.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
        return c6933cme;
    }

    @Override // o.AbstractC3073as
    /* renamed from: a */
    public void c(C6933cme c6933cme) {
        super.c((C6935cmg) c6933cme);
        c6933cme.setDiscountPrice(this.h.d(c6933cme.getContext()));
        c6933cme.setFullPrice(this.f.d(c6933cme.getContext()));
        c6933cme.setUserSelected(this.n);
        c6933cme.setBestValue(this.d);
        c6933cme.setTitle(this.f13748o);
        c6933cme.setDiscountPercentage(this.b);
        c6933cme.setOfferClickListener(this.g);
    }

    @Override // o.AbstractC3073as
    public void c(C6933cme c6933cme, AbstractC3073as abstractC3073as) {
        if (!(abstractC3073as instanceof C6935cmg)) {
            c(c6933cme);
            return;
        }
        C6935cmg c6935cmg = (C6935cmg) abstractC3073as;
        super.c((C6935cmg) c6933cme);
        C4679bj c4679bj = this.h;
        if (c4679bj == null ? c6935cmg.h != null : !c4679bj.equals(c6935cmg.h)) {
            c6933cme.setDiscountPrice(this.h.d(c6933cme.getContext()));
        }
        C4679bj c4679bj2 = this.f;
        if (c4679bj2 == null ? c6935cmg.f != null : !c4679bj2.equals(c6935cmg.f)) {
            c6933cme.setFullPrice(this.f.d(c6933cme.getContext()));
        }
        boolean z = this.n;
        if (z != c6935cmg.n) {
            c6933cme.setUserSelected(z);
        }
        boolean z2 = this.d;
        if (z2 != c6935cmg.d) {
            c6933cme.setBestValue(z2);
        }
        String str = this.f13748o;
        if (str == null ? c6935cmg.f13748o != null : !str.equals(c6935cmg.f13748o)) {
            c6933cme.setTitle(this.f13748o);
        }
        String str2 = this.b;
        if (str2 == null ? c6935cmg.b != null : !str2.equals(c6935cmg.b)) {
            c6933cme.setDiscountPercentage(this.b);
        }
        View.OnClickListener onClickListener = this.g;
        if ((onClickListener == null) != (c6935cmg.g == null)) {
            c6933cme.setOfferClickListener(onClickListener);
        }
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: b */
    public void a(C6933cme c6933cme, int i) {
        InterfaceC4467bf<C6935cmg, C6933cme> interfaceC4467bf = this.i;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, c6933cme, i);
        }
    }

    @Override // o.AbstractC3073as
    public void e(C6933cme c6933cme) {
        super.e((C6935cmg) c6933cme);
        InterfaceC4414be<C6935cmg, C6933cme> interfaceC4414be = this.j;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, c6933cme);
        }
        c6933cme.setOfferClickListener(null);
    }

    @Override // o.AbstractC3073as
    public void c(int i, C6933cme c6933cme) {
        InterfaceC4732bk<C6935cmg, C6933cme> interfaceC4732bk = this.k;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, c6933cme, i);
        }
        super.c(i, (int) c6933cme);
    }

    @Override // o.AbstractC3073as
    /* renamed from: c */
    public void b(float f, float f2, int i, int i2, C6933cme c6933cme) {
        InterfaceC4573bh<C6935cmg, C6933cme> interfaceC4573bh = this.m;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, c6933cme, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, c6933cme);
    }

    @Override // o.InterfaceC6930cmb
    /* renamed from: a */
    public C6935cmg c(boolean z) {
        h();
        this.d = z;
        return this;
    }

    @Override // o.InterfaceC6930cmb
    /* renamed from: e */
    public C6935cmg b(boolean z) {
        h();
        this.n = z;
        return this;
    }

    @Override // o.InterfaceC6930cmb
    /* renamed from: e */
    public C6935cmg c(String str) {
        this.c.set(2);
        h();
        this.f13748o = str;
        return this;
    }

    @Override // o.InterfaceC6930cmb
    /* renamed from: d */
    public C6935cmg a(String str) {
        this.c.set(3);
        h();
        this.b = str;
        return this;
    }

    @Override // o.InterfaceC6930cmb
    /* renamed from: b */
    public C6935cmg d(CharSequence charSequence) {
        h();
        this.h.a(charSequence);
        return this;
    }

    @Override // o.InterfaceC6930cmb
    /* renamed from: j */
    public C6935cmg e(CharSequence charSequence) {
        h();
        this.f.a(charSequence);
        return this;
    }

    public C6935cmg d(InterfaceC4308bc<C6935cmg, C6933cme> interfaceC4308bc) {
        h();
        if (interfaceC4308bc == null) {
            this.g = null;
        } else {
            this.g = new View$OnClickListenerC4818bn(interfaceC4308bc);
        }
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: d */
    public C6935cmg e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.InterfaceC6930cmb
    /* renamed from: i */
    public C6935cmg c(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: e */
    public C6935cmg a(int i) {
        throw new UnsupportedOperationException("Layout resources are unsupported with programmatic views.");
    }

    @Override // o.AbstractC3073as
    /* renamed from: c */
    public C6935cmg a(AbstractC3073as.b bVar) {
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
        if ((obj instanceof C6935cmg) && super.equals(obj)) {
            C6935cmg c6935cmg = (C6935cmg) obj;
            if ((this.i == null) != (c6935cmg.i == null)) {
                return false;
            }
            if ((this.j == null) != (c6935cmg.j == null)) {
                return false;
            }
            if ((this.k == null) != (c6935cmg.k == null)) {
                return false;
            }
            if ((this.m == null) == (c6935cmg.m == null) && this.d == c6935cmg.d && this.n == c6935cmg.n) {
                String str = this.f13748o;
                if (str == null ? c6935cmg.f13748o == null : str.equals(c6935cmg.f13748o)) {
                    String str2 = this.b;
                    if (str2 == null ? c6935cmg.b == null : str2.equals(c6935cmg.b)) {
                        C4679bj c4679bj = this.h;
                        if (c4679bj == null ? c6935cmg.h == null : c4679bj.equals(c6935cmg.h)) {
                            C4679bj c4679bj2 = this.f;
                            if (c4679bj2 == null ? c6935cmg.f == null : c4679bj2.equals(c6935cmg.f)) {
                                return (this.g == null) == (c6935cmg.g == null);
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
        int i = this.i != null ? 1 : 0;
        int i2 = this.j != null ? 1 : 0;
        int i3 = this.k != null ? 1 : 0;
        int i4 = this.m != null ? 1 : 0;
        boolean z = this.d;
        boolean z2 = this.n;
        String str = this.f13748o;
        int hashCode2 = str != null ? str.hashCode() : 0;
        String str2 = this.b;
        int hashCode3 = str2 != null ? str2.hashCode() : 0;
        C4679bj c4679bj = this.h;
        int hashCode4 = c4679bj != null ? c4679bj.hashCode() : 0;
        C4679bj c4679bj2 = this.f;
        return (((((((((((((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + (z ? 1 : 0)) * 31) + (z2 ? 1 : 0)) * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (c4679bj2 != null ? c4679bj2.hashCode() : 0)) * 31) + (this.g != null ? 1 : 0);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "MultiMonthChoiceItemViewModel_{bestValue_Boolean=" + this.d + ", userSelected_Boolean=" + this.n + ", title_String=" + this.f13748o + ", discountPercentage_String=" + this.b + ", discountPrice_StringAttributeData=" + this.h + ", fullPrice_StringAttributeData=" + this.f + ", offerClickListener_OnClickListener=" + this.g + "}" + super.toString();
    }
}
