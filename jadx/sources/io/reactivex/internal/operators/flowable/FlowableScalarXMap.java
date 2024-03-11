package io.reactivex.internal.operators.flowable;

import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.ScalarSubscription;
import java.util.concurrent.Callable;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;

/* loaded from: classes5.dex */
public final class FlowableScalarXMap {
    public static <T, R> boolean tryScalarXMapSubscribe(Publisher<T> publisher, Subscriber<? super R> subscriber, Function<? super T, ? extends Publisher<? extends R>> function) {
        if (publisher instanceof Callable) {
            try {
                Object obj = (Object) ((Callable) publisher).call();
                if (obj == 0) {
                    EmptySubscription.complete(subscriber);
                    return true;
                }
                try {
                    Publisher publisher2 = (Publisher) ObjectHelper.requireNonNull(function.apply(obj), "The mapper returned a null Publisher");
                    if (publisher2 instanceof Callable) {
                        try {
                            Object call = ((Callable) publisher2).call();
                            if (call == null) {
                                EmptySubscription.complete(subscriber);
                                return true;
                            }
                            subscriber.onSubscribe(new ScalarSubscription(subscriber, call));
                        } catch (Throwable th) {
                            Exceptions.throwIfFatal(th);
                            EmptySubscription.error(th, subscriber);
                            return true;
                        }
                    } else {
                        publisher2.subscribe(subscriber);
                    }
                    return true;
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    EmptySubscription.error(th2, subscriber);
                    return true;
                }
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                EmptySubscription.error(th3, subscriber);
                return true;
            }
        }
        return false;
    }
}
