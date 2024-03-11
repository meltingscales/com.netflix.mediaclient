package androidx.compose.ui.text.input;

import androidx.compose.animation.core.MutatorMutex$$ExternalSyntheticBackportWithForwarding0;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import o.dpR;
import o.drM;

/* loaded from: classes.dex */
public class TextInputService {
    private final AtomicReference<TextInputSession> _currentInputSession = new AtomicReference<>(null);
    private final PlatformTextInputService platformTextInputService;

    public TextInputService(PlatformTextInputService platformTextInputService) {
        this.platformTextInputService = platformTextInputService;
    }

    public final TextInputSession getCurrentInputSession$ui_text_release() {
        return this._currentInputSession.get();
    }

    public TextInputSession startInput(TextFieldValue textFieldValue, ImeOptions imeOptions, drM<? super List<? extends EditCommand>, dpR> drm, drM<? super ImeAction, dpR> drm2) {
        this.platformTextInputService.startInput(textFieldValue, imeOptions, drm, drm2);
        TextInputSession textInputSession = new TextInputSession(this, this.platformTextInputService);
        this._currentInputSession.set(textInputSession);
        return textInputSession;
    }

    public void stopInput(TextInputSession textInputSession) {
        if (MutatorMutex$$ExternalSyntheticBackportWithForwarding0.m(this._currentInputSession, textInputSession, null)) {
            this.platformTextInputService.stopInput();
        }
    }

    public final void showSoftwareKeyboard() {
        if (getCurrentInputSession$ui_text_release() != null) {
            this.platformTextInputService.showSoftwareKeyboard();
        }
    }

    public final void hideSoftwareKeyboard() {
        this.platformTextInputService.hideSoftwareKeyboard();
    }
}
