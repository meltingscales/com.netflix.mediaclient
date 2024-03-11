package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* loaded from: classes5.dex */
public class SignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<SignInAccount> CREATOR = new zbc();
    @Deprecated
    String zba;
    @Deprecated
    String zbb;
    private GoogleSignInAccount zbc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public SignInAccount(String str, GoogleSignInAccount googleSignInAccount, String str2) {
        this.zbc = googleSignInAccount;
        this.zba = Preconditions.checkNotEmpty(str, "8.3 and 8.4 SDKs require non-null email");
        this.zbb = Preconditions.checkNotEmpty(str2, "8.3 and 8.4 SDKs require non-null userId");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 4, this.zba, false);
        SafeParcelWriter.writeParcelable(parcel, 7, this.zbc, i, false);
        SafeParcelWriter.writeString(parcel, 8, this.zbb, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @RecentlyNullable
    public final GoogleSignInAccount zba() {
        return this.zbc;
    }
}
