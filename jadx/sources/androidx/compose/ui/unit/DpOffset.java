package androidx.compose.ui.unit;

import androidx.compose.ui.unit.Dp;
import o.C8626dso;
import o.C8627dsp;
import o.drN;

@drN
/* loaded from: classes.dex */
public final class DpOffset {
    public static final Companion Companion = new Companion(null);
    private static final long Unspecified;
    private static final long Zero;
    private final long packedValue;

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ DpOffset m2505boximpl(long j) {
        return new DpOffset(j);
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static long m2506constructorimpl(long j) {
        return j;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m2507equalsimpl(long j, Object obj) {
        return (obj instanceof DpOffset) && j == ((DpOffset) obj).m2512unboximpl();
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m2510hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    public boolean equals(Object obj) {
        return m2507equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m2510hashCodeimpl(this.packedValue);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ long m2512unboximpl() {
        return this.packedValue;
    }

    private /* synthetic */ DpOffset(long j) {
        this.packedValue = j;
    }

    public String toString() {
        return m2511toStringimpl(this.packedValue);
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        /* renamed from: getUnspecified-RKDOV3M  reason: not valid java name */
        public final long m2513getUnspecifiedRKDOV3M() {
            return DpOffset.Unspecified;
        }
    }

    /* renamed from: getX-D9Ej5fM  reason: not valid java name */
    public static final float m2508getXD9Ej5fM(long j) {
        if (j == Unspecified) {
            throw new IllegalStateException("DpOffset is unspecified".toString());
        }
        C8626dso c8626dso = C8626dso.e;
        return Dp.m2492constructorimpl(Float.intBitsToFloat((int) (j >> 32)));
    }

    /* renamed from: getY-D9Ej5fM  reason: not valid java name */
    public static final float m2509getYD9Ej5fM(long j) {
        if (j == Unspecified) {
            throw new IllegalStateException("DpOffset is unspecified".toString());
        }
        C8626dso c8626dso = C8626dso.e;
        return Dp.m2492constructorimpl(Float.intBitsToFloat((int) (j & 4294967295L)));
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m2511toStringimpl(long j) {
        if (j != Companion.m2513getUnspecifiedRKDOV3M()) {
            return '(' + ((Object) Dp.m2496toStringimpl(m2508getXD9Ej5fM(j))) + ", " + ((Object) Dp.m2496toStringimpl(m2509getYD9Ej5fM(j))) + ')';
        }
        return "DpOffset.Unspecified";
    }

    static {
        float f = 0;
        Zero = DpKt.m2502DpOffsetYgX7TsA(Dp.m2492constructorimpl(f), Dp.m2492constructorimpl(f));
        Dp.Companion companion = Dp.Companion;
        Unspecified = DpKt.m2502DpOffsetYgX7TsA(companion.m2501getUnspecifiedD9Ej5fM(), companion.m2501getUnspecifiedD9Ej5fM());
    }
}
