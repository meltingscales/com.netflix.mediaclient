package androidx.compose.foundation.text;

import android.view.KeyEvent;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;

/* loaded from: classes.dex */
public final class KeyEventHelpers_androidKt {
    public static final void showCharacterPalette() {
    }

    /* renamed from: cancelsTextSelection-ZmokQxo  reason: not valid java name */
    public static final boolean m414cancelsTextSelectionZmokQxo(KeyEvent keyEvent) {
        return keyEvent.getKeyCode() == 4 && KeyEventType.m1652equalsimpl0(KeyEvent_androidKt.m1660getTypeZmokQxo(keyEvent), KeyEventType.Companion.m1657getKeyUpCS__XNY());
    }
}
