package androidx.compose.ui.text.android.style;

import android.graphics.Paint;

/* loaded from: classes.dex */
public final class LineHeightStyleSpan implements android.text.style.LineHeightSpan {
    private final int endIndex;
    private int firstAscentDiff;
    private int lastDescentDiff;
    private final float lineHeight;
    private final int startIndex;
    private final float topRatio;
    private final boolean trimFirstLineTop;
    private final boolean trimLastLineBottom;
    private int firstAscent = Integer.MIN_VALUE;
    private int ascent = Integer.MIN_VALUE;
    private int descent = Integer.MIN_VALUE;
    private int lastDescent = Integer.MIN_VALUE;

    public final int getFirstAscentDiff() {
        return this.firstAscentDiff;
    }

    public final int getLastDescentDiff() {
        return this.lastDescentDiff;
    }

    public final boolean getTrimLastLineBottom() {
        return this.trimLastLineBottom;
    }

    public LineHeightStyleSpan(float f, int i, int i2, boolean z, boolean z2, float f2) {
        this.lineHeight = f;
        this.startIndex = i;
        this.endIndex = i2;
        this.trimFirstLineTop = z;
        this.trimLastLineBottom = z2;
        this.topRatio = f2;
        if ((0.0f > f2 || f2 > 1.0f) && f2 != -1.0f) {
            throw new IllegalStateException("topRatio should be in [0..1] range or -1".toString());
        }
    }

    @Override // android.text.style.LineHeightSpan
    public void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        if (LineHeightStyleSpanKt.lineHeight(fontMetricsInt) <= 0) {
            return;
        }
        boolean z = i == this.startIndex;
        boolean z2 = i2 == this.endIndex;
        if (z && z2 && this.trimFirstLineTop && this.trimLastLineBottom) {
            return;
        }
        if (this.firstAscent == Integer.MIN_VALUE) {
            calculateTargetMetrics(fontMetricsInt);
        }
        fontMetricsInt.ascent = z ? this.firstAscent : this.ascent;
        fontMetricsInt.descent = z2 ? this.lastDescent : this.descent;
    }

    private final void calculateTargetMetrics(Paint.FontMetricsInt fontMetricsInt) {
        double ceil;
        int lineHeight = LineHeightStyleSpanKt.lineHeight(fontMetricsInt);
        int ceil2 = (int) Math.ceil(this.lineHeight);
        int i = ceil2 - lineHeight;
        float f = this.topRatio;
        if (f == -1.0f) {
            f = Math.abs(fontMetricsInt.ascent) / LineHeightStyleSpanKt.lineHeight(fontMetricsInt);
        }
        if (i <= 0) {
            ceil = Math.ceil(i * f);
        } else {
            ceil = Math.ceil(i * (1.0f - f));
        }
        int i2 = fontMetricsInt.descent;
        int i3 = ((int) ceil) + i2;
        this.descent = i3;
        int i4 = i3 - ceil2;
        this.ascent = i4;
        if (this.trimFirstLineTop) {
            i4 = fontMetricsInt.ascent;
        }
        this.firstAscent = i4;
        if (this.trimLastLineBottom) {
            i3 = i2;
        }
        this.lastDescent = i3;
        this.firstAscentDiff = fontMetricsInt.ascent - i4;
        this.lastDescentDiff = i3 - i2;
    }

    public final LineHeightStyleSpan copy$ui_text_release(int i, int i2, boolean z) {
        return new LineHeightStyleSpan(this.lineHeight, i, i2, z, this.trimLastLineBottom, this.topRatio);
    }
}
