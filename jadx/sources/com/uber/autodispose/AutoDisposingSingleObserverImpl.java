package com.uber.autodispose;

import com.uber.autodispose.observers.AutoDisposingSingleObserver;
import io.reactivex.CompletableSource;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.observers.DisposableCompletableObserver;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
final class AutoDisposingSingleObserverImpl<T> implements AutoDisposingSingleObserver<T> {
    private final SingleObserver<? super T> a;
    private final CompletableSource b;
    final AtomicReference<Disposable> c = new AtomicReference<>();
    final AtomicReference<Disposable> e = new AtomicReference<>();

    @Override // com.uber.autodispose.observers.AutoDisposingSingleObserver
    public SingleObserver<? super T> a() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoDisposingSingleObserverImpl(CompletableSource completableSource, SingleObserver<? super T> singleObserver) {
        this.b = completableSource;
        this.a = singleObserver;
    }

    @Override // io.reactivex.SingleObserver
    public void onSubscribe(Disposable disposable) {
        DisposableCompletableObserver disposableCompletableObserver = new DisposableCompletableObserver() { // from class: com.uber.autodispose.AutoDisposingSingleObserverImpl.1
            @Override // io.reactivex.CompletableObserver
            public void onError(Throwable th) {
                AutoDisposingSingleObserverImpl.this.e.lazySet(AutoDisposableHelper.DISPOSED);
                AutoDisposingSingleObserverImpl.this.onError(th);
            }

            @Override // io.reactivex.CompletableObserver
            public void onComplete() {
                AutoDisposingSingleObserverImpl.this.e.lazySet(AutoDisposableHelper.DISPOSED);
                AutoDisposableHelper.a(AutoDisposingSingleObserverImpl.this.c);
            }
        };
        if (AutoDisposeEndConsumerHelper.a(this.e, disposableCompletableObserver, AutoDisposingSingleObserverImpl.class)) {
            this.a.onSubscribe(this);
            this.b.subscribe(disposableCompletableObserver);
            AutoDisposeEndConsumerHelper.a(this.c, disposable, AutoDisposingSingleObserverImpl.class);
        }
    }

    @Override // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
        return this.c.get() == AutoDisposableHelper.DISPOSED;
    }

    @Override // io.reactivex.disposables.Disposable
    public void dispose() {
        AutoDisposableHelper.a(this.e);
        AutoDisposableHelper.a(this.c);
    }

    @Override // io.reactivex.SingleObserver
    public void onSuccess(T t) {
        if (isDisposed()) {
            return;
        }
        this.c.lazySet(AutoDisposableHelper.DISPOSED);
        AutoDisposableHelper.a(this.e);
        this.a.onSuccess(t);
    }

    @Override // io.reactivex.SingleObserver
    public void onError(Throwable th) {
        if (isDisposed()) {
            return;
        }
        this.c.lazySet(AutoDisposableHelper.DISPOSED);
        AutoDisposableHelper.a(this.e);
        this.a.onError(th);
    }
}
