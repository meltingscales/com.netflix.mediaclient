package androidx.compose.ui.input.pointer;

import android.view.MotionEvent;
import androidx.collection.LongSparseArray;
import java.util.List;

/* loaded from: classes.dex */
public final class InternalPointerEvent {
    private final LongSparseArray<PointerInputChange> changes;
    private final PointerInputEvent pointerInputEvent;
    private boolean suppressMovementConsumption;

    public final LongSparseArray<PointerInputChange> getChanges() {
        return this.changes;
    }

    public final boolean getSuppressMovementConsumption() {
        return this.suppressMovementConsumption;
    }

    public final void setSuppressMovementConsumption(boolean z) {
        this.suppressMovementConsumption = z;
    }

    public InternalPointerEvent(LongSparseArray<PointerInputChange> longSparseArray, PointerInputEvent pointerInputEvent) {
        this.changes = longSparseArray;
        this.pointerInputEvent = pointerInputEvent;
    }

    public final MotionEvent getMotionEvent() {
        return this.pointerInputEvent.getMotionEvent();
    }

    /* renamed from: issuesEnterExitEvent-0FcD4WY  reason: not valid java name */
    public final boolean m1688issuesEnterExitEvent0FcD4WY(long j) {
        PointerInputEventData pointerInputEventData;
        List<PointerInputEventData> pointers = this.pointerInputEvent.getPointers();
        int size = pointers.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                pointerInputEventData = null;
                break;
            }
            pointerInputEventData = pointers.get(i);
            if (PointerId.m1719equalsimpl0(pointerInputEventData.m1734getIdJ3iCeTQ(), j)) {
                break;
            }
            i++;
        }
        PointerInputEventData pointerInputEventData2 = pointerInputEventData;
        if (pointerInputEventData2 != null) {
            return pointerInputEventData2.getIssuesEnterExit();
        }
        return false;
    }
}
