package org.chromium.net;

import java.util.concurrent.Executor;

/* loaded from: classes6.dex */
public abstract class NetworkQualityRttListener {
    private final Executor mExecutor;

    public Executor getExecutor() {
        return this.mExecutor;
    }

    public abstract void onRttObservation(int i, long j, int i2);

    public NetworkQualityRttListener(Executor executor) {
        if (executor == null) {
            throw new IllegalStateException("Executor must not be null");
        }
        this.mExecutor = executor;
    }
}
