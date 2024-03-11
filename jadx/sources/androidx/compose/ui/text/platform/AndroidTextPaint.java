package androidx.compose.ui.text.platform;

import android.text.TextPaint;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.PaintingStyle;
import androidx.compose.ui.graphics.ShaderBrush;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.text.platform.extensions.TextPaintExtensions_androidKt;
import androidx.compose.ui.text.style.TextDecoration;
import o.C8632dsu;
import o.C8657dts;

/* loaded from: classes.dex */
public final class AndroidTextPaint extends TextPaint {
    private final Paint composePaint;
    private DrawStyle drawStyle;
    private Shadow shadow;
    private TextDecoration textDecoration;

    public AndroidTextPaint(int i, float f) {
        super(i);
        ((TextPaint) this).density = f;
        this.composePaint = AndroidPaint_androidKt.asComposePaint(this);
        this.textDecoration = TextDecoration.Companion.getNone();
        this.shadow = Shadow.Companion.getNone();
    }

    public final void setTextDecoration(TextDecoration textDecoration) {
        if (textDecoration == null || C8632dsu.c(this.textDecoration, textDecoration)) {
            return;
        }
        this.textDecoration = textDecoration;
        TextDecoration.Companion companion = TextDecoration.Companion;
        setUnderlineText(textDecoration.contains(companion.getUnderline()));
        setStrikeThruText(this.textDecoration.contains(companion.getLineThrough()));
    }

    public final void setShadow(Shadow shadow) {
        if (shadow == null || C8632dsu.c(this.shadow, shadow)) {
            return;
        }
        this.shadow = shadow;
        if (C8632dsu.c(shadow, Shadow.Companion.getNone())) {
            clearShadowLayer();
        } else {
            setShadowLayer(TextPaintExtensions_androidKt.correctBlurRadius(this.shadow.getBlurRadius()), Offset.m1137getXimpl(this.shadow.m1432getOffsetF1C5BW0()), Offset.m1138getYimpl(this.shadow.m1432getOffsetF1C5BW0()), ColorKt.m1317toArgb8_81llA(this.shadow.m1431getColor0d7_KjU()));
        }
    }

    /* renamed from: setBrush-12SF9DM  reason: not valid java name */
    public final void m2313setBrush12SF9DM(Brush brush, long j, float f) {
        if (((brush instanceof SolidColor) && ((SolidColor) brush).m1441getValue0d7_KjU() != Color.Companion.m1309getUnspecified0d7_KjU()) || ((brush instanceof ShaderBrush) && j != Size.Companion.m1181getUnspecifiedNHjbRc())) {
            brush.mo1264applyToPq9zytI(j, this.composePaint, Float.isNaN(f) ? this.composePaint.getAlpha() : C8657dts.a(f, 0.0f, 1.0f));
        } else if (brush == null) {
            this.composePaint.setShader(null);
        }
    }

    public final void setDrawStyle(DrawStyle drawStyle) {
        if (drawStyle == null || C8632dsu.c(this.drawStyle, drawStyle)) {
            return;
        }
        this.drawStyle = drawStyle;
        if (C8632dsu.c(drawStyle, Fill.INSTANCE)) {
            this.composePaint.mo1212setStylek9PVt8s(PaintingStyle.Companion.m1396getFillTiuSbCo());
        } else if (drawStyle instanceof Stroke) {
            this.composePaint.mo1212setStylek9PVt8s(PaintingStyle.Companion.m1397getStrokeTiuSbCo());
            Stroke stroke = (Stroke) drawStyle;
            this.composePaint.setStrokeWidth(stroke.getWidth());
            this.composePaint.setStrokeMiterLimit(stroke.getMiter());
            this.composePaint.mo1211setStrokeJoinWw9F2mQ(stroke.m1567getJoinLxFBmk8());
            this.composePaint.mo1210setStrokeCapBeK7IIE(stroke.m1566getCapKaPHkGw());
            this.composePaint.setPathEffect(stroke.getPathEffect());
        }
    }

    /* renamed from: getBlendMode-0nO6VwU  reason: not valid java name */
    public final int m2311getBlendMode0nO6VwU() {
        return this.composePaint.mo1202getBlendMode0nO6VwU();
    }

    /* renamed from: setBlendMode-s9anfk8  reason: not valid java name */
    public final void m2312setBlendModes9anfk8(int i) {
        this.composePaint.mo1207setBlendModes9anfk8(i);
    }

    /* renamed from: setColor-8_81llA  reason: not valid java name */
    public final void m2314setColor8_81llA(long j) {
        if (j != Color.Companion.m1309getUnspecified0d7_KjU()) {
            this.composePaint.mo1208setColor8_81llA(j);
            this.composePaint.setShader(null);
        }
    }
}
