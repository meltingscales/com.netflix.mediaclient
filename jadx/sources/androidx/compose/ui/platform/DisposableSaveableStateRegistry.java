package androidx.compose.ui.platform;

import androidx.compose.runtime.saveable.SaveableStateRegistry;
import java.util.List;
import java.util.Map;
import o.dpR;
import o.drO;

/* loaded from: classes.dex */
public final class DisposableSaveableStateRegistry implements SaveableStateRegistry {
    private final /* synthetic */ SaveableStateRegistry $$delegate_0;
    private final drO<dpR> onDispose;

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public boolean canBeSaved(Object obj) {
        return this.$$delegate_0.canBeSaved(obj);
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public Object consumeRestored(String str) {
        return this.$$delegate_0.consumeRestored(str);
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public Map<String, List<Object>> performSave() {
        return this.$$delegate_0.performSave();
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public SaveableStateRegistry.Entry registerProvider(String str, drO<? extends Object> dro) {
        return this.$$delegate_0.registerProvider(str, dro);
    }

    public DisposableSaveableStateRegistry(SaveableStateRegistry saveableStateRegistry, drO<dpR> dro) {
        this.onDispose = dro;
        this.$$delegate_0 = saveableStateRegistry;
    }

    public final void dispose() {
        this.onDispose.invoke();
    }
}
