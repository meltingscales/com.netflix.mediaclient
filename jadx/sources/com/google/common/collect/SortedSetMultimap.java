package com.google.common.collect;

import java.util.Collection;
import java.util.Set;
import java.util.SortedSet;

/* loaded from: classes5.dex */
public interface SortedSetMultimap<K, V> extends SetMultimap<K, V> {
    @Override // com.google.common.collect.SetMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    SortedSet<V> get(K k);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.SetMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    /* bridge */ /* synthetic */ default Collection get(Object obj) {
        return get((SortedSetMultimap<K, V>) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.SetMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    /* bridge */ /* synthetic */ default Set get(Object obj) {
        return get((SortedSetMultimap<K, V>) obj);
    }
}
