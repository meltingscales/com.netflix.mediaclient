package androidx.compose.ui.node;

import androidx.compose.ui.Modifier;
import o.C8632dsu;

/* loaded from: classes.dex */
final class ForceUpdateElement extends ModifierNodeElement<Modifier.Node> {
    private final ModifierNodeElement<?> original;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ForceUpdateElement) && C8632dsu.c(this.original, ((ForceUpdateElement) obj).original);
    }

    public final ModifierNodeElement<?> getOriginal() {
        return this.original;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.original.hashCode();
    }

    public String toString() {
        return "ForceUpdateElement(original=" + this.original + ')';
    }

    public ForceUpdateElement(ModifierNodeElement<?> modifierNodeElement) {
        this.original = modifierNodeElement;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public Modifier.Node create() {
        throw new IllegalStateException("Shouldn't be called");
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(Modifier.Node node) {
        throw new IllegalStateException("Shouldn't be called");
    }
}
