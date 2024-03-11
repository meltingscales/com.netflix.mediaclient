package androidx.compose.ui.text.style;

import o.C8627dsp;
import o.drN;

/* loaded from: classes.dex */
public final class LineHeightStyle {
    public static final Companion Companion = new Companion(null);
    private static final LineHeightStyle Default = new LineHeightStyle(Alignment.Companion.m2399getProportionalPIaL0Z0(), Trim.Companion.m2408getBothEVpEnUU(), null);
    private final float alignment;
    private final int trim;

    public /* synthetic */ LineHeightStyle(float f, int i, C8627dsp c8627dsp) {
        this(f, i);
    }

    /* renamed from: getAlignment-PIaL0Z0  reason: not valid java name */
    public final float m2390getAlignmentPIaL0Z0() {
        return this.alignment;
    }

    /* renamed from: getTrim-EVpEnUU  reason: not valid java name */
    public final int m2391getTrimEVpEnUU() {
        return this.trim;
    }

    private LineHeightStyle(float f, int i) {
        this.alignment = f;
        this.trim = i;
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        public final LineHeightStyle getDefault() {
            return LineHeightStyle.Default;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LineHeightStyle) {
            LineHeightStyle lineHeightStyle = (LineHeightStyle) obj;
            return Alignment.m2394equalsimpl0(this.alignment, lineHeightStyle.alignment) && Trim.m2402equalsimpl0(this.trim, lineHeightStyle.trim);
        }
        return false;
    }

    public int hashCode() {
        return (Alignment.m2395hashCodeimpl(this.alignment) * 31) + Trim.m2403hashCodeimpl(this.trim);
    }

    public String toString() {
        return "LineHeightStyle(alignment=" + ((Object) Alignment.m2396toStringimpl(this.alignment)) + ", trim=" + ((Object) Trim.m2406toStringimpl(this.trim)) + ')';
    }

    @drN
    /* loaded from: classes.dex */
    public static final class Trim {
        private final int value;
        public static final Companion Companion = new Companion(null);
        private static final int FirstLineTop = m2400constructorimpl(1);
        private static final int LastLineBottom = m2400constructorimpl(16);
        private static final int Both = m2400constructorimpl(17);
        private static final int None = m2400constructorimpl(0);

        /* renamed from: constructor-impl  reason: not valid java name */
        private static int m2400constructorimpl(int i) {
            return i;
        }

        /* renamed from: equals-impl  reason: not valid java name */
        public static boolean m2401equalsimpl(int i, Object obj) {
            return (obj instanceof Trim) && i == ((Trim) obj).m2407unboximpl();
        }

        /* renamed from: equals-impl0  reason: not valid java name */
        public static final boolean m2402equalsimpl0(int i, int i2) {
            return i == i2;
        }

        /* renamed from: hashCode-impl  reason: not valid java name */
        public static int m2403hashCodeimpl(int i) {
            return Integer.hashCode(i);
        }

        /* renamed from: isTrimFirstLineTop-impl$ui_text_release  reason: not valid java name */
        public static final boolean m2404isTrimFirstLineTopimpl$ui_text_release(int i) {
            return (i & 1) > 0;
        }

        /* renamed from: isTrimLastLineBottom-impl$ui_text_release  reason: not valid java name */
        public static final boolean m2405isTrimLastLineBottomimpl$ui_text_release(int i) {
            return (i & 16) > 0;
        }

        /* renamed from: toString-impl  reason: not valid java name */
        public static String m2406toStringimpl(int i) {
            return i == FirstLineTop ? "LineHeightStyle.Trim.FirstLineTop" : i == LastLineBottom ? "LineHeightStyle.Trim.LastLineBottom" : i == Both ? "LineHeightStyle.Trim.Both" : i == None ? "LineHeightStyle.Trim.None" : "Invalid";
        }

        public boolean equals(Object obj) {
            return m2401equalsimpl(this.value, obj);
        }

        public int hashCode() {
            return m2403hashCodeimpl(this.value);
        }

        /* renamed from: unbox-impl  reason: not valid java name */
        public final /* synthetic */ int m2407unboximpl() {
            return this.value;
        }

        public String toString() {
            return m2406toStringimpl(this.value);
        }

        /* loaded from: classes.dex */
        public static final class Companion {
            public /* synthetic */ Companion(C8627dsp c8627dsp) {
                this();
            }

            private Companion() {
            }

            /* renamed from: getBoth-EVpEnUU  reason: not valid java name */
            public final int m2408getBothEVpEnUU() {
                return Trim.Both;
            }

            /* renamed from: getNone-EVpEnUU  reason: not valid java name */
            public final int m2409getNoneEVpEnUU() {
                return Trim.None;
            }
        }
    }

    @drN
    /* loaded from: classes.dex */
    public static final class Alignment {
        private final float topRatio;
        public static final Companion Companion = new Companion(null);
        private static final float Top = m2392constructorimpl(0.0f);
        private static final float Center = m2392constructorimpl(0.5f);
        private static final float Proportional = m2392constructorimpl(-1.0f);
        private static final float Bottom = m2392constructorimpl(1.0f);

        /* renamed from: equals-impl  reason: not valid java name */
        public static boolean m2393equalsimpl(float f, Object obj) {
            return (obj instanceof Alignment) && Float.compare(f, ((Alignment) obj).m2397unboximpl()) == 0;
        }

        /* renamed from: equals-impl0  reason: not valid java name */
        public static final boolean m2394equalsimpl0(float f, float f2) {
            return Float.compare(f, f2) == 0;
        }

        /* renamed from: hashCode-impl  reason: not valid java name */
        public static int m2395hashCodeimpl(float f) {
            return Float.hashCode(f);
        }

        public boolean equals(Object obj) {
            return m2393equalsimpl(this.topRatio, obj);
        }

        public int hashCode() {
            return m2395hashCodeimpl(this.topRatio);
        }

        /* renamed from: unbox-impl  reason: not valid java name */
        public final /* synthetic */ float m2397unboximpl() {
            return this.topRatio;
        }

        /* renamed from: constructor-impl  reason: not valid java name */
        public static float m2392constructorimpl(float f) {
            if ((0.0f > f || f > 1.0f) && f != -1.0f) {
                throw new IllegalStateException("topRatio should be in [0..1] range or -1".toString());
            }
            return f;
        }

        public String toString() {
            return m2396toStringimpl(this.topRatio);
        }

        /* renamed from: toString-impl  reason: not valid java name */
        public static String m2396toStringimpl(float f) {
            if (f == Top) {
                return "LineHeightStyle.Alignment.Top";
            }
            if (f == Center) {
                return "LineHeightStyle.Alignment.Center";
            }
            if (f == Proportional) {
                return "LineHeightStyle.Alignment.Proportional";
            }
            if (f == Bottom) {
                return "LineHeightStyle.Alignment.Bottom";
            }
            return "LineHeightStyle.Alignment(topPercentage = " + f + ')';
        }

        /* loaded from: classes.dex */
        public static final class Companion {
            public /* synthetic */ Companion(C8627dsp c8627dsp) {
                this();
            }

            private Companion() {
            }

            /* renamed from: getCenter-PIaL0Z0  reason: not valid java name */
            public final float m2398getCenterPIaL0Z0() {
                return Alignment.Center;
            }

            /* renamed from: getProportional-PIaL0Z0  reason: not valid java name */
            public final float m2399getProportionalPIaL0Z0() {
                return Alignment.Proportional;
            }
        }
    }
}
