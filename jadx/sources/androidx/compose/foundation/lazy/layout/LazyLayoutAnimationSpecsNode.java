package androidx.compose.foundation.lazy.layout;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ParentDataModifierNode;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;

/* loaded from: classes.dex */
public final class LazyLayoutAnimationSpecsNode extends Modifier.Node implements ParentDataModifierNode {
    private FiniteAnimationSpec<Float> appearanceSpec;
    private FiniteAnimationSpec<IntOffset> placementSpec;

    public final FiniteAnimationSpec<Float> getAppearanceSpec() {
        return this.appearanceSpec;
    }

    public final FiniteAnimationSpec<IntOffset> getPlacementSpec() {
        return this.placementSpec;
    }

    @Override // androidx.compose.ui.node.ParentDataModifierNode
    public Object modifyParentData(Density density, Object obj) {
        return this;
    }

    public final void setAppearanceSpec(FiniteAnimationSpec<Float> finiteAnimationSpec) {
        this.appearanceSpec = finiteAnimationSpec;
    }

    public final void setPlacementSpec(FiniteAnimationSpec<IntOffset> finiteAnimationSpec) {
        this.placementSpec = finiteAnimationSpec;
    }

    public LazyLayoutAnimationSpecsNode(FiniteAnimationSpec<Float> finiteAnimationSpec, FiniteAnimationSpec<IntOffset> finiteAnimationSpec2) {
        this.appearanceSpec = finiteAnimationSpec;
        this.placementSpec = finiteAnimationSpec2;
    }
}
