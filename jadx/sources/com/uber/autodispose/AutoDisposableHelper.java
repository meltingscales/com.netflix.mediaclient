package com.uber.autodispose;

import io.reactivex.disposables.Disposable;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
enum AutoDisposableHelper implements Disposable {
    DISPOSED;

    @Override // io.reactivex.disposables.Disposable
    public void dispose() {
    }

    @Override // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(AtomicReference<Disposable> atomicReference) {
        Disposable andSet;
        Disposable disposable = atomicReference.get();
        AutoDisposableHelper autoDisposableHelper = DISPOSED;
        if (disposable == autoDisposableHelper || (andSet = atomicReference.getAndSet(autoDisposableHelper)) == autoDisposableHelper) {
            return false;
        }
        if (andSet != null) {
            andSet.dispose();
            return true;
        }
        return true;
    }
}
