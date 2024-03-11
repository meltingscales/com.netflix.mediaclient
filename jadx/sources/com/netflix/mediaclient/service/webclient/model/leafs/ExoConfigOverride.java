package com.netflix.mediaclient.service.webclient.model.leafs;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.netflix.mediaclient.service.player.StreamProfileType;
import com.netflix.mediaclient.service.webclient.model.leafs.AutoValue_ExoConfigOverride;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class ExoConfigOverride {
    /* JADX INFO: Access modifiers changed from: protected */
    @SerializedName("core")
    public abstract Map<String, JsonObject> core();

    /* JADX INFO: Access modifiers changed from: protected */
    @SerializedName("UiLabel")
    public abstract Map<String, Map<String, JsonObject>> uilabel();

    public static TypeAdapter<ExoConfigOverride> typeAdapter(Gson gson) {
        return new AutoValue_ExoConfigOverride.GsonTypeAdapter(gson);
    }

    public JsonObject getOverride(JsonObject jsonObject, JsonObject jsonObject2, String str, StreamProfileType streamProfileType) {
        JsonObject videoFlavorOverride = getVideoFlavorOverride(core(), jsonObject2, streamProfileType.e());
        if (uilabel() != null) {
            jsonObject = StreamingConfigOverride.merge(jsonObject, getVideoFlavorOverride(uilabel().get(str), null, streamProfileType.e()));
        }
        return StreamingConfigOverride.merge(videoFlavorOverride, jsonObject);
    }

    private static JsonObject getVideoFlavorOverride(Map<String, JsonObject> map, JsonObject jsonObject, String str) {
        return map == null ? jsonObject : StreamingConfigOverride.merge(StreamingConfigOverride.merge(map.get("common"), jsonObject), map.get(str));
    }
}
