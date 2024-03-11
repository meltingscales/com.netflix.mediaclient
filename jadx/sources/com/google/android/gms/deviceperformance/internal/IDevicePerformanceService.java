package com.google.android.gms.deviceperformance.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.deviceperformance.internal.IDevicePerformanceCallbacks;

/* loaded from: classes2.dex */
public interface IDevicePerformanceService extends IInterface {

    /* loaded from: classes2.dex */
    public static abstract class Stub extends com.google.android.gms.internal.device_performance.zzb implements IDevicePerformanceService {

        /* loaded from: classes2.dex */
        public static class Proxy extends com.google.android.gms.internal.device_performance.zza implements IDevicePerformanceService {
            Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.deviceperformance.internal.IDevicePerformanceService");
            }

            @Override // com.google.android.gms.deviceperformance.internal.IDevicePerformanceService
            public void getMediaPerformanceClass(IDevicePerformanceCallbacks iDevicePerformanceCallbacks) {
                Parcel zza = zza();
                int i = com.google.android.gms.internal.device_performance.zzc.zza;
                if (iDevicePerformanceCallbacks == null) {
                    zza.writeStrongBinder(null);
                } else {
                    zza.writeStrongBinder(iDevicePerformanceCallbacks.asBinder());
                }
                zzb(1, zza);
            }
        }

        public Stub() {
            super("com.google.android.gms.deviceperformance.internal.IDevicePerformanceService");
        }

        public static IDevicePerformanceService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.deviceperformance.internal.IDevicePerformanceService");
            return queryLocalInterface instanceof IDevicePerformanceService ? (IDevicePerformanceService) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.gms.internal.device_performance.zzb
        public boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                IDevicePerformanceCallbacks asInterface = IDevicePerformanceCallbacks.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.internal.device_performance.zzc.zzb(parcel);
                getMediaPerformanceClass(asInterface);
                parcel2.writeNoException();
                return true;
            }
            return false;
        }
    }

    void getMediaPerformanceClass(IDevicePerformanceCallbacks iDevicePerformanceCallbacks);
}
