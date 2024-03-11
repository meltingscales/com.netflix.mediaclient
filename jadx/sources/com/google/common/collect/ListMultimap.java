package com.google.common.collect;

import java.util.Collection;
import java.util.List;

/* loaded from: classes5.dex */
public interface ListMultimap<K, V> extends Multimap<K, V> {
    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    List<V> get(K k);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // 
    /* bridge */ /* synthetic */ default Collection get(Object obj) {
        return get((ListMultimap<K, V>) obj);
    }
}
