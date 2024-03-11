package org.bouncycastle.jce.provider;

/* loaded from: classes6.dex */
public class AnnotatedException extends Exception {
    private Throwable _underlyingException;

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this._underlyingException;
    }
}
