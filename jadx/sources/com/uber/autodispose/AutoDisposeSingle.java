package com.uber.autodispose;

import io.reactivex.CompletableSource;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;

/* loaded from: classes5.dex */
final class AutoDisposeSingle<T> extends Single<T> {
    private final CompletableSource a;
    private final SingleSource<T> d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoDisposeSingle(SingleSource<T> singleSource, CompletableSource completableSource) {
        this.d = singleSource;
        this.a = completableSource;
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super T> singleObserver) {
        this.d.subscribe(new AutoDisposingSingleObserverImpl(this.a, singleObserver));
    }
}
