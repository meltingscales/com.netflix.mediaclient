package com.netflix.model.leafs;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.netflix.model.leafs.VideoInfo;
import java.util.Map;
import o.AbstractC0941Im;
import o.C8123deT;
import o.InterfaceC0952Ix;

/* loaded from: classes5.dex */
public class TopTenBoxartImpl extends AbstractC0941Im implements InterfaceC0952Ix, VideoInfo.TopTenBoxart {
    private final String TAG = "TopTenBoxart";
    private String topTenBoxartId;
    private String topTenBoxartUrl;

    @Override // com.netflix.model.leafs.VideoInfo.TopTenBoxart
    public String getBoxartId() {
        return this.topTenBoxartId;
    }

    @Override // com.netflix.model.leafs.VideoInfo.TopTenBoxart
    public String getUrl() {
        return this.topTenBoxartUrl;
    }

    @Override // o.InterfaceC0952Ix
    public void populate(JsonElement jsonElement) {
        if (jsonElement instanceof JsonObject) {
            for (Map.Entry<String, JsonElement> entry : jsonElement.getAsJsonObject().entrySet()) {
                JsonElement value = entry.getValue();
                String key = entry.getKey();
                key.hashCode();
                if (key.equals("topTenBoxartId")) {
                    this.topTenBoxartId = C8123deT.b(value);
                } else if (key.equals("topTenBoxartUrl")) {
                    this.topTenBoxartUrl = C8123deT.b(value);
                }
            }
        }
    }
}
