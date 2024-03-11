package com.netflix.partner;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import o.dlN;

/* loaded from: classes6.dex */
public class NetflixPartnerRecoResults implements Parcelable {
    public static final Parcelable.Creator<NetflixPartnerRecoResults> CREATOR = new Parcelable.Creator<NetflixPartnerRecoResults>() { // from class: com.netflix.partner.NetflixPartnerRecoResults.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public NetflixPartnerRecoResults createFromParcel(Parcel parcel) {
            return new NetflixPartnerRecoResults(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: e */
        public NetflixPartnerRecoResults[] newArray(int i) {
            return new NetflixPartnerRecoResults[i];
        }
    };
    public String a;
    public int b;
    public ArrayList<PartnerRecoObj> c;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    protected NetflixPartnerRecoResults(Parcel parcel) {
        this.c = new ArrayList<>();
        this.a = parcel.readString();
        this.b = parcel.readInt();
        this.c = parcel.createTypedArrayList(PartnerRecoObj.CREATOR);
    }

    public NetflixPartnerRecoResults(int i, List<dlN> list) {
        this.c = new ArrayList<>();
        this.b = i;
        if (list == null || list.size() == 0) {
            return;
        }
        for (dlN dln : list) {
            this.c.add(new PartnerRecoObj(dln.e, dln.a, dln.g, dln.d, dln.c, dln.b));
        }
    }

    public NetflixPartnerRecoResults(int i) {
        this.c = new ArrayList<>();
        this.b = i;
    }

    public NetflixPartnerRecoResults() {
        this.c = new ArrayList<>();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeInt(this.b);
        parcel.writeTypedList(this.c);
    }
}
