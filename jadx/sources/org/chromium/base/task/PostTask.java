package org.chromium.base.task;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import org.chromium.base.Log;
import org.chromium.base.ThreadUtils;
import org.chromium.base.annotations.CalledByNative;

/* loaded from: classes5.dex */
public class PostTask {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String TAG = "PostTask";
    private static volatile boolean sNativeInitialized;
    private static volatile Executor sPrenativeThreadPoolExecutorOverride;
    static int sTestIterationForTesting;
    private static UiThreadTaskExecutor sUiThreadTaskExecutor;
    private static final Object sPreNativeTaskRunnerLock = new Object();
    private static List<TaskRunnerImpl> sPreNativeTaskRunners = new ArrayList();
    private static ChromeThreadPoolExecutor sPrenativeThreadPoolExecutor = new ChromeThreadPoolExecutor();
    private static final ThreadPoolTaskExecutor sThreadPoolTaskExecutor = new ThreadPoolTaskExecutor();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Executor getPrenativeThreadPoolExecutor() {
        return sPrenativeThreadPoolExecutorOverride != null ? sPrenativeThreadPoolExecutorOverride : sPrenativeThreadPoolExecutor;
    }

    public static void resetPrenativeThreadPoolExecutorForTesting() {
        sPrenativeThreadPoolExecutorOverride = null;
    }

    public static void resetUiThreadForTesting() {
        sUiThreadTaskExecutor = null;
    }

    public static void setPrenativeThreadPoolExecutorForTesting(Executor executor) {
        sPrenativeThreadPoolExecutorOverride = executor;
    }

    public static TaskRunner createTaskRunner(int i) {
        return getTaskExecutorForTraits(i).createTaskRunner(i);
    }

    public static SequencedTaskRunner createSequencedTaskRunner(int i) {
        return getTaskExecutorForTraits(i).createSequencedTaskRunner(i);
    }

    public static SingleThreadTaskRunner createSingleThreadTaskRunner(int i) {
        return getTaskExecutorForTraits(i).createSingleThreadTaskRunner(i);
    }

    public static void postTask(int i, Runnable runnable) {
        postDelayedTask(i, runnable, 0L);
    }

    public static void postDelayedTask(int i, Runnable runnable, long j) {
        getTaskExecutorForTraits(i).postDelayedTask(i, runnable, j);
    }

    public static void runOrPostTask(int i, Runnable runnable) {
        if (getTaskExecutorForTraits(i).canRunTaskImmediately(i)) {
            runnable.run();
        } else {
            postTask(i, runnable);
        }
    }

    public static boolean canRunTaskImmediately(int i) {
        return getTaskExecutorForTraits(i).canRunTaskImmediately(i);
    }

    @Deprecated
    public static <T> T runSynchronously(int i, Callable<T> callable) {
        return (T) runSynchronouslyInternal(i, new FutureTask(callable));
    }

    @Deprecated
    public static void runSynchronously(int i, Runnable runnable) {
        runSynchronouslyInternal(i, new FutureTask(runnable, null));
    }

    private static <T> T runSynchronouslyInternal(int i, FutureTask<T> futureTask) {
        runOrPostTask(i, futureTask);
        try {
            return futureTask.get();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean registerPreNativeTaskRunner(TaskRunnerImpl taskRunnerImpl) {
        synchronized (sPreNativeTaskRunnerLock) {
            List<TaskRunnerImpl> list = sPreNativeTaskRunners;
            if (list == null) {
                return false;
            }
            list.add(taskRunnerImpl);
            return true;
        }
    }

    private static TaskExecutor getTaskExecutorForTraits(int i) {
        if (i >= 6) {
            if (sUiThreadTaskExecutor == null) {
                ThreadUtils.getUiThreadHandler();
            }
            return sUiThreadTaskExecutor;
        }
        return sThreadPoolTaskExecutor;
    }

    @CalledByNative
    private static void onNativeSchedulerReady() {
        List<TaskRunnerImpl> list;
        if (sNativeInitialized) {
            return;
        }
        sNativeInitialized = true;
        synchronized (sPreNativeTaskRunnerLock) {
            list = sPreNativeTaskRunners;
            sPreNativeTaskRunners = null;
        }
        for (TaskRunnerImpl taskRunnerImpl : list) {
            taskRunnerImpl.initNativeTaskRunner();
        }
    }

    public static void flushJobsAndResetForTesting() {
        ChromeThreadPoolExecutor chromeThreadPoolExecutor = sPrenativeThreadPoolExecutor;
        int size = chromeThreadPoolExecutor.getQueue().size() + chromeThreadPoolExecutor.getActiveCount();
        if (size > 0) {
            chromeThreadPoolExecutor.shutdownNow();
            chromeThreadPoolExecutor.awaitTermination(1L, TimeUnit.SECONDS);
            sPrenativeThreadPoolExecutor = new ChromeThreadPoolExecutor();
        }
        synchronized (sPreNativeTaskRunnerLock) {
            List<TaskRunnerImpl> list = sPreNativeTaskRunners;
            if (list != null) {
                for (TaskRunnerImpl taskRunnerImpl : list) {
                    size += taskRunnerImpl.clearTaskQueueForTesting();
                }
            }
            sTestIterationForTesting++;
        }
        resetPrenativeThreadPoolExecutorForTesting();
        if (size > 0) {
            Log.w(TAG, "%d background task(s) existed after test finished.", Integer.valueOf(size));
        }
    }

    public static void onUiThreadReady() {
        sUiThreadTaskExecutor = new UiThreadTaskExecutor();
    }
}
