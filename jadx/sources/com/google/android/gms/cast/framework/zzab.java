package com.google.android.gms.cast.framework;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.common.ConnectionResult;

/* loaded from: classes2.dex */
public final class zzab extends com.google.android.gms.internal.cast.zza implements zzad {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzab(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.ICastSession");
    }

    @Override // com.google.android.gms.cast.framework.zzad
    public final void zze(boolean z, int i) {
        Parcel zza = zza();
        com.google.android.gms.internal.cast.zzc.zzc(zza, z);
        zza.writeInt(0);
        zzc(6, zza);
    }

    @Override // com.google.android.gms.cast.framework.zzad
    public final void zzf(ApplicationMetadata applicationMetadata, String str, String str2, boolean z) {
        Parcel zza = zza();
        com.google.android.gms.internal.cast.zzc.zzd(zza, applicationMetadata);
        zza.writeString(str);
        zza.writeString(str2);
        com.google.android.gms.internal.cast.zzc.zzc(zza, z);
        zzc(4, zza);
    }

    @Override // com.google.android.gms.cast.framework.zzad
    public final void zzg(int i) {
        Parcel zza = zza();
        zza.writeInt(i);
        zzc(5, zza);
    }

    @Override // com.google.android.gms.cast.framework.zzad
    public final void zzh(Bundle bundle) {
        Parcel zza = zza();
        com.google.android.gms.internal.cast.zzc.zzd(zza, null);
        zzc(1, zza);
    }

    @Override // com.google.android.gms.cast.framework.zzad
    public final void zzi(ConnectionResult connectionResult) {
        Parcel zza = zza();
        com.google.android.gms.internal.cast.zzc.zzd(zza, connectionResult);
        zzc(3, zza);
    }

    @Override // com.google.android.gms.cast.framework.zzad
    public final void zzj(int i) {
        Parcel zza = zza();
        zza.writeInt(i);
        zzc(2, zza);
    }
}
