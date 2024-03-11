package androidx.compose.ui.input.key;

/* loaded from: classes.dex */
public final class KeyEvent_androidKt {
    /* renamed from: getKey-ZmokQxo  reason: not valid java name */
    public static final long m1659getKeyZmokQxo(android.view.KeyEvent keyEvent) {
        return Key_androidKt.Key(keyEvent.getKeyCode());
    }

    /* renamed from: getUtf16CodePoint-ZmokQxo  reason: not valid java name */
    public static final int m1661getUtf16CodePointZmokQxo(android.view.KeyEvent keyEvent) {
        return keyEvent.getUnicodeChar();
    }

    /* renamed from: getType-ZmokQxo  reason: not valid java name */
    public static final int m1660getTypeZmokQxo(android.view.KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                return KeyEventType.Companion.m1657getKeyUpCS__XNY();
            }
            return KeyEventType.Companion.m1658getUnknownCS__XNY();
        }
        return KeyEventType.Companion.m1656getKeyDownCS__XNY();
    }

    /* renamed from: isAltPressed-ZmokQxo  reason: not valid java name */
    public static final boolean m1662isAltPressedZmokQxo(android.view.KeyEvent keyEvent) {
        return keyEvent.isAltPressed();
    }

    /* renamed from: isCtrlPressed-ZmokQxo  reason: not valid java name */
    public static final boolean m1663isCtrlPressedZmokQxo(android.view.KeyEvent keyEvent) {
        return keyEvent.isCtrlPressed();
    }

    /* renamed from: isShiftPressed-ZmokQxo  reason: not valid java name */
    public static final boolean m1664isShiftPressedZmokQxo(android.view.KeyEvent keyEvent) {
        return keyEvent.isShiftPressed();
    }
}
