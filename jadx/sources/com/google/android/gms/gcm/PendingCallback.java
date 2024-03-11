package com.google.android.gms.gcm;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;

@Keep
/* loaded from: classes5.dex */
public final class PendingCallback implements Parcelable {
    public static final Parcelable.Creator<PendingCallback> CREATOR = new Parcelable.Creator<PendingCallback>() { // from class: com.google.android.gms.gcm.PendingCallback.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public PendingCallback createFromParcel(Parcel parcel) {
            return new PendingCallback(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public PendingCallback[] newArray(int i) {
            return new PendingCallback[i];
        }
    };
    private final IBinder mBinder;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public IBinder getIBinder() {
        return this.mBinder;
    }

    public PendingCallback(Parcel parcel) {
        this.mBinder = parcel.readStrongBinder();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeStrongBinder(this.mBinder);
    }
}
