package org.chromium.base.task;

import android.os.Binder;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.chromium.base.Log;
import org.chromium.base.ThreadUtils;
import org.chromium.base.TraceEvent;
import org.chromium.base.metrics.RecordHistogram;
import org.chromium.build.annotations.DoNotInline;

/* loaded from: classes5.dex */
public abstract class AsyncTask<Result> {
    private final AsyncTask<Result>.NamedFutureTask mFuture;
    private final Callable<Result> mWorker;
    public static final Executor THREAD_POOL_EXECUTOR = new Executor() { // from class: org.chromium.base.task.AsyncTask$$ExternalSyntheticLambda1
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            PostTask.postTask(1, runnable);
        }
    };
    public static final Executor SERIAL_EXECUTOR = new SerialExecutor();
    private static final StealRunnableHandler STEAL_RUNNABLE_HANDLER = new StealRunnableHandler();
    private volatile int mStatus = 0;
    private final AtomicBoolean mCancelled = new AtomicBoolean();
    private final AtomicBoolean mTaskInvoked = new AtomicBoolean();
    private int mIterationIdForTesting = PostTask.sTestIterationForTesting;

    protected abstract Result doInBackground();

    protected void onCancelled() {
    }

    protected abstract void onPostExecute(Result result);

    /* loaded from: classes5.dex */
    static class StealRunnableHandler implements RejectedExecutionHandler {
        private StealRunnableHandler() {
        }

        @Override // java.util.concurrent.RejectedExecutionHandler
        public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            AsyncTask.THREAD_POOL_EXECUTOR.execute(runnable);
        }
    }

    public AsyncTask() {
        Callable<Result> callable = new Callable<Result>() { // from class: org.chromium.base.task.AsyncTask.1
            @Override // java.util.concurrent.Callable
            public Result call() {
                AsyncTask.this.mTaskInvoked.set(true);
                Result result = null;
                try {
                    result = (Result) AsyncTask.this.doInBackground();
                    Binder.flushPendingCommands();
                    return result;
                } finally {
                }
            }
        };
        this.mWorker = callable;
        this.mFuture = new NamedFutureTask(callable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void postResultIfNotInvoked(Result result) {
        if (this.mTaskInvoked.get()) {
            return;
        }
        postResult(result);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void postResult(final Result result) {
        if (this instanceof BackgroundOnlyAsyncTask) {
            this.mStatus = 2;
        } else if (this.mIterationIdForTesting == PostTask.sTestIterationForTesting) {
            ThreadUtils.postOnUiThread(new Runnable() { // from class: org.chromium.base.task.AsyncTask$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    AsyncTask.this.lambda$postResult$1(result);
                }
            });
        }
    }

    public final int getUmaStatus() {
        if (this.mStatus != 1 || this.mTaskInvoked.get()) {
            return this.mStatus;
        }
        return 0;
    }

    protected void onCancelled(Result result) {
        onCancelled();
    }

    public final boolean isCancelled() {
        return this.mCancelled.get();
    }

    @DoNotInline
    public final Result get() {
        String str;
        int umaStatus = getUmaStatus();
        if (umaStatus != 2 && ThreadUtils.runningOnUiThread()) {
            RecordHistogram.recordEnumeratedHistogram("Android.Jank.AsyncTaskGetOnUiThreadStatus", umaStatus, 3);
            StackTraceElement[] stackTrace = new Exception().getStackTrace();
            if (stackTrace.length > 1) {
                str = stackTrace[1].getClassName() + "." + stackTrace[1].getMethodName() + ".";
            } else {
                str = "";
            }
            TraceEvent scoped = TraceEvent.scoped(str + "AsyncTask.get");
            try {
                Result result = this.mFuture.get();
                if (scoped != null) {
                    scoped.close();
                    return result;
                }
                return result;
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
        return this.mFuture.get();
    }

    @DoNotInline
    public final Result get(long j, TimeUnit timeUnit) {
        String str;
        int umaStatus = getUmaStatus();
        if (umaStatus != 2 && ThreadUtils.runningOnUiThread()) {
            RecordHistogram.recordEnumeratedHistogram("Android.Jank.AsyncTaskGetOnUiThreadStatus", umaStatus, 3);
            StackTraceElement[] stackTrace = new Exception().getStackTrace();
            if (stackTrace.length > 1) {
                str = stackTrace[1].getClassName() + "." + stackTrace[1].getMethodName() + ".";
            } else {
                str = "";
            }
            TraceEvent scoped = TraceEvent.scoped(str + "AsyncTask.get");
            try {
                Result result = this.mFuture.get(j, timeUnit);
                if (scoped != null) {
                    scoped.close();
                    return result;
                }
                return result;
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
        return this.mFuture.get(j, timeUnit);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: finish */
    public void lambda$postResult$1(Result result) {
        if (isCancelled()) {
            onCancelled(result);
        } else {
            onPostExecute(result);
        }
        this.mStatus = 2;
    }

    /* loaded from: classes5.dex */
    class NamedFutureTask extends FutureTask<Result> {
        NamedFutureTask(Callable<Result> callable) {
            super(callable);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public Class getBlamedClass() {
            return AsyncTask.this.getClass();
        }

        @Override // java.util.concurrent.FutureTask, java.util.concurrent.RunnableFuture, java.lang.Runnable
        public void run() {
            String name = AsyncTask.this.mFuture.getBlamedClass().getName();
            TraceEvent scoped = TraceEvent.scoped("AsyncTask.run: " + name);
            try {
                super.run();
                if (scoped != null) {
                    scoped.close();
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

        @Override // java.util.concurrent.FutureTask
        protected void done() {
            try {
                AsyncTask.this.postResultIfNotInvoked(get());
            } catch (InterruptedException e) {
                Log.w("AsyncTask", e.toString());
            } catch (CancellationException unused) {
                AsyncTask.this.postResultIfNotInvoked(null);
            } catch (ExecutionException e2) {
                throw new RuntimeException("An error occurred while executing doInBackground()", e2.getCause());
            }
        }
    }
}
