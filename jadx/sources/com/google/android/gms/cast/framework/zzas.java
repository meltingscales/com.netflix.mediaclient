package com.google.android.gms.cast.framework;

import android.os.Parcel;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes2.dex */
public abstract class zzas extends com.google.android.gms.internal.cast.zzb implements zzat {
    public zzas() {
        super("com.google.android.gms.cast.framework.ISessionProvider");
    }

    @Override // com.google.android.gms.internal.cast.zzb
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            String readString = parcel.readString();
            com.google.android.gms.internal.cast.zzc.zzb(parcel);
            IObjectWrapper zzb = zzb(readString);
            parcel2.writeNoException();
            com.google.android.gms.internal.cast.zzc.zzf(parcel2, zzb);
        } else if (i == 2) {
            boolean zzd = zzd();
            parcel2.writeNoException();
            com.google.android.gms.internal.cast.zzc.zzc(parcel2, zzd);
        } else if (i == 3) {
            String zzc = zzc();
            parcel2.writeNoException();
            parcel2.writeString(zzc);
        } else if (i != 4) {
            return false;
        } else {
            parcel2.writeNoException();
            parcel2.writeInt(GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE);
        }
        return true;
    }
}
