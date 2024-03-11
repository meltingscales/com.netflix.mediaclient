package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifier;
import androidx.compose.ui.focus.FocusEventModifier;
import androidx.compose.ui.focus.FocusEventModifierNode;
import androidx.compose.ui.focus.FocusEventModifierNodeKt;
import androidx.compose.ui.focus.FocusOrderModifier;
import androidx.compose.ui.focus.FocusPropertiesModifierNode;
import androidx.compose.ui.focus.FocusPropertiesModifierNodeKt;
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.focus.FocusTargetNodeKt;
import androidx.compose.ui.input.key.KeyInputModifierNode;
import androidx.compose.ui.input.key.SoftKeyboardInterceptionModifierNode;
import androidx.compose.ui.input.pointer.PointerInputModifier;
import androidx.compose.ui.input.rotary.RotaryInputModifierNode;
import androidx.compose.ui.layout.IntermediateLayoutModifierNode;
import androidx.compose.ui.layout.LayoutModifier;
import androidx.compose.ui.layout.OnGloballyPositionedModifier;
import androidx.compose.ui.layout.OnPlacedModifier;
import androidx.compose.ui.layout.OnRemeasuredModifier;
import androidx.compose.ui.layout.ParentDataModifier;
import androidx.compose.ui.modifier.ModifierLocalConsumer;
import androidx.compose.ui.modifier.ModifierLocalModifierNode;
import androidx.compose.ui.modifier.ModifierLocalProvider;
import androidx.compose.ui.semantics.SemanticsModifier;
import com.netflix.android.org.json.zip.JSONzip;
import org.linphone.core.Privacy;

/* loaded from: classes.dex */
public final class NodeKindKt {
    public static final int calculateNodeKindSetFrom(Modifier.Node node) {
        if (node.getKindSet$ui_release() != 0) {
            return node.getKindSet$ui_release();
        }
        int m1935constructorimpl = NodeKind.m1935constructorimpl(1);
        if (node instanceof LayoutModifierNode) {
            m1935constructorimpl |= NodeKind.m1935constructorimpl(2);
        }
        if (node instanceof DrawModifierNode) {
            m1935constructorimpl |= NodeKind.m1935constructorimpl(4);
        }
        if (node instanceof SemanticsModifierNode) {
            m1935constructorimpl |= NodeKind.m1935constructorimpl(8);
        }
        if (node instanceof PointerInputModifierNode) {
            m1935constructorimpl |= NodeKind.m1935constructorimpl(16);
        }
        if (node instanceof ModifierLocalModifierNode) {
            m1935constructorimpl |= NodeKind.m1935constructorimpl(32);
        }
        if (node instanceof ParentDataModifierNode) {
            m1935constructorimpl |= NodeKind.m1935constructorimpl(64);
        }
        if (node instanceof LayoutAwareModifierNode) {
            m1935constructorimpl |= NodeKind.m1935constructorimpl(128);
        }
        if (node instanceof GlobalPositionAwareModifierNode) {
            m1935constructorimpl |= NodeKind.m1935constructorimpl(JSONzip.end);
        }
        if (node instanceof IntermediateLayoutModifierNode) {
            m1935constructorimpl |= NodeKind.m1935constructorimpl(512);
        }
        if (node instanceof FocusTargetNode) {
            m1935constructorimpl |= NodeKind.m1935constructorimpl(1024);
        }
        if (node instanceof FocusPropertiesModifierNode) {
            m1935constructorimpl |= NodeKind.m1935constructorimpl(2048);
        }
        if (node instanceof FocusEventModifierNode) {
            m1935constructorimpl |= NodeKind.m1935constructorimpl(4096);
        }
        if (node instanceof KeyInputModifierNode) {
            m1935constructorimpl |= NodeKind.m1935constructorimpl(8192);
        }
        if (node instanceof RotaryInputModifierNode) {
            m1935constructorimpl |= NodeKind.m1935constructorimpl(16384);
        }
        if (node instanceof CompositionLocalConsumerModifierNode) {
            m1935constructorimpl |= NodeKind.m1935constructorimpl(Privacy.DEFAULT);
        }
        if (node instanceof SoftKeyboardInterceptionModifierNode) {
            m1935constructorimpl |= NodeKind.m1935constructorimpl(131072);
        }
        return node instanceof TraversableNode ? m1935constructorimpl | NodeKind.m1935constructorimpl(262144) : m1935constructorimpl;
    }

    public static final void autoInvalidateRemovedNode(Modifier.Node node) {
        if (!node.isAttached()) {
            throw new IllegalStateException("autoInvalidateRemovedNode called on unattached node".toString());
        }
        autoInvalidateNodeIncludingDelegates(node, -1, 2);
    }

