package androidx.compose.ui.modifier;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;

/* loaded from: classes.dex */
public final class SingleLocalMap extends ModifierLocalMap {
    private final ModifierLocal<?> key;
    private final MutableState value$delegate;

    @Override // androidx.compose.ui.modifier.ModifierLocalMap
    public boolean contains$ui_release(ModifierLocal<?> modifierLocal) {
        return modifierLocal == this.key;
    }

    public SingleLocalMap(ModifierLocal<?> modifierLocal) {
        super(null);
        MutableState mutableStateOf$default;
        this.key = modifierLocal;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.value$delegate = mutableStateOf$default;
    }

    public <T> void set$ui_release(ModifierLocal<T> modifierLocal, T t) {
        if (modifierLocal != this.key) {
            throw new IllegalStateException("Check failed.".toString());
        }
        setValue(t);
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalMap
    public <T> T get$ui_release(ModifierLocal<T> modifierLocal) {
        if (modifierLocal != this.key) {
            throw new IllegalStateException("Check failed.".toString());
        }
        T t = (T) getValue();
        if (t == null) {
            return null;
        }
        return t;
    }

    private final Object getValue() {
        return this.value$delegate.getValue();
    }

    private final void setValue(Object obj) {
        this.value$delegate.setValue(obj);
    }
}
