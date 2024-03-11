package com.google.android.gms.recaptcha;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes2.dex */
final class zzo extends com.google.android.gms.internal.recaptcha.zzm {
    private final /* synthetic */ TaskCompletionSource zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzo(RecaptchaClient recaptchaClient, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.recaptcha.zzj
    public final void zza(Status status, boolean z) {
        TaskUtil.setResultOrApiException(status, Boolean.valueOf(z), this.zza);
    }
}
