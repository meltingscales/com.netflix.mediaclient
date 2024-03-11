package androidx.compose.ui.node;

/* loaded from: classes.dex */
public final class LayoutModifierNodeKt {
    public static final void invalidateMeasurement(LayoutModifierNode layoutModifierNode) {
        DelegatableNodeKt.requireLayoutNode(layoutModifierNode).invalidateMeasurements$ui_release();
    }

    public static final void invalidateLayer(LayoutModifierNode layoutModifierNode) {
        DelegatableNodeKt.m1853requireCoordinator64DMado(layoutModifierNode, NodeKind.m1935constructorimpl(2)).invalidateLayer();
    }
}
