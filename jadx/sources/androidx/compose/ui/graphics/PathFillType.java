package androidx.compose.ui.graphics;

import o.C8627dsp;
import o.drN;

@drN
/* loaded from: classes.dex */
public final class PathFillType {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int NonZero = m1399constructorimpl(0);
    private static final int EvenOdd = m1399constructorimpl(1);

    /* renamed from: constructor-impl  reason: not valid java name */
    public static int m1399constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m1400equalsimpl(int i, Object obj) {
        return (obj instanceof PathFillType) && i == ((PathFillType) obj).m1404unboximpl();
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m1401equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m1402hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    public boolean equals(Object obj) {
        return m1400equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m1402hashCodeimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m1404unboximpl() {
        return this.value;
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        /* renamed from: getNonZero-Rg-k1Os  reason: not valid java name */
        public final int m1406getNonZeroRgk1Os() {
            return PathFillType.NonZero;
        }

        /* renamed from: getEvenOdd-Rg-k1Os  reason: not valid java name */
        public final int m1405getEvenOddRgk1Os() {
            return PathFillType.EvenOdd;
        }
    }

    public String toString() {
        return m1403toStringimpl(this.value);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m1403toStringimpl(int i) {
        return m1401equalsimpl0(i, NonZero) ? "NonZero" : m1401equalsimpl0(i, EvenOdd) ? "EvenOdd" : "Unknown";
    }
}
