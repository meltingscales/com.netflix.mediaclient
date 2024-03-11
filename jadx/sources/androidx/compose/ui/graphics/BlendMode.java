package androidx.compose.ui.graphics;

import o.C8627dsp;
import o.drN;

@drN
/* loaded from: classes.dex */
public final class BlendMode {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Clear = m1227constructorimpl(0);
    private static final int Src = m1227constructorimpl(1);
    private static final int Dst = m1227constructorimpl(2);
    private static final int SrcOver = m1227constructorimpl(3);
    private static final int DstOver = m1227constructorimpl(4);
    private static final int SrcIn = m1227constructorimpl(5);
    private static final int DstIn = m1227constructorimpl(6);
    private static final int SrcOut = m1227constructorimpl(7);
    private static final int DstOut = m1227constructorimpl(8);
    private static final int SrcAtop = m1227constructorimpl(9);
    private static final int DstAtop = m1227constructorimpl(10);
    private static final int Xor = m1227constructorimpl(11);
    private static final int Plus = m1227constructorimpl(12);
    private static final int Modulate = m1227constructorimpl(13);
    private static final int Screen = m1227constructorimpl(14);
    private static final int Overlay = m1227constructorimpl(15);
    private static final int Darken = m1227constructorimpl(16);
    private static final int Lighten = m1227constructorimpl(17);
    private static final int ColorDodge = m1227constructorimpl(18);
    private static final int ColorBurn = m1227constructorimpl(19);
    private static final int Hardlight = m1227constructorimpl(20);
    private static final int Softlight = m1227constructorimpl(21);
    private static final int Difference = m1227constructorimpl(22);
    private static final int Exclusion = m1227constructorimpl(23);
    private static final int Multiply = m1227constructorimpl(24);
    private static final int Hue = m1227constructorimpl(25);
    private static final int Saturation = m1227constructorimpl(26);
    private static final int Color = m1227constructorimpl(27);
    private static final int Luminosity = m1227constructorimpl(28);

