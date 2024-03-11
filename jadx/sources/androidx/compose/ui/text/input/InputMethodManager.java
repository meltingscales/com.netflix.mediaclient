package androidx.compose.ui.text.input;

import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.ExtractedText;

/* loaded from: classes.dex */
public interface InputMethodManager {
    void hideSoftInput();

    boolean isActive();

    void restartInput();

    void showSoftInput();

    void updateCursorAnchorInfo(CursorAnchorInfo cursorAnchorInfo);

    void updateExtractedText(int i, ExtractedText extractedText);

    void updateSelection(int i, int i2, int i3, int i4);
}
