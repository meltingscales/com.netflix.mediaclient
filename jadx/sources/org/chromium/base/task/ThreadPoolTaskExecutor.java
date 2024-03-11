package org.chromium.base.task;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class ThreadPoolTaskExecutor implements TaskExecutor {
    private final TaskRunner[] mTraitsToRunnerMap = new TaskRunner[6];

    @Override // org.chromium.base.task.TaskExecutor
    public boolean canRunTaskImmediately(int i) {
        return false;
    }

    public ThreadPoolTaskExecutor() {
        for (int i = 0; i < 6; i++) {
            this.mTraitsToRunnerMap[i] = createTaskRunner(i);
        }
    }

    @Override // org.chromium.base.task.TaskExecutor
    public TaskRunner createTaskRunner(int i) {
        return new TaskRunnerImpl(i);
    }

    @Override // org.chromium.base.task.TaskExecutor
    public SequencedTaskRunner createSequencedTaskRunner(int i) {
        return new SequencedTaskRunnerImpl(i);
    }

    @Override // org.chromium.base.task.TaskExecutor
    public SingleThreadTaskRunner createSingleThreadTaskRunner(int i) {
        return new SingleThreadTaskRunnerImpl(null, i);
    }

    @Override // org.chromium.base.task.TaskExecutor
    public void postDelayedTask(int i, Runnable runnable, long j) {
        this.mTraitsToRunnerMap[i].postDelayedTask(runnable, j);
    }
}
