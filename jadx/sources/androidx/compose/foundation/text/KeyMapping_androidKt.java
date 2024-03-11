package androidx.compose.foundation.text;

import android.view.KeyEvent;
import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEvent_androidKt;

/* loaded from: classes.dex */
public final class KeyMapping_androidKt {
    private static final KeyMapping platformDefaultKeyMapping = new KeyMapping() { // from class: androidx.compose.foundation.text.KeyMapping_androidKt$platformDefaultKeyMapping$1
        @Override // androidx.compose.foundation.text.KeyMapping
        /* renamed from: map-ZmokQxo */
        public KeyCommand mo415mapZmokQxo(KeyEvent keyEvent) {
            KeyCommand keyCommand;
            if (KeyEvent_androidKt.m1664isShiftPressedZmokQxo(keyEvent) && KeyEvent_androidKt.m1662isAltPressedZmokQxo(keyEvent)) {
                long m1659getKeyZmokQxo = KeyEvent_androidKt.m1659getKeyZmokQxo(keyEvent);
                MappedKeys mappedKeys = MappedKeys.INSTANCE;
                if (Key.m1628equalsimpl0(m1659getKeyZmokQxo, mappedKeys.m430getDirectionLeftEK5gGoQ())) {
                    keyCommand = KeyCommand.SELECT_LINE_LEFT;
                } else if (Key.m1628equalsimpl0(m1659getKeyZmokQxo, mappedKeys.m431getDirectionRightEK5gGoQ())) {
                    keyCommand = KeyCommand.SELECT_LINE_RIGHT;
                } else if (Key.m1628equalsimpl0(m1659getKeyZmokQxo, mappedKeys.m432getDirectionUpEK5gGoQ())) {
                    keyCommand = KeyCommand.SELECT_HOME;
                } else {
                    if (Key.m1628equalsimpl0(m1659getKeyZmokQxo, mappedKeys.m429getDirectionDownEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_END;
                    }
                    keyCommand = null;
                }
            } else {
                if (KeyEvent_androidKt.m1662isAltPressedZmokQxo(keyEvent)) {
                    long m1659getKeyZmokQxo2 = KeyEvent_androidKt.m1659getKeyZmokQxo(keyEvent);
                    MappedKeys mappedKeys2 = MappedKeys.INSTANCE;
                    if (Key.m1628equalsimpl0(m1659getKeyZmokQxo2, mappedKeys2.m430getDirectionLeftEK5gGoQ())) {
                        keyCommand = KeyCommand.LINE_LEFT;
                    } else if (Key.m1628equalsimpl0(m1659getKeyZmokQxo2, mappedKeys2.m431getDirectionRightEK5gGoQ())) {
                        keyCommand = KeyCommand.LINE_RIGHT;
                    } else if (Key.m1628equalsimpl0(m1659getKeyZmokQxo2, mappedKeys2.m432getDirectionUpEK5gGoQ())) {
                        keyCommand = KeyCommand.HOME;
                    } else if (Key.m1628equalsimpl0(m1659getKeyZmokQxo2, mappedKeys2.m429getDirectionDownEK5gGoQ())) {
                        keyCommand = KeyCommand.END;
                    }
                }
                keyCommand = null;
            }
            return keyCommand == null ? KeyMappingKt.getDefaultKeyMapping().mo415mapZmokQxo(keyEvent) : keyCommand;
        }
    };

    public static final KeyMapping getPlatformDefaultKeyMapping() {
        return platformDefaultKeyMapping;
    }
}
