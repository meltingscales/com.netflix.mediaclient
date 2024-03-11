package androidx.compose.ui.layout;

import o.C8626dso;
import o.C8627dsp;
import o.drN;

@drN
/* loaded from: classes.dex */
public final class ScaleFactor {
    public static final Companion Companion = new Companion(null);
    private static final long Unspecified = ScaleFactorKt.ScaleFactor(Float.NaN, Float.NaN);
    private final long packedValue;

    /* renamed from: constructor-impl  reason: not valid java name */
    public static long m1835constructorimpl(long j) {
        return j;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m1836equalsimpl(long j, Object obj) {
        return (obj instanceof ScaleFactor) && j == ((ScaleFactor) obj).m1841unboximpl();
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m1839hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    public boolean equals(Object obj) {
        return m1836equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m1839hashCodeimpl(this.packedValue);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ long m1841unboximpl() {
        return this.packedValue;
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m1840toStringimpl(long j) {
        float roundToTenths;
        float roundToTenths2;
        StringBuilder sb = new StringBuilder();
        sb.append("ScaleFactor(");
        roundToTenths = ScaleFactorKt.roundToTenths(m1837getScaleXimpl(j));
        sb.append(roundToTenths);
        sb.append(", ");
        roundToTenths2 = ScaleFactorKt.roundToTenths(m1838getScaleYimpl(j));
        sb.append(roundToTenths2);
        sb.append(')');
        return sb.toString();
    }

    public String toString() {
        return m1840toStringimpl(this.packedValue);
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }
    }

    /* renamed from: getScaleX-impl  reason: not valid java name */
    public static final float m1837getScaleXimpl(long j) {
        if (j == Unspecified) {
            throw new IllegalStateException("ScaleFactor is unspecified".toString());
        }
        C8626dso c8626dso = C8626dso.e;
        return Float.intBitsToFloat((int) (j >> 32));
    }

    /* renamed from: getScaleY-impl  reason: not valid java name */
    public static final float m1838getScaleYimpl(long j) {
        if (j == Unspecified) {
            throw new IllegalStateException("ScaleFactor is unspecified".toString());
        }
        C8626dso c8626dso = C8626dso.e;
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }
}
