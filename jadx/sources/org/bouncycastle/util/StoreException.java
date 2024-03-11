package org.bouncycastle.util;

/* loaded from: classes6.dex */
public class StoreException extends RuntimeException {
    private Throwable _e;

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this._e;
    }
}
