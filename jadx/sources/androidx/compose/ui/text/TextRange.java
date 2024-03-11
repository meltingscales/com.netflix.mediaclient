package androidx.compose.ui.text;

import o.C8627dsp;
import o.drN;

@drN
/* loaded from: classes.dex */
public final class TextRange {
    public static final Companion Companion = new Companion(null);
    private static final long Zero = TextRangeKt.TextRange(0);
    private final long packedValue;

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ TextRange m2145boximpl(long j) {
        return new TextRange(j);
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static long m2146constructorimpl(long j) {
        return j;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m2149equalsimpl(long j, Object obj) {
        return (obj instanceof TextRange) && j == ((TextRange) obj).m2161unboximpl();
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m2150equalsimpl0(long j, long j2) {
        return j == j2;
    }

    /* renamed from: getEnd-impl  reason: not valid java name */
    public static final int m2152getEndimpl(long j) {
        return (int) (j & 4294967295L);
    }

    /* renamed from: getStart-impl  reason: not valid java name */
    public static final int m2157getStartimpl(long j) {
        return (int) (j >> 32);
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m2158hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    public boolean equals(Object obj) {
        return m2149equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m2158hashCodeimpl(this.packedValue);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ long m2161unboximpl() {
        return this.packedValue;
    }

    private /* synthetic */ TextRange(long j) {
        this.packedValue = j;
    }

    /* renamed from: getMin-impl  reason: not valid java name */
    public static final int m2155getMinimpl(long j) {
        return m2157getStartimpl(j) > m2152getEndimpl(j) ? m2152getEndimpl(j) : m2157getStartimpl(j);
    }

    /* renamed from: getMax-impl  reason: not valid java name */
    public static final int m2154getMaximpl(long j) {
        return m2157getStartimpl(j) > m2152getEndimpl(j) ? m2157getStartimpl(j) : m2152getEndimpl(j);
    }

    /* renamed from: getCollapsed-impl  reason: not valid java name */
    public static final boolean m2151getCollapsedimpl(long j) {
        return m2157getStartimpl(j) == m2152getEndimpl(j);
    }

    /* renamed from: getReversed-impl  reason: not valid java name */
    public static final boolean m2156getReversedimpl(long j) {
        return m2157getStartimpl(j) > m2152getEndimpl(j);
    }

    /* renamed from: getLength-impl  reason: not valid java name */
    public static final int m2153getLengthimpl(long j) {
        return m2154getMaximpl(j) - m2155getMinimpl(j);
    }

    /* renamed from: intersects-5zc-tL8  reason: not valid java name */
    public static final boolean m2159intersects5zctL8(long j, long j2) {
        return m2155getMinimpl(j) < m2154getMaximpl(j2) && m2155getMinimpl(j2) < m2154getMaximpl(j);
    }

    /* renamed from: contains-5zc-tL8  reason: not valid java name */
    public static final boolean m2147contains5zctL8(long j, long j2) {
        return m2155getMinimpl(j) <= m2155getMinimpl(j2) && m2154getMaximpl(j2) <= m2154getMaximpl(j);
    }

    /* renamed from: contains-impl  reason: not valid java name */
    public static final boolean m2148containsimpl(long j, int i) {
        return i < m2154getMaximpl(j) && m2155getMinimpl(j) <= i;
    }

    public String toString() {
        return m2160toStringimpl(this.packedValue);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m2160toStringimpl(long j) {
        return "TextRange(" + m2157getStartimpl(j) + ", " + m2152getEndimpl(j) + ')';
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        /* renamed from: getZero-d9O1mEE  reason: not valid java name */
        public final long m2162getZerod9O1mEE() {
            return TextRange.Zero;
        }
    }
}
