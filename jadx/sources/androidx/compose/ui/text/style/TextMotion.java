package androidx.compose.ui.text.style;

import o.C8627dsp;
import o.C8632dsu;
import o.drN;

/* loaded from: classes.dex */
public final class TextMotion {
    private static final TextMotion Animated;
    public static final Companion Companion = new Companion(null);
    private static final TextMotion Static;
    private final int linearity;
    private final boolean subpixelTextPositioning;

    public /* synthetic */ TextMotion(int i, boolean z, C8627dsp c8627dsp) {
        this(i, z);
    }

    /* renamed from: getLinearity-4e0Vf04$ui_text_release  reason: not valid java name */
    public final int m2441getLinearity4e0Vf04$ui_text_release() {
        return this.linearity;
    }

    public final boolean getSubpixelTextPositioning$ui_text_release() {
        return this.subpixelTextPositioning;
    }

    private TextMotion(int i, boolean z) {
        this.linearity = i;
        this.subpixelTextPositioning = z;
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        public final TextMotion getStatic() {
            return TextMotion.Static;
        }
    }

    static {
        Linearity.Companion companion = Linearity.Companion;
        Static = new TextMotion(companion.m2448getFontHinting4e0Vf04(), false, null);
        Animated = new TextMotion(companion.m2449getLinear4e0Vf04(), true, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TextMotion) {
            TextMotion textMotion = (TextMotion) obj;
            return Linearity.m2444equalsimpl0(this.linearity, textMotion.linearity) && this.subpixelTextPositioning == textMotion.subpixelTextPositioning;
        }
        return false;
    }

    public int hashCode() {
        return (Linearity.m2445hashCodeimpl(this.linearity) * 31) + Boolean.hashCode(this.subpixelTextPositioning);
    }

    public String toString() {
        return C8632dsu.c(this, Static) ? "TextMotion.Static" : C8632dsu.c(this, Animated) ? "TextMotion.Animated" : "Invalid";
    }

    @drN
    /* loaded from: classes.dex */
    public static final class Linearity {
        private final int value;
        public static final Companion Companion = new Companion(null);
        private static final int Linear = m2442constructorimpl(1);
        private static final int FontHinting = m2442constructorimpl(2);
        private static final int None = m2442constructorimpl(3);

        /* renamed from: constructor-impl  reason: not valid java name */
        private static int m2442constructorimpl(int i) {
            return i;
        }

        /* renamed from: equals-impl  reason: not valid java name */
        public static boolean m2443equalsimpl(int i, Object obj) {
            return (obj instanceof Linearity) && i == ((Linearity) obj).m2447unboximpl();
        }

        /* renamed from: equals-impl0  reason: not valid java name */
        public static final boolean m2444equalsimpl0(int i, int i2) {
            return i == i2;
        }

        /* renamed from: hashCode-impl  reason: not valid java name */
        public static int m2445hashCodeimpl(int i) {
            return Integer.hashCode(i);
        }

        public boolean equals(Object obj) {
            return m2443equalsimpl(this.value, obj);
        }

        public int hashCode() {
            return m2445hashCodeimpl(this.value);
        }

        /* renamed from: unbox-impl  reason: not valid java name */
        public final /* synthetic */ int m2447unboximpl() {
            return this.value;
        }

        /* loaded from: classes.dex */
        public static final class Companion {
            public /* synthetic */ Companion(C8627dsp c8627dsp) {
                this();
            }

            private Companion() {
            }

            /* renamed from: getLinear-4e0Vf04  reason: not valid java name */
            public final int m2449getLinear4e0Vf04() {
                return Linearity.Linear;
            }

            /* renamed from: getFontHinting-4e0Vf04  reason: not valid java name */
            public final int m2448getFontHinting4e0Vf04() {
                return Linearity.FontHinting;
            }

            /* renamed from: getNone-4e0Vf04  reason: not valid java name */
            public final int m2450getNone4e0Vf04() {
                return Linearity.None;
            }
        }

        public String toString() {
            return m2446toStringimpl(this.value);
        }

        /* renamed from: toString-impl  reason: not valid java name */
        public static String m2446toStringimpl(int i) {
            return m2444equalsimpl0(i, Linear) ? "Linearity.Linear" : m2444equalsimpl0(i, FontHinting) ? "Linearity.FontHinting" : m2444equalsimpl0(i, None) ? "Linearity.None" : "Invalid";
        }
    }
}
