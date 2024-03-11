package androidx.compose.ui.node;

import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;

/* loaded from: classes.dex */
public interface PointerInputModifierNode extends DelegatableNode {
    default boolean interceptOutOfBoundsChildEvents() {
        return false;
    }

    void onCancelPointerInput();

    /* renamed from: onPointerEvent-H0pRuoY */
    void mo93onPointerEventH0pRuoY(PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j);

    default boolean sharePointerInputWithSiblings() {
        return false;
    }

    default void onDensityChange() {
        onCancelPointerInput();
    }

    default void onViewConfigurationChange() {
        onCancelPointerInput();
    }
}
