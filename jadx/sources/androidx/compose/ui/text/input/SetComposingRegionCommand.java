package androidx.compose.ui.text.input;

import o.C8657dts;

/* loaded from: classes.dex */
public final class SetComposingRegionCommand implements EditCommand {
    private final int end;
    private final int start;

    public int hashCode() {
        return (this.start * 31) + this.end;
    }

    public SetComposingRegionCommand(int i, int i2) {
        this.start = i;
        this.end = i2;
    }

    @Override // androidx.compose.ui.text.input.EditCommand
    public void applyTo(EditingBuffer editingBuffer) {
        int c;
        int c2;
        if (editingBuffer.hasComposition$ui_text_release()) {
            editingBuffer.commitComposition$ui_text_release();
        }
        c = C8657dts.c(this.start, 0, editingBuffer.getLength$ui_text_release());
        c2 = C8657dts.c(this.end, 0, editingBuffer.getLength$ui_text_release());
        if (c != c2) {
            if (c < c2) {
                editingBuffer.setComposition$ui_text_release(c, c2);
            } else {
                editingBuffer.setComposition$ui_text_release(c2, c);
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SetComposingRegionCommand) {
            SetComposingRegionCommand setComposingRegionCommand = (SetComposingRegionCommand) obj;
            return this.start == setComposingRegionCommand.start && this.end == setComposingRegionCommand.end;
        }
        return false;
    }

    public String toString() {
        return "SetComposingRegionCommand(start=" + this.start + ", end=" + this.end + ')';
    }
}
