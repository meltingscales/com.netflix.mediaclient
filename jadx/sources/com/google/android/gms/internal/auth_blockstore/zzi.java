package com.google.android.gms.internal.auth_blockstore;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* loaded from: classes2.dex */
public abstract class zzi extends zzb implements zzj {
    public zzi() {
        super("com.google.android.gms.auth.blockstore.internal.IIsEndToEndEncryptionAvailableCallback");
    }

    @Override // com.google.android.gms.internal.auth_blockstore.zzb
    protected final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            boolean zze = zzc.zze(parcel);
            zzc.zzb(parcel);
            zzb((Status) zzc.zza(parcel, Status.CREATOR), zze);
            return true;
        }
        return false;
    }
}
