package androidx.compose.foundation.layout;

import o.C8627dsp;
import o.C8632dsu;
import o.drN;

@drN
/* loaded from: classes.dex */
public final class WindowInsetsSides {
    private static final int AllowLeftInLtr;
    private static final int AllowLeftInRtl;
    private static final int AllowRightInLtr;
    private static final int AllowRightInRtl;
    private static final int Bottom;
    public static final Companion Companion = new Companion(null);
    private static final int End;
    private static final int Horizontal;
    private static final int Left;
    private static final int Right;
    private static final int Start;
    private static final int Top;
    private static final int Vertical;
    private final int value;

    /* renamed from: constructor-impl  reason: not valid java name */
    private static int m313constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m314equalsimpl(int i, Object obj) {
        return (obj instanceof WindowInsetsSides) && i == ((WindowInsetsSides) obj).m321unboximpl();
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m315equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hasAny-bkgdKaI$foundation_layout_release  reason: not valid java name */
    public static final boolean m316hasAnybkgdKaI$foundation_layout_release(int i, int i2) {
        return (i & i2) != 0;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m317hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    public boolean equals(Object obj) {
        return m314equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m317hashCodeimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m321unboximpl() {
        return this.value;
    }

    /* renamed from: plus-gK_yJZ4  reason: not valid java name */
    public static final int m318plusgK_yJZ4(int i, int i2) {
        return m313constructorimpl(i | i2);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m319toStringimpl(int i) {
        return "WindowInsetsSides(" + m320valueToStringimpl(i) + ')';
    }

    public String toString() {
        return m319toStringimpl(this.value);
    }

    /* renamed from: valueToString-impl  reason: not valid java name */
    private static final String m320valueToStringimpl(int i) {
        StringBuilder sb = new StringBuilder();
        int i2 = Start;
        if ((i & i2) == i2) {
            valueToString_impl$lambda$0$appendPlus(sb, "Start");
        }
        int i3 = Left;
        if ((i & i3) == i3) {
            valueToString_impl$lambda$0$appendPlus(sb, "Left");
        }
        int i4 = Top;
        if ((i & i4) == i4) {
            valueToString_impl$lambda$0$appendPlus(sb, "Top");
        }
        int i5 = End;
        if ((i & i5) == i5) {
            valueToString_impl$lambda$0$appendPlus(sb, "End");
        }
        int i6 = Right;
        if ((i & i6) == i6) {
            valueToString_impl$lambda$0$appendPlus(sb, "Right");
        }
        int i7 = Bottom;
        if ((i & i7) == i7) {
            valueToString_impl$lambda$0$appendPlus(sb, "Bottom");
        }
        String sb2 = sb.toString();
        C8632dsu.a(sb2, "");
        return sb2;
    }

    private static final void valueToString_impl$lambda$0$appendPlus(StringBuilder sb, String str) {
        if (sb.length() > 0) {
            sb.append('+');
        }
        sb.append(str);
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        /* renamed from: getAllowLeftInLtr-JoeWqyM$foundation_layout_release  reason: not valid java name */
        public final int m322getAllowLeftInLtrJoeWqyM$foundation_layout_release() {
            return WindowInsetsSides.AllowLeftInLtr;
        }

        /* renamed from: getAllowRightInLtr-JoeWqyM$foundation_layout_release  reason: not valid java name */
        public final int m324getAllowRightInLtrJoeWqyM$foundation_layout_release() {
            return WindowInsetsSides.AllowRightInLtr;
        }

        /* renamed from: getAllowLeftInRtl-JoeWqyM$foundation_layout_release  reason: not valid java name */
        public final int m323getAllowLeftInRtlJoeWqyM$foundation_layout_release() {
            return WindowInsetsSides.AllowLeftInRtl;
        }

        /* renamed from: getAllowRightInRtl-JoeWqyM$foundation_layout_release  reason: not valid java name */
        public final int m325getAllowRightInRtlJoeWqyM$foundation_layout_release() {
            return WindowInsetsSides.AllowRightInRtl;
        }

        /* renamed from: getTop-JoeWqyM  reason: not valid java name */
        public final int m327getTopJoeWqyM() {
            return WindowInsetsSides.Top;
        }

        /* renamed from: getBottom-JoeWqyM  reason: not valid java name */
        public final int m326getBottomJoeWqyM() {
            return WindowInsetsSides.Bottom;
        }

        /* renamed from: getVertical-JoeWqyM  reason: not valid java name */
        public final int m328getVerticalJoeWqyM() {
            return WindowInsetsSides.Vertical;
        }
    }

    static {
        int m313constructorimpl = m313constructorimpl(8);
        AllowLeftInLtr = m313constructorimpl;
        int m313constructorimpl2 = m313constructorimpl(4);
        AllowRightInLtr = m313constructorimpl2;
        int m313constructorimpl3 = m313constructorimpl(2);
        AllowLeftInRtl = m313constructorimpl3;
        int m313constructorimpl4 = m313constructorimpl(1);
        AllowRightInRtl = m313constructorimpl4;
        Start = m318plusgK_yJZ4(m313constructorimpl, m313constructorimpl4);
        End = m318plusgK_yJZ4(m313constructorimpl2, m313constructorimpl3);
        int m313constructorimpl5 = m313constructorimpl(16);
        Top = m313constructorimpl5;
        int m313constructorimpl6 = m313constructorimpl(32);
        Bottom = m313constructorimpl6;
        int m318plusgK_yJZ4 = m318plusgK_yJZ4(m313constructorimpl, m313constructorimpl3);
        Left = m318plusgK_yJZ4;
        int m318plusgK_yJZ42 = m318plusgK_yJZ4(m313constructorimpl2, m313constructorimpl4);
        Right = m318plusgK_yJZ42;
        Horizontal = m318plusgK_yJZ4(m318plusgK_yJZ4, m318plusgK_yJZ42);
        Vertical = m318plusgK_yJZ4(m313constructorimpl5, m313constructorimpl6);
    }
}
