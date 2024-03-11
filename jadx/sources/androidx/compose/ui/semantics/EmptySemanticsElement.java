package androidx.compose.ui.semantics;

import androidx.compose.ui.node.ModifierNodeElement;

/* loaded from: classes.dex */
public final class EmptySemanticsElement extends ModifierNodeElement<EmptySemanticsModifier> {
    public static final EmptySemanticsElement INSTANCE = new EmptySemanticsElement();

    public boolean equals(Object obj) {
        return obj == this;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(EmptySemanticsModifier emptySemanticsModifier) {
    }

    private EmptySemanticsElement() {
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public EmptySemanticsModifier create() {
        return new EmptySemanticsModifier();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return System.identityHashCode(this);
    }
}
