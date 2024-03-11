package com.uber.rxdogtag;

import com.uber.rxdogtag.RxDogTag;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.observers.LambdaConsumerIntrospection;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class DogTagObserver<T> implements Observer<T>, LambdaConsumerIntrospection {
    private final RxDogTag.Configuration config;
    private final Observer<T> delegate;
    private final Throwable t = new Throwable();

    /* JADX INFO: Access modifiers changed from: package-private */
    public DogTagObserver(RxDogTag.Configuration configuration, Observer<T> observer) {
        this.config = configuration;
        this.delegate = observer;
    }

    @Override // io.reactivex.Observer
    public void onSubscribe(final Disposable disposable) {
        if (this.config.guardObserverCallbacks) {
            RxDogTag.guardedDelegateCall(new RxDogTag.NonCheckingConsumer() { // from class: com.uber.rxdogtag.DogTagObserver$$ExternalSyntheticLambda0
                @Override // com.uber.rxdogtag.RxDogTag.NonCheckingConsumer
                public final void accept(Object obj) {
                    DogTagObserver.this.lambda$onSubscribe$0((Throwable) obj);
                }
            }, new Runnable() { // from class: com.uber.rxdogtag.DogTagObserver$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    DogTagObserver.this.lambda$onSubscribe$1(disposable);
                }
            });
        } else {
            this.delegate.onSubscribe(disposable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onSubscribe$0(Throwable th) {
        RxDogTag.reportError(this.config, this.t, th, "onSubscribe");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onSubscribe$1(Disposable disposable) {
        this.delegate.onSubscribe(disposable);
    }

    @Override // io.reactivex.Observer
    public void onNext(final T t) {
        if (this.config.guardObserverCallbacks) {
            RxDogTag.guardedDelegateCall(new RxDogTag.NonCheckingConsumer() { // from class: com.uber.rxdogtag.DogTagObserver$$ExternalSyntheticLambda6
                @Override // com.uber.rxdogtag.RxDogTag.NonCheckingConsumer
                public final void accept(Object obj) {
                    DogTagObserver.this.lambda$onNext$2((Throwable) obj);
                }
            }, new Runnable() { // from class: com.uber.rxdogtag.DogTagObserver$$ExternalSyntheticLambda7
                @Override // java.lang.Runnable
                public final void run() {
                    DogTagObserver.this.lambda$onNext$3(t);
                }
            });
        } else {
            this.delegate.onNext(t);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onNext$2(Throwable th) {
        RxDogTag.reportError(this.config, this.t, th, "onNext");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onNext$3(Object obj) {
        this.delegate.onNext(obj);
    }

    @Override // io.reactivex.Observer
    public void onError(final Throwable th) {
        Observer<T> observer = this.delegate;
        if (observer instanceof RxDogTagErrorReceiver) {
            if (observer instanceof RxDogTagTaggedExceptionReceiver) {
                observer.onError(RxDogTag.createException(this.config, this.t, th, null));
                return;
            } else if (this.config.guardObserverCallbacks) {
                RxDogTag.guardedDelegateCall(new RxDogTag.NonCheckingConsumer() { // from class: com.uber.rxdogtag.DogTagObserver$$ExternalSyntheticLambda4
                    @Override // com.uber.rxdogtag.RxDogTag.NonCheckingConsumer
                    public final void accept(Object obj) {
                        DogTagObserver.this.lambda$onError$4((Throwable) obj);
                    }
                }, new Runnable() { // from class: com.uber.rxdogtag.DogTagObserver$$ExternalSyntheticLambda5
                    @Override // java.lang.Runnable
                    public final void run() {
                        DogTagObserver.this.lambda$onError$5(th);
                    }
                });
                return;
            } else {
                observer.onError(th);
                return;
            }
        }
        RxDogTag.reportError(this.config, this.t, th, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onError$4(Throwable th) {
        RxDogTag.reportError(this.config, this.t, th, "onError");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onError$5(Throwable th) {
        this.delegate.onError(th);
    }

    @Override // io.reactivex.Observer
    public void onComplete() {
        if (this.config.guardObserverCallbacks) {
            RxDogTag.NonCheckingConsumer nonCheckingConsumer = new RxDogTag.NonCheckingConsumer() { // from class: com.uber.rxdogtag.DogTagObserver$$ExternalSyntheticLambda2
                @Override // com.uber.rxdogtag.RxDogTag.NonCheckingConsumer
                public final void accept(Object obj) {
                    DogTagObserver.this.lambda$onComplete$6((Throwable) obj);
                }
            };
            final Observer<T> observer = this.delegate;
            Objects.requireNonNull(observer);
            RxDogTag.guardedDelegateCall(nonCheckingConsumer, new Runnable() { // from class: com.uber.rxdogtag.DogTagObserver$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    Observer.this.onComplete();
                }
            });
            return;
        }
        this.delegate.onComplete();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onComplete$6(Throwable th) {
        RxDogTag.reportError(this.config, this.t, th, "onComplete");
    }

    @Override // io.reactivex.observers.LambdaConsumerIntrospection
    public boolean hasCustomOnError() {
        Observer<T> observer = this.delegate;
        return (observer instanceof LambdaConsumerIntrospection) && ((LambdaConsumerIntrospection) observer).hasCustomOnError();
    }
}
