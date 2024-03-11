package androidx.compose.ui.focus;

import android.view.KeyEvent;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.input.rotary.RotaryScrollEvent;
import androidx.compose.ui.unit.LayoutDirection;

/* loaded from: classes.dex */
public interface FocusOwner extends FocusManager {
    void clearFocus(boolean z, boolean z2);

    /* renamed from: dispatchInterceptedSoftKeyboardEvent-ZmokQxo  reason: not valid java name */
    boolean mo1091dispatchInterceptedSoftKeyboardEventZmokQxo(KeyEvent keyEvent);

    /* renamed from: dispatchKeyEvent-ZmokQxo  reason: not valid java name */
    boolean mo1092dispatchKeyEventZmokQxo(KeyEvent keyEvent);

    boolean dispatchRotaryEvent(RotaryScrollEvent rotaryScrollEvent);

    Rect getFocusRect();

    FocusTransactionManager getFocusTransactionManager();

    Modifier getModifier();

    void releaseFocus();

    void scheduleInvalidation(FocusEventModifierNode focusEventModifierNode);

    void scheduleInvalidation(FocusPropertiesModifierNode focusPropertiesModifierNode);

    void scheduleInvalidation(FocusTargetNode focusTargetNode);

    void setLayoutDirection(LayoutDirection layoutDirection);

    void takeFocus();
}
