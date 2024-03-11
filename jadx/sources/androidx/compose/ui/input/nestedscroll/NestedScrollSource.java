package androidx.compose.ui.input.nestedscroll;

import o.C8627dsp;
import o.drN;

@drN
/* loaded from: classes.dex */
public final class NestedScrollSource {
    public static final Companion Companion = new Companion(null);
    private static final int Drag = m1674constructorimpl(1);
    private static final int Fling = m1674constructorimpl(2);
    private static final int Relocate = m1674constructorimpl(3);
    private static final int Wheel = m1674constructorimpl(4);
    private final int value;

    /* renamed from: constructor-impl  reason: not valid java name */
    public static int m1674constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m1675equalsimpl(int i, Object obj) {
        return (obj instanceof NestedScrollSource) && i == ((NestedScrollSource) obj).m1679unboximpl();
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m1676equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m1677hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    public boolean equals(Object obj) {
        return m1675equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m1677hashCodeimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m1679unboximpl() {
        return this.value;
    }

    public String toString() {
        return m1678toStringimpl(this.value);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m1678toStringimpl(int i) {
        return m1676equalsimpl0(i, Drag) ? "Drag" : m1676equalsimpl0(i, Fling) ? "Fling" : m1676equalsimpl0(i, Relocate) ? "Relocate" : m1676equalsimpl0(i, Wheel) ? "Wheel" : "Invalid";
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        /* renamed from: getDrag-WNlRxjI  reason: not valid java name */
        public final int m1680getDragWNlRxjI() {
            return NestedScrollSource.Drag;
        }

        /* renamed from: getFling-WNlRxjI  reason: not valid java name */
        public final int m1681getFlingWNlRxjI() {
            return NestedScrollSource.Fling;
        }

        /* renamed from: getWheel-WNlRxjI  reason: not valid java name */
        public final int m1682getWheelWNlRxjI() {
            return NestedScrollSource.Wheel;
        }
    }
}
