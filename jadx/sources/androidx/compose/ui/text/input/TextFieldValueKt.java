package androidx.compose.ui.text.input;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;

/* loaded from: classes.dex */
public final class TextFieldValueKt {
    public static final AnnotatedString getTextBeforeSelection(TextFieldValue textFieldValue, int i) {
        return textFieldValue.getAnnotatedString().subSequence(Math.max(0, TextRange.m2155getMinimpl(textFieldValue.m2302getSelectiond9O1mEE()) - i), TextRange.m2155getMinimpl(textFieldValue.m2302getSelectiond9O1mEE()));
    }

    public static final AnnotatedString getTextAfterSelection(TextFieldValue textFieldValue, int i) {
        return textFieldValue.getAnnotatedString().subSequence(TextRange.m2154getMaximpl(textFieldValue.m2302getSelectiond9O1mEE()), Math.min(TextRange.m2154getMaximpl(textFieldValue.m2302getSelectiond9O1mEE()) + i, textFieldValue.getText().length()));
    }

    public static final AnnotatedString getSelectedText(TextFieldValue textFieldValue) {
        return textFieldValue.getAnnotatedString().m2067subSequence5zctL8(textFieldValue.m2302getSelectiond9O1mEE());
    }
}
