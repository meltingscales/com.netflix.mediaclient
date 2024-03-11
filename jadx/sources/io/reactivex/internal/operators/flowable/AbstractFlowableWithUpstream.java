package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.internal.functions.ObjectHelper;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public abstract class AbstractFlowableWithUpstream<T, R> extends Flowable<R> {
    protected final Flowable<T> source;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractFlowableWithUpstream(Flowable<T> flowable) {
        this.source = (Flowable) ObjectHelper.requireNonNull(flowable, "source is null");
    }
}
