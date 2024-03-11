package androidx.compose.ui.input.pointer;

import androidx.collection.LongSparseArray;
import java.util.List;
import o.C8627dsp;

/* loaded from: classes.dex */
final class PointerInputChangeEventProducer {
    private final LongSparseArray<PointerInputData> previousPointerInputData = new LongSparseArray<>(0, 1, null);

    public final InternalPointerEvent produce(PointerInputEvent pointerInputEvent, PositionCalculator positionCalculator) {
        long uptime;
        boolean down;
        long mo1765screenToLocalMKHz9U;
        LongSparseArray longSparseArray = new LongSparseArray(pointerInputEvent.getPointers().size());
        List<PointerInputEventData> pointers = pointerInputEvent.getPointers();
        int size = pointers.size();
        for (int i = 0; i < size; i++) {
            PointerInputEventData pointerInputEventData = pointers.get(i);
            PointerInputData pointerInputData = this.previousPointerInputData.get(pointerInputEventData.m1734getIdJ3iCeTQ());
            if (pointerInputData == null) {
                down = false;
                uptime = pointerInputEventData.getUptime();
                mo1765screenToLocalMKHz9U = pointerInputEventData.m1736getPositionF1C5BW0();
            } else {
                uptime = pointerInputData.getUptime();
                down = pointerInputData.getDown();
                mo1765screenToLocalMKHz9U = positionCalculator.mo1765screenToLocalMKHz9U(pointerInputData.m1733getPositionOnScreenF1C5BW0());
            }
            longSparseArray.put(pointerInputEventData.m1734getIdJ3iCeTQ(), new PointerInputChange(pointerInputEventData.m1734getIdJ3iCeTQ(), pointerInputEventData.getUptime(), pointerInputEventData.m1736getPositionF1C5BW0(), pointerInputEventData.getDown(), pointerInputEventData.getPressure(), uptime, mo1765screenToLocalMKHz9U, down, false, pointerInputEventData.m1739getTypeT8wyACA(), pointerInputEventData.getHistorical(), pointerInputEventData.m1738getScrollDeltaF1C5BW0(), pointerInputEventData.m1735getOriginalEventPositionF1C5BW0(), null));
            if (pointerInputEventData.getDown()) {
                this.previousPointerInputData.put(pointerInputEventData.m1734getIdJ3iCeTQ(), new PointerInputData(pointerInputEventData.getUptime(), pointerInputEventData.m1737getPositionOnScreenF1C5BW0(), pointerInputEventData.getDown(), pointerInputEventData.m1739getTypeT8wyACA(), null));
            } else {
                this.previousPointerInputData.remove(pointerInputEventData.m1734getIdJ3iCeTQ());
            }
        }
        return new InternalPointerEvent(longSparseArray, pointerInputEvent);
    }

    public final void clear() {
        this.previousPointerInputData.clear();
    }

    /* loaded from: classes.dex */
    static final class PointerInputData {
        private final boolean down;
        private final long positionOnScreen;
        private final int type;
        private final long uptime;

        public /* synthetic */ PointerInputData(long j, long j2, boolean z, int i, C8627dsp c8627dsp) {
            this(j, j2, z, i);
        }

        public final boolean getDown() {
            return this.down;
        }

        /* renamed from: getPositionOnScreen-F1C5BW0  reason: not valid java name */
        public final long m1733getPositionOnScreenF1C5BW0() {
            return this.positionOnScreen;
        }

        public final long getUptime() {
            return this.uptime;
        }

        private PointerInputData(long j, long j2, boolean z, int i) {
            this.uptime = j;
            this.positionOnScreen = j2;
            this.down = z;
            this.type = i;
        }
    }
}
