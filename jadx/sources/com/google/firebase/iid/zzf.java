package com.google.firebase.iid;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;

/* loaded from: classes2.dex */
public class zzf implements Parcelable {
    public static final Parcelable.Creator<zzf> CREATOR = new zze();
    private Messenger zza;
    private zzo zzb;

    /* loaded from: classes5.dex */
    public static final class zza extends ClassLoader {
        @Override // java.lang.ClassLoader
        protected final Class<?> loadClass(String str, boolean z) {
            if ("com.google.android.gms.iid.MessengerCompat".equals(str)) {
                if (FirebaseInstanceId.zzd()) {
                    Log.d("FirebaseInstanceId", "Using renamed FirebaseIidMessengerCompat class");
                    return zzf.class;
                }
                return zzf.class;
            }
            return super.loadClass(str, z);
        }
    }

    public zzf(IBinder iBinder) {
        this.zza = new Messenger(iBinder);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final void zza(Message message) {
        Messenger messenger = this.zza;
        if (messenger != null) {
            messenger.send(message);
        } else {
            this.zzb.zza(message);
        }
    }

    private final IBinder zza() {
        Messenger messenger = this.zza;
        return messenger != null ? messenger.getBinder() : this.zzb.asBinder();
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return zza().equals(((zzf) obj).zza());
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public int hashCode() {
        return zza().hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Messenger messenger = this.zza;
        if (messenger != null) {
            parcel.writeStrongBinder(messenger.getBinder());
        } else {
            parcel.writeStrongBinder(this.zzb.asBinder());
        }
    }
}
