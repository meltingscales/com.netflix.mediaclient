package androidx.compose.ui.input.pointer;

import o.C8627dsp;
import o.drN;

@drN
/* loaded from: classes.dex */
public final class PointerType {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Unknown = m1752constructorimpl(0);
    private static final int Touch = m1752constructorimpl(1);
    private static final int Mouse = m1752constructorimpl(2);
    private static final int Stylus = m1752constructorimpl(3);
    private static final int Eraser = m1752constructorimpl(4);

    /* renamed from: constructor-impl  reason: not valid java name */
    private static int m1752constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m1753equalsimpl(int i, Object obj) {
        return (obj instanceof PointerType) && i == ((PointerType) obj).m1757unboximpl();
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m1754equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m1755hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m1756toStringimpl(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "Unknown" : "Eraser" : "Stylus" : "Mouse" : "Touch";
    }

    public boolean equals(Object obj) {
        return m1753equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m1755hashCodeimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m1757unboximpl() {
        return this.value;
    }

    public String toString() {
        return m1756toStringimpl(this.value);
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        /* renamed from: getUnknown-T8wyACA  reason: not valid java name */
        public final int m1762getUnknownT8wyACA() {
            return PointerType.Unknown;
        }

        /* renamed from: getTouch-T8wyACA  reason: not valid java name */
        public final int m1761getTouchT8wyACA() {
            return PointerType.Touch;
        }

        /* renamed from: getMouse-T8wyACA  reason: not valid java name */
        public final int m1759getMouseT8wyACA() {
            return PointerType.Mouse;
        }

        /* renamed from: getStylus-T8wyACA  reason: not valid java name */
        public final int m1760getStylusT8wyACA() {
            return PointerType.Stylus;
        }

        /* renamed from: getEraser-T8wyACA  reason: not valid java name */
        public final int m1758getEraserT8wyACA() {
            return PointerType.Eraser;
        }
    }
}
