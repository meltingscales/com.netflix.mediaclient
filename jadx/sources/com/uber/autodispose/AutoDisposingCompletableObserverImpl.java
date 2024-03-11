package com.uber.autodispose;

import com.uber.autodispose.observers.AutoDisposingCompletableObserver;
import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.observers.DisposableCompletableObserver;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
final class AutoDisposingCompletableObserverImpl implements AutoDisposingCompletableObserver {
    private final CompletableSource a;
    private final CompletableObserver c;
    final AtomicReference<Disposable> d = new AtomicReference<>();
    final AtomicReference<Disposable> e = new AtomicReference<>();

    @Override // com.uber.autodispose.observers.AutoDisposingCompletableObserver
    public CompletableObserver a() {
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoDisposingCompletableObserverImpl(CompletableSource completableSource, CompletableObserver completableObserver) {
        this.a = completableSource;
        this.c = completableObserver;
    }

    @Override // io.reactivex.CompletableObserver
    public void onSubscribe(Disposable disposable) {
        DisposableCompletableObserver disposableCompletableObserver = new DisposableCompletableObserver() { // from class: com.uber.autodispose.AutoDisposingCompletableObserverImpl.1
            @Override // io.reactivex.CompletableObserver
            public void onError(Throwable th) {
                AutoDisposingCompletableObserverImpl.this.e.lazySet(AutoDisposableHelper.DISPOSED);
                AutoDisposingCompletableObserverImpl.this.onError(th);
            }

            @Override // io.reactivex.CompletableObserver
            public void onComplete() {
                AutoDisposingCompletableObserverImpl.this.e.lazySet(AutoDisposableHelper.DISPOSED);
                AutoDisposableHelper.a(AutoDisposingCompletableObserverImpl.this.d);
            }
        };
        if (AutoDisposeEndConsumerHelper.a(this.e, disposableCompletableObserver, AutoDisposingCompletableObserverImpl.class)) {
            this.c.onSubscribe(this);
            this.a.subscribe(disposableCompletableObserver);
            AutoDisposeEndConsumerHelper.a(this.d, disposable, AutoDisposingCompletableObserverImpl.class);
        }
    }

    @Override // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
        return this.d.get() == AutoDisposableHelper.DISPOSED;
    }

    @Override // io.reactivex.disposables.Disposable
    public void dispose() {
        AutoDisposableHelper.a(this.e);
        AutoDisposableHelper.a(this.d);
    }

    @Override // io.reactivex.CompletableObserver
    public void onComplete() {
        if (isDisposed()) {
            return;
        }
        this.d.lazySet(AutoDisposableHelper.DISPOSED);
        AutoDisposableHelper.a(this.e);
        this.c.onComplete();
    }

    @Override // io.reactivex.CompletableObserver
    public void onError(Throwable th) {
        if (isDisposed()) {
            return;
        }
        this.d.lazySet(AutoDisposableHelper.DISPOSED);
        AutoDisposableHelper.a(this.e);
        this.c.onError(th);
    }
}
