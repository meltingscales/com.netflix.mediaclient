package com.google.common.collect;

import java.util.SortedSet;

/* loaded from: classes5.dex */
interface SortedMultisetBridge<E> extends Multiset<E> {
    @Override // com.google.common.collect.Multiset
    SortedSet<E> elementSet();
}
