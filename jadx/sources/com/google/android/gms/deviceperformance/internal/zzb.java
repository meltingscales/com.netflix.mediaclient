package com.google.android.gms.deviceperformance.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.ConnectionCallbacks;
import com.google.android.gms.common.api.internal.OnConnectionFailedListener;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.deviceperformance.internal.IDevicePerformanceService;
import o.C8632dsu;

/* loaded from: classes2.dex */
public final class zzb extends GmsClient {
    public static final zza zze = new zza(null);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzb(Context context, Looper looper, ClientSettings clientSettings, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 322, clientSettings, connectionCallbacks, onConnectionFailedListener);
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) looper, "");
        C8632dsu.c((Object) clientSettings, "");
        C8632dsu.c((Object) connectionCallbacks, "");
        C8632dsu.c((Object) onConnectionFailedListener, "");
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        C8632dsu.c((Object) iBinder, "");
        return IDevicePerformanceService.Stub.asInterface(iBinder);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Feature[] getApiFeatures() {
        Feature[] featureArr = com.google.android.gms.internal.device_performance.zzd.zzb;
        C8632dsu.a(featureArr, "");
        return featureArr;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final int getMinApkVersion() {
        return 17895000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String getServiceDescriptor() {
        return "com.google.android.gms.deviceperformance.internal.IDevicePerformanceService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String getStartServiceAction() {
        return "com.google.android.gms.deviceperformance.service.START";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final boolean getUseDynamicLookup() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final boolean usesClientTelemetry() {
        return true;
    }
}
