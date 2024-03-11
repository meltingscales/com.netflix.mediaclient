package androidx.compose.ui.input.nestedscroll;

import androidx.compose.ui.node.ModifierNodeElement;
import o.C8632dsu;

/* loaded from: classes.dex */
final class NestedScrollElement extends ModifierNodeElement<NestedScrollNode> {
    private final NestedScrollConnection connection;
    private final NestedScrollDispatcher dispatcher;

    public NestedScrollElement(NestedScrollConnection nestedScrollConnection, NestedScrollDispatcher nestedScrollDispatcher) {
        this.connection = nestedScrollConnection;
        this.dispatcher = nestedScrollDispatcher;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public NestedScrollNode create() {
        return new NestedScrollNode(this.connection, this.dispatcher);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(NestedScrollNode nestedScrollNode) {
        nestedScrollNode.updateNode$ui_release(this.connection, this.dispatcher);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        int hashCode = this.connection.hashCode();
        NestedScrollDispatcher nestedScrollDispatcher = this.dispatcher;
        return (hashCode * 31) + (nestedScrollDispatcher != null ? nestedScrollDispatcher.hashCode() : 0);
    }

    public boolean equals(Object obj) {
        if (obj instanceof NestedScrollElement) {
            NestedScrollElement nestedScrollElement = (NestedScrollElement) obj;
            return C8632dsu.c(nestedScrollElement.connection, this.connection) && C8632dsu.c(nestedScrollElement.dispatcher, this.dispatcher);
        }
        return false;
    }
}
