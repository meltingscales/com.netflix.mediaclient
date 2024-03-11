package com.google.common.collect;

import java.util.NavigableSet;

/* loaded from: classes5.dex */
public interface SortedMultiset<E> extends SortedMultisetBridge<E>, SortedIterable<E> {
    @Override // com.google.common.collect.SortedMultisetBridge, com.google.common.collect.Multiset
    NavigableSet<E> elementSet();
}
