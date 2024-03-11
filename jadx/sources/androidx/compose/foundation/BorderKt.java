package androidx.compose.foundation;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.draw.DrawResult;
import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.CornerRadiusKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.RoundRect;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathOperation;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.graphics.drawscope.Stroke;
import o.dpR;
import o.drM;

/* loaded from: classes.dex */
public final class BorderKt {
    public static final Modifier border(Modifier modifier, BorderStroke borderStroke, Shape shape) {
        return m116borderziNgDLE(modifier, borderStroke.m123getWidthD9Ej5fM(), borderStroke.getBrush(), shape);
    }

    /* renamed from: border-xT4_qwU$default  reason: not valid java name */
    public static /* synthetic */ Modifier m115borderxT4_qwU$default(Modifier modifier, float f, long j, Shape shape, int i, Object obj) {
        if ((i & 4) != 0) {
            shape = RectangleShapeKt.getRectangleShape();
        }
        return m114borderxT4_qwU(modifier, f, j, shape);
    }

    /* renamed from: border-xT4_qwU  reason: not valid java name */
    public static final Modifier m114borderxT4_qwU(Modifier modifier, float f, long j, Shape shape) {
        return m116borderziNgDLE(modifier, f, new SolidColor(j, null), shape);
    }

    /* renamed from: border-ziNgDLE  reason: not valid java name */
    public static final Modifier m116borderziNgDLE(Modifier modifier, float f, Brush brush, Shape shape) {
        return modifier.then(new BorderModifierNodeElement(f, brush, shape, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DrawResult drawContentWithoutBorder(CacheDrawScope cacheDrawScope) {
        return cacheDrawScope.onDrawWithContent(new drM<ContentDrawScope, dpR>() { // from class: androidx.compose.foundation.BorderKt$drawContentWithoutBorder$1
            @Override // o.drM
            public /* bridge */ /* synthetic */ dpR invoke(ContentDrawScope contentDrawScope) {
                invoke2(contentDrawScope);
                return dpR.c;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(ContentDrawScope contentDrawScope) {
                contentDrawScope.drawContent();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: drawRectBorder-NsqcLGU  reason: not valid java name */
    public static final DrawResult m117drawRectBorderNsqcLGU(CacheDrawScope cacheDrawScope, final Brush brush, long j, long j2, boolean z, float f) {
        final long m1149getZeroF1C5BW0 = z ? Offset.Companion.m1149getZeroF1C5BW0() : j;
        final long m1067getSizeNHjbRc = z ? cacheDrawScope.m1067getSizeNHjbRc() : j2;
        final DrawStyle stroke = z ? Fill.INSTANCE : new Stroke(f, 0.0f, 0, 0, null, 30, null);
        return cacheDrawScope.onDrawWithContent(new drM<ContentDrawScope, dpR>() { // from class: androidx.compose.foundation.BorderKt$drawRectBorder$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* bridge */ /* synthetic */ dpR invoke(ContentDrawScope contentDrawScope) {
                invoke2(contentDrawScope);
                return dpR.c;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(ContentDrawScope contentDrawScope) {
                contentDrawScope.drawContent();
                DrawScope.m1556drawRectAsUm42w$default(contentDrawScope, Brush.this, m1149getZeroF1C5BW0, m1067getSizeNHjbRc, 0.0f, stroke, null, 0, 104, null);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Path createRoundRectPath(Path path, RoundRect roundRect, float f, boolean z) {
        path.reset();
        path.addRoundRect(roundRect);
        if (!z) {
            Path Path = AndroidPath_androidKt.Path();
            Path.addRoundRect(createInsetRoundedRect(f, roundRect));
            path.mo1221opN5in7k0(path, Path, PathOperation.Companion.m1413getDifferenceb3I0S0c());
        }
        return path;
    }

    private static final RoundRect createInsetRoundedRect(float f, RoundRect roundRect) {
        float width = roundRect.getWidth();
        float height = roundRect.getHeight();
        long m118shrinkKibmq7A = m118shrinkKibmq7A(roundRect.m1165getTopLeftCornerRadiuskKHJgLs(), f);
        long m118shrinkKibmq7A2 = m118shrinkKibmq7A(roundRect.m1166getTopRightCornerRadiuskKHJgLs(), f);
        long m118shrinkKibmq7A3 = m118shrinkKibmq7A(roundRect.m1163getBottomLeftCornerRadiuskKHJgLs(), f);
        return new RoundRect(f, f, width - f, height - f, m118shrinkKibmq7A, m118shrinkKibmq7A2, m118shrinkKibmq7A(roundRect.m1164getBottomRightCornerRadiuskKHJgLs(), f), m118shrinkKibmq7A3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: shrink-Kibmq7A  reason: not valid java name */
    public static final long m118shrinkKibmq7A(long j, float f) {
        return CornerRadiusKt.CornerRadius(Math.max(0.0f, CornerRadius.m1120getXimpl(j) - f), Math.max(0.0f, CornerRadius.m1121getYimpl(j) - f));
    }
}
