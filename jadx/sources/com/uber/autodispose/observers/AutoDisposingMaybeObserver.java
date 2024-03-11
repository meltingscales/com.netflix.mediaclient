package com.uber.autodispose.observers;

import io.reactivex.MaybeObserver;
import io.reactivex.disposables.Disposable;

/* loaded from: classes5.dex */
public interface AutoDisposingMaybeObserver<T> extends MaybeObserver<T>, Disposable {
    MaybeObserver<? super T> e();
}
