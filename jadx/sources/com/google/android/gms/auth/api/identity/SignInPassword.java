package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* loaded from: classes2.dex */
public class SignInPassword extends AbstractSafeParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<SignInPassword> CREATOR = new zbm();
    private final String zba;
    private final String zbb;

    public SignInPassword(@RecentlyNonNull String str, @RecentlyNonNull String str2) {
        this.zba = Preconditions.checkNotEmpty(((String) Preconditions.checkNotNull(str, "Account identifier cannot be null")).trim(), "Account identifier cannot be empty");
        this.zbb = Preconditions.checkNotEmpty(str2);
    }

    public boolean equals(Object obj) {
        if (obj instanceof SignInPassword) {
            SignInPassword signInPassword = (SignInPassword) obj;
            return Objects.equal(this.zba, signInPassword.zba) && Objects.equal(this.zbb, signInPassword.zbb);
        }
        return false;
    }

    @RecentlyNonNull
    public String getId() {
        return this.zba;
    }

    @RecentlyNonNull
    public String getPassword() {
        return this.zbb;
    }

    public int hashCode() {
        return Objects.hashCode(this.zba, this.zbb);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, getId(), false);
        SafeParcelWriter.writeString(parcel, 2, getPassword(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
