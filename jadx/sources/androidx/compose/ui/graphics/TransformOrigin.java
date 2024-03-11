package androidx.compose.ui.graphics;

import o.C8626dso;
import o.C8627dsp;
import o.drN;

@drN
/* loaded from: classes.dex */
public final class TransformOrigin {
    private final long packedValue;
    public static final Companion Companion = new Companion(null);
    private static final long Center = TransformOriginKt.TransformOrigin(0.5f, 0.5f);

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ TransformOrigin m1471boximpl(long j) {
        return new TransformOrigin(j);
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static long m1472constructorimpl(long j) {
        return j;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m1473equalsimpl(long j, Object obj) {
        return (obj instanceof TransformOrigin) && j == ((TransformOrigin) obj).m1479unboximpl();
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m1474equalsimpl0(long j, long j2) {
        return j == j2;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m1477hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m1478toStringimpl(long j) {
        return "TransformOrigin(packedValue=" + j + ')';
    }

    public boolean equals(Object obj) {
        return m1473equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m1477hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m1478toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ long m1479unboximpl() {
        return this.packedValue;
    }

    private /* synthetic */ TransformOrigin(long j) {
        this.packedValue = j;
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        /* renamed from: getCenter-SzJe1aQ  reason: not valid java name */
        public final long m1480getCenterSzJe1aQ() {
            return TransformOrigin.Center;
        }
    }

    /* renamed from: getPivotFractionX-impl  reason: not valid java name */
    public static final float m1475getPivotFractionXimpl(long j) {
        C8626dso c8626dso = C8626dso.e;
        return Float.intBitsToFloat((int) (j >> 32));
    }

    /* renamed from: getPivotFractionY-impl  reason: not valid java name */
    public static final float m1476getPivotFractionYimpl(long j) {
        C8626dso c8626dso = C8626dso.e;
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }
}
