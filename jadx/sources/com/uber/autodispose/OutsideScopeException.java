package com.uber.autodispose;

/* loaded from: classes5.dex */
public class OutsideScopeException extends RuntimeException {
    public OutsideScopeException(String str) {
        super(str);
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        synchronized (this) {
            if (AutoDisposePlugins.e()) {
                return super.fillInStackTrace();
            }
            return this;
        }
    }
}
