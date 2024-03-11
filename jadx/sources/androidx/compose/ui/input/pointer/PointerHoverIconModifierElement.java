package androidx.compose.ui.input.pointer;

import androidx.compose.ui.node.ModifierNodeElement;
import o.C8632dsu;

/* loaded from: classes.dex */
public final class PointerHoverIconModifierElement extends ModifierNodeElement<PointerHoverIconModifierNode> {
    private final PointerIcon icon;
    private final boolean overrideDescendants;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PointerHoverIconModifierElement) {
            PointerHoverIconModifierElement pointerHoverIconModifierElement = (PointerHoverIconModifierElement) obj;
            return C8632dsu.c(this.icon, pointerHoverIconModifierElement.icon) && this.overrideDescendants == pointerHoverIconModifierElement.overrideDescendants;
        }
        return false;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return (this.icon.hashCode() * 31) + Boolean.hashCode(this.overrideDescendants);
    }

    public String toString() {
        return "PointerHoverIconModifierElement(icon=" + this.icon + ", overrideDescendants=" + this.overrideDescendants + ')';
    }

    public PointerHoverIconModifierElement(PointerIcon pointerIcon, boolean z) {
        this.icon = pointerIcon;
        this.overrideDescendants = z;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public PointerHoverIconModifierNode create() {
        return new PointerHoverIconModifierNode(this.icon, this.overrideDescendants);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(PointerHoverIconModifierNode pointerHoverIconModifierNode) {
        pointerHoverIconModifierNode.setIcon(this.icon);
        pointerHoverIconModifierNode.setOverrideDescendants(this.overrideDescendants);
    }
}
