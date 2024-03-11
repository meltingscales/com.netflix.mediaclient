package androidx.compose.ui.graphics;

import o.C8627dsp;
import o.drN;

@drN
/* loaded from: classes.dex */
public final class ImageBitmapConfig {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Argb8888 = m1355constructorimpl(0);
    private static final int Alpha8 = m1355constructorimpl(1);
    private static final int Rgb565 = m1355constructorimpl(2);
    private static final int F16 = m1355constructorimpl(3);
    private static final int Gpu = m1355constructorimpl(4);

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ ImageBitmapConfig m1354boximpl(int i) {
        return new ImageBitmapConfig(i);
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static int m1355constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m1356equalsimpl(int i, Object obj) {
        return (obj instanceof ImageBitmapConfig) && i == ((ImageBitmapConfig) obj).m1360unboximpl();
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m1357equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m1358hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    public boolean equals(Object obj) {
        return m1356equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m1358hashCodeimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m1360unboximpl() {
        return this.value;
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        /* renamed from: getArgb8888-_sVssgQ  reason: not valid java name */
        public final int m1362getArgb8888_sVssgQ() {
            return ImageBitmapConfig.Argb8888;
        }

        /* renamed from: getAlpha8-_sVssgQ  reason: not valid java name */
        public final int m1361getAlpha8_sVssgQ() {
            return ImageBitmapConfig.Alpha8;
        }

        /* renamed from: getRgb565-_sVssgQ  reason: not valid java name */
        public final int m1365getRgb565_sVssgQ() {
            return ImageBitmapConfig.Rgb565;
        }

        /* renamed from: getF16-_sVssgQ  reason: not valid java name */
        public final int m1363getF16_sVssgQ() {
            return ImageBitmapConfig.F16;
        }

        /* renamed from: getGpu-_sVssgQ  reason: not valid java name */
        public final int m1364getGpu_sVssgQ() {
            return ImageBitmapConfig.Gpu;
        }
    }

    private /* synthetic */ ImageBitmapConfig(int i) {
        this.value = i;
    }

    public String toString() {
        return m1359toStringimpl(this.value);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m1359toStringimpl(int i) {
        return m1357equalsimpl0(i, Argb8888) ? "Argb8888" : m1357equalsimpl0(i, Alpha8) ? "Alpha8" : m1357equalsimpl0(i, Rgb565) ? "Rgb565" : m1357equalsimpl0(i, F16) ? "F16" : m1357equalsimpl0(i, Gpu) ? "Gpu" : "Unknown";
    }
}
