package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode;
import androidx.compose.ui.node.DelegatingNode;
import o.C8632dsu;
import o.C8799dyz;
import o.InterfaceC8792dys;
import o.drM;

/* loaded from: classes.dex */
final class TransformableNode extends DelegatingNode {
    private drM<? super Offset, Boolean> canPan;
    private boolean enabled;
    private boolean lockRotationOnZoomPan;
    private TransformableState state;
    private final drM<Offset, Boolean> updatedCanPan = new drM<Offset, Boolean>() { // from class: androidx.compose.foundation.gestures.TransformableNode$updatedCanPan$1
        /* JADX INFO: Access modifiers changed from: package-private */
        {
            super(1);
        }

        @Override // o.drM
        public /* synthetic */ Boolean invoke(Offset offset) {
            return m220invokek4lQ0M(offset.m1146unboximpl());
        }

        /* renamed from: invoke-k-4lQ0M  reason: not valid java name */
        public final Boolean m220invokek4lQ0M(long j) {
            drM drm;
            drm = TransformableNode.this.canPan;
            return (Boolean) drm.invoke(Offset.m1126boximpl(j));
        }
    };
    private final InterfaceC8792dys<TransformEvent> channel = C8799dyz.e(Integer.MAX_VALUE, null, null, 6, null);
    private final SuspendingPointerInputModifierNode pointerInputNode = (SuspendingPointerInputModifierNode) delegate(SuspendingPointerInputFilterKt.SuspendingPointerInputModifierNode(new TransformableNode$pointerInputNode$1(this, null)));

    public TransformableNode(TransformableState transformableState, drM<? super Offset, Boolean> drm, boolean z, boolean z2) {
        this.state = transformableState;
        this.canPan = drm;
        this.lockRotationOnZoomPan = z;
        this.enabled = z2;
    }

    public final void update(TransformableState transformableState, drM<? super Offset, Boolean> drm, boolean z, boolean z2) {
        this.canPan = drm;
        if (C8632dsu.c(this.state, transformableState) && this.enabled == z2 && this.lockRotationOnZoomPan == z) {
            return;
        }
        this.state = transformableState;
        this.enabled = z2;
        this.lockRotationOnZoomPan = z;
        this.pointerInputNode.resetPointerInputHandler();
    }
}
