package com.uber.autodispose;

import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;

/* loaded from: classes.dex */
public interface CompletableSubscribeProxy {
    Disposable b();

    Disposable e(Action action);
}
