package com.uber.autodispose;

import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;

/* loaded from: classes.dex */
public interface ObservableSubscribeProxy<T> {
    Disposable a(Consumer<? super T> consumer, Consumer<? super Throwable> consumer2, Action action);

    Disposable b(Consumer<? super T> consumer, Consumer<? super Throwable> consumer2);

    Disposable e(Consumer<? super T> consumer);
}
