package o;

import java.util.concurrent.Executor;

/* renamed from: o.bml  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class ExecutorC4803bml implements Executor {
    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        if (runnable != null) {
            runnable.run();
        }
    }
}
