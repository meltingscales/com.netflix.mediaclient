package com.uber.autodispose;

import io.reactivex.Observer;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes5.dex */
final class HalfSerializer {
    /* JADX WARN: Multi-variable type inference failed */
    public static <T> boolean a(Observer<? super T> observer, T t, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        if (atomicInteger.get() == 0 && atomicInteger.compareAndSet(0, 1)) {
            observer.onNext(t);
            if (atomicInteger.decrementAndGet() != 0) {
                Throwable d = atomicThrowable.d();
                if (d != null) {
                    observer.onError(d);
                } else {
                    observer.onComplete();
                }
                return true;
            }
        }
        return false;
    }

    public static void b(Observer<?> observer, Throwable th, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        if (atomicThrowable.a(th)) {
            if (atomicInteger.getAndIncrement() == 0) {
                observer.onError(atomicThrowable.d());
                return;
            }
            return;
        }
        RxJavaPlugins.onError(th);
    }

    public static void b(Observer<?> observer, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        if (atomicInteger.getAndIncrement() == 0) {
            Throwable d = atomicThrowable.d();
            if (d != null) {
                observer.onError(d);
            } else {
                observer.onComplete();
            }
        }
    }
}
