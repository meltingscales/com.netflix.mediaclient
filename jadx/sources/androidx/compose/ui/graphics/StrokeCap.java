package androidx.compose.ui.graphics;

import o.C8627dsp;
import o.drN;

@drN
/* loaded from: classes.dex */
public final class StrokeCap {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Butt = m1442constructorimpl(0);
    private static final int Round = m1442constructorimpl(1);
    private static final int Square = m1442constructorimpl(2);

    /* renamed from: constructor-impl  reason: not valid java name */
    public static int m1442constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m1443equalsimpl(int i, Object obj) {
        return (obj instanceof StrokeCap) && i == ((StrokeCap) obj).m1447unboximpl();
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m1444equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m1445hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    public boolean equals(Object obj) {
        return m1443equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m1445hashCodeimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m1447unboximpl() {
        return this.value;
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        /* renamed from: getButt-KaPHkGw  reason: not valid java name */
        public final int m1448getButtKaPHkGw() {
            return StrokeCap.Butt;
        }

        /* renamed from: getRound-KaPHkGw  reason: not valid java name */
        public final int m1449getRoundKaPHkGw() {
            return StrokeCap.Round;
        }

        /* renamed from: getSquare-KaPHkGw  reason: not valid java name */
        public final int m1450getSquareKaPHkGw() {
            return StrokeCap.Square;
        }
    }

    public String toString() {
        return m1446toStringimpl(this.value);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m1446toStringimpl(int i) {
        return m1444equalsimpl0(i, Butt) ? "Butt" : m1444equalsimpl0(i, Round) ? "Round" : m1444equalsimpl0(i, Square) ? "Square" : "Unknown";
    }
}
