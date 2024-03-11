package androidx.compose.ui.text;

import o.C8627dsp;
import o.drN;

@drN
/* loaded from: classes.dex */
public final class PlaceholderVerticalAlign {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int AboveBaseline = m2103constructorimpl(1);
    private static final int Top = m2103constructorimpl(2);
    private static final int Bottom = m2103constructorimpl(3);
    private static final int Center = m2103constructorimpl(4);
    private static final int TextTop = m2103constructorimpl(5);
    private static final int TextBottom = m2103constructorimpl(6);
    private static final int TextCenter = m2103constructorimpl(7);

    /* renamed from: constructor-impl  reason: not valid java name */
    public static int m2103constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m2104equalsimpl(int i, Object obj) {
        return (obj instanceof PlaceholderVerticalAlign) && i == ((PlaceholderVerticalAlign) obj).m2108unboximpl();
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m2105equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m2106hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    public boolean equals(Object obj) {
        return m2104equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m2106hashCodeimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m2108unboximpl() {
        return this.value;
    }

    public String toString() {
        return m2107toStringimpl(this.value);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m2107toStringimpl(int i) {
        return m2105equalsimpl0(i, AboveBaseline) ? "AboveBaseline" : m2105equalsimpl0(i, Top) ? "Top" : m2105equalsimpl0(i, Bottom) ? "Bottom" : m2105equalsimpl0(i, Center) ? "Center" : m2105equalsimpl0(i, TextTop) ? "TextTop" : m2105equalsimpl0(i, TextBottom) ? "TextBottom" : m2105equalsimpl0(i, TextCenter) ? "TextCenter" : "Invalid";
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        /* renamed from: getAboveBaseline-J6kI3mc  reason: not valid java name */
        public final int m2109getAboveBaselineJ6kI3mc() {
            return PlaceholderVerticalAlign.AboveBaseline;
        }

        /* renamed from: getTop-J6kI3mc  reason: not valid java name */
        public final int m2115getTopJ6kI3mc() {
            return PlaceholderVerticalAlign.Top;
        }

        /* renamed from: getBottom-J6kI3mc  reason: not valid java name */
        public final int m2110getBottomJ6kI3mc() {
            return PlaceholderVerticalAlign.Bottom;
        }

        /* renamed from: getCenter-J6kI3mc  reason: not valid java name */
        public final int m2111getCenterJ6kI3mc() {
            return PlaceholderVerticalAlign.Center;
        }

        /* renamed from: getTextTop-J6kI3mc  reason: not valid java name */
        public final int m2114getTextTopJ6kI3mc() {
            return PlaceholderVerticalAlign.TextTop;
        }

        /* renamed from: getTextBottom-J6kI3mc  reason: not valid java name */
        public final int m2112getTextBottomJ6kI3mc() {
            return PlaceholderVerticalAlign.TextBottom;
        }

        /* renamed from: getTextCenter-J6kI3mc  reason: not valid java name */
        public final int m2113getTextCenterJ6kI3mc() {
            return PlaceholderVerticalAlign.TextCenter;
        }
    }
}
