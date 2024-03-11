package org.bouncycastle.jce.exception;

import java.io.IOException;

/* loaded from: classes6.dex */
public class ExtIOException extends IOException {
    private Throwable cause;

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }
}
