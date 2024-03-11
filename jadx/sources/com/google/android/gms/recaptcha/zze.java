package com.google.android.gms.recaptcha;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class zze implements Parcelable.Creator<RecaptchaActionType> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ RecaptchaActionType[] newArray(int i) {
        return new RecaptchaActionType[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ RecaptchaActionType createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        String str = null;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            if (SafeParcelReader.getFieldId(readHeader) == 1) {
                str = SafeParcelReader.createString(parcel, readHeader);
            } else {
                SafeParcelReader.skipUnknownField(parcel, readHeader);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new RecaptchaActionType(str);
    }
}
