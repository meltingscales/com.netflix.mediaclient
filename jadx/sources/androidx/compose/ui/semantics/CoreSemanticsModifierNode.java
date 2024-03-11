package androidx.compose.ui.semantics;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.SemanticsModifierNode;
import o.dpR;
import o.drM;

/* loaded from: classes.dex */
public final class CoreSemanticsModifierNode extends Modifier.Node implements SemanticsModifierNode {
    private boolean isClearingSemantics;
    private boolean mergeDescendants;
    private drM<? super SemanticsPropertyReceiver, dpR> properties;

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public boolean getShouldClearDescendantSemantics() {
        return this.isClearingSemantics;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public boolean getShouldMergeDescendantSemantics() {
        return this.mergeDescendants;
    }

    public final void setMergeDescendants(boolean z) {
        this.mergeDescendants = z;
    }

    public final void setProperties(drM<? super SemanticsPropertyReceiver, dpR> drm) {
        this.properties = drm;
    }

    public CoreSemanticsModifierNode(boolean z, boolean z2, drM<? super SemanticsPropertyReceiver, dpR> drm) {
        this.mergeDescendants = z;
        this.isClearingSemantics = z2;
        this.properties = drm;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public void applySemantics(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        this.properties.invoke(semanticsPropertyReceiver);
    }
}
