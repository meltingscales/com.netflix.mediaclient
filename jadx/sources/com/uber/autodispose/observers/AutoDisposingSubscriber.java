package com.uber.autodispose.observers;

import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes5.dex */
public interface AutoDisposingSubscriber<T> extends FlowableSubscriber<T>, Subscription, Disposable {
    Subscriber<? super T> b();
}
