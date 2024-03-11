package androidx.compose.foundation.layout;

import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import o.drN;

@drN
/* loaded from: classes.dex */
public final class OrientationIndependentConstraints {
    private final long value;

    /* renamed from: constructor-impl  reason: not valid java name */
    private static long m260constructorimpl(long j) {
        return j;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m264equalsimpl(long j, Object obj) {
        return (obj instanceof OrientationIndependentConstraints) && Constraints.m2466equalsimpl0(j, ((OrientationIndependentConstraints) obj).m268unboximpl());
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m265hashCodeimpl(long j) {
        return Constraints.m2476hashCodeimpl(j);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m267toStringimpl(long j) {
        return "OrientationIndependentConstraints(value=" + ((Object) Constraints.m2477toStringimpl(j)) + ')';
    }

    public boolean equals(Object obj) {
        return m264equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m265hashCodeimpl(this.value);
    }

    public String toString() {
        return m267toStringimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ long m268unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static long m259constructorimpl(int i, int i2, int i3, int i4) {
        return m260constructorimpl(ConstraintsKt.Constraints(i, i2, i3, i4));
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static long m261constructorimpl(long j, LayoutOrientation layoutOrientation) {
        LayoutOrientation layoutOrientation2 = LayoutOrientation.Horizontal;
        return m259constructorimpl(layoutOrientation == layoutOrientation2 ? Constraints.m2475getMinWidthimpl(j) : Constraints.m2474getMinHeightimpl(j), layoutOrientation == layoutOrientation2 ? Constraints.m2473getMaxWidthimpl(j) : Constraints.m2472getMaxHeightimpl(j), layoutOrientation == layoutOrientation2 ? Constraints.m2474getMinHeightimpl(j) : Constraints.m2475getMinWidthimpl(j), layoutOrientation == layoutOrientation2 ? Constraints.m2472getMaxHeightimpl(j) : Constraints.m2473getMaxWidthimpl(j));
    }

    /* renamed from: toBoxConstraints-OenEA2s  reason: not valid java name */
    public static final long m266toBoxConstraintsOenEA2s(long j, LayoutOrientation layoutOrientation) {
        if (layoutOrientation == LayoutOrientation.Horizontal) {
            return ConstraintsKt.Constraints(Constraints.m2475getMinWidthimpl(j), Constraints.m2473getMaxWidthimpl(j), Constraints.m2474getMinHeightimpl(j), Constraints.m2472getMaxHeightimpl(j));
        }
        return ConstraintsKt.Constraints(Constraints.m2474getMinHeightimpl(j), Constraints.m2472getMaxHeightimpl(j), Constraints.m2475getMinWidthimpl(j), Constraints.m2473getMaxWidthimpl(j));
    }

    /* renamed from: copy-yUG9Ft0  reason: not valid java name */
    public static final long m262copyyUG9Ft0(long j, int i, int i2, int i3, int i4) {
        return m259constructorimpl(i, i2, i3, i4);
    }

    /* renamed from: copy-yUG9Ft0$default  reason: not valid java name */
    public static /* synthetic */ long m263copyyUG9Ft0$default(long j, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = Constraints.m2475getMinWidthimpl(j);
        }
        int i6 = i;
        if ((i5 & 2) != 0) {
            i2 = Constraints.m2473getMaxWidthimpl(j);
        }
        int i7 = i2;
        if ((i5 & 4) != 0) {
            i3 = Constraints.m2474getMinHeightimpl(j);
        }
        int i8 = i3;
        if ((i5 & 8) != 0) {
            i4 = Constraints.m2472getMaxHeightimpl(j);
        }
        return m262copyyUG9Ft0(j, i6, i7, i8, i4);
    }
}
