package com.netflix.mediaclient.media;

import com.netflix.mediaclient.media.manifest.Stream;
import com.netflix.mediaclient.media.manifest.VideoTrack;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes.dex */
public class PlayerManifestData {
    private final String audioProfileTag;
    private String[] availableBitrates;
    Comparator<Stream> bitrateStreamComparator = new Comparator<Stream>() { // from class: com.netflix.mediaclient.media.PlayerManifestData.1
        @Override // java.util.Comparator
        public int compare(Stream stream, Stream stream2) {
            if (stream.bitrate() > stream2.bitrate()) {
                return 1;
            }
            return stream.bitrate() < stream2.bitrate() ? -1 : 0;
        }
    };
    private long duration;
    private boolean isLive;
    private boolean isOffline;
    private int maxGopSize;
    private final long playableId;
    private final String rawVideoProfileType;
    private List<Stream> sortedVideoStreams;
    private final String videoProfileTag;

    public String getAudioProfileTag() {
        return this.audioProfileTag;
    }

    public String[] getAvailableBitrates() {
        return this.availableBitrates;
    }

    public long getDuration() {
        return this.duration;
    }

    public int getGopMaxSizeInMs() {
        return this.maxGopSize;
    }

    public long getPlayableId() {
        return this.playableId;
    }

    public String getRawVideoProfileType() {
        return this.rawVideoProfileType;
    }

    public String getVideoProfileTag() {
        return this.videoProfileTag;
    }

    public List<Stream> getVideoStreamsInfo() {
        return this.sortedVideoStreams;
    }

    public boolean isLive() {
        return this.isLive;
    }

    public boolean isOffline() {
        return this.isOffline;
    }

    public PlayerManifestData(long j, long j2, String[] strArr, int i, String str, String str2, String str3, List<VideoTrack> list, boolean z, boolean z2) {
        this.playableId = j;
        this.duration = j2;
        this.availableBitrates = strArr;
        this.maxGopSize = i;
        this.audioProfileTag = str;
        this.videoProfileTag = str2;
        this.rawVideoProfileType = str3;
        if (list.size() > 0) {
            this.sortedVideoStreams = new ArrayList();
            for (Stream stream : list.get(0).streams()) {
                this.sortedVideoStreams.add(stream);
            }
            Collections.sort(this.sortedVideoStreams, this.bitrateStreamComparator);
        }
        this.isOffline = z;
        this.isLive = z2;
    }

    public boolean isAV1Profile() {
        String str = this.videoProfileTag;
        if (str != null) {
            return str.contains("av1") || this.videoProfileTag.contains("av01");
        }
        return false;
    }

    public boolean isHDR10Profile() {
        String str = this.videoProfileTag;
        return str != null && str.contains("hdr");
    }

    public boolean isDolbyVisionProfile() {
        String str = this.videoProfileTag;
        return str != null && str.contains("dv5");
    }

    public String toString() {
        return "PlayerManifestData{playableId=" + this.playableId + ", videoProfileTag='" + this.videoProfileTag + "', rawVideoProfileType='" + this.rawVideoProfileType + "', audioProfileTag='" + this.audioProfileTag + "'}";
    }
}
