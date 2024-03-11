package androidx.compose.ui.text.android;

import android.text.Layout;
import java.text.Bidi;
import java.util.ArrayList;
import java.util.List;
import o.C8563dqf;
import o.C8569dql;
import o.C8632dsu;
import o.C8657dts;
import o.duD;

/* loaded from: classes.dex */
public final class LayoutHelper {
    private final boolean[] bidiProcessedParagraphs;
    private final Layout layout;
    private final List<Bidi> paragraphBidi;
    private final int paragraphCount;
    private final List<Integer> paragraphEnds;
    private char[] tmpBuffer;

    public LayoutHelper(Layout layout) {
        int b;
        this.layout = layout;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        do {
            b = duD.b(this.layout.getText(), '\n', i, false, 4, (Object) null);
            i = b < 0 ? this.layout.getText().length() : b + 1;
            arrayList.add(Integer.valueOf(i));
        } while (i < this.layout.getText().length());
        this.paragraphEnds = arrayList;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            arrayList2.add(null);
        }
        this.paragraphBidi = arrayList2;
        this.bidiProcessedParagraphs = new boolean[this.paragraphEnds.size()];
        this.paragraphCount = this.paragraphEnds.size();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005d, code lost:
        if (r0.getRunCount() == 1) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.text.Bidi analyzeBidi(int r12) {
        /*
            r11 = this;
            boolean[] r0 = r11.bidiProcessedParagraphs
            boolean r0 = r0[r12]
            if (r0 == 0) goto Lf
            java.util.List<java.text.Bidi> r0 = r11.paragraphBidi
            java.lang.Object r12 = r0.get(r12)
            java.text.Bidi r12 = (java.text.Bidi) r12
            return r12
        Lf:
            r0 = 0
            if (r12 != 0) goto L14
            r1 = r0
            goto L22
        L14:
            java.util.List<java.lang.Integer> r1 = r11.paragraphEnds
            int r2 = r12 + (-1)
            java.lang.Object r1 = r1.get(r2)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
        L22:
            java.util.List<java.lang.Integer> r2 = r11.paragraphEnds
            java.lang.Object r2 = r2.get(r12)
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            int r8 = r2 - r1
            char[] r3 = r11.tmpBuffer
            if (r3 == 0) goto L37
            int r4 = r3.length
            if (r4 >= r8) goto L39
        L37:
            char[] r3 = new char[r8]
        L39:
            r10 = r3
            android.text.Layout r3 = r11.layout
            java.lang.CharSequence r3 = r3.getText()
            android.text.TextUtils.getChars(r3, r1, r2, r10, r0)
            boolean r0 = java.text.Bidi.requiresBidi(r10, r0, r8)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L5f
            boolean r9 = r11.isRtlParagraph(r12)
            java.text.Bidi r0 = new java.text.Bidi
            r5 = 0
            r6 = 0
            r7 = 0
            r3 = r0
            r4 = r10
            r3.<init>(r4, r5, r6, r7, r8, r9)
            int r3 = r0.getRunCount()
            if (r3 != r2) goto L60
        L5f:
            r0 = r1
        L60:
            java.util.List<java.text.Bidi> r3 = r11.paragraphBidi
            r3.set(r12, r0)
            boolean[] r3 = r11.bidiProcessedParagraphs
            r3[r12] = r2
            if (r0 == 0) goto L72
            char[] r12 = r11.tmpBuffer
            if (r10 != r12) goto L71
            r10 = r1
            goto L72
        L71:
            r10 = r12
        L72:
            r11.tmpBuffer = r10
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.android.LayoutHelper.analyzeBidi(int):java.text.Bidi");
    }

    public final int getParagraphForOffset(int i, boolean z) {
        int b;
        b = C8569dql.b(this.paragraphEnds, Integer.valueOf(i), 0, 0, 6, null);
        int i2 = b < 0 ? -(b + 1) : b + 1;
        if (z && i2 > 0) {
            int i3 = i2 - 1;
            if (i == this.paragraphEnds.get(i3).intValue()) {
                return i3;
            }
        }
        return i2;
    }

    public final int getParagraphStart(int i) {
        if (i == 0) {
            return 0;
        }
        return this.paragraphEnds.get(i - 1).intValue();
    }

    public final boolean isRtlParagraph(int i) {
        return this.layout.getParagraphDirection(this.layout.getLineForOffset(getParagraphStart(i))) == -1;
    }

    public final float getHorizontalPosition(int i, boolean z, boolean z2) {
        int w;
        int w2;
        int i2 = i;
        if (!z2) {
            return getDownstreamHorizontal(i, z);
        }
        int lineForOffset = LayoutCompatKt.getLineForOffset(this.layout, i2, z2);
        int lineStart = this.layout.getLineStart(lineForOffset);
        int lineEnd = this.layout.getLineEnd(lineForOffset);
        if (i2 != lineStart && i2 != lineEnd) {
            return getDownstreamHorizontal(i, z);
        }
        if (i2 == 0 || i2 == this.layout.getText().length()) {
            return getDownstreamHorizontal(i, z);
        }
        int paragraphForOffset = getParagraphForOffset(i2, z2);
        boolean isRtlParagraph = isRtlParagraph(paragraphForOffset);
        int lineEndToVisibleEnd = lineEndToVisibleEnd(lineEnd, lineStart);
        int paragraphStart = getParagraphStart(paragraphForOffset);
        Bidi analyzeBidi = analyzeBidi(paragraphForOffset);
        Bidi createLineBidi = analyzeBidi != null ? analyzeBidi.createLineBidi(lineStart - paragraphStart, lineEndToVisibleEnd - paragraphStart) : null;
        if (createLineBidi == null || createLineBidi.getRunCount() == 1) {
            boolean isRtlCharAt = this.layout.isRtlCharAt(lineStart);
            if (z || isRtlParagraph == isRtlCharAt) {
                isRtlParagraph = !isRtlParagraph;
            }
            return (i2 != lineStart ? isRtlParagraph : !isRtlParagraph) ? this.layout.getLineRight(lineForOffset) : this.layout.getLineLeft(lineForOffset);
        }
        int runCount = createLineBidi.getRunCount();
        BidiRun[] bidiRunArr = new BidiRun[runCount];
        for (int i3 = 0; i3 < runCount; i3++) {
            bidiRunArr[i3] = new BidiRun(createLineBidi.getRunStart(i3) + lineStart, createLineBidi.getRunLimit(i3) + lineStart, createLineBidi.getRunLevel(i3) % 2 == 1);
        }
        int runCount2 = createLineBidi.getRunCount();
        byte[] bArr = new byte[runCount2];
        for (int i4 = 0; i4 < runCount2; i4++) {
            bArr[i4] = (byte) createLineBidi.getRunLevel(i4);
        }
        Bidi.reorderVisually(bArr, 0, bidiRunArr, 0, runCount);
        int i5 = -1;
        if (i2 == lineStart) {
            int i6 = 0;
            while (true) {
                if (i6 >= runCount) {
                    break;
                } else if (bidiRunArr[i6].getStart() == i2) {
                    i5 = i6;
                    break;
                } else {
                    i6++;
                }
            }
            BidiRun bidiRun = bidiRunArr[i5];
            if (z || isRtlParagraph == bidiRun.isRtl()) {
                isRtlParagraph = !isRtlParagraph;
            }
            if (i5 == 0 && isRtlParagraph) {
                return this.layout.getLineLeft(lineForOffset);
            }
            w2 = C8563dqf.w(bidiRunArr);
            if (i5 != w2 || isRtlParagraph) {
                if (isRtlParagraph) {
                    return this.layout.getPrimaryHorizontal(bidiRunArr[i5 - 1].getStart());
                }
                return this.layout.getPrimaryHorizontal(bidiRunArr[i5 + 1].getStart());
            }
            return this.layout.getLineRight(lineForOffset);
        }
        if (i2 > lineEndToVisibleEnd) {
            i2 = lineEndToVisibleEnd(i2, lineStart);
        }
        int i7 = 0;
        while (true) {
            if (i7 >= runCount) {
                break;
            } else if (bidiRunArr[i7].getEnd() == i2) {
                i5 = i7;
                break;
            } else {
                i7++;
            }
        }
        BidiRun bidiRun2 = bidiRunArr[i5];
        if (!z && isRtlParagraph != bidiRun2.isRtl()) {
            isRtlParagraph = !isRtlParagraph;
        }
        if (i5 == 0 && isRtlParagraph) {
            return this.layout.getLineLeft(lineForOffset);
        }
        w = C8563dqf.w(bidiRunArr);
        if (i5 != w || isRtlParagraph) {
            if (isRtlParagraph) {
                return this.layout.getPrimaryHorizontal(bidiRunArr[i5 - 1].getEnd());
            }
            return this.layout.getPrimaryHorizontal(bidiRunArr[i5 + 1].getEnd());
        }
        return this.layout.getLineRight(lineForOffset);
    }

    public final int getLineVisibleEnd(int i) {
        return lineEndToVisibleEnd(this.layout.getLineEnd(i), this.layout.getLineStart(i));
    }

    private final float getDownstreamHorizontal(int i, boolean z) {
        int i2;
        i2 = C8657dts.i(i, this.layout.getLineEnd(this.layout.getLineForOffset(i)));
        if (z) {
            return this.layout.getPrimaryHorizontal(i2);
        }
        return this.layout.getSecondaryHorizontal(i2);
    }

    /* loaded from: classes.dex */
    static final class BidiRun {
        private final int end;
        private final boolean isRtl;
        private final int start;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof BidiRun) {
                BidiRun bidiRun = (BidiRun) obj;
                return this.start == bidiRun.start && this.end == bidiRun.end && this.isRtl == bidiRun.isRtl;
            }
            return false;
        }

        public final int getEnd() {
            return this.end;
        }

        public final int getStart() {
            return this.start;
        }

        public int hashCode() {
            return (((Integer.hashCode(this.start) * 31) + Integer.hashCode(this.end)) * 31) + Boolean.hashCode(this.isRtl);
        }

        public final boolean isRtl() {
            return this.isRtl;
        }

        public String toString() {
            return "BidiRun(start=" + this.start + ", end=" + this.end + ", isRtl=" + this.isRtl + ')';
        }

        public BidiRun(int i, int i2, boolean z) {
            this.start = i;
            this.end = i2;
            this.isRtl = z;
        }
    }

    private final int lineEndToVisibleEnd(int i, int i2) {
        while (i > i2 && isLineEndSpace(this.layout.getText().charAt(i - 1))) {
            i--;
        }
        return i;
    }

    public final boolean isLineEndSpace(char c) {
        return c == ' ' || c == '\n' || c == 5760 || (C8632dsu.d(c, 8192) >= 0 && C8632dsu.d(c, 8202) <= 0 && c != 8199) || c == 8287 || c == 12288;
    }
}
