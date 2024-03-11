package com.google.android.gms.common.api;

import com.google.android.gms.common.api.Result;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public abstract class PendingResult<R extends Result> {

    /* loaded from: classes2.dex */
    public interface StatusListener {
        void onComplete(Status status);
    }

    public void addStatusListener(StatusListener statusListener) {
        throw new UnsupportedOperationException();
    }

    @ResultIgnorabilityUnspecified
    public abstract R await(long j, TimeUnit timeUnit);

    public abstract void cancel();

    public abstract void setResultCallback(ResultCallback<? super R> resultCallback);
}
