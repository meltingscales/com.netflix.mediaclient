package androidx.compose.ui.geometry;

import o.C8626dso;
import o.C8627dsp;
import o.drN;

@drN
/* loaded from: classes.dex */
public final class Size {
    private final long packedValue;
    public static final Companion Companion = new Companion(null);
    private static final long Zero = SizeKt.Size(0.0f, 0.0f);
    private static final long Unspecified = SizeKt.Size(Float.NaN, Float.NaN);

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ Size m1170boximpl(long j) {
        return new Size(j);
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static long m1171constructorimpl(long j) {
        return j;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m1172equalsimpl(long j, Object obj) {
        return (obj instanceof Size) && j == ((Size) obj).m1180unboximpl();
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m1173equalsimpl0(long j, long j2) {
        return j == j2;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m1177hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    public boolean equals(Object obj) {
        return m1172equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m1177hashCodeimpl(this.packedValue);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ long m1180unboximpl() {
        return this.packedValue;
    }

    private /* synthetic */ Size(long j) {
        this.packedValue = j;
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        /* renamed from: getZero-NH-jbRc  reason: not valid java name */
        public final long m1182getZeroNHjbRc() {
            return Size.Zero;
        }

        /* renamed from: getUnspecified-NH-jbRc  reason: not valid java name */
        public final long m1181getUnspecifiedNHjbRc() {
            return Size.Unspecified;
        }
    }

    /* renamed from: isEmpty-impl  reason: not valid java name */
    public static final boolean m1178isEmptyimpl(long j) {
        return m1176getWidthimpl(j) <= 0.0f || m1174getHeightimpl(j) <= 0.0f;
    }

    /* renamed from: getMinDimension-impl  reason: not valid java name */
    public static final float m1175getMinDimensionimpl(long j) {
        return Math.min(Math.abs(m1176getWidthimpl(j)), Math.abs(m1174getHeightimpl(j)));
    }

    public String toString() {
        return m1179toStringimpl(this.packedValue);
    }

    /* renamed from: getWidth-impl  reason: not valid java name */
    public static final float m1176getWidthimpl(long j) {
        if (j == Unspecified) {
            throw new IllegalStateException("Size is unspecified".toString());
        }
        C8626dso c8626dso = C8626dso.e;
        return Float.intBitsToFloat((int) (j >> 32));
    }

    /* renamed from: getHeight-impl  reason: not valid java name */
    public static final float m1174getHeightimpl(long j) {
        if (j == Unspecified) {
            throw new IllegalStateException("Size is unspecified".toString());
        }
        C8626dso c8626dso = C8626dso.e;
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m1179toStringimpl(long j) {
        if (j != Companion.m1181getUnspecifiedNHjbRc()) {
            return "Size(" + GeometryUtilsKt.toStringAsFixed(m1176getWidthimpl(j), 1) + ", " + GeometryUtilsKt.toStringAsFixed(m1174getHeightimpl(j), 1) + ')';
        }
        return "Size.Unspecified";
    }
}
