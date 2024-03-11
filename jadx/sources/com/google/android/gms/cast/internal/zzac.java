package com.google.android.gms.cast.internal;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.internal.cast.zzc;

/* loaded from: classes2.dex */
public abstract class zzac extends com.google.android.gms.internal.cast.zzb implements zzad {
    public zzac() {
        super("com.google.android.gms.cast.internal.IBundleCallback");
    }

    @Override // com.google.android.gms.internal.cast.zzb
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            zzc.zzb(parcel);
            zzb((Bundle) zzc.zza(parcel, Bundle.CREATOR));
            return true;
        }
        return false;
    }
}
