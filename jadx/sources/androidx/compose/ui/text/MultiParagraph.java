package androidx.compose.ui.text;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.platform.AndroidMultiParagraphDraw_androidKt;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Ref;
import o.C8569dql;
import o.C8571dqn;
import o.C8576dqs;
import o.C8627dsp;
import o.C8657dts;
import o.dpR;
import o.drM;

/* loaded from: classes.dex */
public final class MultiParagraph {
    private final boolean didExceedMaxLines;
    private final float height;
    private final MultiParagraphIntrinsics intrinsics;
    private final int lineCount;
    private final int maxLines;
    private final List<ParagraphInfo> paragraphInfoList;
    private final List<Rect> placeholderRects;
    private final float width;

    public /* synthetic */ MultiParagraph(MultiParagraphIntrinsics multiParagraphIntrinsics, long j, int i, boolean z, C8627dsp c8627dsp) {
        this(multiParagraphIntrinsics, j, i, z);
    }

    public final boolean getDidExceedMaxLines() {
        return this.didExceedMaxLines;
    }

    public final float getHeight() {
        return this.height;
    }

    public final MultiParagraphIntrinsics getIntrinsics() {
        return this.intrinsics;
    }

    public final int getLineCount() {
        return this.lineCount;
    }

    public final List<ParagraphInfo> getParagraphInfoList$ui_text_release() {
        return this.paragraphInfoList;
    }

    public final List<Rect> getPlaceholderRects() {
        return this.placeholderRects;
    }

    public final float getWidth() {
        return this.width;
    }

    private MultiParagraph(MultiParagraphIntrinsics multiParagraphIntrinsics, long j, int i, boolean z) {
        boolean z2;
        int m2472getMaxHeightimpl;
        int t;
        this.intrinsics = multiParagraphIntrinsics;
        this.maxLines = i;
        if (Constraints.m2475getMinWidthimpl(j) != 0 || Constraints.m2474getMinHeightimpl(j) != 0) {
            throw new IllegalArgumentException("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.".toString());
        }
        ArrayList arrayList = new ArrayList();
        List<ParagraphIntrinsicInfo> infoList$ui_text_release = multiParagraphIntrinsics.getInfoList$ui_text_release();
        int size = infoList$ui_text_release.size();
        int i2 = 0;
        int i3 = 0;
        float f = 0.0f;
        int i4 = 0;
        while (i4 < size) {
            ParagraphIntrinsicInfo paragraphIntrinsicInfo = infoList$ui_text_release.get(i4);
            ParagraphIntrinsics intrinsics = paragraphIntrinsicInfo.getIntrinsics();
            int m2473getMaxWidthimpl = Constraints.m2473getMaxWidthimpl(j);
            if (Constraints.m2468getHasBoundedHeightimpl(j)) {
                m2472getMaxHeightimpl = C8657dts.b(Constraints.m2472getMaxHeightimpl(j) - ParagraphKt.ceilToInt(f), i2);
            } else {
                m2472getMaxHeightimpl = Constraints.m2472getMaxHeightimpl(j);
            }
            Paragraph m2091Paragraph_EkL_Y = ParagraphKt.m2091Paragraph_EkL_Y(intrinsics, ConstraintsKt.Constraints$default(0, m2473getMaxWidthimpl, 0, m2472getMaxHeightimpl, 5, null), this.maxLines - i3, z);
            float height = f + m2091Paragraph_EkL_Y.getHeight();
            int lineCount = i3 + m2091Paragraph_EkL_Y.getLineCount();
            List<ParagraphIntrinsicInfo> list = infoList$ui_text_release;
            arrayList.add(new ParagraphInfo(m2091Paragraph_EkL_Y, paragraphIntrinsicInfo.getStartIndex(), paragraphIntrinsicInfo.getEndIndex(), i3, lineCount, f, height));
            if (!m2091Paragraph_EkL_Y.getDidExceedMaxLines()) {
                if (lineCount == this.maxLines) {
                    t = C8569dql.t(this.intrinsics.getInfoList$ui_text_release());
                    if (i4 != t) {
                    }
                }
                i4++;
                i3 = lineCount;
                f = height;
                i2 = 0;
                infoList$ui_text_release = list;
            }
            z2 = true;
            i3 = lineCount;
            f = height;
            break;
        }
        z2 = false;
        this.height = f;
        this.lineCount = i3;
        this.didExceedMaxLines = z2;
        this.paragraphInfoList = arrayList;
        this.width = Constraints.m2473getMaxWidthimpl(j);
        List<Rect> arrayList2 = new ArrayList<>(arrayList.size());
        int size2 = arrayList.size();
        for (int i5 = 0; i5 < size2; i5++) {
            ParagraphInfo paragraphInfo = (ParagraphInfo) arrayList.get(i5);
            List<Rect> placeholderRects = paragraphInfo.getParagraph().getPlaceholderRects();
            ArrayList arrayList3 = new ArrayList(placeholderRects.size());
            int size3 = placeholderRects.size();
            for (int i6 = 0; i6 < size3; i6++) {
                Rect rect = placeholderRects.get(i6);
                arrayList3.add(rect != null ? paragraphInfo.toGlobal(rect) : null);
            }
            C8571dqn.b(arrayList2, arrayList3);
        }
        if (arrayList2.size() < this.intrinsics.getPlaceholders().size()) {
            int size4 = this.intrinsics.getPlaceholders().size() - arrayList2.size();
            ArrayList arrayList4 = new ArrayList(size4);
            for (int i7 = 0; i7 < size4; i7++) {
                arrayList4.add(null);
            }
            arrayList2 = C8576dqs.g((Collection) arrayList2, (Iterable) arrayList4);
        }
        this.placeholderRects = arrayList2;
    }

