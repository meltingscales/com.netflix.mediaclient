package androidx.compose.runtime.external.kotlinx.collections.immutable;

import java.util.Map;
import o.dsP;

/* loaded from: classes.dex */
public interface PersistentMap<K, V> extends ImmutableMap<K, V> {

    /* loaded from: classes.dex */
    public interface Builder<K, V> extends Map<K, V>, dsP {
        PersistentMap<K, V> build();
    }

    Builder<K, V> builder();
}
