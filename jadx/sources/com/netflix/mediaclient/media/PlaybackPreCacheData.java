package com.netflix.mediaclient.media;

/* loaded from: classes6.dex */
public class PlaybackPreCacheData {
    long mAudioHit;
    boolean mLdhHit;
    boolean mManifestCacheHit;
    long mVideoHit;

    public long getAudioHit() {
        return this.mAudioHit;
    }

    public long getVideoHit() {
        return this.mVideoHit;
    }

    public boolean isLdhHit() {
        return this.mLdhHit;
    }

    public boolean isManifestCacheHit() {
        return this.mManifestCacheHit;
    }

    public PlaybackPreCacheData(boolean z, boolean z2, long j, long j2) {
        this.mManifestCacheHit = z;
        this.mLdhHit = z2;
        this.mAudioHit = j;
        this.mVideoHit = j2;
    }
}
