package androidx.compose.ui.node;

import o.drN;

@drN
/* loaded from: classes.dex */
public final class NodeKind<T> {
    private final int mask;

    /* renamed from: constructor-impl  reason: not valid java name */
    public static <T> int m1935constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m1936equalsimpl(int i, Object obj) {
        return (obj instanceof NodeKind) && i == ((NodeKind) obj).m1939unboximpl();
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m1937hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m1938toStringimpl(int i) {
        return "NodeKind(mask=" + i + ')';
    }

    public boolean equals(Object obj) {
        return m1936equalsimpl(this.mask, obj);
    }

    public int hashCode() {
        return m1937hashCodeimpl(this.mask);
    }

    public String toString() {
        return m1938toStringimpl(this.mask);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m1939unboximpl() {
        return this.mask;
    }
}
