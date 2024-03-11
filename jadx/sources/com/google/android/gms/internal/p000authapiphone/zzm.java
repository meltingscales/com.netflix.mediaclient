package com.google.android.gms.internal.p000authapiphone;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.auth-api-phone.zzm  reason: invalid package */
/* loaded from: classes2.dex */
public abstract class zzm extends TaskApiCall<zzi, Void> {
    private TaskCompletionSource<Void> zzf;

    private zzm() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzm(zzk zzkVar) {
        this();
    }

    @Override // com.google.android.gms.common.api.internal.TaskApiCall
    public /* synthetic */ void doExecute(zzi zziVar, TaskCompletionSource<Void> taskCompletionSource) {
        this.zzf = taskCompletionSource;
        zza((zze) zziVar.getService());
    }

    protected abstract void zza(zze zzeVar);

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzb(Status status) {
        TaskUtil.setResultOrApiException(status, this.zzf);
    }
}
