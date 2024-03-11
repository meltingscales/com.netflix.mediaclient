package androidx.compose.ui.text.style;

import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.text.SpanStyleKt;
import androidx.compose.ui.util.MathHelpersKt;
import o.drO;

/* loaded from: classes.dex */
public final class TextDrawStyleKt {
    public static final TextForegroundStyle lerp(TextForegroundStyle textForegroundStyle, TextForegroundStyle textForegroundStyle2, float f) {
        boolean z = textForegroundStyle instanceof BrushStyle;
        if (!z && !(textForegroundStyle2 instanceof BrushStyle)) {
            return TextForegroundStyle.Companion.m2438from8_81llA(ColorKt.m1315lerpjxsXWHM(textForegroundStyle.mo2340getColor0d7_KjU(), textForegroundStyle2.mo2340getColor0d7_KjU(), f));
        }
        if (z && (textForegroundStyle2 instanceof BrushStyle)) {
            return TextForegroundStyle.Companion.from((Brush) SpanStyleKt.lerpDiscrete(((BrushStyle) textForegroundStyle).getBrush(), ((BrushStyle) textForegroundStyle2).getBrush(), f), MathHelpersKt.lerp(textForegroundStyle.getAlpha(), textForegroundStyle2.getAlpha(), f));
        }
        return (TextForegroundStyle) SpanStyleKt.lerpDiscrete(textForegroundStyle, textForegroundStyle2, f);
    }

    /* renamed from: modulate-DxMtmZc */
    public static final long m2437modulateDxMtmZc(long j, float f) {
        return (Float.isNaN(f) || f >= 1.0f) ? j : Color.m1292copywmQWz5c$default(j, Color.m1295getAlphaimpl(j) * f, 0.0f, 0.0f, 0.0f, 14, null);
    }

    public static final float takeOrElse(float f, drO<Float> dro) {
        return Float.isNaN(f) ? dro.invoke().floatValue() : f;
    }
}
