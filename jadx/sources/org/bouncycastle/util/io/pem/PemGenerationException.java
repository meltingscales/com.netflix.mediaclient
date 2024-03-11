package org.bouncycastle.util.io.pem;

import java.io.IOException;

/* loaded from: classes6.dex */
public class PemGenerationException extends IOException {
    private Throwable cause;

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }
}
