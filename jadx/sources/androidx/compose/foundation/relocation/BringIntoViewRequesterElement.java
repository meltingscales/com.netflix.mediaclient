package androidx.compose.foundation.relocation;

import androidx.compose.ui.node.ModifierNodeElement;
import o.C8632dsu;

/* loaded from: classes.dex */
final class BringIntoViewRequesterElement extends ModifierNodeElement<BringIntoViewRequesterNode> {
    private final BringIntoViewRequester requester;

    public BringIntoViewRequesterElement(BringIntoViewRequester bringIntoViewRequester) {
        this.requester = bringIntoViewRequester;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public BringIntoViewRequesterNode create() {
        return new BringIntoViewRequesterNode(this.requester);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(BringIntoViewRequesterNode bringIntoViewRequesterNode) {
        bringIntoViewRequesterNode.updateRequester(this.requester);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof BringIntoViewRequesterElement) && C8632dsu.c(this.requester, ((BringIntoViewRequesterElement) obj).requester));
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.requester.hashCode();
    }
}
