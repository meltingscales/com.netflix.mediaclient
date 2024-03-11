package com.uber.autodispose.lifecycle;

import io.reactivex.functions.Function;

/* loaded from: classes5.dex */
public interface CorrespondingEventsFunction<E> extends Function<E, E> {
    @Override // io.reactivex.functions.Function
    E apply(E e);
}
