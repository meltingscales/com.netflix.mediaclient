package androidx.compose.foundation;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.OutlineKt;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.unit.LayoutDirection;
import o.C8627dsp;
import o.C8632dsu;

/* loaded from: classes.dex */
final class BackgroundNode extends Modifier.Node implements DrawModifierNode {
    private float alpha;
    private Brush brush;
    private long color;
    private LayoutDirection lastLayoutDirection;
    private Outline lastOutline;
    private Shape lastShape;
    private Size lastSize;
    private Shape shape;

    public /* synthetic */ BackgroundNode(long j, Brush brush, float f, Shape shape, C8627dsp c8627dsp) {
        this(j, brush, f, shape);
    }

    public final void setAlpha(float f) {
        this.alpha = f;
    }

    public final void setBrush(Brush brush) {
        this.brush = brush;
    }

    /* renamed from: setColor-8_81llA  reason: not valid java name */
    public final void m111setColor8_81llA(long j) {
        this.color = j;
    }

    public final void setShape(Shape shape) {
        this.shape = shape;
    }

    private BackgroundNode(long j, Brush brush, float f, Shape shape) {
        this.color = j;
        this.brush = brush;
        this.alpha = f;
        this.shape = shape;
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public void draw(ContentDrawScope contentDrawScope) {
        if (this.shape == RectangleShapeKt.getRectangleShape()) {
            drawRect(contentDrawScope);
        } else {
            drawOutline(contentDrawScope);
        }
        contentDrawScope.drawContent();
    }

    private final void drawRect(ContentDrawScope contentDrawScope) {
        if (!Color.m1294equalsimpl0(this.color, Color.Companion.m1309getUnspecified0d7_KjU())) {
            DrawScope.m1557drawRectnJ9OG0$default(contentDrawScope, this.color, 0L, 0L, 0.0f, null, null, 0, 126, null);
        }
        Brush brush = this.brush;
        if (brush != null) {
            DrawScope.m1556drawRectAsUm42w$default(contentDrawScope, brush, 0L, 0L, this.alpha, null, null, 0, 118, null);
        }
    }

    private final void drawOutline(ContentDrawScope contentDrawScope) {
        Outline mo139createOutlinePq9zytI;
        if (Size.m1172equalsimpl(contentDrawScope.mo1562getSizeNHjbRc(), this.lastSize) && contentDrawScope.getLayoutDirection() == this.lastLayoutDirection && C8632dsu.c(this.lastShape, this.shape)) {
            mo139createOutlinePq9zytI = this.lastOutline;
            C8632dsu.d(mo139createOutlinePq9zytI);
        } else {
            mo139createOutlinePq9zytI = this.shape.mo139createOutlinePq9zytI(contentDrawScope.mo1562getSizeNHjbRc(), contentDrawScope.getLayoutDirection(), contentDrawScope);
        }
        if (!Color.m1294equalsimpl0(this.color, Color.Companion.m1309getUnspecified0d7_KjU())) {
            OutlineKt.m1388drawOutlinewDX37Ww(contentDrawScope, mo139createOutlinePq9zytI, this.color, (r17 & 4) != 0 ? 1.0f : 0.0f, (r17 & 8) != 0 ? Fill.INSTANCE : null, (r17 & 16) != 0 ? null : null, (r17 & 32) != 0 ? DrawScope.Companion.m1563getDefaultBlendMode0nO6VwU() : 0);
        }
        Brush brush = this.brush;
        if (brush != null) {
            OutlineKt.m1387drawOutlinehn5TExg$default(contentDrawScope, mo139createOutlinePq9zytI, brush, this.alpha, null, null, 0, 56, null);
        }
        this.lastOutline = mo139createOutlinePq9zytI;
        this.lastSize = Size.m1170boximpl(contentDrawScope.mo1562getSizeNHjbRc());
        this.lastLayoutDirection = contentDrawScope.getLayoutDirection();
        this.lastShape = this.shape;
    }
}
