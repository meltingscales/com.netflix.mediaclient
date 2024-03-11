package androidx.compose.ui.node;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.MeasureAndLayoutDelegate;
import java.util.List;
import o.C8632dsu;

/* loaded from: classes.dex */
public final class LayoutTreeConsistencyChecker {
    private final List<MeasureAndLayoutDelegate.PostponedRequest> postponedMeasureRequests;
    private final DepthSortedSetsForDifferentPasses relayoutNodes;
    private final LayoutNode root;

    public LayoutTreeConsistencyChecker(LayoutNode layoutNode, DepthSortedSetsForDifferentPasses depthSortedSetsForDifferentPasses, List<MeasureAndLayoutDelegate.PostponedRequest> list) {
        this.root = layoutNode;
        this.relayoutNodes = depthSortedSetsForDifferentPasses;
        this.postponedMeasureRequests = list;
    }

    public final void assertConsistent() {
        if (!isTreeConsistent(this.root)) {
            System.out.println((Object) logTree());
            throw new IllegalStateException("Inconsistency found!");
        }
    }

    private final boolean isTreeConsistent(LayoutNode layoutNode) {
        if (consistentLayoutState(layoutNode)) {
            List<LayoutNode> children$ui_release = layoutNode.getChildren$ui_release();
            int size = children$ui_release.size();
            for (int i = 0; i < size; i++) {
                if (!isTreeConsistent(children$ui_release.get(i))) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    private final boolean consistentLayoutState(LayoutNode layoutNode) {
        MeasureAndLayoutDelegate.PostponedRequest postponedRequest;
        LayoutNode parent$ui_release = layoutNode.getParent$ui_release();
        MeasureAndLayoutDelegate.PostponedRequest postponedRequest2 = null;
        LayoutNode.LayoutState layoutState$ui_release = parent$ui_release != null ? parent$ui_release.getLayoutState$ui_release() : null;
        if (layoutNode.isPlaced() || (layoutNode.getPlaceOrder$ui_release() != Integer.MAX_VALUE && parent$ui_release != null && parent$ui_release.isPlaced())) {
            if (layoutNode.getMeasurePending$ui_release()) {
                List<MeasureAndLayoutDelegate.PostponedRequest> list = this.postponedMeasureRequests;
                int size = list.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        postponedRequest = null;
                        break;
                    }
                    postponedRequest = list.get(i);
                    MeasureAndLayoutDelegate.PostponedRequest postponedRequest3 = postponedRequest;
                    if (C8632dsu.c(postponedRequest3.getNode(), layoutNode) && !postponedRequest3.isLookahead()) {
                        break;
                    }
                    i++;
                }
                if (postponedRequest != null) {
                    return true;
                }
            }
            if (layoutNode.getMeasurePending$ui_release()) {
                return this.relayoutNodes.contains(layoutNode) || layoutNode.getLayoutState$ui_release() == LayoutNode.LayoutState.LookaheadMeasuring || (parent$ui_release != null && parent$ui_release.getMeasurePending$ui_release()) || ((parent$ui_release != null && parent$ui_release.getLookaheadMeasurePending$ui_release()) || layoutState$ui_release == LayoutNode.LayoutState.Measuring);
            } else if (layoutNode.getLayoutPending$ui_release()) {
                return this.relayoutNodes.contains(layoutNode) || parent$ui_release == null || parent$ui_release.getMeasurePending$ui_release() || parent$ui_release.getLayoutPending$ui_release() || layoutState$ui_release == LayoutNode.LayoutState.Measuring || layoutState$ui_release == LayoutNode.LayoutState.LayingOut;
            }
        }
        if (C8632dsu.c(layoutNode.isPlacedInLookahead(), Boolean.TRUE)) {
            if (layoutNode.getLookaheadMeasurePending$ui_release()) {
                List<MeasureAndLayoutDelegate.PostponedRequest> list2 = this.postponedMeasureRequests;
                int size2 = list2.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size2) {
                        break;
                    }
                    MeasureAndLayoutDelegate.PostponedRequest postponedRequest4 = list2.get(i2);
                    MeasureAndLayoutDelegate.PostponedRequest postponedRequest5 = postponedRequest4;
                    if (C8632dsu.c(postponedRequest5.getNode(), layoutNode) && postponedRequest5.isLookahead()) {
                        postponedRequest2 = postponedRequest4;
                        break;
                    }
                    i2++;
                }
                if (postponedRequest2 != null) {
                    return true;
                }
            }
            if (layoutNode.getLookaheadMeasurePending$ui_release()) {
                return this.relayoutNodes.contains(layoutNode, true) || (parent$ui_release != null && parent$ui_release.getLookaheadMeasurePending$ui_release()) || layoutState$ui_release == LayoutNode.LayoutState.LookaheadMeasuring || (parent$ui_release != null && parent$ui_release.getMeasurePending$ui_release() && C8632dsu.c(layoutNode.getLookaheadRoot$ui_release(), layoutNode));
            } else if (layoutNode.getLookaheadLayoutPending$ui_release()) {
                return this.relayoutNodes.contains(layoutNode, true) || parent$ui_release == null || parent$ui_release.getLookaheadMeasurePending$ui_release() || parent$ui_release.getLookaheadLayoutPending$ui_release() || layoutState$ui_release == LayoutNode.LayoutState.LookaheadMeasuring || layoutState$ui_release == LayoutNode.LayoutState.LookaheadLayingOut || (parent$ui_release.getLayoutPending$ui_release() && C8632dsu.c(layoutNode.getLookaheadRoot$ui_release(), layoutNode));
            }
        }
        return true;
    }

    private final String nodeToString(LayoutNode layoutNode) {
        StringBuilder sb = new StringBuilder();
        sb.append(layoutNode);
        StringBuilder sb2 = new StringBuilder();
        sb2.append('[');
        sb2.append(layoutNode.getLayoutState$ui_release());
        sb2.append(']');
        sb.append(sb2.toString());
        if (!layoutNode.isPlaced()) {
            sb.append("[!isPlaced]");
        }
        sb.append("[measuredByParent=" + layoutNode.getMeasuredByParent$ui_release() + ']');
        if (!consistentLayoutState(layoutNode)) {
            sb.append("[INCONSISTENT]");
        }
        return sb.toString();
    }

    private final String logTree() {
        StringBuilder sb = new StringBuilder();
        sb.append("Tree state:");
        C8632dsu.a(sb, "");
        sb.append('\n');
        C8632dsu.a(sb, "");
        logTree$printSubTree(this, sb, this.root, 0);
        return sb.toString();
    }

    private static final void logTree$printSubTree(LayoutTreeConsistencyChecker layoutTreeConsistencyChecker, StringBuilder sb, LayoutNode layoutNode, int i) {
        String nodeToString = layoutTreeConsistencyChecker.nodeToString(layoutNode);
        if (nodeToString.length() > 0) {
            for (int i2 = 0; i2 < i; i2++) {
                sb.append("..");
            }
            sb.append(nodeToString);
            C8632dsu.a(sb, "");
            sb.append('\n');
            C8632dsu.a(sb, "");
            i++;
        }
        List<LayoutNode> children$ui_release = layoutNode.getChildren$ui_release();
        int size = children$ui_release.size();
        for (int i3 = 0; i3 < size; i3++) {
            logTree$printSubTree(layoutTreeConsistencyChecker, sb, children$ui_release.get(i3), i);
        }
    }
}
