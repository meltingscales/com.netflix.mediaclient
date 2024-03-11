package androidx.compose.ui.text;

import android.graphics.Paint;
import android.graphics.RectF;
import android.text.Spanned;
import android.text.TextUtils;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.android.TextLayout;
import androidx.compose.ui.text.android.selection.WordBoundary;
import androidx.compose.ui.text.android.style.PlaceholderSpan;
import androidx.compose.ui.text.platform.AndroidParagraphHelper_androidKt;
import androidx.compose.ui.text.platform.AndroidParagraphIntrinsics;
import androidx.compose.ui.text.platform.AndroidTextPaint;
import androidx.compose.ui.text.platform.style.ShaderBrushSpan;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Constraints;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import o.C8569dql;
import o.C8627dsp;
import o.C8632dsu;
import o.C8657dts;
import o.InterfaceC8554dpx;
import o.dpB;
import o.drO;

/* loaded from: classes.dex */
public final class AndroidParagraph implements Paragraph {
    private final CharSequence charSequence;
    private final long constraints;
    private final boolean ellipsis;
    private final TextLayout layout;
    private final int maxLines;
    private final AndroidParagraphIntrinsics paragraphIntrinsics;
    private final List<Rect> placeholderRects;
    private final InterfaceC8554dpx wordBoundary$delegate;

