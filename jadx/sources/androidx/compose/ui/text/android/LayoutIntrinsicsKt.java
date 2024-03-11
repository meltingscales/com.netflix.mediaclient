package androidx.compose.ui.text.android;

import android.text.Layout;
import android.text.TextPaint;
import java.text.BreakIterator;
import java.util.Comparator;
import java.util.PriorityQueue;
import kotlin.Pair;

/* loaded from: classes.dex */
public final class LayoutIntrinsicsKt {
    public static final float minIntrinsicWidth(CharSequence charSequence, TextPaint textPaint) {
        BreakIterator lineInstance = BreakIterator.getLineInstance(textPaint.getTextLocale());
        int i = 0;
        lineInstance.setText(new CharSequenceCharacterIterator(charSequence, 0, charSequence.length()));
        PriorityQueue<Pair> priorityQueue = new PriorityQueue(10, new Comparator() { // from class: androidx.compose.ui.text.android.LayoutIntrinsicsKt$$ExternalSyntheticLambda0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int minIntrinsicWidth$lambda$0;
                minIntrinsicWidth$lambda$0 = LayoutIntrinsicsKt.minIntrinsicWidth$lambda$0((Pair) obj, (Pair) obj2);
                return minIntrinsicWidth$lambda$0;
            }
        });
        for (int next = lineInstance.next(); next != -1; next = lineInstance.next()) {
            if (priorityQueue.size() < 10) {
                priorityQueue.add(new Pair(Integer.valueOf(i), Integer.valueOf(next)));
            } else {
                Pair pair = (Pair) priorityQueue.peek();
                if (pair != null && ((Number) pair.a()).intValue() - ((Number) pair.d()).intValue() < next - i) {
                    priorityQueue.poll();
                    priorityQueue.add(new Pair(Integer.valueOf(i), Integer.valueOf(next)));
                }
            }
            i = next;
        }
        float f = 0.0f;
        for (Pair pair2 : priorityQueue) {
            f = Math.max(f, Layout.getDesiredWidth(charSequence, ((Number) pair2.b()).intValue(), ((Number) pair2.c()).intValue(), textPaint));
        }
        return f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int minIntrinsicWidth$lambda$0(Pair pair, Pair pair2) {
        return (((Number) pair.a()).intValue() - ((Number) pair.d()).intValue()) - (((Number) pair2.a()).intValue() - ((Number) pair2.d()).intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x001a, code lost:
        if (androidx.compose.ui.text.android.SpannedExtensionsKt.hasSpan(r2, androidx.compose.ui.text.android.style.LetterSpacingSpanEm.class) == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean shouldIncreaseMaxIntrinsic(float r1, java.lang.CharSequence r2, android.text.TextPaint r3) {
        /*
            r0 = 0
            int r1 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r1 != 0) goto L6
            goto L24
        L6:
            boolean r1 = r2 instanceof android.text.Spanned
            if (r1 == 0) goto L1c
            android.text.Spanned r2 = (android.text.Spanned) r2
            java.lang.Class<androidx.compose.ui.text.android.style.LetterSpacingSpanPx> r1 = androidx.compose.ui.text.android.style.LetterSpacingSpanPx.class
            boolean r1 = androidx.compose.ui.text.android.SpannedExtensionsKt.hasSpan(r2, r1)
            if (r1 != 0) goto L26
            java.lang.Class<androidx.compose.ui.text.android.style.LetterSpacingSpanEm> r1 = androidx.compose.ui.text.android.style.LetterSpacingSpanEm.class
            boolean r1 = androidx.compose.ui.text.android.SpannedExtensionsKt.hasSpan(r2, r1)
            if (r1 != 0) goto L26
        L1c:
            float r1 = r3.getLetterSpacing()
            int r1 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r1 != 0) goto L26
        L24:
            r1 = 0
            goto L27
        L26:
            r1 = 1
        L27:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.android.LayoutIntrinsicsKt.shouldIncreaseMaxIntrinsic(float, java.lang.CharSequence, android.text.TextPaint):boolean");
    }
}
