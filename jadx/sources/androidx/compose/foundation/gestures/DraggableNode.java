package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.DragEvent;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.unit.Velocity;
import o.C8586drb;
import o.C8632dsu;
import o.InterfaceC8585dra;
import o.InterfaceC8612dsa;
import o.dpR;
import o.drM;
import o.drO;
import o.drX;
import o.dwU;

/* loaded from: classes.dex */
public final class DraggableNode extends AbstractDraggableNode {
    private final DraggableNode$abstractDragScope$1 abstractDragScope;
    private DragScope dragScope;
    private Orientation orientation;
    private final PointerDirectionConfig pointerDirectionConfig;
    private DraggableState state;

    public final DragScope getDragScope() {
        return this.dragScope;
    }

    @Override // androidx.compose.foundation.gestures.AbstractDraggableNode
    public PointerDirectionConfig getPointerDirectionConfig() {
        return this.pointerDirectionConfig;
    }

    public final void setDragScope(DragScope dragScope) {
        this.dragScope = dragScope;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [androidx.compose.foundation.gestures.DraggableNode$abstractDragScope$1] */
    public DraggableNode(DraggableState draggableState, drM<? super PointerInputChange, Boolean> drm, Orientation orientation, boolean z, MutableInteractionSource mutableInteractionSource, drO<Boolean> dro, InterfaceC8612dsa<? super dwU, ? super Offset, ? super InterfaceC8585dra<? super dpR>, ? extends Object> interfaceC8612dsa, InterfaceC8612dsa<? super dwU, ? super Velocity, ? super InterfaceC8585dra<? super dpR>, ? extends Object> interfaceC8612dsa2, boolean z2) {
        super(drm, z, mutableInteractionSource, dro, interfaceC8612dsa, interfaceC8612dsa2, z2);
        DragScope dragScope;
        this.state = draggableState;
        this.orientation = orientation;
        dragScope = DraggableKt.NoOpDragScope;
        this.dragScope = dragScope;
        this.abstractDragScope = new AbstractDragScope() { // from class: androidx.compose.foundation.gestures.DraggableNode$abstractDragScope$1
            @Override // androidx.compose.foundation.gestures.AbstractDragScope
            /* renamed from: dragBy-k-4lQ0M */
            public void mo151dragByk4lQ0M(long j) {
                Orientation orientation2;
                float m181toFloat3MmeM6k;
                DragScope dragScope2 = DraggableNode.this.getDragScope();
                orientation2 = DraggableNode.this.orientation;
                m181toFloat3MmeM6k = DraggableKt.m181toFloat3MmeM6k(j, orientation2);
                dragScope2.dragBy(m181toFloat3MmeM6k);
            }
        };
        this.pointerDirectionConfig = DragGestureDetectorKt.toPointerDirectionConfig(this.orientation);
    }

    @Override // androidx.compose.foundation.gestures.AbstractDraggableNode
    public Object drag(drX<? super AbstractDragScope, ? super InterfaceC8585dra<? super dpR>, ? extends Object> drx, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        Object e;
        Object drag = this.state.drag(MutatePriority.UserInput, new DraggableNode$drag$2(this, drx, null), interfaceC8585dra);
        e = C8586drb.e();
        return drag == e ? drag : dpR.c;
    }

    @Override // androidx.compose.foundation.gestures.AbstractDraggableNode
    public Object draggingBy(AbstractDragScope abstractDragScope, DragEvent.DragDelta dragDelta, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        abstractDragScope.mo151dragByk4lQ0M(dragDelta.m162getDeltaF1C5BW0());
        return dpR.c;
    }

    public final void update(DraggableState draggableState, drM<? super PointerInputChange, Boolean> drm, Orientation orientation, boolean z, MutableInteractionSource mutableInteractionSource, drO<Boolean> dro, InterfaceC8612dsa<? super dwU, ? super Offset, ? super InterfaceC8585dra<? super dpR>, ? extends Object> interfaceC8612dsa, InterfaceC8612dsa<? super dwU, ? super Velocity, ? super InterfaceC8585dra<? super dpR>, ? extends Object> interfaceC8612dsa2, boolean z2) {
        boolean z3;
        boolean z4 = true;
        if (C8632dsu.c(this.state, draggableState)) {
            z3 = false;
        } else {
            this.state = draggableState;
            z3 = true;
        }
        setCanDrag(drm);
        if (this.orientation != orientation) {
            this.orientation = orientation;
            z3 = true;
        }
        if (getEnabled() != z) {
            setEnabled(z);
            if (!z) {
                disposeInteractionSource();
            }
        } else {
            z4 = z3;
        }
        if (!C8632dsu.c(getInteractionSource(), mutableInteractionSource)) {
            disposeInteractionSource();
            setInteractionSource(mutableInteractionSource);
        }
        setStartDragImmediately(dro);
        setOnDragStarted(interfaceC8612dsa);
        setOnDragStopped(interfaceC8612dsa2);
        if (getReverseDirection() != z2) {
            setReverseDirection(z2);
        } else if (!z4) {
            return;
        }
        getPointerInputNode().resetPointerInputHandler();
    }
}
