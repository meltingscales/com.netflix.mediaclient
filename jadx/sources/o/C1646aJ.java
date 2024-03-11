package o;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: o.aJ  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1646aJ {
    private boolean a;
    private Integer b;
    private int c;
    private int d;
    private boolean e;
    private int f;
    private final Rect g;
    private Integer h;
    private boolean i;
    private Integer j;
    private int k;
    private int l;
    private int m;
    private boolean n;

    /* renamed from: o  reason: collision with root package name */
    private int f13426o;
    private int r;

    public C1646aJ() {
        this(null, 1, null);
    }

    private final boolean d() {
        return this.f == 0 && this.m > 0 && this.f13426o > 0;
    }

    private final boolean e() {
        return this.f == 0 && this.m == this.c && this.f13426o == this.r;
    }

    public final void a(int i) {
        this.a = false;
        this.n = false;
        this.e = false;
        this.d = i;
        this.j = null;
        this.h = null;
        this.b = null;
    }

    public final int b() {
        return this.d;
    }

    public final void e(int i) {
        this.d += i;
    }

    public C1646aJ(Integer num) {
        this.g = new Rect();
        this.d = -1;
        this.f = 8;
        if (num != null) {
            a(num.intValue());
        }
    }

    public /* synthetic */ C1646aJ(Integer num, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? null : num);
    }

    public final boolean a(View view, ViewGroup viewGroup, boolean z) {
        C8632dsu.c((Object) view, "");
        C8632dsu.c((Object) viewGroup, "");
        this.g.setEmpty();
        boolean z2 = view.getLocalVisibleRect(this.g) && !z;
        this.c = view.getHeight();
        this.r = view.getWidth();
        this.l = viewGroup.getHeight();
        this.k = viewGroup.getWidth();
        this.m = z2 ? this.g.height() : 0;
        this.f13426o = z2 ? this.g.width() : 0;
        this.f = view.getVisibility();
        return this.c > 0 && this.r > 0;
    }

    public final void b(C1511aE c1511aE, boolean z) {
        C8632dsu.c((Object) c1511aE, "");
        boolean z2 = this.n;
        boolean z3 = !z && d();
        this.n = z3;
        if (z3 != z2) {
            if (z3) {
                c1511aE.d(0);
            } else {
                c1511aE.d(1);
            }
        }
    }

    public final void a(C1511aE c1511aE, boolean z) {
        C8632dsu.c((Object) c1511aE, "");
        boolean z2 = this.e;
        boolean z3 = !z && c();
        this.e = z3;
        if (z3 != z2) {
            if (z3) {
                c1511aE.d(2);
            } else {
                c1511aE.d(3);
            }
        }
    }

    public final void b(C1511aE c1511aE, boolean z, int i) {
        C8632dsu.c((Object) c1511aE, "");
        boolean z2 = this.i;
        boolean z3 = !z && c(i);
        this.i = z3;
        if (z3 != z2) {
            if (z3) {
                c1511aE.d(5);
            } else {
                c1511aE.d(6);
            }
        }
    }

    public final void c(C1511aE c1511aE, boolean z) {
        C8632dsu.c((Object) c1511aE, "");
        boolean z2 = this.a;
        boolean z3 = !z && e();
        this.a = z3;
        if (z3 == z2 || !z3) {
            return;
        }
        c1511aE.d(4);
    }

    public final boolean e(C1511aE c1511aE, boolean z) {
        C8632dsu.c((Object) c1511aE, "");
        int i = this.m;
        Integer num = this.j;
        if (num != null && i == num.intValue()) {
            int i2 = this.f13426o;
            Integer num2 = this.h;
            if (num2 != null && i2 == num2.intValue()) {
                int i3 = this.f;
                Integer num3 = this.b;
                if (num3 != null && i3 == num3.intValue()) {
                    return false;
                }
            }
        }
        if (z) {
            if (this.f == 8) {
                c1511aE.a(0.0f, 0.0f, 0, 0);
            } else {
                int i4 = this.m;
                float f = 100.0f / this.r;
                int i5 = this.f13426o;
                c1511aE.a((100.0f / this.c) * i4, f * i5, i4, i5);
            }
        }
        this.j = Integer.valueOf(this.m);
        this.h = Integer.valueOf(this.f13426o);
        this.b = Integer.valueOf(this.f);
        return true;
    }

    private final boolean c() {
        int i = (this.l * this.k) / 2;
        int i2 = this.c * this.r;
        int i3 = this.m * this.f13426o;
        return this.f == 0 && (i2 < i ? i2 == i3 : i3 >= i);
    }

    private final boolean c(int i) {
        if (i == 0) {
            return d();
        }
        return this.f == 0 && (((float) (this.m * this.f13426o)) / ((float) (this.c * this.r))) * ((float) 100) >= ((float) i);
    }
}
