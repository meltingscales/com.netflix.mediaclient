package com.netflix.mediaclient.service.player.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.Metadata;

/* loaded from: classes3.dex */
public class NetflixCachedMetadataEntry implements Metadata.Entry {
    public static final Parcelable.Creator<NetflixCachedMetadataEntry> CREATOR = new Parcelable.Creator<NetflixCachedMetadataEntry>() { // from class: com.netflix.mediaclient.service.player.common.NetflixCachedMetadataEntry.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: d */
        public NetflixCachedMetadataEntry createFromParcel(Parcel parcel) {
            return new NetflixCachedMetadataEntry(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public NetflixCachedMetadataEntry[] newArray(int i) {
            return new NetflixCachedMetadataEntry[i];
        }
    };
    private final int a;

    public boolean c() {
        return this.a == 3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean e() {
        return this.a == 1;
    }

    public NetflixCachedMetadataEntry(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
    }

    public boolean equals(Object obj) {
        return (obj instanceof NetflixCachedMetadataEntry) && this.a == ((NetflixCachedMetadataEntry) obj).a;
    }
}