    public static final void autoInvalidateInsertedNode(Modifier.Node node) {
        if (!node.isAttached()) {
            throw new IllegalStateException("autoInvalidateInsertedNode called on unattached node".toString());
        }
        autoInvalidateNodeIncludingDelegates(node, -1, 1);
    }

    public static final void autoInvalidateUpdatedNode(Modifier.Node node) {
        if (!node.isAttached()) {
            throw new IllegalStateException("autoInvalidateUpdatedNode called on unattached node".toString());
        }
        autoInvalidateNodeIncludingDelegates(node, -1, 0);
    }

    public static final void autoInvalidateNodeIncludingDelegates(Modifier.Node node, int i, int i2) {
        if (node instanceof DelegatingNode) {
            DelegatingNode delegatingNode = (DelegatingNode) node;
            autoInvalidateNodeSelf(node, delegatingNode.getSelfKindSet$ui_release() & i, i2);
            int selfKindSet$ui_release = delegatingNode.getSelfKindSet$ui_release();
            for (Modifier.Node delegate$ui_release = delegatingNode.getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
                autoInvalidateNodeIncludingDelegates(delegate$ui_release, (~selfKindSet$ui_release) & i, i2);
            }
            return;
        }
        autoInvalidateNodeSelf(node, i & node.getKindSet$ui_release(), i2);
    }

    private static final void autoInvalidateNodeSelf(Modifier.Node node, int i, int i2) {
        if (i2 != 0 || node.getShouldAutoInvalidate()) {
            if ((NodeKind.m1935constructorimpl(2) & i) != 0 && (node instanceof LayoutModifierNode)) {
                LayoutModifierNodeKt.invalidateMeasurement((LayoutModifierNode) node);
                if (i2 == 2) {
                    DelegatableNodeKt.m1853requireCoordinator64DMado(node, NodeKind.m1935constructorimpl(2)).onRelease();
                }
            }
            if ((NodeKind.m1935constructorimpl(JSONzip.end) & i) != 0 && (node instanceof GlobalPositionAwareModifierNode)) {
                DelegatableNodeKt.requireLayoutNode(node).invalidateMeasurements$ui_release();
            }
            if ((NodeKind.m1935constructorimpl(4) & i) != 0 && (node instanceof DrawModifierNode)) {
                DrawModifierNodeKt.invalidateDraw((DrawModifierNode) node);
            }
            if ((NodeKind.m1935constructorimpl(8) & i) != 0 && (node instanceof SemanticsModifierNode)) {
                SemanticsModifierNodeKt.invalidateSemantics((SemanticsModifierNode) node);
            }
            if ((NodeKind.m1935constructorimpl(64) & i) != 0 && (node instanceof ParentDataModifierNode)) {
                ParentDataModifierNodeKt.invalidateParentData((ParentDataModifierNode) node);
            }
            if ((NodeKind.m1935constructorimpl(1024) & i) != 0 && (node instanceof FocusTargetNode)) {
                if (i2 == 2) {
                    node.onReset();
                } else {
                    DelegatableNodeKt.requireOwner(node).getFocusOwner().scheduleInvalidation((FocusTargetNode) node);
                }
            }
            if ((NodeKind.m1935constructorimpl(2048) & i) != 0 && (node instanceof FocusPropertiesModifierNode)) {
                FocusPropertiesModifierNode focusPropertiesModifierNode = (FocusPropertiesModifierNode) node;
                if (specifiesCanFocusProperty(focusPropertiesModifierNode)) {
                    if (i2 == 2) {
                        scheduleInvalidationOfAssociatedFocusTargets(focusPropertiesModifierNode);
                    } else {
                        FocusPropertiesModifierNodeKt.invalidateFocusProperties(focusPropertiesModifierNode);
                    }
                }
            }
            if ((i & NodeKind.m1935constructorimpl(4096)) == 0 || !(node instanceof FocusEventModifierNode)) {
                return;
            }
            FocusEventModifierNodeKt.invalidateFocusEvent((FocusEventModifierNode) node);
        }
    }

    private static final boolean specifiesCanFocusProperty(FocusPropertiesModifierNode focusPropertiesModifierNode) {
        CanFocusChecker canFocusChecker = CanFocusChecker.INSTANCE;
        canFocusChecker.reset();
        focusPropertiesModifierNode.applyFocusProperties(canFocusChecker);
        return canFocusChecker.isCanFocusSet();
    }

