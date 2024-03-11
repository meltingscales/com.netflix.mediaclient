package androidx.compose.ui.geometry;

/* loaded from: classes.dex */
public final class SizeKt {
    /* renamed from: toRect-uvyYCjk  reason: not valid java name */
    public static final Rect m1184toRectuvyYCjk(long j) {
        return RectKt.m1162Recttz77jQw(Offset.Companion.m1149getZeroF1C5BW0(), j);
    }

    /* renamed from: getCenter-uvyYCjk  reason: not valid java name */
    public static final long m1183getCenteruvyYCjk(long j) {
        return OffsetKt.Offset(Size.m1176getWidthimpl(j) / 2.0f, Size.m1174getHeightimpl(j) / 2.0f);
    }

    public static final long Size(float f, float f2) {
        return Size.m1171constructorimpl((Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
    }
}
