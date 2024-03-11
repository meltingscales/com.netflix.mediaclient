package org.chromium.base.task;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* loaded from: classes5.dex */
class SerialExecutor implements Executor {
    Runnable mActive;
    final ArrayDeque<Runnable> mTasks = new ArrayDeque<>();

    @Override // java.util.concurrent.Executor
    public void execute(final Runnable runnable) {
        synchronized (this) {
            this.mTasks.offer(new Runnable() { // from class: org.chromium.base.task.SerialExecutor.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        runnable.run();
                    } finally {
                        SerialExecutor.this.scheduleNext();
                    }
                }
            });
            if (this.mActive == null) {
                scheduleNext();
            }
        }
    }

    protected void scheduleNext() {
        synchronized (this) {
            Runnable poll = this.mTasks.poll();
            this.mActive = poll;
            if (poll != null) {
                AsyncTask.THREAD_POOL_EXECUTOR.execute(poll);
            }
        }
    }
}
