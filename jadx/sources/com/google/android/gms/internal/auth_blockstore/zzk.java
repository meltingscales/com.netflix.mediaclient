package com.google.android.gms.internal.auth_blockstore;

import android.os.Parcel;
import com.google.android.gms.auth.blockstore.RetrieveBytesResponse;
import com.google.android.gms.common.api.Status;

/* loaded from: classes2.dex */
public abstract class zzk extends zzb implements zzl {
    public zzk() {
        super("com.google.android.gms.auth.blockstore.internal.IRetrieveBytesCallback");
    }

    @Override // com.google.android.gms.internal.auth_blockstore.zzb
    protected final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            byte[] createByteArray = parcel.createByteArray();
            zzc.zzb(parcel);
            zzb((Status) zzc.zza(parcel, Status.CREATOR), createByteArray);
        } else if (i != 2) {
            return false;
        } else {
            zzc.zzb(parcel);
            zzc((Status) zzc.zza(parcel, Status.CREATOR), (RetrieveBytesResponse) zzc.zza(parcel, RetrieveBytesResponse.CREATOR));
        }
        return true;
    }
}
