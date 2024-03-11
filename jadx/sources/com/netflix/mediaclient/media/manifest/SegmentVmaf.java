package com.netflix.mediaclient.media.manifest;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.netflix.mediaclient.media.manifest.AutoValue_SegmentVmaf;

/* loaded from: classes.dex */
public abstract class SegmentVmaf {
    @SerializedName("offset")
    public abstract long offsetMs();

    @SerializedName("vmaf")
    public abstract int vmaf();

    public static TypeAdapter<SegmentVmaf> typeAdapter(Gson gson) {
        return new AutoValue_SegmentVmaf.GsonTypeAdapter(gson);
    }
}
