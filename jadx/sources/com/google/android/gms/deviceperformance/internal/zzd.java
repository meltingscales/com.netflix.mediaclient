package com.google.android.gms.deviceperformance.internal;

import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes2.dex */
final class zzd implements RemoteCall {
    public static final zzd zza = new zzd();

    zzd() {
    }

    @Override // com.google.android.gms.common.api.internal.RemoteCall
    public final /* synthetic */ void accept(Object obj, Object obj2) {
        ((IDevicePerformanceService) ((zzb) obj).getService()).getMediaPerformanceClass(new zzc((TaskCompletionSource) obj2));
    }
}
