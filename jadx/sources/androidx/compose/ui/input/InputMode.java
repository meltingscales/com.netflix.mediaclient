package androidx.compose.ui.input;

import o.C8627dsp;
import o.drN;

@drN
/* loaded from: classes.dex */
public final class InputMode {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Touch = m1615constructorimpl(1);
    private static final int Keyboard = m1615constructorimpl(2);

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ InputMode m1614boximpl(int i) {
        return new InputMode(i);
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static int m1615constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m1616equalsimpl(int i, Object obj) {
        return (obj instanceof InputMode) && i == ((InputMode) obj).m1620unboximpl();
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m1617equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m1618hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    public boolean equals(Object obj) {
        return m1616equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m1618hashCodeimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m1620unboximpl() {
        return this.value;
    }

    private /* synthetic */ InputMode(int i) {
        this.value = i;
    }

    public String toString() {
        return m1619toStringimpl(this.value);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m1619toStringimpl(int i) {
        return m1617equalsimpl0(i, Touch) ? "Touch" : m1617equalsimpl0(i, Keyboard) ? "Keyboard" : "Error";
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        /* renamed from: getTouch-aOaMEAU  reason: not valid java name */
        public final int m1622getTouchaOaMEAU() {
            return InputMode.Touch;
        }

        /* renamed from: getKeyboard-aOaMEAU  reason: not valid java name */
        public final int m1621getKeyboardaOaMEAU() {
            return InputMode.Keyboard;
        }
    }
}
