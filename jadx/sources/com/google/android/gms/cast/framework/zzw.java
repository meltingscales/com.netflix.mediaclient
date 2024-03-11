package com.google.android.gms.cast.framework;

import android.os.Parcel;
import com.google.android.gms.cast.LaunchOptions;
import com.google.android.gms.common.GooglePlayServicesUtilLight;

/* loaded from: classes2.dex */
public abstract class zzw extends com.google.android.gms.internal.cast.zzb implements zzx {
    public zzw() {
        super("com.google.android.gms.cast.framework.ICastConnectionController");
    }

    @Override // com.google.android.gms.internal.cast.zzb
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            com.google.android.gms.internal.cast.zzc.zzb(parcel);
            zzc(readString, readString2);
            parcel2.writeNoException();
        } else if (i == 2) {
            com.google.android.gms.internal.cast.zzc.zzb(parcel);
            zzd(parcel.readString(), (LaunchOptions) com.google.android.gms.internal.cast.zzc.zza(parcel, LaunchOptions.CREATOR));
            parcel2.writeNoException();
        } else if (i == 3) {
            String readString3 = parcel.readString();
            com.google.android.gms.internal.cast.zzc.zzb(parcel);
            zze(readString3);
            parcel2.writeNoException();
        } else if (i == 4) {
            int readInt = parcel.readInt();
            com.google.android.gms.internal.cast.zzc.zzb(parcel);
            zzb(readInt);
            parcel2.writeNoException();
        } else if (i != 5) {
            return false;
        } else {
            parcel2.writeNoException();
            parcel2.writeInt(GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE);
        }
        return true;
    }
}
