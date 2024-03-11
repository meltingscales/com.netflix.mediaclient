package androidx.compose.ui.text.input;

import o.C8657dts;

/* loaded from: classes.dex */
public final class SetSelectionCommand implements EditCommand {
    private final int end;
    private final int start;

    public int hashCode() {
        return (this.start * 31) + this.end;
    }

    public SetSelectionCommand(int i, int i2) {
        this.start = i;
        this.end = i2;
    }

    @Override // androidx.compose.ui.text.input.EditCommand
    public void applyTo(EditingBuffer editingBuffer) {
        int c;
        int c2;
        c = C8657dts.c(this.start, 0, editingBuffer.getLength$ui_text_release());
        c2 = C8657dts.c(this.end, 0, editingBuffer.getLength$ui_text_release());
        if (c < c2) {
            editingBuffer.setSelection$ui_text_release(c, c2);
        } else {
            editingBuffer.setSelection$ui_text_release(c2, c);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SetSelectionCommand) {
            SetSelectionCommand setSelectionCommand = (SetSelectionCommand) obj;
            return this.start == setSelectionCommand.start && this.end == setSelectionCommand.end;
        }
        return false;
    }

    public String toString() {
        return "SetSelectionCommand(start=" + this.start + ", end=" + this.end + ')';
    }
}
