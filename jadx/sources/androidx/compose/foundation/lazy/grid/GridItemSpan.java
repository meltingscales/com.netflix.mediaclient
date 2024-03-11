package androidx.compose.foundation.lazy.grid;

import o.drN;

@drN
/* loaded from: classes.dex */
public final class GridItemSpan {
    private final long packedValue;

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ GridItemSpan m339boximpl(long j) {
        return new GridItemSpan(j);
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static long m340constructorimpl(long j) {
        return j;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m341equalsimpl(long j, Object obj) {
        return (obj instanceof GridItemSpan) && j == ((GridItemSpan) obj).m345unboximpl();
    }

    /* renamed from: getCurrentLineSpan-impl  reason: not valid java name */
    public static final int m342getCurrentLineSpanimpl(long j) {
        return (int) j;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m343hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m344toStringimpl(long j) {
        return "GridItemSpan(packedValue=" + j + ')';
    }

    public boolean equals(Object obj) {
        return m341equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m343hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m344toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ long m345unboximpl() {
        return this.packedValue;
    }

    private /* synthetic */ GridItemSpan(long j) {
        this.packedValue = j;
    }
}
