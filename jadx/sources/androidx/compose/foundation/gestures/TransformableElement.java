package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.node.ModifierNodeElement;
import o.C8632dsu;
import o.drM;

/* loaded from: classes.dex */
final class TransformableElement extends ModifierNodeElement<TransformableNode> {
    private final drM<Offset, Boolean> canPan;
    private final boolean enabled;
    private final boolean lockRotationOnZoomPan;
    private final TransformableState state;

    /* JADX WARN: Multi-variable type inference failed */
    public TransformableElement(TransformableState transformableState, drM<? super Offset, Boolean> drm, boolean z, boolean z2) {
        this.state = transformableState;
        this.canPan = drm;
        this.lockRotationOnZoomPan = z;
        this.enabled = z2;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public TransformableNode create() {
        return new TransformableNode(this.state, this.canPan, this.lockRotationOnZoomPan, this.enabled);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(TransformableNode transformableNode) {
        transformableNode.update(this.state, this.canPan, this.lockRotationOnZoomPan, this.enabled);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && TransformableElement.class == obj.getClass()) {
            TransformableElement transformableElement = (TransformableElement) obj;
            return C8632dsu.c(this.state, transformableElement.state) && C8632dsu.c(this.canPan, transformableElement.canPan) && this.lockRotationOnZoomPan == transformableElement.lockRotationOnZoomPan && this.enabled == transformableElement.enabled;
        }
        return false;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        int hashCode = this.state.hashCode();
        int hashCode2 = this.canPan.hashCode();
        return (((((hashCode * 31) + hashCode2) * 31) + Boolean.hashCode(this.lockRotationOnZoomPan)) * 31) + Boolean.hashCode(this.enabled);
    }
}
