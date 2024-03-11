package androidx.compose.ui.platform;

import androidx.compose.ui.text.AnnotatedString;

/* loaded from: classes.dex */
public interface ClipboardManager {
    AnnotatedString getText();

    void setText(AnnotatedString annotatedString);

    default boolean hasText() {
        AnnotatedString text = getText();
        return text != null && text.length() > 0;
    }
}
