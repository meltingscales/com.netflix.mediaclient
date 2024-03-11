package o;

import java.util.concurrent.Executor;
import kotlin.coroutines.EmptyCoroutineContext;

/* renamed from: o.dxg  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class ExecutorC8753dxg implements Executor {
    public final dwQ b;

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        dwQ dwq = this.b;
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.e;
        if (dwq.isDispatchNeeded(emptyCoroutineContext)) {
            this.b.dispatch(emptyCoroutineContext, runnable);
        } else {
            runnable.run();
        }
    }

    public String toString() {
        return this.b.toString();
    }
}
