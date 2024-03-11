package androidx.compose.ui.input.pointer;

import o.drN;

@drN
/* loaded from: classes.dex */
public final class PointerButtons {
    private final int packedValue;

    /* renamed from: constructor-impl  reason: not valid java name */
    public static int m1691constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m1692equalsimpl(int i, Object obj) {
        return (obj instanceof PointerButtons) && i == ((PointerButtons) obj).m1695unboximpl();
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m1693hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m1694toStringimpl(int i) {
        return "PointerButtons(packedValue=" + i + ')';
    }

    public boolean equals(Object obj) {
        return m1692equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m1693hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m1694toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m1695unboximpl() {
        return this.packedValue;
    }
}
