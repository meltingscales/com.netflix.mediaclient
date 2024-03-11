package org.bouncycastle.crypto.io;

import java.io.IOException;

/* loaded from: classes6.dex */
public class CipherIOException extends IOException {
    private static final long serialVersionUID = 1;
    private final Throwable cause;

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }
}