    public static final int calculateNodeKindSetFromIncludingDelegates(Modifier.Node node) {
        if (node instanceof DelegatingNode) {
            DelegatingNode delegatingNode = (DelegatingNode) node;
            int selfKindSet$ui_release = delegatingNode.getSelfKindSet$ui_release();
            for (Modifier.Node delegate$ui_release = delegatingNode.getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
                selfKindSet$ui_release |= calculateNodeKindSetFromIncludingDelegates(delegate$ui_release);
            }
            return selfKindSet$ui_release;
        }
        return calculateNodeKindSetFrom(node);
    }

    /* renamed from: getIncludeSelfInTraversal-H91voCI  reason: not valid java name */
    public static final boolean m1940getIncludeSelfInTraversalH91voCI(int i) {
        return (i & NodeKind.m1935constructorimpl(128)) != 0;
    }

    public static final int calculateNodeKindSetFrom(Modifier.Element element) {
        int m1935constructorimpl = NodeKind.m1935constructorimpl(1);
        if (element instanceof LayoutModifier) {
            m1935constructorimpl |= NodeKind.m1935constructorimpl(2);
        }
        if (element instanceof DrawModifier) {
            m1935constructorimpl |= NodeKind.m1935constructorimpl(4);
        }
        if (element instanceof SemanticsModifier) {
            m1935constructorimpl |= NodeKind.m1935constructorimpl(8);
        }
        if (element instanceof PointerInputModifier) {
            m1935constructorimpl |= NodeKind.m1935constructorimpl(16);
        }
        if ((element instanceof ModifierLocalConsumer) || (element instanceof ModifierLocalProvider)) {
            m1935constructorimpl |= NodeKind.m1935constructorimpl(32);
        }
        if (element instanceof FocusEventModifier) {
            m1935constructorimpl |= NodeKind.m1935constructorimpl(4096);
        }
        if (element instanceof FocusOrderModifier) {
            m1935constructorimpl |= NodeKind.m1935constructorimpl(2048);
        }
        if (element instanceof OnGloballyPositionedModifier) {
            m1935constructorimpl |= NodeKind.m1935constructorimpl(JSONzip.end);
        }
        if (element instanceof ParentDataModifier) {
            m1935constructorimpl |= NodeKind.m1935constructorimpl(64);
        }
        return ((element instanceof OnPlacedModifier) || (element instanceof OnRemeasuredModifier)) ? m1935constructorimpl | NodeKind.m1935constructorimpl(128) : m1935constructorimpl;
    }

    private static final void scheduleInvalidationOfAssociatedFocusTargets(FocusPropertiesModifierNode focusPropertiesModifierNode) {
        int m1935constructorimpl = NodeKind.m1935constructorimpl(1024);
        if (!focusPropertiesModifierNode.getNode().isAttached()) {
            throw new IllegalStateException("visitChildren called on an unattached node".toString());
        }
        MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child$ui_release = focusPropertiesModifierNode.getNode().getChild$ui_release();
        if (child$ui_release == null) {
            DelegatableNodeKt.addLayoutNodeChildren(mutableVector, focusPropertiesModifierNode.getNode());
        } else {
            mutableVector.add(child$ui_release);
        }
        while (mutableVector.isNotEmpty()) {
            Modifier.Node node = (Modifier.Node) mutableVector.removeAt(mutableVector.getSize() - 1);
            if ((node.getAggregateChildKindSet$ui_release() & m1935constructorimpl) == 0) {
                DelegatableNodeKt.addLayoutNodeChildren(mutableVector, node);
            } else {
                while (true) {
                    if (node == null) {
                        break;
                    } else if ((node.getKindSet$ui_release() & m1935constructorimpl) != 0) {
                        MutableVector mutableVector2 = null;
                        while (node != null) {
                            if (node instanceof FocusTargetNode) {
                                FocusTargetNodeKt.invalidateFocusTarget((FocusTargetNode) node);
                            } else if ((node.getKindSet$ui_release() & m1935constructorimpl) != 0 && (node instanceof DelegatingNode)) {
                                int i = 0;
                                for (Modifier.Node delegate$ui_release = ((DelegatingNode) node).getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
                                    if ((delegate$ui_release.getKindSet$ui_release() & m1935constructorimpl) != 0) {
                                        i++;
                                        if (i == 1) {
                                            node = delegate$ui_release;
                                        } else {
                                            if (mutableVector2 == null) {
                                                mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (node != null) {
                                                mutableVector2.add(node);
                                                node = null;
                                            }
                                            mutableVector2.add(delegate$ui_release);
                                        }
                                    }
                                }
                                if (i == 1) {
                                }
                            }
                            node = DelegatableNodeKt.pop(mutableVector2);
                        }
                    } else {
                        node = node.getChild$ui_release();
                    }
                }
            }
        }
    }
}
