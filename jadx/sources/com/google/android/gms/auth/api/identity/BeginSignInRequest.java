package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class BeginSignInRequest extends AbstractSafeParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<BeginSignInRequest> CREATOR = new zba();
    private final PasswordRequestOptions zba;
    private final GoogleIdTokenRequestOptions zbb;
    private final String zbc;
    private final boolean zbd;

    /* loaded from: classes2.dex */
    public static final class Builder {
        private PasswordRequestOptions zba;
        private GoogleIdTokenRequestOptions zbb;
        private String zbc;
        private boolean zbd;

        public Builder() {
            PasswordRequestOptions.Builder builder = PasswordRequestOptions.builder();
            builder.setSupported(false);
            this.zba = builder.build();
            GoogleIdTokenRequestOptions.Builder builder2 = GoogleIdTokenRequestOptions.builder();
            builder2.setSupported(false);
            this.zbb = builder2.build();
        }

        @RecentlyNonNull
        public BeginSignInRequest build() {
            return new BeginSignInRequest(this.zba, this.zbb, this.zbc, this.zbd);
        }

        @RecentlyNonNull
        public Builder setAutoSelectEnabled(boolean z) {
            this.zbd = z;
            return this;
        }

        @RecentlyNonNull
        public Builder setGoogleIdTokenRequestOptions(@RecentlyNonNull GoogleIdTokenRequestOptions googleIdTokenRequestOptions) {
            this.zbb = (GoogleIdTokenRequestOptions) Preconditions.checkNotNull(googleIdTokenRequestOptions);
            return this;
        }

        @RecentlyNonNull
        public Builder setPasswordRequestOptions(@RecentlyNonNull PasswordRequestOptions passwordRequestOptions) {
            this.zba = (PasswordRequestOptions) Preconditions.checkNotNull(passwordRequestOptions);
            return this;
        }

        @RecentlyNonNull
        public final Builder zba(@RecentlyNonNull String str) {
            this.zbc = str;
            return this;
        }
    }

    /* loaded from: classes2.dex */
    public static final class GoogleIdTokenRequestOptions extends AbstractSafeParcelable {
        @RecentlyNonNull
        public static final Parcelable.Creator<GoogleIdTokenRequestOptions> CREATOR = new zbe();
        private final boolean zba;
        private final String zbb;
        private final String zbc;
        private final boolean zbd;
        private final String zbe;
        private final List<String> zbf;

        /* loaded from: classes2.dex */
        public static final class Builder {
            private boolean zba = false;
            private String zbb = null;
            private String zbc = null;
            private boolean zbd = true;
            private String zbe = null;
            private List<String> zbf = null;

            @RecentlyNonNull
            public GoogleIdTokenRequestOptions build() {
                return new GoogleIdTokenRequestOptions(this.zba, this.zbb, this.zbc, this.zbd, this.zbe, this.zbf);
            }

            @RecentlyNonNull
            public Builder setSupported(boolean z) {
                this.zba = z;
                return this;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public GoogleIdTokenRequestOptions(boolean z, String str, String str2, boolean z2, String str3, List<String> list) {
            ArrayList arrayList;
            this.zba = z;
            if (z) {
                Preconditions.checkNotNull(str, "serverClientId must be provided if Google ID tokens are requested");
            }
            this.zbb = str;
            this.zbc = str2;
            this.zbd = z2;
            Parcelable.Creator<BeginSignInRequest> creator = BeginSignInRequest.CREATOR;
            if (list == null || list.isEmpty()) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(list);
                Collections.sort(arrayList);
            }
            this.zbf = arrayList;
            this.zbe = str3;
        }

        @RecentlyNonNull
        public static Builder builder() {
            return new Builder();
        }

        public boolean equals(Object obj) {
            if (obj instanceof GoogleIdTokenRequestOptions) {
                GoogleIdTokenRequestOptions googleIdTokenRequestOptions = (GoogleIdTokenRequestOptions) obj;
                return this.zba == googleIdTokenRequestOptions.zba && Objects.equal(this.zbb, googleIdTokenRequestOptions.zbb) && Objects.equal(this.zbc, googleIdTokenRequestOptions.zbc) && this.zbd == googleIdTokenRequestOptions.zbd && Objects.equal(this.zbe, googleIdTokenRequestOptions.zbe) && Objects.equal(this.zbf, googleIdTokenRequestOptions.zbf);
            }
            return false;
        }

        public boolean filterByAuthorizedAccounts() {
            return this.zbd;
        }

        @RecentlyNullable
        public List<String> getIdTokenDepositionScopes() {
            return this.zbf;
        }

        @RecentlyNullable
        public String getLinkedServiceId() {
            return this.zbe;
        }

        @RecentlyNullable
        public String getNonce() {
            return this.zbc;
        }

        @RecentlyNullable
        public String getServerClientId() {
            return this.zbb;
        }

        public int hashCode() {
            boolean z = this.zba;
            String str = this.zbb;
            String str2 = this.zbc;
            boolean z2 = this.zbd;
            return Objects.hashCode(Boolean.valueOf(z), str, str2, Boolean.valueOf(z2), this.zbe, this.zbf);
        }

        public boolean isSupported() {
            return this.zba;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
            int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
            SafeParcelWriter.writeBoolean(parcel, 1, isSupported());
            SafeParcelWriter.writeString(parcel, 2, getServerClientId(), false);
            SafeParcelWriter.writeString(parcel, 3, getNonce(), false);
            SafeParcelWriter.writeBoolean(parcel, 4, filterByAuthorizedAccounts());
            SafeParcelWriter.writeString(parcel, 5, getLinkedServiceId(), false);
            SafeParcelWriter.writeStringList(parcel, 6, getIdTokenDepositionScopes(), false);
            SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
        }
    }

    /* loaded from: classes2.dex */
    public static final class PasswordRequestOptions extends AbstractSafeParcelable {
        @RecentlyNonNull
        public static final Parcelable.Creator<PasswordRequestOptions> CREATOR = new zbf();
        private final boolean zba;

        /* loaded from: classes2.dex */
        public static final class Builder {
            private boolean zba = false;

            @RecentlyNonNull
            public PasswordRequestOptions build() {
                return new PasswordRequestOptions(this.zba);
            }

            @RecentlyNonNull
            public Builder setSupported(boolean z) {
                this.zba = z;
                return this;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public PasswordRequestOptions(boolean z) {
            this.zba = z;
        }

        @RecentlyNonNull
        public static Builder builder() {
            return new Builder();
        }

        public boolean equals(Object obj) {
            return (obj instanceof PasswordRequestOptions) && this.zba == ((PasswordRequestOptions) obj).zba;
        }

        public int hashCode() {
            return Objects.hashCode(Boolean.valueOf(this.zba));
        }

        public boolean isSupported() {
            return this.zba;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
            int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
            SafeParcelWriter.writeBoolean(parcel, 1, isSupported());
            SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BeginSignInRequest(PasswordRequestOptions passwordRequestOptions, GoogleIdTokenRequestOptions googleIdTokenRequestOptions, String str, boolean z) {
        this.zba = (PasswordRequestOptions) Preconditions.checkNotNull(passwordRequestOptions);
        this.zbb = (GoogleIdTokenRequestOptions) Preconditions.checkNotNull(googleIdTokenRequestOptions);
        this.zbc = str;
        this.zbd = z;
    }

    @RecentlyNonNull
    public static Builder builder() {
        return new Builder();
    }

    @RecentlyNonNull
    public static Builder zba(@RecentlyNonNull BeginSignInRequest beginSignInRequest) {
        Preconditions.checkNotNull(beginSignInRequest);
        Builder builder = builder();
        builder.setGoogleIdTokenRequestOptions(beginSignInRequest.getGoogleIdTokenRequestOptions());
        builder.setPasswordRequestOptions(beginSignInRequest.getPasswordRequestOptions());
        builder.setAutoSelectEnabled(beginSignInRequest.zbd);
        String str = beginSignInRequest.zbc;
        if (str != null) {
            builder.zba(str);
        }
        return builder;
    }

    public boolean equals(Object obj) {
        if (obj instanceof BeginSignInRequest) {
            BeginSignInRequest beginSignInRequest = (BeginSignInRequest) obj;
            return Objects.equal(this.zba, beginSignInRequest.zba) && Objects.equal(this.zbb, beginSignInRequest.zbb) && Objects.equal(this.zbc, beginSignInRequest.zbc) && this.zbd == beginSignInRequest.zbd;
        }
        return false;
    }

    @RecentlyNonNull
    public GoogleIdTokenRequestOptions getGoogleIdTokenRequestOptions() {
        return this.zbb;
    }

    @RecentlyNonNull
    public PasswordRequestOptions getPasswordRequestOptions() {
        return this.zba;
    }

    public int hashCode() {
        return Objects.hashCode(this.zba, this.zbb, this.zbc, Boolean.valueOf(this.zbd));
    }

    public boolean isAutoSelectEnabled() {
        return this.zbd;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, getPasswordRequestOptions(), i, false);
        SafeParcelWriter.writeParcelable(parcel, 2, getGoogleIdTokenRequestOptions(), i, false);
        SafeParcelWriter.writeString(parcel, 3, this.zbc, false);
        SafeParcelWriter.writeBoolean(parcel, 4, isAutoSelectEnabled());
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
