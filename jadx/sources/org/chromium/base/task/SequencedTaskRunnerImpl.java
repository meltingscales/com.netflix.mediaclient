package org.chromium.base.task;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes6.dex */
public class SequencedTaskRunnerImpl extends TaskRunnerImpl implements SequencedTaskRunner {
    private AtomicInteger mPendingTasks;
    private volatile boolean mReadyToCreateNativeTaskRunner;

    /* JADX INFO: Access modifiers changed from: package-private */
    public SequencedTaskRunnerImpl(int i) {
        super(i, "SequencedTaskRunnerImpl", 1);
        this.mPendingTasks = new AtomicInteger();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.chromium.base.task.TaskRunnerImpl
    public void schedulePreNativeTask() {
        if (this.mPendingTasks.getAndIncrement() == 0) {
            super.schedulePreNativeTask();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.chromium.base.task.TaskRunnerImpl
    public void runPreNativeTask() {
        super.runPreNativeTask();
        if (this.mPendingTasks.decrementAndGet() > 0) {
            if (!this.mReadyToCreateNativeTaskRunner) {
                super.schedulePreNativeTask();
            } else {
                super.initNativeTaskRunner();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.chromium.base.task.TaskRunnerImpl
    public void initNativeTaskRunner() {
        this.mReadyToCreateNativeTaskRunner = true;
        if (this.mPendingTasks.getAndIncrement() == 0) {
            super.initNativeTaskRunner();
        }
    }
}
