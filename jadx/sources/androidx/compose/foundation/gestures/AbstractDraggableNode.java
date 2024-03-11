package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.DragEvent;
import androidx.compose.foundation.interaction.DragInteraction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode;
import androidx.compose.ui.input.pointer.util.VelocityTracker;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.PointerInputModifierNode;
import androidx.compose.ui.unit.Velocity;
import o.C8737dwr;
import o.C8799dyz;
import o.InterfaceC8585dra;
import o.InterfaceC8612dsa;
import o.InterfaceC8792dys;
import o.dpR;
import o.drM;
import o.drO;
import o.drX;
import o.dwU;

/* loaded from: classes.dex */
public abstract class AbstractDraggableNode extends DelegatingNode implements PointerInputModifierNode, CompositionLocalConsumerModifierNode {
    private drM<? super PointerInputChange, Boolean> canDrag;
    private DragInteraction.Start dragInteraction;
    private boolean enabled;
    private MutableInteractionSource interactionSource;
    private boolean isListeningForEvents;
    private InterfaceC8612dsa<? super dwU, ? super Offset, ? super InterfaceC8585dra<? super dpR>, ? extends Object> onDragStarted;
    private InterfaceC8612dsa<? super dwU, ? super Velocity, ? super InterfaceC8585dra<? super dpR>, ? extends Object> onDragStopped;
    private boolean reverseDirection;
    private drO<Boolean> startDragImmediately;
    private final drM<PointerInputChange, Boolean> _canDrag = new drM<PointerInputChange, Boolean>() { // from class: androidx.compose.foundation.gestures.AbstractDraggableNode$_canDrag$1
        /* JADX INFO: Access modifiers changed from: package-private */
        {
            super(1);
        }

        @Override // o.drM
        public final Boolean invoke(PointerInputChange pointerInputChange) {
            return AbstractDraggableNode.this.getCanDrag().invoke(pointerInputChange);
        }
    };
    private final drO<Boolean> _startDragImmediately = new drO<Boolean>() { // from class: androidx.compose.foundation.gestures.AbstractDraggableNode$_startDragImmediately$1
        /* JADX INFO: Access modifiers changed from: package-private */
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // o.drO
        public final Boolean invoke() {
            return AbstractDraggableNode.this.getStartDragImmediately().invoke();
        }
    };
    private final VelocityTracker velocityTracker = new VelocityTracker();
    private final SuspendingPointerInputModifierNode pointerInputNode = (SuspendingPointerInputModifierNode) delegate(SuspendingPointerInputFilterKt.SuspendingPointerInputModifierNode(new AbstractDraggableNode$pointerInputNode$1(this, null)));
    private final InterfaceC8792dys<DragEvent> channel = C8799dyz.e(Integer.MAX_VALUE, null, null, 6, null);

    public abstract Object drag(drX<? super AbstractDragScope, ? super InterfaceC8585dra<? super dpR>, ? extends Object> drx, InterfaceC8585dra<? super dpR> interfaceC8585dra);

    public abstract Object draggingBy(AbstractDragScope abstractDragScope, DragEvent.DragDelta dragDelta, InterfaceC8585dra<? super dpR> interfaceC8585dra);

