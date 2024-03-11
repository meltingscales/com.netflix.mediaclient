package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;

/* loaded from: classes5.dex */
abstract class AbstractObservableWithUpstream<T, U> extends Observable<U> {
    protected final ObservableSource<T> source;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractObservableWithUpstream(ObservableSource<T> observableSource) {
        this.source = observableSource;
    }
}
