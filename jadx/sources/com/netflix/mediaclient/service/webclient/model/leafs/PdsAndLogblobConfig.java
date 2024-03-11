package com.netflix.mediaclient.service.webclient.model.leafs;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.netflix.mediaclient.service.webclient.model.leafs.AutoValue_PdsAndLogblobConfig;
import o.C8118deO;

/* loaded from: classes.dex */
public abstract class PdsAndLogblobConfig {
    @SerializedName("disableOfflineLogblobs")
    public abstract boolean getDisableOfflineLogblobs();

    @SerializedName("disableOfflinePdsEvents")
    public abstract boolean getDisableOfflinePdsEvents();

    @SerializedName("disableStreamingLogblobs")
    public abstract boolean getDisableStreamingLogblobs();

    @SerializedName("disableStreamingPdsEvents")
    public abstract boolean getDisableStreamingPdsEvents();

    public static PdsAndLogblobConfig getDefault() {
        return (PdsAndLogblobConfig) C8118deO.a().fromJson((JsonElement) new JsonObject(), (Class<Object>) PdsAndLogblobConfig.class);
    }

    public static TypeAdapter<PdsAndLogblobConfig> typeAdapter(Gson gson) {
        return new AutoValue_PdsAndLogblobConfig.GsonTypeAdapter(gson).setDefaultDisableOfflineLogblobs(false).setDefaultDisableOfflinePdsEvents(false).setDefaultDisableStreamingLogblobs(false).setDefaultDisableStreamingPdsEvents(false);
    }
}
