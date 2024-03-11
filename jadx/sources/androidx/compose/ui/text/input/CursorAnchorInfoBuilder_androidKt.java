package androidx.compose.ui.text.input;

import android.graphics.Matrix;
import android.os.Build;
import android.view.inputmethod.CursorAnchorInfo;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.unit.IntSize;
import o.C8657dts;

/* loaded from: classes.dex */
public final class CursorAnchorInfoBuilder_androidKt {
    public static final CursorAnchorInfo build(CursorAnchorInfo.Builder builder, TextFieldValue textFieldValue, OffsetMapping offsetMapping, TextLayoutResult textLayoutResult, Matrix matrix, Rect rect, Rect rect2, boolean z, boolean z2, boolean z3, boolean z4) {
        builder.reset();
        builder.setMatrix(matrix);
        int m2155getMinimpl = TextRange.m2155getMinimpl(textFieldValue.m2302getSelectiond9O1mEE());
        builder.setSelectionRange(m2155getMinimpl, TextRange.m2154getMaximpl(textFieldValue.m2302getSelectiond9O1mEE()));
        if (z) {
            setInsertionMarker(builder, m2155getMinimpl, offsetMapping, textLayoutResult, rect);
        }
        if (z2) {
            TextRange m2301getCompositionMzsxiRA = textFieldValue.m2301getCompositionMzsxiRA();
            int m2155getMinimpl2 = m2301getCompositionMzsxiRA != null ? TextRange.m2155getMinimpl(m2301getCompositionMzsxiRA.m2161unboximpl()) : -1;
            TextRange m2301getCompositionMzsxiRA2 = textFieldValue.m2301getCompositionMzsxiRA();
            int m2154getMaximpl = m2301getCompositionMzsxiRA2 != null ? TextRange.m2154getMaximpl(m2301getCompositionMzsxiRA2.m2161unboximpl()) : -1;
            if (m2155getMinimpl2 >= 0 && m2155getMinimpl2 < m2154getMaximpl) {
                builder.setComposingText(m2155getMinimpl2, textFieldValue.getText().subSequence(m2155getMinimpl2, m2154getMaximpl));
                addCharacterBounds(builder, m2155getMinimpl2, m2154getMaximpl, offsetMapping, textLayoutResult, rect);
            }
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 33 && z3) {
            CursorAnchorInfoApi33Helper.setEditorBoundsInfo(builder, rect2);
        }
        if (i >= 34 && z4) {
            CursorAnchorInfoApi34Helper.addVisibleLineBounds(builder, textLayoutResult, rect);
        }
        return builder.build();
    }

    private static final CursorAnchorInfo.Builder setInsertionMarker(CursorAnchorInfo.Builder builder, int i, OffsetMapping offsetMapping, TextLayoutResult textLayoutResult, Rect rect) {
        float a;
        if (i < 0) {
            return builder;
        }
        int originalToTransformed = offsetMapping.originalToTransformed(i);
        Rect cursorRect = textLayoutResult.getCursorRect(originalToTransformed);
        a = C8657dts.a(cursorRect.getLeft(), 0.0f, IntSize.m2547getWidthimpl(textLayoutResult.m2143getSizeYbymL2g()));
        boolean containsInclusive = containsInclusive(rect, a, cursorRect.getTop());
        boolean containsInclusive2 = containsInclusive(rect, a, cursorRect.getBottom());
        int i2 = 1;
        boolean z = textLayoutResult.getBidiRunDirection(originalToTransformed) == ResolvedTextDirection.Rtl;
        if (!containsInclusive && !containsInclusive2) {
            i2 = 0;
        }
        if (!containsInclusive || !containsInclusive2) {
            i2 |= 2;
        }
        builder.setInsertionMarkerLocation(a, cursorRect.getTop(), cursorRect.getBottom(), cursorRect.getBottom(), z ? i2 | 4 : i2);
        return builder;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x005d, code lost:
        if (containsInclusive(r22, r11.getRight(), r11.getBottom()) == false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final android.view.inputmethod.CursorAnchorInfo.Builder addCharacterBounds(android.view.inputmethod.CursorAnchorInfo.Builder r17, int r18, int r19, androidx.compose.ui.text.input.OffsetMapping r20, androidx.compose.ui.text.TextLayoutResult r21, androidx.compose.ui.geometry.Rect r22) {
        /*
            r0 = r19
            r1 = r20
            r2 = r18
            r3 = r22
            int r4 = r1.originalToTransformed(r2)
            int r5 = r1.originalToTransformed(r0)
            int r6 = r5 - r4
            int r6 = r6 * 4
            float[] r6 = new float[r6]
            androidx.compose.ui.text.MultiParagraph r7 = r21.getMultiParagraph()
            long r8 = androidx.compose.ui.text.TextRangeKt.TextRange(r4, r5)
            r5 = 0
            r7.m2079fillBoundingBoxes8ffj60Q(r8, r6, r5)
        L22:
            if (r2 >= r0) goto L8b
            int r5 = r1.originalToTransformed(r2)
            int r7 = r5 - r4
            int r7 = r7 * 4
            r8 = r6[r7]
            int r9 = r7 + 1
            r9 = r6[r9]
            int r10 = r7 + 2
            r10 = r6[r10]
            int r7 = r7 + 3
            r7 = r6[r7]
            androidx.compose.ui.geometry.Rect r11 = new androidx.compose.ui.geometry.Rect
            r11.<init>(r8, r9, r10, r7)
            boolean r7 = r3.overlaps(r11)
            float r8 = r11.getLeft()
            float r9 = r11.getTop()
            boolean r8 = containsInclusive(r3, r8, r9)
            if (r8 == 0) goto L5f
            float r8 = r11.getRight()
            float r9 = r11.getBottom()
            boolean r8 = containsInclusive(r3, r8, r9)
            if (r8 != 0) goto L61
        L5f:
            r7 = r7 | 2
        L61:
            r8 = r21
            androidx.compose.ui.text.style.ResolvedTextDirection r5 = r8.getBidiRunDirection(r5)
            androidx.compose.ui.text.style.ResolvedTextDirection r9 = androidx.compose.ui.text.style.ResolvedTextDirection.Rtl
            if (r5 != r9) goto L70
            r5 = r7 | 4
            r16 = r5
            goto L72
        L70:
            r16 = r7
        L72:
            float r12 = r11.getLeft()
            float r13 = r11.getTop()
            float r14 = r11.getRight()
            float r15 = r11.getBottom()
            r10 = r17
            r11 = r2
            r10.addCharacterBounds(r11, r12, r13, r14, r15, r16)
            int r2 = r2 + 1
            goto L22
        L8b:
            return r17
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.input.CursorAnchorInfoBuilder_androidKt.addCharacterBounds(android.view.inputmethod.CursorAnchorInfo$Builder, int, int, androidx.compose.ui.text.input.OffsetMapping, androidx.compose.ui.text.TextLayoutResult, androidx.compose.ui.geometry.Rect):android.view.inputmethod.CursorAnchorInfo$Builder");
    }

    private static final boolean containsInclusive(Rect rect, float f, float f2) {
        float left = rect.getLeft();
        if (f <= rect.getRight() && left <= f) {
            float top = rect.getTop();
            if (f2 <= rect.getBottom() && top <= f2) {
                return true;
            }
        }
        return false;
    }
}
