package com.netflix.mediaclient.service.webclient.model.leafs;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.netflix.mediaclient.service.webclient.model.leafs.AutoValue_MdeConfig;
import o.C8118deO;

/* loaded from: classes.dex */
public abstract class MdeConfig {
    @SerializedName("isDisabled")
    public abstract boolean isDisabled();

    public static MdeConfig getDefault() {
        return (MdeConfig) C8118deO.a().fromJson((JsonElement) new JsonObject(), (Class<Object>) MdeConfig.class);
    }

    public static TypeAdapter<MdeConfig> typeAdapter(Gson gson) {
        return new AutoValue_MdeConfig.GsonTypeAdapter(gson).setDefaultDisabled(false);
    }
}
