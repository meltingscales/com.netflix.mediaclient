package androidx.compose.ui.input.pointer;

import androidx.compose.ui.node.HitTestResult;
import androidx.compose.ui.node.LayoutNode;

/* loaded from: classes.dex */
public final class PointerInputEventProcessor {
    private final HitPathTracker hitPathTracker;
    private boolean isProcessing;
    private final LayoutNode root;
    private final PointerInputChangeEventProducer pointerInputChangeEventProducer = new PointerInputChangeEventProducer();
    private final HitTestResult hitResult = new HitTestResult();

    public PointerInputEventProcessor(LayoutNode layoutNode) {
        this.root = layoutNode;
        this.hitPathTracker = new HitPathTracker(layoutNode.getCoordinates());
    }

    /* renamed from: process-BIzXfog  reason: not valid java name */
    public final int m1740processBIzXfog(PointerInputEvent pointerInputEvent, PositionCalculator positionCalculator, boolean z) {
        boolean z2;
        if (this.isProcessing) {
            return PointerInputEventProcessorKt.ProcessResult(false, false);
        }
        boolean z3 = true;
        try {
            this.isProcessing = true;
            InternalPointerEvent produce = this.pointerInputChangeEventProducer.produce(pointerInputEvent, positionCalculator);
            int size = produce.getChanges().size();
            for (int i = 0; i < size; i++) {
                PointerInputChange valueAt = produce.getChanges().valueAt(i);
                if (!valueAt.getPressed() && !valueAt.getPreviousPressed()) {
                }
                z2 = false;
                break;
            }
            z2 = true;
            int size2 = produce.getChanges().size();
            for (int i2 = 0; i2 < size2; i2++) {
                PointerInputChange valueAt2 = produce.getChanges().valueAt(i2);
                if (z2 || PointerEventKt.changedToDownIgnoreConsumed(valueAt2)) {
                    LayoutNode.m1865hitTestM_7yMNQ$ui_release$default(this.root, valueAt2.m1729getPositionF1C5BW0(), this.hitResult, PointerType.m1754equalsimpl0(valueAt2.m1732getTypeT8wyACA(), PointerType.Companion.m1761getTouchT8wyACA()), false, 8, null);
                    if (!this.hitResult.isEmpty()) {
                        this.hitPathTracker.m1687addHitPathKNwqfcY(valueAt2.m1727getIdJ3iCeTQ(), this.hitResult);
                        this.hitResult.clear();
                    }
                }
            }
            this.hitPathTracker.removeDetachedPointerInputFilters();
            boolean dispatchChanges = this.hitPathTracker.dispatchChanges(produce, z);
            if (!produce.getSuppressMovementConsumption()) {
                int size3 = produce.getChanges().size();
                for (int i3 = 0; i3 < size3; i3++) {
                    PointerInputChange valueAt3 = produce.getChanges().valueAt(i3);
                    if (PointerEventKt.positionChangedIgnoreConsumed(valueAt3) && valueAt3.isConsumed()) {
                        break;
                    }
                }
            }
            z3 = false;
            return PointerInputEventProcessorKt.ProcessResult(dispatchChanges, z3);
        } finally {
            this.isProcessing = false;
        }
    }

    public final void processCancel() {
        if (this.isProcessing) {
            return;
        }
        this.pointerInputChangeEventProducer.clear();
        this.hitPathTracker.processCancel();
    }
}
