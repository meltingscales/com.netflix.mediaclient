package com.google.android.gms.internal.auth_blockstore;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* loaded from: classes2.dex */
public abstract class zzm extends zzb implements zzn {
    public zzm() {
        super("com.google.android.gms.auth.blockstore.internal.IStoreBytesCallback");
    }

    @Override // com.google.android.gms.internal.auth_blockstore.zzb
    protected final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            int readInt = parcel.readInt();
            zzc.zzb(parcel);
            zzb((Status) zzc.zza(parcel, Status.CREATOR), readInt);
            return true;
        }
        return false;
    }
}
