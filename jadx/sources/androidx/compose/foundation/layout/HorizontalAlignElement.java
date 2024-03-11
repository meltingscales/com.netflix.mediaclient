package androidx.compose.foundation.layout;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.node.ModifierNodeElement;
import o.C8632dsu;

/* loaded from: classes.dex */
public final class HorizontalAlignElement extends ModifierNodeElement<HorizontalAlignNode> {
    private final Alignment.Horizontal horizontal;

    public HorizontalAlignElement(Alignment.Horizontal horizontal) {
        this.horizontal = horizontal;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public HorizontalAlignNode create() {
        return new HorizontalAlignNode(this.horizontal);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(HorizontalAlignNode horizontalAlignNode) {
        horizontalAlignNode.setHorizontal(this.horizontal);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.horizontal.hashCode();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        HorizontalAlignElement horizontalAlignElement = obj instanceof HorizontalAlignElement ? (HorizontalAlignElement) obj : null;
        if (horizontalAlignElement == null) {
            return false;
        }
        return C8632dsu.c(this.horizontal, horizontalAlignElement.horizontal);
    }
}
