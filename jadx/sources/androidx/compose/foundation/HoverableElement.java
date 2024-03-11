package androidx.compose.foundation;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.node.ModifierNodeElement;
import o.C8632dsu;

/* loaded from: classes.dex */
final class HoverableElement extends ModifierNodeElement<HoverableNode> {
    private final MutableInteractionSource interactionSource;

    public HoverableElement(MutableInteractionSource mutableInteractionSource) {
        this.interactionSource = mutableInteractionSource;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public HoverableNode create() {
        return new HoverableNode(this.interactionSource);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(HoverableNode hoverableNode) {
        hoverableNode.updateInteractionSource(this.interactionSource);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.interactionSource.hashCode() * 31;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof HoverableElement) && C8632dsu.c(((HoverableElement) obj).interactionSource, this.interactionSource);
    }
}
