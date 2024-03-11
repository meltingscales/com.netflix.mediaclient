package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.GlobalPositionAwareModifierNode;
import o.dpR;
import o.drM;

/* loaded from: classes.dex */
final class OnGloballyPositionedNode extends Modifier.Node implements GlobalPositionAwareModifierNode {
    private drM<? super LayoutCoordinates, dpR> callback;

    public final void setCallback(drM<? super LayoutCoordinates, dpR> drm) {
        this.callback = drm;
    }

    public OnGloballyPositionedNode(drM<? super LayoutCoordinates, dpR> drm) {
        this.callback = drm;
    }

    @Override // androidx.compose.ui.node.GlobalPositionAwareModifierNode
    public void onGloballyPositioned(LayoutCoordinates layoutCoordinates) {
        this.callback.invoke(layoutCoordinates);
    }
}
