package androidx.compose.ui.graphics;

import o.C8627dsp;
import o.drN;

@drN
/* loaded from: classes.dex */
public final class PathOperation {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Difference = m1407constructorimpl(0);
    private static final int Intersect = m1407constructorimpl(1);
    private static final int Union = m1407constructorimpl(2);
    private static final int Xor = m1407constructorimpl(3);
    private static final int ReverseDifference = m1407constructorimpl(4);

    /* renamed from: constructor-impl  reason: not valid java name */
    public static int m1407constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m1408equalsimpl(int i, Object obj) {
        return (obj instanceof PathOperation) && i == ((PathOperation) obj).m1412unboximpl();
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m1409equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m1410hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    public boolean equals(Object obj) {
        return m1408equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m1410hashCodeimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m1412unboximpl() {
        return this.value;
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        /* renamed from: getDifference-b3I0S0c  reason: not valid java name */
        public final int m1413getDifferenceb3I0S0c() {
            return PathOperation.Difference;
        }

        /* renamed from: getIntersect-b3I0S0c  reason: not valid java name */
        public final int m1414getIntersectb3I0S0c() {
            return PathOperation.Intersect;
        }

        /* renamed from: getUnion-b3I0S0c  reason: not valid java name */
        public final int m1416getUnionb3I0S0c() {
            return PathOperation.Union;
        }

        /* renamed from: getReverseDifference-b3I0S0c  reason: not valid java name */
        public final int m1415getReverseDifferenceb3I0S0c() {
            return PathOperation.ReverseDifference;
        }
    }

    public String toString() {
        return m1411toStringimpl(this.value);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m1411toStringimpl(int i) {
        return m1409equalsimpl0(i, Difference) ? "Difference" : m1409equalsimpl0(i, Intersect) ? "Intersect" : m1409equalsimpl0(i, Union) ? "Union" : m1409equalsimpl0(i, Xor) ? "Xor" : m1409equalsimpl0(i, ReverseDifference) ? "ReverseDifference" : "Unknown";
    }
}
