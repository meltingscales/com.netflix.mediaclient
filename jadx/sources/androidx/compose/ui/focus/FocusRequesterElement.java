package androidx.compose.ui.focus;

import androidx.compose.ui.node.ModifierNodeElement;
import o.C8632dsu;

/* loaded from: classes.dex */
final class FocusRequesterElement extends ModifierNodeElement<FocusRequesterNode> {
    private final FocusRequester focusRequester;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FocusRequesterElement) && C8632dsu.c(this.focusRequester, ((FocusRequesterElement) obj).focusRequester);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.focusRequester.hashCode();
    }

    public String toString() {
        return "FocusRequesterElement(focusRequester=" + this.focusRequester + ')';
    }

    public FocusRequesterElement(FocusRequester focusRequester) {
        this.focusRequester = focusRequester;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public FocusRequesterNode create() {
        return new FocusRequesterNode(this.focusRequester);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(FocusRequesterNode focusRequesterNode) {
        focusRequesterNode.getFocusRequester().getFocusRequesterNodes$ui_release().remove(focusRequesterNode);
        focusRequesterNode.setFocusRequester(this.focusRequester);
        focusRequesterNode.getFocusRequester().getFocusRequesterNodes$ui_release().add(focusRequesterNode);
    }
}
