package com.uber.autodispose;

import io.reactivex.CompletableSource;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;

/* loaded from: classes5.dex */
final class AutoDisposeObservable<T> extends Observable<T> {
    private final ObservableSource<T> c;
    private final CompletableSource d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoDisposeObservable(ObservableSource<T> observableSource, CompletableSource completableSource) {
        this.c = observableSource;
        this.d = completableSource;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        this.c.subscribe(new AutoDisposingObserverImpl(this.d, observer));
    }
}
