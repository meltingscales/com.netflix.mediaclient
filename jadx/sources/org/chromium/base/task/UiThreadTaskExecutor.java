package org.chromium.base.task;

import android.os.Handler;
import org.chromium.base.ThreadUtils;

/* loaded from: classes5.dex */
public class UiThreadTaskExecutor implements TaskExecutor {
    private final SingleThreadTaskRunner mBestEffortTaskRunner;
    private final SingleThreadTaskRunner mUserBlockingTaskRunner;
    private final SingleThreadTaskRunner mUserVisibleTaskRunner;

    public UiThreadTaskExecutor() {
        Handler uiThreadHandler = ThreadUtils.getUiThreadHandler();
        this.mBestEffortTaskRunner = new SingleThreadTaskRunnerImpl(uiThreadHandler, 6);
        this.mUserVisibleTaskRunner = new SingleThreadTaskRunnerImpl(uiThreadHandler, 7);
        this.mUserBlockingTaskRunner = new SingleThreadTaskRunnerImpl(uiThreadHandler, 8);
    }

    @Override // org.chromium.base.task.TaskExecutor
    public TaskRunner createTaskRunner(int i) {
        return createSingleThreadTaskRunner(i);
    }

    @Override // org.chromium.base.task.TaskExecutor
    public SequencedTaskRunner createSequencedTaskRunner(int i) {
        return createSingleThreadTaskRunner(i);
    }

    @Override // org.chromium.base.task.TaskExecutor
    public SingleThreadTaskRunner createSingleThreadTaskRunner(int i) {
        if (6 == i) {
            return this.mBestEffortTaskRunner;
        }
        if (7 == i) {
            return this.mUserVisibleTaskRunner;
        }
        if (8 == i) {
            return this.mUserBlockingTaskRunner;
        }
        throw new RuntimeException();
    }

    @Override // org.chromium.base.task.TaskExecutor
    public void postDelayedTask(int i, Runnable runnable, long j) {
        createSingleThreadTaskRunner(i).postDelayedTask(runnable, j);
    }

    @Override // org.chromium.base.task.TaskExecutor
    public boolean canRunTaskImmediately(int i) {
        return createSingleThreadTaskRunner(i).belongsToCurrentThread();
    }
}
