package com.google.firebase.messaging;

import java.util.concurrent.Executor;

/* loaded from: classes5.dex */
final /* synthetic */ class zzh implements Executor {
    static final Executor zza = new zzh();

    private zzh() {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
