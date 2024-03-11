package com.netflix.msl.crypto;

import java.security.PrivateKey;
import java.security.PublicKey;
import o.AbstractC8389dju;

/* loaded from: classes5.dex */
public class EccCryptoContext extends AbstractC8389dju {

    /* loaded from: classes5.dex */
    public enum Mode {
        ENCRYPT_DECRYPT,
        SIGN_VERIFY
    }

    public EccCryptoContext(String str, PrivateKey privateKey, PublicKey publicKey, Mode mode) {
        super(str, privateKey, publicKey, Mode.ENCRYPT_DECRYPT.equals(mode) ? "ECIES" : "nullOp", null, Mode.SIGN_VERIFY.equals(mode) ? "SHA256withECDSA" : "nullOp");
    }
}
