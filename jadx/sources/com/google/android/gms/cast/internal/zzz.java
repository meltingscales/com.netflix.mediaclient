package com.google.android.gms.cast.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class zzz implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        double d = 0.0d;
        double d2 = 0.0d;
        boolean z = false;
        int i = 0;
        int i2 = 0;
        ApplicationMetadata applicationMetadata = null;
        com.google.android.gms.cast.zzar zzarVar = null;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(readHeader)) {
                case 2:
                    d = SafeParcelReader.readDouble(parcel, readHeader);
                    break;
                case 3:
                    z = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 4:
                    i = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 5:
                    applicationMetadata = (ApplicationMetadata) SafeParcelReader.createParcelable(parcel, readHeader, ApplicationMetadata.CREATOR);
                    break;
                case 6:
                    i2 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 7:
                    zzarVar = (com.google.android.gms.cast.zzar) SafeParcelReader.createParcelable(parcel, readHeader, com.google.android.gms.cast.zzar.CREATOR);
                    break;
                case 8:
                    d2 = SafeParcelReader.readDouble(parcel, readHeader);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, readHeader);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new zzy(d, z, i, applicationMetadata, i2, zzarVar, d2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzy[i];
    }
}
