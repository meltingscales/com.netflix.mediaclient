package androidx.compose.ui.unit;

import androidx.compose.ui.geometry.SizeKt;

/* loaded from: classes.dex */
public final class IntSizeKt {
    public static final long IntSize(int i, int i2) {
        return IntSize.m2543constructorimpl((i2 & 4294967295L) | (i << 32));
    }

    /* renamed from: getCenter-ozmzZPI  reason: not valid java name */
    public static final long m2552getCenterozmzZPI(long j) {
        return IntOffsetKt.IntOffset(IntSize.m2547getWidthimpl(j) / 2, IntSize.m2546getHeightimpl(j) / 2);
    }

    /* renamed from: toSize-ozmzZPI  reason: not valid java name */
    public static final long m2553toSizeozmzZPI(long j) {
        return SizeKt.Size(IntSize.m2547getWidthimpl(j), IntSize.m2546getHeightimpl(j));
    }
}
