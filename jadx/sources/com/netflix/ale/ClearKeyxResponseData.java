package com.netflix.ale;

import o.C8632dsu;

/* loaded from: classes5.dex */
public final class ClearKeyxResponseData {
    private final String key;

    public static /* synthetic */ ClearKeyxResponseData copy$default(ClearKeyxResponseData clearKeyxResponseData, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = clearKeyxResponseData.key;
        }
        return clearKeyxResponseData.copy(str);
    }

    public final String component1() {
        return this.key;
    }

    public final ClearKeyxResponseData copy(String str) {
        C8632dsu.c((Object) str, "");
        return new ClearKeyxResponseData(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ClearKeyxResponseData) && C8632dsu.c((Object) this.key, (Object) ((ClearKeyxResponseData) obj).key);
    }

    public final String getKey() {
        return this.key;
    }

    public int hashCode() {
        return this.key.hashCode();
    }

    public String toString() {
        return "ClearKeyxResponseData(key=" + this.key + ')';
    }

    public ClearKeyxResponseData(String str) {
        C8632dsu.c((Object) str, "");
        this.key = str;
    }

    public final boolean isValid() {
        String str = this.key;
        return str != null && (str instanceof String);
    }
}
