package com.google.android.gms.internal.p001authapi;

import com.google.android.gms.auth.api.identity.SavePasswordResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.android.gms.internal.auth-api.zbal  reason: invalid package */
/* loaded from: classes2.dex */
final class zbal extends zbae {
    final /* synthetic */ TaskCompletionSource zba;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zbal(zbam zbamVar, TaskCompletionSource taskCompletionSource) {
        this.zba = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.p001authapi.zbaf
    public final void zbb(Status status, SavePasswordResult savePasswordResult) {
        TaskUtil.setResultOrApiException(status, savePasswordResult, this.zba);
    }
}
