package androidx.compose.ui.graphics;

import o.C8627dsp;
import o.drN;

@drN
/* loaded from: classes.dex */
public final class ClipOp {
    public static final Companion Companion = new Companion(null);
    private static final int Difference = m1276constructorimpl(0);
    private static final int Intersect = m1276constructorimpl(1);
    private final int value;

    /* renamed from: constructor-impl  reason: not valid java name */
    public static int m1276constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m1277equalsimpl(int i, Object obj) {
        return (obj instanceof ClipOp) && i == ((ClipOp) obj).m1281unboximpl();
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m1278equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m1279hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    public boolean equals(Object obj) {
        return m1277equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m1279hashCodeimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m1281unboximpl() {
        return this.value;
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        /* renamed from: getDifference-rtfAjoo  reason: not valid java name */
        public final int m1282getDifferencertfAjoo() {
            return ClipOp.Difference;
        }

        /* renamed from: getIntersect-rtfAjoo  reason: not valid java name */
        public final int m1283getIntersectrtfAjoo() {
            return ClipOp.Intersect;
        }
    }

    public String toString() {
        return m1280toStringimpl(this.value);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m1280toStringimpl(int i) {
        return m1278equalsimpl0(i, Difference) ? "Difference" : m1278equalsimpl0(i, Intersect) ? "Intersect" : "Unknown";
    }
}
