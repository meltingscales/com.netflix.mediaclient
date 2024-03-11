package androidx.compose.ui.draganddrop;

import android.graphics.Canvas;
import android.graphics.Point;
import android.view.View;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import o.C8627dsp;
import o.dpR;
import o.drM;

/* loaded from: classes.dex */
public final class ComposeDragShadowBuilder extends View.DragShadowBuilder {
    private final long decorationSize;
    private final Density density;
    private final drM<DrawScope, dpR> drawDragDecoration;

    public /* synthetic */ ComposeDragShadowBuilder(Density density, long j, drM drm, C8627dsp c8627dsp) {
        this(density, j, drm);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private ComposeDragShadowBuilder(Density density, long j, drM<? super DrawScope, dpR> drm) {
        this.density = density;
        this.decorationSize = j;
        this.drawDragDecoration = drm;
    }

    @Override // android.view.View.DragShadowBuilder
    public void onProvideShadowMetrics(Point point, Point point2) {
        Density density = this.density;
        point.set(density.mo187roundToPx0680j_4(density.mo189toDpu2uoSUM(Size.m1176getWidthimpl(this.decorationSize))), density.mo187roundToPx0680j_4(density.mo189toDpu2uoSUM(Size.m1174getHeightimpl(this.decorationSize))));
        point2.set(point.x / 2, point.y / 2);
    }

    @Override // android.view.View.DragShadowBuilder
    public void onDrawShadow(Canvas canvas) {
        CanvasDrawScope canvasDrawScope = new CanvasDrawScope();
        Density density = this.density;
        long j = this.decorationSize;
        LayoutDirection layoutDirection = LayoutDirection.Ltr;
        androidx.compose.ui.graphics.Canvas Canvas = AndroidCanvas_androidKt.Canvas(canvas);
        drM<DrawScope, dpR> drm = this.drawDragDecoration;
        CanvasDrawScope.DrawParams drawParams = canvasDrawScope.getDrawParams();
        Density component1 = drawParams.component1();
        LayoutDirection component2 = drawParams.component2();
        androidx.compose.ui.graphics.Canvas component3 = drawParams.component3();
        long m1535component4NHjbRc = drawParams.m1535component4NHjbRc();
        CanvasDrawScope.DrawParams drawParams2 = canvasDrawScope.getDrawParams();
        drawParams2.setDensity(density);
        drawParams2.setLayoutDirection(layoutDirection);
        drawParams2.setCanvas(Canvas);
        drawParams2.m1537setSizeuvyYCjk(j);
        Canvas.save();
        drm.invoke(canvasDrawScope);
        Canvas.restore();
        CanvasDrawScope.DrawParams drawParams3 = canvasDrawScope.getDrawParams();
        drawParams3.setDensity(component1);
        drawParams3.setLayoutDirection(component2);
        drawParams3.setCanvas(component3);
        drawParams3.m1537setSizeuvyYCjk(m1535component4NHjbRc);
    }
}
