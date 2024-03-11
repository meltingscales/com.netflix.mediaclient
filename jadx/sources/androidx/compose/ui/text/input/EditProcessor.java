package androidx.compose.ui.text.input;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.AnnotatedStringKt;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import java.util.List;
import o.C8576dqs;
import o.C8627dsp;
import o.C8632dsu;
import o.drM;
import o.dsA;

/* loaded from: classes.dex */
public final class EditProcessor {
    private EditingBuffer mBuffer;
    private TextFieldValue mBufferState;

    public final TextFieldValue toTextFieldValue() {
        return this.mBufferState;
    }

    public EditProcessor() {
        TextFieldValue textFieldValue = new TextFieldValue(AnnotatedStringKt.emptyAnnotatedString(), TextRange.Companion.m2162getZerod9O1mEE(), (TextRange) null, (C8627dsp) null);
        this.mBufferState = textFieldValue;
        this.mBuffer = new EditingBuffer(textFieldValue.getAnnotatedString(), this.mBufferState.m2302getSelectiond9O1mEE(), null);
    }

    public final void reset(TextFieldValue textFieldValue, TextInputSession textInputSession) {
        boolean z;
        boolean c = C8632dsu.c(textFieldValue.m2301getCompositionMzsxiRA(), this.mBuffer.m2250getCompositionMzsxiRA$ui_text_release());
        boolean z2 = false;
        if (!C8632dsu.c(this.mBufferState.getAnnotatedString(), textFieldValue.getAnnotatedString())) {
            this.mBuffer = new EditingBuffer(textFieldValue.getAnnotatedString(), textFieldValue.m2302getSelectiond9O1mEE(), null);
            z = false;
            z2 = true;
        } else if (TextRange.m2150equalsimpl0(this.mBufferState.m2302getSelectiond9O1mEE(), textFieldValue.m2302getSelectiond9O1mEE())) {
            z = false;
        } else {
            this.mBuffer.setSelection$ui_text_release(TextRange.m2155getMinimpl(textFieldValue.m2302getSelectiond9O1mEE()), TextRange.m2154getMaximpl(textFieldValue.m2302getSelectiond9O1mEE()));
            z = true;
        }
        if (textFieldValue.m2301getCompositionMzsxiRA() == null) {
            this.mBuffer.commitComposition$ui_text_release();
        } else if (!TextRange.m2151getCollapsedimpl(textFieldValue.m2301getCompositionMzsxiRA().m2161unboximpl())) {
            this.mBuffer.setComposition$ui_text_release(TextRange.m2155getMinimpl(textFieldValue.m2301getCompositionMzsxiRA().m2161unboximpl()), TextRange.m2154getMaximpl(textFieldValue.m2301getCompositionMzsxiRA().m2161unboximpl()));
        }
        if (z2 || (!z && (!c))) {
            this.mBuffer.commitComposition$ui_text_release();
            textFieldValue = TextFieldValue.m2297copy3r_uNRQ$default(textFieldValue, (AnnotatedString) null, 0L, (TextRange) null, 3, (Object) null);
        }
        TextFieldValue textFieldValue2 = this.mBufferState;
        this.mBufferState = textFieldValue;
        if (textInputSession != null) {
            textInputSession.updateState(textFieldValue2, textFieldValue);
        }
    }

