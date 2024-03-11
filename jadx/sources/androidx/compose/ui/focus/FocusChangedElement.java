package androidx.compose.ui.focus;

import androidx.compose.ui.node.ModifierNodeElement;
import o.C8632dsu;
import o.dpR;
import o.drM;

/* loaded from: classes.dex */
final class FocusChangedElement extends ModifierNodeElement<FocusChangedNode> {
    private final drM<FocusState, dpR> onFocusChanged;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FocusChangedElement) && C8632dsu.c(this.onFocusChanged, ((FocusChangedElement) obj).onFocusChanged);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.onFocusChanged.hashCode();
    }

    public String toString() {
        return "FocusChangedElement(onFocusChanged=" + this.onFocusChanged + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FocusChangedElement(drM<? super FocusState, dpR> drm) {
        this.onFocusChanged = drm;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public FocusChangedNode create() {
        return new FocusChangedNode(this.onFocusChanged);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(FocusChangedNode focusChangedNode) {
        focusChangedNode.setOnFocusChanged(this.onFocusChanged);
    }
}
