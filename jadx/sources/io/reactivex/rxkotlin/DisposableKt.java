package io.reactivex.rxkotlin;

import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import o.C8632dsu;

/* loaded from: classes5.dex */
public final class DisposableKt {
    public static final void plusAssign(CompositeDisposable compositeDisposable, Disposable disposable) {
        C8632dsu.d(compositeDisposable, "");
        C8632dsu.d(disposable, "");
        compositeDisposable.add(disposable);
    }

    public static final Disposable addTo(Disposable disposable, CompositeDisposable compositeDisposable) {
        C8632dsu.d(disposable, "");
        C8632dsu.d(compositeDisposable, "");
        compositeDisposable.add(disposable);
        return disposable;
    }
}
