package com.google.android.gms.tflite.dynamite;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes5.dex */
public abstract class zzb extends com.google.android.gms.internal.tflite.zzb implements zzc {
    public static zzc zza(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.tflite.dynamite.ITfLiteDynamiteLoader");
        return queryLocalInterface instanceof zzc ? (zzc) queryLocalInterface : new zza(iBinder);
    }
}
