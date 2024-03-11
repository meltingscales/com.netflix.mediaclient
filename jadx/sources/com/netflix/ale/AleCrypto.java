package com.netflix.ale;

/* loaded from: classes5.dex */
public interface AleCrypto {
    byte[] aesCbcDecrypt(AleKey aleKey, byte[] bArr, byte[] bArr2);

    byte[] aesCbcEncrypt(AleKey aleKey, byte[] bArr, byte[] bArr2);

    byte[] aesGcmDecrypt(AleKey aleKey, byte[] bArr, byte[] bArr2, byte[] bArr3);

    byte[] aesGcmEncrypt(AleKey aleKey, byte[] bArr, byte[] bArr2, byte[] bArr3);

    String exportPublicKey(AleKeyPair aleKeyPair);

    AleKeyPair generateRsaOaepKey();

    byte[] getRandomBytes(int i);

    byte[] hmacSha256(AleKey aleKey, byte[] bArr);

    boolean hmacSha256Verify(AleKey aleKey, byte[] bArr, byte[] bArr2);

    AleKey importSymmetricKey(AleAlgorithm aleAlgorithm, byte[] bArr);

    byte[] rsaOaepDecrypt(AleKey aleKey, byte[] bArr);

    byte[] rsaOaepEncrypt(AleKey aleKey, byte[] bArr);
}
