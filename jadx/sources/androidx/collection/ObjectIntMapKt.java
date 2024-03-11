package androidx.collection;

import o.C8632dsu;

/* loaded from: classes.dex */
public final class ObjectIntMapKt {
    private static final MutableObjectIntMap<Object> EmptyObjectIntMap = new MutableObjectIntMap<>(0);

    public static final <K> ObjectIntMap<K> emptyObjectIntMap() {
        MutableObjectIntMap<Object> mutableObjectIntMap = EmptyObjectIntMap;
        C8632dsu.d(mutableObjectIntMap);
        return mutableObjectIntMap;
    }
}
