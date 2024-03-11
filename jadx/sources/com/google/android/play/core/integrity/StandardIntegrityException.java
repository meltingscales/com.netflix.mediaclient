package com.google.android.play.core.integrity;

import com.google.android.gms.common.api.ApiException;

/* loaded from: classes5.dex */
public class StandardIntegrityException extends ApiException {
    private final Throwable a;

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        Throwable th;
        synchronized (this) {
            th = this.a;
        }
        return th;
    }
}
