package androidx.compose.ui.text.input;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import o.C8627dsp;

/* loaded from: classes.dex */
public final class EditingBuffer {
    private int compositionEnd;
    private int compositionStart;
    private final PartialGapBuffer gapBuffer;
    private int selectionEnd;
    private int selectionStart;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public /* synthetic */ EditingBuffer(AnnotatedString annotatedString, long j, C8627dsp c8627dsp) {
        this(annotatedString, j);
    }

    public final void commitComposition$ui_text_release() {
        this.compositionStart = -1;
        this.compositionEnd = -1;
    }

    public final int getCompositionEnd$ui_text_release() {
        return this.compositionEnd;
    }

    public final int getCompositionStart$ui_text_release() {
        return this.compositionStart;
    }

    public final int getCursor$ui_text_release() {
        int i = this.selectionStart;
        int i2 = this.selectionEnd;
        if (i == i2) {
            return i2;
        }
        return -1;
    }

    public final int getSelectionEnd$ui_text_release() {
        return this.selectionEnd;
    }

    public final int getSelectionStart$ui_text_release() {
        return this.selectionStart;
    }

    public final boolean hasComposition$ui_text_release() {
        return this.compositionStart != -1;
    }

    private EditingBuffer(AnnotatedString annotatedString, long j) {
        this.gapBuffer = new PartialGapBuffer(annotatedString.getText());
        this.selectionStart = TextRange.m2155getMinimpl(j);
        this.selectionEnd = TextRange.m2154getMaximpl(j);
        this.compositionStart = -1;
        this.compositionEnd = -1;
        int m2155getMinimpl = TextRange.m2155getMinimpl(j);
        int m2154getMaximpl = TextRange.m2154getMaximpl(j);
        if (m2155getMinimpl < 0 || m2155getMinimpl > annotatedString.length()) {
            throw new IndexOutOfBoundsException("start (" + m2155getMinimpl + ") offset is outside of text region " + annotatedString.length());
        } else if (m2154getMaximpl < 0 || m2154getMaximpl > annotatedString.length()) {
            throw new IndexOutOfBoundsException("end (" + m2154getMaximpl + ") offset is outside of text region " + annotatedString.length());
        } else if (m2155getMinimpl <= m2154getMaximpl) {
        } else {
            throw new IllegalArgumentException("Do not set reversed range: " + m2155getMinimpl + " > " + m2154getMaximpl);
        }
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }
    }

    private final void setSelectionStart(int i) {
        if (i >= 0) {
            this.selectionStart = i;
            return;
        }
        throw new IllegalArgumentException(("Cannot set selectionStart to a negative value: " + i).toString());
    }

    private final void setSelectionEnd(int i) {
        if (i >= 0) {
            this.selectionEnd = i;
            return;
        }
        throw new IllegalArgumentException(("Cannot set selectionEnd to a negative value: " + i).toString());
    }

    /* renamed from: getComposition-MzsxiRA$ui_text_release  reason: not valid java name */
    public final TextRange m2250getCompositionMzsxiRA$ui_text_release() {
        if (hasComposition$ui_text_release()) {
            return TextRange.m2145boximpl(TextRangeKt.TextRange(this.compositionStart, this.compositionEnd));
        }
        return null;
    }

    /* renamed from: getSelection-d9O1mEE$ui_text_release  reason: not valid java name */
    public final long m2251getSelectiond9O1mEE$ui_text_release() {
        return TextRangeKt.TextRange(this.selectionStart, this.selectionEnd);
    }

    public final void setCursor$ui_text_release(int i) {
        setSelection$ui_text_release(i, i);
    }

    public final char get$ui_text_release(int i) {
        return this.gapBuffer.get(i);
    }

    public final int getLength$ui_text_release() {
        return this.gapBuffer.getLength();
    }

    public final void replace$ui_text_release(int i, int i2, String str) {
        if (i < 0 || i > this.gapBuffer.getLength()) {
            throw new IndexOutOfBoundsException("start (" + i + ") offset is outside of text region " + this.gapBuffer.getLength());
        } else if (i2 < 0 || i2 > this.gapBuffer.getLength()) {
            throw new IndexOutOfBoundsException("end (" + i2 + ") offset is outside of text region " + this.gapBuffer.getLength());
        } else if (i > i2) {
            throw new IllegalArgumentException("Do not set reversed range: " + i + " > " + i2);
        } else {
            this.gapBuffer.replace(i, i2, str);
            setSelectionStart(str.length() + i);
            setSelectionEnd(i + str.length());
            this.compositionStart = -1;
            this.compositionEnd = -1;
        }
    }

    public final void delete$ui_text_release(int i, int i2) {
        long TextRange = TextRangeKt.TextRange(i, i2);
        this.gapBuffer.replace(i, i2, "");
        long m2252updateRangeAfterDeletepWDy79M = EditingBufferKt.m2252updateRangeAfterDeletepWDy79M(TextRangeKt.TextRange(this.selectionStart, this.selectionEnd), TextRange);
        setSelectionStart(TextRange.m2155getMinimpl(m2252updateRangeAfterDeletepWDy79M));
        setSelectionEnd(TextRange.m2154getMaximpl(m2252updateRangeAfterDeletepWDy79M));
        if (hasComposition$ui_text_release()) {
            long m2252updateRangeAfterDeletepWDy79M2 = EditingBufferKt.m2252updateRangeAfterDeletepWDy79M(TextRangeKt.TextRange(this.compositionStart, this.compositionEnd), TextRange);
            if (TextRange.m2151getCollapsedimpl(m2252updateRangeAfterDeletepWDy79M2)) {
                commitComposition$ui_text_release();
                return;
            }
            this.compositionStart = TextRange.m2155getMinimpl(m2252updateRangeAfterDeletepWDy79M2);
            this.compositionEnd = TextRange.m2154getMaximpl(m2252updateRangeAfterDeletepWDy79M2);
        }
    }

    public final void setSelection$ui_text_release(int i, int i2) {
        if (i < 0 || i > this.gapBuffer.getLength()) {
            throw new IndexOutOfBoundsException("start (" + i + ") offset is outside of text region " + this.gapBuffer.getLength());
        } else if (i2 < 0 || i2 > this.gapBuffer.getLength()) {
            throw new IndexOutOfBoundsException("end (" + i2 + ") offset is outside of text region " + this.gapBuffer.getLength());
        } else if (i > i2) {
            throw new IllegalArgumentException("Do not set reversed range: " + i + " > " + i2);
        } else {
            setSelectionStart(i);
            setSelectionEnd(i2);
        }
    }

    public final void setComposition$ui_text_release(int i, int i2) {
        if (i < 0 || i > this.gapBuffer.getLength()) {
            throw new IndexOutOfBoundsException("start (" + i + ") offset is outside of text region " + this.gapBuffer.getLength());
        } else if (i2 < 0 || i2 > this.gapBuffer.getLength()) {
            throw new IndexOutOfBoundsException("end (" + i2 + ") offset is outside of text region " + this.gapBuffer.getLength());
        } else if (i < i2) {
            this.compositionStart = i;
            this.compositionEnd = i2;
        } else {
            throw new IllegalArgumentException("Do not set reversed or empty range: " + i + " > " + i2);
        }
    }

    public String toString() {
        return this.gapBuffer.toString();
    }

    public final AnnotatedString toAnnotatedString$ui_text_release() {
        return new AnnotatedString(toString(), null, null, 6, null);
    }
}
