package androidx.compose.foundation.text;

import android.view.InputDevice;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.input.key.KeyEvent;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.input.key.Key_androidKt;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import o.drM;

/* loaded from: classes.dex */
public final class TextFieldFocusModifier_androidKt {
    public static final Modifier interceptDPadAndMoveFocus(Modifier modifier, final TextFieldState textFieldState, final FocusManager focusManager) {
        return KeyInputModifierKt.onPreviewKeyEvent(modifier, new drM<KeyEvent, Boolean>() { // from class: androidx.compose.foundation.text.TextFieldFocusModifier_androidKt$interceptDPadAndMoveFocus$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ Boolean invoke(KeyEvent keyEvent) {
                return m460invokeZmokQxo(keyEvent.m1649unboximpl());
            }

            /* renamed from: invoke-ZmokQxo  reason: not valid java name */
            public final Boolean m460invokeZmokQxo(android.view.KeyEvent keyEvent) {
                boolean z;
                boolean m459isKeyCodeYhN2O0w;
                boolean m459isKeyCodeYhN2O0w2;
                boolean m459isKeyCodeYhN2O0w3;
                boolean m459isKeyCodeYhN2O0w4;
                boolean m459isKeyCodeYhN2O0w5;
                InputDevice device = keyEvent.getDevice();
                if (device != null && device.supportsSource(513) && !device.isVirtual() && KeyEventType.m1652equalsimpl0(KeyEvent_androidKt.m1660getTypeZmokQxo(keyEvent), KeyEventType.Companion.m1656getKeyDownCS__XNY())) {
                    m459isKeyCodeYhN2O0w = TextFieldFocusModifier_androidKt.m459isKeyCodeYhN2O0w(keyEvent, 19);
                    if (m459isKeyCodeYhN2O0w) {
                        z = FocusManager.this.mo1090moveFocus3ESFkO8(FocusDirection.Companion.m1089getUpdhqQ8s());
                    } else {
                        m459isKeyCodeYhN2O0w2 = TextFieldFocusModifier_androidKt.m459isKeyCodeYhN2O0w(keyEvent, 20);
                        if (m459isKeyCodeYhN2O0w2) {
                            z = FocusManager.this.mo1090moveFocus3ESFkO8(FocusDirection.Companion.m1082getDowndhqQ8s());
                        } else {
                            m459isKeyCodeYhN2O0w3 = TextFieldFocusModifier_androidKt.m459isKeyCodeYhN2O0w(keyEvent, 21);
                            if (m459isKeyCodeYhN2O0w3) {
                                z = FocusManager.this.mo1090moveFocus3ESFkO8(FocusDirection.Companion.m1085getLeftdhqQ8s());
                            } else {
                                m459isKeyCodeYhN2O0w4 = TextFieldFocusModifier_androidKt.m459isKeyCodeYhN2O0w(keyEvent, 22);
                                if (m459isKeyCodeYhN2O0w4) {
                                    z = FocusManager.this.mo1090moveFocus3ESFkO8(FocusDirection.Companion.m1088getRightdhqQ8s());
                                } else {
                                    m459isKeyCodeYhN2O0w5 = TextFieldFocusModifier_androidKt.m459isKeyCodeYhN2O0w(keyEvent, 23);
                                    if (m459isKeyCodeYhN2O0w5) {
                                        SoftwareKeyboardController keyboardController = textFieldState.getKeyboardController();
                                        if (keyboardController != null) {
                                            keyboardController.show();
                                        }
                                        z = true;
                                    }
                                }
                            }
                        }
                    }
                    return Boolean.valueOf(z);
                }
                z = false;
                return Boolean.valueOf(z);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: isKeyCode-YhN2O0w  reason: not valid java name */
    public static final boolean m459isKeyCodeYhN2O0w(android.view.KeyEvent keyEvent, int i) {
        return Key_androidKt.m1665getNativeKeyCodeYVgTNJs(KeyEvent_androidKt.m1659getKeyZmokQxo(keyEvent)) == i;
    }
}
