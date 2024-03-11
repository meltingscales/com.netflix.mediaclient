package com.google.android.gms.auth.api.identity;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* loaded from: classes2.dex */
public final class BeginSignInResult extends AbstractSafeParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<BeginSignInResult> CREATOR = new zbb();
    private final PendingIntent zba;

    public BeginSignInResult(@RecentlyNonNull PendingIntent pendingIntent) {
        this.zba = (PendingIntent) Preconditions.checkNotNull(pendingIntent);
    }

    @RecentlyNonNull
    public PendingIntent getPendingIntent() {
        return this.zba;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, getPendingIntent(), i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
