package io.reactivex;

import io.reactivex.functions.Cancellable;

/* loaded from: classes5.dex */
public interface ObservableEmitter<T> extends Emitter<T> {
    boolean isDisposed();

    void setCancellable(Cancellable cancellable);

    boolean tryOnError(Throwable th);
}
