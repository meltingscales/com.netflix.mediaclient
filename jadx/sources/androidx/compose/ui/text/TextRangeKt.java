package androidx.compose.ui.text;

import o.C8657dts;

/* loaded from: classes.dex */
public final class TextRangeKt {
    public static final long TextRange(int i, int i2) {
        return TextRange.m2146constructorimpl(packWithCheck(i, i2));
    }

    public static final long TextRange(int i) {
        return TextRange(i, i);
    }

    /* renamed from: coerceIn-8ffj60Q  reason: not valid java name */
    public static final long m2163coerceIn8ffj60Q(long j, int i, int i2) {
        int c;
        int c2;
        c = C8657dts.c(TextRange.m2157getStartimpl(j), i, i2);
        c2 = C8657dts.c(TextRange.m2152getEndimpl(j), i, i2);
        return (c == TextRange.m2157getStartimpl(j) && c2 == TextRange.m2152getEndimpl(j)) ? j : TextRange(c, c2);
    }

    private static final long packWithCheck(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException(("start cannot be negative. [start: " + i + ", end: " + i2 + ']').toString());
        } else if (i2 >= 0) {
            return (i2 & 4294967295L) | (i << 32);
        } else {
            throw new IllegalArgumentException(("end cannot be negative. [start: " + i + ", end: " + i2 + ']').toString());
        }
    }
}
