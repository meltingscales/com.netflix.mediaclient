package androidx.compose.ui.geometry;

import o.C8626dso;
import o.C8627dsp;
import o.drN;

@drN
/* loaded from: classes.dex */
public final class Offset {
    private final long packedValue;
    public static final Companion Companion = new Companion(null);
    private static final long Zero = OffsetKt.Offset(0.0f, 0.0f);
    private static final long Infinite = OffsetKt.Offset(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    private static final long Unspecified = OffsetKt.Offset(Float.NaN, Float.NaN);

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ Offset m1126boximpl(long j) {
        return new Offset(j);
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static long m1129constructorimpl(long j) {
        return j;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m1133equalsimpl(long j, Object obj) {
        return (obj instanceof Offset) && j == ((Offset) obj).m1146unboximpl();
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m1134equalsimpl0(long j, long j2) {
        return j == j2;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m1139hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    public boolean equals(Object obj) {
        return m1133equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m1139hashCodeimpl(this.packedValue);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ long m1146unboximpl() {
        return this.packedValue;
    }

    private /* synthetic */ Offset(long j) {
        this.packedValue = j;
    }

    /* renamed from: component1-impl  reason: not valid java name */
    public static final float m1127component1impl(long j) {
        return m1137getXimpl(j);
    }

    /* renamed from: component2-impl  reason: not valid java name */
    public static final float m1128component2impl(long j) {
        return m1138getYimpl(j);
    }

    /* renamed from: copy-dBAh8RU  reason: not valid java name */
    public static final long m1130copydBAh8RU(long j, float f, float f2) {
        return OffsetKt.Offset(f, f2);
    }

    /* renamed from: copy-dBAh8RU$default  reason: not valid java name */
    public static /* synthetic */ long m1131copydBAh8RU$default(long j, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = m1137getXimpl(j);
        }
        if ((i & 2) != 0) {
            f2 = m1138getYimpl(j);
        }
        return m1130copydBAh8RU(j, f, f2);
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        /* renamed from: getZero-F1C5BW0  reason: not valid java name */
        public final long m1149getZeroF1C5BW0() {
            return Offset.Zero;
        }

        /* renamed from: getInfinite-F1C5BW0  reason: not valid java name */
        public final long m1147getInfiniteF1C5BW0() {
            return Offset.Infinite;
        }

        /* renamed from: getUnspecified-F1C5BW0  reason: not valid java name */
        public final long m1148getUnspecifiedF1C5BW0() {
            return Offset.Unspecified;
        }
    }

    /* renamed from: isValid-impl  reason: not valid java name */
    public static final boolean m1140isValidimpl(long j) {
        if (Float.isNaN(m1137getXimpl(j)) || Float.isNaN(m1138getYimpl(j))) {
            throw new IllegalStateException("Offset argument contained a NaN value.".toString());
        }
        return true;
    }

    /* renamed from: getDistance-impl  reason: not valid java name */
    public static final float m1135getDistanceimpl(long j) {
        return (float) Math.sqrt((m1137getXimpl(j) * m1137getXimpl(j)) + (m1138getYimpl(j) * m1138getYimpl(j)));
    }

    /* renamed from: getDistanceSquared-impl  reason: not valid java name */
    public static final float m1136getDistanceSquaredimpl(long j) {
        return (m1137getXimpl(j) * m1137getXimpl(j)) + (m1138getYimpl(j) * m1138getYimpl(j));
    }

    /* renamed from: unaryMinus-F1C5BW0  reason: not valid java name */
    public static final long m1145unaryMinusF1C5BW0(long j) {
        return OffsetKt.Offset(-m1137getXimpl(j), -m1138getYimpl(j));
    }

    /* renamed from: minus-MK-Hz9U  reason: not valid java name */
    public static final long m1141minusMKHz9U(long j, long j2) {
        return OffsetKt.Offset(m1137getXimpl(j) - m1137getXimpl(j2), m1138getYimpl(j) - m1138getYimpl(j2));
    }

    /* renamed from: plus-MK-Hz9U  reason: not valid java name */
    public static final long m1142plusMKHz9U(long j, long j2) {
        return OffsetKt.Offset(m1137getXimpl(j) + m1137getXimpl(j2), m1138getYimpl(j) + m1138getYimpl(j2));
    }

    /* renamed from: times-tuRUvjQ  reason: not valid java name */
    public static final long m1143timestuRUvjQ(long j, float f) {
        return OffsetKt.Offset(m1137getXimpl(j) * f, m1138getYimpl(j) * f);
    }

    /* renamed from: div-tuRUvjQ  reason: not valid java name */
    public static final long m1132divtuRUvjQ(long j, float f) {
        return OffsetKt.Offset(m1137getXimpl(j) / f, m1138getYimpl(j) / f);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m1144toStringimpl(long j) {
        if (OffsetKt.m1151isSpecifiedk4lQ0M(j)) {
            return "Offset(" + GeometryUtilsKt.toStringAsFixed(m1137getXimpl(j), 1) + ", " + GeometryUtilsKt.toStringAsFixed(m1138getYimpl(j), 1) + ')';
        }
        return "Offset.Unspecified";
    }

    public String toString() {
        return m1144toStringimpl(this.packedValue);
    }

    /* renamed from: getX-impl  reason: not valid java name */
    public static final float m1137getXimpl(long j) {
        if (j == Unspecified) {
            throw new IllegalStateException("Offset is unspecified".toString());
        }
        C8626dso c8626dso = C8626dso.e;
        return Float.intBitsToFloat((int) (j >> 32));
    }

    /* renamed from: getY-impl  reason: not valid java name */
    public static final float m1138getYimpl(long j) {
        if (j == Unspecified) {
            throw new IllegalStateException("Offset is unspecified".toString());
        }
        C8626dso c8626dso = C8626dso.e;
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }
}
