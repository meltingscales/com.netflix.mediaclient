package androidx.compose.ui.graphics;

import o.C8627dsp;
import o.drN;

@drN
/* loaded from: classes.dex */
public final class PaintingStyle {
    public static final Companion Companion = new Companion(null);
    private static final int Fill = m1390constructorimpl(0);
    private static final int Stroke = m1390constructorimpl(1);
    private final int value;

    /* renamed from: constructor-impl  reason: not valid java name */
    public static int m1390constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m1391equalsimpl(int i, Object obj) {
        return (obj instanceof PaintingStyle) && i == ((PaintingStyle) obj).m1395unboximpl();
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m1392equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m1393hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    public boolean equals(Object obj) {
        return m1391equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m1393hashCodeimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m1395unboximpl() {
        return this.value;
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        /* renamed from: getFill-TiuSbCo  reason: not valid java name */
        public final int m1396getFillTiuSbCo() {
            return PaintingStyle.Fill;
        }

        /* renamed from: getStroke-TiuSbCo  reason: not valid java name */
        public final int m1397getStrokeTiuSbCo() {
            return PaintingStyle.Stroke;
        }
    }

    public String toString() {
        return m1394toStringimpl(this.value);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m1394toStringimpl(int i) {
        return m1392equalsimpl0(i, Fill) ? "Fill" : m1392equalsimpl0(i, Stroke) ? "Stroke" : "Unknown";
    }
}
