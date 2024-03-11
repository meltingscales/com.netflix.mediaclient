package com.google.android.gms.cast.framework.media;

import android.os.Parcel;
import com.google.android.gms.cast.MediaMetadata;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.images.WebImage;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes2.dex */
public abstract class zzc extends com.google.android.gms.internal.cast.zzb implements zzd {
    public zzc() {
        super("com.google.android.gms.cast.framework.media.IImagePicker");
    }

    @Override // com.google.android.gms.internal.cast.zzb
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            int readInt = parcel.readInt();
            com.google.android.gms.internal.cast.zzc.zzb(parcel);
            WebImage zze = zze((MediaMetadata) com.google.android.gms.internal.cast.zzc.zza(parcel, MediaMetadata.CREATOR), readInt);
            parcel2.writeNoException();
            com.google.android.gms.internal.cast.zzc.zze(parcel2, zze);
        } else if (i == 2) {
            IObjectWrapper zzg = zzg();
            parcel2.writeNoException();
            com.google.android.gms.internal.cast.zzc.zzf(parcel2, zzg);
        } else if (i == 3) {
            parcel2.writeNoException();
            parcel2.writeInt(GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE);
        } else if (i != 4) {
            return false;
        } else {
            com.google.android.gms.internal.cast.zzc.zzb(parcel);
            WebImage zzf = zzf((MediaMetadata) com.google.android.gms.internal.cast.zzc.zza(parcel, MediaMetadata.CREATOR), (ImageHints) com.google.android.gms.internal.cast.zzc.zza(parcel, ImageHints.CREATOR));
            parcel2.writeNoException();
            com.google.android.gms.internal.cast.zzc.zze(parcel2, zzf);
        }
        return true;
    }
}
