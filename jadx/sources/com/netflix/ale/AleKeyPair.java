package com.netflix.ale;

import o.C8632dsu;

/* loaded from: classes5.dex */
public final class AleKeyPair {
    private final AleAlgorithm algorithm;
    private final AleKey privateKey;
    private final AleKey publicKey;

    public static /* synthetic */ AleKeyPair copy$default(AleKeyPair aleKeyPair, AleAlgorithm aleAlgorithm, AleKey aleKey, AleKey aleKey2, int i, Object obj) {
        if ((i & 1) != 0) {
            aleAlgorithm = aleKeyPair.algorithm;
        }
        if ((i & 2) != 0) {
            aleKey = aleKeyPair.privateKey;
        }
        if ((i & 4) != 0) {
            aleKey2 = aleKeyPair.publicKey;
        }
        return aleKeyPair.copy(aleAlgorithm, aleKey, aleKey2);
    }

    public final AleAlgorithm component1() {
        return this.algorithm;
    }

    public final AleKey component2() {
        return this.privateKey;
    }

    public final AleKey component3() {
        return this.publicKey;
    }

    public final AleKeyPair copy(AleAlgorithm aleAlgorithm, AleKey aleKey, AleKey aleKey2) {
        C8632dsu.c((Object) aleAlgorithm, "");
        C8632dsu.c((Object) aleKey, "");
        C8632dsu.c((Object) aleKey2, "");
        return new AleKeyPair(aleAlgorithm, aleKey, aleKey2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AleKeyPair) {
            AleKeyPair aleKeyPair = (AleKeyPair) obj;
            return this.algorithm == aleKeyPair.algorithm && C8632dsu.c(this.privateKey, aleKeyPair.privateKey) && C8632dsu.c(this.publicKey, aleKeyPair.publicKey);
        }
        return false;
    }

    public final AleAlgorithm getAlgorithm() {
        return this.algorithm;
    }

    public final AleKey getPrivateKey() {
        return this.privateKey;
    }

    public final AleKey getPublicKey() {
        return this.publicKey;
    }

    public int hashCode() {
        return (((this.algorithm.hashCode() * 31) + this.privateKey.hashCode()) * 31) + this.publicKey.hashCode();
    }

    public String toString() {
        return "AleKeyPair(algorithm=" + this.algorithm + ", privateKey=" + this.privateKey + ", publicKey=" + this.publicKey + ')';
    }

    public AleKeyPair(AleAlgorithm aleAlgorithm, AleKey aleKey, AleKey aleKey2) {
        C8632dsu.c((Object) aleAlgorithm, "");
        C8632dsu.c((Object) aleKey, "");
        C8632dsu.c((Object) aleKey2, "");
        this.algorithm = aleAlgorithm;
        this.privateKey = aleKey;
        this.publicKey = aleKey2;
        if (aleKey.getAlgorithm() != aleKey2.getAlgorithm()) {
            throw new IllegalArgumentException("key algorithm mismatch");
        }
    }
}
