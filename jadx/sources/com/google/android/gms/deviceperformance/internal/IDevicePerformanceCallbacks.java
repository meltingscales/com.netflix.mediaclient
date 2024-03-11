package com.google.android.gms.deviceperformance.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.deviceperformance.MediaPerformanceClassResult;

/* loaded from: classes2.dex */
public interface IDevicePerformanceCallbacks extends IInterface {

    /* loaded from: classes2.dex */
    public static abstract class Stub extends com.google.android.gms.internal.device_performance.zzb implements IDevicePerformanceCallbacks {

        /* loaded from: classes2.dex */
        public static class Proxy extends com.google.android.gms.internal.device_performance.zza implements IDevicePerformanceCallbacks {
            Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.deviceperformance.internal.IDevicePerformanceCallbacks");
            }

            @Override // com.google.android.gms.deviceperformance.internal.IDevicePerformanceCallbacks
            public void onMediaPerformanceClass(Status status, MediaPerformanceClassResult mediaPerformanceClassResult) {
                Parcel zza = zza();
                com.google.android.gms.internal.device_performance.zzc.zzc(zza, status);
                com.google.android.gms.internal.device_performance.zzc.zzc(zza, mediaPerformanceClassResult);
                zzc(1, zza);
            }
        }

        public Stub() {
            super("com.google.android.gms.deviceperformance.internal.IDevicePerformanceCallbacks");
        }

        public static IDevicePerformanceCallbacks asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.deviceperformance.internal.IDevicePerformanceCallbacks");
            return queryLocalInterface instanceof IDevicePerformanceCallbacks ? (IDevicePerformanceCallbacks) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.gms.internal.device_performance.zzb
        public boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                com.google.android.gms.internal.device_performance.zzc.zzb(parcel);
                onMediaPerformanceClass((Status) com.google.android.gms.internal.device_performance.zzc.zza(parcel, Status.CREATOR), (MediaPerformanceClassResult) com.google.android.gms.internal.device_performance.zzc.zza(parcel, MediaPerformanceClassResult.CREATOR));
                return true;
            }
            return false;
        }
    }

    void onMediaPerformanceClass(Status status, MediaPerformanceClassResult mediaPerformanceClassResult);
}
