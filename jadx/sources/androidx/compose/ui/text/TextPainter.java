package androidx.compose.ui.text;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextForegroundStyle;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.IntSize;

/* loaded from: classes.dex */
public final class TextPainter {
    public static final TextPainter INSTANCE = new TextPainter();

    private TextPainter() {
    }

    public final void paint(Canvas canvas, TextLayoutResult textLayoutResult) {
        long m1303getBlack0d7_KjU;
        boolean z = textLayoutResult.getHasVisualOverflow() && !TextOverflow.m2453equalsimpl0(textLayoutResult.getLayoutInput().m2139getOverflowgIe3tQ8(), TextOverflow.Companion.m2459getVisiblegIe3tQ8());
        if (z) {
            Rect m1162Recttz77jQw = RectKt.m1162Recttz77jQw(Offset.Companion.m1149getZeroF1C5BW0(), SizeKt.Size(IntSize.m2547getWidthimpl(textLayoutResult.m2143getSizeYbymL2g()), IntSize.m2546getHeightimpl(textLayoutResult.m2143getSizeYbymL2g())));
            canvas.save();
            Canvas.m1274clipRectmtrdDE$default(canvas, m1162Recttz77jQw, 0, 2, null);
        }
        SpanStyle spanStyle$ui_text_release = textLayoutResult.getLayoutInput().getStyle().getSpanStyle$ui_text_release();
        TextDecoration textDecoration = spanStyle$ui_text_release.getTextDecoration();
        if (textDecoration == null) {
            textDecoration = TextDecoration.Companion.getNone();
        }
        TextDecoration textDecoration2 = textDecoration;
        Shadow shadow = spanStyle$ui_text_release.getShadow();
        if (shadow == null) {
            shadow = Shadow.Companion.getNone();
        }
        Shadow shadow2 = shadow;
        DrawStyle drawStyle = spanStyle$ui_text_release.getDrawStyle();
        if (drawStyle == null) {
            drawStyle = Fill.INSTANCE;
        }
        DrawStyle drawStyle2 = drawStyle;
        try {
            Brush brush = spanStyle$ui_text_release.getBrush();
            if (brush != null) {
                textLayoutResult.getMultiParagraph().m2083painthn5TExg(canvas, brush, (r17 & 4) != 0 ? Float.NaN : spanStyle$ui_text_release.getTextForegroundStyle$ui_text_release() != TextForegroundStyle.Unspecified.INSTANCE ? spanStyle$ui_text_release.getTextForegroundStyle$ui_text_release().getAlpha() : 1.0f, (r17 & 8) != 0 ? null : shadow2, (r17 & 16) != 0 ? null : textDecoration2, (r17 & 32) != 0 ? null : drawStyle2, (r17 & 64) != 0 ? DrawScope.Companion.m1563getDefaultBlendMode0nO6VwU() : 0);
            } else {
                if (spanStyle$ui_text_release.getTextForegroundStyle$ui_text_release() != TextForegroundStyle.Unspecified.INSTANCE) {
                    m1303getBlack0d7_KjU = spanStyle$ui_text_release.getTextForegroundStyle$ui_text_release().mo2340getColor0d7_KjU();
                } else {
                    m1303getBlack0d7_KjU = Color.Companion.m1303getBlack0d7_KjU();
                }
                textLayoutResult.getMultiParagraph().m2082paintLG529CI(canvas, (r14 & 2) != 0 ? Color.Companion.m1309getUnspecified0d7_KjU() : m1303getBlack0d7_KjU, (r14 & 4) != 0 ? null : shadow2, (r14 & 8) != 0 ? null : textDecoration2, (r14 & 16) == 0 ? drawStyle2 : null, (r14 & 32) != 0 ? DrawScope.Companion.m1563getDefaultBlendMode0nO6VwU() : 0);
            }
        } finally {
            if (z) {
                canvas.restore();
            }
        }
    }
}
