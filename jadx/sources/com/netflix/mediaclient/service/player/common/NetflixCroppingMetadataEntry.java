package com.netflix.mediaclient.service.player.common;

import android.os.Parcel;
import androidx.media3.common.Metadata;
import o.C8632dsu;

/* loaded from: classes3.dex */
public final class NetflixCroppingMetadataEntry implements Metadata.Entry {
    private final int a;
    private final int b;
    private final int c;
    private final int e;

    public final int a() {
        return this.c;
    }

    public final int b() {
        return this.e;
    }

    public final int c() {
        return this.a;
    }

    public final int d() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof NetflixCroppingMetadataEntry) {
            NetflixCroppingMetadataEntry netflixCroppingMetadataEntry = (NetflixCroppingMetadataEntry) obj;
            return this.b == netflixCroppingMetadataEntry.b && this.c == netflixCroppingMetadataEntry.c && this.e == netflixCroppingMetadataEntry.e && this.a == netflixCroppingMetadataEntry.a;
        }
        return false;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.b) * 31) + Integer.hashCode(this.c)) * 31) + Integer.hashCode(this.e)) * 31) + Integer.hashCode(this.a);
    }

    public String toString() {
        int i = this.b;
        int i2 = this.c;
        int i3 = this.e;
        int i4 = this.a;
        return "NetflixCroppingMetadataEntry(contentWidth=" + i + ", contentHeight=" + i2 + ", videoWidth=" + i3 + ", videoHeight=" + i4 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C8632dsu.c((Object) parcel, "");
    }

    public NetflixCroppingMetadataEntry(int i, int i2, int i3, int i4) {
        this.b = i;
        this.c = i2;
        this.e = i3;
        this.a = i4;
    }
}
