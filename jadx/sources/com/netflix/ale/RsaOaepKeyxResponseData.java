package com.netflix.ale;

import o.C8632dsu;

/* loaded from: classes5.dex */
public final class RsaOaepKeyxResponseData {
    private final String wrappedkey;

    public static /* synthetic */ RsaOaepKeyxResponseData copy$default(RsaOaepKeyxResponseData rsaOaepKeyxResponseData, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = rsaOaepKeyxResponseData.wrappedkey;
        }
        return rsaOaepKeyxResponseData.copy(str);
    }

    public final String component1() {
        return this.wrappedkey;
    }

    public final RsaOaepKeyxResponseData copy(String str) {
        C8632dsu.c((Object) str, "");
        return new RsaOaepKeyxResponseData(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RsaOaepKeyxResponseData) && C8632dsu.c((Object) this.wrappedkey, (Object) ((RsaOaepKeyxResponseData) obj).wrappedkey);
    }

    public final String getWrappedkey() {
        return this.wrappedkey;
    }

    public int hashCode() {
        return this.wrappedkey.hashCode();
    }

    public String toString() {
        return "RsaOaepKeyxResponseData(wrappedkey=" + this.wrappedkey + ')';
    }

    public RsaOaepKeyxResponseData(String str) {
        C8632dsu.c((Object) str, "");
        this.wrappedkey = str;
    }

    public final boolean isValid() {
        String str = this.wrappedkey;
        return str != null && (str instanceof String);
    }
}
