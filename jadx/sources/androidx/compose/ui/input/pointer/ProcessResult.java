package androidx.compose.ui.input.pointer;

import o.drN;

@drN
/* loaded from: classes.dex */
public final class ProcessResult {
    private final int value;

    /* renamed from: constructor-impl  reason: not valid java name */
    public static int m1766constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m1767equalsimpl(int i, Object obj) {
        return (obj instanceof ProcessResult) && i == ((ProcessResult) obj).m1772unboximpl();
    }

    /* renamed from: getAnyMovementConsumed-impl  reason: not valid java name */
    public static final boolean m1768getAnyMovementConsumedimpl(int i) {
        return (i & 2) != 0;
    }

    /* renamed from: getDispatchedToAPointerInputModifier-impl  reason: not valid java name */
    public static final boolean m1769getDispatchedToAPointerInputModifierimpl(int i) {
        return (i & 1) != 0;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m1770hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m1771toStringimpl(int i) {
        return "ProcessResult(value=" + i + ')';
    }

    public boolean equals(Object obj) {
        return m1767equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m1770hashCodeimpl(this.value);
    }

    public String toString() {
        return m1771toStringimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m1772unboximpl() {
        return this.value;
    }
}
