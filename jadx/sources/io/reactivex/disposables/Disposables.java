package io.reactivex.disposables;

import io.reactivex.functions.Action;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.functions.ObjectHelper;

/* loaded from: classes5.dex */
public final class Disposables {
    public static Disposable fromRunnable(Runnable runnable) {
        ObjectHelper.requireNonNull(runnable, "run is null");
        return new RunnableDisposable(runnable);
    }

    public static Disposable fromAction(Action action) {
        ObjectHelper.requireNonNull(action, "run is null");
        return new ActionDisposable(action);
    }

    public static Disposable empty() {
        return fromRunnable(Functions.EMPTY_RUNNABLE);
    }

    public static Disposable disposed() {
        return EmptyDisposable.INSTANCE;
    }
}
