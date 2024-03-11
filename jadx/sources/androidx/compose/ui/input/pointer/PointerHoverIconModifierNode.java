package androidx.compose.ui.input.pointer;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.PointerEventType;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.node.PointerInputModifierNode;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.node.TraversableNodeKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import kotlin.jvm.internal.Ref;
import o.C8632dsu;
import o.dpR;
import o.drM;

/* loaded from: classes.dex */
public final class PointerHoverIconModifierNode extends Modifier.Node implements TraversableNode, PointerInputModifierNode, CompositionLocalConsumerModifierNode {
    private boolean cursorInBoundsOfNode;
    private PointerIcon icon;
    private boolean overrideDescendants;
    private final String traverseKey = "androidx.compose.ui.input.pointer.PointerHoverIcon";

    public final boolean getOverrideDescendants() {
        return this.overrideDescendants;
    }

    @Override // androidx.compose.ui.node.TraversableNode
    public String getTraverseKey() {
        return this.traverseKey;
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public void onCancelPointerInput() {
    }

    public PointerHoverIconModifierNode(PointerIcon pointerIcon, boolean z) {
        this.icon = pointerIcon;
        this.overrideDescendants = z;
    }

    public final void setIcon(PointerIcon pointerIcon) {
        if (C8632dsu.c(this.icon, pointerIcon)) {
            return;
        }
        this.icon = pointerIcon;
        if (this.cursorInBoundsOfNode) {
            displayIconIfDescendantsDoNotHavePriority();
        }
    }

    public final void setOverrideDescendants(boolean z) {
        if (this.overrideDescendants != z) {
            this.overrideDescendants = z;
            if (z) {
                if (this.cursorInBoundsOfNode) {
                    displayIcon();
                }
            } else if (this.cursorInBoundsOfNode) {
                displayIconFromCurrentNodeOrDescendantsWithCursorInBounds();
            }
        }
    }

    private final PointerIconService getPointerIconService() {
        return (PointerIconService) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, CompositionLocalsKt.getLocalPointerIconService());
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    /* renamed from: onPointerEvent-H0pRuoY */
    public void mo93onPointerEventH0pRuoY(PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j) {
        if (pointerEventPass == PointerEventPass.Main) {
            int m1698getType7fucELk = pointerEvent.m1698getType7fucELk();
            PointerEventType.Companion companion = PointerEventType.Companion;
            if (PointerEventType.m1704equalsimpl0(m1698getType7fucELk, companion.m1708getEnter7fucELk())) {
                this.cursorInBoundsOfNode = true;
                displayIconIfDescendantsDoNotHavePriority();
            } else if (PointerEventType.m1704equalsimpl0(pointerEvent.m1698getType7fucELk(), companion.m1709getExit7fucELk())) {
                this.cursorInBoundsOfNode = false;
                displayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon();
            }
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        this.cursorInBoundsOfNode = false;
        displayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon();
        super.onDetach();
    }

    private final void displayIcon() {
        PointerIcon pointerIcon;
        PointerHoverIconModifierNode findOverridingAncestorNode = findOverridingAncestorNode();
        if (findOverridingAncestorNode == null || (pointerIcon = findOverridingAncestorNode.icon) == null) {
            pointerIcon = this.icon;
        }
        PointerIconService pointerIconService = getPointerIconService();
        if (pointerIconService != null) {
            pointerIconService.setIcon(pointerIcon);
        }
    }

    private final void displayDefaultIcon() {
        PointerIconService pointerIconService = getPointerIconService();
        if (pointerIconService != null) {
            pointerIconService.setIcon(null);
        }
    }

    private final void displayIconIfDescendantsDoNotHavePriority() {
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        booleanRef.a = true;
        if (!this.overrideDescendants) {
            TraversableNodeKt.traverseDescendants(this, new drM<PointerHoverIconModifierNode, TraversableNode.Companion.TraverseDescendantsAction>() { // from class: androidx.compose.ui.input.pointer.PointerHoverIconModifierNode$displayIconIfDescendantsDoNotHavePriority$1
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(1);
                }

                @Override // o.drM
                public final TraversableNode.Companion.TraverseDescendantsAction invoke(PointerHoverIconModifierNode pointerHoverIconModifierNode) {
                    boolean z;
                    z = pointerHoverIconModifierNode.cursorInBoundsOfNode;
                    if (z) {
                        Ref.BooleanRef.this.a = false;
                        return TraversableNode.Companion.TraverseDescendantsAction.CancelTraversal;
                    }
                    return TraversableNode.Companion.TraverseDescendantsAction.ContinueTraversal;
                }
            });
        }
        if (booleanRef.a) {
            displayIcon();
        }
    }

    private final PointerHoverIconModifierNode findDescendantNodeWithCursorInBounds() {
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        TraversableNodeKt.traverseDescendants(this, new drM<PointerHoverIconModifierNode, TraversableNode.Companion.TraverseDescendantsAction>() { // from class: androidx.compose.ui.input.pointer.PointerHoverIconModifierNode$findDescendantNodeWithCursorInBounds$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // o.drM
            public final TraversableNode.Companion.TraverseDescendantsAction invoke(PointerHoverIconModifierNode pointerHoverIconModifierNode) {
                boolean z;
                TraversableNode.Companion.TraverseDescendantsAction traverseDescendantsAction = TraversableNode.Companion.TraverseDescendantsAction.ContinueTraversal;
                z = pointerHoverIconModifierNode.cursorInBoundsOfNode;
                if (z) {
                    objectRef.d = pointerHoverIconModifierNode;
                    return pointerHoverIconModifierNode.getOverrideDescendants() ? TraversableNode.Companion.TraverseDescendantsAction.SkipSubtreeAndContinueTraversal : traverseDescendantsAction;
                }
                return traverseDescendantsAction;
            }
        });
        return (PointerHoverIconModifierNode) objectRef.d;
    }

    private final void displayIconFromCurrentNodeOrDescendantsWithCursorInBounds() {
        PointerHoverIconModifierNode pointerHoverIconModifierNode;
        if (this.cursorInBoundsOfNode) {
            if (this.overrideDescendants || (pointerHoverIconModifierNode = findDescendantNodeWithCursorInBounds()) == null) {
                pointerHoverIconModifierNode = this;
            }
            pointerHoverIconModifierNode.displayIcon();
        }
    }

    private final PointerHoverIconModifierNode findOverridingAncestorNode() {
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        TraversableNodeKt.traverseAncestors(this, new drM<PointerHoverIconModifierNode, Boolean>() { // from class: androidx.compose.ui.input.pointer.PointerHoverIconModifierNode$findOverridingAncestorNode$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // o.drM
            public final Boolean invoke(PointerHoverIconModifierNode pointerHoverIconModifierNode) {
                boolean z;
                if (pointerHoverIconModifierNode.getOverrideDescendants()) {
                    z = pointerHoverIconModifierNode.cursorInBoundsOfNode;
                    if (z) {
                        objectRef.d = pointerHoverIconModifierNode;
                    }
                }
                return Boolean.TRUE;
            }
        });
        return (PointerHoverIconModifierNode) objectRef.d;
    }

    private final void displayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon() {
        dpR dpr;
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        TraversableNodeKt.traverseAncestors(this, new drM<PointerHoverIconModifierNode, Boolean>() { // from class: androidx.compose.ui.input.pointer.PointerHoverIconModifierNode$displayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // o.drM
            public final Boolean invoke(PointerHoverIconModifierNode pointerHoverIconModifierNode) {
                boolean z;
                boolean z2;
                if (objectRef.d == null) {
                    z2 = pointerHoverIconModifierNode.cursorInBoundsOfNode;
                    if (z2) {
                        objectRef.d = pointerHoverIconModifierNode;
                        return Boolean.TRUE;
                    }
                }
                if (objectRef.d != null && pointerHoverIconModifierNode.getOverrideDescendants()) {
                    z = pointerHoverIconModifierNode.cursorInBoundsOfNode;
                    if (z) {
                        objectRef.d = pointerHoverIconModifierNode;
                    }
                }
                return Boolean.TRUE;
            }
        });
        PointerHoverIconModifierNode pointerHoverIconModifierNode = (PointerHoverIconModifierNode) objectRef.d;
        if (pointerHoverIconModifierNode != null) {
            pointerHoverIconModifierNode.displayIcon();
            dpr = dpR.c;
        } else {
            dpr = null;
        }
        if (dpr == null) {
            displayDefaultIcon();
        }
    }
}
