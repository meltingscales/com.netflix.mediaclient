package o;

import java.util.concurrent.Executor;
import kotlin.coroutines.EmptyCoroutineContext;

/* renamed from: o.dBi  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class ExecutorC7679dBi extends AbstractC8766dxt implements Executor {
    public static final ExecutorC7679dBi b = new ExecutorC7679dBi();
    private static final dwQ c;

    @Override // o.dwQ
    public String toString() {
        return "Dispatchers.IO";
    }

    private ExecutorC7679dBi() {
    }

    static {
        int b2;
        int c2;
        C7691dBu c7691dBu = C7691dBu.e;
        b2 = C8657dts.b(64, dAL.d());
        c2 = dAI.c("kotlinx.coroutines.io.parallelism", b2, 0, 0, 12, null);
        c = c7691dBu.limitedParallelism(c2);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        dispatch(EmptyCoroutineContext.e, runnable);
    }

    @Override // o.dwQ
    public dwQ limitedParallelism(int i) {
        return C7691dBu.e.limitedParallelism(i);
    }

    @Override // o.dwQ
    public void dispatch(dqZ dqz, Runnable runnable) {
        c.dispatch(dqz, runnable);
    }

    @Override // o.dwQ
    public void dispatchYield(dqZ dqz, Runnable runnable) {
        c.dispatchYield(dqz, runnable);
    }

    @Override // o.AbstractC8766dxt, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO".toString());
    }
}
