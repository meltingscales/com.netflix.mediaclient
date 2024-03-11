package com.netflix.mediaclient.ui.profiles;

import android.os.Parcel;
import android.os.Parcelable;
import com.netflix.android.org.json.zip.JSONzip;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import o.C8627dsp;
import o.C8632dsu;

/* loaded from: classes4.dex */
public final class RecentlyWatchedVideoInfo implements Parcelable {
    public static final Parcelable.Creator<RecentlyWatchedVideoInfo> CREATOR = new Creator();
    private final String a;
    private final boolean b;
    private final String c;
    private final String d;
    private final String e;
    private final String g;
    private final TrackingInfoHolder h;
    private final String i;
    private final VideoType j;

    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<RecentlyWatchedVideoInfo> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: e */
        public final RecentlyWatchedVideoInfo createFromParcel(Parcel parcel) {
            C8632dsu.c((Object) parcel, "");
            return new RecentlyWatchedVideoInfo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), VideoType.valueOf(parcel.readString()), (TrackingInfoHolder) parcel.readParcelable(RecentlyWatchedVideoInfo.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: e */
        public final RecentlyWatchedVideoInfo[] newArray(int i) {
            return new RecentlyWatchedVideoInfo[i];
        }
    }

    public RecentlyWatchedVideoInfo() {
        this(null, null, null, null, null, null, null, null, false, 511, null);
    }

    public final String a() {
        return this.c;
    }

    public final String b() {
        return this.e;
    }

    public final String c() {
        return this.d;
    }

    public final TrackingInfoHolder d() {
        return this.h;
    }

    public final RecentlyWatchedVideoInfo d(String str, String str2, String str3, String str4, VideoType videoType, TrackingInfoHolder trackingInfoHolder, String str5, String str6, boolean z) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        C8632dsu.c((Object) str3, "");
        C8632dsu.c((Object) str4, "");
        C8632dsu.c((Object) videoType, "");
        C8632dsu.c((Object) trackingInfoHolder, "");
        C8632dsu.c((Object) str6, "");
        return new RecentlyWatchedVideoInfo(str, str2, str3, str4, videoType, trackingInfoHolder, str5, str6, z);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RecentlyWatchedVideoInfo) {
            RecentlyWatchedVideoInfo recentlyWatchedVideoInfo = (RecentlyWatchedVideoInfo) obj;
            return C8632dsu.c((Object) this.i, (Object) recentlyWatchedVideoInfo.i) && C8632dsu.c((Object) this.d, (Object) recentlyWatchedVideoInfo.d) && C8632dsu.c((Object) this.g, (Object) recentlyWatchedVideoInfo.g) && C8632dsu.c((Object) this.c, (Object) recentlyWatchedVideoInfo.c) && this.j == recentlyWatchedVideoInfo.j && C8632dsu.c(this.h, recentlyWatchedVideoInfo.h) && C8632dsu.c((Object) this.a, (Object) recentlyWatchedVideoInfo.a) && C8632dsu.c((Object) this.e, (Object) recentlyWatchedVideoInfo.e) && this.b == recentlyWatchedVideoInfo.b;
        }
        return false;
    }

    public final String f() {
        return this.i;
    }

    public final boolean g() {
        return this.b;
    }

    public final VideoType h() {
        return this.j;
    }

    public int hashCode() {
        int hashCode = this.i.hashCode();
        int hashCode2 = this.d.hashCode();
        int hashCode3 = this.g.hashCode();
        int hashCode4 = this.c.hashCode();
        int hashCode5 = this.j.hashCode();
        int hashCode6 = this.h.hashCode();
        String str = this.a;
        return (((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.e.hashCode()) * 31) + Boolean.hashCode(this.b);
    }

    public final String i() {
        return this.g;
    }

    public String toString() {
        String str = this.i;
        String str2 = this.d;
        String str3 = this.g;
        String str4 = this.c;
        VideoType videoType = this.j;
        TrackingInfoHolder trackingInfoHolder = this.h;
        String str5 = this.a;
        String str6 = this.e;
        boolean z = this.b;
        return "RecentlyWatchedVideoInfo(videoId=" + str + ", parentVideoId=" + str2 + ", videoTitle=" + str3 + ", parentVideoTitle=" + str4 + ", videoType=" + videoType + ", trackingInfoHolder=" + trackingInfoHolder + ", boxArtUrl=" + str5 + ", episodeInfoText=" + str6 + ", isDownloadingAllowed=" + z + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C8632dsu.c((Object) parcel, "");
        parcel.writeString(this.i);
        parcel.writeString(this.d);
        parcel.writeString(this.g);
        parcel.writeString(this.c);
        parcel.writeString(this.j.name());
        parcel.writeParcelable(this.h, i);
        parcel.writeString(this.a);
        parcel.writeString(this.e);
        parcel.writeInt(this.b ? 1 : 0);
    }

    public RecentlyWatchedVideoInfo(String str, String str2, String str3, String str4, VideoType videoType, TrackingInfoHolder trackingInfoHolder, String str5, String str6, boolean z) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        C8632dsu.c((Object) str3, "");
        C8632dsu.c((Object) str4, "");
        C8632dsu.c((Object) videoType, "");
        C8632dsu.c((Object) trackingInfoHolder, "");
        C8632dsu.c((Object) str6, "");
        this.i = str;
        this.d = str2;
        this.g = str3;
        this.c = str4;
        this.j = videoType;
        this.h = trackingInfoHolder;
        this.a = str5;
        this.e = str6;
        this.b = z;
    }

    public /* synthetic */ RecentlyWatchedVideoInfo(String str, String str2, String str3, String str4, VideoType videoType, TrackingInfoHolder trackingInfoHolder, String str5, String str6, boolean z, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? VideoType.UNKNOWN : videoType, (i & 32) != 0 ? TrackingInfoHolder.a.b() : trackingInfoHolder, (i & 64) != 0 ? null : str5, (i & 128) == 0 ? str6 : "", (i & JSONzip.end) != 0 ? false : z);
    }
}
