package org.bouncycastle.crypto;

/* loaded from: classes5.dex */
public interface BlockCipher {
    int getBlockSize();

    void init(boolean z, CipherParameters cipherParameters);

    int processBlock(byte[] bArr, int i, byte[] bArr2, int i2);

    void reset();
}
