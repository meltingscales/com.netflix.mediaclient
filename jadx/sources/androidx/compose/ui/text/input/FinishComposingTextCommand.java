package androidx.compose.ui.text.input;

import o.dsA;

/* loaded from: classes.dex */
public final class FinishComposingTextCommand implements EditCommand {
    public String toString() {
        return "FinishComposingTextCommand()";
    }

    @Override // androidx.compose.ui.text.input.EditCommand
    public void applyTo(EditingBuffer editingBuffer) {
        editingBuffer.commitComposition$ui_text_release();
    }

    public boolean equals(Object obj) {
        return obj instanceof FinishComposingTextCommand;
    }

    public int hashCode() {
        return dsA.a(FinishComposingTextCommand.class).hashCode();
    }
}
