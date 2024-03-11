package com.google.android.gms.cast.framework;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes2.dex */
public final class zzai extends com.google.android.gms.internal.cast.zza implements zzak {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzai(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.IReconnectionService");
    }

    @Override // com.google.android.gms.cast.framework.zzak
    public final int zze(Intent intent, int i, int i2) {
        Parcel zza = zza();
        com.google.android.gms.internal.cast.zzc.zzd(zza, intent);
        zza.writeInt(i);
        zza.writeInt(i2);
        Parcel zzb = zzb(2, zza);
        int readInt = zzb.readInt();
        zzb.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.cast.framework.zzak
    public final IBinder zzf(Intent intent) {
        Parcel zza = zza();
        com.google.android.gms.internal.cast.zzc.zzd(zza, intent);
        Parcel zzb = zzb(3, zza);
        IBinder readStrongBinder = zzb.readStrongBinder();
        zzb.recycle();
        return readStrongBinder;
    }

    @Override // com.google.android.gms.cast.framework.zzak
    public final void zzg() {
        zzc(1, zza());
    }

    @Override // com.google.android.gms.cast.framework.zzak
    public final void zzh() {
        zzc(4, zza());
    }
}
