package androidx.compose.ui.unit;

import o.C8657dts;

/* loaded from: classes.dex */
public final class ConstraintsKt {
    public static /* synthetic */ long Constraints$default(int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = 0;
        }
        if ((i5 & 2) != 0) {
            i2 = Integer.MAX_VALUE;
        }
        if ((i5 & 4) != 0) {
            i3 = 0;
        }
        if ((i5 & 8) != 0) {
            i4 = Integer.MAX_VALUE;
        }
        return Constraints(i, i2, i3, i4);
    }

    public static final long Constraints(int i, int i2, int i3, int i4) {
        if (i2 < i) {
            throw new IllegalArgumentException(("maxWidth(" + i2 + ") must be >= than minWidth(" + i + ')').toString());
        } else if (i4 < i3) {
            throw new IllegalArgumentException(("maxHeight(" + i4 + ") must be >= than minHeight(" + i3 + ')').toString());
        } else if (i < 0 || i3 < 0) {
            throw new IllegalArgumentException(("minWidth(" + i + ") and minHeight(" + i3 + ") must be >= 0").toString());
        } else {
            return Constraints.Companion.m2479createConstraintsZbe2FdA$ui_unit_release(i, i2, i3, i4);
        }
    }

    /* renamed from: constrain-N9IONVI */
    public static final long m2484constrainN9IONVI(long j, long j2) {
        int c;
        int c2;
        int c3;
        int c4;
        c = C8657dts.c(Constraints.m2475getMinWidthimpl(j2), Constraints.m2475getMinWidthimpl(j), Constraints.m2473getMaxWidthimpl(j));
        c2 = C8657dts.c(Constraints.m2473getMaxWidthimpl(j2), Constraints.m2475getMinWidthimpl(j), Constraints.m2473getMaxWidthimpl(j));
        c3 = C8657dts.c(Constraints.m2474getMinHeightimpl(j2), Constraints.m2474getMinHeightimpl(j), Constraints.m2472getMaxHeightimpl(j));
        c4 = C8657dts.c(Constraints.m2472getMaxHeightimpl(j2), Constraints.m2474getMinHeightimpl(j), Constraints.m2472getMaxHeightimpl(j));
        return Constraints(c, c2, c3, c4);
    }

    /* renamed from: constrain-4WqzIAM */
    public static final long m2483constrain4WqzIAM(long j, long j2) {
        int c;
        int c2;
        c = C8657dts.c(IntSize.m2547getWidthimpl(j2), Constraints.m2475getMinWidthimpl(j), Constraints.m2473getMaxWidthimpl(j));
        c2 = C8657dts.c(IntSize.m2546getHeightimpl(j2), Constraints.m2474getMinHeightimpl(j), Constraints.m2472getMaxHeightimpl(j));
        return IntSizeKt.IntSize(c, c2);
    }

    /* renamed from: constrainWidth-K40F9xA */
    public static final int m2486constrainWidthK40F9xA(long j, int i) {
        int c;
        c = C8657dts.c(i, Constraints.m2475getMinWidthimpl(j), Constraints.m2473getMaxWidthimpl(j));
        return c;
    }

    /* renamed from: constrainHeight-K40F9xA */
    public static final int m2485constrainHeightK40F9xA(long j, int i) {
        int c;
        c = C8657dts.c(i, Constraints.m2474getMinHeightimpl(j), Constraints.m2472getMaxHeightimpl(j));
        return c;
    }

    /* renamed from: isSatisfiedBy-4WqzIAM */
    public static final boolean m2487isSatisfiedBy4WqzIAM(long j, long j2) {
        int m2475getMinWidthimpl = Constraints.m2475getMinWidthimpl(j);
        int m2473getMaxWidthimpl = Constraints.m2473getMaxWidthimpl(j);
        int m2547getWidthimpl = IntSize.m2547getWidthimpl(j2);
        if (m2475getMinWidthimpl <= m2547getWidthimpl && m2547getWidthimpl <= m2473getMaxWidthimpl) {
            int m2474getMinHeightimpl = Constraints.m2474getMinHeightimpl(j);
            int m2472getMaxHeightimpl = Constraints.m2472getMaxHeightimpl(j);
            int m2546getHeightimpl = IntSize.m2546getHeightimpl(j2);
            if (m2474getMinHeightimpl <= m2546getHeightimpl && m2546getHeightimpl <= m2472getMaxHeightimpl) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: offset-NN6Ew-U$default */
    public static /* synthetic */ long m2489offsetNN6EwU$default(long j, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return m2488offsetNN6EwU(j, i, i2);
    }

    /* renamed from: offset-NN6Ew-U */
    public static final long m2488offsetNN6EwU(long j, int i, int i2) {
        int b;
        int b2;
        b = C8657dts.b(Constraints.m2475getMinWidthimpl(j) + i, 0);
        int addMaxWithMinimum = addMaxWithMinimum(Constraints.m2473getMaxWidthimpl(j), i);
        b2 = C8657dts.b(Constraints.m2474getMinHeightimpl(j) + i2, 0);
        return Constraints(b, addMaxWithMinimum, b2, addMaxWithMinimum(Constraints.m2472getMaxHeightimpl(j), i2));
    }

    private static final int addMaxWithMinimum(int i, int i2) {
        int b;
        if (i == Integer.MAX_VALUE) {
            return i;
        }
        b = C8657dts.b(i + i2, 0);
        return b;
    }
}
