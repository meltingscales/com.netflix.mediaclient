package androidx.compose.ui.text.input;

import android.view.inputmethod.ExtractedText;
import androidx.compose.ui.text.TextRange;
import o.duD;

/* loaded from: classes.dex */
public final class InputState_androidKt {
    public static final ExtractedText toExtractedText(TextFieldValue textFieldValue) {
        boolean a;
        ExtractedText extractedText = new ExtractedText();
        extractedText.text = textFieldValue.getText();
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = textFieldValue.getText().length();
        extractedText.partialStartOffset = -1;
        extractedText.selectionStart = TextRange.m2155getMinimpl(textFieldValue.m2302getSelectiond9O1mEE());
        extractedText.selectionEnd = TextRange.m2154getMaximpl(textFieldValue.m2302getSelectiond9O1mEE());
        a = duD.a((CharSequence) textFieldValue.getText(), '\n', false, 2, (Object) null);
        extractedText.flags = !a ? 1 : 0;
        return extractedText;
    }
}
