package org.chromium.base.task;

import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.base.task.TaskRunnerImpl;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class TaskRunnerImplJni implements TaskRunnerImpl.Natives {
    public static final JniStaticTestMocker<TaskRunnerImpl.Natives> TEST_HOOKS = new JniStaticTestMocker<TaskRunnerImpl.Natives>() { // from class: org.chromium.base.task.TaskRunnerImplJni.1
    };
    private static TaskRunnerImpl.Natives testInstance;

    TaskRunnerImplJni() {
    }

    @Override // org.chromium.base.task.TaskRunnerImpl.Natives
    public long init(int i, int i2) {
        return GEN_JNI.org_chromium_base_task_TaskRunnerImpl_init(i, i2);
    }

    @Override // org.chromium.base.task.TaskRunnerImpl.Natives
    public void destroy(long j) {
        GEN_JNI.org_chromium_base_task_TaskRunnerImpl_destroy(j);
    }

    @Override // org.chromium.base.task.TaskRunnerImpl.Natives
    public void postDelayedTask(long j, Runnable runnable, long j2, String str) {
        GEN_JNI.org_chromium_base_task_TaskRunnerImpl_postDelayedTask(j, runnable, j2, str);
    }

    @Override // org.chromium.base.task.TaskRunnerImpl.Natives
    public boolean belongsToCurrentThread(long j) {
        return GEN_JNI.org_chromium_base_task_TaskRunnerImpl_belongsToCurrentThread(j);
    }

    public static TaskRunnerImpl.Natives get() {
        if (GEN_JNI.TESTING_ENABLED) {
            TaskRunnerImpl.Natives natives = testInstance;
            if (natives != null) {
                return natives;
            }
            if (GEN_JNI.REQUIRE_MOCK) {
                throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.base.task.TaskRunnerImpl.Natives. The current configuration requires all native implementations to have a mock instance.");
            }
        }
        NativeLibraryLoadedStatus.checkLoaded(false);
        return new TaskRunnerImplJni();
    }
}
