package com.uber.rxdogtag;

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

/* loaded from: classes.dex */
public interface ObserverHandler {
    default CompletableObserver handle(Completable completable, CompletableObserver completableObserver) {
        return completableObserver;
    }

    default MaybeObserver handle(Maybe maybe, MaybeObserver maybeObserver) {
        return maybeObserver;
    }

    default Observer handle(Observable observable, Observer observer) {
        return observer;
    }

    default SingleObserver handle(Single single, SingleObserver singleObserver) {
        return singleObserver;
    }

    default Subscriber handle(Flowable flowable, Subscriber subscriber) {
        return subscriber;
    }
}
