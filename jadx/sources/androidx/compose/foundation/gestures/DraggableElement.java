package androidx.compose.foundation.gestures;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.unit.Velocity;
import o.C8632dsu;
import o.InterfaceC8585dra;
import o.InterfaceC8612dsa;
import o.dpR;
import o.drM;
import o.drO;
import o.dwU;

/* loaded from: classes.dex */
public final class DraggableElement extends ModifierNodeElement<DraggableNode> {
    private final drM<PointerInputChange, Boolean> canDrag;
    private final boolean enabled;
    private final MutableInteractionSource interactionSource;
    private final InterfaceC8612dsa<dwU, Offset, InterfaceC8585dra<? super dpR>, Object> onDragStarted;
    private final InterfaceC8612dsa<dwU, Velocity, InterfaceC8585dra<? super dpR>, Object> onDragStopped;
    private final Orientation orientation;
    private final boolean reverseDirection;
    private final drO<Boolean> startDragImmediately;
    private final DraggableState state;

    /* JADX WARN: Multi-variable type inference failed */
    public DraggableElement(DraggableState draggableState, drM<? super PointerInputChange, Boolean> drm, Orientation orientation, boolean z, MutableInteractionSource mutableInteractionSource, drO<Boolean> dro, InterfaceC8612dsa<? super dwU, ? super Offset, ? super InterfaceC8585dra<? super dpR>, ? extends Object> interfaceC8612dsa, InterfaceC8612dsa<? super dwU, ? super Velocity, ? super InterfaceC8585dra<? super dpR>, ? extends Object> interfaceC8612dsa2, boolean z2) {
        this.state = draggableState;
        this.canDrag = drm;
        this.orientation = orientation;
        this.enabled = z;
        this.interactionSource = mutableInteractionSource;
        this.startDragImmediately = dro;
        this.onDragStarted = interfaceC8612dsa;
        this.onDragStopped = interfaceC8612dsa2;
        this.reverseDirection = z2;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public DraggableNode create() {
        return new DraggableNode(this.state, this.canDrag, this.orientation, this.enabled, this.interactionSource, this.startDragImmediately, this.onDragStarted, this.onDragStopped, this.reverseDirection);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(DraggableNode draggableNode) {
        draggableNode.update(this.state, this.canDrag, this.orientation, this.enabled, this.interactionSource, this.startDragImmediately, this.onDragStarted, this.onDragStopped, this.reverseDirection);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && DraggableElement.class == obj.getClass()) {
            DraggableElement draggableElement = (DraggableElement) obj;
            return C8632dsu.c(this.state, draggableElement.state) && C8632dsu.c(this.canDrag, draggableElement.canDrag) && this.orientation == draggableElement.orientation && this.enabled == draggableElement.enabled && C8632dsu.c(this.interactionSource, draggableElement.interactionSource) && C8632dsu.c(this.startDragImmediately, draggableElement.startDragImmediately) && C8632dsu.c(this.onDragStarted, draggableElement.onDragStarted) && C8632dsu.c(this.onDragStopped, draggableElement.onDragStopped) && this.reverseDirection == draggableElement.reverseDirection;
        }
        return false;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        int hashCode = this.state.hashCode();
        int hashCode2 = this.canDrag.hashCode();
        int hashCode3 = this.orientation.hashCode();
        int hashCode4 = Boolean.hashCode(this.enabled);
        MutableInteractionSource mutableInteractionSource = this.interactionSource;
        int hashCode5 = mutableInteractionSource != null ? mutableInteractionSource.hashCode() : 0;
        int hashCode6 = this.startDragImmediately.hashCode();
        return (((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + this.onDragStarted.hashCode()) * 31) + this.onDragStopped.hashCode()) * 31) + Boolean.hashCode(this.reverseDirection);
    }
}
