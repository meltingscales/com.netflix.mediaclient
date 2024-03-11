package com.google.android.gms.auth.api.identity;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* loaded from: classes2.dex */
public class SavePasswordResult extends AbstractSafeParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<SavePasswordResult> CREATOR = new zbj();
    private final PendingIntent zba;

    public SavePasswordResult(@RecentlyNonNull PendingIntent pendingIntent) {
        this.zba = (PendingIntent) Preconditions.checkNotNull(pendingIntent);
    }

    public boolean equals(Object obj) {
        if (obj instanceof SavePasswordResult) {
            return Objects.equal(this.zba, ((SavePasswordResult) obj).zba);
        }
        return false;
    }

    @RecentlyNonNull
    public PendingIntent getPendingIntent() {
        return this.zba;
    }

    public int hashCode() {
        return Objects.hashCode(this.zba);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, getPendingIntent(), i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
