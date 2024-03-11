package androidx.compose.ui.unit;

import o.C8627dsp;
import o.drN;

@drN
/* loaded from: classes.dex */
public final class IntSize {
    public static final Companion Companion = new Companion(null);
    private static final long Zero = m2543constructorimpl(0);
    private final long packedValue;

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ IntSize m2542boximpl(long j) {
        return new IntSize(j);
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static long m2543constructorimpl(long j) {
        return j;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m2544equalsimpl(long j, Object obj) {
        return (obj instanceof IntSize) && j == ((IntSize) obj).m2550unboximpl();
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m2545equalsimpl0(long j, long j2) {
        return j == j2;
    }

    /* renamed from: getHeight-impl  reason: not valid java name */
    public static final int m2546getHeightimpl(long j) {
        return (int) (j & 4294967295L);
    }

    /* renamed from: getWidth-impl  reason: not valid java name */
    public static final int m2547getWidthimpl(long j) {
        return (int) (j >> 32);
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m2548hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    public boolean equals(Object obj) {
        return m2544equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m2548hashCodeimpl(this.packedValue);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ long m2550unboximpl() {
        return this.packedValue;
    }

    private /* synthetic */ IntSize(long j) {
        this.packedValue = j;
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m2549toStringimpl(long j) {
        return m2547getWidthimpl(j) + " x " + m2546getHeightimpl(j);
    }

    public String toString() {
        return m2549toStringimpl(this.packedValue);
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        /* renamed from: getZero-YbymL2g  reason: not valid java name */
        public final long m2551getZeroYbymL2g() {
            return IntSize.Zero;
        }
    }
}
