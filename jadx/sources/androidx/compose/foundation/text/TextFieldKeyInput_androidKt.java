package androidx.compose.foundation.text;

import android.view.KeyEvent;

/* loaded from: classes.dex */
public final class TextFieldKeyInput_androidKt {
    /* renamed from: isTypedEvent-ZmokQxo  reason: not valid java name */
    public static final boolean m465isTypedEventZmokQxo(KeyEvent keyEvent) {
        return keyEvent.getAction() == 0 && !Character.isISOControl(keyEvent.getUnicodeChar());
    }
}
