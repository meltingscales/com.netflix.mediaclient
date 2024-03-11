package androidx.compose.ui.text.input;

import androidx.compose.ui.text.AnnotatedString;
import o.C8632dsu;
import o.C8657dts;

/* loaded from: classes.dex */
public final class CommitTextCommand implements EditCommand {
    private final AnnotatedString annotatedString;
    private final int newCursorPosition;

    public final int getNewCursorPosition() {
        return this.newCursorPosition;
    }

    public CommitTextCommand(AnnotatedString annotatedString, int i) {
        this.annotatedString = annotatedString;
        this.newCursorPosition = i;
    }

    public CommitTextCommand(String str, int i) {
        this(new AnnotatedString(str, null, null, 6, null), i);
    }

    public final String getText() {
        return this.annotatedString.getText();
    }

    @Override // androidx.compose.ui.text.input.EditCommand
    public void applyTo(EditingBuffer editingBuffer) {
        int c;
        if (editingBuffer.hasComposition$ui_text_release()) {
            editingBuffer.replace$ui_text_release(editingBuffer.getCompositionStart$ui_text_release(), editingBuffer.getCompositionEnd$ui_text_release(), getText());
        } else {
            editingBuffer.replace$ui_text_release(editingBuffer.getSelectionStart$ui_text_release(), editingBuffer.getSelectionEnd$ui_text_release(), getText());
        }
        int cursor$ui_text_release = editingBuffer.getCursor$ui_text_release();
        int i = this.newCursorPosition;
        c = C8657dts.c(i > 0 ? (cursor$ui_text_release + i) - 1 : (cursor$ui_text_release + i) - getText().length(), 0, editingBuffer.getLength$ui_text_release());
        editingBuffer.setCursor$ui_text_release(c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CommitTextCommand) {
            CommitTextCommand commitTextCommand = (CommitTextCommand) obj;
            return C8632dsu.c((Object) getText(), (Object) commitTextCommand.getText()) && this.newCursorPosition == commitTextCommand.newCursorPosition;
        }
        return false;
    }

    public int hashCode() {
        return (getText().hashCode() * 31) + this.newCursorPosition;
    }

    public String toString() {
        return "CommitTextCommand(text='" + getText() + "', newCursorPosition=" + this.newCursorPosition + ')';
    }
}
