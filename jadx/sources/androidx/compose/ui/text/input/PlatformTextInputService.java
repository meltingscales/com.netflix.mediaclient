package androidx.compose.ui.text.input;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.text.TextLayoutResult;
import java.util.List;
import o.dpR;
import o.drM;

/* loaded from: classes.dex */
public interface PlatformTextInputService {
    void hideSoftwareKeyboard();

    default void notifyFocusedRect(Rect rect) {
    }

    void showSoftwareKeyboard();

    void startInput(TextFieldValue textFieldValue, ImeOptions imeOptions, drM<? super List<? extends EditCommand>, dpR> drm, drM<? super ImeAction, dpR> drm2);

    void stopInput();

    void updateState(TextFieldValue textFieldValue, TextFieldValue textFieldValue2);

    default void updateTextLayoutResult(TextFieldValue textFieldValue, OffsetMapping offsetMapping, TextLayoutResult textLayoutResult, drM<? super Matrix, dpR> drm, Rect rect, Rect rect2) {
    }
}
