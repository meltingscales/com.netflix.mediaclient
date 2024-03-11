package com.google.android.gms.tflite.dynamite;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.tflite.dynamite.internal.CustomerInfo;

/* loaded from: classes5.dex */
public final class zzd extends com.google.android.gms.internal.tflite.zza implements zzf {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.tflite.dynamite.ITfLiteLoggerCreator");
    }

    @Override // com.google.android.gms.tflite.dynamite.zzf
    public final IObjectWrapper zzd(IObjectWrapper iObjectWrapper, CustomerInfo customerInfo) {
        Parcel zza = zza();
        com.google.android.gms.internal.tflite.zzc.zzb(zza, iObjectWrapper);
        com.google.android.gms.internal.tflite.zzc.zza(zza, customerInfo);
        Parcel zzb = zzb(3, zza);
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzb.readStrongBinder());
        zzb.recycle();
        return asInterface;
    }
}
