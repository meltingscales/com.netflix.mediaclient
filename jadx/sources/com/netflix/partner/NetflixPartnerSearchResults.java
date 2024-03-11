package com.netflix.partner;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import o.dlP;

/* loaded from: classes6.dex */
public class NetflixPartnerSearchResults implements Parcelable {
    public static final Parcelable.Creator<NetflixPartnerSearchResults> CREATOR = new Parcelable.Creator<NetflixPartnerSearchResults>() { // from class: com.netflix.partner.NetflixPartnerSearchResults.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: e */
        public NetflixPartnerSearchResults createFromParcel(Parcel parcel) {
            return new NetflixPartnerSearchResults(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public NetflixPartnerSearchResults[] newArray(int i) {
            return new NetflixPartnerSearchResults[i];
        }
    };
    public String a;
    public int d;
    public ArrayList<PartnerVideoObj> e;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    protected NetflixPartnerSearchResults(Parcel parcel) {
        this.e = new ArrayList<>();
        this.a = parcel.readString();
        this.d = parcel.readInt();
        this.e = parcel.createTypedArrayList(PartnerVideoObj.CREATOR);
    }

    public NetflixPartnerSearchResults(int i, List<dlP> list) {
        this.e = new ArrayList<>();
        this.d = i;
        for (dlP dlp : list) {
            this.e.add(new PartnerVideoObj(dlp.a, dlp.d, dlp.b));
        }
    }

    public NetflixPartnerSearchResults(int i) {
        this.e = new ArrayList<>();
        this.d = i;
    }

    public NetflixPartnerSearchResults() {
        this.e = new ArrayList<>();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeInt(this.d);
        parcel.writeTypedList(this.e);
    }
}
