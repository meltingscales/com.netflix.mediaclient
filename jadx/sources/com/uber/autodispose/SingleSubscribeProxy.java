package com.uber.autodispose;

import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;

/* loaded from: classes.dex */
public interface SingleSubscribeProxy<T> {
    Disposable a(Consumer<? super T> consumer);

    Disposable c(Consumer<? super T> consumer, Consumer<? super Throwable> consumer2);

    void d(SingleObserver<? super T> singleObserver);
}
