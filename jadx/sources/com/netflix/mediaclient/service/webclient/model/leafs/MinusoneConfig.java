package com.netflix.mediaclient.service.webclient.model.leafs;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.netflix.mediaclient.service.webclient.model.leafs.AutoValue_MinusoneConfig;
import o.C8118deO;

/* loaded from: classes.dex */
public abstract class MinusoneConfig {
    @SerializedName("disableExtras")
    public abstract boolean disableExtras();

    @SerializedName("forceDisable")
    public abstract boolean forceDisable();

    @SerializedName("forceEnable")
    public abstract boolean forceEnable();

    public static MinusoneConfig getDefault() {
        return (MinusoneConfig) C8118deO.a().fromJson((JsonElement) new JsonObject(), (Class<Object>) MinusoneConfig.class);
    }

    public static TypeAdapter<MinusoneConfig> typeAdapter(Gson gson) {
        return new AutoValue_MinusoneConfig.GsonTypeAdapter(gson).setDefaultForceEnable(false).setDefaultForceDisable(false).setDefaultDisableExtras(false);
    }

    public static boolean isMinusoneEnabled(MinusoneConfig minusoneConfig) {
        return minusoneConfig.forceEnable() || !minusoneConfig.forceDisable();
    }

    public static boolean areExtrasDisabled(MinusoneConfig minusoneConfig) {
        if (minusoneConfig != null) {
            return minusoneConfig.disableExtras();
        }
        return false;
    }
}
