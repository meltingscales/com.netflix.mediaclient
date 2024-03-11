package com.netflix.mediaclient.acquisition.screens.onRamp;

import o.C8632dsu;

/* loaded from: classes3.dex */
public final class VideoParsedData {
    public static final int $stable = 0;
    private final String title;
    private final String url;
    private final String videoId;

    public static /* synthetic */ VideoParsedData copy$default(VideoParsedData videoParsedData, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = videoParsedData.url;
        }
        if ((i & 2) != 0) {
            str2 = videoParsedData.videoId;
        }
        if ((i & 4) != 0) {
            str3 = videoParsedData.title;
        }
        return videoParsedData.copy(str, str2, str3);
    }

    public final String component1() {
        return this.url;
    }

    public final String component2() {
        return this.videoId;
    }

    public final String component3() {
        return this.title;
    }

    public final VideoParsedData copy(String str, String str2, String str3) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        C8632dsu.c((Object) str3, "");
        return new VideoParsedData(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof VideoParsedData) {
            VideoParsedData videoParsedData = (VideoParsedData) obj;
            return C8632dsu.c((Object) this.url, (Object) videoParsedData.url) && C8632dsu.c((Object) this.videoId, (Object) videoParsedData.videoId) && C8632dsu.c((Object) this.title, (Object) videoParsedData.title);
        }
        return false;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUrl() {
        return this.url;
    }

    public final String getVideoId() {
        return this.videoId;
    }

    public int hashCode() {
        return (((this.url.hashCode() * 31) + this.videoId.hashCode()) * 31) + this.title.hashCode();
    }

    public String toString() {
        String str = this.url;
        String str2 = this.videoId;
        String str3 = this.title;
        return "VideoParsedData(url=" + str + ", videoId=" + str2 + ", title=" + str3 + ")";
    }

    public VideoParsedData(String str, String str2, String str3) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        C8632dsu.c((Object) str3, "");
        this.url = str;
        this.videoId = str2;
        this.title = str3;
    }
}
