package org.bouncycastle.i18n;

/* loaded from: classes6.dex */
public class LocalizedException extends Exception {
    private Throwable cause;

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }
}
