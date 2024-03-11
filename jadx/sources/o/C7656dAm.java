package o;

import java.util.Collection;
import java.util.List;
import java.util.ServiceLoader;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* renamed from: o.dAm  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7656dAm {
    private static final Collection<CoroutineExceptionHandler> d;

    public static final Collection<CoroutineExceptionHandler> b() {
        return d;
    }

    static {
        dtQ b;
        List q;
        b = dtY.b(ServiceLoader.load(CoroutineExceptionHandler.class, CoroutineExceptionHandler.class.getClassLoader()).iterator());
        q = C8670due.q(b);
        d = q;
    }

    public static final void c(Throwable th) {
        Thread currentThread = Thread.currentThread();
        currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
    }
}
