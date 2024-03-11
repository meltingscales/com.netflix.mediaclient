package androidx.compose.material3;

import androidx.compose.ui.node.ModifierNodeElement;

/* loaded from: classes.dex */
public final class MinimumInteractiveModifier extends ModifierNodeElement<MinimumInteractiveModifierNode> {
    public static final MinimumInteractiveModifier INSTANCE = new MinimumInteractiveModifier();

    public boolean equals(Object obj) {
        return obj == this;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(MinimumInteractiveModifierNode minimumInteractiveModifierNode) {
    }

    private MinimumInteractiveModifier() {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public MinimumInteractiveModifierNode create() {
        return new MinimumInteractiveModifierNode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return System.identityHashCode(this);
    }
}
