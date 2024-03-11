package androidx.compose.ui.text.font;

import o.C8627dsp;
import o.drN;

@drN
/* loaded from: classes.dex */
public final class FontSynthesis {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int None = m2224constructorimpl(0);
    private static final int All = m2224constructorimpl(1);
    private static final int Weight = m2224constructorimpl(2);
    private static final int Style = m2224constructorimpl(3);

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ FontSynthesis m2223boximpl(int i) {
        return new FontSynthesis(i);
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static int m2224constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m2225equalsimpl(int i, Object obj) {
        return (obj instanceof FontSynthesis) && i == ((FontSynthesis) obj).m2231unboximpl();
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m2226equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m2227hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    public boolean equals(Object obj) {
        return m2225equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m2227hashCodeimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m2231unboximpl() {
        return this.value;
    }

    private /* synthetic */ FontSynthesis(int i) {
        this.value = i;
    }

    public String toString() {
        return m2230toStringimpl(this.value);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m2230toStringimpl(int i) {
        return m2226equalsimpl0(i, None) ? "None" : m2226equalsimpl0(i, All) ? "All" : m2226equalsimpl0(i, Weight) ? "Weight" : m2226equalsimpl0(i, Style) ? "Style" : "Invalid";
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        /* renamed from: getNone-GVVA2EU  reason: not valid java name */
        public final int m2233getNoneGVVA2EU() {
            return FontSynthesis.None;
        }

        /* renamed from: getAll-GVVA2EU  reason: not valid java name */
        public final int m2232getAllGVVA2EU() {
            return FontSynthesis.All;
        }

        /* renamed from: getWeight-GVVA2EU  reason: not valid java name */
        public final int m2235getWeightGVVA2EU() {
            return FontSynthesis.Weight;
        }

        /* renamed from: getStyle-GVVA2EU  reason: not valid java name */
        public final int m2234getStyleGVVA2EU() {
            return FontSynthesis.Style;
        }
    }

    /* renamed from: isWeightOn-impl$ui_text_release  reason: not valid java name */
    public static final boolean m2229isWeightOnimpl$ui_text_release(int i) {
        return m2226equalsimpl0(i, All) || m2226equalsimpl0(i, Weight);
    }

    /* renamed from: isStyleOn-impl$ui_text_release  reason: not valid java name */
    public static final boolean m2228isStyleOnimpl$ui_text_release(int i) {
        return m2226equalsimpl0(i, All) || m2226equalsimpl0(i, Style);
    }
}
