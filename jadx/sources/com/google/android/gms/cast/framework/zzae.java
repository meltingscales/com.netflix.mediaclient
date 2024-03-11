package com.google.android.gms.cast.framework;

import android.os.Parcel;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes2.dex */
public abstract class zzae extends com.google.android.gms.internal.cast.zzb implements zzaf {
    public zzae() {
        super("com.google.android.gms.cast.framework.ICastStateListener");
    }

    @Override // com.google.android.gms.internal.cast.zzb
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            IObjectWrapper zzb = zzb();
            parcel2.writeNoException();
            com.google.android.gms.internal.cast.zzc.zzf(parcel2, zzb);
        } else if (i == 2) {
            int readInt = parcel.readInt();
            com.google.android.gms.internal.cast.zzc.zzb(parcel);
            zzc(readInt);
            parcel2.writeNoException();
        } else if (i != 3) {
            return false;
        } else {
            parcel2.writeNoException();
            parcel2.writeInt(GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE);
        }
        return true;
    }
}
