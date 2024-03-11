package androidx.compose.ui.graphics;

import androidx.compose.ui.graphics.colorspace.ColorSpace;
import androidx.compose.ui.graphics.colorspace.ColorSpaceKt;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import o.C8627dsp;
import o.C8632dsu;
import o.dpL;
import o.dpS;
import o.drN;

@drN
/* loaded from: classes.dex */
public final class Color {
    private final long value;
    public static final Companion Companion = new Companion(null);
    private static final long Black = ColorKt.Color(4278190080L);
    private static final long DarkGray = ColorKt.Color(4282664004L);
    private static final long Gray = ColorKt.Color(4287137928L);
    private static final long LightGray = ColorKt.Color(4291611852L);
    private static final long White = ColorKt.Color(4294967295L);
    private static final long Red = ColorKt.Color(4294901760L);
    private static final long Green = ColorKt.Color(4278255360L);
    private static final long Blue = ColorKt.Color(4278190335L);
    private static final long Yellow = ColorKt.Color(4294967040L);
    private static final long Cyan = ColorKt.Color(4278255615L);
    private static final long Magenta = ColorKt.Color(4294902015L);
    private static final long Transparent = ColorKt.Color(0);
    private static final long Unspecified = ColorKt.Color(0.0f, 0.0f, 0.0f, 0.0f, ColorSpaces.INSTANCE.getUnspecified$ui_graphics_release());

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ Color m1284boximpl(long j) {
        return new Color(j);
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static long m1289constructorimpl(long j) {
        return j;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m1293equalsimpl(long j, Object obj) {
        return (obj instanceof Color) && j == ((Color) obj).m1302unboximpl();
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m1294equalsimpl0(long j, long j2) {
        return dpL.e(j, j2);
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m1300hashCodeimpl(long j) {
        return dpL.a(j);
    }

    public boolean equals(Object obj) {
        return m1293equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m1300hashCodeimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ long m1302unboximpl() {
        return this.value;
    }

    private /* synthetic */ Color(long j) {
        this.value = j;
    }

    /* renamed from: getColorSpace-impl  reason: not valid java name */
    public static final ColorSpace m1297getColorSpaceimpl(long j) {
        return ColorSpaces.INSTANCE.getColorSpacesArray$ui_graphics_release()[(int) dpL.b(j & 63)];
    }

    /* renamed from: convert-vNxB06k  reason: not valid java name */
    public static final long m1290convertvNxB06k(long j, ColorSpace colorSpace) {
        ColorSpace m1297getColorSpaceimpl = m1297getColorSpaceimpl(j);
        return C8632dsu.c(colorSpace, m1297getColorSpaceimpl) ? j : ColorSpaceKt.m1495connectYBCOT_4$default(m1297getColorSpaceimpl, colorSpace, 0, 2, null).mo1496transformToColorwmQWz5c$ui_graphics_release(m1299getRedimpl(j), m1298getGreenimpl(j), m1296getBlueimpl(j), m1295getAlphaimpl(j));
    }

    /* renamed from: getRed-impl  reason: not valid java name */
    public static final float m1299getRedimpl(long j) {
        if (dpL.b(63 & j) == 0) {
            return ((float) dpS.b(dpL.b(dpL.b(j >>> 48) & 255))) / 255.0f;
        }
        return Float16.m1341toFloatimpl(Float16.m1337constructorimpl((short) dpL.b(dpL.b(j >>> 48) & 65535)));
    }

    /* renamed from: getGreen-impl  reason: not valid java name */
    public static final float m1298getGreenimpl(long j) {
        if (dpL.b(63 & j) == 0) {
            return ((float) dpS.b(dpL.b(dpL.b(j >>> 40) & 255))) / 255.0f;
        }
        return Float16.m1341toFloatimpl(Float16.m1337constructorimpl((short) dpL.b(dpL.b(j >>> 32) & 65535)));
    }

    /* renamed from: getBlue-impl  reason: not valid java name */
    public static final float m1296getBlueimpl(long j) {
        if (dpL.b(63 & j) == 0) {
            return ((float) dpS.b(dpL.b(dpL.b(j >>> 32) & 255))) / 255.0f;
        }
        return Float16.m1341toFloatimpl(Float16.m1337constructorimpl((short) dpL.b(dpL.b(j >>> 16) & 65535)));
    }

    /* renamed from: getAlpha-impl  reason: not valid java name */
    public static final float m1295getAlphaimpl(long j) {
        float b;
        float f;
        if (dpL.b(63 & j) == 0) {
            b = (float) dpS.b(dpL.b(dpL.b(j >>> 56) & 255));
            f = 255.0f;
        } else {
            b = (float) dpS.b(dpL.b(dpL.b(j >>> 6) & 1023));
            f = 1023.0f;
        }
        return b / f;
    }

    /* renamed from: component1-impl  reason: not valid java name */
    public static final float m1285component1impl(long j) {
        return m1299getRedimpl(j);
    }

    /* renamed from: component2-impl  reason: not valid java name */
    public static final float m1286component2impl(long j) {
        return m1298getGreenimpl(j);
    }

    /* renamed from: component3-impl  reason: not valid java name */
    public static final float m1287component3impl(long j) {
        return m1296getBlueimpl(j);
    }

    /* renamed from: component4-impl  reason: not valid java name */
    public static final float m1288component4impl(long j) {
        return m1295getAlphaimpl(j);
    }

    /* renamed from: copy-wmQWz5c$default  reason: not valid java name */
    public static /* synthetic */ long m1292copywmQWz5c$default(long j, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = m1295getAlphaimpl(j);
        }
        float f5 = f;
        if ((i & 2) != 0) {
            f2 = m1299getRedimpl(j);
        }
        float f6 = f2;
        if ((i & 4) != 0) {
            f3 = m1298getGreenimpl(j);
        }
        float f7 = f3;
        if ((i & 8) != 0) {
            f4 = m1296getBlueimpl(j);
        }
        return m1291copywmQWz5c(j, f5, f6, f7, f4);
    }

    /* renamed from: copy-wmQWz5c  reason: not valid java name */
    public static final long m1291copywmQWz5c(long j, float f, float f2, float f3, float f4) {
        return ColorKt.Color(f2, f3, f4, f, m1297getColorSpaceimpl(j));
    }

    public String toString() {
        return m1301toStringimpl(this.value);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m1301toStringimpl(long j) {
        return "Color(" + m1299getRedimpl(j) + ", " + m1298getGreenimpl(j) + ", " + m1296getBlueimpl(j) + ", " + m1295getAlphaimpl(j) + ", " + m1297getColorSpaceimpl(j).getName() + ')';
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        /* renamed from: getBlack-0d7_KjU  reason: not valid java name */
        public final long m1303getBlack0d7_KjU() {
            return Color.Black;
        }

        /* renamed from: getDarkGray-0d7_KjU  reason: not valid java name */
        public final long m1305getDarkGray0d7_KjU() {
            return Color.DarkGray;
        }

        /* renamed from: getWhite-0d7_KjU  reason: not valid java name */
        public final long m1310getWhite0d7_KjU() {
            return Color.White;
        }

        /* renamed from: getRed-0d7_KjU  reason: not valid java name */
        public final long m1307getRed0d7_KjU() {
            return Color.Red;
        }

        /* renamed from: getGreen-0d7_KjU  reason: not valid java name */
        public final long m1306getGreen0d7_KjU() {
            return Color.Green;
        }

        /* renamed from: getBlue-0d7_KjU  reason: not valid java name */
        public final long m1304getBlue0d7_KjU() {
            return Color.Blue;
        }

        /* renamed from: getYellow-0d7_KjU  reason: not valid java name */
        public final long m1311getYellow0d7_KjU() {
            return Color.Yellow;
        }

        /* renamed from: getTransparent-0d7_KjU  reason: not valid java name */
        public final long m1308getTransparent0d7_KjU() {
            return Color.Transparent;
        }

        /* renamed from: getUnspecified-0d7_KjU  reason: not valid java name */
        public final long m1309getUnspecified0d7_KjU() {
            return Color.Unspecified;
        }
    }
}
