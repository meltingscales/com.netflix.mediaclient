package androidx.compose.ui.graphics;

import o.C8627dsp;
import o.drN;

@drN
/* loaded from: classes.dex */
public final class TileMode {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Clamp = m1460constructorimpl(0);
    private static final int Repeated = m1460constructorimpl(1);
    private static final int Mirror = m1460constructorimpl(2);
    private static final int Decal = m1460constructorimpl(3);

    /* renamed from: constructor-impl  reason: not valid java name */
    public static int m1460constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m1461equalsimpl(int i, Object obj) {
        return (obj instanceof TileMode) && i == ((TileMode) obj).m1465unboximpl();
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m1462equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m1463hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    public boolean equals(Object obj) {
        return m1461equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m1463hashCodeimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m1465unboximpl() {
        return this.value;
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        /* renamed from: getClamp-3opZhB0  reason: not valid java name */
        public final int m1466getClamp3opZhB0() {
            return TileMode.Clamp;
        }

        /* renamed from: getRepeated-3opZhB0  reason: not valid java name */
        public final int m1469getRepeated3opZhB0() {
            return TileMode.Repeated;
        }

        /* renamed from: getMirror-3opZhB0  reason: not valid java name */
        public final int m1468getMirror3opZhB0() {
            return TileMode.Mirror;
        }

        /* renamed from: getDecal-3opZhB0  reason: not valid java name */
        public final int m1467getDecal3opZhB0() {
            return TileMode.Decal;
        }
    }

    public String toString() {
        return m1464toStringimpl(this.value);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m1464toStringimpl(int i) {
        return m1462equalsimpl0(i, Clamp) ? "Clamp" : m1462equalsimpl0(i, Repeated) ? "Repeated" : m1462equalsimpl0(i, Mirror) ? "Mirror" : m1462equalsimpl0(i, Decal) ? "Decal" : "Unknown";
    }
}
