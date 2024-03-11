package androidx.compose.ui.graphics;

import o.C8627dsp;
import o.drN;

@drN
/* loaded from: classes.dex */
public final class PointMode {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Points = m1417constructorimpl(0);
    private static final int Lines = m1417constructorimpl(1);
    private static final int Polygon = m1417constructorimpl(2);

    /* renamed from: constructor-impl  reason: not valid java name */
    public static int m1417constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m1418equalsimpl(int i, Object obj) {
        return (obj instanceof PointMode) && i == ((PointMode) obj).m1422unboximpl();
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m1419equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m1420hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    public boolean equals(Object obj) {
        return m1418equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m1420hashCodeimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m1422unboximpl() {
        return this.value;
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        /* renamed from: getPoints-r_lszbg  reason: not valid java name */
        public final int m1424getPointsr_lszbg() {
            return PointMode.Points;
        }

        /* renamed from: getLines-r_lszbg  reason: not valid java name */
        public final int m1423getLinesr_lszbg() {
            return PointMode.Lines;
        }

        /* renamed from: getPolygon-r_lszbg  reason: not valid java name */
        public final int m1425getPolygonr_lszbg() {
            return PointMode.Polygon;
        }
    }

    public String toString() {
        return m1421toStringimpl(this.value);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m1421toStringimpl(int i) {
        return m1419equalsimpl0(i, Points) ? "Points" : m1419equalsimpl0(i, Lines) ? "Lines" : m1419equalsimpl0(i, Polygon) ? "Polygon" : "Unknown";
    }
}
