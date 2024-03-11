package androidx.room;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import o.C8632dsu;
import o.dpR;

/* loaded from: classes.dex */
public final class TransactionExecutor implements Executor {
    private Runnable active;
    private final Executor executor;
    private final Object syncLock;
    private final ArrayDeque<Runnable> tasks;

    public TransactionExecutor(Executor executor) {
        C8632dsu.c((Object) executor, "");
        this.executor = executor;
        this.tasks = new ArrayDeque<>();
        this.syncLock = new Object();
    }

    @Override // java.util.concurrent.Executor
    public void execute(final Runnable runnable) {
        C8632dsu.c((Object) runnable, "");
        synchronized (this.syncLock) {
            this.tasks.offer(new Runnable() { // from class: androidx.room.TransactionExecutor$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    TransactionExecutor.execute$lambda$1$lambda$0(runnable, this);
                }
            });
            if (this.active == null) {
                scheduleNext();
            }
            dpR dpr = dpR.c;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void execute$lambda$1$lambda$0(Runnable runnable, TransactionExecutor transactionExecutor) {
        C8632dsu.c((Object) runnable, "");
        C8632dsu.c((Object) transactionExecutor, "");
        try {
            runnable.run();
        } finally {
            transactionExecutor.scheduleNext();
        }
    }

    public final void scheduleNext() {
        synchronized (this.syncLock) {
            Runnable poll = this.tasks.poll();
            Runnable runnable = poll;
            this.active = runnable;
            if (poll != null) {
                this.executor.execute(runnable);
            }
            dpR dpr = dpR.c;
        }
    }
}
