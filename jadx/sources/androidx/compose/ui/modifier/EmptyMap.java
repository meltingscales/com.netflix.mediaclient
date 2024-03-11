package androidx.compose.ui.modifier;

/* loaded from: classes.dex */
public final class EmptyMap extends ModifierLocalMap {
    public static final EmptyMap INSTANCE = new EmptyMap();

    @Override // androidx.compose.ui.modifier.ModifierLocalMap
    public boolean contains$ui_release(ModifierLocal<?> modifierLocal) {
        return false;
    }

    private EmptyMap() {
        super(null);
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalMap
    public <T> T get$ui_release(ModifierLocal<T> modifierLocal) {
        throw new IllegalStateException("".toString());
    }
}
