package com.netflix.mediaclient.acquisition.screens.welcomefuji;

import android.os.Parcel;
import android.os.Parcelable;
import o.C8632dsu;

/* loaded from: classes3.dex */
public final class FujiCardParsedData implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<FujiCardParsedData> CREATOR = new Creator();
    private final String cardName;
    private final String cardType;
    private final String header;
    private final String imageUrl;
    private final String subheader;

    /* loaded from: classes3.dex */
    public static final class Creator implements Parcelable.Creator<FujiCardParsedData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FujiCardParsedData createFromParcel(Parcel parcel) {
            C8632dsu.c((Object) parcel, "");
            return new FujiCardParsedData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FujiCardParsedData[] newArray(int i) {
            return new FujiCardParsedData[i];
        }
    }

    public static /* synthetic */ FujiCardParsedData copy$default(FujiCardParsedData fujiCardParsedData, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fujiCardParsedData.header;
        }
        if ((i & 2) != 0) {
            str2 = fujiCardParsedData.subheader;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = fujiCardParsedData.imageUrl;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = fujiCardParsedData.cardType;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = fujiCardParsedData.cardName;
        }
        return fujiCardParsedData.copy(str, str6, str7, str8, str5);
    }

    public final String component1() {
        return this.header;
    }

    public final String component2() {
        return this.subheader;
    }

    public final String component3() {
        return this.imageUrl;
    }

    public final String component4() {
        return this.cardType;
    }

    public final String component5() {
        return this.cardName;
    }

    public final FujiCardParsedData copy(String str, String str2, String str3, String str4, String str5) {
        return new FujiCardParsedData(str, str2, str3, str4, str5);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FujiCardParsedData) {
            FujiCardParsedData fujiCardParsedData = (FujiCardParsedData) obj;
            return C8632dsu.c((Object) this.header, (Object) fujiCardParsedData.header) && C8632dsu.c((Object) this.subheader, (Object) fujiCardParsedData.subheader) && C8632dsu.c((Object) this.imageUrl, (Object) fujiCardParsedData.imageUrl) && C8632dsu.c((Object) this.cardType, (Object) fujiCardParsedData.cardType) && C8632dsu.c((Object) this.cardName, (Object) fujiCardParsedData.cardName);
        }
        return false;
    }

    public final String getCardName() {
        return this.cardName;
    }

    public final String getCardType() {
        return this.cardType;
    }

    public final String getHeader() {
        return this.header;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getSubheader() {
        return this.subheader;
    }

    public int hashCode() {
        String str = this.header;
        int hashCode = str == null ? 0 : str.hashCode();
        String str2 = this.subheader;
        int hashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.imageUrl;
        int hashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.cardType;
        int hashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.cardName;
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        String str = this.header;
        String str2 = this.subheader;
        String str3 = this.imageUrl;
        String str4 = this.cardType;
        String str5 = this.cardName;
        return "FujiCardParsedData(header=" + str + ", subheader=" + str2 + ", imageUrl=" + str3 + ", cardType=" + str4 + ", cardName=" + str5 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C8632dsu.c((Object) parcel, "");
        parcel.writeString(this.header);
        parcel.writeString(this.subheader);
        parcel.writeString(this.imageUrl);
        parcel.writeString(this.cardType);
        parcel.writeString(this.cardName);
    }

    public FujiCardParsedData(String str, String str2, String str3, String str4, String str5) {
        this.header = str;
        this.subheader = str2;
        this.imageUrl = str3;
        this.cardType = str4;
        this.cardName = str5;
    }
}
