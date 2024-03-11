package com.google.android.gms.internal.auth_blockstore;

import com.google.android.gms.auth.blockstore.RetrieveBytesResponse;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes2.dex */
final class zzv extends zzd {
    final /* synthetic */ TaskCompletionSource zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzv(zzz zzzVar, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.auth_blockstore.zzd, com.google.android.gms.internal.auth_blockstore.zzl
    public final void zzc(Status status, RetrieveBytesResponse retrieveBytesResponse) {
        TaskUtil.setResultOrApiException(status, retrieveBytesResponse, this.zza);
    }
}
