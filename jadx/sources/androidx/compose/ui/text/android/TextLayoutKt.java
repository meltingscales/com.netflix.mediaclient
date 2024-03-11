package androidx.compose.ui.text.android;

import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import androidx.compose.ui.text.android.style.LineHeightStyleSpan;
import com.netflix.android.org.json.zip.JSONzip;
import o.C8563dqf;
import o.C8632dsu;

/* loaded from: classes.dex */
public final class TextLayoutKt {
    private static final TextAndroidCanvas SharedTextAndroidCanvas = new TextAndroidCanvas();
    private static final long ZeroVerticalPadding = VerticalPaddings(0, 0);

    public static final TextDirectionHeuristic getTextDirectionHeuristic(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i == 5) {
                                return TextDirectionHeuristics.LOCALE;
                            }
                            return TextDirectionHeuristics.FIRSTSTRONG_LTR;
                        }
                        return TextDirectionHeuristics.ANYRTL_LTR;
                    }
                    return TextDirectionHeuristics.FIRSTSTRONG_RTL;
                }
                return TextDirectionHeuristics.FIRSTSTRONG_LTR;
            }
            return TextDirectionHeuristics.RTL;
        }
        return TextDirectionHeuristics.LTR;
    }

    public static final long VerticalPaddings(int i, int i2) {
        return VerticalPaddings.m2182constructorimpl((i2 & 4294967295L) | (i << 32));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long getVerticalPaddings(TextLayout textLayout) {
        if (textLayout.getIncludePadding() || textLayout.isFallbackLinespacingApplied$ui_text_release()) {
            return ZeroVerticalPadding;
        }
        TextPaint paint = textLayout.getLayout().getPaint();
        CharSequence text = textLayout.getLayout().getText();
        Rect charSequenceBounds = PaintExtensionsKt.getCharSequenceBounds(paint, text, textLayout.getLayout().getLineStart(0), textLayout.getLayout().getLineEnd(0));
        int lineAscent = textLayout.getLayout().getLineAscent(0);
        int i = charSequenceBounds.top;
        int topPadding = i < lineAscent ? lineAscent - i : textLayout.getLayout().getTopPadding();
        if (textLayout.getLineCount() != 1) {
            int lineCount = textLayout.getLineCount() - 1;
            charSequenceBounds = PaintExtensionsKt.getCharSequenceBounds(paint, text, textLayout.getLayout().getLineStart(lineCount), textLayout.getLayout().getLineEnd(lineCount));
        }
        int lineDescent = textLayout.getLayout().getLineDescent(textLayout.getLineCount() - 1);
        int i2 = charSequenceBounds.bottom;
        int bottomPadding = i2 > lineDescent ? i2 - lineDescent : textLayout.getLayout().getBottomPadding();
        return (topPadding == 0 && bottomPadding == 0) ? ZeroVerticalPadding : VerticalPaddings(topPadding, bottomPadding);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long getLineHeightPaddings(TextLayout textLayout, LineHeightStyleSpan[] lineHeightStyleSpanArr) {
        int i = 0;
        int i2 = 0;
        for (LineHeightStyleSpan lineHeightStyleSpan : lineHeightStyleSpanArr) {
            if (lineHeightStyleSpan.getFirstAscentDiff() < 0) {
                i = Math.max(i, Math.abs(lineHeightStyleSpan.getFirstAscentDiff()));
            }
            if (lineHeightStyleSpan.getLastDescentDiff() < 0) {
                i2 = Math.max(i, Math.abs(lineHeightStyleSpan.getLastDescentDiff()));
            }
        }
        return (i == 0 && i2 == 0) ? ZeroVerticalPadding : VerticalPaddings(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Paint.FontMetricsInt getLastLineMetrics(TextLayout textLayout, TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, LineHeightStyleSpan[] lineHeightStyleSpanArr) {
        Object x;
        StaticLayout create;
        int lineCount = textLayout.getLineCount() - 1;
        if (textLayout.getLayout().getLineStart(lineCount) == textLayout.getLayout().getLineEnd(lineCount)) {
            if (true ^ (lineHeightStyleSpanArr.length == 0)) {
                SpannableString spannableString = new SpannableString("\u200b");
                x = C8563dqf.x(lineHeightStyleSpanArr);
                LineHeightStyleSpan lineHeightStyleSpan = (LineHeightStyleSpan) x;
                spannableString.setSpan(lineHeightStyleSpan.copy$ui_text_release(0, spannableString.length(), (lineCount == 0 || !lineHeightStyleSpan.getTrimLastLineBottom()) ? lineHeightStyleSpan.getTrimLastLineBottom() : false), 0, spannableString.length(), 33);
                create = StaticLayoutFactory.INSTANCE.create(spannableString, textPaint, Integer.MAX_VALUE, (r47 & 8) != 0 ? 0 : 0, (r47 & 16) != 0 ? spannableString.length() : spannableString.length(), (r47 & 32) != 0 ? LayoutCompat.INSTANCE.getDEFAULT_TEXT_DIRECTION_HEURISTIC$ui_text_release() : textDirectionHeuristic, (r47 & 64) != 0 ? LayoutCompat.INSTANCE.getDEFAULT_LAYOUT_ALIGNMENT$ui_text_release() : null, (r47 & 128) != 0 ? Integer.MAX_VALUE : 0, (r47 & JSONzip.end) != 0 ? null : null, (r47 & 512) != 0 ? Integer.MAX_VALUE : 0, (r47 & 1024) != 0 ? 1.0f : 0.0f, (r47 & 2048) != 0 ? 0.0f : 0.0f, (r47 & 4096) != 0 ? 0 : 0, (r47 & 8192) != 0 ? false : textLayout.getIncludePadding(), (r47 & 16384) != 0 ? true : textLayout.getFallbackLineSpacing(), (32768 & r47) != 0 ? 0 : 0, (65536 & r47) != 0 ? 0 : 0, (131072 & r47) != 0 ? 0 : 0, (262144 & r47) != 0 ? 0 : 0, (524288 & r47) != 0 ? null : null, (r47 & 1048576) != 0 ? null : null);
                Paint.FontMetricsInt fontMetricsInt = new Paint.FontMetricsInt();
                fontMetricsInt.ascent = create.getLineAscent(0);
                fontMetricsInt.descent = create.getLineDescent(0);
                fontMetricsInt.top = create.getLineTop(0);
                fontMetricsInt.bottom = create.getLineBottom(0);
                return fontMetricsInt;
            }
            return null;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LineHeightStyleSpan[] getLineHeightSpans(TextLayout textLayout) {
        if (textLayout.getText() instanceof Spanned) {
            CharSequence text = textLayout.getText();
            C8632dsu.d(text);
            LineHeightStyleSpan[] lineHeightStyleSpanArr = (LineHeightStyleSpan[]) ((Spanned) text).getSpans(0, textLayout.getText().length(), LineHeightStyleSpan.class);
            return lineHeightStyleSpanArr.length == 0 ? new LineHeightStyleSpan[0] : lineHeightStyleSpanArr;
        }
        return new LineHeightStyleSpan[0];
    }

    public static final boolean isLineEllipsized(Layout layout, int i) {
        return layout.getEllipsisCount(i) > 0;
    }
}
