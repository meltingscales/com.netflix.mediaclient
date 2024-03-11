package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.CornerRadiusKt;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRect;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.Fill;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public final class OutlineKt {
    /* renamed from: drawOutline-hn5TExg$default */
    public static /* synthetic */ void m1387drawOutlinehn5TExg$default(DrawScope drawScope, Outline outline, Brush brush, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            f = 1.0f;
        }
        float f2 = f;
        if ((i2 & 8) != 0) {
            drawStyle = Fill.INSTANCE;
        }
        DrawStyle drawStyle2 = drawStyle;
        if ((i2 & 16) != 0) {
            colorFilter = null;
        }
        ColorFilter colorFilter2 = colorFilter;
        if ((i2 & 32) != 0) {
            i = DrawScope.Companion.m1563getDefaultBlendMode0nO6VwU();
        }
        m1386drawOutlinehn5TExg(drawScope, outline, brush, f2, drawStyle2, colorFilter2, i);
    }

    private static final long topLeft(Rect rect) {
        return OffsetKt.Offset(rect.getLeft(), rect.getTop());
    }

    private static final long size(Rect rect) {
        return SizeKt.Size(rect.getWidth(), rect.getHeight());
    }

    private static final long topLeft(RoundRect roundRect) {
        return OffsetKt.Offset(roundRect.getLeft(), roundRect.getTop());
    }

    private static final long size(RoundRect roundRect) {
        return SizeKt.Size(roundRect.getWidth(), roundRect.getHeight());
    }

    public static final boolean hasSameCornerRadius(RoundRect roundRect) {
        return ((CornerRadius.m1120getXimpl(roundRect.m1163getBottomLeftCornerRadiuskKHJgLs()) > CornerRadius.m1120getXimpl(roundRect.m1164getBottomRightCornerRadiuskKHJgLs()) ? 1 : (CornerRadius.m1120getXimpl(roundRect.m1163getBottomLeftCornerRadiuskKHJgLs()) == CornerRadius.m1120getXimpl(roundRect.m1164getBottomRightCornerRadiuskKHJgLs()) ? 0 : -1)) == 0 && (CornerRadius.m1120getXimpl(roundRect.m1164getBottomRightCornerRadiuskKHJgLs()) > CornerRadius.m1120getXimpl(roundRect.m1166getTopRightCornerRadiuskKHJgLs()) ? 1 : (CornerRadius.m1120getXimpl(roundRect.m1164getBottomRightCornerRadiuskKHJgLs()) == CornerRadius.m1120getXimpl(roundRect.m1166getTopRightCornerRadiuskKHJgLs()) ? 0 : -1)) == 0 && (CornerRadius.m1120getXimpl(roundRect.m1166getTopRightCornerRadiuskKHJgLs()) > CornerRadius.m1120getXimpl(roundRect.m1165getTopLeftCornerRadiuskKHJgLs()) ? 1 : (CornerRadius.m1120getXimpl(roundRect.m1166getTopRightCornerRadiuskKHJgLs()) == CornerRadius.m1120getXimpl(roundRect.m1165getTopLeftCornerRadiuskKHJgLs()) ? 0 : -1)) == 0) && ((CornerRadius.m1121getYimpl(roundRect.m1163getBottomLeftCornerRadiuskKHJgLs()) > CornerRadius.m1121getYimpl(roundRect.m1164getBottomRightCornerRadiuskKHJgLs()) ? 1 : (CornerRadius.m1121getYimpl(roundRect.m1163getBottomLeftCornerRadiuskKHJgLs()) == CornerRadius.m1121getYimpl(roundRect.m1164getBottomRightCornerRadiuskKHJgLs()) ? 0 : -1)) == 0 && (CornerRadius.m1121getYimpl(roundRect.m1164getBottomRightCornerRadiuskKHJgLs()) > CornerRadius.m1121getYimpl(roundRect.m1166getTopRightCornerRadiuskKHJgLs()) ? 1 : (CornerRadius.m1121getYimpl(roundRect.m1164getBottomRightCornerRadiuskKHJgLs()) == CornerRadius.m1121getYimpl(roundRect.m1166getTopRightCornerRadiuskKHJgLs()) ? 0 : -1)) == 0 && (CornerRadius.m1121getYimpl(roundRect.m1166getTopRightCornerRadiuskKHJgLs()) > CornerRadius.m1121getYimpl(roundRect.m1165getTopLeftCornerRadiuskKHJgLs()) ? 1 : (CornerRadius.m1121getYimpl(roundRect.m1166getTopRightCornerRadiuskKHJgLs()) == CornerRadius.m1121getYimpl(roundRect.m1165getTopLeftCornerRadiuskKHJgLs()) ? 0 : -1)) == 0);
    }

    /* renamed from: drawOutline-wDX37Ww */
    public static final void m1388drawOutlinewDX37Ww(DrawScope drawScope, Outline outline, long j, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i) {
        Path path;
        if (outline instanceof Outline.Rectangle) {
            Rect rect = ((Outline.Rectangle) outline).getRect();
            drawScope.mo1532drawRectnJ9OG0(j, topLeft(rect), size(rect), f, drawStyle, colorFilter, i);
            return;
        }
        if (outline instanceof Outline.Rounded) {
            Outline.Rounded rounded = (Outline.Rounded) outline;
            path = rounded.getRoundRectPath$ui_graphics_release();
            if (path == null) {
                RoundRect roundRect = rounded.getRoundRect();
                drawScope.mo1534drawRoundRectuAw5IA(j, topLeft(roundRect), size(roundRect), CornerRadiusKt.CornerRadius$default(CornerRadius.m1120getXimpl(roundRect.m1163getBottomLeftCornerRadiuskKHJgLs()), 0.0f, 2, null), drawStyle, f, colorFilter, i);
                return;
            }
        } else if (!(outline instanceof Outline.Generic)) {
            throw new NoWhenBranchMatchedException();
        } else {
            path = ((Outline.Generic) outline).getPath();
        }
        drawScope.mo1529drawPathLG529CI(path, j, f, drawStyle, colorFilter, i);
    }

    /* renamed from: drawOutline-hn5TExg */
    public static final void m1386drawOutlinehn5TExg(DrawScope drawScope, Outline outline, Brush brush, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i) {
        Path path;
        if (outline instanceof Outline.Rectangle) {
            Rect rect = ((Outline.Rectangle) outline).getRect();
            drawScope.mo1531drawRectAsUm42w(brush, topLeft(rect), size(rect), f, drawStyle, colorFilter, i);
            return;
        }
        if (outline instanceof Outline.Rounded) {
            Outline.Rounded rounded = (Outline.Rounded) outline;
            path = rounded.getRoundRectPath$ui_graphics_release();
            if (path == null) {
                RoundRect roundRect = rounded.getRoundRect();
                drawScope.mo1533drawRoundRectZuiqVtQ(brush, topLeft(roundRect), size(roundRect), CornerRadiusKt.CornerRadius$default(CornerRadius.m1120getXimpl(roundRect.m1163getBottomLeftCornerRadiuskKHJgLs()), 0.0f, 2, null), f, drawStyle, colorFilter, i);
                return;
            }
        } else if (!(outline instanceof Outline.Generic)) {
            throw new NoWhenBranchMatchedException();
        } else {
            path = ((Outline.Generic) outline).getPath();
        }
        drawScope.mo1528drawPathGBMwjPU(path, brush, f, drawStyle, colorFilter, i);
    }
}
