package io.reactivex;

/* loaded from: classes6.dex */
public interface MaybeEmitter<T> {
    void onComplete();

    void onError(Throwable th);

    void onSuccess(T t);
}
