package androidx.compose.ui.modifier;

/* loaded from: classes.dex */
public final class BackwardsCompatLocalMap extends ModifierLocalMap {
    private ModifierLocalProvider<?> element;

    public final void setElement(ModifierLocalProvider<?> modifierLocalProvider) {
        this.element = modifierLocalProvider;
    }

    public BackwardsCompatLocalMap(ModifierLocalProvider<?> modifierLocalProvider) {
        super(null);
        this.element = modifierLocalProvider;
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalMap
    public <T> T get$ui_release(ModifierLocal<T> modifierLocal) {
        if (modifierLocal != this.element.getKey()) {
            throw new IllegalStateException("Check failed.".toString());
        }
        return (T) this.element.getValue();
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalMap
    public boolean contains$ui_release(ModifierLocal<?> modifierLocal) {
        return modifierLocal == this.element.getKey();
    }
}
