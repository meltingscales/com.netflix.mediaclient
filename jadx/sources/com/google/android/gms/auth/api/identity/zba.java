package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class zba implements Parcelable.Creator<BeginSignInRequest> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ BeginSignInRequest createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        BeginSignInRequest.PasswordRequestOptions passwordRequestOptions = null;
        String str = null;
        boolean z = false;
        BeginSignInRequest.GoogleIdTokenRequestOptions googleIdTokenRequestOptions = null;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(readHeader);
            if (fieldId == 1) {
                passwordRequestOptions = (BeginSignInRequest.PasswordRequestOptions) SafeParcelReader.createParcelable(parcel, readHeader, BeginSignInRequest.PasswordRequestOptions.CREATOR);
            } else if (fieldId == 2) {
                googleIdTokenRequestOptions = (BeginSignInRequest.GoogleIdTokenRequestOptions) SafeParcelReader.createParcelable(parcel, readHeader, BeginSignInRequest.GoogleIdTokenRequestOptions.CREATOR);
            } else if (fieldId == 3) {
                str = SafeParcelReader.createString(parcel, readHeader);
            } else if (fieldId == 4) {
                z = SafeParcelReader.readBoolean(parcel, readHeader);
            } else {
                SafeParcelReader.skipUnknownField(parcel, readHeader);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new BeginSignInRequest(passwordRequestOptions, googleIdTokenRequestOptions, str, z);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ BeginSignInRequest[] newArray(int i) {
        return new BeginSignInRequest[i];
    }
}
