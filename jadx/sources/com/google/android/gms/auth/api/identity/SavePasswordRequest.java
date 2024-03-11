package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* loaded from: classes2.dex */
public class SavePasswordRequest extends AbstractSafeParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<SavePasswordRequest> CREATOR = new zbi();
    private final SignInPassword zba;
    private final String zbb;

    /* loaded from: classes2.dex */
    public static final class Builder {
        private SignInPassword zba;
        private String zbb;

        @RecentlyNonNull
        public SavePasswordRequest build() {
            return new SavePasswordRequest(this.zba, this.zbb);
        }

        @RecentlyNonNull
        public Builder setSignInPassword(@RecentlyNonNull SignInPassword signInPassword) {
            this.zba = signInPassword;
            return this;
        }

        @RecentlyNonNull
        public final Builder zba(@RecentlyNonNull String str) {
            this.zbb = str;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public SavePasswordRequest(SignInPassword signInPassword, String str) {
        this.zba = (SignInPassword) Preconditions.checkNotNull(signInPassword);
        this.zbb = str;
    }

    @RecentlyNonNull
    public static Builder builder() {
        return new Builder();
    }

    @RecentlyNonNull
    public static Builder zba(@RecentlyNonNull SavePasswordRequest savePasswordRequest) {
        Preconditions.checkNotNull(savePasswordRequest);
        Builder builder = builder();
        builder.setSignInPassword(savePasswordRequest.getSignInPassword());
        String str = savePasswordRequest.zbb;
        if (str != null) {
            builder.zba(str);
        }
        return builder;
    }

    public boolean equals(Object obj) {
        if (obj instanceof SavePasswordRequest) {
            SavePasswordRequest savePasswordRequest = (SavePasswordRequest) obj;
            return Objects.equal(this.zba, savePasswordRequest.zba) && Objects.equal(this.zbb, savePasswordRequest.zbb);
        }
        return false;
    }

    @RecentlyNonNull
    public SignInPassword getSignInPassword() {
        return this.zba;
    }

    public int hashCode() {
        return Objects.hashCode(this.zba, this.zbb);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, getSignInPassword(), i, false);
        SafeParcelWriter.writeString(parcel, 2, this.zbb, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
