package com.google.android.gms.recaptcha;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes2.dex */
final class zzl extends com.google.android.gms.internal.recaptcha.zzo {
    private final /* synthetic */ TaskCompletionSource zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzl(RecaptchaClient recaptchaClient, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.recaptcha.zzl
    public final void zza(Status status, RecaptchaResultData recaptchaResultData) {
        TaskUtil.setResultOrApiException(status, recaptchaResultData, this.zza);
    }
}