    private final String generateBatchErrorMessage(List<? extends EditCommand> list, final EditCommand editCommand) {
        StringBuilder sb = new StringBuilder();
        sb.append("Error while applying EditCommand batch to buffer (length=" + this.mBuffer.getLength$ui_text_release() + ", composition=" + this.mBuffer.m2250getCompositionMzsxiRA$ui_text_release() + ", selection=" + ((Object) TextRange.m2160toStringimpl(this.mBuffer.m2251getSelectiond9O1mEE$ui_text_release())) + "):");
        C8632dsu.a(sb, "");
        sb.append('\n');
        C8632dsu.a(sb, "");
        C8576dqs.c(list, sb, "\n", null, null, 0, null, new drM<EditCommand, CharSequence>() { // from class: androidx.compose.ui.text.input.EditProcessor$generateBatchErrorMessage$1$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public final CharSequence invoke(EditCommand editCommand2) {
                String stringForLog;
                String str = EditCommand.this == editCommand2 ? " > " : "   ";
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                stringForLog = this.toStringForLog(editCommand2);
                sb2.append(stringForLog);
                return sb2.toString();
            }
        }, 60, null);
        String sb2 = sb.toString();
        C8632dsu.a(sb2, "");
        return sb2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String toStringForLog(EditCommand editCommand) {
        if (editCommand instanceof CommitTextCommand) {
            StringBuilder sb = new StringBuilder();
            sb.append("CommitTextCommand(text.length=");
            CommitTextCommand commitTextCommand = (CommitTextCommand) editCommand;
            sb.append(commitTextCommand.getText().length());
            sb.append(", newCursorPosition=");
            sb.append(commitTextCommand.getNewCursorPosition());
            sb.append(')');
            return sb.toString();
        } else if (editCommand instanceof SetComposingTextCommand) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("SetComposingTextCommand(text.length=");
            SetComposingTextCommand setComposingTextCommand = (SetComposingTextCommand) editCommand;
            sb2.append(setComposingTextCommand.getText().length());
            sb2.append(", newCursorPosition=");
            sb2.append(setComposingTextCommand.getNewCursorPosition());
            sb2.append(')');
            return sb2.toString();
        } else {
            if (!(editCommand instanceof SetComposingRegionCommand) && !(editCommand instanceof DeleteSurroundingTextCommand) && !(editCommand instanceof DeleteSurroundingTextInCodePointsCommand) && !(editCommand instanceof SetSelectionCommand) && !(editCommand instanceof FinishComposingTextCommand) && !(editCommand instanceof BackspaceCommand) && !(editCommand instanceof MoveCursorCommand) && !(editCommand instanceof DeleteAllCommand)) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Unknown EditCommand: ");
                String b = dsA.a(editCommand.getClass()).b();
                if (b == null) {
                    b = "{anonymous EditCommand}";
                }
                sb3.append(b);
                return sb3.toString();
            }
            return editCommand.toString();
        }
    }

    public final TextFieldValue apply(List<? extends EditCommand> list) {
        EditCommand editCommand = null;
        try {
            int size = list.size();
            int i = 0;
            EditCommand editCommand2 = null;
            while (i < size) {
                try {
                    EditCommand editCommand3 = list.get(i);
                    try {
                        editCommand3.applyTo(this.mBuffer);
                        i++;
                        editCommand2 = editCommand3;
                    } catch (Exception e) {
                        e = e;
                        editCommand = editCommand3;
                        throw new RuntimeException(generateBatchErrorMessage(list, editCommand), e);
                    }
                } catch (Exception e2) {
                    e = e2;
                    editCommand = editCommand2;
                }
            }
            AnnotatedString annotatedString$ui_text_release = this.mBuffer.toAnnotatedString$ui_text_release();
            long m2251getSelectiond9O1mEE$ui_text_release = this.mBuffer.m2251getSelectiond9O1mEE$ui_text_release();
            TextRange m2145boximpl = TextRange.m2145boximpl(m2251getSelectiond9O1mEE$ui_text_release);
            m2145boximpl.m2161unboximpl();
            TextRange textRange = TextRange.m2156getReversedimpl(this.mBufferState.m2302getSelectiond9O1mEE()) ? null : m2145boximpl;
            TextFieldValue textFieldValue = new TextFieldValue(annotatedString$ui_text_release, textRange != null ? textRange.m2161unboximpl() : TextRangeKt.TextRange(TextRange.m2154getMaximpl(m2251getSelectiond9O1mEE$ui_text_release), TextRange.m2155getMinimpl(m2251getSelectiond9O1mEE$ui_text_release)), this.mBuffer.m2250getCompositionMzsxiRA$ui_text_release(), (C8627dsp) null);
            this.mBufferState = textFieldValue;
            return textFieldValue;
        } catch (Exception e3) {
            e = e3;
        }
    }
}
