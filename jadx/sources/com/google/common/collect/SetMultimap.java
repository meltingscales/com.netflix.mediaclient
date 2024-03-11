package com.google.common.collect;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: classes5.dex */
public interface SetMultimap<K, V> extends Multimap<K, V> {
    @Override // com.google.common.collect.Multimap
    Set<Map.Entry<K, V>> entries();

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    Set<V> get(K k);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    /* bridge */ /* synthetic */ default Collection get(Object obj) {
        return get((SetMultimap<K, V>) obj);
    }
}