    private final AnnotatedString getAnnotatedString() {
        return this.intrinsics.getAnnotatedString();
    }

    public final float getFirstBaseline() {
        if (this.paragraphInfoList.isEmpty()) {
            return 0.0f;
        }
        return this.paragraphInfoList.get(0).getParagraph().getFirstBaseline();
    }

    public final float getLastBaseline() {
        Object B;
        if (this.paragraphInfoList.isEmpty()) {
            return 0.0f;
        }
        B = C8576dqs.B((List<? extends Object>) this.paragraphInfoList);
        ParagraphInfo paragraphInfo = (ParagraphInfo) B;
        return paragraphInfo.toGlobalYPosition(paragraphInfo.getParagraph().getLastBaseline());
    }

    /* renamed from: paint-LG529CI  reason: not valid java name */
    public final void m2082paintLG529CI(Canvas canvas, long j, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i) {
        canvas.save();
        List<ParagraphInfo> list = this.paragraphInfoList;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            ParagraphInfo paragraphInfo = list.get(i2);
            paragraphInfo.getParagraph().mo2055paintLG529CI(canvas, j, shadow, textDecoration, drawStyle, i);
            canvas.translate(0.0f, paragraphInfo.getParagraph().getHeight());
        }
        canvas.restore();
    }

    /* renamed from: paint-hn5TExg  reason: not valid java name */
    public final void m2083painthn5TExg(Canvas canvas, Brush brush, float f, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i) {
        AndroidMultiParagraphDraw_androidKt.m2305drawMultiParagraph7AXcY_I(this, canvas, brush, f, shadow, textDecoration, drawStyle, i);
    }

    public final Path getPathForRange(final int i, final int i2) {
        if (i >= 0 && i <= i2 && i2 <= getAnnotatedString().getText().length()) {
            if (i == i2) {
                return AndroidPath_androidKt.Path();
            }
            final Path Path = AndroidPath_androidKt.Path();
            MultiParagraphKt.m2084findParagraphsByRangeSbBc2M(this.paragraphInfoList, TextRangeKt.TextRange(i, i2), new drM<ParagraphInfo, dpR>() { // from class: androidx.compose.ui.text.MultiParagraph$getPathForRange$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // o.drM
                public /* bridge */ /* synthetic */ dpR invoke(ParagraphInfo paragraphInfo) {
                    invoke2(paragraphInfo);
                    return dpR.c;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2(ParagraphInfo paragraphInfo) {
                    Path.m1398addPathUv8p0NA$default(Path.this, paragraphInfo.toGlobal(paragraphInfo.getParagraph().getPathForRange(paragraphInfo.toLocalIndex(i), paragraphInfo.toLocalIndex(i2))), 0L, 2, null);
                }
            });
            return Path;
        }
        throw new IllegalArgumentException(("Start(" + i + ") or End(" + i2 + ") is out of range [0.." + getAnnotatedString().getText().length() + "), or start > end!").toString());
    }

    public final int getLineForVerticalPosition(float f) {
        int findParagraphByY;
        if (f <= 0.0f) {
            findParagraphByY = 0;
        } else if (f >= this.height) {
            findParagraphByY = C8569dql.t(this.paragraphInfoList);
        } else {
            findParagraphByY = MultiParagraphKt.findParagraphByY(this.paragraphInfoList, f);
        }
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(findParagraphByY);
        if (paragraphInfo.getLength() == 0) {
            return paragraphInfo.getStartLineIndex();
        }
        return paragraphInfo.toGlobalLineIndex(paragraphInfo.getParagraph().getLineForVerticalPosition(paragraphInfo.toLocalYPosition(f)));
    }

    /* renamed from: getOffsetForPosition-k-4lQ0M  reason: not valid java name */
    public final int m2080getOffsetForPositionk4lQ0M(long j) {
        int t;
        if (Offset.m1138getYimpl(j) <= 0.0f) {
            t = 0;
        } else {
            t = Offset.m1138getYimpl(j) >= this.height ? C8569dql.t(this.paragraphInfoList) : MultiParagraphKt.findParagraphByY(this.paragraphInfoList, Offset.m1138getYimpl(j));
        }
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(t);
        if (paragraphInfo.getLength() == 0) {
            return paragraphInfo.getStartIndex();
        }
        return paragraphInfo.toGlobalIndex(paragraphInfo.getParagraph().mo2053getOffsetForPositionk4lQ0M(paragraphInfo.m2088toLocalMKHz9U(j)));
    }

    public final Rect getBoundingBox(int i) {
        requireIndexInRange(i);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(MultiParagraphKt.findParagraphByIndex(this.paragraphInfoList, i));
        return paragraphInfo.toGlobal(paragraphInfo.getParagraph().getBoundingBox(paragraphInfo.toLocalIndex(i)));
    }

    /* renamed from: fillBoundingBoxes-8ffj60Q  reason: not valid java name */
    public final float[] m2079fillBoundingBoxes8ffj60Q(final long j, final float[] fArr, int i) {
        requireIndexInRange(TextRange.m2155getMinimpl(j));
        requireIndexInRangeInclusiveEnd(TextRange.m2154getMaximpl(j));
        final Ref.IntRef intRef = new Ref.IntRef();
        intRef.b = i;
        final Ref.FloatRef floatRef = new Ref.FloatRef();
        MultiParagraphKt.m2084findParagraphsByRangeSbBc2M(this.paragraphInfoList, j, new drM<ParagraphInfo, dpR>() { // from class: androidx.compose.ui.text.MultiParagraph$fillBoundingBoxes$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* bridge */ /* synthetic */ dpR invoke(ParagraphInfo paragraphInfo) {
                invoke2(paragraphInfo);
                return dpR.c;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(ParagraphInfo paragraphInfo) {
                long j2 = j;
                float[] fArr2 = fArr;
                Ref.IntRef intRef2 = intRef;
                Ref.FloatRef floatRef2 = floatRef;
                long TextRange = TextRangeKt.TextRange(paragraphInfo.toLocalIndex(paragraphInfo.getStartIndex() > TextRange.m2155getMinimpl(j2) ? paragraphInfo.getStartIndex() : TextRange.m2155getMinimpl(j2)), paragraphInfo.toLocalIndex(paragraphInfo.getEndIndex() < TextRange.m2154getMaximpl(j2) ? paragraphInfo.getEndIndex() : TextRange.m2154getMaximpl(j2)));
                paragraphInfo.getParagraph().mo2052fillBoundingBoxes8ffj60Q(TextRange, fArr2, intRef2.b);
                int m2153getLengthimpl = intRef2.b + (TextRange.m2153getLengthimpl(TextRange) * 4);
                for (int i2 = intRef2.b; i2 < m2153getLengthimpl; i2 += 4) {
                    int i3 = i2 + 1;
                    float f = fArr2[i3];
                    float f2 = floatRef2.d;
                    fArr2[i3] = f + f2;
                    int i4 = i2 + 3;
                    fArr2[i4] = fArr2[i4] + f2;
                }
                intRef2.b = m2153getLengthimpl;
                floatRef2.d += paragraphInfo.getParagraph().getHeight();
            }
        });
        return fArr;
    }

    public final float getHorizontalPosition(int i, boolean z) {
        int findParagraphByIndex;
        requireIndexInRangeInclusiveEnd(i);
        if (i == getAnnotatedString().length()) {
            findParagraphByIndex = C8569dql.t(this.paragraphInfoList);
        } else {
            findParagraphByIndex = MultiParagraphKt.findParagraphByIndex(this.paragraphInfoList, i);
        }
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(findParagraphByIndex);
        return paragraphInfo.getParagraph().getHorizontalPosition(paragraphInfo.toLocalIndex(i), z);
    }

    public final ResolvedTextDirection getParagraphDirection(int i) {
        int findParagraphByIndex;
        requireIndexInRangeInclusiveEnd(i);
        if (i == getAnnotatedString().length()) {
            findParagraphByIndex = C8569dql.t(this.paragraphInfoList);
        } else {
            findParagraphByIndex = MultiParagraphKt.findParagraphByIndex(this.paragraphInfoList, i);
        }
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(findParagraphByIndex);
        return paragraphInfo.getParagraph().getParagraphDirection(paragraphInfo.toLocalIndex(i));
    }

    public final ResolvedTextDirection getBidiRunDirection(int i) {
        int findParagraphByIndex;
        requireIndexInRangeInclusiveEnd(i);
        if (i == getAnnotatedString().length()) {
            findParagraphByIndex = C8569dql.t(this.paragraphInfoList);
        } else {
            findParagraphByIndex = MultiParagraphKt.findParagraphByIndex(this.paragraphInfoList, i);
        }
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(findParagraphByIndex);
        return paragraphInfo.getParagraph().getBidiRunDirection(paragraphInfo.toLocalIndex(i));
    }

    /* renamed from: getWordBoundary--jx7JFs  reason: not valid java name */
    public final long m2081getWordBoundaryjx7JFs(int i) {
        int findParagraphByIndex;
        requireIndexInRangeInclusiveEnd(i);
        if (i == getAnnotatedString().length()) {
            findParagraphByIndex = C8569dql.t(this.paragraphInfoList);
        } else {
            findParagraphByIndex = MultiParagraphKt.findParagraphByIndex(this.paragraphInfoList, i);
        }
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(findParagraphByIndex);
        return paragraphInfo.m2087toGlobalGEjPoXI(paragraphInfo.getParagraph().mo2054getWordBoundaryjx7JFs(paragraphInfo.toLocalIndex(i)));
    }

    public final Rect getCursorRect(int i) {
        int findParagraphByIndex;
        requireIndexInRangeInclusiveEnd(i);
        if (i == getAnnotatedString().length()) {
            findParagraphByIndex = C8569dql.t(this.paragraphInfoList);
        } else {
            findParagraphByIndex = MultiParagraphKt.findParagraphByIndex(this.paragraphInfoList, i);
        }
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(findParagraphByIndex);
        return paragraphInfo.toGlobal(paragraphInfo.getParagraph().getCursorRect(paragraphInfo.toLocalIndex(i)));
    }

    public final int getLineForOffset(int i) {
        int findParagraphByIndex;
        if (i >= getAnnotatedString().length()) {
            findParagraphByIndex = C8569dql.t(this.paragraphInfoList);
        } else {
            findParagraphByIndex = i < 0 ? 0 : MultiParagraphKt.findParagraphByIndex(this.paragraphInfoList, i);
        }
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(findParagraphByIndex);
        return paragraphInfo.toGlobalLineIndex(paragraphInfo.getParagraph().getLineForOffset(paragraphInfo.toLocalIndex(i)));
    }

    public final float getLineLeft(int i) {
        requireLineIndexInRange(i);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, i));
        return paragraphInfo.getParagraph().getLineLeft(paragraphInfo.toLocalLineIndex(i));
    }

    public final float getLineRight(int i) {
        requireLineIndexInRange(i);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, i));
        return paragraphInfo.getParagraph().getLineRight(paragraphInfo.toLocalLineIndex(i));
    }

    public final float getLineTop(int i) {
        requireLineIndexInRange(i);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, i));
        return paragraphInfo.toGlobalYPosition(paragraphInfo.getParagraph().getLineTop(paragraphInfo.toLocalLineIndex(i)));
    }

    public final float getLineBottom(int i) {
        requireLineIndexInRange(i);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, i));
        return paragraphInfo.toGlobalYPosition(paragraphInfo.getParagraph().getLineBottom(paragraphInfo.toLocalLineIndex(i)));
    }

    public final int getLineStart(int i) {
        requireLineIndexInRange(i);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, i));
        return paragraphInfo.toGlobalIndex(paragraphInfo.getParagraph().getLineStart(paragraphInfo.toLocalLineIndex(i)));
    }

    public final int getLineEnd(int i, boolean z) {
        requireLineIndexInRange(i);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, i));
        return paragraphInfo.toGlobalIndex(paragraphInfo.getParagraph().getLineEnd(paragraphInfo.toLocalLineIndex(i), z));
    }

    private final void requireIndexInRange(int i) {
        if (i < 0 || i >= getAnnotatedString().getText().length()) {
            throw new IllegalArgumentException(("offset(" + i + ") is out of bounds [0, " + getAnnotatedString().length() + ')').toString());
        }
    }

    private final void requireIndexInRangeInclusiveEnd(int i) {
        if (i < 0 || i > getAnnotatedString().getText().length()) {
            throw new IllegalArgumentException(("offset(" + i + ") is out of bounds [0, " + getAnnotatedString().length() + ']').toString());
        }
    }

    private final void requireLineIndexInRange(int i) {
        if (i < 0 || i >= this.lineCount) {
            throw new IllegalArgumentException(("lineIndex(" + i + ") is out of bounds [0, " + this.lineCount + ')').toString());
        }
    }
}
