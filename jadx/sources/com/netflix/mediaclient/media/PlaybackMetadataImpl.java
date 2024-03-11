package com.netflix.mediaclient.media;

import android.util.Pair;
import java.util.Map;
import o.AbstractC4324bcP;
import o.InterfaceC5085bsB;

/* loaded from: classes3.dex */
public final class PlaybackMetadataImpl implements PlaybackMetadata {
    public long mAudioHit;
    private String mAudioProfile;
    public long mDuration;
    public boolean mLdlHit;
    public boolean mManifestCacheHit;
    public long mPlayDelay;
    public String mPlayerName;
    public long mSdkPlayDelay;
    private AbstractC4324bcP mStreamingStat;
    public String mSubtitleProfile;
    public long mVideoBitRate;
    public String mVideoDecoderName;
    public String mVideoFlavor;
    public float mVideoFrameRate;
    public long mVideoHit;
    private String mVideoProfile;
    public Pair<Integer, Integer> mVideoResolution = Pair.create(0, 0);

    private String getDrmMetadata(InterfaceC5085bsB interfaceC5085bsB, String str) {
        return str;
    }

    @Override // com.netflix.mediaclient.media.PlaybackMetadata
    public String getAudioProfile() {
        return this.mAudioProfile;
    }

    @Override // com.netflix.mediaclient.media.PlaybackMetadata
    public String getPlayerName() {
        return this.mPlayerName;
    }

    @Override // com.netflix.mediaclient.media.PlaybackMetadata
    public String getSubtitleProfile() {
        return this.mSubtitleProfile;
    }

    @Override // com.netflix.mediaclient.media.PlaybackMetadata
    public String getVideoFlavor() {
        return this.mVideoFlavor;
    }

    @Override // com.netflix.mediaclient.media.PlaybackMetadata
    public String getVideoProfile() {
        return this.mVideoProfile;
    }

    public void setStreamingStat(AbstractC4324bcP abstractC4324bcP) {
        this.mStreamingStat = abstractC4324bcP;
    }

    @Override // com.netflix.mediaclient.media.PlaybackMetadata
    public String toDisplayableString(InterfaceC5085bsB interfaceC5085bsB, String str) {
        return "n/a";
    }

    private String getAudioTrackType(AudioSource audioSource) {
        if (audioSource != null) {
            int trackType = audioSource.getTrackType();
            return trackType != 0 ? trackType != 1 ? trackType != 2 ? "unknown" : "assistive" : "commentary" : "primary";
        }
        return "unknown";
    }

    private String getAudioChannel(AudioSource audioSource) {
        if (audioSource != null) {
            int numChannels = audioSource.getNumChannels();
            return numChannels != 1 ? numChannels != 2 ? numChannels != 6 ? numChannels != 7 ? numChannels != 8 ? "-1" : "7.1" : "6.1" : "5.1" : "Stereo" : "Mono";
        }
        return "-1";
    }

    @Override // com.netflix.mediaclient.media.PlaybackMetadata
    public int getVideoBitrate() {
        AbstractC4324bcP abstractC4324bcP = this.mStreamingStat;
        if (abstractC4324bcP != null) {
            return abstractC4324bcP.d();
        }
        return 0;
    }

    @Override // com.netflix.mediaclient.media.PlaybackMetadata
    public float getVideoFramerate() {
        AbstractC4324bcP abstractC4324bcP = this.mStreamingStat;
        if (abstractC4324bcP != null) {
            return abstractC4324bcP.e();
        }
        return 0.0f;
    }

    public void setPlayerManifestData(PlayerManifestData playerManifestData) {
        if (playerManifestData == null) {
            this.mVideoProfile = "";
            this.mVideoFlavor = "";
            return;
        }
        this.mDuration = playerManifestData.getDuration();
        this.mVideoProfile = playerManifestData.getVideoProfileTag();
        this.mVideoFlavor = playerManifestData.getRawVideoProfileType();
        this.mAudioProfile = playerManifestData.getAudioProfileTag();
    }

    @Override // com.netflix.mediaclient.media.PlaybackMetadata
    public Map<String, String> getVideoDecoderStats() {
        AbstractC4324bcP abstractC4324bcP = this.mStreamingStat;
        if (abstractC4324bcP != null) {
            return abstractC4324bcP.b();
        }
        return null;
    }

    @Override // com.netflix.mediaclient.media.PlaybackMetadata
    public PlaybackPreCacheData getPlaybackPreCacheData() {
        return new PlaybackPreCacheData(this.mManifestCacheHit, this.mLdlHit, this.mAudioHit, this.mVideoHit);
    }
}
