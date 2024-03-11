package com.netflix.partner;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes6.dex */
public class PartnerVideoObj implements Parcelable {
    public static final Parcelable.Creator<PartnerVideoObj> CREATOR = new Parcelable.Creator<PartnerVideoObj>() { // from class: com.netflix.partner.PartnerVideoObj.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: d */
        public PartnerVideoObj createFromParcel(Parcel parcel) {
            return new PartnerVideoObj(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public PartnerVideoObj[] newArray(int i) {
            return new PartnerVideoObj[i];
        }
    };
    public String b;
    public String c;
    public String d;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    protected PartnerVideoObj(Parcel parcel) {
        d(parcel);
    }

    public PartnerVideoObj(String str, String str2, String str3) {
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
    }

    public void d(Parcel parcel) {
        this.b = parcel.readString();
        this.c = parcel.readString();
        this.d = parcel.readString();
    }
}
