package com.google.android.gms.cast.framework;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes2.dex */
public final class zzao extends com.google.android.gms.internal.cast.zza implements zzap {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzao(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.ISessionManager");
    }

    @Override // com.google.android.gms.cast.framework.zzap
    public final IObjectWrapper zzf() {
        Parcel zzb = zzb(1, zza());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzb.readStrongBinder());
        zzb.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.cast.framework.zzap
    public final IObjectWrapper zzg() {
        Parcel zzb = zzb(7, zza());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzb.readStrongBinder());
        zzb.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.cast.framework.zzap
    public final void zzh(zzaf zzafVar) {
        Parcel zza = zza();
        com.google.android.gms.internal.cast.zzc.zzf(zza, zzafVar);
        zzc(4, zza);
    }

    @Override // com.google.android.gms.cast.framework.zzap
    public final void zzi(zzar zzarVar) {
        Parcel zza = zza();
        com.google.android.gms.internal.cast.zzc.zzf(zza, zzarVar);
        zzc(2, zza);
    }

    @Override // com.google.android.gms.cast.framework.zzap
    public final void zzj(boolean z, boolean z2) {
        Parcel zza = zza();
        com.google.android.gms.internal.cast.zzc.zzc(zza, true);
        com.google.android.gms.internal.cast.zzc.zzc(zza, z2);
        zzc(6, zza);
    }

    @Override // com.google.android.gms.cast.framework.zzap
    public final void zzl(zzar zzarVar) {
        Parcel zza = zza();
        com.google.android.gms.internal.cast.zzc.zzf(zza, zzarVar);
        zzc(3, zza);
    }
}
