package androidx.compose.foundation.layout;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import o.C8632dsu;
import o.dpR;
import o.drM;

/* loaded from: classes.dex */
final class BoxChildDataElement extends ModifierNodeElement<BoxChildDataNode> {
    private final Alignment alignment;
    private final drM<InspectorInfo, dpR> inspectorInfo;
    private final boolean matchParentSize;

    /* JADX WARN: Multi-variable type inference failed */
    public BoxChildDataElement(Alignment alignment, boolean z, drM<? super InspectorInfo, dpR> drm) {
        this.alignment = alignment;
        this.matchParentSize = z;
        this.inspectorInfo = drm;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public BoxChildDataNode create() {
        return new BoxChildDataNode(this.alignment, this.matchParentSize);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(BoxChildDataNode boxChildDataNode) {
        boxChildDataNode.setAlignment(this.alignment);
        boxChildDataNode.setMatchParentSize(this.matchParentSize);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return (this.alignment.hashCode() * 31) + Boolean.hashCode(this.matchParentSize);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        BoxChildDataElement boxChildDataElement = obj instanceof BoxChildDataElement ? (BoxChildDataElement) obj : null;
        if (boxChildDataElement == null) {
            return false;
        }
        return C8632dsu.c(this.alignment, boxChildDataElement.alignment) && this.matchParentSize == boxChildDataElement.matchParentSize;
    }
}
