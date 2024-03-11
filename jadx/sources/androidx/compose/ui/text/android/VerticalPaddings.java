package androidx.compose.ui.text.android;

import o.drN;

@drN
/* loaded from: classes.dex */
public final class VerticalPaddings {
    private final long packedValue;

    /* renamed from: constructor-impl  reason: not valid java name */
    public static long m2182constructorimpl(long j) {
        return j;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m2183equalsimpl(long j, Object obj) {
        return (obj instanceof VerticalPaddings) && j == ((VerticalPaddings) obj).m2188unboximpl();
    }

    /* renamed from: getBottomPadding-impl  reason: not valid java name */
    public static final int m2184getBottomPaddingimpl(long j) {
        return (int) (j & 4294967295L);
    }

    /* renamed from: getTopPadding-impl  reason: not valid java name */
    public static final int m2185getTopPaddingimpl(long j) {
        return (int) (j >> 32);
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m2186hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m2187toStringimpl(long j) {
        return "VerticalPaddings(packedValue=" + j + ')';
    }

    public boolean equals(Object obj) {
        return m2183equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m2186hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m2187toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ long m2188unboximpl() {
        return this.packedValue;
    }
}
