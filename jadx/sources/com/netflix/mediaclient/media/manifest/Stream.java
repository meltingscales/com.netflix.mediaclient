package com.netflix.mediaclient.media.manifest;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.netflix.mediaclient.media.manifest.AutoValue_Stream;
import java.util.Collections;
import java.util.List;
import o.AbstractC4559bgm;

/* loaded from: classes.dex */
public abstract class Stream {
    public static final Stream DUMMY_STREAM = new AutoValue_Stream(-1, Collections.singletonList(Url.newInstance(-1, Url.DUMMY)), "dummy", false, 0, "dummy", "dummy", null, null, -1, -1, -1, -1, -1, -1, Collections.emptyList(), null);

    /* loaded from: classes.dex */
    public static abstract class Builder {
        public abstract Builder bitrate(int i);

        public abstract Stream build();

        public abstract Builder contentProfile(String str);

        public abstract Builder downloadableId(String str);

        public abstract Builder framerateScale(int i);

        public abstract Builder framerateValue(int i);

        public abstract Builder isDrm(boolean z);

        public abstract Builder moov(AbstractC4559bgm abstractC4559bgm);

        public abstract Builder newStreamId(String str);

        public abstract Builder peakBitrate(int i);

        public abstract Builder representationId(String str);

        public abstract Builder resH(int i);

        public abstract Builder resW(int i);

        public abstract Builder segmentVmaf(List<SegmentVmaf> list);

        public abstract Builder sidx(AbstractC4559bgm abstractC4559bgm);

        public abstract Builder size(long j);

        public abstract Builder urls(List<Url> list);

        public abstract Builder vmaf(int i);
    }

    @SerializedName("bitrate")
    public abstract int bitrate();

    @SerializedName("content_profile")
    public abstract String contentProfile();

    @SerializedName("downloadable_id")
    public abstract String downloadableId();

    @SerializedName("framerate_scale")
    public abstract int framerateScale();

    @SerializedName("framerate_value")
    public abstract int framerateValue();

    @SerializedName("isDrm")
    public abstract boolean isDrm();

    @SerializedName("moov")
    public abstract AbstractC4559bgm moov();

    @SerializedName("new_stream_id")
    public abstract String newStreamId();

    @SerializedName("peakBitrate")
    public abstract int peakBitrate();

    @SerializedName("representationId")
    public abstract String representationId();

    @SerializedName("res_h")
    public abstract int resH();

    @SerializedName("res_w")
    public abstract int resW();

    @SerializedName("segmentVmaf")
    public abstract List<SegmentVmaf> segmentVmaf();

    @SerializedName("sidx")
    public abstract AbstractC4559bgm sidx();

    @SerializedName("size")
    public abstract long size();

    public abstract Builder toBuilder();

    @SerializedName("urls")
    public abstract List<Url> urls();

    @SerializedName("vmaf")
    public abstract int vmaf();

    public static TypeAdapter<Stream> typeAdapter(Gson gson) {
        return new AutoValue_Stream.GsonTypeAdapter(gson).setDefaultSegmentVmaf(Collections.emptyList());
    }

    public boolean isValid() {
        return (urls() == null || urls().isEmpty()) ? false : true;
    }

    public static final Stream createDummyAudioStreamForProfileAndBitrate(String str, int i) {
        return new AutoValue_Stream(i, Collections.singletonList(Url.newInstance(-1, Url.DUMMY)), str, false, 0L, "dummy", "dummy", null, null, -1, -1, -1, -1, -1, -1, Collections.emptyList(), null);
    }
}
