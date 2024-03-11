package androidx.compose.ui.node;

import o.C8626dso;
import o.drN;

@drN
/* loaded from: classes.dex */
final class DistanceAndInLayer {
    private final long packedValue;

    /* renamed from: constructor-impl  reason: not valid java name */
    public static long m1855constructorimpl(long j) {
        return j;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m1856equalsimpl(long j, Object obj) {
        return (obj instanceof DistanceAndInLayer) && j == ((DistanceAndInLayer) obj).m1861unboximpl();
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m1858hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    /* renamed from: isInLayer-impl  reason: not valid java name */
    public static final boolean m1859isInLayerimpl(long j) {
        return ((int) (j & 4294967295L)) != 0;
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m1860toStringimpl(long j) {
        return "DistanceAndInLayer(packedValue=" + j + ')';
    }

    public boolean equals(Object obj) {
        return m1856equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m1858hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m1860toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ long m1861unboximpl() {
        return this.packedValue;
    }

    /* renamed from: compareTo-S_HNhKs  reason: not valid java name */
    public static final int m1854compareToS_HNhKs(long j, long j2) {
        boolean m1859isInLayerimpl = m1859isInLayerimpl(j);
        if (m1859isInLayerimpl != m1859isInLayerimpl(j2)) {
            return m1859isInLayerimpl ? -1 : 1;
        }
        return (int) Math.signum(m1857getDistanceimpl(j) - m1857getDistanceimpl(j2));
    }

    /* renamed from: getDistance-impl  reason: not valid java name */
    public static final float m1857getDistanceimpl(long j) {
        C8626dso c8626dso = C8626dso.e;
        return Float.intBitsToFloat((int) (j >> 32));
    }
}
