package androidx.compose.ui.graphics;

import o.C8627dsp;
import o.drN;

@drN
/* loaded from: classes.dex */
public final class StrokeJoin {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Miter = m1451constructorimpl(0);
    private static final int Round = m1451constructorimpl(1);
    private static final int Bevel = m1451constructorimpl(2);

    /* renamed from: constructor-impl  reason: not valid java name */
    public static int m1451constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m1452equalsimpl(int i, Object obj) {
        return (obj instanceof StrokeJoin) && i == ((StrokeJoin) obj).m1456unboximpl();
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m1453equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m1454hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    public boolean equals(Object obj) {
        return m1452equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m1454hashCodeimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m1456unboximpl() {
        return this.value;
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        /* renamed from: getMiter-LxFBmk8  reason: not valid java name */
        public final int m1458getMiterLxFBmk8() {
            return StrokeJoin.Miter;
        }

        /* renamed from: getRound-LxFBmk8  reason: not valid java name */
        public final int m1459getRoundLxFBmk8() {
            return StrokeJoin.Round;
        }

        /* renamed from: getBevel-LxFBmk8  reason: not valid java name */
        public final int m1457getBevelLxFBmk8() {
            return StrokeJoin.Bevel;
        }
    }

    public String toString() {
        return m1455toStringimpl(this.value);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m1455toStringimpl(int i) {
        return m1453equalsimpl0(i, Miter) ? "Miter" : m1453equalsimpl0(i, Round) ? "Round" : m1453equalsimpl0(i, Bevel) ? "Bevel" : "Unknown";
    }
}
