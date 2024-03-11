package o;

import android.view.ViewGroup;
import com.airbnb.epoxy.Carousel;
import java.util.BitSet;
import java.util.List;
import o.AbstractC3073as;

/* renamed from: o.bQl  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C3944bQl extends AbstractC3073as<C3947bQo> implements InterfaceC1673aK<C3947bQo>, InterfaceC3946bQn {
    private InterfaceC4573bh<C3944bQl, C3947bQo> f;
    private InterfaceC4414be<C3944bQl, C3947bQo> g;
    private List<? extends AbstractC3073as<?>> h;
    private InterfaceC4467bf<C3944bQl, C3947bQo> i;
    private InterfaceC4732bk<C3944bQl, C3947bQo> k;
    private final BitSet b = new BitSet(7);
    private boolean c = false;
    private float j = 0.0f;
    private int d = 0;
    private int l = 0;

    /* renamed from: o  reason: collision with root package name */
    private int f13534o = -1;
    private Carousel.Padding m = null;

    @Override // o.AbstractC3073as
    public int Z_() {
        return 0;
    }

    @Override // o.AbstractC3073as
    public int b(int i, int i2, int i3) {
        return i;
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: c */
    public void e(C1511aE c1511aE, C3947bQo c3947bQo, int i) {
    }

    @Override // o.AbstractC3073as
    public boolean f() {
        return true;
    }

    @Override // o.InterfaceC3946bQn
    public /* synthetic */ InterfaceC3946bQn a(InterfaceC4467bf interfaceC4467bf) {
        return d((InterfaceC4467bf<C3944bQl, C3947bQo>) interfaceC4467bf);
    }

    @Override // o.InterfaceC3946bQn
    public /* synthetic */ InterfaceC3946bQn d(List list) {
        return a((List<? extends AbstractC3073as<?>>) list);
    }

    @Override // o.AbstractC3073as
    /* renamed from: a */
    public C3947bQo d(ViewGroup viewGroup) {
        C3947bQo c3947bQo = new C3947bQo(viewGroup.getContext());
        c3947bQo.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
        return c3947bQo;
    }

    @Override // o.AbstractC3073as
    /* renamed from: d */
    public void c(C3947bQo c3947bQo) {
        super.c((C3944bQl) c3947bQo);
        if (this.b.get(3)) {
            c3947bQo.setPaddingRes(this.l);
        } else if (this.b.get(4)) {
            c3947bQo.setPaddingDp(this.f13534o);
        } else if (this.b.get(5)) {
            c3947bQo.setPadding(this.m);
        } else {
            c3947bQo.setPaddingDp(this.f13534o);
        }
        c3947bQo.setHasFixedSize(this.c);
        if (this.b.get(1)) {
            c3947bQo.setNumViewsToShowOnScreen(this.j);
        } else if (this.b.get(2)) {
            c3947bQo.setInitialPrefetchItemCount(this.d);
        } else {
            c3947bQo.setNumViewsToShowOnScreen(this.j);
        }
        c3947bQo.setModels(this.h);
    }

    @Override // o.AbstractC3073as
    /* renamed from: d */
    public void c(C3947bQo c3947bQo, AbstractC3073as abstractC3073as) {
        if (!(abstractC3073as instanceof C3944bQl)) {
            c(c3947bQo);
            return;
        }
        C3944bQl c3944bQl = (C3944bQl) abstractC3073as;
        super.c((C3944bQl) c3947bQo);
        if (this.b.get(3)) {
            int i = this.l;
            if (i != c3944bQl.l) {
                c3947bQo.setPaddingRes(i);
            }
        } else if (this.b.get(4)) {
            int i2 = this.f13534o;
            if (i2 != c3944bQl.f13534o) {
                c3947bQo.setPaddingDp(i2);
            }
        } else if (this.b.get(5)) {
            if (c3944bQl.b.get(5)) {
                if ((r0 = this.m) != null) {
                }
            }
            c3947bQo.setPadding(this.m);
        } else if (c3944bQl.b.get(3) || c3944bQl.b.get(4) || c3944bQl.b.get(5)) {
            c3947bQo.setPaddingDp(this.f13534o);
        }
        boolean z = this.c;
        if (z != c3944bQl.c) {
            c3947bQo.setHasFixedSize(z);
        }
        if (this.b.get(1)) {
            if (Float.compare(c3944bQl.j, this.j) != 0) {
                c3947bQo.setNumViewsToShowOnScreen(this.j);
            }
        } else if (this.b.get(2)) {
            int i3 = this.d;
            if (i3 != c3944bQl.d) {
                c3947bQo.setInitialPrefetchItemCount(i3);
            }
        } else if (c3944bQl.b.get(1) || c3944bQl.b.get(2)) {
            c3947bQo.setNumViewsToShowOnScreen(this.j);
        }
        List<? extends AbstractC3073as<?>> list = this.h;
        List<? extends AbstractC3073as<?>> list2 = c3944bQl.h;
        if (list != null) {
            if (list.equals(list2)) {
                return;
            }
        } else if (list2 == null) {
            return;
        }
        c3947bQo.setModels(this.h);
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: d */
    public void a(C3947bQo c3947bQo, int i) {
        InterfaceC4467bf<C3944bQl, C3947bQo> interfaceC4467bf = this.i;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, c3947bQo, i);
        }
    }

    public C3944bQl d(InterfaceC4467bf<C3944bQl, C3947bQo> interfaceC4467bf) {
        h();
        this.i = interfaceC4467bf;
        return this;
    }

    @Override // o.AbstractC3073as
    public void e(C3947bQo c3947bQo) {
        super.e((C3944bQl) c3947bQo);
        InterfaceC4414be<C3944bQl, C3947bQo> interfaceC4414be = this.g;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, c3947bQo);
        }
        c3947bQo.ah_();
    }

    @Override // o.AbstractC3073as
    /* renamed from: d */
    public void c(int i, C3947bQo c3947bQo) {
        InterfaceC4732bk<C3944bQl, C3947bQo> interfaceC4732bk = this.k;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, c3947bQo, i);
        }
        super.c(i, (int) c3947bQo);
    }

    @Override // o.AbstractC3073as
    /* renamed from: a */
    public void b(float f, float f2, int i, int i2, C3947bQo c3947bQo) {
        InterfaceC4573bh<C3944bQl, C3947bQo> interfaceC4573bh = this.f;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, c3947bQo, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, c3947bQo);
    }

    @Override // o.InterfaceC3946bQn
    /* renamed from: b */
    public C3944bQl a(Carousel.Padding padding) {
        this.b.set(5);
        this.b.clear(3);
        this.l = 0;
        this.b.clear(4);
        this.f13534o = -1;
        h();
        this.m = padding;
        return this;
    }

    public C3944bQl a(List<? extends AbstractC3073as<?>> list) {
        this.b.set(6);
        h();
        this.h = list;
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: a */
    public C3944bQl e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.InterfaceC3946bQn
    /* renamed from: c */
    public C3944bQl e(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: d */
    public C3944bQl a(int i) {
        throw new UnsupportedOperationException("Layout resources are unsupported with programmatic views.");
    }

    @Override // o.InterfaceC3946bQn
    /* renamed from: c */
    public C3944bQl e(AbstractC3073as.b bVar) {
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
        if ((obj instanceof C3944bQl) && super.equals(obj)) {
            C3944bQl c3944bQl = (C3944bQl) obj;
            if ((this.i == null) != (c3944bQl.i == null)) {
                return false;
            }
            if ((this.g == null) != (c3944bQl.g == null)) {
                return false;
            }
            if ((this.k == null) != (c3944bQl.k == null)) {
                return false;
            }
            if ((this.f == null) == (c3944bQl.f == null) && this.c == c3944bQl.c && Float.compare(c3944bQl.j, this.j) == 0 && this.d == c3944bQl.d && this.l == c3944bQl.l && this.f13534o == c3944bQl.f13534o) {
                Carousel.Padding padding = this.m;
                if (padding == null ? c3944bQl.m == null : padding.equals(c3944bQl.m)) {
                    List<? extends AbstractC3073as<?>> list = this.h;
                    List<? extends AbstractC3073as<?>> list2 = c3944bQl.h;
                    return list == null ? list2 == null : list.equals(list2);
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
        int i3 = this.k != null ? 1 : 0;
        int i4 = this.f == null ? 0 : 1;
        boolean z = this.c;
        float f = this.j;
        int floatToIntBits = f != 0.0f ? Float.floatToIntBits(f) : 0;
        int i5 = this.d;
        int i6 = this.l;
        int i7 = this.f13534o;
        Carousel.Padding padding = this.m;
        int hashCode2 = padding != null ? padding.hashCode() : 0;
        List<? extends AbstractC3073as<?>> list = this.h;
        return (((((((((((((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + (z ? 1 : 0)) * 31) + floatToIntBits) * 31) + i5) * 31) + i6) * 31) + i7) * 31) + hashCode2) * 31) + (list != null ? list.hashCode() : 0);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "MediaCarouselModel_{hasFixedSize_Boolean=" + this.c + ", numViewsToShowOnScreen_Float=" + this.j + ", initialPrefetchItemCount_Int=" + this.d + ", paddingRes_Int=" + this.l + ", paddingDp_Int=" + this.f13534o + ", padding_Padding=" + this.m + ", models_List=" + this.h + "}" + super.toString();
    }
}
