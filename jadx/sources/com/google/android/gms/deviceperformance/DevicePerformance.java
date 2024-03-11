package com.google.android.gms.deviceperformance;

import android.content.Context;
import com.google.android.gms.deviceperformance.internal.zze;
import o.C8632dsu;

/* loaded from: classes2.dex */
public final class DevicePerformance {
    public static final DevicePerformance INSTANCE = new DevicePerformance();

    private DevicePerformance() {
    }

    public final DevicePerformanceClient getClient(Context context) {
        C8632dsu.c((Object) context, "");
        return new zze(context);
    }
}
