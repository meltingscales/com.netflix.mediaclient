package androidx.compose.ui;

import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.ui.node.ModifierNodeElement;
import o.C8632dsu;

/* loaded from: classes5.dex */
public final class CompositionLocalMapInjectionElement extends ModifierNodeElement<CompositionLocalMapInjectionNode> {
    private final CompositionLocalMap map;

    public CompositionLocalMapInjectionElement(CompositionLocalMap compositionLocalMap) {
        this.map = compositionLocalMap;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public CompositionLocalMapInjectionNode create() {
        return new CompositionLocalMapInjectionNode(this.map);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(CompositionLocalMapInjectionNode compositionLocalMapInjectionNode) {
        compositionLocalMapInjectionNode.setMap(this.map);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.map.hashCode();
    }

    public boolean equals(Object obj) {
        return (obj instanceof CompositionLocalMapInjectionElement) && C8632dsu.c(((CompositionLocalMapInjectionElement) obj).map, this.map);
    }
}
