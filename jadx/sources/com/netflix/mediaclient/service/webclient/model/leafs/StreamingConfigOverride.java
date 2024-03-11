package com.netflix.mediaclient.service.webclient.model.leafs;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.netflix.mediaclient.service.player.StreamProfileType;
import com.netflix.mediaclient.service.webclient.model.leafs.AutoValue_StreamingConfigOverride;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class StreamingConfigOverride {
    /* JADX INFO: Access modifiers changed from: protected */
    @SerializedName("exo")
    public abstract ExoConfigOverride exo();

    public static TypeAdapter<StreamingConfigOverride> typeAdapter(Gson gson) {
        return new AutoValue_StreamingConfigOverride.GsonTypeAdapter(gson);
    }

    public static StreamingConfigOverride empty() {
        return new AutoValue_StreamingConfigOverride(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static JsonObject merge(JsonObject jsonObject, JsonObject jsonObject2) {
        if (jsonObject == null && jsonObject2 == null) {
            return null;
        }
        if (jsonObject2 == null) {
            return jsonObject;
        }
        if (jsonObject == null) {
            return jsonObject2;
        }
        JsonObject jsonObject3 = new JsonObject();
        for (Map.Entry<String, JsonElement> entry : jsonObject.entrySet()) {
            jsonObject3.add(entry.getKey(), entry.getValue());
        }
        for (Map.Entry<String, JsonElement> entry2 : jsonObject2.entrySet()) {
            jsonObject3.add(entry2.getKey(), entry2.getValue());
        }
        return jsonObject3;
    }

    public JsonObject getOverride(JsonObject jsonObject, JsonObject jsonObject2, String str, StreamProfileType streamProfileType) {
        JsonObject merge;
        if (exo() != null) {
            merge = exo().getOverride(jsonObject, jsonObject2, str, streamProfileType);
        } else {
            merge = merge(jsonObject2, jsonObject);
        }
        return merge == null ? new JsonObject() : merge;
    }
}
