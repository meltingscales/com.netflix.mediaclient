package org.bouncycastle.crypto;

/* loaded from: classes5.dex */
public interface Mac {
    int doFinal(byte[] bArr, int i);

    int getMacSize();

    void init(CipherParameters cipherParameters);

    void update(byte[] bArr, int i, int i2);
}