    /* loaded from: classes.dex */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ResolvedTextDirection.values().length];
            try {
                iArr[ResolvedTextDirection.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ResolvedTextDirection.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ AndroidParagraph(AndroidParagraphIntrinsics androidParagraphIntrinsics, int i, boolean z, long j, C8627dsp c8627dsp) {
        this(androidParagraphIntrinsics, i, z, j);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public List<Rect> getPlaceholderRects() {
        return this.placeholderRects;
    }

    private AndroidParagraph(AndroidParagraphIntrinsics androidParagraphIntrinsics, int i, boolean z, long j) {
        CharSequence charSequence$ui_text_release;
        List<Rect> list;
        Rect rect;
        float horizontalPosition;
        float lineBaseline;
        int heightPx;
        float lineTop;
        float f;
        float lineBaseline2;
        InterfaceC8554dpx b;
        int access$numberOfLinesThatFitMaxHeight;
        int b2;
        this.paragraphIntrinsics = androidParagraphIntrinsics;
        this.maxLines = i;
        this.ellipsis = z;
        this.constraints = j;
        if (Constraints.m2474getMinHeightimpl(j) != 0 || Constraints.m2475getMinWidthimpl(j) != 0) {
            throw new IllegalArgumentException("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.".toString());
        }
        if (i < 1) {
            throw new IllegalArgumentException("maxLines should be greater than 0".toString());
        }
        TextStyle style = androidParagraphIntrinsics.getStyle();
        if (AndroidParagraph_androidKt.access$shouldAttachIndentationFixSpan(style, z)) {
            charSequence$ui_text_release = AndroidParagraph_androidKt.access$attachIndentationFixSpan(androidParagraphIntrinsics.getCharSequence$ui_text_release());
        } else {
            charSequence$ui_text_release = androidParagraphIntrinsics.getCharSequence$ui_text_release();
        }
        this.charSequence = charSequence$ui_text_release;
        int m2057access$toLayoutAlignaXe7zB0 = AndroidParagraph_androidKt.m2057access$toLayoutAlignaXe7zB0(style.m2177getTextAligne0LSkKk());
        boolean m2413equalsimpl0 = TextAlign.m2413equalsimpl0(style.m2177getTextAligne0LSkKk(), TextAlign.Companion.m2419getJustifye0LSkKk());
        int m2059access$toLayoutHyphenationFrequency3fSNIE = AndroidParagraph_androidKt.m2059access$toLayoutHyphenationFrequency3fSNIE(style.getParagraphStyle$ui_text_release().m2094getHyphensvmbZdU8());
        int m2058access$toLayoutBreakStrategyxImikfE = AndroidParagraph_androidKt.m2058access$toLayoutBreakStrategyxImikfE(LineBreak.m2355getStrategyfcGXIks(style.m2175getLineBreakrAG3T2k()));
        int m2060access$toLayoutLineBreakStylehpcqdu8 = AndroidParagraph_androidKt.m2060access$toLayoutLineBreakStylehpcqdu8(LineBreak.m2356getStrictnessusljTpc(style.m2175getLineBreakrAG3T2k()));
        int m2061access$toLayoutLineBreakWordStylewPN0Rpw = AndroidParagraph_androidKt.m2061access$toLayoutLineBreakWordStylewPN0Rpw(LineBreak.m2357getWordBreakjp8hJ3c(style.m2175getLineBreakrAG3T2k()));
        TextUtils.TruncateAt truncateAt = z ? TextUtils.TruncateAt.END : null;
        TextLayout constructTextLayout = constructTextLayout(m2057access$toLayoutAlignaXe7zB0, m2413equalsimpl0 ? 1 : 0, truncateAt, i, m2059access$toLayoutHyphenationFrequency3fSNIE, m2058access$toLayoutBreakStrategyxImikfE, m2060access$toLayoutLineBreakStylehpcqdu8, m2061access$toLayoutLineBreakWordStylewPN0Rpw);
        if (z && constructTextLayout.getHeight() > Constraints.m2472getMaxHeightimpl(j) && i > 1 && (access$numberOfLinesThatFitMaxHeight = AndroidParagraph_androidKt.access$numberOfLinesThatFitMaxHeight(constructTextLayout, Constraints.m2472getMaxHeightimpl(j))) >= 0 && access$numberOfLinesThatFitMaxHeight != i) {
            b2 = C8657dts.b(access$numberOfLinesThatFitMaxHeight, 1);
            constructTextLayout = constructTextLayout(m2057access$toLayoutAlignaXe7zB0, m2413equalsimpl0 ? 1 : 0, truncateAt, b2, m2059access$toLayoutHyphenationFrequency3fSNIE, m2058access$toLayoutBreakStrategyxImikfE, m2060access$toLayoutLineBreakStylehpcqdu8, m2061access$toLayoutLineBreakWordStylewPN0Rpw);
        }
        this.layout = constructTextLayout;
        getTextPaint$ui_text_release().m2313setBrush12SF9DM(style.getBrush(), SizeKt.Size(getWidth(), getHeight()), style.getAlpha());
        for (ShaderBrushSpan shaderBrushSpan : getShaderBrushSpans(this.layout)) {
            shaderBrushSpan.m2330setSizeuvyYCjk(SizeKt.Size(getWidth(), getHeight()));
        }
        CharSequence charSequence = this.charSequence;
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            Object[] spans = spanned.getSpans(0, charSequence.length(), PlaceholderSpan.class);
            ArrayList arrayList = new ArrayList(spans.length);
            for (Object obj : spans) {
                PlaceholderSpan placeholderSpan = (PlaceholderSpan) obj;
                int spanStart = spanned.getSpanStart(placeholderSpan);
                int spanEnd = spanned.getSpanEnd(placeholderSpan);
                int lineForOffset = this.layout.getLineForOffset(spanStart);
                byte b3 = lineForOffset >= this.maxLines ? (byte) 1 : (byte) 0;
                byte b4 = (this.layout.getLineEllipsisCount(lineForOffset) <= 0 || spanEnd <= this.layout.getLineEllipsisOffset(lineForOffset)) ? (byte) 0 : (byte) 1;
                byte b5 = spanEnd > this.layout.getLineEnd(lineForOffset) ? (byte) 1 : (byte) 0;
                if (b4 == 0 && b5 == 0 && b3 == 0) {
                    int i2 = WhenMappings.$EnumSwitchMapping$0[getBidiRunDirection(spanStart).ordinal()];
                    if (i2 == 1) {
                        horizontalPosition = getHorizontalPosition(spanStart, true);
                    } else if (i2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    } else {
                        horizontalPosition = getHorizontalPosition(spanStart, true) - placeholderSpan.getWidthPx();
                    }
                    float widthPx = placeholderSpan.getWidthPx();
                    TextLayout textLayout = this.layout;
                    switch (placeholderSpan.getVerticalAlign()) {
                        case 0:
                            lineBaseline = textLayout.getLineBaseline(lineForOffset);
                            heightPx = placeholderSpan.getHeightPx();
                            lineTop = lineBaseline - heightPx;
                            break;
                        case 1:
                            lineTop = textLayout.getLineTop(lineForOffset);
                            break;
                        case 2:
                            lineBaseline = textLayout.getLineBottom(lineForOffset);
                            heightPx = placeholderSpan.getHeightPx();
                            lineTop = lineBaseline - heightPx;
                            break;
                        case 3:
                            lineTop = ((textLayout.getLineTop(lineForOffset) + textLayout.getLineBottom(lineForOffset)) - placeholderSpan.getHeightPx()) / 2;
                            break;
                        case 4:
                            f = placeholderSpan.getFontMetrics().ascent;
                            lineBaseline2 = textLayout.getLineBaseline(lineForOffset);
                            lineTop = f + lineBaseline2;
                            break;
                        case 5:
                            lineTop = (placeholderSpan.getFontMetrics().descent + textLayout.getLineBaseline(lineForOffset)) - placeholderSpan.getHeightPx();
                            break;
                        case 6:
                            Paint.FontMetricsInt fontMetrics = placeholderSpan.getFontMetrics();
                            f = ((fontMetrics.ascent + fontMetrics.descent) - placeholderSpan.getHeightPx()) / 2;
                            lineBaseline2 = textLayout.getLineBaseline(lineForOffset);
                            lineTop = f + lineBaseline2;
                            break;
                        default:
                            throw new IllegalStateException("unexpected verticalAlignment");
                    }
                    rect = new Rect(horizontalPosition, lineTop, widthPx + horizontalPosition, placeholderSpan.getHeightPx() + lineTop);
                } else {
                    rect = null;
                }
                arrayList.add(rect);
            }
            list = arrayList;
        } else {
            list = C8569dql.i();
        }
        this.placeholderRects = list;
        b = dpB.b(LazyThreadSafetyMode.e, new drO<WordBoundary>() { // from class: androidx.compose.ui.text.AndroidParagraph$wordBoundary$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // o.drO
            public final WordBoundary invoke() {
                TextLayout textLayout2;
                Locale textLocale$ui_text_release = AndroidParagraph.this.getTextLocale$ui_text_release();
                textLayout2 = AndroidParagraph.this.layout;
                return new WordBoundary(textLocale$ui_text_release, textLayout2.getText());
            }
        });
        this.wordBoundary$delegate = b;
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getWidth() {
        return Constraints.m2473getMaxWidthimpl(this.constraints);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getHeight() {
        return this.layout.getHeight();
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getMaxIntrinsicWidth() {
        return this.paragraphIntrinsics.getMaxIntrinsicWidth();
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getMinIntrinsicWidth() {
        return this.paragraphIntrinsics.getMinIntrinsicWidth();
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getFirstBaseline() {
        return getLineBaseline$ui_text_release(0);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getLastBaseline() {
        return getLineBaseline$ui_text_release(getLineCount() - 1);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public boolean getDidExceedMaxLines() {
        return this.layout.getDidExceedMaxLines();
    }

    public final Locale getTextLocale$ui_text_release() {
        return this.paragraphIntrinsics.getTextPaint$ui_text_release().getTextLocale();
    }

    @Override // androidx.compose.ui.text.Paragraph
    public int getLineCount() {
        return this.layout.getLineCount();
    }

    public final AndroidTextPaint getTextPaint$ui_text_release() {
        return this.paragraphIntrinsics.getTextPaint$ui_text_release();
    }

    @Override // androidx.compose.ui.text.Paragraph
    public int getLineForVerticalPosition(float f) {
        return this.layout.getLineForVertical((int) f);
    }

    @Override // androidx.compose.ui.text.Paragraph
    /* renamed from: getOffsetForPosition-k-4lQ0M  reason: not valid java name */
    public int mo2053getOffsetForPositionk4lQ0M(long j) {
        return this.layout.getOffsetForHorizontal(this.layout.getLineForVertical((int) Offset.m1138getYimpl(j)), Offset.m1137getXimpl(j));
    }

    @Override // androidx.compose.ui.text.Paragraph
    public Rect getBoundingBox(int i) {
        if (i < 0 || i >= this.charSequence.length()) {
            throw new IllegalArgumentException(("offset(" + i + ") is out of bounds [0," + this.charSequence.length() + ')').toString());
        }
        RectF boundingBox = this.layout.getBoundingBox(i);
        return new Rect(boundingBox.left, boundingBox.top, boundingBox.right, boundingBox.bottom);
    }

    @Override // androidx.compose.ui.text.Paragraph
    /* renamed from: fillBoundingBoxes-8ffj60Q  reason: not valid java name */
    public void mo2052fillBoundingBoxes8ffj60Q(long j, float[] fArr, int i) {
        this.layout.fillBoundingBoxes(TextRange.m2155getMinimpl(j), TextRange.m2154getMaximpl(j), fArr, i);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public Path getPathForRange(int i, int i2) {
        if (i < 0 || i > i2 || i2 > this.charSequence.length()) {
            throw new IllegalArgumentException(("start(" + i + ") or end(" + i2 + ") is out of range [0.." + this.charSequence.length() + "], or start > end!").toString());
        }
        android.graphics.Path path = new android.graphics.Path();
        this.layout.getSelectionPath(i, i2, path);
        return AndroidPath_androidKt.asComposePath(path);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public Rect getCursorRect(int i) {
        if (i < 0 || i > this.charSequence.length()) {
            throw new IllegalArgumentException(("offset(" + i + ") is out of bounds [0," + this.charSequence.length() + ']').toString());
        }
        float primaryHorizontal$default = TextLayout.getPrimaryHorizontal$default(this.layout, i, false, 2, null);
        int lineForOffset = this.layout.getLineForOffset(i);
        return new Rect(primaryHorizontal$default, this.layout.getLineTop(lineForOffset), primaryHorizontal$default, this.layout.getLineBottom(lineForOffset));
    }

    private final WordBoundary getWordBoundary() {
        return (WordBoundary) this.wordBoundary$delegate.getValue();
    }

    @Override // androidx.compose.ui.text.Paragraph
    /* renamed from: getWordBoundary--jx7JFs  reason: not valid java name */
    public long mo2054getWordBoundaryjx7JFs(int i) {
        return TextRangeKt.TextRange(getWordBoundary().getWordStart(i), getWordBoundary().getWordEnd(i));
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getLineLeft(int i) {
        return this.layout.getLineLeft(i);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getLineRight(int i) {
        return this.layout.getLineRight(i);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getLineTop(int i) {
        return this.layout.getLineTop(i);
    }

    public final float getLineBaseline$ui_text_release(int i) {
        return this.layout.getLineBaseline(i);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getLineBottom(int i) {
        return this.layout.getLineBottom(i);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public int getLineStart(int i) {
        return this.layout.getLineStart(i);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public int getLineEnd(int i, boolean z) {
        if (z) {
            return this.layout.getLineVisibleEnd(i);
        }
        return this.layout.getLineEnd(i);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public int getLineForOffset(int i) {
        return this.layout.getLineForOffset(i);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getHorizontalPosition(int i, boolean z) {
        if (z) {
            return TextLayout.getPrimaryHorizontal$default(this.layout, i, false, 2, null);
        }
        return TextLayout.getSecondaryHorizontal$default(this.layout, i, false, 2, null);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public ResolvedTextDirection getParagraphDirection(int i) {
        return this.layout.getParagraphDirection(this.layout.getLineForOffset(i)) == 1 ? ResolvedTextDirection.Ltr : ResolvedTextDirection.Rtl;
    }

    @Override // androidx.compose.ui.text.Paragraph
    public ResolvedTextDirection getBidiRunDirection(int i) {
        if (this.layout.isRtlCharAt(i)) {
            return ResolvedTextDirection.Rtl;
        }
        return ResolvedTextDirection.Ltr;
    }

    private final ShaderBrushSpan[] getShaderBrushSpans(TextLayout textLayout) {
        if (textLayout.getText() instanceof Spanned) {
            CharSequence text = textLayout.getText();
            C8632dsu.d(text);
            ShaderBrushSpan[] shaderBrushSpanArr = (ShaderBrushSpan[]) ((Spanned) text).getSpans(0, textLayout.getText().length(), ShaderBrushSpan.class);
            return shaderBrushSpanArr.length == 0 ? new ShaderBrushSpan[0] : shaderBrushSpanArr;
        }
        return new ShaderBrushSpan[0];
    }

    @Override // androidx.compose.ui.text.Paragraph
    /* renamed from: paint-LG529CI  reason: not valid java name */
    public void mo2055paintLG529CI(Canvas canvas, long j, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i) {
        int m2311getBlendMode0nO6VwU = getTextPaint$ui_text_release().m2311getBlendMode0nO6VwU();
        AndroidTextPaint textPaint$ui_text_release = getTextPaint$ui_text_release();
        textPaint$ui_text_release.m2314setColor8_81llA(j);
        textPaint$ui_text_release.setShadow(shadow);
        textPaint$ui_text_release.setTextDecoration(textDecoration);
        textPaint$ui_text_release.setDrawStyle(drawStyle);
        textPaint$ui_text_release.m2312setBlendModes9anfk8(i);
        paint(canvas);
        getTextPaint$ui_text_release().m2312setBlendModes9anfk8(m2311getBlendMode0nO6VwU);
    }

    @Override // androidx.compose.ui.text.Paragraph
    /* renamed from: paint-hn5TExg  reason: not valid java name */
    public void mo2056painthn5TExg(Canvas canvas, Brush brush, float f, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i) {
        int m2311getBlendMode0nO6VwU = getTextPaint$ui_text_release().m2311getBlendMode0nO6VwU();
        AndroidTextPaint textPaint$ui_text_release = getTextPaint$ui_text_release();
        textPaint$ui_text_release.m2313setBrush12SF9DM(brush, SizeKt.Size(getWidth(), getHeight()), f);
        textPaint$ui_text_release.setShadow(shadow);
        textPaint$ui_text_release.setTextDecoration(textDecoration);
        textPaint$ui_text_release.setDrawStyle(drawStyle);
        textPaint$ui_text_release.m2312setBlendModes9anfk8(i);
        paint(canvas);
        getTextPaint$ui_text_release().m2312setBlendModes9anfk8(m2311getBlendMode0nO6VwU);
    }

    private final void paint(Canvas canvas) {
        android.graphics.Canvas nativeCanvas = AndroidCanvas_androidKt.getNativeCanvas(canvas);
        if (getDidExceedMaxLines()) {
            nativeCanvas.save();
            nativeCanvas.clipRect(0.0f, 0.0f, getWidth(), getHeight());
        }
        this.layout.paint(nativeCanvas);
        if (getDidExceedMaxLines()) {
            nativeCanvas.restore();
        }
    }

    private final TextLayout constructTextLayout(int i, int i2, TextUtils.TruncateAt truncateAt, int i3, int i4, int i5, int i6, int i7) {
        return new TextLayout(this.charSequence, getWidth(), getTextPaint$ui_text_release(), i, truncateAt, this.paragraphIntrinsics.getTextDirectionHeuristic$ui_text_release(), 1.0f, 0.0f, AndroidParagraphHelper_androidKt.isIncludeFontPaddingEnabled(this.paragraphIntrinsics.getStyle()), true, i3, i5, i6, i7, i4, i2, null, null, this.paragraphIntrinsics.getLayoutIntrinsics$ui_text_release(), 196736, null);
    }
}
