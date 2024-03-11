package org.bouncycastle.jce.exception;

import java.security.cert.CertificateEncodingException;

/* loaded from: classes6.dex */
public class ExtCertificateEncodingException extends CertificateEncodingException {
    private Throwable cause;

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }
}
