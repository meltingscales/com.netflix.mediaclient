package androidx.compose.ui.input.pointer;

import o.drN;

@drN
/* loaded from: classes.dex */
public final class PointerId {
    private final long value;

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ PointerId m1716boximpl(long j) {
        return new PointerId(j);
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static long m1717constructorimpl(long j) {
        return j;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m1718equalsimpl(long j, Object obj) {
        return (obj instanceof PointerId) && j == ((PointerId) obj).m1722unboximpl();
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m1719equalsimpl0(long j, long j2) {
        return j == j2;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m1720hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m1721toStringimpl(long j) {
        return "PointerId(value=" + j + ')';
    }

    public boolean equals(Object obj) {
        return m1718equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m1720hashCodeimpl(this.value);
    }

    public String toString() {
        return m1721toStringimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ long m1722unboximpl() {
        return this.value;
    }

    private /* synthetic */ PointerId(long j) {
        this.value = j;
    }
}
