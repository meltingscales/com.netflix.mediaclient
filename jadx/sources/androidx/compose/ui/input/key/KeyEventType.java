package androidx.compose.ui.input.key;

import o.C8627dsp;
import o.drN;

@drN
/* loaded from: classes.dex */
public final class KeyEventType {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Unknown = m1650constructorimpl(0);
    private static final int KeyUp = m1650constructorimpl(1);
    private static final int KeyDown = m1650constructorimpl(2);

    /* renamed from: constructor-impl  reason: not valid java name */
    public static int m1650constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m1651equalsimpl(int i, Object obj) {
        return (obj instanceof KeyEventType) && i == ((KeyEventType) obj).m1655unboximpl();
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m1652equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m1653hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    public boolean equals(Object obj) {
        return m1651equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m1653hashCodeimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m1655unboximpl() {
        return this.value;
    }

    public String toString() {
        return m1654toStringimpl(this.value);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m1654toStringimpl(int i) {
        return m1652equalsimpl0(i, KeyUp) ? "KeyUp" : m1652equalsimpl0(i, KeyDown) ? "KeyDown" : m1652equalsimpl0(i, Unknown) ? "Unknown" : "Invalid";
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        /* renamed from: getUnknown-CS__XNY  reason: not valid java name */
        public final int m1658getUnknownCS__XNY() {
            return KeyEventType.Unknown;
        }

        /* renamed from: getKeyUp-CS__XNY  reason: not valid java name */
        public final int m1657getKeyUpCS__XNY() {
            return KeyEventType.KeyUp;
        }

        /* renamed from: getKeyDown-CS__XNY  reason: not valid java name */
        public final int m1656getKeyDownCS__XNY() {
            return KeyEventType.KeyDown;
        }
    }
}
