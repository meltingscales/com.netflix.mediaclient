package androidx.compose.ui.text.input;

import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import androidx.compose.ui.text.TextRange;
import java.util.ArrayList;
import java.util.List;
import o.C8576dqs;

/* loaded from: classes.dex */
public final class RecordingInputConnection implements InputConnection {
    private final boolean autoCorrect;
    private int batchDepth;
    private int currentExtractedTextRequestToken;
    private final InputEventCallback2 eventCallback;
    private boolean extractedTextMonitorMode;
    private TextFieldValue mTextFieldValue;
    private final List<EditCommand> editCommands = new ArrayList();
    private boolean isActive = true;

    private final boolean beginBatchEditInternal() {
        this.batchDepth++;
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean clearMetaKeyStates(int i) {
        boolean z = this.isActive;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitCompletion(CompletionInfo completionInfo) {
        boolean z = this.isActive;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        boolean z = this.isActive;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z = this.isActive;
        return z ? this.autoCorrect : z;
    }

    @Override // android.view.inputmethod.InputConnection
    public Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z = this.isActive;
        if (z) {
            return true;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean reportFullscreenMode(boolean z) {
        return false;
    }

    public final void setMTextFieldValue$ui_release(TextFieldValue textFieldValue) {
        this.mTextFieldValue = textFieldValue;
    }

    public RecordingInputConnection(TextFieldValue textFieldValue, InputEventCallback2 inputEventCallback2, boolean z) {
        this.eventCallback = inputEventCallback2;
        this.autoCorrect = z;
        this.mTextFieldValue = textFieldValue;
    }

    public final void updateInputState(TextFieldValue textFieldValue, InputMethodManager inputMethodManager) {
        if (this.isActive) {
            setMTextFieldValue$ui_release(textFieldValue);
            if (this.extractedTextMonitorMode) {
                inputMethodManager.updateExtractedText(this.currentExtractedTextRequestToken, InputState_androidKt.toExtractedText(textFieldValue));
            }
            TextRange m2301getCompositionMzsxiRA = textFieldValue.m2301getCompositionMzsxiRA();
            int m2155getMinimpl = m2301getCompositionMzsxiRA != null ? TextRange.m2155getMinimpl(m2301getCompositionMzsxiRA.m2161unboximpl()) : -1;
            TextRange m2301getCompositionMzsxiRA2 = textFieldValue.m2301getCompositionMzsxiRA();
            inputMethodManager.updateSelection(TextRange.m2155getMinimpl(textFieldValue.m2302getSelectiond9O1mEE()), TextRange.m2154getMaximpl(textFieldValue.m2302getSelectiond9O1mEE()), m2155getMinimpl, m2301getCompositionMzsxiRA2 != null ? TextRange.m2154getMaximpl(m2301getCompositionMzsxiRA2.m2161unboximpl()) : -1);
        }
    }

    private final void addEditCommandWithBatch(EditCommand editCommand) {
        beginBatchEditInternal();
        try {
            this.editCommands.add(editCommand);
        } finally {
            endBatchEditInternal();
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean beginBatchEdit() {
        boolean z = this.isActive;
        return z ? beginBatchEditInternal() : z;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean endBatchEdit() {
        return endBatchEditInternal();
    }

    private final boolean endBatchEditInternal() {
        List<? extends EditCommand> n;
        int i = this.batchDepth - 1;
        this.batchDepth = i;
        if (i == 0 && (!this.editCommands.isEmpty())) {
            InputEventCallback2 inputEventCallback2 = this.eventCallback;
            n = C8576dqs.n(this.editCommands);
            inputEventCallback2.onEditCommands(n);
            this.editCommands.clear();
        }
        return this.batchDepth > 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public void closeConnection() {
        this.editCommands.clear();
        this.batchDepth = 0;
        this.isActive = false;
        this.eventCallback.onConnectionClosed(this);
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitText(CharSequence charSequence, int i) {
        boolean z = this.isActive;
        if (z) {
            addEditCommandWithBatch(new CommitTextCommand(String.valueOf(charSequence), i));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setComposingRegion(int i, int i2) {
        boolean z = this.isActive;
        if (z) {
            addEditCommandWithBatch(new SetComposingRegionCommand(i, i2));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setComposingText(CharSequence charSequence, int i) {
        boolean z = this.isActive;
        if (z) {
            addEditCommandWithBatch(new SetComposingTextCommand(String.valueOf(charSequence), i));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        boolean z = this.isActive;
        if (z) {
            addEditCommandWithBatch(new DeleteSurroundingTextInCodePointsCommand(i, i2));
            return true;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i, int i2) {
        boolean z = this.isActive;
        if (z) {
            addEditCommandWithBatch(new DeleteSurroundingTextCommand(i, i2));
            return true;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setSelection(int i, int i2) {
        boolean z = this.isActive;
        if (z) {
            addEditCommandWithBatch(new SetSelectionCommand(i, i2));
            return true;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean finishComposingText() {
        boolean z = this.isActive;
        if (z) {
            addEditCommandWithBatch(new FinishComposingTextCommand());
            return true;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean sendKeyEvent(KeyEvent keyEvent) {
        boolean z = this.isActive;
        if (z) {
            this.eventCallback.onKeyEvent(keyEvent);
            return true;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public CharSequence getTextBeforeCursor(int i, int i2) {
        return TextFieldValueKt.getTextBeforeSelection(this.mTextFieldValue, i).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    public CharSequence getTextAfterCursor(int i, int i2) {
        return TextFieldValueKt.getTextAfterSelection(this.mTextFieldValue, i).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    public CharSequence getSelectedText(int i) {
        if (TextRange.m2151getCollapsedimpl(this.mTextFieldValue.m2302getSelectiond9O1mEE())) {
            return null;
        }
        return TextFieldValueKt.getSelectedText(this.mTextFieldValue).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean requestCursorUpdates(int i) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5 = this.isActive;
        if (z5) {
            boolean z6 = false;
            boolean z7 = (i & 1) != 0;
            boolean z8 = (i & 2) != 0;
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 33) {
                boolean z9 = (i & 16) != 0;
                boolean z10 = (i & 8) != 0;
                boolean z11 = (i & 4) != 0;
                if (i2 >= 34 && (i & 32) != 0) {
                    z6 = true;
                }
                if (z9 || z10 || z11 || z6) {
                    z2 = z6;
                    z = z11;
                    z4 = z10;
                    z3 = z9;
                } else if (i2 >= 34) {
                    z3 = true;
                    z4 = true;
                    z = true;
                    z2 = true;
                } else {
                    z2 = z6;
                    z3 = true;
                    z4 = true;
                    z = true;
                }
            } else {
                z = false;
                z2 = false;
                z3 = true;
                z4 = true;
            }
            this.eventCallback.onRequestCursorAnchorInfo(z7, z8, z3, z4, z, z2);
            return true;
        }
        return z5;
    }

    @Override // android.view.inputmethod.InputConnection
    public ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i) {
        boolean z = (i & 1) != 0;
        this.extractedTextMonitorMode = z;
        if (z) {
            this.currentExtractedTextRequestToken = extractedTextRequest != null ? extractedTextRequest.token : 0;
        }
        return InputState_androidKt.toExtractedText(this.mTextFieldValue);
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performContextMenuAction(int i) {
        boolean z = this.isActive;
        if (z) {
            z = false;
            switch (i) {
                case 16908319:
                    addEditCommandWithBatch(new SetSelectionCommand(0, this.mTextFieldValue.getText().length()));
                    break;
                case 16908320:
                    sendSynthesizedKeyEvent(277);
                    break;
                case 16908321:
                    sendSynthesizedKeyEvent(278);
                    break;
                case 16908322:
                    sendSynthesizedKeyEvent(279);
                    break;
            }
        }
        return z;
    }

    private final void sendSynthesizedKeyEvent(int i) {
        sendKeyEvent(new KeyEvent(0, i));
        sendKeyEvent(new KeyEvent(1, i));
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performEditorAction(int i) {
        int m2260getDefaulteUduSuo;
        boolean z = this.isActive;
        if (z) {
            if (i == 0) {
                m2260getDefaulteUduSuo = ImeAction.Companion.m2260getDefaulteUduSuo();
            } else {
                switch (i) {
                    case 2:
                        m2260getDefaulteUduSuo = ImeAction.Companion.m2262getGoeUduSuo();
                        break;
                    case 3:
                        m2260getDefaulteUduSuo = ImeAction.Companion.m2266getSearcheUduSuo();
                        break;
                    case 4:
                        m2260getDefaulteUduSuo = ImeAction.Companion.m2267getSendeUduSuo();
                        break;
                    case 5:
                        m2260getDefaulteUduSuo = ImeAction.Companion.m2263getNexteUduSuo();
                        break;
                    case 6:
                        m2260getDefaulteUduSuo = ImeAction.Companion.m2261getDoneeUduSuo();
                        break;
                    case 7:
                        m2260getDefaulteUduSuo = ImeAction.Companion.m2265getPreviouseUduSuo();
                        break;
                    default:
                        Log.w("RecordingIC", "IME sends unsupported Editor Action: " + i);
                        m2260getDefaulteUduSuo = ImeAction.Companion.m2260getDefaulteUduSuo();
                        break;
                }
            }
            this.eventCallback.mo2271onImeActionKlQnJC8(m2260getDefaulteUduSuo);
            return true;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public int getCursorCapsMode(int i) {
        return TextUtils.getCapsMode(this.mTextFieldValue.getText(), TextRange.m2155getMinimpl(this.mTextFieldValue.m2302getSelectiond9O1mEE()), i);
    }
}
