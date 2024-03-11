package androidx.compose.ui.geometry;

/* loaded from: classes.dex */
public final class RoundRectKt {
    public static final RoundRect RoundRect(float f, float f2, float f3, float f4, float f5, float f6) {
        long CornerRadius = CornerRadiusKt.CornerRadius(f5, f6);
        return new RoundRect(f, f2, f3, f4, CornerRadius, CornerRadius, CornerRadius, CornerRadius, null);
    }

    /* renamed from: RoundRect-gG7oq9Y  reason: not valid java name */
    public static final RoundRect m1168RoundRectgG7oq9Y(float f, float f2, float f3, float f4, long j) {
        return RoundRect(f, f2, f3, f4, CornerRadius.m1120getXimpl(j), CornerRadius.m1121getYimpl(j));
    }

    public static final RoundRect RoundRect(Rect rect, float f, float f2) {
        return RoundRect(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom(), f, f2);
    }

    /* renamed from: RoundRect-sniSvfs  reason: not valid java name */
    public static final RoundRect m1169RoundRectsniSvfs(Rect rect, long j) {
        return RoundRect(rect, CornerRadius.m1120getXimpl(j), CornerRadius.m1121getYimpl(j));
    }

    /* renamed from: RoundRect-ZAM2FJo  reason: not valid java name */
    public static final RoundRect m1167RoundRectZAM2FJo(Rect rect, long j, long j2, long j3, long j4) {
        return new RoundRect(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom(), j, j2, j3, j4, null);
    }

    public static final boolean isSimple(RoundRect roundRect) {
        return CornerRadius.m1120getXimpl(roundRect.m1165getTopLeftCornerRadiuskKHJgLs()) == CornerRadius.m1121getYimpl(roundRect.m1165getTopLeftCornerRadiuskKHJgLs()) && CornerRadius.m1120getXimpl(roundRect.m1165getTopLeftCornerRadiuskKHJgLs()) == CornerRadius.m1120getXimpl(roundRect.m1166getTopRightCornerRadiuskKHJgLs()) && CornerRadius.m1120getXimpl(roundRect.m1165getTopLeftCornerRadiuskKHJgLs()) == CornerRadius.m1121getYimpl(roundRect.m1166getTopRightCornerRadiuskKHJgLs()) && CornerRadius.m1120getXimpl(roundRect.m1165getTopLeftCornerRadiuskKHJgLs()) == CornerRadius.m1120getXimpl(roundRect.m1164getBottomRightCornerRadiuskKHJgLs()) && CornerRadius.m1120getXimpl(roundRect.m1165getTopLeftCornerRadiuskKHJgLs()) == CornerRadius.m1121getYimpl(roundRect.m1164getBottomRightCornerRadiuskKHJgLs()) && CornerRadius.m1120getXimpl(roundRect.m1165getTopLeftCornerRadiuskKHJgLs()) == CornerRadius.m1120getXimpl(roundRect.m1163getBottomLeftCornerRadiuskKHJgLs()) && CornerRadius.m1120getXimpl(roundRect.m1165getTopLeftCornerRadiuskKHJgLs()) == CornerRadius.m1121getYimpl(roundRect.m1163getBottomLeftCornerRadiuskKHJgLs());
    }
}
