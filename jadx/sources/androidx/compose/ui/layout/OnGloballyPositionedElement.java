package androidx.compose.ui.layout;

import androidx.compose.ui.node.ModifierNodeElement;
import o.C8632dsu;
import o.dpR;
import o.drM;

/* loaded from: classes.dex */
final class OnGloballyPositionedElement extends ModifierNodeElement<OnGloballyPositionedNode> {
    private final drM<LayoutCoordinates, dpR> onGloballyPositioned;

    /* JADX WARN: Multi-variable type inference failed */
    public OnGloballyPositionedElement(drM<? super LayoutCoordinates, dpR> drm) {
        this.onGloballyPositioned = drm;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public OnGloballyPositionedNode create() {
        return new OnGloballyPositionedNode(this.onGloballyPositioned);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnGloballyPositionedElement) {
            return C8632dsu.c(this.onGloballyPositioned, ((OnGloballyPositionedElement) obj).onGloballyPositioned);
        }
        return false;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.onGloballyPositioned.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(OnGloballyPositionedNode onGloballyPositionedNode) {
        onGloballyPositionedNode.setCallback(this.onGloballyPositioned);
    }
}
