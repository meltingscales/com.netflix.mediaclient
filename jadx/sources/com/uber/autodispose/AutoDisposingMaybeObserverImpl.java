package com.uber.autodispose;

import com.uber.autodispose.observers.AutoDisposingMaybeObserver;
import io.reactivex.CompletableSource;
import io.reactivex.MaybeObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.observers.DisposableCompletableObserver;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes6.dex */
final class AutoDisposingMaybeObserverImpl<T> implements AutoDisposingMaybeObserver<T> {
    private final MaybeObserver<? super T> a;
    private final CompletableSource d;
    final AtomicReference<Disposable> e = new AtomicReference<>();
    final AtomicReference<Disposable> c = new AtomicReference<>();

    @Override // com.uber.autodispose.observers.AutoDisposingMaybeObserver
    public MaybeObserver<? super T> e() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoDisposingMaybeObserverImpl(CompletableSource completableSource, MaybeObserver<? super T> maybeObserver) {
        this.d = completableSource;
        this.a = maybeObserver;
    }

    @Override // io.reactivex.MaybeObserver
    public void onSubscribe(Disposable disposable) {
        DisposableCompletableObserver disposableCompletableObserver = new DisposableCompletableObserver() { // from class: com.uber.autodispose.AutoDisposingMaybeObserverImpl.1
            @Override // io.reactivex.CompletableObserver
            public void onError(Throwable th) {
                AutoDisposingMaybeObserverImpl.this.c.lazySet(AutoDisposableHelper.DISPOSED);
                AutoDisposingMaybeObserverImpl.this.onError(th);
            }

            @Override // io.reactivex.CompletableObserver
            public void onComplete() {
                AutoDisposingMaybeObserverImpl.this.c.lazySet(AutoDisposableHelper.DISPOSED);
                AutoDisposableHelper.a(AutoDisposingMaybeObserverImpl.this.e);
            }
        };
        if (AutoDisposeEndConsumerHelper.a(this.c, disposableCompletableObserver, AutoDisposingMaybeObserverImpl.class)) {
            this.a.onSubscribe(this);
            this.d.subscribe(disposableCompletableObserver);
            AutoDisposeEndConsumerHelper.a(this.e, disposable, AutoDisposingMaybeObserverImpl.class);
        }
    }

    @Override // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
        return this.e.get() == AutoDisposableHelper.DISPOSED;
    }

    @Override // io.reactivex.disposables.Disposable
    public void dispose() {
        AutoDisposableHelper.a(this.c);
        AutoDisposableHelper.a(this.e);
    }

    @Override // io.reactivex.MaybeObserver
    public void onSuccess(T t) {
        if (isDisposed()) {
            return;
        }
        this.e.lazySet(AutoDisposableHelper.DISPOSED);
        AutoDisposableHelper.a(this.c);
        this.a.onSuccess(t);
    }

    @Override // io.reactivex.MaybeObserver
    public void onError(Throwable th) {
        if (isDisposed()) {
            return;
        }
        this.e.lazySet(AutoDisposableHelper.DISPOSED);
        AutoDisposableHelper.a(this.c);
        this.a.onError(th);
    }

    @Override // io.reactivex.MaybeObserver
    public void onComplete() {
        if (isDisposed()) {
            return;
        }
        this.e.lazySet(AutoDisposableHelper.DISPOSED);
        AutoDisposableHelper.a(this.c);
        this.a.onComplete();
    }
}
