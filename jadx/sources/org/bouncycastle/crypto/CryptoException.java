package org.bouncycastle.crypto;

/* loaded from: classes6.dex */
public class CryptoException extends Exception {
    private Throwable cause;

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }
}
