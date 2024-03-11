package com.netflix.mediaclient.service.webclient.model.leafs;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.netflix.mediaclient.service.webclient.model.leafs.AutoValue_OfflineCodecPrefData;
import o.C8118deO;

/* loaded from: classes.dex */
public abstract class OfflineCodecPrefData {
    @SerializedName("isAVCHighCodecEnabled")
    public abstract boolean isAVCHighCodecEnabled();

    @SerializedName("isAVCHighCodecForceEnabled")
    public abstract boolean isAVCHighCodecForceEnabled();

    @SerializedName("isEveVP9HWCodecEnabled")
    public abstract boolean isEveVP9HWCodecEnabled();

    @SerializedName("isVP9HWCodecEnabled")
    public abstract boolean isVP9HWCodecEnabled();

    @SerializedName("isXHEAACCodecEnabled")
    public abstract boolean isXHEAACCodecEnabled();

    public static OfflineCodecPrefData getDefault() {
        return (OfflineCodecPrefData) C8118deO.a().fromJson((JsonElement) new JsonObject(), (Class<Object>) OfflineCodecPrefData.class);
    }

    public static TypeAdapter<OfflineCodecPrefData> typeAdapter(Gson gson) {
        return new AutoValue_OfflineCodecPrefData.GsonTypeAdapter(gson).setDefaultVP9HWCodecEnabled(false).setDefaultAVCHighCodecEnabled(false).setDefaultEveVP9HWCodecEnabled(false).setDefaultAVCHighCodecForceEnabled(false).setDefaultXHEAACCodecEnabled(false);
    }
}
