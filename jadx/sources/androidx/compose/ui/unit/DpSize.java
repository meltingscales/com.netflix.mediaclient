package androidx.compose.ui.unit;

import androidx.compose.ui.unit.Dp;
import o.C8626dso;
import o.C8627dsp;
import o.drN;

@drN
/* loaded from: classes.dex */
public final class DpSize {
    public static final Companion Companion = new Companion(null);
    private static final long Unspecified;
    private static final long Zero;
    private final long packedValue;

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ DpSize m2514boximpl(long j) {
        return new DpSize(j);
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static long m2515constructorimpl(long j) {
        return j;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m2516equalsimpl(long j, Object obj) {
        return (obj instanceof DpSize) && j == ((DpSize) obj).m2522unboximpl();
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m2517equalsimpl0(long j, long j2) {
        return j == j2;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m2520hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    public boolean equals(Object obj) {
        return m2516equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m2520hashCodeimpl(this.packedValue);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ long m2522unboximpl() {
        return this.packedValue;
    }

    private /* synthetic */ DpSize(long j) {
        this.packedValue = j;
    }

    public String toString() {
        return m2521toStringimpl(this.packedValue);
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        /* renamed from: getZero-MYxV2XQ  reason: not valid java name */
        public final long m2524getZeroMYxV2XQ() {
            return DpSize.Zero;
        }

        /* renamed from: getUnspecified-MYxV2XQ  reason: not valid java name */
        public final long m2523getUnspecifiedMYxV2XQ() {
            return DpSize.Unspecified;
        }
    }

    /* renamed from: getWidth-D9Ej5fM  reason: not valid java name */
    public static final float m2519getWidthD9Ej5fM(long j) {
        if (j == Unspecified) {
            throw new IllegalStateException("DpSize is unspecified".toString());
        }
        C8626dso c8626dso = C8626dso.e;
        return Dp.m2492constructorimpl(Float.intBitsToFloat((int) (j >> 32)));
    }

    /* renamed from: getHeight-D9Ej5fM  reason: not valid java name */
    public static final float m2518getHeightD9Ej5fM(long j) {
        if (j == Unspecified) {
            throw new IllegalStateException("DpSize is unspecified".toString());
        }
        C8626dso c8626dso = C8626dso.e;
        return Dp.m2492constructorimpl(Float.intBitsToFloat((int) (j & 4294967295L)));
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m2521toStringimpl(long j) {
        if (j != Companion.m2523getUnspecifiedMYxV2XQ()) {
            return ((Object) Dp.m2496toStringimpl(m2519getWidthD9Ej5fM(j))) + " x " + ((Object) Dp.m2496toStringimpl(m2518getHeightD9Ej5fM(j)));
        }
        return "DpSize.Unspecified";
    }

    static {
        float f = 0;
        Zero = DpKt.m2503DpSizeYgX7TsA(Dp.m2492constructorimpl(f), Dp.m2492constructorimpl(f));
        Dp.Companion companion = Dp.Companion;
        Unspecified = DpKt.m2503DpSizeYgX7TsA(companion.m2501getUnspecifiedD9Ej5fM(), companion.m2501getUnspecifiedD9Ej5fM());
    }
}
