package androidx.compose.ui.text.android.style;

import android.graphics.Paint;

/* loaded from: classes.dex */
public final class LineHeightSpan implements android.text.style.LineHeightSpan {
    private final float lineHeight;

    public LineHeightSpan(float f) {
        this.lineHeight = f;
    }

    @Override // android.text.style.LineHeightSpan
    public void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        int lineHeight = LineHeightStyleSpanKt.lineHeight(fontMetricsInt);
        if (lineHeight <= 0) {
            return;
        }
        int ceil = (int) Math.ceil(this.lineHeight);
        int ceil2 = (int) Math.ceil(fontMetricsInt.descent * ((ceil * 1.0f) / lineHeight));
        fontMetricsInt.descent = ceil2;
        fontMetricsInt.ascent = ceil2 - ceil;
    }
}
