package com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.reporter;

import com.google.gson.annotations.SerializedName;
import com.netflix.mediaclient.media.manifest.Stream;

/* loaded from: classes3.dex */
public class DownloadableJson {
    @SerializedName("bitrate")
    protected int bitrate;
    @SerializedName("dlid")
    protected String downloadableId;
    @SerializedName("type")
    protected Type type;
    @SerializedName("vmaf")
    protected Integer vmaf;

    /* loaded from: classes3.dex */
    public enum Type {
        AUDIO,
        VIDEO
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public DownloadableJson() {
    }

    public DownloadableJson(Type type, Stream stream) {
        this.downloadableId = stream.downloadableId();
        this.bitrate = stream.bitrate();
        this.vmaf = stream.vmaf() > 0 ? Integer.valueOf(stream.vmaf()) : null;
        this.type = type;
    }
}
