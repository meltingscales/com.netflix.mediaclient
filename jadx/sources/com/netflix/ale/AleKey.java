package com.netflix.ale;

import o.C8632dsu;

/* loaded from: classes5.dex */
public final class AleKey {
    private final AleAlgorithm algorithm;
    private final Object platformKey;

    public static /* synthetic */ AleKey copy$default(AleKey aleKey, AleAlgorithm aleAlgorithm, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            aleAlgorithm = aleKey.algorithm;
        }
        if ((i & 2) != 0) {
            obj = aleKey.platformKey;
        }
        return aleKey.copy(aleAlgorithm, obj);
    }

    public final AleAlgorithm component1() {
        return this.algorithm;
    }

    public final Object component2() {
        return this.platformKey;
    }

    public final AleKey copy(AleAlgorithm aleAlgorithm, Object obj) {
        C8632dsu.c((Object) aleAlgorithm, "");
        C8632dsu.c(obj, "");
        return new AleKey(aleAlgorithm, obj);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AleKey) {
            AleKey aleKey = (AleKey) obj;
            return this.algorithm == aleKey.algorithm && C8632dsu.c(this.platformKey, aleKey.platformKey);
        }
        return false;
    }

    public final AleAlgorithm getAlgorithm() {
        return this.algorithm;
    }

    public final Object getPlatformKey() {
        return this.platformKey;
    }

    public int hashCode() {
        return (this.algorithm.hashCode() * 31) + this.platformKey.hashCode();
    }

    public String toString() {
        return "AleKey(algorithm=" + this.algorithm + ", platformKey=" + this.platformKey + ')';
    }

    public AleKey(AleAlgorithm aleAlgorithm, Object obj) {
        C8632dsu.c((Object) aleAlgorithm, "");
        C8632dsu.c(obj, "");
        this.algorithm = aleAlgorithm;
        this.platformKey = obj;
    }
}
