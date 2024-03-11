package com.google.android.gms.cast.internal;

import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzak implements zzar {
    final /* synthetic */ zzap zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzak(zzap zzapVar) {
        this.zza = zzapVar;
    }

    @Override // com.google.android.gms.cast.internal.zzar
    public final void zza(long j, int i, Object obj) {
        TaskCompletionSource taskCompletionSource;
        if (i != 0) {
            taskCompletionSource = this.zza.zzB;
            taskCompletionSource.setException(new IOException("storing session is timeout"));
        }
    }

    @Override // com.google.android.gms.cast.internal.zzar
    public final void zzb(long j) {
        TaskCompletionSource taskCompletionSource;
        taskCompletionSource = this.zza.zzB;
        taskCompletionSource.setResult(null);
    }
}
