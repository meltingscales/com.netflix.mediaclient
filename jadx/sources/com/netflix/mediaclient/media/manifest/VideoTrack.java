package com.netflix.mediaclient.media.manifest;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.netflix.mediaclient.media.manifest.AutoValue_VideoTrack;
import com.netflix.mediaclient.media.manifest.C$AutoValue_VideoTrack;
import java.util.List;
import o.AbstractC4560bgn;

/* loaded from: classes.dex */
public abstract class VideoTrack {
    static final int DEFAULT_HEIGHT = 1080;

    /* loaded from: classes.dex */
    public static abstract class Builder {
        public abstract VideoTrack build();

        public abstract Builder drmHeader(AbstractC4560bgn abstractC4560bgn);

        public abstract Builder flavor(String str);

        public abstract Builder license(ManifestLimitedLicense manifestLimitedLicense);

        public abstract Builder maxCroppedHeight(int i);

        public abstract Builder maxCroppedWidth(int i);

        public abstract Builder maxHeight(int i);

        public abstract Builder maxWidth(int i);

        public abstract Builder newTrackId(String str);

        public abstract Builder pixelAspectX(int i);

        public abstract Builder pixelAspectY(int i);

        public abstract Builder profile(String str);

        public abstract Builder snippets(Snippets snippets);

        public abstract Builder streams(List<Stream> list);

        public abstract Builder trackId(String str);
    }

    @SerializedName("drmHeader")
    public abstract AbstractC4560bgn drmHeader();

    @SerializedName("flavor")
    public abstract String flavor();

    @SerializedName("license")
    public abstract ManifestLimitedLicense license();

    @SerializedName("maxCroppedHeight")
    public abstract int maxCroppedHeight();

    @SerializedName("maxCroppedWidth")
    public abstract int maxCroppedWidth();

    @SerializedName("maxHeight")
    public abstract int maxHeight();

    @SerializedName("maxWidth")
    public abstract int maxWidth();

    @SerializedName("new_track_id")
    public abstract String newTrackId();

    @SerializedName("pixelAspectX")
    public abstract int pixelAspectX();

    @SerializedName("pixelAspectY")
    public abstract int pixelAspectY();

    @SerializedName("profile")
    public abstract String profile();

    @SerializedName("snippets")
    public abstract Snippets snippets();

    @SerializedName("streams")
    public abstract List<Stream> streams();

    public abstract Builder toBuilder();

    @SerializedName("track_id")
    public abstract String trackId();

    public static TypeAdapter<VideoTrack> typeAdapter(Gson gson) {
        return new AutoValue_VideoTrack.GsonTypeAdapter(gson);
    }

    public int getAspectRatioHeight() {
        if (maxWidth() <= 0 || maxHeight() <= 0 || pixelAspectX() <= 0 || pixelAspectY() <= 0) {
            return 9;
        }
        return DEFAULT_HEIGHT;
    }

    public int getAspectRatioWidth() {
        if (maxWidth() <= 0 || maxHeight() <= 0 || pixelAspectX() <= 0 || pixelAspectY() <= 0) {
            return 16;
        }
        return (int) (((maxWidth() * pixelAspectX()) * 1080) / (maxHeight() * pixelAspectY()));
    }

    public int getCroppedWidth() {
        if (maxWidth() > 0 && maxHeight() > 0 && pixelAspectX() > 0 && pixelAspectY() > 0) {
            return (int) ((maxCroppedWidth() * getAspectRatioWidth()) / maxWidth());
        }
        return maxCroppedWidth();
    }

    public int getCroppedHeight() {
        if (maxWidth() > 0 && maxHeight() > 0 && pixelAspectX() > 0 && pixelAspectY() > 0) {
            return (int) ((maxCroppedHeight() * getAspectRatioHeight()) / maxHeight());
        }
        return maxCroppedHeight();
    }

    public static Builder emptyBuilder() {
        return new C$AutoValue_VideoTrack.Builder();
    }
}
