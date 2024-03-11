package com.google.android.gms.cast.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.cast.LaunchOptions;
import com.google.android.gms.cast.zzbs;
import com.google.android.gms.internal.cast.zzc;

/* loaded from: classes2.dex */
public final class zzae extends com.google.android.gms.internal.cast.zza implements IInterface {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzae(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.internal.ICastDeviceController");
    }

    public final void zze() {
        zzd(17, zza());
    }

    public final void zzf() {
        zzd(1, zza());
    }

    public final void zzg(zzad zzadVar, String[] strArr) {
        Parcel zza = zza();
        zzc.zzf(zza, zzadVar);
        zza.writeStringArray(strArr);
        zzd(20, zza);
    }

    public final void zzh(String str, String str2, zzbs zzbsVar) {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzc.zzd(zza, zzbsVar);
        zzd(14, zza);
    }

    public final void zzi(String str, LaunchOptions launchOptions) {
        Parcel zza = zza();
        zza.writeString(str);
        zzc.zzd(zza, launchOptions);
        zzd(13, zza);
    }

    public final void zzk(zzag zzagVar) {
        Parcel zza = zza();
        zzc.zzf(zza, zzagVar);
        zzd(18, zza);
    }

    public final void zzl(String str) {
        Parcel zza = zza();
        zza.writeString(str);
        zzd(11, zza);
    }

    public final void zzn(String str, String str2, long j) {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zza.writeLong(j);
        zzd(9, zza);
    }

    public final void zzo(boolean z, double d, boolean z2) {
        Parcel zza = zza();
        zzc.zzc(zza, z);
        zza.writeDouble(d);
        zzc.zzc(zza, z2);
        zzd(8, zza);
    }

    public final void zzq(String str) {
        Parcel zza = zza();
        zza.writeString(str);
        zzd(5, zza);
    }

    public final void zzr() {
        zzd(19, zza());
    }

    public final void zzs(String str) {
        Parcel zza = zza();
        zza.writeString(str);
        zzd(12, zza);
    }
}
