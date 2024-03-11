package androidx.compose.ui.unit;

import o.C8627dsp;
import o.drN;

@drN
/* loaded from: classes.dex */
public final class IntOffset {
    public static final Companion Companion = new Companion(null);
    private static final long Zero = IntOffsetKt.IntOffset(0, 0);
    private final long packedValue;

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ IntOffset m2525boximpl(long j) {
        return new IntOffset(j);
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static long m2528constructorimpl(long j) {
        return j;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m2531equalsimpl(long j, Object obj) {
        return (obj instanceof IntOffset) && j == ((IntOffset) obj).m2537unboximpl();
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m2532equalsimpl0(long j, long j2) {
        return j == j2;
    }

    /* renamed from: getX-impl  reason: not valid java name */
    public static final int m2533getXimpl(long j) {
        return (int) (j >> 32);
    }

    /* renamed from: getY-impl  reason: not valid java name */
    public static final int m2534getYimpl(long j) {
        return (int) (j & 4294967295L);
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m2535hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    public boolean equals(Object obj) {
        return m2531equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m2535hashCodeimpl(this.packedValue);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ long m2537unboximpl() {
        return this.packedValue;
    }

    private /* synthetic */ IntOffset(long j) {
        this.packedValue = j;
    }

    /* renamed from: component1-impl  reason: not valid java name */
    public static final int m2526component1impl(long j) {
        return m2533getXimpl(j);
    }

    /* renamed from: component2-impl  reason: not valid java name */
    public static final int m2527component2impl(long j) {
        return m2534getYimpl(j);
    }

    /* renamed from: copy-iSbpLlY  reason: not valid java name */
    public static final long m2529copyiSbpLlY(long j, int i, int i2) {
        return IntOffsetKt.IntOffset(i, i2);
    }

    /* renamed from: copy-iSbpLlY$default  reason: not valid java name */
    public static /* synthetic */ long m2530copyiSbpLlY$default(long j, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = m2533getXimpl(j);
        }
        if ((i3 & 2) != 0) {
            i2 = m2534getYimpl(j);
        }
        return m2529copyiSbpLlY(j, i, i2);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m2536toStringimpl(long j) {
        return '(' + m2533getXimpl(j) + ", " + m2534getYimpl(j) + ')';
    }

    public String toString() {
        return m2536toStringimpl(this.packedValue);
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        /* renamed from: getZero-nOcc-ac  reason: not valid java name */
        public final long m2538getZeronOccac() {
            return IntOffset.Zero;
        }
    }
}
