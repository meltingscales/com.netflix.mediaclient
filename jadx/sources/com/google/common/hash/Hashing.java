package com.google.common.hash;

/* loaded from: classes2.dex */
public final class Hashing {
    static final int GOOD_FAST_HASH_SEED = (int) System.currentTimeMillis();

    /* loaded from: classes2.dex */
    static class Sha256Holder {
        static final HashFunction SHA_256 = new MessageDigestHashFunction("SHA-256", "Hashing.sha256()");
    }

    public static HashFunction sha256() {
        return Sha256Holder.SHA_256;
    }
}
