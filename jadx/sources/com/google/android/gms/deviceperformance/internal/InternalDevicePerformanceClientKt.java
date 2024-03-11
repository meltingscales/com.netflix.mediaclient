package com.google.android.gms.deviceperformance.internal;

import com.google.android.gms.common.api.Api;

/* loaded from: classes2.dex */
public final class InternalDevicePerformanceClientKt {
    private static final Api.ClientKey zza;
    private static final zzf zzb;
    private static final Api zzc;

    static {
        Api.ClientKey clientKey = new Api.ClientKey();
        zza = clientKey;
        zzf zzfVar = new zzf();
        zzb = zzfVar;
        zzc = new Api("DevicePerformance.API", zzfVar, clientKey);
    }
}
