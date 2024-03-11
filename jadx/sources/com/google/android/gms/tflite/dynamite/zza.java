package com.google.android.gms.tflite.dynamite;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.tflite.dynamite.internal.CustomerInfo;

/* loaded from: classes5.dex */
public final class zza extends com.google.android.gms.internal.tflite.zza implements zzc {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zza(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.tflite.dynamite.ITfLiteDynamiteLoader");
    }

    @Override // com.google.android.gms.tflite.dynamite.zzc
    public final long zzd(IObjectWrapper iObjectWrapper, CustomerInfo customerInfo) {
        Parcel zza = zza();
        com.google.android.gms.internal.tflite.zzc.zzb(zza, iObjectWrapper);
        com.google.android.gms.internal.tflite.zzc.zza(zza, customerInfo);
        Parcel zzb = zzb(2, zza);
        long readLong = zzb.readLong();
        zzb.recycle();
        return readLong;
    }

    @Override // com.google.android.gms.tflite.dynamite.zzc
    public final IObjectWrapper zze(IObjectWrapper iObjectWrapper, CustomerInfo customerInfo) {
        Parcel zza = zza();
        com.google.android.gms.internal.tflite.zzc.zzb(zza, iObjectWrapper);
        com.google.android.gms.internal.tflite.zzc.zza(zza, customerInfo);
        Parcel zzb = zzb(3, zza);
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzb.readStrongBinder());
        zzb.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.tflite.dynamite.zzc
    public final IObjectWrapper zzf(IObjectWrapper iObjectWrapper, com.google.android.gms.tflite.dynamite.internal.zzc zzcVar) {
        Parcel zza = zza();
        com.google.android.gms.internal.tflite.zzc.zzb(zza, iObjectWrapper);
        com.google.android.gms.internal.tflite.zzc.zza(zza, zzcVar);
        Parcel zzb = zzb(4, zza);
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzb.readStrongBinder());
        zzb.recycle();
        return asInterface;
    }
}
