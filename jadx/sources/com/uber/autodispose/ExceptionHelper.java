package com.uber.autodispose;

import androidx.compose.animation.core.MutatorMutex$$ExternalSyntheticBackportWithForwarding0;
import io.reactivex.exceptions.CompositeException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
final class ExceptionHelper {
    private static final Throwable b = new Termination();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean d(AtomicReference<Throwable> atomicReference, Throwable th) {
        Throwable th2;
        do {
            th2 = atomicReference.get();
            if (th2 == b) {
                return false;
            }
        } while (!MutatorMutex$$ExternalSyntheticBackportWithForwarding0.m(atomicReference, th2, th2 == null ? th : new CompositeException(th2, th)));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Throwable a(AtomicReference<Throwable> atomicReference) {
        Throwable th = atomicReference.get();
        Throwable th2 = b;
        return th != th2 ? atomicReference.getAndSet(th2) : th;
    }

    /* loaded from: classes5.dex */
    static final class Termination extends Throwable {
        Termination() {
            super("No further exceptions");
        }

        @Override // java.lang.Throwable
        public Throwable fillInStackTrace() {
            synchronized (this) {
            }
            return this;
        }
    }
}
