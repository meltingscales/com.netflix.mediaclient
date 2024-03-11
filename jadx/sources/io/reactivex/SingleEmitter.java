package io.reactivex;

import io.reactivex.functions.Cancellable;

/* loaded from: classes5.dex */
public interface SingleEmitter<T> {
    boolean isDisposed();

    void onError(Throwable th);

    void onSuccess(T t);

    void setCancellable(Cancellable cancellable);

    boolean tryOnError(Throwable th);
}
