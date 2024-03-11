package androidx.compose.ui.text.platform;

import android.graphics.Matrix;
import android.graphics.Shader;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.BrushKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.ShaderBrush;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.MultiParagraph;
import androidx.compose.ui.text.ParagraphInfo;
import androidx.compose.ui.text.style.TextDecoration;
import java.util.List;

/* loaded from: classes.dex */
public final class AndroidMultiParagraphDraw_androidKt {
    /* renamed from: drawMultiParagraph-7AXcY_I  reason: not valid java name */
    public static final void m2305drawMultiParagraph7AXcY_I(MultiParagraph multiParagraph, Canvas canvas, Brush brush, float f, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i) {
        canvas.save();
        if (multiParagraph.getParagraphInfoList$ui_text_release().size() <= 1) {
            m2306drawParagraphs7AXcY_I(multiParagraph, canvas, brush, f, shadow, textDecoration, drawStyle, i);
        } else if (brush instanceof SolidColor) {
            m2306drawParagraphs7AXcY_I(multiParagraph, canvas, brush, f, shadow, textDecoration, drawStyle, i);
        } else if (brush instanceof ShaderBrush) {
            List<ParagraphInfo> paragraphInfoList$ui_text_release = multiParagraph.getParagraphInfoList$ui_text_release();
            int size = paragraphInfoList$ui_text_release.size();
            float f2 = 0.0f;
            float f3 = 0.0f;
            for (int i2 = 0; i2 < size; i2++) {
                ParagraphInfo paragraphInfo = paragraphInfoList$ui_text_release.get(i2);
                f3 += paragraphInfo.getParagraph().getHeight();
                f2 = Math.max(f2, paragraphInfo.getParagraph().getWidth());
            }
            Shader mo1271createShaderuvyYCjk = ((ShaderBrush) brush).mo1271createShaderuvyYCjk(SizeKt.Size(f2, f3));
            Matrix matrix = new Matrix();
            mo1271createShaderuvyYCjk.getLocalMatrix(matrix);
            List<ParagraphInfo> paragraphInfoList$ui_text_release2 = multiParagraph.getParagraphInfoList$ui_text_release();
            int size2 = paragraphInfoList$ui_text_release2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                ParagraphInfo paragraphInfo2 = paragraphInfoList$ui_text_release2.get(i3);
                paragraphInfo2.getParagraph().mo2056painthn5TExg(canvas, BrushKt.ShaderBrush(mo1271createShaderuvyYCjk), f, shadow, textDecoration, drawStyle, i);
                canvas.translate(0.0f, paragraphInfo2.getParagraph().getHeight());
                matrix.setTranslate(0.0f, -paragraphInfo2.getParagraph().getHeight());
                mo1271createShaderuvyYCjk.setLocalMatrix(matrix);
            }
        }
        canvas.restore();
    }

    /* renamed from: drawParagraphs-7AXcY_I  reason: not valid java name */
    private static final void m2306drawParagraphs7AXcY_I(MultiParagraph multiParagraph, Canvas canvas, Brush brush, float f, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i) {
        List<ParagraphInfo> paragraphInfoList$ui_text_release = multiParagraph.getParagraphInfoList$ui_text_release();
        int size = paragraphInfoList$ui_text_release.size();
        for (int i2 = 0; i2 < size; i2++) {
            ParagraphInfo paragraphInfo = paragraphInfoList$ui_text_release.get(i2);
            paragraphInfo.getParagraph().mo2056painthn5TExg(canvas, brush, f, shadow, textDecoration, drawStyle, i);
            canvas.translate(0.0f, paragraphInfo.getParagraph().getHeight());
        }
    }
}
