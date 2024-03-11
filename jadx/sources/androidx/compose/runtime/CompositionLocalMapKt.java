package androidx.compose.runtime;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import androidx.compose.runtime.internal.PersistentCompositionLocalMapKt;
import o.C8632dsu;

/* loaded from: classes.dex */
public final class CompositionLocalMapKt {
    public static final <T> boolean contains(PersistentCompositionLocalMap persistentCompositionLocalMap, CompositionLocal<T> compositionLocal) {
        C8632dsu.d(compositionLocal);
        return persistentCompositionLocalMap.containsKey(compositionLocal);
    }

    public static final <T> T getValueOf(PersistentCompositionLocalMap persistentCompositionLocalMap, CompositionLocal<T> compositionLocal) {
        C8632dsu.d(compositionLocal);
        State state = (State) persistentCompositionLocalMap.get((Object) compositionLocal);
        if (state != null) {
            return (T) state.getValue();
        }
        return null;
    }

    public static final <T> T read(PersistentCompositionLocalMap persistentCompositionLocalMap, CompositionLocal<T> compositionLocal) {
        if (contains(persistentCompositionLocalMap, compositionLocal)) {
            return (T) getValueOf(persistentCompositionLocalMap, compositionLocal);
        }
        return compositionLocal.getDefaultValueHolder$runtime_release().getValue();
    }

    public static /* synthetic */ PersistentCompositionLocalMap updateCompositionMap$default(ProvidedValue[] providedValueArr, PersistentCompositionLocalMap persistentCompositionLocalMap, PersistentCompositionLocalMap persistentCompositionLocalMap2, int i, Object obj) {
        if ((i & 4) != 0) {
            persistentCompositionLocalMap2 = PersistentCompositionLocalMapKt.persistentCompositionLocalHashMapOf();
        }
        return updateCompositionMap(providedValueArr, persistentCompositionLocalMap, persistentCompositionLocalMap2);
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [androidx.compose.runtime.PersistentCompositionLocalMap] */
    public static final PersistentCompositionLocalMap updateCompositionMap(ProvidedValue<?>[] providedValueArr, PersistentCompositionLocalMap persistentCompositionLocalMap, PersistentCompositionLocalMap persistentCompositionLocalMap2) {
        PersistentMap.Builder<CompositionLocal<Object>, State<? extends Object>> builder = PersistentCompositionLocalMapKt.persistentCompositionLocalHashMapOf().builder();
        for (ProvidedValue<?> providedValue : providedValueArr) {
            CompositionLocal<?> compositionLocal = providedValue.getCompositionLocal();
            C8632dsu.d(compositionLocal);
            ProvidableCompositionLocal providableCompositionLocal = (ProvidableCompositionLocal) compositionLocal;
            if (providedValue.getCanOverride() || !contains(persistentCompositionLocalMap, providableCompositionLocal)) {
                builder.put(providableCompositionLocal, providableCompositionLocal.updatedStateOf$runtime_release(providedValue.getValue(), (State) persistentCompositionLocalMap2.get((Object) providableCompositionLocal)));
            }
        }
        return builder.build();
    }
}
