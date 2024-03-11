package androidx.compose.ui.node;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;

/* loaded from: classes.dex */
public final class SemanticsModifierNodeKt {
    public static final void invalidateSemantics(SemanticsModifierNode semanticsModifierNode) {
        DelegatableNodeKt.requireLayoutNode(semanticsModifierNode).invalidateSemantics$ui_release();
    }

    public static final boolean getUseMinimumTouchTarget(SemanticsConfiguration semanticsConfiguration) {
        return SemanticsConfigurationKt.getOrNull(semanticsConfiguration, SemanticsActions.INSTANCE.getOnClick()) != null;
    }

    public static final Rect touchBoundsInRoot(Modifier.Node node, boolean z) {
        if (node.getNode().isAttached()) {
            if (!z) {
                return LayoutCoordinatesKt.boundsInRoot(DelegatableNodeKt.m1853requireCoordinator64DMado(node, NodeKind.m1935constructorimpl(8)));
            }
            return DelegatableNodeKt.m1853requireCoordinator64DMado(node, NodeKind.m1935constructorimpl(8)).touchBoundsInRoot();
        }
        return Rect.Companion.getZero();
    }
}
