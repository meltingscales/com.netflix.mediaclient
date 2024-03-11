package com.uber.autodispose;

import io.reactivex.CompletableConverter;
import io.reactivex.MaybeConverter;
import io.reactivex.ObservableConverter;
import io.reactivex.SingleConverter;

/* loaded from: classes5.dex */
public interface AutoDisposeConverter<T> extends ObservableConverter<T, ObservableSubscribeProxy<T>>, MaybeConverter<T, MaybeSubscribeProxy<T>>, SingleConverter<T, SingleSubscribeProxy<T>>, CompletableConverter<CompletableSubscribeProxy> {
}
