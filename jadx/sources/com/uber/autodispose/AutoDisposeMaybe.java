package com.uber.autodispose;

import io.reactivex.CompletableSource;
import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;

/* loaded from: classes6.dex */
final class AutoDisposeMaybe<T> extends Maybe<T> {
    private final CompletableSource a;
    private final MaybeSource<T> b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoDisposeMaybe(MaybeSource<T> maybeSource, CompletableSource completableSource) {
        this.b = maybeSource;
        this.a = completableSource;
    }

    @Override // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver<? super T> maybeObserver) {
        this.b.subscribe(new AutoDisposingMaybeObserverImpl(this.a, maybeObserver));
    }
}
