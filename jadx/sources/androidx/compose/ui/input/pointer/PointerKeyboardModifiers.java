package androidx.compose.ui.input.pointer;

import o.drN;

@drN
/* loaded from: classes.dex */
public final class PointerKeyboardModifiers {
    private final int packedValue;

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ PointerKeyboardModifiers m1746boximpl(int i) {
        return new PointerKeyboardModifiers(i);
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static int m1747constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m1748equalsimpl(int i, Object obj) {
        return (obj instanceof PointerKeyboardModifiers) && i == ((PointerKeyboardModifiers) obj).m1751unboximpl();
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m1749hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m1750toStringimpl(int i) {
        return "PointerKeyboardModifiers(packedValue=" + i + ')';
    }

    public boolean equals(Object obj) {
        return m1748equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m1749hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m1750toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m1751unboximpl() {
        return this.packedValue;
    }

    private /* synthetic */ PointerKeyboardModifiers(int i) {
        this.packedValue = i;
    }
}
