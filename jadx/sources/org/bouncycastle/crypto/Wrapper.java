package org.bouncycastle.crypto;

/* loaded from: classes6.dex */
public interface Wrapper {
    String getAlgorithmName();

    void init(boolean z, CipherParameters cipherParameters);

    byte[] unwrap(byte[] bArr, int i, int i2);

    byte[] wrap(byte[] bArr, int i, int i2);
}
