package com.uber.autodispose;

import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;

/* loaded from: classes6.dex */
public interface MaybeSubscribeProxy<T> {
    Disposable b(Consumer<? super T> consumer);

    Disposable e(Consumer<? super T> consumer, Consumer<? super Throwable> consumer2, Action action);
}
