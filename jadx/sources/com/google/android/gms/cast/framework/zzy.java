package com.google.android.gms.cast.framework;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes2.dex */
public final class zzy extends com.google.android.gms.internal.cast.zza implements zzaa {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.ICastContext");
    }

    @Override // com.google.android.gms.cast.framework.zzaa
    public final Bundle zze() {
        Parcel zzb = zzb(1, zza());
        Bundle bundle = (Bundle) com.google.android.gms.internal.cast.zzc.zza(zzb, Bundle.CREATOR);
        zzb.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.cast.framework.zzaa
    public final zzah zzf() {
        zzah zzagVar;
        Parcel zzb = zzb(6, zza());
        IBinder readStrongBinder = zzb.readStrongBinder();
        if (readStrongBinder == null) {
            zzagVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.IDiscoveryManager");
            zzagVar = queryLocalInterface instanceof zzah ? (zzah) queryLocalInterface : new zzag(readStrongBinder);
        }
        zzb.recycle();
        return zzagVar;
    }

    @Override // com.google.android.gms.cast.framework.zzaa
    public final zzap zzg() {
        zzap zzaoVar;
        Parcel zzb = zzb(5, zza());
        IBinder readStrongBinder = zzb.readStrongBinder();
        if (readStrongBinder == null) {
            zzaoVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.ISessionManager");
            zzaoVar = queryLocalInterface instanceof zzap ? (zzap) queryLocalInterface : new zzao(readStrongBinder);
        }
        zzb.recycle();
        return zzaoVar;
    }

    @Override // com.google.android.gms.cast.framework.zzaa
    public final void zzh(zzv zzvVar) {
        Parcel zza = zza();
        com.google.android.gms.internal.cast.zzc.zzf(zza, zzvVar);
        zzc(3, zza);
    }
}
