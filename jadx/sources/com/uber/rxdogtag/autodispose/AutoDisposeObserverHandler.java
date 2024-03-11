package com.uber.rxdogtag.autodispose;

import com.uber.autodispose.observers.AutoDisposingCompletableObserver;
import com.uber.autodispose.observers.AutoDisposingMaybeObserver;
import com.uber.autodispose.observers.AutoDisposingObserver;
import com.uber.autodispose.observers.AutoDisposingSingleObserver;
import com.uber.autodispose.observers.AutoDisposingSubscriber;
import com.uber.rxdogtag.ObserverHandler;
import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.Flowable;
import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import org.reactivestreams.Subscriber;

/* loaded from: classes5.dex */
final class AutoDisposeObserverHandler implements ObserverHandler {
    static final AutoDisposeObserverHandler INSTANCE = new AutoDisposeObserverHandler();

    public String toString() {
        return "AutoDisposeObserverHandler";
    }

    private AutoDisposeObserverHandler() {
    }

    @Override // com.uber.rxdogtag.ObserverHandler
    public Subscriber handle(Flowable flowable, Subscriber subscriber) {
        return subscriber instanceof AutoDisposingSubscriber ? ((AutoDisposingSubscriber) subscriber).b() : subscriber;
    }

    @Override // com.uber.rxdogtag.ObserverHandler
    public Observer handle(Observable observable, Observer observer) {
        return observer instanceof AutoDisposingObserver ? ((AutoDisposingObserver) observer).a() : observer;
    }

    @Override // com.uber.rxdogtag.ObserverHandler
    public MaybeObserver handle(Maybe maybe, MaybeObserver maybeObserver) {
        return maybeObserver instanceof AutoDisposingMaybeObserver ? ((AutoDisposingMaybeObserver) maybeObserver).e() : maybeObserver;
    }

    @Override // com.uber.rxdogtag.ObserverHandler
    public SingleObserver handle(Single single, SingleObserver singleObserver) {
        return singleObserver instanceof AutoDisposingSingleObserver ? ((AutoDisposingSingleObserver) singleObserver).a() : singleObserver;
    }

    @Override // com.uber.rxdogtag.ObserverHandler
    public CompletableObserver handle(Completable completable, CompletableObserver completableObserver) {
        return completableObserver instanceof AutoDisposingCompletableObserver ? ((AutoDisposingCompletableObserver) completableObserver).a() : completableObserver;
    }
}
