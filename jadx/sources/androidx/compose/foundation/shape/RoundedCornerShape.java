package androidx.compose.foundation.shape;

import androidx.compose.ui.geometry.CornerRadiusKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRectKt;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.unit.LayoutDirection;
import o.C8632dsu;

/* loaded from: classes.dex */
public final class RoundedCornerShape extends CornerBasedShape {
    public RoundedCornerShape(CornerSize cornerSize, CornerSize cornerSize2, CornerSize cornerSize3, CornerSize cornerSize4) {
        super(cornerSize, cornerSize2, cornerSize3, cornerSize4);
    }

    @Override // androidx.compose.foundation.shape.CornerBasedShape
    /* renamed from: createOutline-LjSzlW0 */
    public Outline mo396createOutlineLjSzlW0(long j, float f, float f2, float f3, float f4, LayoutDirection layoutDirection) {
        if (f + f2 + f3 + f4 == 0.0f) {
            return new Outline.Rectangle(SizeKt.m1184toRectuvyYCjk(j));
        }
        Rect m1184toRectuvyYCjk = SizeKt.m1184toRectuvyYCjk(j);
        LayoutDirection layoutDirection2 = LayoutDirection.Ltr;
        return new Outline.Rounded(RoundRectKt.m1167RoundRectZAM2FJo(m1184toRectuvyYCjk, CornerRadiusKt.CornerRadius$default(layoutDirection == layoutDirection2 ? f : f2, 0.0f, 2, null), CornerRadiusKt.CornerRadius$default(layoutDirection == layoutDirection2 ? f2 : f, 0.0f, 2, null), CornerRadiusKt.CornerRadius$default(layoutDirection == layoutDirection2 ? f3 : f4, 0.0f, 2, null), CornerRadiusKt.CornerRadius$default(layoutDirection == layoutDirection2 ? f4 : f3, 0.0f, 2, null)));
    }

    @Override // androidx.compose.foundation.shape.CornerBasedShape
    public RoundedCornerShape copy(CornerSize cornerSize, CornerSize cornerSize2, CornerSize cornerSize3, CornerSize cornerSize4) {
        return new RoundedCornerShape(cornerSize, cornerSize2, cornerSize3, cornerSize4);
    }

    public String toString() {
        return "RoundedCornerShape(topStart = " + getTopStart() + ", topEnd = " + getTopEnd() + ", bottomEnd = " + getBottomEnd() + ", bottomStart = " + getBottomStart() + ')';
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RoundedCornerShape) {
            RoundedCornerShape roundedCornerShape = (RoundedCornerShape) obj;
            return C8632dsu.c(getTopStart(), roundedCornerShape.getTopStart()) && C8632dsu.c(getTopEnd(), roundedCornerShape.getTopEnd()) && C8632dsu.c(getBottomEnd(), roundedCornerShape.getBottomEnd()) && C8632dsu.c(getBottomStart(), roundedCornerShape.getBottomStart());
        }
        return false;
    }

    public int hashCode() {
        int hashCode = getTopStart().hashCode();
        return (((((hashCode * 31) + getTopEnd().hashCode()) * 31) + getBottomEnd().hashCode()) * 31) + getBottomStart().hashCode();
    }
}
