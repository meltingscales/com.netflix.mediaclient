package androidx.compose.ui.geometry;

import o.C8626dso;
import o.C8627dsp;
import o.drN;

@drN
/* loaded from: classes.dex */
public final class CornerRadius {
    public static final Companion Companion = new Companion(null);
    private static final long Zero = CornerRadiusKt.CornerRadius$default(0.0f, 0.0f, 2, null);
    private final long packedValue;

    /* renamed from: constructor-impl  reason: not valid java name */
    public static long m1117constructorimpl(long j) {
        return j;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m1118equalsimpl(long j, Object obj) {
        return (obj instanceof CornerRadius) && j == ((CornerRadius) obj).m1124unboximpl();
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m1119equalsimpl0(long j, long j2) {
        return j == j2;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m1122hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    public boolean equals(Object obj) {
        return m1118equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m1122hashCodeimpl(this.packedValue);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ long m1124unboximpl() {
        return this.packedValue;
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        /* renamed from: getZero-kKHJgLs  reason: not valid java name */
        public final long m1125getZerokKHJgLs() {
            return CornerRadius.Zero;
        }
    }

    public String toString() {
        return m1123toStringimpl(this.packedValue);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m1123toStringimpl(long j) {
        if (m1120getXimpl(j) == m1121getYimpl(j)) {
            return "CornerRadius.circular(" + GeometryUtilsKt.toStringAsFixed(m1120getXimpl(j), 1) + ')';
        }
        return "CornerRadius.elliptical(" + GeometryUtilsKt.toStringAsFixed(m1120getXimpl(j), 1) + ", " + GeometryUtilsKt.toStringAsFixed(m1121getYimpl(j), 1) + ')';
    }

    /* renamed from: getX-impl  reason: not valid java name */
    public static final float m1120getXimpl(long j) {
        C8626dso c8626dso = C8626dso.e;
        return Float.intBitsToFloat((int) (j >> 32));
    }

    /* renamed from: getY-impl  reason: not valid java name */
    public static final float m1121getYimpl(long j) {
        C8626dso c8626dso = C8626dso.e;
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }
}
