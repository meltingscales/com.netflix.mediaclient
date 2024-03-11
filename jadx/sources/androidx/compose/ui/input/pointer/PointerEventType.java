package androidx.compose.ui.input.pointer;

import o.C8627dsp;
import o.drN;

@drN
/* loaded from: classes.dex */
public final class PointerEventType {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Unknown = m1702constructorimpl(0);
    private static final int Press = m1702constructorimpl(1);
    private static final int Release = m1702constructorimpl(2);
    private static final int Move = m1702constructorimpl(3);
    private static final int Enter = m1702constructorimpl(4);
    private static final int Exit = m1702constructorimpl(5);
    private static final int Scroll = m1702constructorimpl(6);

    /* renamed from: constructor-impl  reason: not valid java name */
    private static int m1702constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m1703equalsimpl(int i, Object obj) {
        return (obj instanceof PointerEventType) && i == ((PointerEventType) obj).m1707unboximpl();
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m1704equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m1705hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    public boolean equals(Object obj) {
        return m1703equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m1705hashCodeimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m1707unboximpl() {
        return this.value;
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        /* renamed from: getUnknown-7fucELk  reason: not valid java name */
        public final int m1714getUnknown7fucELk() {
            return PointerEventType.Unknown;
        }

        /* renamed from: getPress-7fucELk  reason: not valid java name */
        public final int m1711getPress7fucELk() {
            return PointerEventType.Press;
        }

        /* renamed from: getRelease-7fucELk  reason: not valid java name */
        public final int m1712getRelease7fucELk() {
            return PointerEventType.Release;
        }

        /* renamed from: getMove-7fucELk  reason: not valid java name */
        public final int m1710getMove7fucELk() {
            return PointerEventType.Move;
        }

        /* renamed from: getEnter-7fucELk  reason: not valid java name */
        public final int m1708getEnter7fucELk() {
            return PointerEventType.Enter;
        }

        /* renamed from: getExit-7fucELk  reason: not valid java name */
        public final int m1709getExit7fucELk() {
            return PointerEventType.Exit;
        }

        /* renamed from: getScroll-7fucELk  reason: not valid java name */
        public final int m1713getScroll7fucELk() {
            return PointerEventType.Scroll;
        }
    }

    public String toString() {
        return m1706toStringimpl(this.value);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m1706toStringimpl(int i) {
        return m1704equalsimpl0(i, Press) ? "Press" : m1704equalsimpl0(i, Release) ? "Release" : m1704equalsimpl0(i, Move) ? "Move" : m1704equalsimpl0(i, Enter) ? "Enter" : m1704equalsimpl0(i, Exit) ? "Exit" : m1704equalsimpl0(i, Scroll) ? "Scroll" : "Unknown";
    }
}
