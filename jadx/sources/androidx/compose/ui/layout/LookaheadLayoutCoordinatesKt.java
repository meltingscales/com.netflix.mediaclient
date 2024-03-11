package androidx.compose.ui.layout;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LookaheadDelegate;
import o.C8632dsu;

/* loaded from: classes.dex */
public final class LookaheadLayoutCoordinatesKt {
    public static final LookaheadDelegate getRootLookaheadDelegate(LookaheadDelegate lookaheadDelegate) {
        LayoutNode layoutNode = lookaheadDelegate.getLayoutNode();
        while (true) {
            LayoutNode parent$ui_release = layoutNode.getParent$ui_release();
            if ((parent$ui_release != null ? parent$ui_release.getLookaheadRoot$ui_release() : null) != null) {
                LayoutNode parent$ui_release2 = layoutNode.getParent$ui_release();
                LayoutNode lookaheadRoot$ui_release = parent$ui_release2 != null ? parent$ui_release2.getLookaheadRoot$ui_release() : null;
                C8632dsu.d(lookaheadRoot$ui_release);
                if (lookaheadRoot$ui_release.isVirtualLookaheadRoot$ui_release()) {
                    layoutNode = layoutNode.getParent$ui_release();
                    C8632dsu.d(layoutNode);
                } else {
                    LayoutNode parent$ui_release3 = layoutNode.getParent$ui_release();
                    C8632dsu.d(parent$ui_release3);
                    layoutNode = parent$ui_release3.getLookaheadRoot$ui_release();
                    C8632dsu.d(layoutNode);
                }
            } else {
                LookaheadDelegate lookaheadDelegate2 = layoutNode.getOuterCoordinator$ui_release().getLookaheadDelegate();
                C8632dsu.d(lookaheadDelegate2);
                return lookaheadDelegate2;
            }
        }
    }
}
