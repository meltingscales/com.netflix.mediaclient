package com.uber.autodispose.android.internal;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public abstract class MainThreadDisposable implements Disposable {
    private final AtomicBoolean e = new AtomicBoolean();

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void b();

    @Override // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.e.get();
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        if (this.e.compareAndSet(false, true)) {
            if (AutoDisposeAndroidUtil.d()) {
                b();
            } else {
                AndroidSchedulers.mainThread().scheduleDirect(new Runnable() { // from class: com.uber.autodispose.android.internal.MainThreadDisposable$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        MainThreadDisposable.this.b();
                    }
                });
            }
        }
    }
}
