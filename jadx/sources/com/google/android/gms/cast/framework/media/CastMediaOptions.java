package com.google.android.gms.cast.framework.media;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.cast.framework.media.NotificationOptions;
import com.google.android.gms.cast.internal.Logger;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.dynamic.ObjectWrapper;

/* loaded from: classes2.dex */
public class CastMediaOptions extends AbstractSafeParcelable {
    private final String zzb;
    private final String zzc;
    private final zzd zzd;
    private final NotificationOptions zze;
    private final boolean zzf;
    private final boolean zzg;
    private static final Logger zza = new Logger("CastMediaOptions");
    public static final Parcelable.Creator<CastMediaOptions> CREATOR = new zza();

    /* loaded from: classes5.dex */
    public static final class Builder {
        private String zzb;
        private ImagePicker zzc;
        private String zza = "com.google.android.gms.cast.framework.media.MediaIntentReceiver";
        private NotificationOptions zzd = new NotificationOptions.Builder().build();
        private boolean zze = true;

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v0, types: [android.os.IBinder] */
        public CastMediaOptions build() {
            ImagePicker imagePicker = this.zzc;
            return new CastMediaOptions(this.zza, this.zzb, imagePicker == null ? null : imagePicker.zza(), this.zzd, false, this.zze);
        }

        public Builder setMediaSessionEnabled(boolean z) {
            this.zze = z;
            return this;
        }

        public Builder setNotificationOptions(NotificationOptions notificationOptions) {
            this.zzd = notificationOptions;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CastMediaOptions(String str, String str2, IBinder iBinder, NotificationOptions notificationOptions, boolean z, boolean z2) {
        zzd zzbVar;
        this.zzb = str;
        this.zzc = str2;
        if (iBinder == null) {
            zzbVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.IImagePicker");
            zzbVar = queryLocalInterface instanceof zzd ? (zzd) queryLocalInterface : new zzb(iBinder);
        }
        this.zzd = zzbVar;
        this.zze = notificationOptions;
        this.zzf = z;
        this.zzg = z2;
    }

    public String getExpandedControllerActivityClassName() {
        return this.zzc;
    }

    public ImagePicker getImagePicker() {
        zzd zzdVar = this.zzd;
        if (zzdVar != null) {
            try {
                return (ImagePicker) ObjectWrapper.unwrap(zzdVar.zzg());
            } catch (RemoteException e) {
                zza.d(e, "Unable to call %s on %s.", "getWrappedClientObject", zzd.class.getSimpleName());
                return null;
            }
        }
        return null;
    }

    public String getMediaIntentReceiverClassName() {
        return this.zzb;
    }

    public boolean getMediaSessionEnabled() {
        return this.zzg;
    }

    public NotificationOptions getNotificationOptions() {
        return this.zze;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, getMediaIntentReceiverClassName(), false);
        SafeParcelWriter.writeString(parcel, 3, getExpandedControllerActivityClassName(), false);
        zzd zzdVar = this.zzd;
        SafeParcelWriter.writeIBinder(parcel, 4, zzdVar == null ? null : zzdVar.asBinder(), false);
        SafeParcelWriter.writeParcelable(parcel, 5, getNotificationOptions(), i, false);
        SafeParcelWriter.writeBoolean(parcel, 6, this.zzf);
        SafeParcelWriter.writeBoolean(parcel, 7, getMediaSessionEnabled());
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final boolean zza() {
        return this.zzf;
    }
}
