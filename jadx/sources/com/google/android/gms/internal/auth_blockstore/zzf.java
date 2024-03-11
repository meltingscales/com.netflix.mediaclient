package com.google.android.gms.internal.auth_blockstore;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.auth.blockstore.DeleteBytesRequest;
import com.google.android.gms.auth.blockstore.RetrieveBytesRequest;
import com.google.android.gms.auth.blockstore.StoreBytesData;

/* loaded from: classes2.dex */
public final class zzf extends zza implements IInterface {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.blockstore.internal.IBlockstoreService");
    }

    public final void zzc(zzh zzhVar, DeleteBytesRequest deleteBytesRequest) {
        Parcel zza = zza();
        zzc.zzd(zza, zzhVar);
        zzc.zzc(zza, deleteBytesRequest);
        zzb(13, zza);
    }

    public final void zzd(zzj zzjVar) {
        Parcel zza = zza();
        zzc.zzd(zza, zzjVar);
        zzb(11, zza);
    }

    public final void zzf(zzl zzlVar, RetrieveBytesRequest retrieveBytesRequest) {
        Parcel zza = zza();
        zzc.zzd(zza, zzlVar);
        zzc.zzc(zza, retrieveBytesRequest);
        zzb(12, zza);
    }

    public final void zzg(zzn zznVar, StoreBytesData storeBytesData) {
        Parcel zza = zza();
        zzc.zzd(zza, zznVar);
        zzc.zzc(zza, storeBytesData);
        zzb(10, zza);
    }
}
