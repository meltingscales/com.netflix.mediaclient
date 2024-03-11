package com.google.android.play.core.integrity;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import java.util.Locale;

/* loaded from: classes2.dex */
public class IntegrityServiceException extends ApiException {
    private final Throwable a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public IntegrityServiceException(int i, Throwable th) {
        super(new Status(i, String.format(Locale.ROOT, "Integrity API error (%d): %s.", Integer.valueOf(i), com.google.android.play.core.integrity.model.a.a(i))));
        if (i == 0) {
            throw new IllegalArgumentException("ErrorCode should not be 0.");
        }
        this.a = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        Throwable th;
        synchronized (this) {
            th = this.a;
        }
        return th;
    }

    public int getErrorCode() {
        return super.getStatusCode();
    }
}
