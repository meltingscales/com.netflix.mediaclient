package com.uber.autodispose;

import com.uber.autodispose.observers.AutoDisposingObserver;
import io.reactivex.CompletableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.observers.DisposableCompletableObserver;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
final class AutoDisposingObserverImpl<T> extends AtomicInteger implements AutoDisposingObserver<T> {
    private final Observer<? super T> c;
    private final CompletableSource e;
    final AtomicReference<Disposable> a = new AtomicReference<>();
    final AtomicReference<Disposable> d = new AtomicReference<>();
    private final AtomicThrowable b = new AtomicThrowable();

    @Override // com.uber.autodispose.observers.AutoDisposingObserver
    public Observer<? super T> a() {
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoDisposingObserverImpl(CompletableSource completableSource, Observer<? super T> observer) {
        this.e = completableSource;
        this.c = observer;
    }

    @Override // io.reactivex.Observer
    public void onSubscribe(Disposable disposable) {
        DisposableCompletableObserver disposableCompletableObserver = new DisposableCompletableObserver() { // from class: com.uber.autodispose.AutoDisposingObserverImpl.1
            @Override // io.reactivex.CompletableObserver
            public void onError(Throwable th) {
                AutoDisposingObserverImpl.this.d.lazySet(AutoDisposableHelper.DISPOSED);
                AutoDisposingObserverImpl.this.onError(th);
            }

            @Override // io.reactivex.CompletableObserver
            public void onComplete() {
                AutoDisposingObserverImpl.this.d.lazySet(AutoDisposableHelper.DISPOSED);
                AutoDisposableHelper.a(AutoDisposingObserverImpl.this.a);
            }
        };
        if (AutoDisposeEndConsumerHelper.a(this.d, disposableCompletableObserver, AutoDisposingObserverImpl.class)) {
            this.c.onSubscribe(this);
            this.e.subscribe(disposableCompletableObserver);
            AutoDisposeEndConsumerHelper.a(this.a, disposable, AutoDisposingObserverImpl.class);
        }
    }

    @Override // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
        return this.a.get() == AutoDisposableHelper.DISPOSED;
    }

    @Override // io.reactivex.disposables.Disposable
    public void dispose() {
        AutoDisposableHelper.a(this.d);
        AutoDisposableHelper.a(this.a);
    }

    @Override // io.reactivex.Observer
    public void onNext(T t) {
        if (isDisposed() || !HalfSerializer.a(this.c, t, this, this.b)) {
            return;
        }
        this.a.lazySet(AutoDisposableHelper.DISPOSED);
        AutoDisposableHelper.a(this.d);
    }

    @Override // io.reactivex.Observer
    public void onError(Throwable th) {
        if (isDisposed()) {
            return;
        }
        this.a.lazySet(AutoDisposableHelper.DISPOSED);
        AutoDisposableHelper.a(this.d);
        HalfSerializer.b(this.c, th, this, this.b);
    }

    @Override // io.reactivex.Observer
    public void onComplete() {
        if (isDisposed()) {
            return;
        }
        this.a.lazySet(AutoDisposableHelper.DISPOSED);
        AutoDisposableHelper.a(this.d);
        HalfSerializer.b(this.c, this, this.b);
    }
}
