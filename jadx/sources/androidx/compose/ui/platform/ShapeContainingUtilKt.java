package androidx.compose.ui.platform;

import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRect;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathOperation;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public final class ShapeContainingUtilKt {
    public static final boolean isInOutline(Outline outline, float f, float f2, Path path, Path path2) {
        if (outline instanceof Outline.Rectangle) {
            return isInRectangle(((Outline.Rectangle) outline).getRect(), f, f2);
        }
        if (outline instanceof Outline.Rounded) {
            return isInRoundedRect((Outline.Rounded) outline, f, f2, path, path2);
        }
        if (outline instanceof Outline.Generic) {
            return isInPath(((Outline.Generic) outline).getPath(), f, f2, path, path2);
        }
        throw new NoWhenBranchMatchedException();
    }

    private static final boolean isInRectangle(Rect rect, float f, float f2) {
        return rect.getLeft() <= f && f < rect.getRight() && rect.getTop() <= f2 && f2 < rect.getBottom();
    }

    private static final boolean isInRoundedRect(Outline.Rounded rounded, float f, float f2, Path path, Path path2) {
        RoundRect roundRect = rounded.getRoundRect();
        if (f < roundRect.getLeft() || f >= roundRect.getRight() || f2 < roundRect.getTop() || f2 >= roundRect.getBottom()) {
            return false;
        }
        if (!cornersFit(roundRect)) {
            Path Path = path2 == null ? AndroidPath_androidKt.Path() : path2;
            Path.addRoundRect(roundRect);
            return isInPath(Path, f, f2, path, path2);
        }
        float m1120getXimpl = CornerRadius.m1120getXimpl(roundRect.m1165getTopLeftCornerRadiuskKHJgLs()) + roundRect.getLeft();
        float m1121getYimpl = CornerRadius.m1121getYimpl(roundRect.m1165getTopLeftCornerRadiuskKHJgLs()) + roundRect.getTop();
        float right = roundRect.getRight() - CornerRadius.m1120getXimpl(roundRect.m1166getTopRightCornerRadiuskKHJgLs());
        float m1121getYimpl2 = CornerRadius.m1121getYimpl(roundRect.m1166getTopRightCornerRadiuskKHJgLs()) + roundRect.getTop();
        float right2 = roundRect.getRight() - CornerRadius.m1120getXimpl(roundRect.m1164getBottomRightCornerRadiuskKHJgLs());
        float bottom = roundRect.getBottom() - CornerRadius.m1121getYimpl(roundRect.m1164getBottomRightCornerRadiuskKHJgLs());
        float bottom2 = roundRect.getBottom() - CornerRadius.m1121getYimpl(roundRect.m1163getBottomLeftCornerRadiuskKHJgLs());
        float m1120getXimpl2 = CornerRadius.m1120getXimpl(roundRect.m1163getBottomLeftCornerRadiuskKHJgLs()) + roundRect.getLeft();
        if (f >= m1120getXimpl || f2 >= m1121getYimpl) {
            if (f >= m1120getXimpl2 || f2 <= bottom2) {
                if (f <= right || f2 >= m1121getYimpl2) {
                    if (f <= right2 || f2 <= bottom) {
                        return true;
                    }
                    return m2015isWithinEllipseVE1yxkc(f, f2, roundRect.m1164getBottomRightCornerRadiuskKHJgLs(), right2, bottom);
                }
                return m2015isWithinEllipseVE1yxkc(f, f2, roundRect.m1166getTopRightCornerRadiuskKHJgLs(), right, m1121getYimpl2);
            }
            return m2015isWithinEllipseVE1yxkc(f, f2, roundRect.m1163getBottomLeftCornerRadiuskKHJgLs(), m1120getXimpl2, bottom2);
        }
        return m2015isWithinEllipseVE1yxkc(f, f2, roundRect.m1165getTopLeftCornerRadiuskKHJgLs(), m1120getXimpl, m1121getYimpl);
    }

    private static final boolean cornersFit(RoundRect roundRect) {
        return CornerRadius.m1120getXimpl(roundRect.m1165getTopLeftCornerRadiuskKHJgLs()) + CornerRadius.m1120getXimpl(roundRect.m1166getTopRightCornerRadiuskKHJgLs()) <= roundRect.getWidth() && CornerRadius.m1120getXimpl(roundRect.m1163getBottomLeftCornerRadiuskKHJgLs()) + CornerRadius.m1120getXimpl(roundRect.m1164getBottomRightCornerRadiuskKHJgLs()) <= roundRect.getWidth() && CornerRadius.m1121getYimpl(roundRect.m1165getTopLeftCornerRadiuskKHJgLs()) + CornerRadius.m1121getYimpl(roundRect.m1163getBottomLeftCornerRadiuskKHJgLs()) <= roundRect.getHeight() && CornerRadius.m1121getYimpl(roundRect.m1166getTopRightCornerRadiuskKHJgLs()) + CornerRadius.m1121getYimpl(roundRect.m1164getBottomRightCornerRadiuskKHJgLs()) <= roundRect.getHeight();
    }

    /* renamed from: isWithinEllipse-VE1yxkc  reason: not valid java name */
    private static final boolean m2015isWithinEllipseVE1yxkc(float f, float f2, long j, float f3, float f4) {
        float f5 = f - f3;
        float f6 = f2 - f4;
        float m1120getXimpl = CornerRadius.m1120getXimpl(j);
        float m1121getYimpl = CornerRadius.m1121getYimpl(j);
        return ((f5 * f5) / (m1120getXimpl * m1120getXimpl)) + ((f6 * f6) / (m1121getYimpl * m1121getYimpl)) <= 1.0f;
    }

    private static final boolean isInPath(Path path, float f, float f2, Path path2, Path path3) {
        Rect rect = new Rect(f - 0.005f, f2 - 0.005f, f + 0.005f, f2 + 0.005f);
        if (path2 == null) {
            path2 = AndroidPath_androidKt.Path();
        }
        path2.addRect(rect);
        if (path3 == null) {
            path3 = AndroidPath_androidKt.Path();
        }
        path3.mo1221opN5in7k0(path, path2, PathOperation.Companion.m1414getIntersectb3I0S0c());
        boolean isEmpty = path3.isEmpty();
        path3.reset();
        path2.reset();
        return !isEmpty;
    }
}
