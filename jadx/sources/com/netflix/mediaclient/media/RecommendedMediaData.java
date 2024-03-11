package com.netflix.mediaclient.media;

import o.C8632dsu;

/* loaded from: classes.dex */
public final class RecommendedMediaData {
    private final String audioTrackId;
    private final long creationTimeInMs;
    private final String timedTextTrackId;
    private final String videoTrackId;

    public static /* synthetic */ RecommendedMediaData copy$default(RecommendedMediaData recommendedMediaData, String str, String str2, String str3, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = recommendedMediaData.videoTrackId;
        }
        if ((i & 2) != 0) {
            str2 = recommendedMediaData.audioTrackId;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            str3 = recommendedMediaData.timedTextTrackId;
        }
        String str5 = str3;
        if ((i & 8) != 0) {
            j = recommendedMediaData.creationTimeInMs;
        }
        return recommendedMediaData.copy(str, str4, str5, j);
    }

    public final String component1() {
        return this.videoTrackId;
    }

    public final String component2() {
        return this.audioTrackId;
    }

    public final String component3() {
        return this.timedTextTrackId;
    }

    public final long component4() {
        return this.creationTimeInMs;
    }

    public final RecommendedMediaData copy(String str, String str2, String str3, long j) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        C8632dsu.c((Object) str3, "");
        return new RecommendedMediaData(str, str2, str3, j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RecommendedMediaData) {
            RecommendedMediaData recommendedMediaData = (RecommendedMediaData) obj;
            return C8632dsu.c((Object) this.videoTrackId, (Object) recommendedMediaData.videoTrackId) && C8632dsu.c((Object) this.audioTrackId, (Object) recommendedMediaData.audioTrackId) && C8632dsu.c((Object) this.timedTextTrackId, (Object) recommendedMediaData.timedTextTrackId) && this.creationTimeInMs == recommendedMediaData.creationTimeInMs;
        }
        return false;
    }

    public final String getAudioTrackId() {
        return this.audioTrackId;
    }

    public final long getCreationTimeInMs() {
        return this.creationTimeInMs;
    }

    public final String getTimedTextTrackId() {
        return this.timedTextTrackId;
    }

    public final String getVideoTrackId() {
        return this.videoTrackId;
    }

    public int hashCode() {
        return (((((this.videoTrackId.hashCode() * 31) + this.audioTrackId.hashCode()) * 31) + this.timedTextTrackId.hashCode()) * 31) + Long.hashCode(this.creationTimeInMs);
    }

    public String toString() {
        String str = this.videoTrackId;
        String str2 = this.audioTrackId;
        String str3 = this.timedTextTrackId;
        long j = this.creationTimeInMs;
        return "RecommendedMediaData(videoTrackId=" + str + ", audioTrackId=" + str2 + ", timedTextTrackId=" + str3 + ", creationTimeInMs=" + j + ")";
    }

    public RecommendedMediaData(String str, String str2, String str3, long j) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        C8632dsu.c((Object) str3, "");
        this.videoTrackId = str;
        this.audioTrackId = str2;
        this.timedTextTrackId = str3;
        this.creationTimeInMs = j;
    }
}
