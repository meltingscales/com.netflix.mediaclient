package com.netflix.mediaclient.service.webclient.model.leafs;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.netflix.mediaclient.service.webclient.model.leafs.AutoValue_StreamingCodecPrefData;
import o.C8118deO;

/* loaded from: classes.dex */
public abstract class StreamingCodecPrefData {
    @SerializedName("isAV1CodecEnabled")
    public abstract boolean isAV1CodecEnabled();

    @SerializedName("isAVCHighCodecEnabled")
    public abstract boolean isAVCHighCodecEnabled();

    @SerializedName("isAVCHighCodecForceEnabled")
    public abstract boolean isAVCHighCodecForceEnabled();

    @SerializedName("isVP9HWCodecEnabled")
    public abstract boolean isVP9HWCodecEnabled();

    @SerializedName("isXHEAACCodecEnabled")
    public abstract boolean isXHEAACCodecEnabled();

    public static StreamingCodecPrefData getDefault() {
        return (StreamingCodecPrefData) C8118deO.a().fromJson((JsonElement) new JsonObject(), (Class<Object>) StreamingCodecPrefData.class);
    }

    public static TypeAdapter<StreamingCodecPrefData> typeAdapter(Gson gson) {
        return new AutoValue_StreamingCodecPrefData.GsonTypeAdapter(gson).setDefaultVP9HWCodecEnabled(false).setDefaultAVCHighCodecEnabled(false).setDefaultAVCHighCodecForceEnabled(false).setDefaultAV1CodecEnabled(false).setDefaultXHEAACCodecEnabled(false);
    }
}
