package com.netflix.mediaclient.service.player.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.Metadata;

/* loaded from: classes3.dex */
public class NetflixVMAFMetadataEntry implements Metadata.Entry {
    public static final Parcelable.Creator<NetflixVMAFMetadataEntry> CREATOR = new Parcelable.Creator<NetflixVMAFMetadataEntry>() { // from class: com.netflix.mediaclient.service.player.common.NetflixVMAFMetadataEntry.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: c */
        public NetflixVMAFMetadataEntry createFromParcel(Parcel parcel) {
            return new NetflixVMAFMetadataEntry(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: c */
        public NetflixVMAFMetadataEntry[] newArray(int i) {
            return new NetflixVMAFMetadataEntry[i];
        }
    };
    private final int e;

    public int d() {
        return this.e;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public NetflixVMAFMetadataEntry(int i) {
        this.e = i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.e);
    }

    public boolean equals(Object obj) {
        return (obj instanceof NetflixVMAFMetadataEntry) && this.e == ((NetflixVMAFMetadataEntry) obj).e;
    }
}
