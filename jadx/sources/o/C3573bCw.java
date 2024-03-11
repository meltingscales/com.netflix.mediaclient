package o;

/* renamed from: o.bCw  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3573bCw {
    private final float a;
    private final float b;
    private final float c;
    private final float e;

    public /* synthetic */ C3573bCw(float f, float f2, float f3, float f4, C8627dsp c8627dsp) {
        this(f, f2, f3, f4);
    }

    public final float b() {
        return this.c;
    }

    public final float c() {
        return this.b;
    }

    public final float d() {
        return this.a;
    }

    public final float e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3573bCw) {
            C3573bCw c3573bCw = (C3573bCw) obj;
            return androidx.compose.ui.unit.Dp.m2494equalsimpl0(this.a, c3573bCw.a) && androidx.compose.ui.unit.Dp.m2494equalsimpl0(this.e, c3573bCw.e) && androidx.compose.ui.unit.Dp.m2494equalsimpl0(this.b, c3573bCw.b) && androidx.compose.ui.unit.Dp.m2494equalsimpl0(this.c, c3573bCw.c);
        }
        return false;
    }

    public int hashCode() {
        return (((((androidx.compose.ui.unit.Dp.m2495hashCodeimpl(this.a) * 31) + androidx.compose.ui.unit.Dp.m2495hashCodeimpl(this.e)) * 31) + androidx.compose.ui.unit.Dp.m2495hashCodeimpl(this.b)) * 31) + androidx.compose.ui.unit.Dp.m2495hashCodeimpl(this.c);
    }

    public String toString() {
        String m2496toStringimpl = androidx.compose.ui.unit.Dp.m2496toStringimpl(this.a);
        String m2496toStringimpl2 = androidx.compose.ui.unit.Dp.m2496toStringimpl(this.e);
        String m2496toStringimpl3 = androidx.compose.ui.unit.Dp.m2496toStringimpl(this.b);
        String m2496toStringimpl4 = androidx.compose.ui.unit.Dp.m2496toStringimpl(this.c);
        return "MenuGridPadding(start=" + m2496toStringimpl + ", end=" + m2496toStringimpl2 + ", top=" + m2496toStringimpl3 + ", bottom=" + m2496toStringimpl4 + ")";
    }

    private C3573bCw(float f, float f2, float f3, float f4) {
        this.a = f;
        this.e = f2;
        this.b = f3;
        this.c = f4;
    }

    public /* synthetic */ C3573bCw(float f, float f2, float f3, float f4, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? androidx.compose.ui.unit.Dp.m2492constructorimpl(0) : f, (i & 2) != 0 ? androidx.compose.ui.unit.Dp.m2492constructorimpl(0) : f2, (i & 4) != 0 ? androidx.compose.ui.unit.Dp.m2492constructorimpl(0) : f3, (i & 8) != 0 ? androidx.compose.ui.unit.Dp.m2492constructorimpl(0) : f4, null);
    }
}
