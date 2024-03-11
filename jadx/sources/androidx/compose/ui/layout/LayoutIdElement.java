package androidx.compose.ui.layout;

import androidx.compose.ui.node.ModifierNodeElement;
import o.C8632dsu;

/* loaded from: classes.dex */
final class LayoutIdElement extends ModifierNodeElement<LayoutIdModifier> {
    private final Object layoutId;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LayoutIdElement) && C8632dsu.c(this.layoutId, ((LayoutIdElement) obj).layoutId);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.layoutId.hashCode();
    }

    public String toString() {
        return "LayoutIdElement(layoutId=" + this.layoutId + ')';
    }

    public LayoutIdElement(Object obj) {
        this.layoutId = obj;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public LayoutIdModifier create() {
        return new LayoutIdModifier(this.layoutId);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(LayoutIdModifier layoutIdModifier) {
        layoutIdModifier.setLayoutId$ui_release(this.layoutId);
    }
}
