package com.google.android.gms.internal.auth_blockstore;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes2.dex */
final class zzu extends zzm {
    final /* synthetic */ TaskCompletionSource zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzu(zzz zzzVar, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.auth_blockstore.zzn
    public final void zzb(Status status, int i) {
        TaskUtil.setResultOrApiException(status, Integer.valueOf(i), this.zza);
    }
}
