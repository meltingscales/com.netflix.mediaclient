package com.netflix.model.leafs.originals.interactive;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import o.C1332Xp;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class TrackingInfoAdapter extends TypeAdapter<TrackingInfo> {
    @Override // com.google.gson.TypeAdapter
    public void write(JsonWriter jsonWriter, TrackingInfo trackingInfo) {
        jsonWriter.jsonValue(trackingInfo.trackingInfo.toString());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.gson.TypeAdapter
    public TrackingInfo read(JsonReader jsonReader) {
        JsonElement parse = new JsonParser().parse(jsonReader);
        if (parse.isJsonObject()) {
            try {
                return new TrackingInfo(new JSONObject(((Gson) C1332Xp.b(Gson.class)).toJson((JsonElement) parse.getAsJsonObject())));
            } catch (JSONException e) {
                e.printStackTrace();
                return null;
            }
        }
        return null;
    }
}
