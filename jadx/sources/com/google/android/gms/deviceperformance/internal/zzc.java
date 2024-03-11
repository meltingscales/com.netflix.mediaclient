package com.google.android.gms.deviceperformance.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.deviceperformance.MediaPerformanceClassResult;
import com.google.android.gms.deviceperformance.internal.IDevicePerformanceCallbacks;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes2.dex */
public final class zzc extends IDevicePerformanceCallbacks.Stub {
    final /* synthetic */ TaskCompletionSource zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzc(TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.deviceperformance.internal.IDevicePerformanceCallbacks
    public final void onMediaPerformanceClass(Status status, MediaPerformanceClassResult mediaPerformanceClassResult) {
        TaskUtil.setResultOrApiException(status, mediaPerformanceClassResult != null ? Integer.valueOf(mediaPerformanceClassResult.getMediaPerformanceClass()) : null, this.zza);
    }
}
