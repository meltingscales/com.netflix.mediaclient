package org.bouncycastle.jce.exception;

import java.security.cert.CertPathValidatorException;

/* loaded from: classes6.dex */
public class ExtCertPathValidatorException extends CertPathValidatorException {
    private Throwable cause;

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }
}
