package androidx.compose.ui.node;

/* loaded from: classes.dex */
public final class LayoutNodeLayoutDelegateKt {
    public static final boolean isOutMostLookaheadRoot(LayoutNode layoutNode) {
        if (layoutNode.getLookaheadRoot$ui_release() != null) {
            LayoutNode parent$ui_release = layoutNode.getParent$ui_release();
            if ((parent$ui_release != null ? parent$ui_release.getLookaheadRoot$ui_release() : null) == null || layoutNode.getLayoutDelegate$ui_release().getDetachedFromParentLookaheadPass$ui_release()) {
                return true;
            }
        }
        return false;
    }
}
