package androidx.compose.ui.text.platform.style;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import androidx.compose.ui.graphics.AndroidPathEffect_androidKt;
import androidx.compose.ui.graphics.PathEffect;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.graphics.drawscope.Stroke;
import o.C8632dsu;

/* loaded from: classes.dex */
public final class DrawStyleSpan extends CharacterStyle implements UpdateAppearance {
    private final DrawStyle drawStyle;

    public DrawStyleSpan(DrawStyle drawStyle) {
        this.drawStyle = drawStyle;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        if (textPaint != null) {
            DrawStyle drawStyle = this.drawStyle;
            if (C8632dsu.c(drawStyle, Fill.INSTANCE)) {
                textPaint.setStyle(Paint.Style.FILL);
            } else if (drawStyle instanceof Stroke) {
                textPaint.setStyle(Paint.Style.STROKE);
                textPaint.setStrokeWidth(((Stroke) this.drawStyle).getWidth());
                textPaint.setStrokeMiter(((Stroke) this.drawStyle).getMiter());
                textPaint.setStrokeJoin(m2328toAndroidJoinWw9F2mQ(((Stroke) this.drawStyle).m1567getJoinLxFBmk8()));
                textPaint.setStrokeCap(m2327toAndroidCapBeK7IIE(((Stroke) this.drawStyle).m1566getCapKaPHkGw()));
                PathEffect pathEffect = ((Stroke) this.drawStyle).getPathEffect();
                textPaint.setPathEffect(pathEffect != null ? AndroidPathEffect_androidKt.asAndroidPathEffect(pathEffect) : null);
            }
        }
    }

    /* renamed from: toAndroidJoin-Ww9F2mQ  reason: not valid java name */
    private final Paint.Join m2328toAndroidJoinWw9F2mQ(int i) {
        StrokeJoin.Companion companion = StrokeJoin.Companion;
        return StrokeJoin.m1453equalsimpl0(i, companion.m1458getMiterLxFBmk8()) ? Paint.Join.MITER : StrokeJoin.m1453equalsimpl0(i, companion.m1459getRoundLxFBmk8()) ? Paint.Join.ROUND : StrokeJoin.m1453equalsimpl0(i, companion.m1457getBevelLxFBmk8()) ? Paint.Join.BEVEL : Paint.Join.MITER;
    }

    /* renamed from: toAndroidCap-BeK7IIE  reason: not valid java name */
    private final Paint.Cap m2327toAndroidCapBeK7IIE(int i) {
        StrokeCap.Companion companion = StrokeCap.Companion;
        return StrokeCap.m1444equalsimpl0(i, companion.m1448getButtKaPHkGw()) ? Paint.Cap.BUTT : StrokeCap.m1444equalsimpl0(i, companion.m1449getRoundKaPHkGw()) ? Paint.Cap.ROUND : StrokeCap.m1444equalsimpl0(i, companion.m1450getSquareKaPHkGw()) ? Paint.Cap.SQUARE : Paint.Cap.BUTT;
    }
}
