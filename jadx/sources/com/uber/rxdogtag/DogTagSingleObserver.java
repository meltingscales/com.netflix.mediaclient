package com.uber.rxdogtag;

import com.uber.rxdogtag.RxDogTag;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.observers.LambdaConsumerIntrospection;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class DogTagSingleObserver<T> implements SingleObserver<T>, LambdaConsumerIntrospection {
    private final RxDogTag.Configuration config;
    private final SingleObserver<T> delegate;
    private final Throwable t = new Throwable();

    /* JADX INFO: Access modifiers changed from: package-private */
    public DogTagSingleObserver(RxDogTag.Configuration configuration, SingleObserver<T> singleObserver) {
        this.config = configuration;
        this.delegate = singleObserver;
    }

    @Override // io.reactivex.SingleObserver
    public void onSubscribe(final Disposable disposable) {
        if (this.config.guardObserverCallbacks) {
            RxDogTag.guardedDelegateCall(new RxDogTag.NonCheckingConsumer() { // from class: com.uber.rxdogtag.DogTagSingleObserver$$ExternalSyntheticLambda4
                @Override // com.uber.rxdogtag.RxDogTag.NonCheckingConsumer
                public final void accept(Object obj) {
                    DogTagSingleObserver.this.lambda$onSubscribe$0((Throwable) obj);
                }
            }, new Runnable() { // from class: com.uber.rxdogtag.DogTagSingleObserver$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    DogTagSingleObserver.this.lambda$onSubscribe$1(disposable);
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

    @Override // io.reactivex.SingleObserver
    public void onSuccess(final T t) {
        if (this.config.guardObserverCallbacks) {
            RxDogTag.guardedDelegateCall(new RxDogTag.NonCheckingConsumer() { // from class: com.uber.rxdogtag.DogTagSingleObserver$$ExternalSyntheticLambda2
                @Override // com.uber.rxdogtag.RxDogTag.NonCheckingConsumer
                public final void accept(Object obj) {
                    DogTagSingleObserver.this.lambda$onSuccess$2((Throwable) obj);
                }
            }, new Runnable() { // from class: com.uber.rxdogtag.DogTagSingleObserver$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    DogTagSingleObserver.this.lambda$onSuccess$3(t);
                }
            });
        } else {
            this.delegate.onSuccess(t);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onSuccess$2(Throwable th) {
        RxDogTag.reportError(this.config, this.t, th, "onSuccess");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onSuccess$3(Object obj) {
        this.delegate.onSuccess(obj);
    }

    @Override // io.reactivex.SingleObserver
    public void onError(final Throwable th) {
        SingleObserver<T> singleObserver = this.delegate;
        if (singleObserver instanceof RxDogTagErrorReceiver) {
            if (singleObserver instanceof RxDogTagTaggedExceptionReceiver) {
                singleObserver.onError(RxDogTag.createException(this.config, this.t, th, null));
                return;
            } else if (this.config.guardObserverCallbacks) {
                RxDogTag.guardedDelegateCall(new RxDogTag.NonCheckingConsumer() { // from class: com.uber.rxdogtag.DogTagSingleObserver$$ExternalSyntheticLambda0
                    @Override // com.uber.rxdogtag.RxDogTag.NonCheckingConsumer
                    public final void accept(Object obj) {
                        DogTagSingleObserver.this.lambda$onError$4((Throwable) obj);
                    }
                }, new Runnable() { // from class: com.uber.rxdogtag.DogTagSingleObserver$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        DogTagSingleObserver.this.lambda$onError$5(th);
                    }
                });
                return;
            } else {
                singleObserver.onError(th);
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

    @Override // io.reactivex.observers.LambdaConsumerIntrospection
    public boolean hasCustomOnError() {
        SingleObserver<T> singleObserver = this.delegate;
        return (singleObserver instanceof LambdaConsumerIntrospection) && ((LambdaConsumerIntrospection) singleObserver).hasCustomOnError();
    }
}
