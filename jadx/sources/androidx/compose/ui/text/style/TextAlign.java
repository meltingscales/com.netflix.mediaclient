package androidx.compose.ui.text.style;

import o.C8627dsp;
import o.drN;

@drN
/* loaded from: classes.dex */
public final class TextAlign {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Left = m2411constructorimpl(1);
    private static final int Right = m2411constructorimpl(2);
    private static final int Center = m2411constructorimpl(3);
    private static final int Justify = m2411constructorimpl(4);
    private static final int Start = m2411constructorimpl(5);
    private static final int End = m2411constructorimpl(6);
    private static final int Unspecified = m2411constructorimpl(Integer.MIN_VALUE);

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ TextAlign m2410boximpl(int i) {
        return new TextAlign(i);
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static int m2411constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m2412equalsimpl(int i, Object obj) {
        return (obj instanceof TextAlign) && i == ((TextAlign) obj).m2416unboximpl();
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m2413equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m2414hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    public boolean equals(Object obj) {
        return m2412equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m2414hashCodeimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m2416unboximpl() {
        return this.value;
    }

    private /* synthetic */ TextAlign(int i) {
        this.value = i;
    }

    public String toString() {
        return m2415toStringimpl(this.value);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m2415toStringimpl(int i) {
        return m2413equalsimpl0(i, Left) ? "Left" : m2413equalsimpl0(i, Right) ? "Right" : m2413equalsimpl0(i, Center) ? "Center" : m2413equalsimpl0(i, Justify) ? "Justify" : m2413equalsimpl0(i, Start) ? "Start" : m2413equalsimpl0(i, End) ? "End" : m2413equalsimpl0(i, Unspecified) ? "Unspecified" : "Invalid";
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        /* renamed from: getLeft-e0LSkKk  reason: not valid java name */
        public final int m2420getLefte0LSkKk() {
            return TextAlign.Left;
        }

        /* renamed from: getRight-e0LSkKk  reason: not valid java name */
        public final int m2421getRighte0LSkKk() {
            return TextAlign.Right;
        }

        /* renamed from: getCenter-e0LSkKk  reason: not valid java name */
        public final int m2417getCentere0LSkKk() {
            return TextAlign.Center;
        }

        /* renamed from: getJustify-e0LSkKk  reason: not valid java name */
        public final int m2419getJustifye0LSkKk() {
            return TextAlign.Justify;
        }

        /* renamed from: getStart-e0LSkKk  reason: not valid java name */
        public final int m2422getStarte0LSkKk() {
            return TextAlign.Start;
        }

        /* renamed from: getEnd-e0LSkKk  reason: not valid java name */
        public final int m2418getEnde0LSkKk() {
            return TextAlign.End;
        }

        /* renamed from: getUnspecified-e0LSkKk  reason: not valid java name */
        public final int m2423getUnspecifiede0LSkKk() {
            return TextAlign.Unspecified;
        }
    }
}
