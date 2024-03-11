package org.bouncycastle.jce.exception;

import java.security.cert.CertPathBuilderException;

/* loaded from: classes6.dex */
public class ExtCertPathBuilderException extends CertPathBuilderException {
    private Throwable cause;

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }
}
