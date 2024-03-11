package androidx.compose.foundation.lazy;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.lazy.layout.LazyLayoutAnimationSpecsNode;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.unit.IntOffset;
import o.C8632dsu;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AnimateItemElement extends ModifierNodeElement<LazyLayoutAnimationSpecsNode> {
    private final FiniteAnimationSpec<Float> appearanceSpec;
    private final FiniteAnimationSpec<IntOffset> placementSpec;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AnimateItemElement) {
            AnimateItemElement animateItemElement = (AnimateItemElement) obj;
            return C8632dsu.c(this.appearanceSpec, animateItemElement.appearanceSpec) && C8632dsu.c(this.placementSpec, animateItemElement.placementSpec);
        }
        return false;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        FiniteAnimationSpec<Float> finiteAnimationSpec = this.appearanceSpec;
        int hashCode = finiteAnimationSpec == null ? 0 : finiteAnimationSpec.hashCode();
        FiniteAnimationSpec<IntOffset> finiteAnimationSpec2 = this.placementSpec;
        return (hashCode * 31) + (finiteAnimationSpec2 != null ? finiteAnimationSpec2.hashCode() : 0);
    }

    public String toString() {
        return "AnimateItemElement(appearanceSpec=" + this.appearanceSpec + ", placementSpec=" + this.placementSpec + ')';
    }

    public AnimateItemElement(FiniteAnimationSpec<Float> finiteAnimationSpec, FiniteAnimationSpec<IntOffset> finiteAnimationSpec2) {
        this.appearanceSpec = finiteAnimationSpec;
        this.placementSpec = finiteAnimationSpec2;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public LazyLayoutAnimationSpecsNode create() {
        return new LazyLayoutAnimationSpecsNode(this.appearanceSpec, this.placementSpec);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(LazyLayoutAnimationSpecsNode lazyLayoutAnimationSpecsNode) {
        lazyLayoutAnimationSpecsNode.setAppearanceSpec(this.appearanceSpec);
        lazyLayoutAnimationSpecsNode.setPlacementSpec(this.placementSpec);
    }
}
