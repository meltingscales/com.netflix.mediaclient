package com.google.android.play.core.assetpacks.internal;

import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes5.dex */
public abstract class p implements Runnable {
    private final TaskCompletionSource a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public p() {
        this.a = null;
    }

    public p(TaskCompletionSource taskCompletionSource) {
        this.a = taskCompletionSource;
    }

    protected abstract void a();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final TaskCompletionSource b() {
        return this.a;
    }

    public final void c(Exception exc) {
        TaskCompletionSource taskCompletionSource = this.a;
        if (taskCompletionSource != null) {
            taskCompletionSource.trySetException(exc);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            a();
        } catch (Exception e) {
            c(e);
        }
    }
}
