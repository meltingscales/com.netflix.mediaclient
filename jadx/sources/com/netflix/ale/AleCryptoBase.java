package com.netflix.ale;

import kotlin.NotImplementedError;
import o.C8632dsu;

/* loaded from: classes5.dex */
public class AleCryptoBase implements AleCrypto {
    @Override // com.netflix.ale.AleCrypto
    public byte[] aesCbcDecrypt(AleKey aleKey, byte[] bArr, byte[] bArr2) {
        C8632dsu.c((Object) aleKey, "");
        C8632dsu.c((Object) bArr, "");
        C8632dsu.c((Object) bArr2, "");
        throw new NotImplementedError("unimplemented");
    }

    @Override // com.netflix.ale.AleCrypto
    public byte[] aesCbcEncrypt(AleKey aleKey, byte[] bArr, byte[] bArr2) {
        C8632dsu.c((Object) aleKey, "");
        C8632dsu.c((Object) bArr, "");
        C8632dsu.c((Object) bArr2, "");
        throw new NotImplementedError("unimplemented");
    }

    @Override // com.netflix.ale.AleCrypto
    public byte[] aesGcmDecrypt(AleKey aleKey, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        C8632dsu.c((Object) aleKey, "");
        C8632dsu.c((Object) bArr, "");
        C8632dsu.c((Object) bArr2, "");
        C8632dsu.c((Object) bArr3, "");
        throw new NotImplementedError("unimplemented");
    }

    @Override // com.netflix.ale.AleCrypto
    public byte[] aesGcmEncrypt(AleKey aleKey, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        C8632dsu.c((Object) aleKey, "");
        C8632dsu.c((Object) bArr, "");
        C8632dsu.c((Object) bArr2, "");
        C8632dsu.c((Object) bArr3, "");
        throw new NotImplementedError("unimplemented");
    }

    @Override // com.netflix.ale.AleCrypto
    public String exportPublicKey(AleKeyPair aleKeyPair) {
        C8632dsu.c((Object) aleKeyPair, "");
        throw new NotImplementedError("unimplemented");
    }

    @Override // com.netflix.ale.AleCrypto
    public AleKeyPair generateRsaOaepKey() {
        throw new NotImplementedError("unimplemented");
    }

    @Override // com.netflix.ale.AleCrypto
    public byte[] getRandomBytes(int i) {
        throw new NotImplementedError("unimplemented");
    }

    @Override // com.netflix.ale.AleCrypto
    public byte[] hmacSha256(AleKey aleKey, byte[] bArr) {
        C8632dsu.c((Object) aleKey, "");
        C8632dsu.c((Object) bArr, "");
        throw new NotImplementedError("unimplemented");
    }

    @Override // com.netflix.ale.AleCrypto
    public boolean hmacSha256Verify(AleKey aleKey, byte[] bArr, byte[] bArr2) {
        C8632dsu.c((Object) aleKey, "");
        C8632dsu.c((Object) bArr, "");
        C8632dsu.c((Object) bArr2, "");
        throw new NotImplementedError("unimplemented");
    }

    @Override // com.netflix.ale.AleCrypto
    public AleKey importSymmetricKey(AleAlgorithm aleAlgorithm, byte[] bArr) {
        C8632dsu.c((Object) aleAlgorithm, "");
        C8632dsu.c((Object) bArr, "");
        throw new NotImplementedError("unimplemented");
    }

    @Override // com.netflix.ale.AleCrypto
    public byte[] rsaOaepDecrypt(AleKey aleKey, byte[] bArr) {
        C8632dsu.c((Object) aleKey, "");
        C8632dsu.c((Object) bArr, "");
        throw new NotImplementedError("unimplemented");
    }

    @Override // com.netflix.ale.AleCrypto
    public byte[] rsaOaepEncrypt(AleKey aleKey, byte[] bArr) {
        C8632dsu.c((Object) aleKey, "");
        C8632dsu.c((Object) bArr, "");
        throw new NotImplementedError("unimplemented");
    }
}
