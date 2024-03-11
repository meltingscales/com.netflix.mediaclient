package io.reactivex;

import io.reactivex.functions.Cancellable;

/* loaded from: classes5.dex */
public interface CompletableEmitter {
    void onComplete();

    void onError(Throwable th);

    void setCancellable(Cancellable cancellable);

    boolean tryOnError(Throwable th);
}
