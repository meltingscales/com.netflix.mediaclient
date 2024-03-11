package com.google.firebase.iid;

import com.netflix.ale.AleCryptoBouncyCastle;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes2.dex */
public final class zzb {
    public static KeyPair zza() {
        try {
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance(AleCryptoBouncyCastle.RSA_KEY_ALG);
            keyPairGenerator.initialize(2048);
            return keyPairGenerator.generateKeyPair();
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }
}
