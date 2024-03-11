package com.facebook.battery.metrics.core;

import androidx.collection.SimpleArrayMap;

/* loaded from: classes2.dex */
public abstract class Utilities {
    public static <K, V> boolean simpleArrayMapEquals(SimpleArrayMap<K, V> simpleArrayMap, SimpleArrayMap<K, V> simpleArrayMap2) {
        if (simpleArrayMap == simpleArrayMap2) {
            return true;
        }
        int size = simpleArrayMap.size();
        if (size != simpleArrayMap2.size()) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            K keyAt = simpleArrayMap.keyAt(i);
            V valueAt = simpleArrayMap.valueAt(i);
            V v = simpleArrayMap2.get(keyAt);
            if (valueAt == null) {
                if (v != null || !simpleArrayMap2.containsKey(keyAt)) {
                    return false;
                }
            } else if (!valueAt.equals(v)) {
                return false;
            }
        }
        return true;
    }

    public static void checkNotNull(Object obj, String str) {
        if (obj == null) {
            throw new IllegalArgumentException(str);
        }
    }
}
