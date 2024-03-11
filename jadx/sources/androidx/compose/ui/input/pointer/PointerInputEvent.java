package androidx.compose.ui.input.pointer;

import android.view.MotionEvent;
import java.util.List;

/* loaded from: classes.dex */
public final class PointerInputEvent {
    private final MotionEvent motionEvent;
    private final List<PointerInputEventData> pointers;
    private final long uptime;

    public final MotionEvent getMotionEvent() {
        return this.motionEvent;
    }

    public final List<PointerInputEventData> getPointers() {
        return this.pointers;
    }

    public PointerInputEvent(long j, List<PointerInputEventData> list, MotionEvent motionEvent) {
        this.uptime = j;
        this.pointers = list;
        this.motionEvent = motionEvent;
    }
}
