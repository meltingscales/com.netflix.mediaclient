package androidx.compose.ui.hapticfeedback;

import o.C8627dsp;
import o.drN;

@drN
/* loaded from: classes.dex */
public final class HapticFeedbackType {
    public static final Companion Companion = new Companion(null);
    private final int value;

    /* renamed from: constructor-impl  reason: not valid java name */
    public static int m1604constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m1605equalsimpl(int i, Object obj) {
        return (obj instanceof HapticFeedbackType) && i == ((HapticFeedbackType) obj).m1609unboximpl();
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m1606equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m1607hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    public boolean equals(Object obj) {
        return m1605equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m1607hashCodeimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m1609unboximpl() {
        return this.value;
    }

    public String toString() {
        return m1608toStringimpl(this.value);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m1608toStringimpl(int i) {
        Companion companion = Companion;
        return m1606equalsimpl0(i, companion.m1610getLongPress5zf0vsI()) ? "LongPress" : m1606equalsimpl0(i, companion.m1611getTextHandleMove5zf0vsI()) ? "TextHandleMove" : "Invalid";
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        /* renamed from: getLongPress-5zf0vsI  reason: not valid java name */
        public final int m1610getLongPress5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m1612getLongPress5zf0vsI();
        }

        /* renamed from: getTextHandleMove-5zf0vsI  reason: not valid java name */
        public final int m1611getTextHandleMove5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m1613getTextHandleMove5zf0vsI();
        }
    }
}
