package com.google.android.gms.deviceperformance.internal;

import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.deviceperformance.DevicePerformanceClient;
import com.google.android.gms.tasks.Task;
import o.C8632dsu;

/* loaded from: classes2.dex */
public final class zze extends GoogleApi implements DevicePerformanceClient {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public zze(android.content.Context r4) {
        /*
            r3 = this;
            java.lang.String r0 = ""
            o.C8632dsu.c(r4, r0)
            com.google.android.gms.common.api.Api r0 = com.google.android.gms.deviceperformance.internal.InternalDevicePerformanceClientKt.zza()
            com.google.android.gms.common.api.Api$ApiOptions$NoOptions r1 = com.google.android.gms.common.api.Api.ApiOptions.NO_OPTIONS
            com.google.android.gms.common.api.GoogleApi$Settings r2 = com.google.android.gms.common.api.GoogleApi.Settings.DEFAULT_SETTINGS
            r3.<init>(r4, r0, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.deviceperformance.internal.zze.<init>(android.content.Context):void");
    }

    @Override // com.google.android.gms.deviceperformance.DevicePerformanceClient
    public final Task<Integer> mediaPerformanceClass() {
        Task<Integer> doRead = doRead(TaskApiCall.builder().setFeatures(com.google.android.gms.internal.device_performance.zzd.zza).run(zzd.zza).setMethodKey(28601).build());
        C8632dsu.a(doRead, "");
        return doRead;
    }
}
