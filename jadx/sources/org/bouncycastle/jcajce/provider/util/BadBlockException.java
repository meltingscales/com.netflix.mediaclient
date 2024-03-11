package org.bouncycastle.jcajce.provider.util;

import javax.crypto.BadPaddingException;

/* loaded from: classes6.dex */
public class BadBlockException extends BadPaddingException {
    private final Throwable cause;

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }
}
