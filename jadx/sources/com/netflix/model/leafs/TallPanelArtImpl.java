package com.netflix.model.leafs;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.model.leafs.VideoInfo;
import java.util.Map;
import o.AbstractC0941Im;
import o.C8123deT;
import o.InterfaceC0952Ix;

/* loaded from: classes5.dex */
public class TallPanelArtImpl extends AbstractC0941Im implements InterfaceC0952Ix, VideoInfo.TallPanelArt {
    private final String TAG = "TallPanelArt";
    private String imageTypeIdentifier;
    private String url;

    @Override // com.netflix.model.leafs.VideoInfo.TallPanelArt
    public String getImageTypeIdentifier() {
        return this.imageTypeIdentifier;
    }

    @Override // com.netflix.model.leafs.VideoInfo.TallPanelArt
    public String getUrl() {
        return this.url;
    }

    @Override // o.InterfaceC0952Ix
    public void populate(JsonElement jsonElement) {
        if (jsonElement instanceof JsonObject) {
            for (Map.Entry<String, JsonElement> entry : jsonElement.getAsJsonObject().entrySet()) {
                JsonElement value = entry.getValue();
                String key = entry.getKey();
                key.hashCode();
                if (key.equals("imageTypeIdentifier")) {
                    this.imageTypeIdentifier = C8123deT.b(value);
                } else if (key.equals(SignupConstants.Field.URL)) {
                    this.url = C8123deT.b(value);
                }
            }
        }
    }
}
