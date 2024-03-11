package com.uber.rxdogtag;

import com.uber.rxdogtag.RxDogTag;
import io.reactivex.MaybeObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.observers.LambdaConsumerIntrospection;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class DogTagMaybeObserver<T> implements MaybeObserver<T>, LambdaConsumerIntrospection {
    private final RxDogTag.Configuration config;
    private final MaybeObserver<T> delegate;
    private final Throwable t = new Throwable();

    /* JADX INFO: Access modifiers changed from: package-private */
    public DogTagMaybeObserver(RxDogTag.Configuration configuration, MaybeObserver<T> maybeObserver) {
        this.config = configuration;
        this.delegate = maybeObserver;
    }

    @Override // io.reactivex.MaybeObserver
    public void onSubscribe(final Disposable disposable) {
        if (this.config.guardObserverCallbacks) {
            RxDogTag.guardedDelegateCall(new RxDogTag.NonCheckingConsumer() { // from class: com.uber.rxdogtag.DogTagMaybeObserver$$ExternalSyntheticLambda0
                @Override // com.uber.rxdogtag.RxDogTag.NonCheckingConsumer
                public final void accept(Object obj) {
                    DogTagMaybeObserver.this.lambda$onSubscribe$0((Throwable) obj);
                }
            }, new Runnable() { // from class: com.uber.rxdogtag.DogTagMaybeObserver$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    DogTagMaybeObserver.this.lambda$onSubscribe$1(disposable);
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

    @Override // io.reactivex.MaybeObserver
    public void onSuccess(final T t) {
        if (this.config.guardObserverCallbacks) {
            RxDogTag.guardedDelegateCall(new RxDogTag.NonCheckingConsumer() { // from class: com.uber.rxdogtag.DogTagMaybeObserver$$ExternalSyntheticLambda4
                @Override // com.uber.rxdogtag.RxDogTag.NonCheckingConsumer
                public final void accept(Object obj) {
                    DogTagMaybeObserver.this.lambda$onSuccess$2((Throwable) obj);
                }
            }, new Runnable() { // from class: com.uber.rxdogtag.DogTagMaybeObserver$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    DogTagMaybeObserver.this.lambda$onSuccess$3(t);
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

    @Override // io.reactivex.MaybeObserver
    public void onError(final Throwable th) {
        MaybeObserver<T> maybeObserver = this.delegate;
        if (maybeObserver instanceof RxDogTagErrorReceiver) {
            if (maybeObserver instanceof RxDogTagTaggedExceptionReceiver) {
                maybeObserver.onError(RxDogTag.createException(this.config, this.t, th, null));
                return;
            } else if (this.config.guardObserverCallbacks) {
                RxDogTag.guardedDelegateCall(new RxDogTag.NonCheckingConsumer() { // from class: com.uber.rxdogtag.DogTagMaybeObserver$$ExternalSyntheticLambda2
                    @Override // com.uber.rxdogtag.RxDogTag.NonCheckingConsumer
                    public final void accept(Object obj) {
                        DogTagMaybeObserver.this.lambda$onError$4((Throwable) obj);
                    }
                }, new Runnable() { // from class: com.uber.rxdogtag.DogTagMaybeObserver$$ExternalSyntheticLambda3
                    @Override // java.lang.Runnable
                    public final void run() {
                        DogTagMaybeObserver.this.lambda$onError$5(th);
                    }
                });
                return;
            } else {
                maybeObserver.onError(th);
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

    @Override // io.reactivex.MaybeObserver
    public void onComplete() {
        if (this.config.guardObserverCallbacks) {
            RxDogTag.NonCheckingConsumer nonCheckingConsumer = new RxDogTag.NonCheckingConsumer() { // from class: com.uber.rxdogtag.DogTagMaybeObserver$$ExternalSyntheticLambda6
                @Override // com.uber.rxdogtag.RxDogTag.NonCheckingConsumer
                public final void accept(Object obj) {
                    DogTagMaybeObserver.this.lambda$onComplete$6((Throwable) obj);
                }
            };
            final MaybeObserver<T> maybeObserver = this.delegate;
            Objects.requireNonNull(maybeObserver);
            RxDogTag.guardedDelegateCall(nonCheckingConsumer, new Runnable() { // from class: com.uber.rxdogtag.DogTagMaybeObserver$$ExternalSyntheticLambda7
                @Override // java.lang.Runnable
                public final void run() {
                    MaybeObserver.this.onComplete();
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
        MaybeObserver<T> maybeObserver = this.delegate;
        return (maybeObserver instanceof LambdaConsumerIntrospection) && ((LambdaConsumerIntrospection) maybeObserver).hasCustomOnError();
    }
}
