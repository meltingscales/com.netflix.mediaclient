package androidx.compose.foundation.layout;

import androidx.compose.ui.node.ModifierNodeElement;

/* loaded from: classes.dex */
public final class LayoutWeightElement extends ModifierNodeElement<LayoutWeightNode> {
    private final boolean fill;
    private final float weight;

    public LayoutWeightElement(float f, boolean z) {
        this.weight = f;
        this.fill = z;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public LayoutWeightNode create() {
        return new LayoutWeightNode(this.weight, this.fill);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(LayoutWeightNode layoutWeightNode) {
        layoutWeightNode.setWeight(this.weight);
        layoutWeightNode.setFill(this.fill);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return (Float.hashCode(this.weight) * 31) + Boolean.hashCode(this.fill);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        LayoutWeightElement layoutWeightElement = obj instanceof LayoutWeightElement ? (LayoutWeightElement) obj : null;
        if (layoutWeightElement == null) {
            return false;
        }
        return this.weight == layoutWeightElement.weight && this.fill == layoutWeightElement.fill;
    }
}
