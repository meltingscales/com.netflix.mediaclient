package org.bouncycastle.jce.provider;

/* loaded from: classes6.dex */
public class PKIXNameConstraintValidatorException extends Exception {
    private Throwable cause;

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }
}
