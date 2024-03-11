package androidx.work;

import android.net.Network;
import android.net.Uri;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class WorkerParameters {
    private Executor mBackgroundExecutor;
    private ForegroundUpdater mForegroundUpdater;
    private UUID mId;
    private Data mInputData;
    private ProgressUpdater mProgressUpdater;
    private int mRunAttemptCount;
    private RuntimeExtras mRuntimeExtras;
    private Set<String> mTags;
    private TaskExecutor mWorkTaskExecutor;
    private WorkerFactory mWorkerFactory;

    /* loaded from: classes2.dex */
    public static class RuntimeExtras {
        public Network network;
        public List<String> triggeredContentAuthorities = Collections.emptyList();
        public List<Uri> triggeredContentUris = Collections.emptyList();
    }

    public Executor getBackgroundExecutor() {
        return this.mBackgroundExecutor;
    }

    public ForegroundUpdater getForegroundUpdater() {
        return this.mForegroundUpdater;
    }

    public UUID getId() {
        return this.mId;
    }

    public Data getInputData() {
        return this.mInputData;
    }

    public TaskExecutor getTaskExecutor() {
        return this.mWorkTaskExecutor;
    }

    public WorkerFactory getWorkerFactory() {
        return this.mWorkerFactory;
    }

    public WorkerParameters(UUID uuid, Data data, Collection<String> collection, RuntimeExtras runtimeExtras, int i, Executor executor, TaskExecutor taskExecutor, WorkerFactory workerFactory, ProgressUpdater progressUpdater, ForegroundUpdater foregroundUpdater) {
        this.mId = uuid;
        this.mInputData = data;
        this.mTags = new HashSet(collection);
        this.mRuntimeExtras = runtimeExtras;
        this.mRunAttemptCount = i;
        this.mBackgroundExecutor = executor;
        this.mWorkTaskExecutor = taskExecutor;
        this.mWorkerFactory = workerFactory;
        this.mProgressUpdater = progressUpdater;
        this.mForegroundUpdater = foregroundUpdater;
    }
}
