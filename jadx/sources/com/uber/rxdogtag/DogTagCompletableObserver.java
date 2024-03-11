package com.uber.rxdogtag;

import com.uber.rxdogtag.RxDogTag;
import io.reactivex.CompletableObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.observers.LambdaConsumerIntrospection;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class DogTagCompletableObserver implements CompletableObserver, LambdaConsumerIntrospection {
    private final RxDogTag.Configuration config;
    private final CompletableObserver delegate;
    private final Throwable t = new Throwable();

    /* JADX INFO: Access modifiers changed from: package-private */
    public DogTagCompletableObserver(RxDogTag.Configuration configuration, CompletableObserver completableObserver) {
        this.config = configuration;
        this.delegate = completableObserver;
    }

    @Override // io.reactivex.CompletableObserver
    public void onSubscribe(final Disposable disposable) {
        if (this.config.guardObserverCallbacks) {
            RxDogTag.guardedDelegateCall(new RxDogTag.NonCheckingConsumer() { // from class: com.uber.rxdogtag.DogTagCompletableObserver$$ExternalSyntheticLambda4
                @Override // com.uber.rxdogtag.RxDogTag.NonCheckingConsumer
                public final void accept(Object obj) {
                    DogTagCompletableObserver.this.lambda$onSubscribe$0((Throwable) obj);
                }
            }, new Runnable() { // from class: com.uber.rxdogtag.DogTagCompletableObserver$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    DogTagCompletableObserver.this.lambda$onSubscribe$1(disposable);
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

    @Override // io.reactivex.CompletableObserver
    public void onError(final Throwable th) {
        CompletableObserver completableObserver = this.delegate;
        if (completableObserver instanceof RxDogTagErrorReceiver) {
            if (completableObserver instanceof RxDogTagTaggedExceptionReceiver) {
                completableObserver.onError(RxDogTag.createException(this.config, this.t, th, null));
                return;
            } else if (this.config.guardObserverCallbacks) {
                RxDogTag.guardedDelegateCall(new RxDogTag.NonCheckingConsumer() { // from class: com.uber.rxdogtag.DogTagCompletableObserver$$ExternalSyntheticLambda0
                    @Override // com.uber.rxdogtag.RxDogTag.NonCheckingConsumer
                    public final void accept(Object obj) {
                        DogTagCompletableObserver.this.lambda$onError$2((Throwable) obj);
                    }
                }, new Runnable() { // from class: com.uber.rxdogtag.DogTagCompletableObserver$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        DogTagCompletableObserver.this.lambda$onError$3(th);
                    }
                });
                return;
            } else {
                completableObserver.onError(th);
                return;
            }
        }
        RxDogTag.reportError(this.config, this.t, th, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onError$2(Throwable th) {
        RxDogTag.reportError(this.config, this.t, th, "onError");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onError$3(Throwable th) {
        this.delegate.onError(th);
    }

    @Override // io.reactivex.CompletableObserver
    public void onComplete() {
        if (this.config.guardObserverCallbacks) {
            RxDogTag.NonCheckingConsumer nonCheckingConsumer = new RxDogTag.NonCheckingConsumer() { // from class: com.uber.rxdogtag.DogTagCompletableObserver$$ExternalSyntheticLambda2
                @Override // com.uber.rxdogtag.RxDogTag.NonCheckingConsumer
                public final void accept(Object obj) {
                    DogTagCompletableObserver.this.lambda$onComplete$4((Throwable) obj);
                }
            };
            final CompletableObserver completableObserver = this.delegate;
            Objects.requireNonNull(completableObserver);
            RxDogTag.guardedDelegateCall(nonCheckingConsumer, new Runnable() { // from class: com.uber.rxdogtag.DogTagCompletableObserver$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    CompletableObserver.this.onComplete();
                }
            });
            return;
        }
        this.delegate.onComplete();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onComplete$4(Throwable th) {
        RxDogTag.reportError(this.config, this.t, th, "onComplete");
    }

    @Override // io.reactivex.observers.LambdaConsumerIntrospection
    public boolean hasCustomOnError() {
        CompletableObserver completableObserver = this.delegate;
        return (completableObserver instanceof LambdaConsumerIntrospection) && ((LambdaConsumerIntrospection) completableObserver).hasCustomOnError();
    }
}
