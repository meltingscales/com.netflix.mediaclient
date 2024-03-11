package o;

/* renamed from: o.bCe  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3555bCe {
    private final float b;
    private final float c;
    private final float d;
    private final float e;

    public /* synthetic */ C3555bCe(float f, float f2, float f3, float f4, C8627dsp c8627dsp) {
        this(f, f2, f3, f4);
    }

    public final float b() {
        return this.c;
    }

    public final float c() {
        return this.d;
    }

    public final float d() {
        return this.b;
    }

    public final float e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3555bCe) {
            C3555bCe c3555bCe = (C3555bCe) obj;
            return androidx.compose.ui.unit.Dp.m2494equalsimpl0(this.e, c3555bCe.e) && androidx.compose.ui.unit.Dp.m2494equalsimpl0(this.d, c3555bCe.d) && androidx.compose.ui.unit.Dp.m2494equalsimpl0(this.b, c3555bCe.b) && androidx.compose.ui.unit.Dp.m2494equalsimpl0(this.c, c3555bCe.c);
        }
        return false;
    }

    public int hashCode() {
        return (((((androidx.compose.ui.unit.Dp.m2495hashCodeimpl(this.e) * 31) + androidx.compose.ui.unit.Dp.m2495hashCodeimpl(this.d)) * 31) + androidx.compose.ui.unit.Dp.m2495hashCodeimpl(this.b)) * 31) + androidx.compose.ui.unit.Dp.m2495hashCodeimpl(this.c);
    }

    public String toString() {
        String m2496toStringimpl = androidx.compose.ui.unit.Dp.m2496toStringimpl(this.e);
        String m2496toStringimpl2 = androidx.compose.ui.unit.Dp.m2496toStringimpl(this.d);
        String m2496toStringimpl3 = androidx.compose.ui.unit.Dp.m2496toStringimpl(this.b);
        String m2496toStringimpl4 = androidx.compose.ui.unit.Dp.m2496toStringimpl(this.c);
        return "DraggableSurfaceData(currentWidth=" + m2496toStringimpl + ", currentHeight=" + m2496toStringimpl2 + ", currentYOffset=" + m2496toStringimpl3 + ", currentXOffset=" + m2496toStringimpl4 + ")";
    }

    private C3555bCe(float f, float f2, float f3, float f4) {
        this.e = f;
        this.d = f2;
        this.b = f3;
        this.c = f4;
    }
}