    /* renamed from: constructor-impl  reason: not valid java name */
    public static int m1227constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m1228equalsimpl(int i, Object obj) {
        return (obj instanceof BlendMode) && i == ((BlendMode) obj).m1232unboximpl();
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m1229equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m1230hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    public boolean equals(Object obj) {
        return m1228equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m1230hashCodeimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m1232unboximpl() {
        return this.value;
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        /* renamed from: getClear-0nO6VwU  reason: not valid java name */
        public final int m1233getClear0nO6VwU() {
            return BlendMode.Clear;
        }

        /* renamed from: getSrc-0nO6VwU  reason: not valid java name */
        public final int m1256getSrc0nO6VwU() {
            return BlendMode.Src;
        }

        /* renamed from: getDst-0nO6VwU  reason: not valid java name */
        public final int m1239getDst0nO6VwU() {
            return BlendMode.Dst;
        }

        /* renamed from: getSrcOver-0nO6VwU  reason: not valid java name */
        public final int m1260getSrcOver0nO6VwU() {
            return BlendMode.SrcOver;
        }

        /* renamed from: getDstOver-0nO6VwU  reason: not valid java name */
        public final int m1243getDstOver0nO6VwU() {
            return BlendMode.DstOver;
        }

        /* renamed from: getSrcIn-0nO6VwU  reason: not valid java name */
        public final int m1258getSrcIn0nO6VwU() {
            return BlendMode.SrcIn;
        }

        /* renamed from: getDstIn-0nO6VwU  reason: not valid java name */
        public final int m1241getDstIn0nO6VwU() {
            return BlendMode.DstIn;
        }

        /* renamed from: getSrcOut-0nO6VwU  reason: not valid java name */
        public final int m1259getSrcOut0nO6VwU() {
            return BlendMode.SrcOut;
        }

        /* renamed from: getDstOut-0nO6VwU  reason: not valid java name */
        public final int m1242getDstOut0nO6VwU() {
            return BlendMode.DstOut;
        }

        /* renamed from: getSrcAtop-0nO6VwU  reason: not valid java name */
        public final int m1257getSrcAtop0nO6VwU() {
            return BlendMode.SrcAtop;
        }

        /* renamed from: getDstAtop-0nO6VwU  reason: not valid java name */
        public final int m1240getDstAtop0nO6VwU() {
            return BlendMode.DstAtop;
        }

        /* renamed from: getXor-0nO6VwU  reason: not valid java name */
        public final int m1261getXor0nO6VwU() {
            return BlendMode.Xor;
        }

        /* renamed from: getPlus-0nO6VwU  reason: not valid java name */
        public final int m1252getPlus0nO6VwU() {
            return BlendMode.Plus;
        }

        /* renamed from: getModulate-0nO6VwU  reason: not valid java name */
        public final int m1249getModulate0nO6VwU() {
            return BlendMode.Modulate;
        }

        /* renamed from: getScreen-0nO6VwU  reason: not valid java name */
        public final int m1254getScreen0nO6VwU() {
            return BlendMode.Screen;
        }

        /* renamed from: getOverlay-0nO6VwU  reason: not valid java name */
        public final int m1251getOverlay0nO6VwU() {
            return BlendMode.Overlay;
        }

        /* renamed from: getDarken-0nO6VwU  reason: not valid java name */
        public final int m1237getDarken0nO6VwU() {
            return BlendMode.Darken;
        }

        /* renamed from: getLighten-0nO6VwU  reason: not valid java name */
        public final int m1247getLighten0nO6VwU() {
            return BlendMode.Lighten;
        }

        /* renamed from: getColorDodge-0nO6VwU  reason: not valid java name */
        public final int m1236getColorDodge0nO6VwU() {
            return BlendMode.ColorDodge;
        }

        /* renamed from: getColorBurn-0nO6VwU  reason: not valid java name */
        public final int m1235getColorBurn0nO6VwU() {
            return BlendMode.ColorBurn;
        }

        /* renamed from: getHardlight-0nO6VwU  reason: not valid java name */
        public final int m1245getHardlight0nO6VwU() {
            return BlendMode.Hardlight;
        }

        /* renamed from: getSoftlight-0nO6VwU  reason: not valid java name */
        public final int m1255getSoftlight0nO6VwU() {
            return BlendMode.Softlight;
        }

        /* renamed from: getDifference-0nO6VwU  reason: not valid java name */
        public final int m1238getDifference0nO6VwU() {
            return BlendMode.Difference;
        }

        /* renamed from: getExclusion-0nO6VwU  reason: not valid java name */
        public final int m1244getExclusion0nO6VwU() {
            return BlendMode.Exclusion;
        }

        /* renamed from: getMultiply-0nO6VwU  reason: not valid java name */
        public final int m1250getMultiply0nO6VwU() {
            return BlendMode.Multiply;
        }

        /* renamed from: getHue-0nO6VwU  reason: not valid java name */
        public final int m1246getHue0nO6VwU() {
            return BlendMode.Hue;
        }

        /* renamed from: getSaturation-0nO6VwU  reason: not valid java name */
        public final int m1253getSaturation0nO6VwU() {
            return BlendMode.Saturation;
        }

        /* renamed from: getColor-0nO6VwU  reason: not valid java name */
        public final int m1234getColor0nO6VwU() {
            return BlendMode.Color;
        }

        /* renamed from: getLuminosity-0nO6VwU  reason: not valid java name */
        public final int m1248getLuminosity0nO6VwU() {
            return BlendMode.Luminosity;
        }
    }

    public String toString() {
        return m1231toStringimpl(this.value);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m1231toStringimpl(int i) {
        return m1229equalsimpl0(i, Clear) ? "Clear" : m1229equalsimpl0(i, Src) ? "Src" : m1229equalsimpl0(i, Dst) ? "Dst" : m1229equalsimpl0(i, SrcOver) ? "SrcOver" : m1229equalsimpl0(i, DstOver) ? "DstOver" : m1229equalsimpl0(i, SrcIn) ? "SrcIn" : m1229equalsimpl0(i, DstIn) ? "DstIn" : m1229equalsimpl0(i, SrcOut) ? "SrcOut" : m1229equalsimpl0(i, DstOut) ? "DstOut" : m1229equalsimpl0(i, SrcAtop) ? "SrcAtop" : m1229equalsimpl0(i, DstAtop) ? "DstAtop" : m1229equalsimpl0(i, Xor) ? "Xor" : m1229equalsimpl0(i, Plus) ? "Plus" : m1229equalsimpl0(i, Modulate) ? "Modulate" : m1229equalsimpl0(i, Screen) ? "Screen" : m1229equalsimpl0(i, Overlay) ? "Overlay" : m1229equalsimpl0(i, Darken) ? "Darken" : m1229equalsimpl0(i, Lighten) ? "Lighten" : m1229equalsimpl0(i, ColorDodge) ? "ColorDodge" : m1229equalsimpl0(i, ColorBurn) ? "ColorBurn" : m1229equalsimpl0(i, Hardlight) ? "HardLight" : m1229equalsimpl0(i, Softlight) ? "Softlight" : m1229equalsimpl0(i, Difference) ? "Difference" : m1229equalsimpl0(i, Exclusion) ? "Exclusion" : m1229equalsimpl0(i, Multiply) ? "Multiply" : m1229equalsimpl0(i, Hue) ? "Hue" : m1229equalsimpl0(i, Saturation) ? "Saturation" : m1229equalsimpl0(i, Color) ? "Color" : m1229equalsimpl0(i, Luminosity) ? "Luminosity" : "Unknown";
    }
}
