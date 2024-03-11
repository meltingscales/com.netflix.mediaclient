package com.netflix.mediaclient.service.webclient.model.leafs;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.netflix.mediaclient.service.webclient.model.leafs.AutoValue_SfinderConfig;
import o.C8118deO;

/* loaded from: classes.dex */
public abstract class SfinderConfig {
    @SerializedName("forceDisable")
    public abstract boolean forceDisable();

    @SerializedName("forceEnable")
    public abstract boolean forceEnable();

    public static SfinderConfig getDefault() {
        return (SfinderConfig) C8118deO.a().fromJson((JsonElement) new JsonObject(), (Class<Object>) SfinderConfig.class);
    }

    public static TypeAdapter<SfinderConfig> typeAdapter(Gson gson) {
        return new AutoValue_SfinderConfig.GsonTypeAdapter(gson).setDefaultForceEnable(false).setDefaultForceDisable(false);
    }

    public static boolean isSfinderEnabled(SfinderConfig sfinderConfig) {
        return sfinderConfig.forceEnable() || !sfinderConfig.forceDisable();
    }
}
