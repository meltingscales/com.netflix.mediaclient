package androidx.compose.ui.text;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.unit.IntSize;
import java.util.List;
import o.C8627dsp;
import o.C8632dsu;

/* loaded from: classes.dex */
public final class TextLayoutResult {
    public static final int $stable = 8;
    private final float firstBaseline;
    private final float lastBaseline;
    private final TextLayoutInput layoutInput;
    private final MultiParagraph multiParagraph;
    private final List<Rect> placeholderRects;
    private final long size;

    public /* synthetic */ TextLayoutResult(TextLayoutInput textLayoutInput, MultiParagraph multiParagraph, long j, C8627dsp c8627dsp) {
        this(textLayoutInput, multiParagraph, j);
    }

    public final float getFirstBaseline() {
        return this.firstBaseline;
    }

    public final float getLastBaseline() {
        return this.lastBaseline;
    }

    public final TextLayoutInput getLayoutInput() {
        return this.layoutInput;
    }

    public final MultiParagraph getMultiParagraph() {
        return this.multiParagraph;
    }

    public final List<Rect> getPlaceholderRects() {
        return this.placeholderRects;
    }

    /* renamed from: getSize-YbymL2g  reason: not valid java name */
    public final long m2143getSizeYbymL2g() {
        return this.size;
    }

    private TextLayoutResult(TextLayoutInput textLayoutInput, MultiParagraph multiParagraph, long j) {
        this.layoutInput = textLayoutInput;
        this.multiParagraph = multiParagraph;
        this.size = j;
        this.firstBaseline = multiParagraph.getFirstBaseline();
        this.lastBaseline = multiParagraph.getLastBaseline();
        this.placeholderRects = multiParagraph.getPlaceholderRects();
    }

    public final boolean getDidOverflowHeight() {
        return this.multiParagraph.getDidExceedMaxLines() || ((float) IntSize.m2546getHeightimpl(this.size)) < this.multiParagraph.getHeight();
    }

    public final boolean getDidOverflowWidth() {
        return ((float) IntSize.m2547getWidthimpl(this.size)) < this.multiParagraph.getWidth();
    }

    public final boolean getHasVisualOverflow() {
        return getDidOverflowWidth() || getDidOverflowHeight();
    }

    public final int getLineCount() {
        return this.multiParagraph.getLineCount();
    }

    public final int getLineStart(int i) {
        return this.multiParagraph.getLineStart(i);
    }

    public static /* synthetic */ int getLineEnd$default(TextLayoutResult textLayoutResult, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return textLayoutResult.getLineEnd(i, z);
    }

    public final int getLineEnd(int i, boolean z) {
        return this.multiParagraph.getLineEnd(i, z);
    }

    public final float getLineTop(int i) {
        return this.multiParagraph.getLineTop(i);
    }

    public final float getLineBottom(int i) {
        return this.multiParagraph.getLineBottom(i);
    }

    public final float getLineLeft(int i) {
        return this.multiParagraph.getLineLeft(i);
    }

    public final float getLineRight(int i) {
        return this.multiParagraph.getLineRight(i);
    }

    public final int getLineForOffset(int i) {
        return this.multiParagraph.getLineForOffset(i);
    }

    public final int getLineForVerticalPosition(float f) {
        return this.multiParagraph.getLineForVerticalPosition(f);
    }

    public final float getHorizontalPosition(int i, boolean z) {
        return this.multiParagraph.getHorizontalPosition(i, z);
    }

    public final ResolvedTextDirection getParagraphDirection(int i) {
        return this.multiParagraph.getParagraphDirection(i);
    }

    public final ResolvedTextDirection getBidiRunDirection(int i) {
        return this.multiParagraph.getBidiRunDirection(i);
    }

    /* renamed from: getOffsetForPosition-k-4lQ0M  reason: not valid java name */
    public final int m2142getOffsetForPositionk4lQ0M(long j) {
        return this.multiParagraph.m2080getOffsetForPositionk4lQ0M(j);
    }

    public final Rect getBoundingBox(int i) {
        return this.multiParagraph.getBoundingBox(i);
    }

    /* renamed from: getWordBoundary--jx7JFs  reason: not valid java name */
    public final long m2144getWordBoundaryjx7JFs(int i) {
        return this.multiParagraph.m2081getWordBoundaryjx7JFs(i);
    }

    public final Rect getCursorRect(int i) {
        return this.multiParagraph.getCursorRect(i);
    }

    public final Path getPathForRange(int i, int i2) {
        return this.multiParagraph.getPathForRange(i, i2);
    }

    /* renamed from: copy-O0kMr_c$default  reason: not valid java name */
    public static /* synthetic */ TextLayoutResult m2140copyO0kMr_c$default(TextLayoutResult textLayoutResult, TextLayoutInput textLayoutInput, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            textLayoutInput = textLayoutResult.layoutInput;
        }
        if ((i & 2) != 0) {
            j = textLayoutResult.size;
        }
        return textLayoutResult.m2141copyO0kMr_c(textLayoutInput, j);
    }

    /* renamed from: copy-O0kMr_c  reason: not valid java name */
    public final TextLayoutResult m2141copyO0kMr_c(TextLayoutInput textLayoutInput, long j) {
        return new TextLayoutResult(textLayoutInput, this.multiParagraph, j, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TextLayoutResult) {
            TextLayoutResult textLayoutResult = (TextLayoutResult) obj;
            return C8632dsu.c(this.layoutInput, textLayoutResult.layoutInput) && C8632dsu.c(this.multiParagraph, textLayoutResult.multiParagraph) && IntSize.m2545equalsimpl0(this.size, textLayoutResult.size) && this.firstBaseline == textLayoutResult.firstBaseline && this.lastBaseline == textLayoutResult.lastBaseline && C8632dsu.c(this.placeholderRects, textLayoutResult.placeholderRects);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.layoutInput.hashCode();
        int hashCode2 = this.multiParagraph.hashCode();
        int m2548hashCodeimpl = IntSize.m2548hashCodeimpl(this.size);
        int hashCode3 = Float.hashCode(this.firstBaseline);
        return (((((((((hashCode * 31) + hashCode2) * 31) + m2548hashCodeimpl) * 31) + hashCode3) * 31) + Float.hashCode(this.lastBaseline)) * 31) + this.placeholderRects.hashCode();
    }

    public String toString() {
        return "TextLayoutResult(layoutInput=" + this.layoutInput + ", multiParagraph=" + this.multiParagraph + ", size=" + ((Object) IntSize.m2549toStringimpl(this.size)) + ", firstBaseline=" + this.firstBaseline + ", lastBaseline=" + this.lastBaseline + ", placeholderRects=" + this.placeholderRects + ')';
    }
}
