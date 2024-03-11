package o;

import android.view.ViewGroup;
import com.airbnb.epoxy.Carousel;
import java.util.BitSet;
import java.util.List;
import o.AbstractC3073as;

/* renamed from: o.bJh  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C3751bJh extends AbstractC3073as<C3750bJg> implements InterfaceC1673aK<C3750bJg>, InterfaceC3752bJi {
    private InterfaceC4414be<C3751bJh, C3750bJg> f;
    private List<? extends AbstractC3073as<?>> h;
    private InterfaceC4467bf<C3751bJh, C3750bJg> i;
    private InterfaceC4732bk<C3751bJh, C3750bJg> m;
    private InterfaceC4573bh<C3751bJh, C3750bJg> n;
    private final BitSet d = new BitSet(8);
    private boolean c = false;
    private Carousel.Padding k = null;
    private boolean b = false;
    private float g = 0.0f;
    private int j = 0;

    /* renamed from: o  reason: collision with root package name */
    private int f13513o = 0;
    private int l = -1;

    @Override // o.AbstractC3073as
    public int Z_() {
        return 0;
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: a */
    public void e(C1511aE c1511aE, C3750bJg c3750bJg, int i) {
    }

    @Override // o.AbstractC3073as
    public int b(int i, int i2, int i3) {
        return i;
    }

    @Override // o.AbstractC3073as
    public boolean f() {
        return true;
    }

    @Override // o.InterfaceC3752bJi
    public /* synthetic */ InterfaceC3752bJi c(InterfaceC4467bf interfaceC4467bf) {
        return d((InterfaceC4467bf<C3751bJh, C3750bJg>) interfaceC4467bf);
    }

    @Override // o.InterfaceC3752bJi
    public /* synthetic */ InterfaceC3752bJi d(List list) {
        return c((List<? extends AbstractC3073as<?>>) list);
    }

    @Override // o.AbstractC3073as
    /* renamed from: c */
    public C3750bJg d(ViewGroup viewGroup) {
        C3750bJg c3750bJg = new C3750bJg(viewGroup.getContext());
        c3750bJg.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
        return c3750bJg;
    }

    @Override // o.AbstractC3073as
    public void c(C3750bJg c3750bJg) {
        super.c((C3751bJh) c3750bJg);
        c3750bJg.setClipToPaddingToRow(this.c);
        if (this.d.get(2)) {
            c3750bJg.setPadding(this.k);
        } else if (this.d.get(6)) {
            c3750bJg.setPaddingRes(this.f13513o);
        } else if (this.d.get(7)) {
            c3750bJg.setPaddingDp(this.l);
        } else {
            c3750bJg.setPaddingDp(this.l);
        }
        c3750bJg.setHasFixedSize(this.b);
        if (this.d.get(4)) {
            c3750bJg.setNumViewsToShowOnScreen(this.g);
        } else if (this.d.get(5)) {
            c3750bJg.setInitialPrefetchItemCount(this.j);
        } else {
            c3750bJg.setNumViewsToShowOnScreen(this.g);
        }
        c3750bJg.setModels(this.h);
    }

    @Override // o.AbstractC3073as
    /* renamed from: d */
    public void c(C3750bJg c3750bJg, AbstractC3073as abstractC3073as) {
        if (!(abstractC3073as instanceof C3751bJh)) {
            c(c3750bJg);
            return;
        }
        C3751bJh c3751bJh = (C3751bJh) abstractC3073as;
        super.c((C3751bJh) c3750bJg);
        boolean z = this.c;
        if (z != c3751bJh.c) {
            c3750bJg.setClipToPaddingToRow(z);
        }
        if (this.d.get(2)) {
            if (c3751bJh.d.get(2)) {
                if ((r0 = this.k) != null) {
                }
            }
            c3750bJg.setPadding(this.k);
        } else if (this.d.get(6)) {
            int i = this.f13513o;
            if (i != c3751bJh.f13513o) {
                c3750bJg.setPaddingRes(i);
            }
        } else if (this.d.get(7)) {
            int i2 = this.l;
            if (i2 != c3751bJh.l) {
                c3750bJg.setPaddingDp(i2);
            }
        } else if (c3751bJh.d.get(2) || c3751bJh.d.get(6) || c3751bJh.d.get(7)) {
            c3750bJg.setPaddingDp(this.l);
        }
        boolean z2 = this.b;
        if (z2 != c3751bJh.b) {
            c3750bJg.setHasFixedSize(z2);
        }
        if (this.d.get(4)) {
            if (Float.compare(c3751bJh.g, this.g) != 0) {
                c3750bJg.setNumViewsToShowOnScreen(this.g);
            }
        } else if (this.d.get(5)) {
            int i3 = this.j;
            if (i3 != c3751bJh.j) {
                c3750bJg.setInitialPrefetchItemCount(i3);
            }
        } else if (c3751bJh.d.get(4) || c3751bJh.d.get(5)) {
            c3750bJg.setNumViewsToShowOnScreen(this.g);
        }
        List<? extends AbstractC3073as<?>> list = this.h;
        List<? extends AbstractC3073as<?>> list2 = c3751bJh.h;
        if (list != null) {
            if (list.equals(list2)) {
                return;
            }
        } else if (list2 == null) {
            return;
        }
        c3750bJg.setModels(this.h);
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: d */
    public void a(C3750bJg c3750bJg, int i) {
        InterfaceC4467bf<C3751bJh, C3750bJg> interfaceC4467bf = this.i;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, c3750bJg, i);
        }
    }

    public C3751bJh d(InterfaceC4467bf<C3751bJh, C3750bJg> interfaceC4467bf) {
        h();
        this.i = interfaceC4467bf;
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: a */
    public void e(C3750bJg c3750bJg) {
        super.e((C3751bJh) c3750bJg);
        InterfaceC4414be<C3751bJh, C3750bJg> interfaceC4414be = this.f;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, c3750bJg);
        }
        c3750bJg.ah_();
    }

    @Override // o.AbstractC3073as
    /* renamed from: e */
    public void c(int i, C3750bJg c3750bJg) {
        InterfaceC4732bk<C3751bJh, C3750bJg> interfaceC4732bk = this.m;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, c3750bJg, i);
        }
        super.c(i, (int) c3750bJg);
    }

    @Override // o.AbstractC3073as
    /* renamed from: a */
    public void b(float f, float f2, int i, int i2, C3750bJg c3750bJg) {
        InterfaceC4573bh<C3751bJh, C3750bJg> interfaceC4573bh = this.n;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, c3750bJg, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, c3750bJg);
    }

    public C3751bJh c(List<? extends AbstractC3073as<?>> list) {
        this.d.set(1);
        h();
        this.h = list;
        return this;
    }

    @Override // o.InterfaceC3752bJi
    /* renamed from: c */
    public C3751bJh e(Carousel.Padding padding) {
        this.d.set(2);
        this.d.clear(6);
        this.f13513o = 0;
        this.d.clear(7);
        this.l = -1;
        h();
        this.k = padding;
        return this;
    }

    @Override // o.InterfaceC3752bJi
    /* renamed from: c */
    public C3751bJh b(float f) {
        this.d.set(4);
        this.d.clear(5);
        this.j = 0;
        h();
        this.g = f;
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: c */
    public C3751bJh e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.InterfaceC3752bJi
    /* renamed from: d */
    public C3751bJh c(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: e */
    public C3751bJh a(int i) {
        throw new UnsupportedOperationException("Layout resources are unsupported with programmatic views.");
    }

    @Override // o.InterfaceC3752bJi
    /* renamed from: c */
    public C3751bJh e(AbstractC3073as.b bVar) {
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
        if ((obj instanceof C3751bJh) && super.equals(obj)) {
            C3751bJh c3751bJh = (C3751bJh) obj;
            if ((this.i == null) != (c3751bJh.i == null)) {
                return false;
            }
            if ((this.f == null) != (c3751bJh.f == null)) {
                return false;
            }
            if ((this.m == null) != (c3751bJh.m == null)) {
                return false;
            }
            if ((this.n == null) == (c3751bJh.n == null) && this.c == c3751bJh.c) {
                List<? extends AbstractC3073as<?>> list = this.h;
                if (list == null ? c3751bJh.h == null : list.equals(c3751bJh.h)) {
                    Carousel.Padding padding = this.k;
                    if (padding == null ? c3751bJh.k == null : padding.equals(c3751bJh.k)) {
                        return this.b == c3751bJh.b && Float.compare(c3751bJh.g, this.g) == 0 && this.j == c3751bJh.j && this.f13513o == c3751bJh.f13513o && this.l == c3751bJh.l;
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
        int i2 = this.f != null ? 1 : 0;
        int i3 = this.m != null ? 1 : 0;
        int i4 = this.n == null ? 0 : 1;
        boolean z = this.c;
        List<? extends AbstractC3073as<?>> list = this.h;
        int hashCode2 = list != null ? list.hashCode() : 0;
        Carousel.Padding padding = this.k;
        int hashCode3 = padding != null ? padding.hashCode() : 0;
        boolean z2 = this.b;
        float f = this.g;
        return (((((((((((((((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + (z ? 1 : 0)) * 31) + hashCode2) * 31) + hashCode3) * 31) + (z2 ? 1 : 0)) * 31) + (f != 0.0f ? Float.floatToIntBits(f) : 0)) * 31) + this.j) * 31) + this.f13513o) * 31) + this.l;
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "CarouselNoSnapModel_{clipToPaddingToRow_Boolean=" + this.c + ", models_List=" + this.h + ", padding_Padding=" + this.k + ", hasFixedSize_Boolean=" + this.b + ", numViewsToShowOnScreen_Float=" + this.g + ", initialPrefetchItemCount_Int=" + this.j + ", paddingRes_Int=" + this.f13513o + ", paddingDp_Int=" + this.l + "}" + super.toString();
    }
}
