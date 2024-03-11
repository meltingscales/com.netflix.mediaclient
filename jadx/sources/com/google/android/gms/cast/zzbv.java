package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.internal.CastUtils;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class zzbv implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int readHeader;
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        String str = null;
        String str2 = null;
        long j = 0;
        Integer num = null;
        String str3 = null;
        while (true) {
            String str4 = str;
            Integer num2 = num;
            String str5 = str3;
            while (parcel.dataPosition() < validateObjectHeader) {
                readHeader = SafeParcelReader.readHeader(parcel);
                int fieldId = SafeParcelReader.getFieldId(readHeader);
                if (fieldId == 2) {
                    str5 = SafeParcelReader.createString(parcel, readHeader);
                } else if (fieldId != 3) {
                    if (fieldId == 4) {
                        num2 = SafeParcelReader.readIntegerObject(parcel, readHeader);
                    } else if (fieldId == 5) {
                        str4 = SafeParcelReader.createString(parcel, readHeader);
                    } else if (fieldId == 6) {
                        str2 = SafeParcelReader.createString(parcel, readHeader);
                    } else {
                        SafeParcelReader.skipUnknownField(parcel, readHeader);
                    }
                }
            }
            SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
            return new MediaError(str5, j, num2, str4, CastUtils.jsonStringToJsonObject(str2));
            j = SafeParcelReader.readLong(parcel, readHeader);
            str3 = str5;
            num = num2;
            str = str4;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new MediaError[i];
    }
}
