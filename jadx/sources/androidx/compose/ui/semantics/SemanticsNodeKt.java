package androidx.compose.ui.semantics;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.node.SemanticsModifierNode;
import com.netflix.model.leafs.originals.interactive.Prefetch;
import o.C8632dsu;
import o.drM;

/* loaded from: classes.dex */
public final class SemanticsNodeKt {
    public static final SemanticsNode SemanticsNode(LayoutNode layoutNode, boolean z) {
        int aggregateChildKindSet;
        NodeChain nodes$ui_release = layoutNode.getNodes$ui_release();
        int m1935constructorimpl = NodeKind.m1935constructorimpl(8);
        aggregateChildKindSet = nodes$ui_release.getAggregateChildKindSet();
        SemanticsModifierNode semanticsModifierNode = null;
        if ((aggregateChildKindSet & m1935constructorimpl) != 0) {
            Modifier.Node head$ui_release = nodes$ui_release.getHead$ui_release();
            loop0: while (true) {
                if (head$ui_release == null) {
                    break;
                }
                if ((head$ui_release.getKindSet$ui_release() & m1935constructorimpl) != 0) {
                    Modifier.Node node = head$ui_release;
                    MutableVector mutableVector = null;
                    while (node != null) {
                        if (node instanceof SemanticsModifierNode) {
                            semanticsModifierNode = node;
                            break loop0;
                        }
                        if ((node.getKindSet$ui_release() & m1935constructorimpl) != 0 && (node instanceof DelegatingNode)) {
                            int i = 0;
                            for (Modifier.Node delegate$ui_release = ((DelegatingNode) node).getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
                                if ((delegate$ui_release.getKindSet$ui_release() & m1935constructorimpl) != 0) {
                                    i++;
                                    if (i == 1) {
                                        node = delegate$ui_release;
                                    } else {
                                        if (mutableVector == null) {
                                            mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                        }
                                        if (node != null) {
                                            mutableVector.add(node);
                                            node = null;
                                        }
                                        mutableVector.add(delegate$ui_release);
                                    }
                                }
                            }
                            if (i == 1) {
                            }
                        }
                        node = DelegatableNodeKt.pop(mutableVector);
                    }
                }
                if ((head$ui_release.getAggregateChildKindSet$ui_release() & m1935constructorimpl) == 0) {
                    break;
                }
                head$ui_release = head$ui_release.getChild$ui_release();
            }
        }
        C8632dsu.d(semanticsModifierNode);
        Modifier.Node node2 = semanticsModifierNode.getNode();
        SemanticsConfiguration collapsedSemantics$ui_release = layoutNode.getCollapsedSemantics$ui_release();
        C8632dsu.d(collapsedSemantics$ui_release);
        return new SemanticsNode(node2, z, layoutNode, collapsedSemantics$ui_release);
    }

    public static final SemanticsModifierNode getOuterMergingSemantics(LayoutNode layoutNode) {
        int aggregateChildKindSet;
        NodeChain nodes$ui_release = layoutNode.getNodes$ui_release();
        int m1935constructorimpl = NodeKind.m1935constructorimpl(8);
        aggregateChildKindSet = nodes$ui_release.getAggregateChildKindSet();
        SemanticsModifierNode semanticsModifierNode = null;
        if ((aggregateChildKindSet & m1935constructorimpl) != 0) {
            Modifier.Node head$ui_release = nodes$ui_release.getHead$ui_release();
            loop0: while (true) {
                if (head$ui_release == null) {
                    break;
                }
                if ((head$ui_release.getKindSet$ui_release() & m1935constructorimpl) != 0) {
                    Modifier.Node node = head$ui_release;
                    MutableVector mutableVector = null;
                    while (node != null) {
                        if (node instanceof SemanticsModifierNode) {
                            if (((SemanticsModifierNode) node).getShouldMergeDescendantSemantics()) {
                                semanticsModifierNode = node;
                                break loop0;
                            }
                        } else if ((node.getKindSet$ui_release() & m1935constructorimpl) != 0 && (node instanceof DelegatingNode)) {
                            int i = 0;
                            for (Modifier.Node delegate$ui_release = ((DelegatingNode) node).getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
                                if ((delegate$ui_release.getKindSet$ui_release() & m1935constructorimpl) != 0) {
                                    i++;
                                    if (i == 1) {
                                        node = delegate$ui_release;
                                    } else {
                                        if (mutableVector == null) {
                                            mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                        }
                                        if (node != null) {
                                            mutableVector.add(node);
                                            node = null;
                                        }
                                        mutableVector.add(delegate$ui_release);
                                    }
                                }
                            }
                            if (i == 1) {
                            }
                        }
                        node = DelegatableNodeKt.pop(mutableVector);
                    }
                }
                if ((head$ui_release.getAggregateChildKindSet$ui_release() & m1935constructorimpl) == 0) {
                    break;
                }
                head$ui_release = head$ui_release.getChild$ui_release();
            }
        }
        return semanticsModifierNode;
    }

    public static final LayoutNode findClosestParentNode(LayoutNode layoutNode, drM<? super LayoutNode, Boolean> drm) {
        for (LayoutNode parent$ui_release = layoutNode.getParent$ui_release(); parent$ui_release != null; parent$ui_release = parent$ui_release.getParent$ui_release()) {
            if (drm.invoke(parent$ui_release).booleanValue()) {
                return parent$ui_release;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Role getRole(SemanticsNode semanticsNode) {
        return (Role) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getRole());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int contentDescriptionFakeNodeId(SemanticsNode semanticsNode) {
        return semanticsNode.getId() + 2000000000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int roleFakeNodeId(SemanticsNode semanticsNode) {
        return semanticsNode.getId() + Prefetch.NANOSECONDS_PER_SECOND;
    }
}
