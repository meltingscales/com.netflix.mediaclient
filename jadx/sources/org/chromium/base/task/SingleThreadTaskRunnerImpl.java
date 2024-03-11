package org.chromium.base.task;

import android.os.Handler;

/* loaded from: classes5.dex */
public class SingleThreadTaskRunnerImpl extends TaskRunnerImpl implements SingleThreadTaskRunner {
    private final Handler mHandler;

    public SingleThreadTaskRunnerImpl(Handler handler, int i) {
        super(i, "SingleThreadTaskRunnerImpl", 2);
        this.mHandler = handler;
    }

    @Override // org.chromium.base.task.SingleThreadTaskRunner
    public boolean belongsToCurrentThread() {
        Boolean belongsToCurrentThreadInternal = belongsToCurrentThreadInternal();
        if (belongsToCurrentThreadInternal != null) {
            return belongsToCurrentThreadInternal.booleanValue();
        }
        return this.mHandler.getLooper().getThread() == Thread.currentThread();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.chromium.base.task.TaskRunnerImpl
    public void schedulePreNativeTask() {
        Handler handler = this.mHandler;
        if (handler == null) {
            return;
        }
        handler.post(this.mRunPreNativeTaskClosure);
    }
}
