package androidx.compose.ui.graphics.colorspace;

import o.C8627dsp;
import o.drN;

@drN
/* loaded from: classes.dex */
public final class ColorModel {
    private static final long Cmyk;
    public static final Companion Companion = new Companion(null);
    private static final long Lab;
    private static final long Rgb;
    private static final long Xyz;
    private final long packedValue;

    /* renamed from: constructor-impl  reason: not valid java name */
    public static long m1482constructorimpl(long j) {
        return j;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m1483equalsimpl(long j, Object obj) {
        return (obj instanceof ColorModel) && j == ((ColorModel) obj).m1488unboximpl();
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m1484equalsimpl0(long j, long j2) {
        return j == j2;
    }

    /* renamed from: getComponentCount-impl  reason: not valid java name */
    public static final int m1485getComponentCountimpl(long j) {
        return (int) (j >> 32);
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m1486hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    public boolean equals(Object obj) {
        return m1483equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m1486hashCodeimpl(this.packedValue);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ long m1488unboximpl() {
        return this.packedValue;
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        /* renamed from: getRgb-xdoWZVw  reason: not valid java name */
        public final long m1490getRgbxdoWZVw() {
            return ColorModel.Rgb;
        }

        /* renamed from: getXyz-xdoWZVw  reason: not valid java name */
        public final long m1491getXyzxdoWZVw() {
            return ColorModel.Xyz;
        }

        /* renamed from: getLab-xdoWZVw  reason: not valid java name */
        public final long m1489getLabxdoWZVw() {
            return ColorModel.Lab;
        }
    }

    static {
        long j = 3;
        long j2 = j << 32;
        Rgb = m1482constructorimpl((0 & 4294967295L) | j2);
        Xyz = m1482constructorimpl((1 & 4294967295L) | j2);
        Lab = m1482constructorimpl(j2 | (2 & 4294967295L));
        Cmyk = m1482constructorimpl((j & 4294967295L) | (4 << 32));
    }

    public String toString() {
        return m1487toStringimpl(this.packedValue);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m1487toStringimpl(long j) {
        return m1484equalsimpl0(j, Rgb) ? "Rgb" : m1484equalsimpl0(j, Xyz) ? "Xyz" : m1484equalsimpl0(j, Lab) ? "Lab" : m1484equalsimpl0(j, Cmyk) ? "Cmyk" : "Unknown";
    }
}
