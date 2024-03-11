package io.reactivex.internal.operators.flowable;

import io.reactivex.functions.Consumer;
import org.reactivestreams.Subscription;

/* loaded from: classes5.dex */
public final class FlowableInternalHelper {

    /* loaded from: classes5.dex */
    public enum RequestMax implements Consumer<Subscription> {
        INSTANCE;

        @Override // io.reactivex.functions.Consumer
        public void accept(Subscription subscription) {
            subscription.request(Long.MAX_VALUE);
        }
    }
}
