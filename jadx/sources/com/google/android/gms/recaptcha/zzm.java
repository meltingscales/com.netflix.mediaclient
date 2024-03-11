package com.google.android.gms.recaptcha;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes2.dex */
final class zzm extends com.google.android.gms.internal.recaptcha.zzq {
    private final /* synthetic */ TaskCompletionSource zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzm(RecaptchaClient recaptchaClient, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.recaptcha.zzn
    public final void zza(Status status, RecaptchaHandle recaptchaHandle) {
        TaskUtil.setResultOrApiException(status, recaptchaHandle, this.zza);
    }
}
