package io.reactivex.internal.operators.single;

import io.reactivex.SingleSource;
import io.reactivex.functions.Function;
import org.reactivestreams.Publisher;

/* loaded from: classes5.dex */
public final class SingleInternalHelper {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public enum ToFlowable implements Function<SingleSource, Publisher> {
        INSTANCE;

        @Override // io.reactivex.functions.Function
        public Publisher apply(SingleSource singleSource) {
            return new SingleToFlowable(singleSource);
        }
    }

    public static <T> Function<SingleSource<? extends T>, Publisher<? extends T>> toFlowable() {
        return ToFlowable.INSTANCE;
    }
}
