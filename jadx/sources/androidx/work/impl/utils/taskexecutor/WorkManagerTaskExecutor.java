package androidx.work.impl.utils.taskexecutor;

import android.os.Handler;
import android.os.Looper;
import androidx.work.impl.utils.SerialExecutor;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public class WorkManagerTaskExecutor implements TaskExecutor {
    private final SerialExecutor mBackgroundExecutor;
    private final Handler mMainThreadHandler = new Handler(Looper.getMainLooper());
    private final Executor mMainThreadExecutor = new Executor() { // from class: androidx.work.impl.utils.taskexecutor.WorkManagerTaskExecutor.1
        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            WorkManagerTaskExecutor.this.postToMainThread(runnable);
        }
    };

    @Override // androidx.work.impl.utils.taskexecutor.TaskExecutor
    public SerialExecutor getBackgroundExecutor() {
        return this.mBackgroundExecutor;
    }

    @Override // androidx.work.impl.utils.taskexecutor.TaskExecutor
    public Executor getMainThreadExecutor() {
        return this.mMainThreadExecutor;
    }

    public WorkManagerTaskExecutor(Executor executor) {
        this.mBackgroundExecutor = new SerialExecutor(executor);
    }

    public void postToMainThread(Runnable runnable) {
        this.mMainThreadHandler.post(runnable);
    }

    @Override // androidx.work.impl.utils.taskexecutor.TaskExecutor
    public void executeOnBackgroundThread(Runnable runnable) {
        this.mBackgroundExecutor.execute(runnable);
    }
}
