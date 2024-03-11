package androidx.compose.ui.text.input;

/* loaded from: classes.dex */
public final class DeleteSurroundingTextInCodePointsCommand implements EditCommand {
    private final int lengthAfterCursor;
    private final int lengthBeforeCursor;

    public int hashCode() {
        return (this.lengthBeforeCursor * 31) + this.lengthAfterCursor;
    }

    public DeleteSurroundingTextInCodePointsCommand(int i, int i2) {
        this.lengthBeforeCursor = i;
        this.lengthAfterCursor = i2;
        if (i < 0 || i2 < 0) {
            throw new IllegalArgumentException(("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i + " and " + i2 + " respectively.").toString());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0033 A[LOOP:0: B:3:0x0005->B:12:0x0033, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0071 A[LOOP:1: B:14:0x0039->B:23:0x0071, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0036 A[EDGE_INSN: B:26:0x0036->B:13:0x0036 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0074 A[EDGE_INSN: B:29:0x0074->B:24:0x0074 ?: BREAK  , SYNTHETIC] */
    @Override // androidx.compose.ui.text.input.EditCommand
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void applyTo(androidx.compose.ui.text.input.EditingBuffer r8) {
        /*
            r7 = this;
            int r0 = r7.lengthBeforeCursor
            r1 = 0
            r2 = r1
            r3 = r2
        L5:
            if (r3 >= r0) goto L36
            int r4 = r2 + 1
            int r5 = r8.getSelectionStart$ui_text_release()
            if (r5 <= r4) goto L2c
            int r5 = r8.getSelectionStart$ui_text_release()
            int r5 = r5 - r4
            int r5 = r5 + (-1)
            char r5 = r8.get$ui_text_release(r5)
            int r6 = r8.getSelectionStart$ui_text_release()
            int r6 = r6 - r4
            char r6 = r8.get$ui_text_release(r6)
            boolean r5 = androidx.compose.ui.text.input.EditCommandKt.access$isSurrogatePair(r5, r6)
            if (r5 == 0) goto L2c
            int r2 = r2 + 2
            goto L2d
        L2c:
            r2 = r4
        L2d:
            int r4 = r8.getSelectionStart$ui_text_release()
            if (r2 == r4) goto L36
            int r3 = r3 + 1
            goto L5
        L36:
            int r0 = r7.lengthAfterCursor
            r3 = r1
        L39:
            if (r3 >= r0) goto L74
            int r4 = r1 + 1
            int r5 = r8.getSelectionEnd$ui_text_release()
            int r5 = r5 + r4
            int r6 = r8.getLength$ui_text_release()
            if (r5 >= r6) goto L65
            int r5 = r8.getSelectionEnd$ui_text_release()
            int r5 = r5 + r4
            int r5 = r5 + (-1)
            char r5 = r8.get$ui_text_release(r5)
            int r6 = r8.getSelectionEnd$ui_text_release()
            int r6 = r6 + r4
            char r6 = r8.get$ui_text_release(r6)
            boolean r5 = androidx.compose.ui.text.input.EditCommandKt.access$isSurrogatePair(r5, r6)
            if (r5 == 0) goto L65
            int r1 = r1 + 2
            goto L66
        L65:
            r1 = r4
        L66:
            int r4 = r8.getSelectionEnd$ui_text_release()
            int r4 = r4 + r1
            int r5 = r8.getLength$ui_text_release()
            if (r4 == r5) goto L74
            int r3 = r3 + 1
            goto L39
        L74:
            int r0 = r8.getSelectionEnd$ui_text_release()
            int r3 = r8.getSelectionEnd$ui_text_release()
            int r3 = r3 + r1
            r8.delete$ui_text_release(r0, r3)
            int r0 = r8.getSelectionStart$ui_text_release()
            int r0 = r0 - r2
            int r1 = r8.getSelectionStart$ui_text_release()
            r8.delete$ui_text_release(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.input.DeleteSurroundingTextInCodePointsCommand.applyTo(androidx.compose.ui.text.input.EditingBuffer):void");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DeleteSurroundingTextInCodePointsCommand) {
            DeleteSurroundingTextInCodePointsCommand deleteSurroundingTextInCodePointsCommand = (DeleteSurroundingTextInCodePointsCommand) obj;
            return this.lengthBeforeCursor == deleteSurroundingTextInCodePointsCommand.lengthBeforeCursor && this.lengthAfterCursor == deleteSurroundingTextInCodePointsCommand.lengthAfterCursor;
        }
        return false;
    }

    public String toString() {
        return "DeleteSurroundingTextInCodePointsCommand(lengthBeforeCursor=" + this.lengthBeforeCursor + ", lengthAfterCursor=" + this.lengthAfterCursor + ')';
    }
}
