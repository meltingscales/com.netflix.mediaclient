package com.google.android.gms.internal.p001authapi;

import com.google.android.gms.auth.api.identity.BeginSignInResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.android.gms.internal.auth-api.zbar  reason: invalid package */
/* loaded from: classes2.dex */
final class zbar extends zbx {
    final /* synthetic */ TaskCompletionSource zba;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zbar(zbau zbauVar, TaskCompletionSource taskCompletionSource) {
        this.zba = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.p001authapi.zby
    public final void zbb(Status status, BeginSignInResult beginSignInResult) {
        TaskUtil.setResultOrApiException(status, beginSignInResult, this.zba);
    }
}
