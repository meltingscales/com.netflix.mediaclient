package androidx.compose.ui.text.android.style;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import o.C8627dsp;
import o.C8632dsu;

/* loaded from: classes.dex */
public final class PlaceholderSpan extends ReplacementSpan {
    private Paint.FontMetricsInt fontMetrics;
    private final float height;
    private int heightPx;
    private final int heightUnit;
    private boolean isLaidOut;
    private final float pxPerSp;
    private final int verticalAlign;
    private final float width;
    private int widthPx;
    private final int widthUnit;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
    }

    public final int getVerticalAlign() {
        return this.verticalAlign;
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }
    }

    public PlaceholderSpan(float f, int i, float f2, int i2, float f3, int i3) {
        this.width = f;
        this.widthUnit = i;
        this.height = f2;
        this.heightUnit = i2;
        this.pxPerSp = f3;
        this.verticalAlign = i3;
    }

    public final Paint.FontMetricsInt getFontMetrics() {
        Paint.FontMetricsInt fontMetricsInt = this.fontMetrics;
        if (fontMetricsInt != null) {
            return fontMetricsInt;
        }
        C8632dsu.d("");
        return null;
    }

    public final int getWidthPx() {
        if (this.isLaidOut) {
            return this.widthPx;
        }
        throw new IllegalStateException("PlaceholderSpan is not laid out yet.".toString());
    }

    public final int getHeightPx() {
        if (this.isLaidOut) {
            return this.heightPx;
        }
        throw new IllegalStateException("PlaceholderSpan is not laid out yet.".toString());
    }

    @Override // android.text.style.ReplacementSpan
    @SuppressLint({"DocumentExceptions"})
    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        float f;
        int ceilToInt;
        this.isLaidOut = true;
        float textSize = paint.getTextSize();
        this.fontMetrics = paint.getFontMetricsInt();
        if (getFontMetrics().descent <= getFontMetrics().ascent) {
            throw new IllegalArgumentException("Invalid fontMetrics: line height can not be negative.".toString());
        }
        int i3 = this.widthUnit;
        if (i3 == 0) {
            f = this.width * this.pxPerSp;
        } else if (i3 != 1) {
            throw new IllegalArgumentException("Unsupported unit.");
        } else {
            f = this.width * textSize;
        }
        this.widthPx = PlaceholderSpanKt.ceilToInt(f);
        int i4 = this.heightUnit;
        if (i4 == 0) {
            ceilToInt = PlaceholderSpanKt.ceilToInt(this.height * this.pxPerSp);
        } else if (i4 == 1) {
            ceilToInt = PlaceholderSpanKt.ceilToInt(this.height * textSize);
        } else {
            throw new IllegalArgumentException("Unsupported unit.");
        }
        this.heightPx = ceilToInt;
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = getFontMetrics().ascent;
            fontMetricsInt.descent = getFontMetrics().descent;
            fontMetricsInt.leading = getFontMetrics().leading;
            switch (this.verticalAlign) {
                case 0:
                    if (fontMetricsInt.ascent > (-getHeightPx())) {
                        fontMetricsInt.ascent = -getHeightPx();
                        break;
                    }
                    break;
                case 1:
                case 4:
                    if (fontMetricsInt.ascent + getHeightPx() > fontMetricsInt.descent) {
                        fontMetricsInt.descent = fontMetricsInt.ascent + getHeightPx();
                        break;
                    }
                    break;
                case 2:
                case 5:
                    if (fontMetricsInt.ascent > fontMetricsInt.descent - getHeightPx()) {
                        fontMetricsInt.ascent = fontMetricsInt.descent - getHeightPx();
                        break;
                    }
                    break;
                case 3:
                case 6:
                    if (fontMetricsInt.descent - fontMetricsInt.ascent < getHeightPx()) {
                        int heightPx = fontMetricsInt.ascent - ((getHeightPx() - (fontMetricsInt.descent - fontMetricsInt.ascent)) / 2);
                        fontMetricsInt.ascent = heightPx;
                        fontMetricsInt.descent = heightPx + getHeightPx();
                        break;
                    }
                    break;
                default:
                    throw new IllegalArgumentException("Unknown verticalAlign.");
            }
            fontMetricsInt.top = Math.min(getFontMetrics().top, fontMetricsInt.ascent);
            fontMetricsInt.bottom = Math.max(getFontMetrics().bottom, fontMetricsInt.descent);
        }
        return getWidthPx();
    }
}
