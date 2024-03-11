package androidx.compose.ui.graphics.colorspace;

import o.C8627dsp;
import o.drN;

@drN
/* loaded from: classes.dex */
public final class RenderIntent {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Perceptual = m1500constructorimpl(0);
    private static final int Relative = m1500constructorimpl(1);
    private static final int Saturation = m1500constructorimpl(2);
    private static final int Absolute = m1500constructorimpl(3);

    /* renamed from: constructor-impl  reason: not valid java name */
    public static int m1500constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m1501equalsimpl(int i, Object obj) {
        return (obj instanceof RenderIntent) && i == ((RenderIntent) obj).m1505unboximpl();
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m1502equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m1503hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    public boolean equals(Object obj) {
        return m1501equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m1503hashCodeimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m1505unboximpl() {
        return this.value;
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        /* renamed from: getPerceptual-uksYyKA  reason: not valid java name */
        public final int m1507getPerceptualuksYyKA() {
            return RenderIntent.Perceptual;
        }

        /* renamed from: getRelative-uksYyKA  reason: not valid java name */
        public final int m1508getRelativeuksYyKA() {
            return RenderIntent.Relative;
        }

        /* renamed from: getAbsolute-uksYyKA  reason: not valid java name */
        public final int m1506getAbsoluteuksYyKA() {
            return RenderIntent.Absolute;
        }
    }

    public String toString() {
        return m1504toStringimpl(this.value);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m1504toStringimpl(int i) {
        return m1502equalsimpl0(i, Perceptual) ? "Perceptual" : m1502equalsimpl0(i, Relative) ? "Relative" : m1502equalsimpl0(i, Saturation) ? "Saturation" : m1502equalsimpl0(i, Absolute) ? "Absolute" : "Unknown";
    }
}
