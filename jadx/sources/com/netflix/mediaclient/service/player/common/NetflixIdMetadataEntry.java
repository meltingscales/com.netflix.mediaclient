package com.netflix.mediaclient.service.player.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.Format;
import androidx.media3.common.Metadata;
import androidx.media3.common.util.Util;
import o.InterfaceC1598aHf;

/* loaded from: classes3.dex */
public class NetflixIdMetadataEntry implements Metadata.Entry {
    public static final Parcelable.Creator<NetflixIdMetadataEntry> CREATOR = new Parcelable.Creator<NetflixIdMetadataEntry>() { // from class: com.netflix.mediaclient.service.player.common.NetflixIdMetadataEntry.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public NetflixIdMetadataEntry createFromParcel(Parcel parcel) {
            return new NetflixIdMetadataEntry(parcel.readLong(), parcel.readString(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: d */
        public NetflixIdMetadataEntry[] newArray(int i) {
            return new NetflixIdMetadataEntry[i];
        }
    };
    public final long b;
    private final String c;
    public final int e;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String e() {
        return this.c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
    }

    public NetflixIdMetadataEntry(long j, String str) {
        this.b = j;
        this.c = str;
        this.e = -1;
    }

    public NetflixIdMetadataEntry(long j, String str, int i) {
        this.b = j;
        this.c = str;
        this.e = i;
    }

    public boolean equals(Object obj) {
        if (obj instanceof NetflixIdMetadataEntry) {
            NetflixIdMetadataEntry netflixIdMetadataEntry = (NetflixIdMetadataEntry) obj;
            return Util.areEqual(Long.valueOf(this.b), Long.valueOf(netflixIdMetadataEntry.b)) && Util.areEqual(this.c, netflixIdMetadataEntry.c);
        }
        return false;
    }

    public static NetflixIdMetadataEntry e(Format format) {
        if (format != null && format.metadata != null) {
            for (int i = 0; i < format.metadata.length(); i++) {
                if (format.metadata.get(i) instanceof NetflixIdMetadataEntry) {
                    return (NetflixIdMetadataEntry) format.metadata.get(i);
                }
            }
        }
        InterfaceC1598aHf.a("unable to find ID metadata for track");
        return new NetflixIdMetadataEntry(-1L, "", -1);
    }
}
