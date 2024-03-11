package androidx.compose.ui;

import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.ObserverNodeOwnerScope;
import o.dpR;
import o.drM;
import o.drO;
import o.drX;
import o.dwU;
import o.dwY;
import o.dxD;
import o.dxG;

/* loaded from: classes.dex */
public interface Modifier {
    public static final Companion Companion = Companion.$$INSTANCE;

    boolean all(drM<? super Element, Boolean> drm);

    <R> R foldIn(R r, drX<? super R, ? super Element, ? extends R> drx);

    default Modifier then(Modifier modifier) {
        return modifier == Companion ? this : new CombinedModifier(this, modifier);
    }

    /* loaded from: classes.dex */
    public interface Element extends Modifier {
        @Override // androidx.compose.ui.Modifier
        default <R> R foldIn(R r, drX<? super R, ? super Element, ? extends R> drx) {
            return drx.invoke(r, this);
        }

        @Override // androidx.compose.ui.Modifier
        default boolean all(drM<? super Element, Boolean> drm) {
            return drm.invoke(this).booleanValue();
        }
    }

    /* loaded from: classes.dex */
    public static abstract class Node implements DelegatableNode {
        private Node child;
        private NodeCoordinator coordinator;
        private boolean insertedNodeAwaitingAttachForInvalidation;
        private boolean isAttached;
        private int kindSet;
        private boolean onAttachRunExpected;
        private boolean onDetachRunExpected;
        private ObserverNodeOwnerScope ownerScope;
        private Node parent;
        private dwU scope;
        private boolean updatedNodeAwaitingAttachForInvalidation;
        private Node node = this;
        private int aggregateChildKindSet = -1;

        public final int getAggregateChildKindSet$ui_release() {
            return this.aggregateChildKindSet;
        }

        public final Node getChild$ui_release() {
            return this.child;
        }

        public final NodeCoordinator getCoordinator$ui_release() {
            return this.coordinator;
        }

        public final boolean getInsertedNodeAwaitingAttachForInvalidation$ui_release() {
            return this.insertedNodeAwaitingAttachForInvalidation;
        }

        public final int getKindSet$ui_release() {
            return this.kindSet;
        }

        @Override // androidx.compose.ui.node.DelegatableNode
        public final Node getNode() {
            return this.node;
        }

        public final ObserverNodeOwnerScope getOwnerScope$ui_release() {
            return this.ownerScope;
        }

        public final Node getParent$ui_release() {
            return this.parent;
        }

        public boolean getShouldAutoInvalidate() {
            return true;
        }

        public final boolean getUpdatedNodeAwaitingAttachForInvalidation$ui_release() {
            return this.updatedNodeAwaitingAttachForInvalidation;
        }

        public final boolean isAttached() {
            return this.isAttached;
        }

        public void onAttach() {
        }

        public void onDetach() {
        }

        public void onReset() {
        }

        public final void setAggregateChildKindSet$ui_release(int i) {
            this.aggregateChildKindSet = i;
        }

        public final void setAsDelegateTo$ui_release(Node node) {
            this.node = node;
        }

        public final void setChild$ui_release(Node node) {
            this.child = node;
        }

        public final void setInsertedNodeAwaitingAttachForInvalidation$ui_release(boolean z) {
            this.insertedNodeAwaitingAttachForInvalidation = z;
        }

        public final void setKindSet$ui_release(int i) {
            this.kindSet = i;
        }

        public final void setOwnerScope$ui_release(ObserverNodeOwnerScope observerNodeOwnerScope) {
            this.ownerScope = observerNodeOwnerScope;
        }

        public final void setParent$ui_release(Node node) {
            this.parent = node;
        }

        public final void setUpdatedNodeAwaitingAttachForInvalidation$ui_release(boolean z) {
            this.updatedNodeAwaitingAttachForInvalidation = z;
        }

        public void updateCoordinator$ui_release(NodeCoordinator nodeCoordinator) {
            this.coordinator = nodeCoordinator;
        }

        public final dwU getCoroutineScope() {
            dwU dwu = this.scope;
            if (dwu == null) {
                dwU c = dwY.c(DelegatableNodeKt.requireOwner(this).getCoroutineContext().plus(dxG.a((dxD) DelegatableNodeKt.requireOwner(this).getCoroutineContext().get(dxD.b))));
                this.scope = c;
                return c;
            }
            return dwu;
        }

        public void markAsAttached$ui_release() {
            if (!(!this.isAttached)) {
                throw new IllegalStateException("node attached multiple times".toString());
            }
            if (this.coordinator == null) {
                throw new IllegalStateException("attach invoked on a node without a coordinator".toString());
            }
            this.isAttached = true;
            this.onAttachRunExpected = true;
        }

        public void runAttachLifecycle$ui_release() {
            if (!this.isAttached) {
                throw new IllegalStateException("Must run markAsAttached() prior to runAttachLifecycle".toString());
            }
            if (!this.onAttachRunExpected) {
                throw new IllegalStateException("Must run runAttachLifecycle() only once after markAsAttached()".toString());
            }
            this.onAttachRunExpected = false;
            onAttach();
            this.onDetachRunExpected = true;
        }

        public void runDetachLifecycle$ui_release() {
            if (!this.isAttached) {
                throw new IllegalStateException("node detached multiple times".toString());
            }
            if (this.coordinator == null) {
                throw new IllegalStateException("detach invoked on a node without a coordinator".toString());
            }
            if (!this.onDetachRunExpected) {
                throw new IllegalStateException("Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()".toString());
            }
            this.onDetachRunExpected = false;
            onDetach();
        }

        public void markAsDetached$ui_release() {
            if (!this.isAttached) {
                throw new IllegalStateException("Cannot detach a node that is not attached".toString());
            }
            if (!(!this.onAttachRunExpected)) {
                throw new IllegalStateException("Must run runAttachLifecycle() before markAsDetached()".toString());
            }
            if (!(!this.onDetachRunExpected)) {
                throw new IllegalStateException("Must run runDetachLifecycle() before markAsDetached()".toString());
            }
            this.isAttached = false;
            dwU dwu = this.scope;
            if (dwu != null) {
                dwY.a(dwu, new ModifierNodeDetachedCancellationException());
                this.scope = null;
            }
        }

        public void reset$ui_release() {
            if (!this.isAttached) {
                throw new IllegalStateException("reset() called on an unattached node".toString());
            }
            onReset();
        }

        public final void sideEffect(drO<dpR> dro) {
            DelegatableNodeKt.requireOwner(this).registerOnEndApplyChangesListener(dro);
        }
    }

    /* loaded from: classes.dex */
    public static final class Companion implements Modifier {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @Override // androidx.compose.ui.Modifier
        public boolean all(drM<? super Element, Boolean> drm) {
            return true;
        }

        @Override // androidx.compose.ui.Modifier
        public <R> R foldIn(R r, drX<? super R, ? super Element, ? extends R> drx) {
            return r;
        }

        @Override // androidx.compose.ui.Modifier
        public Modifier then(Modifier modifier) {
            return modifier;
        }

        public String toString() {
            return "Modifier";
        }

        private Companion() {
        }
    }
}
