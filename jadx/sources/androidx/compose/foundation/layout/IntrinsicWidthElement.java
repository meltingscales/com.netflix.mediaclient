package androidx.compose.foundation.layout;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import o.dpR;
import o.drM;

/* loaded from: classes.dex */
final class IntrinsicWidthElement extends ModifierNodeElement<IntrinsicWidthNode> {
    private final boolean enforceIncoming;
    private final drM<InspectorInfo, dpR> inspectorInfo;
    private final IntrinsicSize width;

    /* JADX WARN: Multi-variable type inference failed */
    public IntrinsicWidthElement(IntrinsicSize intrinsicSize, boolean z, drM<? super InspectorInfo, dpR> drm) {
        this.width = intrinsicSize;
        this.enforceIncoming = z;
        this.inspectorInfo = drm;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public IntrinsicWidthNode create() {
        return new IntrinsicWidthNode(this.width, this.enforceIncoming);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(IntrinsicWidthNode intrinsicWidthNode) {
        intrinsicWidthNode.setWidth(this.width);
        intrinsicWidthNode.setEnforceIncoming(this.enforceIncoming);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        IntrinsicWidthElement intrinsicWidthElement = obj instanceof IntrinsicWidthElement ? (IntrinsicWidthElement) obj : null;
        if (intrinsicWidthElement == null) {
            return false;
        }
        return this.width == intrinsicWidthElement.width && this.enforceIncoming == intrinsicWidthElement.enforceIncoming;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return (this.width.hashCode() * 31) + Boolean.hashCode(this.enforceIncoming);
    }
}
