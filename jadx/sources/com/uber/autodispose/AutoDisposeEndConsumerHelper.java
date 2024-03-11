package com.uber.autodispose;

import androidx.compose.animation.core.MutatorMutex$$ExternalSyntheticBackportWithForwarding0;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.ProtocolViolationException;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
final class AutoDisposeEndConsumerHelper {
    public static boolean a(AtomicReference<Disposable> atomicReference, Disposable disposable, Class<?> cls) {
        AutoDisposeUtil.c(disposable, "next is null");
        if (MutatorMutex$$ExternalSyntheticBackportWithForwarding0.m(atomicReference, null, disposable)) {
            return true;
        }
        disposable.dispose();
        if (atomicReference.get() != AutoDisposableHelper.DISPOSED) {
            b(cls);
            return false;
        }
        return false;
    }

    public static String d(String str) {
        return "It is not allowed to subscribe with a(n) " + str + " multiple times. Please create a fresh instance of " + str + " and subscribe that to the target source instead.";
    }

    public static void b(Class<?> cls) {
        RxJavaPlugins.onError(new ProtocolViolationException(d(cls.getName())));
    }
}
