package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* loaded from: classes2.dex */
public class CredentialsData extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CredentialsData> CREATOR = new zzao();
    private final String zza;
    private final String zzb;

    public CredentialsData(String str, String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CredentialsData) {
            CredentialsData credentialsData = (CredentialsData) obj;
            return Objects.equal(this.zza, credentialsData.zza) && Objects.equal(this.zzb, credentialsData.zzb);
        }
        return false;
    }

    public String getCredentials() {
        return this.zza;
    }

    public String getCredentialsType() {
        return this.zzb;
    }

    public int hashCode() {
        return Objects.hashCode(this.zza, this.zzb);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, getCredentials(), false);
        SafeParcelWriter.writeString(parcel, 2, getCredentialsType(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
