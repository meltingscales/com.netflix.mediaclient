package com.netflix.mediaclient.servicemgr.interface_.player.playlist;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;
import o.C5209buT;

/* loaded from: classes.dex */
public class PlaylistTimestamp implements Parcelable {
    public static final Parcelable.Creator<PlaylistTimestamp> CREATOR = new Parcelable.Creator<PlaylistTimestamp>() { // from class: com.netflix.mediaclient.servicemgr.interface_.player.playlist.PlaylistTimestamp.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public PlaylistTimestamp createFromParcel(Parcel parcel) {
            return new PlaylistTimestamp(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public PlaylistTimestamp[] newArray(int i) {
            return new PlaylistTimestamp[i];
        }
    };
    public final String a;
    public final String c;
    public final long e;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public PlaylistTimestamp(String str, String str2, long j) {
        this.c = str;
        this.a = str2;
        this.e = j;
    }

    protected PlaylistTimestamp(Parcel parcel) {
        this.c = parcel.readString();
        this.a = parcel.readString();
        this.e = parcel.readLong();
    }

    public long e(PlaylistMap playlistMap) {
        C5209buT a;
        if (this.e < 0 || playlistMap == null || !this.c.equals(playlistMap.b()) || (a = playlistMap.a(this.a)) == null) {
            return -1L;
        }
        long j = a.c;
        if (j >= 0) {
            return j + this.e;
        }
        return -1L;
    }

    public String toString() {
        return "PlaylistTimestamp{playlistId='" + this.c + "', segmentId='" + this.a + "', ptsMs=" + this.e + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.c);
        parcel.writeString(this.a);
        parcel.writeLong(this.e);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PlaylistTimestamp playlistTimestamp = (PlaylistTimestamp) obj;
        return this.e == playlistTimestamp.e && Objects.equals(this.c, playlistTimestamp.c) && Objects.equals(this.a, playlistTimestamp.a);
    }

    public int hashCode() {
        return Objects.hash(this.c, this.a, Long.valueOf(this.e));
    }
}
