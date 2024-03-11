package io.reactivex;

import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.operators.maybe.MaybeCallbackObserver;
import io.reactivex.internal.operators.maybe.MaybeCreate;
import io.reactivex.internal.operators.maybe.MaybeDoFinally;
import io.reactivex.internal.operators.maybe.MaybeFlatten;
import io.reactivex.internal.operators.maybe.MaybeFromCallable;
import io.reactivex.internal.operators.maybe.MaybeJust;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public abstract class Maybe<T> implements MaybeSource<T> {
    protected abstract void subscribeActual(MaybeObserver<? super T> maybeObserver);

    public static <T> Maybe<T> create(MaybeOnSubscribe<T> maybeOnSubscribe) {
        ObjectHelper.requireNonNull(maybeOnSubscribe, "onSubscribe is null");
        return RxJavaPlugins.onAssembly(new MaybeCreate(maybeOnSubscribe));
    }

    public static <T> Maybe<T> fromCallable(Callable<? extends T> callable) {
        ObjectHelper.requireNonNull(callable, "callable is null");
        return RxJavaPlugins.onAssembly(new MaybeFromCallable(callable));
    }

    public static <T> Maybe<T> just(T t) {
        ObjectHelper.requireNonNull(t, "item is null");
        return RxJavaPlugins.onAssembly(new MaybeJust(t));
    }

    public final <R> R as(MaybeConverter<T, ? extends R> maybeConverter) {
        return (R) ((MaybeConverter) ObjectHelper.requireNonNull(maybeConverter, "converter is null")).apply(this);
    }

    public final Maybe<T> doFinally(Action action) {
        ObjectHelper.requireNonNull(action, "onFinally is null");
        return RxJavaPlugins.onAssembly(new MaybeDoFinally(this, action));
    }

    public final <R> Maybe<R> flatMap(Function<? super T, ? extends MaybeSource<? extends R>> function) {
        ObjectHelper.requireNonNull(function, "mapper is null");
        return RxJavaPlugins.onAssembly(new MaybeFlatten(this, function));
    }

    public final Disposable subscribe() {
        return subscribe(Functions.emptyConsumer(), Functions.ON_ERROR_MISSING, Functions.EMPTY_ACTION);
    }

    public final Disposable subscribe(Consumer<? super T> consumer) {
        return subscribe(consumer, Functions.ON_ERROR_MISSING, Functions.EMPTY_ACTION);
    }

    public final Disposable subscribe(Consumer<? super T> consumer, Consumer<? super Throwable> consumer2) {
        return subscribe(consumer, consumer2, Functions.EMPTY_ACTION);
    }

    public final Disposable subscribe(Consumer<? super T> consumer, Consumer<? super Throwable> consumer2, Action action) {
        ObjectHelper.requireNonNull(consumer, "onSuccess is null");
        ObjectHelper.requireNonNull(consumer2, "onError is null");
        ObjectHelper.requireNonNull(action, "onComplete is null");
        return (Disposable) subscribeWith(new MaybeCallbackObserver(consumer, consumer2, action));
    }

    @Override // io.reactivex.MaybeSource
    public final void subscribe(MaybeObserver<? super T> maybeObserver) {
        ObjectHelper.requireNonNull(maybeObserver, "observer is null");
        MaybeObserver<? super T> onSubscribe = RxJavaPlugins.onSubscribe(this, maybeObserver);
        ObjectHelper.requireNonNull(onSubscribe, "The RxJavaPlugins.onSubscribe hook returned a null MaybeObserver. Please check the handler provided to RxJavaPlugins.setOnMaybeSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
        try {
            subscribeActual(onSubscribe);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            Exceptions.throwIfFatal(th);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    public final <E extends MaybeObserver<? super T>> E subscribeWith(E e) {
        subscribe(e);
        return e;
    }
}
