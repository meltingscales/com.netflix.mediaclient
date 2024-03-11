package org.chromium.base.task;

import android.os.Process;
import android.util.Pair;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import org.chromium.base.TraceEvent;

/* loaded from: classes5.dex */
public class TaskRunnerImpl implements TaskRunner {
    private boolean mDidOneTimeInitialization;
    private volatile long mNativeTaskRunnerAndroid;
    private List<Pair<Runnable, Long>> mPreNativeDelayedTasks;
    private final Object mPreNativeTaskLock;
    private LinkedList<Runnable> mPreNativeTasks;
    protected final Runnable mRunPreNativeTaskClosure;
    private final int mTaskRunnerType;
    private final int mTaskTraits;
    private final String mTraceEvent;
    private static final ReferenceQueue<Object> sQueue = new ReferenceQueue<>();
    private static final Set<TaskRunnerCleaner> sCleaners = new HashSet();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public interface Natives {
        boolean belongsToCurrentThread(long j);

        void destroy(long j);

        long init(int i, int i2);

        void postDelayedTask(long j, Runnable runnable, long j2, String str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int clearTaskQueueForTesting() {
        int i;
        synchronized (this.mPreNativeTaskLock) {
            LinkedList<Runnable> linkedList = this.mPreNativeTasks;
            if (linkedList != null) {
                i = linkedList.size() + this.mPreNativeDelayedTasks.size();
                this.mPreNativeTasks.clear();
                this.mPreNativeDelayedTasks.clear();
            } else {
                i = 0;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static class TaskRunnerCleaner extends WeakReference<TaskRunnerImpl> {
        final long mNativePtr;

        TaskRunnerCleaner(TaskRunnerImpl taskRunnerImpl) {
            super(taskRunnerImpl, TaskRunnerImpl.sQueue);
            this.mNativePtr = taskRunnerImpl.mNativeTaskRunnerAndroid;
        }

        void destroy() {
            TaskRunnerImplJni.get().destroy(this.mNativePtr);
        }
    }

    private static void destroyGarbageCollectedTaskRunners() {
        while (true) {
            TaskRunnerCleaner taskRunnerCleaner = (TaskRunnerCleaner) sQueue.poll();
            if (taskRunnerCleaner == null) {
                return;
            }
            taskRunnerCleaner.destroy();
            Set<TaskRunnerCleaner> set = sCleaners;
            synchronized (set) {
                set.remove(taskRunnerCleaner);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public TaskRunnerImpl(int i) {
        this(i, "TaskRunnerImpl", 0);
        destroyGarbageCollectedTaskRunners();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public TaskRunnerImpl(int i, String str, int i2) {
        this.mRunPreNativeTaskClosure = new Runnable() { // from class: org.chromium.base.task.TaskRunnerImpl$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                TaskRunnerImpl.this.runPreNativeTask();
            }
        };
        this.mPreNativeTaskLock = new Object();
        this.mTaskTraits = i;
        this.mTraceEvent = str + ".PreNativeTask.run";
        this.mTaskRunnerType = i2;
    }

    @Override // org.chromium.base.task.TaskRunner
    public void postDelayedTask(Runnable runnable, long j) {
        if (this.mNativeTaskRunnerAndroid != 0) {
            TaskRunnerImplJni.get().postDelayedTask(this.mNativeTaskRunnerAndroid, runnable, j, runnable.getClass().getName());
            return;
        }
        synchronized (this.mPreNativeTaskLock) {
            oneTimeInitialization();
            if (this.mNativeTaskRunnerAndroid != 0) {
                TaskRunnerImplJni.get().postDelayedTask(this.mNativeTaskRunnerAndroid, runnable, j, runnable.getClass().getName());
                return;
            }
            if (j == 0) {
                this.mPreNativeTasks.add(runnable);
                schedulePreNativeTask();
            } else {
                this.mPreNativeDelayedTasks.add(new Pair<>(runnable, Long.valueOf(j)));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Boolean belongsToCurrentThreadInternal() {
        synchronized (this.mPreNativeTaskLock) {
            oneTimeInitialization();
        }
        if (this.mNativeTaskRunnerAndroid == 0) {
            return null;
        }
        return Boolean.valueOf(TaskRunnerImplJni.get().belongsToCurrentThread(this.mNativeTaskRunnerAndroid));
    }

    private void oneTimeInitialization() {
        if (this.mDidOneTimeInitialization) {
            return;
        }
        this.mDidOneTimeInitialization = true;
        if (!PostTask.registerPreNativeTaskRunner(this)) {
            initNativeTaskRunner();
            return;
        }
        this.mPreNativeTasks = new LinkedList<>();
        this.mPreNativeDelayedTasks = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void schedulePreNativeTask() {
        PostTask.getPrenativeThreadPoolExecutor().execute(this.mRunPreNativeTaskClosure);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void runPreNativeTask() {
        TraceEvent scoped = TraceEvent.scoped(this.mTraceEvent);
        try {
            synchronized (this.mPreNativeTaskLock) {
                LinkedList<Runnable> linkedList = this.mPreNativeTasks;
                if (linkedList == null) {
                    if (scoped != null) {
                        scoped.close();
                        return;
                    }
                    return;
                }
                Runnable poll = linkedList.poll();
                int i = this.mTaskTraits;
                if (i == 0 || i == 1) {
                    Process.setThreadPriority(10);
                } else if (i == 2 || i == 3) {
                    Process.setThreadPriority(0);
                } else if (i == 4 || i == 5) {
                    Process.setThreadPriority(-1);
                }
                poll.run();
                if (scoped != null) {
                    scoped.close();
                }
            }
        } catch (Throwable th) {
            if (scoped != null) {
                try {
                    scoped.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void initNativeTaskRunner() {
        long init = TaskRunnerImplJni.get().init(this.mTaskRunnerType, this.mTaskTraits);
        synchronized (this.mPreNativeTaskLock) {
            LinkedList<Runnable> linkedList = this.mPreNativeTasks;
            if (linkedList != null) {
                Iterator<Runnable> it = linkedList.iterator();
                while (it.hasNext()) {
                    Runnable next = it.next();
                    TaskRunnerImplJni.get().postDelayedTask(init, next, 0L, next.getClass().getName());
                }
                this.mPreNativeTasks = null;
            }
            List<Pair<Runnable, Long>> list = this.mPreNativeDelayedTasks;
            if (list != null) {
                for (Pair<Runnable, Long> pair : list) {
                    TaskRunnerImplJni.get().postDelayedTask(init, (Runnable) pair.first, ((Long) pair.second).longValue(), pair.getClass().getName());
                }
                this.mPreNativeDelayedTasks = null;
            }
            this.mNativeTaskRunnerAndroid = init;
        }
        Set<TaskRunnerCleaner> set = sCleaners;
        synchronized (set) {
            set.add(new TaskRunnerCleaner(this));
        }
        destroyGarbageCollectedTaskRunners();
    }
}
