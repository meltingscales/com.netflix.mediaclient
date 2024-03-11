package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.FilterQuality;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.PaintingStyle;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathEffect;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import o.C8627dsp;
import o.C8632dsu;

/* loaded from: classes.dex */
public final class CanvasDrawScope implements DrawScope {
    private Paint fillPaint;
    private Paint strokePaint;
    private final DrawParams drawParams = new DrawParams(null, null, null, 0, 15, null);
    private final DrawContext drawContext = new DrawContext() { // from class: androidx.compose.ui.graphics.drawscope.CanvasDrawScope$drawContext$1
        private final DrawTransform transform;

        @Override // androidx.compose.ui.graphics.drawscope.DrawContext
        public DrawTransform getTransform() {
            return this.transform;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        {
            DrawTransform asDrawTransform;
            asDrawTransform = CanvasDrawScopeKt.asDrawTransform(this);
            this.transform = asDrawTransform;
        }

        @Override // androidx.compose.ui.graphics.drawscope.DrawContext
        public Canvas getCanvas() {
            return CanvasDrawScope.this.getDrawParams().getCanvas();
        }

        @Override // androidx.compose.ui.graphics.drawscope.DrawContext
        /* renamed from: getSize-NH-jbRc  reason: not valid java name */
        public long mo1538getSizeNHjbRc() {
            return CanvasDrawScope.this.getDrawParams().m1536getSizeNHjbRc();
        }

        @Override // androidx.compose.ui.graphics.drawscope.DrawContext
        /* renamed from: setSize-uvyYCjk  reason: not valid java name */
        public void mo1539setSizeuvyYCjk(long j) {
            CanvasDrawScope.this.getDrawParams().m1537setSizeuvyYCjk(j);
        }
    };

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public DrawContext getDrawContext() {
        return this.drawContext;
    }

    public final DrawParams getDrawParams() {
        return this.drawParams;
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public LayoutDirection getLayoutDirection() {
        return this.drawParams.getLayoutDirection();
    }

    @Override // androidx.compose.ui.unit.Density
    public float getDensity() {
        return this.drawParams.getDensity().getDensity();
    }

    @Override // androidx.compose.ui.unit.FontScaling
    public float getFontScale() {
        return this.drawParams.getDensity().getFontScale();
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawLine-1RTmtNc  reason: not valid java name */
    public void mo1525drawLine1RTmtNc(Brush brush, long j, long j2, float f, int i, PathEffect pathEffect, float f2, ColorFilter colorFilter, int i2) {
        this.drawParams.getCanvas().mo1193drawLineWko1d7g(j, j2, m1519configureStrokePaintho4zsrM$default(this, brush, f, 4.0f, i, StrokeJoin.Companion.m1458getMiterLxFBmk8(), pathEffect, f2, colorFilter, i2, 0, 512, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawLine-NGM6Ib0  reason: not valid java name */
    public void mo1526drawLineNGM6Ib0(long j, long j2, long j3, float f, int i, PathEffect pathEffect, float f2, ColorFilter colorFilter, int i2) {
        this.drawParams.getCanvas().mo1193drawLineWko1d7g(j2, j3, m1517configureStrokePaintQ_0CZUI$default(this, j, f, 4.0f, i, StrokeJoin.Companion.m1458getMiterLxFBmk8(), pathEffect, f2, colorFilter, i2, 0, 512, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawRect-AsUm42w  reason: not valid java name */
    public void mo1531drawRectAsUm42w(Brush brush, long j, long j2, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i) {
        Canvas canvas = this.drawParams.getCanvas();
        float m1137getXimpl = Offset.m1137getXimpl(j);
        float m1138getYimpl = Offset.m1138getYimpl(j);
        float m1137getXimpl2 = Offset.m1137getXimpl(j);
        float m1176getWidthimpl = Size.m1176getWidthimpl(j2);
        canvas.drawRect(m1137getXimpl, m1138getYimpl, m1137getXimpl2 + m1176getWidthimpl, Offset.m1138getYimpl(j) + Size.m1174getHeightimpl(j2), m1515configurePaintswdJneE$default(this, brush, drawStyle, f, colorFilter, i, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawRect-n-J9OG0  reason: not valid java name */
    public void mo1532drawRectnJ9OG0(long j, long j2, long j3, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i) {
        Canvas canvas = this.drawParams.getCanvas();
        float m1137getXimpl = Offset.m1137getXimpl(j2);
        float m1138getYimpl = Offset.m1138getYimpl(j2);
        float m1137getXimpl2 = Offset.m1137getXimpl(j2);
        float m1176getWidthimpl = Size.m1176getWidthimpl(j3);
        canvas.drawRect(m1137getXimpl, m1138getYimpl, m1137getXimpl2 + m1176getWidthimpl, Offset.m1138getYimpl(j2) + Size.m1174getHeightimpl(j3), m1513configurePaint2qPWKa0$default(this, j, drawStyle, f, colorFilter, i, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawImage-gbVJVH8  reason: not valid java name */
    public void mo1524drawImagegbVJVH8(ImageBitmap imageBitmap, long j, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i) {
        this.drawParams.getCanvas().mo1191drawImaged4ec7I(imageBitmap, j, m1515configurePaintswdJneE$default(this, null, drawStyle, f, colorFilter, i, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawImage-AZ2fEMs  reason: not valid java name */
    public void mo1523drawImageAZ2fEMs(ImageBitmap imageBitmap, long j, long j2, long j3, long j4, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i2) {
        this.drawParams.getCanvas().mo1192drawImageRectHPBpro0(imageBitmap, j, j2, j3, j4, m1514configurePaintswdJneE(null, drawStyle, f, colorFilter, i, i2));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawRoundRect-ZuiqVtQ  reason: not valid java name */
    public void mo1533drawRoundRectZuiqVtQ(Brush brush, long j, long j2, long j3, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i) {
        Canvas canvas = this.drawParams.getCanvas();
        float m1137getXimpl = Offset.m1137getXimpl(j);
        float m1138getYimpl = Offset.m1138getYimpl(j);
        float m1137getXimpl2 = Offset.m1137getXimpl(j);
        float m1176getWidthimpl = Size.m1176getWidthimpl(j2);
        canvas.drawRoundRect(m1137getXimpl, m1138getYimpl, m1137getXimpl2 + m1176getWidthimpl, Offset.m1138getYimpl(j) + Size.m1174getHeightimpl(j2), CornerRadius.m1120getXimpl(j3), CornerRadius.m1121getYimpl(j3), m1515configurePaintswdJneE$default(this, brush, drawStyle, f, colorFilter, i, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawRoundRect-u-Aw5IA  reason: not valid java name */
    public void mo1534drawRoundRectuAw5IA(long j, long j2, long j3, long j4, DrawStyle drawStyle, float f, ColorFilter colorFilter, int i) {
        Canvas canvas = this.drawParams.getCanvas();
        float m1137getXimpl = Offset.m1137getXimpl(j2);
        float m1138getYimpl = Offset.m1138getYimpl(j2);
        float m1137getXimpl2 = Offset.m1137getXimpl(j2);
        float m1176getWidthimpl = Size.m1176getWidthimpl(j3);
        canvas.drawRoundRect(m1137getXimpl, m1138getYimpl, m1137getXimpl2 + m1176getWidthimpl, Offset.m1138getYimpl(j2) + Size.m1174getHeightimpl(j3), CornerRadius.m1120getXimpl(j4), CornerRadius.m1121getYimpl(j4), m1513configurePaint2qPWKa0$default(this, j, drawStyle, f, colorFilter, i, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawCircle-VaOC9Bg  reason: not valid java name */
    public void mo1522drawCircleVaOC9Bg(long j, float f, long j2, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i) {
        this.drawParams.getCanvas().mo1190drawCircle9KIMszo(j2, f, m1513configurePaint2qPWKa0$default(this, j, drawStyle, f2, colorFilter, i, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawOval-n-J9OG0  reason: not valid java name */
    public void mo1527drawOvalnJ9OG0(long j, long j2, long j3, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i) {
        Canvas canvas = this.drawParams.getCanvas();
        float m1137getXimpl = Offset.m1137getXimpl(j2);
        float m1138getYimpl = Offset.m1138getYimpl(j2);
        float m1137getXimpl2 = Offset.m1137getXimpl(j2);
        float m1176getWidthimpl = Size.m1176getWidthimpl(j3);
        canvas.drawOval(m1137getXimpl, m1138getYimpl, m1137getXimpl2 + m1176getWidthimpl, Offset.m1138getYimpl(j2) + Size.m1174getHeightimpl(j3), m1513configurePaint2qPWKa0$default(this, j, drawStyle, f, colorFilter, i, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawArc-yD3GUKo  reason: not valid java name */
    public void mo1521drawArcyD3GUKo(long j, float f, float f2, boolean z, long j2, long j3, float f3, DrawStyle drawStyle, ColorFilter colorFilter, int i) {
        Canvas canvas = this.drawParams.getCanvas();
        float m1137getXimpl = Offset.m1137getXimpl(j2);
        float m1138getYimpl = Offset.m1138getYimpl(j2);
        float m1137getXimpl2 = Offset.m1137getXimpl(j2);
        float m1176getWidthimpl = Size.m1176getWidthimpl(j3);
        canvas.drawArc(m1137getXimpl, m1138getYimpl, m1137getXimpl2 + m1176getWidthimpl, Offset.m1138getYimpl(j2) + Size.m1174getHeightimpl(j3), f, f2, z, m1513configurePaint2qPWKa0$default(this, j, drawStyle, f3, colorFilter, i, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawPath-LG529CI  reason: not valid java name */
    public void mo1529drawPathLG529CI(Path path, long j, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i) {
        this.drawParams.getCanvas().drawPath(path, m1513configurePaint2qPWKa0$default(this, j, drawStyle, f, colorFilter, i, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawPath-GBMwjPU  reason: not valid java name */
    public void mo1528drawPathGBMwjPU(Path path, Brush brush, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i) {
        this.drawParams.getCanvas().drawPath(path, m1515configurePaintswdJneE$default(this, brush, drawStyle, f, colorFilter, i, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawPoints-F8ZwMP8  reason: not valid java name */
    public void mo1530drawPointsF8ZwMP8(List<Offset> list, int i, long j, float f, int i2, PathEffect pathEffect, float f2, ColorFilter colorFilter, int i3) {
        this.drawParams.getCanvas().mo1194drawPointsO7TthRY(i, list, m1517configureStrokePaintQ_0CZUI$default(this, j, f, 4.0f, i2, StrokeJoin.Companion.m1458getMiterLxFBmk8(), pathEffect, f2, colorFilter, i3, 0, 512, null));
    }

    private final Paint obtainFillPaint() {
        Paint paint = this.fillPaint;
        if (paint == null) {
            Paint Paint = AndroidPaint_androidKt.Paint();
            Paint.mo1212setStylek9PVt8s(PaintingStyle.Companion.m1396getFillTiuSbCo());
            this.fillPaint = Paint;
            return Paint;
        }
        return paint;
    }

    private final Paint obtainStrokePaint() {
        Paint paint = this.strokePaint;
        if (paint == null) {
            Paint Paint = AndroidPaint_androidKt.Paint();
            Paint.mo1212setStylek9PVt8s(PaintingStyle.Companion.m1397getStrokeTiuSbCo());
            this.strokePaint = Paint;
            return Paint;
        }
        return paint;
    }

    private final Paint selectPaint(DrawStyle drawStyle) {
        if (C8632dsu.c(drawStyle, Fill.INSTANCE)) {
            return obtainFillPaint();
        }
        if (drawStyle instanceof Stroke) {
            Paint obtainStrokePaint = obtainStrokePaint();
            Stroke stroke = (Stroke) drawStyle;
            if (obtainStrokePaint.getStrokeWidth() != stroke.getWidth()) {
                obtainStrokePaint.setStrokeWidth(stroke.getWidth());
            }
            if (!StrokeCap.m1444equalsimpl0(obtainStrokePaint.mo1205getStrokeCapKaPHkGw(), stroke.m1566getCapKaPHkGw())) {
                obtainStrokePaint.mo1210setStrokeCapBeK7IIE(stroke.m1566getCapKaPHkGw());
            }
            if (obtainStrokePaint.getStrokeMiterLimit() != stroke.getMiter()) {
                obtainStrokePaint.setStrokeMiterLimit(stroke.getMiter());
            }
            if (!StrokeJoin.m1453equalsimpl0(obtainStrokePaint.mo1206getStrokeJoinLxFBmk8(), stroke.m1567getJoinLxFBmk8())) {
                obtainStrokePaint.mo1211setStrokeJoinWw9F2mQ(stroke.m1567getJoinLxFBmk8());
            }
            if (!C8632dsu.c(obtainStrokePaint.getPathEffect(), stroke.getPathEffect())) {
                obtainStrokePaint.setPathEffect(stroke.getPathEffect());
            }
            return obtainStrokePaint;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: configurePaint-swdJneE$default  reason: not valid java name */
    static /* synthetic */ Paint m1515configurePaintswdJneE$default(CanvasDrawScope canvasDrawScope, Brush brush, DrawStyle drawStyle, float f, ColorFilter colorFilter, int i, int i2, int i3, Object obj) {
        if ((i3 & 32) != 0) {
            i2 = DrawScope.Companion.m1564getDefaultFilterQualityfv9h1I();
        }
        return canvasDrawScope.m1514configurePaintswdJneE(brush, drawStyle, f, colorFilter, i, i2);
    }

    /* renamed from: configurePaint-swdJneE  reason: not valid java name */
    private final Paint m1514configurePaintswdJneE(Brush brush, DrawStyle drawStyle, float f, ColorFilter colorFilter, int i, int i2) {
        Paint selectPaint = selectPaint(drawStyle);
        if (brush != null) {
            brush.mo1264applyToPq9zytI(mo1562getSizeNHjbRc(), selectPaint, f);
        } else {
            if (selectPaint.getShader() != null) {
                selectPaint.setShader(null);
            }
            long mo1203getColor0d7_KjU = selectPaint.mo1203getColor0d7_KjU();
            Color.Companion companion = Color.Companion;
            if (!Color.m1294equalsimpl0(mo1203getColor0d7_KjU, companion.m1303getBlack0d7_KjU())) {
                selectPaint.mo1208setColor8_81llA(companion.m1303getBlack0d7_KjU());
            }
            if (selectPaint.getAlpha() != f) {
                selectPaint.setAlpha(f);
            }
        }
        if (!C8632dsu.c(selectPaint.getColorFilter(), colorFilter)) {
            selectPaint.setColorFilter(colorFilter);
        }
        if (!BlendMode.m1229equalsimpl0(selectPaint.mo1202getBlendMode0nO6VwU(), i)) {
            selectPaint.mo1207setBlendModes9anfk8(i);
        }
        if (!FilterQuality.m1329equalsimpl0(selectPaint.mo1204getFilterQualityfv9h1I(), i2)) {
            selectPaint.mo1209setFilterQualityvDHp3xo(i2);
        }
        return selectPaint;
    }

    /* renamed from: configurePaint-2qPWKa0$default  reason: not valid java name */
    static /* synthetic */ Paint m1513configurePaint2qPWKa0$default(CanvasDrawScope canvasDrawScope, long j, DrawStyle drawStyle, float f, ColorFilter colorFilter, int i, int i2, int i3, Object obj) {
        return canvasDrawScope.m1512configurePaint2qPWKa0(j, drawStyle, f, colorFilter, i, (i3 & 32) != 0 ? DrawScope.Companion.m1564getDefaultFilterQualityfv9h1I() : i2);
    }

    /* renamed from: configurePaint-2qPWKa0  reason: not valid java name */
    private final Paint m1512configurePaint2qPWKa0(long j, DrawStyle drawStyle, float f, ColorFilter colorFilter, int i, int i2) {
        Paint selectPaint = selectPaint(drawStyle);
        long m1520modulate5vOe2sY = m1520modulate5vOe2sY(j, f);
        if (!Color.m1294equalsimpl0(selectPaint.mo1203getColor0d7_KjU(), m1520modulate5vOe2sY)) {
            selectPaint.mo1208setColor8_81llA(m1520modulate5vOe2sY);
        }
        if (selectPaint.getShader() != null) {
            selectPaint.setShader(null);
        }
        if (!C8632dsu.c(selectPaint.getColorFilter(), colorFilter)) {
            selectPaint.setColorFilter(colorFilter);
        }
        if (!BlendMode.m1229equalsimpl0(selectPaint.mo1202getBlendMode0nO6VwU(), i)) {
            selectPaint.mo1207setBlendModes9anfk8(i);
        }
        if (!FilterQuality.m1329equalsimpl0(selectPaint.mo1204getFilterQualityfv9h1I(), i2)) {
            selectPaint.mo1209setFilterQualityvDHp3xo(i2);
        }
        return selectPaint;
    }

    /* renamed from: configureStrokePaint-Q_0CZUI$default  reason: not valid java name */
    static /* synthetic */ Paint m1517configureStrokePaintQ_0CZUI$default(CanvasDrawScope canvasDrawScope, long j, float f, float f2, int i, int i2, PathEffect pathEffect, float f3, ColorFilter colorFilter, int i3, int i4, int i5, Object obj) {
        return canvasDrawScope.m1516configureStrokePaintQ_0CZUI(j, f, f2, i, i2, pathEffect, f3, colorFilter, i3, (i5 & 512) != 0 ? DrawScope.Companion.m1564getDefaultFilterQualityfv9h1I() : i4);
    }

    /* renamed from: configureStrokePaint-Q_0CZUI  reason: not valid java name */
    private final Paint m1516configureStrokePaintQ_0CZUI(long j, float f, float f2, int i, int i2, PathEffect pathEffect, float f3, ColorFilter colorFilter, int i3, int i4) {
        Paint obtainStrokePaint = obtainStrokePaint();
        long m1520modulate5vOe2sY = m1520modulate5vOe2sY(j, f3);
        if (!Color.m1294equalsimpl0(obtainStrokePaint.mo1203getColor0d7_KjU(), m1520modulate5vOe2sY)) {
            obtainStrokePaint.mo1208setColor8_81llA(m1520modulate5vOe2sY);
        }
        if (obtainStrokePaint.getShader() != null) {
            obtainStrokePaint.setShader(null);
        }
        if (!C8632dsu.c(obtainStrokePaint.getColorFilter(), colorFilter)) {
            obtainStrokePaint.setColorFilter(colorFilter);
        }
        if (!BlendMode.m1229equalsimpl0(obtainStrokePaint.mo1202getBlendMode0nO6VwU(), i3)) {
            obtainStrokePaint.mo1207setBlendModes9anfk8(i3);
        }
        if (obtainStrokePaint.getStrokeWidth() != f) {
            obtainStrokePaint.setStrokeWidth(f);
        }
        if (obtainStrokePaint.getStrokeMiterLimit() != f2) {
            obtainStrokePaint.setStrokeMiterLimit(f2);
        }
        if (!StrokeCap.m1444equalsimpl0(obtainStrokePaint.mo1205getStrokeCapKaPHkGw(), i)) {
            obtainStrokePaint.mo1210setStrokeCapBeK7IIE(i);
        }
        if (!StrokeJoin.m1453equalsimpl0(obtainStrokePaint.mo1206getStrokeJoinLxFBmk8(), i2)) {
            obtainStrokePaint.mo1211setStrokeJoinWw9F2mQ(i2);
        }
        if (!C8632dsu.c(obtainStrokePaint.getPathEffect(), pathEffect)) {
            obtainStrokePaint.setPathEffect(pathEffect);
        }
        if (!FilterQuality.m1329equalsimpl0(obtainStrokePaint.mo1204getFilterQualityfv9h1I(), i4)) {
            obtainStrokePaint.mo1209setFilterQualityvDHp3xo(i4);
        }
        return obtainStrokePaint;
    }

    /* renamed from: configureStrokePaint-ho4zsrM$default  reason: not valid java name */
    static /* synthetic */ Paint m1519configureStrokePaintho4zsrM$default(CanvasDrawScope canvasDrawScope, Brush brush, float f, float f2, int i, int i2, PathEffect pathEffect, float f3, ColorFilter colorFilter, int i3, int i4, int i5, Object obj) {
        return canvasDrawScope.m1518configureStrokePaintho4zsrM(brush, f, f2, i, i2, pathEffect, f3, colorFilter, i3, (i5 & 512) != 0 ? DrawScope.Companion.m1564getDefaultFilterQualityfv9h1I() : i4);
    }

    /* renamed from: configureStrokePaint-ho4zsrM  reason: not valid java name */
    private final Paint m1518configureStrokePaintho4zsrM(Brush brush, float f, float f2, int i, int i2, PathEffect pathEffect, float f3, ColorFilter colorFilter, int i3, int i4) {
        Paint obtainStrokePaint = obtainStrokePaint();
        if (brush != null) {
            brush.mo1264applyToPq9zytI(mo1562getSizeNHjbRc(), obtainStrokePaint, f3);
        } else if (obtainStrokePaint.getAlpha() != f3) {
            obtainStrokePaint.setAlpha(f3);
        }
        if (!C8632dsu.c(obtainStrokePaint.getColorFilter(), colorFilter)) {
            obtainStrokePaint.setColorFilter(colorFilter);
        }
        if (!BlendMode.m1229equalsimpl0(obtainStrokePaint.mo1202getBlendMode0nO6VwU(), i3)) {
            obtainStrokePaint.mo1207setBlendModes9anfk8(i3);
        }
        if (obtainStrokePaint.getStrokeWidth() != f) {
            obtainStrokePaint.setStrokeWidth(f);
        }
        if (obtainStrokePaint.getStrokeMiterLimit() != f2) {
            obtainStrokePaint.setStrokeMiterLimit(f2);
        }
        if (!StrokeCap.m1444equalsimpl0(obtainStrokePaint.mo1205getStrokeCapKaPHkGw(), i)) {
            obtainStrokePaint.mo1210setStrokeCapBeK7IIE(i);
        }
        if (!StrokeJoin.m1453equalsimpl0(obtainStrokePaint.mo1206getStrokeJoinLxFBmk8(), i2)) {
            obtainStrokePaint.mo1211setStrokeJoinWw9F2mQ(i2);
        }
        if (!C8632dsu.c(obtainStrokePaint.getPathEffect(), pathEffect)) {
            obtainStrokePaint.setPathEffect(pathEffect);
        }
        if (!FilterQuality.m1329equalsimpl0(obtainStrokePaint.mo1204getFilterQualityfv9h1I(), i4)) {
            obtainStrokePaint.mo1209setFilterQualityvDHp3xo(i4);
        }
        return obtainStrokePaint;
    }

    /* renamed from: modulate-5vOe2sY  reason: not valid java name */
    private final long m1520modulate5vOe2sY(long j, float f) {
        return f == 1.0f ? j : Color.m1292copywmQWz5c$default(j, Color.m1295getAlphaimpl(j) * f, 0.0f, 0.0f, 0.0f, 14, null);
    }

    /* loaded from: classes.dex */
    public static final class DrawParams {
        private Canvas canvas;
        private Density density;
        private LayoutDirection layoutDirection;
        private long size;

        public /* synthetic */ DrawParams(Density density, LayoutDirection layoutDirection, Canvas canvas, long j, C8627dsp c8627dsp) {
            this(density, layoutDirection, canvas, j);
        }

        public final Density component1() {
            return this.density;
        }

        public final LayoutDirection component2() {
            return this.layoutDirection;
        }

        public final Canvas component3() {
            return this.canvas;
        }

        /* renamed from: component4-NH-jbRc  reason: not valid java name */
        public final long m1535component4NHjbRc() {
            return this.size;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof DrawParams) {
                DrawParams drawParams = (DrawParams) obj;
                return C8632dsu.c(this.density, drawParams.density) && this.layoutDirection == drawParams.layoutDirection && C8632dsu.c(this.canvas, drawParams.canvas) && Size.m1173equalsimpl0(this.size, drawParams.size);
            }
            return false;
        }

        public final Canvas getCanvas() {
            return this.canvas;
        }

        public final Density getDensity() {
            return this.density;
        }

        public final LayoutDirection getLayoutDirection() {
            return this.layoutDirection;
        }

        /* renamed from: getSize-NH-jbRc  reason: not valid java name */
        public final long m1536getSizeNHjbRc() {
            return this.size;
        }

        public int hashCode() {
            return (((((this.density.hashCode() * 31) + this.layoutDirection.hashCode()) * 31) + this.canvas.hashCode()) * 31) + Size.m1177hashCodeimpl(this.size);
        }

        public final void setCanvas(Canvas canvas) {
            this.canvas = canvas;
        }

        public final void setDensity(Density density) {
            this.density = density;
        }

        public final void setLayoutDirection(LayoutDirection layoutDirection) {
            this.layoutDirection = layoutDirection;
        }

        /* renamed from: setSize-uvyYCjk  reason: not valid java name */
        public final void m1537setSizeuvyYCjk(long j) {
            this.size = j;
        }

        public String toString() {
            return "DrawParams(density=" + this.density + ", layoutDirection=" + this.layoutDirection + ", canvas=" + this.canvas + ", size=" + ((Object) Size.m1179toStringimpl(this.size)) + ')';
        }

        private DrawParams(Density density, LayoutDirection layoutDirection, Canvas canvas, long j) {
            this.density = density;
            this.layoutDirection = layoutDirection;
            this.canvas = canvas;
            this.size = j;
        }

        public /* synthetic */ DrawParams(Density density, LayoutDirection layoutDirection, Canvas canvas, long j, int i, C8627dsp c8627dsp) {
            this((i & 1) != 0 ? DrawContextKt.getDefaultDensity() : density, (i & 2) != 0 ? LayoutDirection.Ltr : layoutDirection, (i & 4) != 0 ? new EmptyCanvas() : canvas, (i & 8) != 0 ? Size.Companion.m1182getZeroNHjbRc() : j, null);
        }
    }
}
