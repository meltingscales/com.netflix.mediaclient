package androidx.compose.ui.text.input;

import o.dsA;

/* loaded from: classes.dex */
public final class DeleteAllCommand implements EditCommand {
    public String toString() {
        return "DeleteAllCommand()";
    }

    @Override // androidx.compose.ui.text.input.EditCommand
    public void applyTo(EditingBuffer editingBuffer) {
        editingBuffer.replace$ui_text_release(0, editingBuffer.getLength$ui_text_release(), "");
    }

    public boolean equals(Object obj) {
        return obj instanceof DeleteAllCommand;
    }

    public int hashCode() {
        return dsA.a(DeleteAllCommand.class).hashCode();
    }
}
