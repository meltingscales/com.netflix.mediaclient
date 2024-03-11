package com.uber.autodispose;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;

/* loaded from: classes5.dex */
final class AutoDisposeCompletable extends Completable {
    private final Completable b;
    private final CompletableSource e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoDisposeCompletable(Completable completable, CompletableSource completableSource) {
        this.b = completable;
        this.e = completableSource;
    }

    @Override // io.reactivex.Completable
    public void subscribeActual(CompletableObserver completableObserver) {
        this.b.subscribe(new AutoDisposingCompletableObserverImpl(this.e, completableObserver));
    }
}
