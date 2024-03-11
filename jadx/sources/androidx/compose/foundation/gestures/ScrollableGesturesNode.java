package androidx.compose.foundation.gestures;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.unit.Velocity;
import o.InterfaceC8585dra;
import o.InterfaceC8612dsa;
import o.dpR;
import o.drM;
import o.drO;
import o.dwU;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ScrollableGesturesNode extends DelegatingNode {
    private final DraggableNode draggableGesturesNode;
    private final ScrollDraggableState draggableState;
    private final boolean enabled;
    private final MutableInteractionSource interactionSource;
    private final NestedScrollDispatcher nestedScrollDispatcher;
    private final InterfaceC8612dsa<dwU, Velocity, InterfaceC8585dra<? super dpR>, Object> onDragStopped;
    private final Orientation orientation;
    private final ScrollingLogic scrollLogic;
    private final drO<Boolean> startDragImmediately;

    public final NestedScrollDispatcher getNestedScrollDispatcher() {
        return this.nestedScrollDispatcher;
    }

    public final ScrollingLogic getScrollLogic() {
        return this.scrollLogic;
    }

    public ScrollableGesturesNode(ScrollingLogic scrollingLogic, Orientation orientation, boolean z, NestedScrollDispatcher nestedScrollDispatcher, MutableInteractionSource mutableInteractionSource) {
        drM drm;
        InterfaceC8612dsa interfaceC8612dsa;
        this.scrollLogic = scrollingLogic;
        this.orientation = orientation;
        this.enabled = z;
        this.nestedScrollDispatcher = nestedScrollDispatcher;
        this.interactionSource = mutableInteractionSource;
        delegate(new MouseWheelScrollNode(scrollingLogic));
        ScrollDraggableState scrollDraggableState = new ScrollDraggableState(scrollingLogic);
        this.draggableState = scrollDraggableState;
        drO<Boolean> dro = new drO<Boolean>() { // from class: androidx.compose.foundation.gestures.ScrollableGesturesNode$startDragImmediately$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // o.drO
            public final Boolean invoke() {
                return Boolean.valueOf(ScrollableGesturesNode.this.getScrollLogic().shouldScrollImmediately());
            }
        };
        this.startDragImmediately = dro;
        ScrollableGesturesNode$onDragStopped$1 scrollableGesturesNode$onDragStopped$1 = new ScrollableGesturesNode$onDragStopped$1(this, null);
        this.onDragStopped = scrollableGesturesNode$onDragStopped$1;
        drm = ScrollableKt.CanDragCalculation;
        interfaceC8612dsa = ScrollableKt.NoOpOnDragStarted;
        this.draggableGesturesNode = (DraggableNode) delegate(new DraggableNode(scrollDraggableState, drm, orientation, z, mutableInteractionSource, dro, interfaceC8612dsa, scrollableGesturesNode$onDragStopped$1, false));
    }

    public final void update(Orientation orientation, boolean z, MutableInteractionSource mutableInteractionSource) {
        InterfaceC8612dsa<? super dwU, ? super Offset, ? super InterfaceC8585dra<? super dpR>, ? extends Object> interfaceC8612dsa;
        drM<? super PointerInputChange, Boolean> drm;
        DraggableNode draggableNode = this.draggableGesturesNode;
        ScrollDraggableState scrollDraggableState = this.draggableState;
        drO<Boolean> dro = this.startDragImmediately;
        interfaceC8612dsa = ScrollableKt.NoOpOnDragStarted;
        InterfaceC8612dsa<dwU, Velocity, InterfaceC8585dra<? super dpR>, Object> interfaceC8612dsa2 = this.onDragStopped;
        drm = ScrollableKt.CanDragCalculation;
        draggableNode.update(scrollDraggableState, drm, orientation, z, mutableInteractionSource, dro, interfaceC8612dsa, interfaceC8612dsa2, false);
    }
}
