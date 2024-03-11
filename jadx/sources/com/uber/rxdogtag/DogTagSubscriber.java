package com.uber.rxdogtag;

import com.uber.rxdogtag.RxDogTag;
import io.reactivex.FlowableSubscriber;
import io.reactivex.observers.LambdaConsumerIntrospection;
import java.util.Objects;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class DogTagSubscriber<T> implements FlowableSubscriber<T>, LambdaConsumerIntrospection {
    private final RxDogTag.Configuration config;
    private final Subscriber<T> delegate;
    private final Throwable t = new Throwable();

    /* JADX INFO: Access modifiers changed from: package-private */
    public DogTagSubscriber(RxDogTag.Configuration configuration, Subscriber<T> subscriber) {
        this.config = configuration;
        this.delegate = subscriber;
    }

    @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
    public void onSubscribe(final Subscription subscription) {
        if (this.config.guardObserverCallbacks) {
            RxDogTag.guardedDelegateCall(new RxDogTag.NonCheckingConsumer() { // from class: com.uber.rxdogtag.DogTagSubscriber$$ExternalSyntheticLambda0
                @Override // com.uber.rxdogtag.RxDogTag.NonCheckingConsumer
                public final void accept(Object obj) {
                    DogTagSubscriber.this.lambda$onSubscribe$0((Throwable) obj);
                }
            }, new Runnable() { // from class: com.uber.rxdogtag.DogTagSubscriber$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    DogTagSubscriber.this.lambda$onSubscribe$1(subscription);
                }
            });
        } else {
            this.delegate.onSubscribe(subscription);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onSubscribe$0(Throwable th) {
        RxDogTag.reportError(this.config, this.t, th, "onSubscribe");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onSubscribe$1(Subscription subscription) {
        this.delegate.onSubscribe(subscription);
    }

    @Override // org.reactivestreams.Subscriber
    public void onNext(final T t) {
        if (this.config.guardObserverCallbacks) {
            RxDogTag.guardedDelegateCall(new RxDogTag.NonCheckingConsumer() { // from class: com.uber.rxdogtag.DogTagSubscriber$$ExternalSyntheticLambda4
                @Override // com.uber.rxdogtag.RxDogTag.NonCheckingConsumer
                public final void accept(Object obj) {
                    DogTagSubscriber.this.lambda$onNext$2((Throwable) obj);
                }
            }, new Runnable() { // from class: com.uber.rxdogtag.DogTagSubscriber$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    DogTagSubscriber.this.lambda$onNext$3(t);
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

    @Override // org.reactivestreams.Subscriber
    public void onError(final Throwable th) {
        Subscriber<T> subscriber = this.delegate;
        if (subscriber instanceof RxDogTagErrorReceiver) {
            if (subscriber instanceof RxDogTagTaggedExceptionReceiver) {
                subscriber.onError(RxDogTag.createException(this.config, this.t, th, null));
                return;
            } else if (this.config.guardObserverCallbacks) {
                RxDogTag.guardedDelegateCall(new RxDogTag.NonCheckingConsumer() { // from class: com.uber.rxdogtag.DogTagSubscriber$$ExternalSyntheticLambda6
                    @Override // com.uber.rxdogtag.RxDogTag.NonCheckingConsumer
                    public final void accept(Object obj) {
                        DogTagSubscriber.this.lambda$onError$4((Throwable) obj);
                    }
                }, new Runnable() { // from class: com.uber.rxdogtag.DogTagSubscriber$$ExternalSyntheticLambda7
                    @Override // java.lang.Runnable
                    public final void run() {
                        DogTagSubscriber.this.lambda$onError$5(th);
                    }
                });
                return;
            } else {
                subscriber.onError(th);
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

    @Override // org.reactivestreams.Subscriber
    public void onComplete() {
        if (this.config.guardObserverCallbacks) {
            RxDogTag.NonCheckingConsumer nonCheckingConsumer = new RxDogTag.NonCheckingConsumer() { // from class: com.uber.rxdogtag.DogTagSubscriber$$ExternalSyntheticLambda2
                @Override // com.uber.rxdogtag.RxDogTag.NonCheckingConsumer
                public final void accept(Object obj) {
                    DogTagSubscriber.this.lambda$onComplete$6((Throwable) obj);
                }
            };
            final Subscriber<T> subscriber = this.delegate;
            Objects.requireNonNull(subscriber);
            RxDogTag.guardedDelegateCall(nonCheckingConsumer, new Runnable() { // from class: com.uber.rxdogtag.DogTagSubscriber$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    Subscriber.this.onComplete();
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
        Subscriber<T> subscriber = this.delegate;
        return (subscriber instanceof LambdaConsumerIntrospection) && ((LambdaConsumerIntrospection) subscriber).hasCustomOnError();
    }
}
