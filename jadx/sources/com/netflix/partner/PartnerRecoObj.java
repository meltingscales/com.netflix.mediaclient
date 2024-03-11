package com.netflix.partner;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes6.dex */
public class PartnerRecoObj implements Parcelable {
    public static final Parcelable.Creator<PartnerRecoObj> CREATOR = new Parcelable.Creator<PartnerRecoObj>() { // from class: com.netflix.partner.PartnerRecoObj.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public PartnerRecoObj createFromParcel(Parcel parcel) {
            return new PartnerRecoObj(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public PartnerRecoObj[] newArray(int i) {
            return new PartnerRecoObj[i];
        }
    };
    public String a;
    public int b;
    public String c;
    public String d;
    public int e;
    public String j;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    protected PartnerRecoObj(Parcel parcel) {
        d(parcel);
    }

    public PartnerRecoObj(String str, String str2, String str3, int i, int i2, String str4) {
        this.c = str;
        this.d = str2;
        this.j = str3;
        this.b = i;
        this.e = i2;
        this.a = str4;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.j);
        parcel.writeInt(this.b);
        parcel.writeInt(this.e);
        parcel.writeString(this.a);
    }

    public void d(Parcel parcel) {
        this.c = parcel.readString();
        this.d = parcel.readString();
        this.j = parcel.readString();
        this.b = parcel.readInt();
        this.e = parcel.readInt();
        this.a = parcel.readString();
    }
}
