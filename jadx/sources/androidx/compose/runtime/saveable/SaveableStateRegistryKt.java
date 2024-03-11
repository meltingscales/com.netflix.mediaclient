package androidx.compose.runtime.saveable;

import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import java.util.List;
import java.util.Map;
import o.drM;
import o.drO;

/* loaded from: classes.dex */
public final class SaveableStateRegistryKt {
    private static final ProvidableCompositionLocal<SaveableStateRegistry> LocalSaveableStateRegistry = CompositionLocalKt.staticCompositionLocalOf(new drO<SaveableStateRegistry>() { // from class: androidx.compose.runtime.saveable.SaveableStateRegistryKt$LocalSaveableStateRegistry$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // o.drO
        public final SaveableStateRegistry invoke() {
            return null;
        }
    });

    public static final ProvidableCompositionLocal<SaveableStateRegistry> getLocalSaveableStateRegistry() {
        return LocalSaveableStateRegistry;
    }

    public static final SaveableStateRegistry SaveableStateRegistry(Map<String, ? extends List<? extends Object>> map, drM<Object, Boolean> drm) {
        return new SaveableStateRegistryImpl(map, drm);
    }
}
