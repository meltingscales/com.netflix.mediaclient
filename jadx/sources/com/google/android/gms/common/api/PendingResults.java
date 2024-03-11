package com.google.android.gms.common.api;

import android.os.Looper;
import com.google.android.gms.common.api.internal.StatusPendingResult;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes2.dex */
public final class PendingResults {
    public static <R extends Result> PendingResult<R> immediateFailedResult(R r, GoogleApiClient googleApiClient) {
        Preconditions.checkNotNull(r, "Result must not be null");
        Preconditions.checkArgument(!r.getStatus().isSuccess(), "Status code must not be SUCCESS");
        zag zagVar = new zag(googleApiClient, r);
        zagVar.setResult(r);
        return zagVar;
    }

    public static PendingResult<Status> immediatePendingResult(Status status) {
        Preconditions.checkNotNull(status, "Result must not be null");
        StatusPendingResult statusPendingResult = new StatusPendingResult(Looper.getMainLooper());
        statusPendingResult.setResult(status);
        return statusPendingResult;
    }

    public static PendingResult<Status> immediatePendingResult(Status status, GoogleApiClient googleApiClient) {
        Preconditions.checkNotNull(status, "Result must not be null");
        StatusPendingResult statusPendingResult = new StatusPendingResult(googleApiClient);
        statusPendingResult.setResult(status);
        return statusPendingResult;
    }
}