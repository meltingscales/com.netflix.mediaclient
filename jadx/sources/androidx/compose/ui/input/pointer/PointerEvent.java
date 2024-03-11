package androidx.compose.ui.input.pointer;

import android.view.MotionEvent;
import java.util.List;

/* loaded from: classes.dex */
public final class PointerEvent {
    private final int buttons;
    private final List<PointerInputChange> changes;
    private final InternalPointerEvent internalPointerEvent;
    private final int keyboardModifiers;
    private int type;

    /* renamed from: getButtons-ry648PA  reason: not valid java name */
    public final int m1697getButtonsry648PA() {
        return this.buttons;
    }

    public final List<PointerInputChange> getChanges() {
        return this.changes;
    }

    public final InternalPointerEvent getInternalPointerEvent$ui_release() {
        return this.internalPointerEvent;
    }

    /* renamed from: getType-7fucELk  reason: not valid java name */
    public final int m1698getType7fucELk() {
        return this.type;
    }

    /* renamed from: setType-EhbLWgg$ui_release  reason: not valid java name */
    public final void m1699setTypeEhbLWgg$ui_release(int i) {
        this.type = i;
    }

    public PointerEvent(List<PointerInputChange> list, InternalPointerEvent internalPointerEvent) {
        this.changes = list;
        this.internalPointerEvent = internalPointerEvent;
        MotionEvent motionEvent$ui_release = getMotionEvent$ui_release();
        this.buttons = PointerButtons.m1691constructorimpl(motionEvent$ui_release != null ? motionEvent$ui_release.getButtonState() : 0);
        MotionEvent motionEvent$ui_release2 = getMotionEvent$ui_release();
        this.keyboardModifiers = PointerKeyboardModifiers.m1747constructorimpl(motionEvent$ui_release2 != null ? motionEvent$ui_release2.getMetaState() : 0);
        this.type = m1696calculatePointerEventType7fucELk();
    }

    public final MotionEvent getMotionEvent$ui_release() {
        InternalPointerEvent internalPointerEvent = this.internalPointerEvent;
        if (internalPointerEvent != null) {
            return internalPointerEvent.getMotionEvent();
        }
        return null;
    }

    public PointerEvent(List<PointerInputChange> list) {
        this(list, null);
    }

    /* renamed from: calculatePointerEventType-7fucELk  reason: not valid java name */
    private final int m1696calculatePointerEventType7fucELk() {
        MotionEvent motionEvent$ui_release = getMotionEvent$ui_release();
        if (motionEvent$ui_release != null) {
            int actionMasked = motionEvent$ui_release.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        switch (actionMasked) {
                            case 5:
                                break;
                            case 6:
                                break;
                            case 7:
                                break;
                            case 8:
                                return PointerEventType.Companion.m1713getScroll7fucELk();
                            case 9:
                                return PointerEventType.Companion.m1708getEnter7fucELk();
                            case 10:
                                return PointerEventType.Companion.m1709getExit7fucELk();
                            default:
                                return PointerEventType.Companion.m1714getUnknown7fucELk();
                        }
                    }
                    return PointerEventType.Companion.m1710getMove7fucELk();
                }
                return PointerEventType.Companion.m1712getRelease7fucELk();
            }
            return PointerEventType.Companion.m1711getPress7fucELk();
        }
        List<PointerInputChange> list = this.changes;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            PointerInputChange pointerInputChange = list.get(i);
            if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange)) {
                return PointerEventType.Companion.m1712getRelease7fucELk();
            }
            if (PointerEventKt.changedToDownIgnoreConsumed(pointerInputChange)) {
                return PointerEventType.Companion.m1711getPress7fucELk();
            }
        }
        return PointerEventType.Companion.m1710getMove7fucELk();
    }
}
