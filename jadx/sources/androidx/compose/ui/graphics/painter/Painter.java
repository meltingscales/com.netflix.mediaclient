package androidx.compose.ui.graphics.painter;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.LayoutDirection;
import o.C8632dsu;
import o.dpR;
import o.drM;

/* loaded from: classes.dex */
public abstract class Painter {
    private ColorFilter colorFilter;
    private Paint layerPaint;
    private boolean useLayer;
    private float alpha = 1.0f;
    private LayoutDirection layoutDirection = LayoutDirection.Ltr;
    private final drM<DrawScope, dpR> drawLambda = new drM<DrawScope, dpR>() { // from class: androidx.compose.ui.graphics.painter.Painter$drawLambda$1
        /* JADX INFO: Access modifiers changed from: package-private */
        {
            super(1);
        }

        @Override // o.drM
        public /* bridge */ /* synthetic */ dpR invoke(DrawScope drawScope) {
            invoke2(drawScope);
            return dpR.c;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(DrawScope drawScope) {
            Painter.this.onDraw(drawScope);
        }
    };

    protected boolean applyAlpha(float f) {
        return false;
    }

    protected boolean applyColorFilter(ColorFilter colorFilter) {
        return false;
    }

    protected boolean applyLayoutDirection(LayoutDirection layoutDirection) {
        return false;
    }

    /* renamed from: getIntrinsicSize-NH-jbRc */
    public abstract long mo1570getIntrinsicSizeNHjbRc();

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void onDraw(DrawScope drawScope);

    private final Paint obtainPaint() {
        Paint paint = this.layerPaint;
        if (paint == null) {
            Paint Paint = AndroidPaint_androidKt.Paint();
            this.layerPaint = Paint;
            return Paint;
        }
        return paint;
    }

    private final void configureColorFilter(ColorFilter colorFilter) {
        if (C8632dsu.c(this.colorFilter, colorFilter)) {
            return;
        }
        if (!applyColorFilter(colorFilter)) {
            if (colorFilter == null) {
                Paint paint = this.layerPaint;
                if (paint != null) {
                    paint.setColorFilter(null);
                }
                this.useLayer = false;
            } else {
                obtainPaint().setColorFilter(colorFilter);
                this.useLayer = true;
            }
        }
        this.colorFilter = colorFilter;
    }

    private final void configureAlpha(float f) {
        if (this.alpha == f) {
            return;
        }
        if (!applyAlpha(f)) {
            if (f == 1.0f) {
                Paint paint = this.layerPaint;
                if (paint != null) {
                    paint.setAlpha(f);
                }
                this.useLayer = false;
            } else {
                obtainPaint().setAlpha(f);
                this.useLayer = true;
            }
        }
        this.alpha = f;
    }

    private final void configureLayoutDirection(LayoutDirection layoutDirection) {
        if (this.layoutDirection != layoutDirection) {
            applyLayoutDirection(layoutDirection);
            this.layoutDirection = layoutDirection;
        }
    }

    /* renamed from: draw-x_KDEd0  reason: not valid java name */
    public final void m1574drawx_KDEd0(DrawScope drawScope, long j, float f, ColorFilter colorFilter) {
        configureAlpha(f);
        configureColorFilter(colorFilter);
        configureLayoutDirection(drawScope.getLayoutDirection());
        float m1176getWidthimpl = Size.m1176getWidthimpl(drawScope.mo1562getSizeNHjbRc()) - Size.m1176getWidthimpl(j);
        float m1174getHeightimpl = Size.m1174getHeightimpl(drawScope.mo1562getSizeNHjbRc()) - Size.m1174getHeightimpl(j);
        drawScope.getDrawContext().getTransform().inset(0.0f, 0.0f, m1176getWidthimpl, m1174getHeightimpl);
        if (f > 0.0f && Size.m1176getWidthimpl(j) > 0.0f && Size.m1174getHeightimpl(j) > 0.0f) {
            if (this.useLayer) {
                Rect m1162Recttz77jQw = RectKt.m1162Recttz77jQw(Offset.Companion.m1149getZeroF1C5BW0(), SizeKt.Size(Size.m1176getWidthimpl(j), Size.m1174getHeightimpl(j)));
                Canvas canvas = drawScope.getDrawContext().getCanvas();
                try {
                    canvas.saveLayer(m1162Recttz77jQw, obtainPaint());
                    onDraw(drawScope);
                } finally {
                    canvas.restore();
                }
            } else {
                onDraw(drawScope);
            }
        }
        drawScope.getDrawContext().getTransform().inset(0.0f, 0.0f, -m1176getWidthimpl, -m1174getHeightimpl);
    }
}
