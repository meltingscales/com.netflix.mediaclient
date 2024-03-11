package androidx.compose.foundation.layout;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import o.dpR;
import o.drM;

/* loaded from: classes.dex */
final class IntrinsicHeightElement extends ModifierNodeElement<IntrinsicHeightNode> {
    private final boolean enforceIncoming;
    private final IntrinsicSize height;
    private final drM<InspectorInfo, dpR> inspectorInfo;

    /* JADX WARN: Multi-variable type inference failed */
    public IntrinsicHeightElement(IntrinsicSize intrinsicSize, boolean z, drM<? super InspectorInfo, dpR> drm) {
        this.height = intrinsicSize;
        this.enforceIncoming = z;
        this.inspectorInfo = drm;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public IntrinsicHeightNode create() {
        return new IntrinsicHeightNode(this.height, this.enforceIncoming);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(IntrinsicHeightNode intrinsicHeightNode) {
        intrinsicHeightNode.setHeight(this.height);
        intrinsicHeightNode.setEnforceIncoming(this.enforceIncoming);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        IntrinsicHeightElement intrinsicHeightElement = obj instanceof IntrinsicHeightElement ? (IntrinsicHeightElement) obj : null;
        if (intrinsicHeightElement == null) {
            return false;
        }
        return this.height == intrinsicHeightElement.height && this.enforceIncoming == intrinsicHeightElement.enforceIncoming;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return (this.height.hashCode() * 31) + Boolean.hashCode(this.enforceIncoming);
    }
}
