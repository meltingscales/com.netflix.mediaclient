package androidx.compose.ui.node;

/* loaded from: classes.dex */
public final class DrawModifierNodeKt {
    public static final void invalidateDraw(DrawModifierNode drawModifierNode) {
        if (drawModifierNode.getNode().isAttached()) {
            DelegatableNodeKt.m1853requireCoordinator64DMado(drawModifierNode, NodeKind.m1935constructorimpl(1)).invalidateLayer();
        }
    }
}
