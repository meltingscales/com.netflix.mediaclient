package com.google.android.gms.auth.api.identity;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* loaded from: classes2.dex */
public final class SignInCredential extends AbstractSafeParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<SignInCredential> CREATOR = new zbk();
    private final String zba;
    private final String zbb;
    private final String zbc;
    private final String zbd;
    private final Uri zbe;
    private final String zbf;
    private final String zbg;

    public SignInCredential(@RecentlyNonNull String str, String str2, String str3, String str4, Uri uri, String str5, String str6) {
        this.zba = Preconditions.checkNotEmpty(str);
        this.zbb = str2;
        this.zbc = str3;
        this.zbd = str4;
        this.zbe = uri;
        this.zbf = str5;
        this.zbg = str6;
    }

    public boolean equals(Object obj) {
        if (obj instanceof SignInCredential) {
            SignInCredential signInCredential = (SignInCredential) obj;
            return Objects.equal(this.zba, signInCredential.zba) && Objects.equal(this.zbb, signInCredential.zbb) && Objects.equal(this.zbc, signInCredential.zbc) && Objects.equal(this.zbd, signInCredential.zbd) && Objects.equal(this.zbe, signInCredential.zbe) && Objects.equal(this.zbf, signInCredential.zbf) && Objects.equal(this.zbg, signInCredential.zbg);
        }
        return false;
    }

    @RecentlyNullable
    public String getDisplayName() {
        return this.zbb;
    }

    @RecentlyNullable
    public String getFamilyName() {
        return this.zbd;
    }

    @RecentlyNullable
    public String getGivenName() {
        return this.zbc;
    }

    @RecentlyNullable
    public String getGoogleIdToken() {
        return this.zbg;
    }

    @RecentlyNonNull
    public String getId() {
        return this.zba;
    }

    @RecentlyNullable
    public String getPassword() {
        return this.zbf;
    }

    @RecentlyNullable
    public Uri getProfilePictureUri() {
        return this.zbe;
    }

    public int hashCode() {
        return Objects.hashCode(this.zba, this.zbb, this.zbc, this.zbd, this.zbe, this.zbf, this.zbg);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, getId(), false);
        SafeParcelWriter.writeString(parcel, 2, getDisplayName(), false);
        SafeParcelWriter.writeString(parcel, 3, getGivenName(), false);
        SafeParcelWriter.writeString(parcel, 4, getFamilyName(), false);
        SafeParcelWriter.writeParcelable(parcel, 5, getProfilePictureUri(), i, false);
        SafeParcelWriter.writeString(parcel, 6, getPassword(), false);
        SafeParcelWriter.writeString(parcel, 7, getGoogleIdToken(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