    public final drM<PointerInputChange, Boolean> getCanDrag() {
        return this.canDrag;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final MutableInteractionSource getInteractionSource() {
        return this.interactionSource;
    }

    public abstract PointerDirectionConfig getPointerDirectionConfig();

    public final SuspendingPointerInputModifierNode getPointerInputNode() {
        return this.pointerInputNode;
    }

    public final boolean getReverseDirection() {
        return this.reverseDirection;
    }

    public final drO<Boolean> getStartDragImmediately() {
        return this.startDragImmediately;
    }

    public final void setCanDrag(drM<? super PointerInputChange, Boolean> drm) {
        this.canDrag = drm;
    }

    public final void setEnabled(boolean z) {
        this.enabled = z;
    }

    public final void setInteractionSource(MutableInteractionSource mutableInteractionSource) {
        this.interactionSource = mutableInteractionSource;
    }

    public final void setOnDragStarted(InterfaceC8612dsa<? super dwU, ? super Offset, ? super InterfaceC8585dra<? super dpR>, ? extends Object> interfaceC8612dsa) {
        this.onDragStarted = interfaceC8612dsa;
    }

    public final void setOnDragStopped(InterfaceC8612dsa<? super dwU, ? super Velocity, ? super InterfaceC8585dra<? super dpR>, ? extends Object> interfaceC8612dsa) {
        this.onDragStopped = interfaceC8612dsa;
    }

    public final void setReverseDirection(boolean z) {
        this.reverseDirection = z;
    }

    public final void setStartDragImmediately(drO<Boolean> dro) {
        this.startDragImmediately = dro;
    }

    public AbstractDraggableNode(drM<? super PointerInputChange, Boolean> drm, boolean z, MutableInteractionSource mutableInteractionSource, drO<Boolean> dro, InterfaceC8612dsa<? super dwU, ? super Offset, ? super InterfaceC8585dra<? super dpR>, ? extends Object> interfaceC8612dsa, InterfaceC8612dsa<? super dwU, ? super Velocity, ? super InterfaceC8585dra<? super dpR>, ? extends Object> interfaceC8612dsa2, boolean z2) {
        this.canDrag = drm;
        this.enabled = z;
        this.interactionSource = mutableInteractionSource;
        this.startDragImmediately = dro;
        this.onDragStarted = interfaceC8612dsa;
        this.onDragStopped = interfaceC8612dsa2;
        this.reverseDirection = z2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startListeningForEvents() {
        this.isListeningForEvents = true;
        C8737dwr.c(getCoroutineScope(), null, null, new AbstractDraggableNode$startListeningForEvents$1(this, null), 3, null);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        this.isListeningForEvents = false;
        disposeInteractionSource();
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    /* renamed from: onPointerEvent-H0pRuoY */
    public void mo93onPointerEventH0pRuoY(PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j) {
        this.pointerInputNode.mo93onPointerEventH0pRuoY(pointerEvent, pointerEventPass, j);
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public void onCancelPointerInput() {
        this.pointerInputNode.onCancelPointerInput();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ba A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object processDragStart(o.dwU r8, androidx.compose.foundation.gestures.DragEvent.DragStarted r9, o.InterfaceC8585dra<? super o.dpR> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof androidx.compose.foundation.gestures.AbstractDraggableNode$processDragStart$1
            if (r0 == 0) goto L13
            r0 = r10
            androidx.compose.foundation.gestures.AbstractDraggableNode$processDragStart$1 r0 = (androidx.compose.foundation.gestures.AbstractDraggableNode$processDragStart$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 + r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.AbstractDraggableNode$processDragStart$1 r0 = new androidx.compose.foundation.gestures.AbstractDraggableNode$processDragStart$1
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = o.C8588drd.c()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L5d
            if (r2 == r5) goto L4c
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            o.C8556dpz.d(r10)
            goto Lbb
        L30:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L38:
            java.lang.Object r8 = r0.L$3
            androidx.compose.foundation.interaction.DragInteraction$Start r8 = (androidx.compose.foundation.interaction.DragInteraction.Start) r8
            java.lang.Object r9 = r0.L$2
            androidx.compose.foundation.gestures.DragEvent$DragStarted r9 = (androidx.compose.foundation.gestures.DragEvent.DragStarted) r9
            java.lang.Object r2 = r0.L$1
            o.dwU r2 = (o.dwU) r2
            java.lang.Object r4 = r0.L$0
            androidx.compose.foundation.gestures.AbstractDraggableNode r4 = (androidx.compose.foundation.gestures.AbstractDraggableNode) r4
            o.C8556dpz.d(r10)
            goto L9a
        L4c:
            java.lang.Object r8 = r0.L$2
            r9 = r8
            androidx.compose.foundation.gestures.DragEvent$DragStarted r9 = (androidx.compose.foundation.gestures.DragEvent.DragStarted) r9
            java.lang.Object r8 = r0.L$1
            o.dwU r8 = (o.dwU) r8
            java.lang.Object r2 = r0.L$0
            androidx.compose.foundation.gestures.AbstractDraggableNode r2 = (androidx.compose.foundation.gestures.AbstractDraggableNode) r2
            o.C8556dpz.d(r10)
            goto L7d
        L5d:
            o.C8556dpz.d(r10)
            androidx.compose.foundation.interaction.DragInteraction$Start r10 = r7.dragInteraction
            if (r10 == 0) goto L7c
            androidx.compose.foundation.interaction.MutableInteractionSource r2 = r7.interactionSource
            if (r2 == 0) goto L7c
            androidx.compose.foundation.interaction.DragInteraction$Cancel r6 = new androidx.compose.foundation.interaction.DragInteraction$Cancel
            r6.<init>(r10)
            r0.L$0 = r7
            r0.L$1 = r8
            r0.L$2 = r9
            r0.label = r5
            java.lang.Object r10 = r2.emit(r6, r0)
            if (r10 != r1) goto L7c
            return r1
        L7c:
            r2 = r7
        L7d:
            androidx.compose.foundation.interaction.DragInteraction$Start r10 = new androidx.compose.foundation.interaction.DragInteraction$Start
            r10.<init>()
            androidx.compose.foundation.interaction.MutableInteractionSource r5 = r2.interactionSource
            if (r5 == 0) goto L9d
            r0.L$0 = r2
            r0.L$1 = r8
            r0.L$2 = r9
            r0.L$3 = r10
            r0.label = r4
            java.lang.Object r4 = r5.emit(r10, r0)
            if (r4 != r1) goto L97
            return r1
        L97:
            r4 = r2
            r2 = r8
            r8 = r10
        L9a:
            r10 = r8
            r8 = r2
            r2 = r4
        L9d:
            r2.dragInteraction = r10
            o.dsa<? super o.dwU, ? super androidx.compose.ui.geometry.Offset, ? super o.dra<? super o.dpR>, ? extends java.lang.Object> r10 = r2.onDragStarted
            long r4 = r9.m163getStartPointF1C5BW0()
            androidx.compose.ui.geometry.Offset r9 = androidx.compose.ui.geometry.Offset.m1126boximpl(r4)
            r2 = 0
            r0.L$0 = r2
            r0.L$1 = r2
            r0.L$2 = r2
            r0.L$3 = r2
            r0.label = r3
            java.lang.Object r8 = r10.invoke(r8, r9, r0)
            if (r8 != r1) goto Lbb
            return r1
        Lbb:
            o.dpR r8 = o.dpR.c
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.AbstractDraggableNode.processDragStart(o.dwU, androidx.compose.foundation.gestures.DragEvent$DragStarted, o.dra):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0084 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object processDragStop(o.dwU r10, androidx.compose.foundation.gestures.DragEvent.DragStopped r11, o.InterfaceC8585dra<? super o.dpR> r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof androidx.compose.foundation.gestures.AbstractDraggableNode$processDragStop$1
            if (r0 == 0) goto L13
            r0 = r12
            androidx.compose.foundation.gestures.AbstractDraggableNode$processDragStop$1 r0 = (androidx.compose.foundation.gestures.AbstractDraggableNode$processDragStop$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 + r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.AbstractDraggableNode$processDragStop$1 r0 = new androidx.compose.foundation.gestures.AbstractDraggableNode$processDragStop$1
            r0.<init>(r9, r12)
        L18:
            java.lang.Object r12 = r0.result
            java.lang.Object r1 = o.C8588drd.c()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L48
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            o.C8556dpz.d(r12)
            goto L85
        L2d:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L35:
            java.lang.Object r10 = r0.L$2
            androidx.compose.foundation.gestures.DragEvent$DragStopped r10 = (androidx.compose.foundation.gestures.DragEvent.DragStopped) r10
            java.lang.Object r11 = r0.L$1
            o.dwU r11 = (o.dwU) r11
            java.lang.Object r2 = r0.L$0
            androidx.compose.foundation.gestures.AbstractDraggableNode r2 = (androidx.compose.foundation.gestures.AbstractDraggableNode) r2
            o.C8556dpz.d(r12)
            r8 = r11
            r11 = r10
            r10 = r8
            goto L68
        L48:
            o.C8556dpz.d(r12)
            androidx.compose.foundation.interaction.DragInteraction$Start r12 = r9.dragInteraction
            if (r12 == 0) goto L6b
            androidx.compose.foundation.interaction.MutableInteractionSource r2 = r9.interactionSource
            if (r2 == 0) goto L67
            androidx.compose.foundation.interaction.DragInteraction$Stop r6 = new androidx.compose.foundation.interaction.DragInteraction$Stop
            r6.<init>(r12)
            r0.L$0 = r9
            r0.L$1 = r10
            r0.L$2 = r11
            r0.label = r4
            java.lang.Object r12 = r2.emit(r6, r0)
            if (r12 != r1) goto L67
            return r1
        L67:
            r2 = r9
        L68:
            r2.dragInteraction = r5
            goto L6c
        L6b:
            r2 = r9
        L6c:
            o.dsa<? super o.dwU, ? super androidx.compose.ui.unit.Velocity, ? super o.dra<? super o.dpR>, ? extends java.lang.Object> r12 = r2.onDragStopped
            long r6 = r11.m164getVelocity9UxMQ8M()
            androidx.compose.ui.unit.Velocity r11 = androidx.compose.ui.unit.Velocity.m2580boximpl(r6)
            r0.L$0 = r5
            r0.L$1 = r5
            r0.L$2 = r5
            r0.label = r3
            java.lang.Object r10 = r12.invoke(r10, r11, r0)
            if (r10 != r1) goto L85
            return r1
        L85:
            o.dpR r10 = o.dpR.c
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.AbstractDraggableNode.processDragStop(o.dwU, androidx.compose.foundation.gestures.DragEvent$DragStopped, o.dra):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007b A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object processDragCancel(o.dwU r9, o.InterfaceC8585dra<? super o.dpR> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof androidx.compose.foundation.gestures.AbstractDraggableNode$processDragCancel$1
            if (r0 == 0) goto L13
            r0 = r10
            androidx.compose.foundation.gestures.AbstractDraggableNode$processDragCancel$1 r0 = (androidx.compose.foundation.gestures.AbstractDraggableNode$processDragCancel$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 + r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.AbstractDraggableNode$processDragCancel$1 r0 = new androidx.compose.foundation.gestures.AbstractDraggableNode$processDragCancel$1
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = o.C8588drd.c()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L41
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            o.C8556dpz.d(r10)
            goto L7c
        L2d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L35:
            java.lang.Object r9 = r0.L$1
            o.dwU r9 = (o.dwU) r9
            java.lang.Object r2 = r0.L$0
            androidx.compose.foundation.gestures.AbstractDraggableNode r2 = (androidx.compose.foundation.gestures.AbstractDraggableNode) r2
            o.C8556dpz.d(r10)
            goto L5f
        L41:
            o.C8556dpz.d(r10)
            androidx.compose.foundation.interaction.DragInteraction$Start r10 = r8.dragInteraction
            if (r10 == 0) goto L62
            androidx.compose.foundation.interaction.MutableInteractionSource r2 = r8.interactionSource
            if (r2 == 0) goto L5e
            androidx.compose.foundation.interaction.DragInteraction$Cancel r6 = new androidx.compose.foundation.interaction.DragInteraction$Cancel
            r6.<init>(r10)
            r0.L$0 = r8
            r0.L$1 = r9
            r0.label = r4
            java.lang.Object r10 = r2.emit(r6, r0)
            if (r10 != r1) goto L5e
            return r1
        L5e:
            r2 = r8
        L5f:
            r2.dragInteraction = r5
            goto L63
        L62:
            r2 = r8
        L63:
            o.dsa<? super o.dwU, ? super androidx.compose.ui.unit.Velocity, ? super o.dra<? super o.dpR>, ? extends java.lang.Object> r10 = r2.onDragStopped
            androidx.compose.ui.unit.Velocity$Companion r2 = androidx.compose.ui.unit.Velocity.Companion
            long r6 = r2.m2594getZero9UxMQ8M()
            androidx.compose.ui.unit.Velocity r2 = androidx.compose.ui.unit.Velocity.m2580boximpl(r6)
            r0.L$0 = r5
            r0.L$1 = r5
            r0.label = r3
            java.lang.Object r9 = r10.invoke(r9, r2, r0)
            if (r9 != r1) goto L7c
            return r1
        L7c:
            o.dpR r9 = o.dpR.c
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.AbstractDraggableNode.processDragCancel(o.dwU, o.dra):java.lang.Object");
    }

    public final void disposeInteractionSource() {
        DragInteraction.Start start = this.dragInteraction;
        if (start != null) {
            MutableInteractionSource mutableInteractionSource = this.interactionSource;
            if (mutableInteractionSource != null) {
                mutableInteractionSource.tryEmit(new DragInteraction.Cancel(start));
            }
            this.dragInteraction = null;
        }
    }
}
