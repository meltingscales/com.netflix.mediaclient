package androidx.compose.foundation;

import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.input.key.Key_androidKt;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* loaded from: classes.dex */
public final class Clickable_androidKt {
    private static final long TapIndicationDelay = ViewConfiguration.getTapTimeout();

    public static final long getTapIndicationDelay() {
        return TapIndicationDelay;
    }

    public static final boolean isComposeRootInScrollableContainer(CompositionLocalConsumerModifierNode compositionLocalConsumerModifierNode) {
        return isInScrollableViewGroup((View) CompositionLocalConsumerModifierNodeKt.currentValueOf(compositionLocalConsumerModifierNode, AndroidCompositionLocals_androidKt.getLocalView()));
    }

    private static final boolean isInScrollableViewGroup(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && (parent instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup.shouldDelayChildPressedState()) {
                return true;
            }
            parent = viewGroup.getParent();
        }
        return false;
    }

    /* renamed from: isPress-ZmokQxo  reason: not valid java name */
    public static final boolean m138isPressZmokQxo(KeyEvent keyEvent) {
        return KeyEventType.m1652equalsimpl0(KeyEvent_androidKt.m1660getTypeZmokQxo(keyEvent), KeyEventType.Companion.m1656getKeyDownCS__XNY()) && m137isEnterZmokQxo(keyEvent);
    }

    /* renamed from: isClick-ZmokQxo  reason: not valid java name */
    public static final boolean m136isClickZmokQxo(KeyEvent keyEvent) {
        return KeyEventType.m1652equalsimpl0(KeyEvent_androidKt.m1660getTypeZmokQxo(keyEvent), KeyEventType.Companion.m1657getKeyUpCS__XNY()) && m137isEnterZmokQxo(keyEvent);
    }

    /* renamed from: isEnter-ZmokQxo  reason: not valid java name */
    private static final boolean m137isEnterZmokQxo(KeyEvent keyEvent) {
        int m1665getNativeKeyCodeYVgTNJs = Key_androidKt.m1665getNativeKeyCodeYVgTNJs(KeyEvent_androidKt.m1659getKeyZmokQxo(keyEvent));
        return m1665getNativeKeyCodeYVgTNJs == 23 || m1665getNativeKeyCodeYVgTNJs == 66 || m1665getNativeKeyCodeYVgTNJs == 160;
    }
}
