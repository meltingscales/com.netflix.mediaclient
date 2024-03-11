package androidx.work;

import androidx.work.impl.DefaultRunnableScheduler;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class Configuration {
    final String mDefaultProcessName;
    final InitializationExceptionHandler mExceptionHandler;
    final Executor mExecutor;
    final InputMergerFactory mInputMergerFactory;
    private final boolean mIsUsingDefaultTaskExecutor;
    final int mLoggingLevel;
    final int mMaxJobSchedulerId;
    final int mMaxSchedulerLimit;
    final int mMinJobSchedulerId;
    final RunnableScheduler mRunnableScheduler;
    final Executor mTaskExecutor;
    final WorkerFactory mWorkerFactory;

    /* loaded from: classes.dex */
    public interface Provider {
        Configuration getWorkManagerConfiguration();
    }

    public String getDefaultProcessName() {
        return this.mDefaultProcessName;
    }

    public InitializationExceptionHandler getExceptionHandler() {
        return this.mExceptionHandler;
    }

    public Executor getExecutor() {
        return this.mExecutor;
    }

    public InputMergerFactory getInputMergerFactory() {
        return this.mInputMergerFactory;
    }

    public int getMaxJobSchedulerId() {
        return this.mMaxJobSchedulerId;
    }

    public int getMaxSchedulerLimit() {
        return this.mMaxSchedulerLimit;
    }

    public int getMinJobSchedulerId() {
        return this.mMinJobSchedulerId;
    }

    public int getMinimumLoggingLevel() {
        return this.mLoggingLevel;
    }

    public RunnableScheduler getRunnableScheduler() {
        return this.mRunnableScheduler;
    }

    public Executor getTaskExecutor() {
        return this.mTaskExecutor;
    }

    public WorkerFactory getWorkerFactory() {
        return this.mWorkerFactory;
    }

    Configuration(Builder builder) {
        Executor executor = builder.mExecutor;
        this.mExecutor = executor == null ? createDefaultExecutor(false) : executor;
        Executor executor2 = builder.mTaskExecutor;
        if (executor2 == null) {
            this.mIsUsingDefaultTaskExecutor = true;
            executor2 = createDefaultExecutor(true);
        } else {
            this.mIsUsingDefaultTaskExecutor = false;
        }
        this.mTaskExecutor = executor2;
        WorkerFactory workerFactory = builder.mWorkerFactory;
        this.mWorkerFactory = workerFactory == null ? WorkerFactory.getDefaultWorkerFactory() : workerFactory;
        InputMergerFactory inputMergerFactory = builder.mInputMergerFactory;
        this.mInputMergerFactory = inputMergerFactory == null ? InputMergerFactory.getDefaultInputMergerFactory() : inputMergerFactory;
        RunnableScheduler runnableScheduler = builder.mRunnableScheduler;
        this.mRunnableScheduler = runnableScheduler == null ? new DefaultRunnableScheduler() : runnableScheduler;
        this.mLoggingLevel = builder.mLoggingLevel;
        this.mMinJobSchedulerId = builder.mMinJobSchedulerId;
        this.mMaxJobSchedulerId = builder.mMaxJobSchedulerId;
        this.mMaxSchedulerLimit = builder.mMaxSchedulerLimit;
        this.mExceptionHandler = builder.mExceptionHandler;
        this.mDefaultProcessName = builder.mDefaultProcessName;
    }

    private Executor createDefaultExecutor(boolean z) {
        return Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), createDefaultThreadFactory(z));
    }

    private ThreadFactory createDefaultThreadFactory(final boolean z) {
        return new ThreadFactory() { // from class: androidx.work.Configuration.1
            private final AtomicInteger mThreadCount = new AtomicInteger(0);

            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                String str = z ? "WM.task-" : "androidx.work-";
                return new Thread(runnable, str + this.mThreadCount.incrementAndGet());
            }
        };
    }

    /* loaded from: classes.dex */
    public static final class Builder {
        String mDefaultProcessName;
        InitializationExceptionHandler mExceptionHandler;
        Executor mExecutor;
        InputMergerFactory mInputMergerFactory;
        RunnableScheduler mRunnableScheduler;
        Executor mTaskExecutor;
        WorkerFactory mWorkerFactory;
        int mLoggingLevel = 4;
        int mMinJobSchedulerId = 0;
        int mMaxJobSchedulerId = Integer.MAX_VALUE;
        int mMaxSchedulerLimit = 20;

        public Configuration build() {
            return new Configuration(this);
        }
    }
}
