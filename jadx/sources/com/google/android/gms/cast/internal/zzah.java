package com.google.android.gms.cast.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.cast.zzc;

/* loaded from: classes2.dex */
public final class zzah extends com.google.android.gms.internal.cast.zza implements IInterface {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzah(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.internal.ICastService");
    }

    public final void zzf(zzad zzadVar, String[] strArr) {
        Parcel zza = zza();
        zzc.zzf(zza, zzadVar);
        zza.writeStringArray(strArr);
        zzd(5, zza);
    }

    public final void zzg(zzad zzadVar, String[] strArr) {
        Parcel zza = zza();
        zzc.zzf(zza, zzadVar);
        zza.writeStringArray(strArr);
        zzd(7, zza);
    }

    public final void zzh(zzad zzadVar, String[] strArr) {
        Parcel zza = zza();
        zzc.zzf(zza, zzadVar);
        zza.writeStringArray(strArr);
        zzd(6, zza);
    }
}
