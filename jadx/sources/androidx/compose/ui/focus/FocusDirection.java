package androidx.compose.ui.focus;

import o.C8627dsp;
import o.drN;

@drN
/* loaded from: classes.dex */
public final class FocusDirection {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Next = m1076constructorimpl(1);
    private static final int Previous = m1076constructorimpl(2);
    private static final int Left = m1076constructorimpl(3);
    private static final int Right = m1076constructorimpl(4);
    private static final int Up = m1076constructorimpl(5);
    private static final int Down = m1076constructorimpl(6);
    private static final int Enter = m1076constructorimpl(7);
    private static final int Exit = m1076constructorimpl(8);

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ FocusDirection m1075boximpl(int i) {
        return new FocusDirection(i);
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static int m1076constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m1077equalsimpl(int i, Object obj) {
        return (obj instanceof FocusDirection) && i == ((FocusDirection) obj).m1081unboximpl();
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m1078equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m1079hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    public boolean equals(Object obj) {
        return m1077equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m1079hashCodeimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m1081unboximpl() {
        return this.value;
    }

    private /* synthetic */ FocusDirection(int i) {
        this.value = i;
    }

    public String toString() {
        return m1080toStringimpl(this.value);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m1080toStringimpl(int i) {
        return m1078equalsimpl0(i, Next) ? "Next" : m1078equalsimpl0(i, Previous) ? "Previous" : m1078equalsimpl0(i, Left) ? "Left" : m1078equalsimpl0(i, Right) ? "Right" : m1078equalsimpl0(i, Up) ? "Up" : m1078equalsimpl0(i, Down) ? "Down" : m1078equalsimpl0(i, Enter) ? "Enter" : m1078equalsimpl0(i, Exit) ? "Exit" : "Invalid FocusDirection";
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        /* renamed from: getNext-dhqQ-8s  reason: not valid java name */
        public final int m1086getNextdhqQ8s() {
            return FocusDirection.Next;
        }

        /* renamed from: getPrevious-dhqQ-8s  reason: not valid java name */
        public final int m1087getPreviousdhqQ8s() {
            return FocusDirection.Previous;
        }

        /* renamed from: getLeft-dhqQ-8s  reason: not valid java name */
        public final int m1085getLeftdhqQ8s() {
            return FocusDirection.Left;
        }

        /* renamed from: getRight-dhqQ-8s  reason: not valid java name */
        public final int m1088getRightdhqQ8s() {
            return FocusDirection.Right;
        }

        /* renamed from: getUp-dhqQ-8s  reason: not valid java name */
        public final int m1089getUpdhqQ8s() {
            return FocusDirection.Up;
        }

        /* renamed from: getDown-dhqQ-8s  reason: not valid java name */
        public final int m1082getDowndhqQ8s() {
            return FocusDirection.Down;
        }

        /* renamed from: getEnter-dhqQ-8s  reason: not valid java name */
        public final int m1083getEnterdhqQ8s() {
            return FocusDirection.Enter;
        }

        /* renamed from: getExit-dhqQ-8s  reason: not valid java name */
        public final int m1084getExitdhqQ8s() {
            return FocusDirection.Exit;
        }
    }
}
