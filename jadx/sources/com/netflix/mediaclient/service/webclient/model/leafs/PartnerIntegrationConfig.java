package com.netflix.mediaclient.service.webclient.model.leafs;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.netflix.mediaclient.service.webclient.model.leafs.AutoValue_PartnerIntegrationConfig;
import o.C8118deO;

/* loaded from: classes.dex */
public abstract class PartnerIntegrationConfig {
    @SerializedName("mdeConfig")
    public abstract MdeConfig mdeConfig();

    @SerializedName("minusoneConfig")
    public abstract MinusoneConfig minusoneConfig();

    @SerializedName("sfinderConfig")
    public abstract SfinderConfig sfinderConfig();

    public static PartnerIntegrationConfig getDefault() {
        return (PartnerIntegrationConfig) C8118deO.a().fromJson((JsonElement) new JsonObject(), (Class<Object>) PartnerIntegrationConfig.class);
    }

    public static TypeAdapter<PartnerIntegrationConfig> typeAdapter(Gson gson) {
        return new AutoValue_PartnerIntegrationConfig.GsonTypeAdapter(gson).setDefaultSfinderConfig(SfinderConfig.getDefault()).setDefaultMinusoneConfig(MinusoneConfig.getDefault()).setDefaultMdeConfig(MdeConfig.getDefault());
    }
}
